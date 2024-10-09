package Praktikum.sesi4;
import java.util.Scanner;
//Program SWITCH
public class LampuLaluLintas {
    public static void main(String[] args) {
                //Membuat Variabel dan Scanner
                String lampu;
                Scanner scan = new Scanner(System.in);
                //Mengambil Input
                System.out.print(" Input Nama Warna: ");
                lampu = scan.nextLine();
        
                switch (lampu) {
                    case  "merah":
                        System.out.println("Lampu merah, berhenti!");
                       break;
                    case  "kuning":
                        System.out.println("Lampu kuning, harap hati-hati!");
                       break;
                    case  "hijau":
                        System.out.println("Lampu hijau, silahkan jalan!");
                       break;
                    default:
                        System.out.println("Warna Lampu Salah");
                    
                }
            }
        }
        


    

