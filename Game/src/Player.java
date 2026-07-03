import java.util.Scanner;
public class Player {
    private int health;
    private int damage;
    private int money;
    private String charName;
    private String playerName;
    Scanner input = new Scanner(System.in);

    public Player(String playerName) {

        this.playerName = playerName;
    }

    public void selectChar() {
        Scanner input = new Scanner(System.in);
        GameCharacter[] charList = {new Samurai(), new Knight(), new Archer(),new Test()};


        for (GameCharacter gameCharacter : charList) {

            System.out.println("-------------------------------------------------------------m -------------------");


            System.out.println("ID "+ gameCharacter.getID()+
                    "\t Karakter: " + gameCharacter.getName() +
                    "\tHasar: " + gameCharacter.getDamage() +
                    "\tSağlık: " + gameCharacter.getHealth() +
                    "\tPara: " + gameCharacter.getMoney());
        }

        System.out.println("------------------------------");
        System.out.println("Lütfen Bir Karakter girniz..");
        System.out.println("Lütfeen Karakterini Seç : ");



        int selectChar = input.nextInt(); // 'selecet' kelimesi 'select' olarak düzeltildi
        switch(selectChar) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            case  4:
                initPlayer(new Test());
                break;
            default:
                initPlayer(new Samurai());

        }
        System.out.println("Karakter : "+this.getCharName()+"Hasar  :"+this.getDamage()+" Sağlık : "+this.getHealth()+"Parası :"+this.getMoney());
    }






    public void initPlayer(GameCharacter gameChar){
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());


    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
      this.health = health;
    }

    // getDamage metodundaki 'return health' hatası düzeltildi
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return playerName;
    }

    public void setName(String name) {
        this.playerName = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }
}