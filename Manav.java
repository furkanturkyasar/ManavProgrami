import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ArmutKilo, ElmaKilo, DomatesKilo, MuzKilo, PatlicanKilo;
        double ArmutPrice=2.14,ElmaPrice=3.67,DomatesPrice=1.11,MuzPrice=0.95,PatlicanPrice=5.00,total;
        System.out.print("Armut kac kilo? : ");
        ArmutKilo = input.nextInt();
        System.out.print("Elma kac kilo? : ");
        ElmaKilo = input.nextInt();
        System.out.print("Domates kac kilo? : ");
        DomatesKilo = input.nextInt();
        System.out.print("Muz kac kilo? : ");
        MuzKilo = input.nextInt();
        System.out.print("Patlican kac kilo? : ");
        PatlicanKilo = input.nextInt();
        total =(ArmutKilo*ArmutPrice)+(ElmaKilo*ElmaPrice)+(DomatesKilo*DomatesPrice)+(MuzKilo*MuzPrice)+(PatlicanKilo*PatlicanPrice);
        System.out.print("Toplam tutar: "+total);



    }
}
