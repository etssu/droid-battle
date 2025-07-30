public class AIDroid extends Droid {
    private static final Item[] items = Item.values();
    public AIDroid() {
        super();
    }

    public static AIDroid createAIDroid(Droid playerDroid){
        AIDroid ai = new AIDroid();

        ai.name = "AI Droid";
        ai.HP = 100;
        ai.hasHealed = false;

        if (playerDroid.itemCount >= 1){
            ai.item1 = getRandomItem();
            ai.slots = ai.item1.slots;
            ai.attackPower += ai.item1.attackPower;
            ai.defensePower += ai.item1.defensePower;
        }

        if (playerDroid.itemCount == 2 && ai.item1.slots == 1){
            do {
                ai.item2 = getRandomItem();
            } while (ai.item1 == ai.item2 || ai.slots > 2);
            ai.attackPower += ai.item2.attackPower;
            ai.defensePower += ai.item2.defensePower;
        }
        return ai;
    }

    public static Item getRandomItem(){
        int index = (int) (Math.random() * items.length);
        return items[index];
    }
}
