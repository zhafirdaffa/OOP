package Praktikum.sesi4;
import java.util.Scanner;
public class HurufDigit {
    /** 
     * @param args
     */
    public static void main(String[] args) {
        //membuat variabel dan scanner
        char karakter;
        Scanner scan = new Scanner(System.in);

        //mengambil input
        System.out.print("Masukan sebuah Karakter : ");
        karakter = scan.nextLine().charAt(0);

        if ( (karakter >='A')&& (karakter <='Z') || (karakter >='a') && (karakter <='z')){
            System.out.println(karakter + " adalah huruf");
        }else if ((karakter>='0')&& (karakter<='9')){
            System.out.println(karakter + " adalah digital");
        }else {
            System.out.println(karakter + " bukan huruf atau digital");
        }

    }
}
