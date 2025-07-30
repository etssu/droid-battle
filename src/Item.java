public enum Item {
    // items which take 1 slot
    LASER_GUN("laser gun", 10, 0, 1),
    HARPOON("harpoon", 8, 0, 1),
    DISRUPTOR_PISTOL("disruptor pistol", 6, 0, 1),
    MACE("mace", 6, 5, 1),
    DAZZLER("dazzler", 5, 0, 1),
    TASER("taser", 3, 0, 1),
    SHIELD("shield", 1, 8, 1),
    ARMOR("armor", 0, 7, 1),
    // items which take 2 slots
    CHAINSAW("chainsaw", 11, 3, 2),
    PLASMA_GUN("plasma gun", 11, 1, 2),
    CROSSBOW("crossbow", 10, 1, 2),
    KATANA("katana", 7, 4, 2),
    HAMMER("hammer", 6, 3, 2),
    THERMAL_CLAWS("thermal claws", 5, 2, 2),
    AXE("axe", 5, 6, 2);


    public final String itemName;
    public final int attackPower;
    public final int defensePower;
    public final int slots;

    Item(String name, int attPow, int defPow, int slot){
        this.itemName = name;
        this.attackPower =  attPow;
        this.defensePower =  defPow;
        this.slots = slot;
    }

    public static Item getItem(String itemName){
        for (int i = 0; i < Item.values().length; i++){
            if (Item.values()[i].itemName.equals(itemName.toLowerCase())){
                return Item.values()[i];
            }
        }
        return null;
    }

    public static void printItems(){
        for (Item item : Item.values()){
            System.out.printf("%s: %d, %d, %d;\n", item.itemName, item.attackPower,  item.defensePower,  item.slots);
        }
    }
}
