public class Droid {
    private String name;
    private Item item1;
    private Item item2;
    private int HP;
    private int attackPower;
    private int defensePower;
    private int slots;
    private boolean hasHealed;
    int MAX_HP = 100;

    public void createDroid(String droidName, String droidItem1, String droidItem2){
        this.name = droidName;
        if (droidItem1.isEmpty()){
            System.out.println("Choose valid item next time!");
        } else {
            item1 = Item.getItem(droidItem1);
        }
        this.HP = 100;
        this.hasHealed = false;
    }

    public void attack(Droid attacker, Droid defender){
        int totalDamage = attacker.attackPower - defender.defensePower;
        if (totalDamage < 0){
            totalDamage = 1;
        }
        defender.HP -= totalDamage;
    }

    public void heal(Droid droid){
        if (!this.hasHealed){
            droid.HP +=20;
            this.hasHealed = true;
            if (droid.HP > MAX_HP) droid.HP = MAX_HP;
        } else {
            System.out.println("Heal was already used.");
        }
    }

}
