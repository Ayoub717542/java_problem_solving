import java.util.Scanner;

public class Systeme_de_facturation_electrique{
    public static void main(String[] args) {
        float  Facture_avant_tax=0,unit_one=0,unit_two=0,unit_three=0,tax=0,total=0;
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter units KWH: ");
        int unit = input.nextInt();
        if(unit>=1 && unit<=100){
            unit_one  = (float) (unit*0.8);
        } else if (unit > 100 && unit<300) {
            unit_two= (float) (unit*1.2);
        }else if (unit > 300) {
            unit_one = (float) (unit * 0.8);
            unit_two = (float) (unit * 1.2);
            unit_three = (float) ((unit - 300) * 1.5);
        }
        Facture_avant_tax = unit_one + unit_two + unit_three;
        System.out.println(Facture_avant_tax);
        tax= (float) (Facture_avant_tax*0.10);
        System.out.println(tax);
        total=Facture_avant_tax+tax;
        System.out.println(total);
        input.close();
    }
}
