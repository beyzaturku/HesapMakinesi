package switchcaseilehesapmakinesi;
import java.util.*;
public class SwitchCaseileHesapMakinesi {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("1.sayıyı giriniz:");
       int sayı1 = input.nextInt();
       System.out.print("2.sayıyı giriniz:");
       int sayı2 = input.nextInt();
       
      
       System.out.println("1-Toplama");
       System.out.println("2-Çıkarma");
       System.out.println("3-Çarpma");
       System.out.println("4-Bölme");
       
       System.out.print("Yapmak istediğiniz işlemi seçiniz:");
       int secim = input.nextInt();
       
       switch(secim)
       {
           case 1:
               System.out.print("Toplama işlemi:" + (sayı1+sayı2));
               break;
           case 2:
               System.out.print("Çıkarma işlemi:" + (sayı1-sayı2));
               break;
           case 3:
               System.out.print("Çarpma işlemi:" + (sayı1*sayı2));
               break;
           case 4:
               System.out.print("Bölme işlemi:" + (sayı1/sayı2));
               break;
             default:
                 System.out.print("Hatalı tercih yaptınız. Tekrar deneyin.");
                 break;
       }
       
      
       
    }
    
}
