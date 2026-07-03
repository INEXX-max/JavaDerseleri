public class Weapon {
    private int ID;
    private int damage;
    private int  price;
    private String name;


    public Weapon(int ID,int damage,int price,String name){
        this.ID=ID;
        this.damage=damage;
        this.price=price;
        this.name=name;

    }

    public Weapon[]weapons(){
        Weapon[] weaponList=new Weapon[3];
        weaponList[0]=new Weapon(1,29,21,"Glock-18");
        weaponList[1]=new Weapon(2,98,68,"AK-48");
        weaponList[2]=new Weapon(3,100,100,"AWP");
        return weaponList;



    }













    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID=ID;
    }
    public int getDamage(){
        return damage;
    }
    public void setDamage(int damage){
        this.damage=damage;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }







}
