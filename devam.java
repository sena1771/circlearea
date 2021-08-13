import java.util.Scanner;
public class devam {
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
        double pi=3.14;
        double alan;

       System.out.println("Daire yarıçapını giriniz: ");
        double a = input.nextDouble();
       System.out.println(a);


       System.out.println("Dairenin merkez açısı: ");
        double aci= input.nextDouble();
       System.out.println(aci);
        alan=(pi*a*a*aci)/360;
        System.out.println("Dairenin alani:");
        System.out.println(alan);
    }
}
