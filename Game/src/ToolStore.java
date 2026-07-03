import java.util.Scanner;

public class ToolStore extends NormalLocation{
    Scanner input=new Scanner(System.in);

public ToolStore (Player player,String locationName){
    super(player,locationName);
}


@Override
    public boolean onLocaiton(){
    System.out.println("----------------Mağazaya Hoşgeldin------------------------- ");
    System.out.println("1silahlar ");
    System.out.println("2-Zırhlar");
    System.out.println("3-Çıkış yap");
    int selectCase=Location.input.nextInt();
    while (selectCase>1 || selectCase<3 ){
        System.out.println("Geçersiz değer giridniz .");
        selectCase=input.nextInt();

    }


    switch(selectCase){
        case 1 :
            printWeapon();
            break;
        case 2:
            printArmor();
            break;
        default:
            System.out.println("Çıkış yapıldı");
            return  true;

    }




    return true;
}
    public void printWeapon(){
            System.out.println("-----Silahlar ---------");

            System.out.println();

            for(Weapon w : Weapon.weapons()){
                System.out.println(w.getName());
            }
    }
    public void printArmor(){
        System.out.println("---------Zırhlar-----------");
    }



}



