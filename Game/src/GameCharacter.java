public class GameCharacter {
    private int damage;
    private int health;
    private int money;
    private int ID;
    private String name;


    public GameCharacter (int damage ,int money,int health ,String name,int ID){
        this.money=money;
        this.health=health;
        this.damage=damage;
        this.name=name;
        this.ID=ID;
    }

    public  String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getID(){
        return ID ;
    }

    public void setID(int ID){
        this.ID=ID;
    }

    public int getDamage(){
        return damage;
    }

    public void setDamage(int damage ){
        this.damage=damage;
    }

    public int getMoney(){
        return money;
    }
    public void setMoney(int money){
        this.money=money;
    }

    public int getHealth (){
        return health;
    }

    public void setHealth (int health){
        this.health=health;
    }



















}
