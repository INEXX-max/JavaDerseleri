public class SafeHouse extends  NormalLocation{
    public SafeHouse(Player player,String locationName){
        super(player,locationName);
    }


    @Override
   public  boolean onLocaiton(){
        System.out.println("Güvenli evdesiniz..");
        System.out.println("Canınızın yenilenmesi için 8 saniye bekleyin..");

        try{
            for (int i=8;i>0;i--){
                System.out.println(i+"...");
                Thread.sleep(1000);
            }
            System.out.println();
        }catch (InterruptedException e){
            System.out.println ("Bekleme sırasında hata oluştu evden uzaklaşmayın ");      }

        int currentHelath=this.getPlayer().getHealth();
        int maxHealth=100;


        if (currentHelath<maxHealth){
            int healAmount=maxHealth-currentHelath;
            this.getPlayer().setHealth(maxHealth);

            System.out.println("Süre doldu canınız yenilelidi canınız "+currentHelath);
            System.out.println("Eklenen can miktarı : "+healAmount);

        }else {
            System.out.println("Canınız full yenilemek için daha çok savaş.");
        }

        return true;






    }







}
