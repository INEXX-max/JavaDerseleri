import java.util.Scanner;


public class Game {
        private Scanner input =new Scanner(System.in);
    public void start(){
        System.out.println("Oyuna Hoş Geldin....");
        System.out.println("Lütfen Karakter'nin adını seç :");
        String playerName=input.nextLine();
        Player player =new Player(playerName);
        System.out.println(player.getName()+" Adlı oyuncu Hoş gelidin Oyun Başlıyor...?");
        System.out.println("Burada yaşanan kaos hepsi bir kurgudur.");
        System.out.println("Sayın "+ player.getName() +" bu karanlık macera seni çok yorabilir arada dinlenmeyi ve mas mavi buz mavisi gölde lıkır lıkır su içmeyide unutma");
        System.out.println("Lütfen Bir klarakter seçin ");
        player.selectChar();




    }



















}
