import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("Oyuna Hoş Geldin....");
        System.out.println("Lütfen Karakter'nin adını seç :");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println(player.getName() + " Adlı oyuncu Hoş gelidin Oyun Başlıyor...?");
        System.out.println("Burada yaşanan kaos hepsi bir kurgudur.");
        System.out.println("Sayın " + player.getName() + " bu karanlık macera seni çok yorabilir arada dinlenmeyi ve mas mavi buz mavisi gölde lıkır lıkır su içmeyide unutma");
        System.out.println("Lütfen Bir klarakter seçin ");
        player.selectChar();

        while (true) {
            System.out.println();
            System.out.println("########## Bölgeler ##########");
            System.out.println("1 - Güvenli Ev --> Burası sizin için güvenli, düşman yok!");
            System.out.println("2 - Mağaza --> Silah veya Zırh satın alabilirsiniz.");
            System.out.println("Lütfen gitmek istediğiniz yeri seçiniz: ");

            int selectLoc = input.nextInt();
            Location location = null;
            switch (selectLoc) {
                case 1:
                    location = new SafeHouse(player, "Güvenli Ev");
                    break;
                case 2:
                    location = new ToolStore(player, "Mağaza");
                    break;
                default:
                    location = new SafeHouse(player, "Güvenli Ev");
                    break;
            }

            if (!location.onLocaiton()) {
                System.out.println("ÖLDÜNÜZ! OYUN BİTTİ.");
                break;

            }
        }
    }
}
