public class Droid {
    public int HP;
    public int slots;
    public String name;
    public Item item1;
    public Item item2;
    int itemCount;
    protected int attackPower;
    protected int defensePower;
    protected boolean hasHealed;

    public Droid(String droidName, Item item1, Item item2){ // for player droids
        this.name = droidName;
        this.HP = 100;
        this.hasHealed = false;
        this.item1 = item1;
        this.item2 = item2;
        this.slots = item1.slots + (item2 != null ? item2.slots : 0);
        this.itemCount = (item2 != null) ? 2 : 1;
        this.attackPower = item1.attackPower + (item2 != null ? item2.attackPower : 0);
        this.defensePower =  item1.defensePower + (item2 != null ? item2.defensePower : 0);
    }
    public Droid() {            // for AI droid
        this.name = "Unnamed";
        this.item1 = null;
        this.item2 = null;
        this.HP = 100;
        this.attackPower = 0;
        this.defensePower = 0;
        this.hasHealed = false;
        this.itemCount = 0;
        this.slots = 0;
    }

    public void attack(Droid defender){
        int totalDamage = this.attackPower - defender.defensePower;
        if (totalDamage < 1){
            totalDamage = 1;
        }
        defender.HP -= totalDamage;
        System.out.printf("%s deals %d damage to %s\n",  this.name, totalDamage, defender.name);
    }

    public void heal(){
        int maxHP = 100;
        if (!this.hasHealed){
            this.HP += 20;
            this.hasHealed = true;
            if (this.HP > maxHP) this.HP = maxHP;
            System.out.println(this.name + " uses heal.");
        } else {
            System.out.println("Heal was already used.");
        }
    }

    public void surrender(){
        System.out.println("Player " + this.name + " surrendered.");
        this.HP = 0;
    }

}
