
import java.util.Scanner;
public class HelloWorld {

    public static void main(String[] args) {
        Scanner Int_number = new Scanner(System.in);
        System.out.println("Enter your int number: ");
        String intnumber = Int_number.nextLine();

        Scanner Float_number = new Scanner(System.in);
        System.out.println("Enter your Float number: ");
        String floatnumber = Float_number.nextLine();

        Scanner Double_number = new Scanner(System.in);
        System.out.println("Enter you Double number: ");
        String doublenumber = Double_number.nextLine();

        Scanner Character = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String character = Character.nextLine();
        
        System.out.println("Int number is:" + intnumber);
        System.out.println(String.valueOf(intnumber));
        System.out.println("Float number is: " + floatnumber);
        System.out.println(String.valueOf(floatnumber));
        System.out.println("Double number is: " + doublenumber);
        System.out.println(String.valueOf(doublenumber));
        System.out.println("your string is: " + character);
        System.out.println(String.valueOf(character));
    }
}