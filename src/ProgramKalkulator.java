/**
 * Created by copcopi on 11/01/2017.
 */
import java.util.Scanner;

public class ProgramKalkulator {
    static float total = 0, bil1 = 1, bil2 = 1;// global//RevisiByKel4//

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(bil2 != 0 & bil1 != 0){
            System.out.println("Latar Belakang : Menghitung seberapa cintaku ke kamu ");
            System.out.println("Cinta yang Sederhana");
            System.out.println("1.Penjumlahan");
            System.out.println("2.Pengurangan");
            System.out.println("3.Perkalian");
            System.out.println("4.Pembagian");
            System.out.print("Masukan Pilihan Kamu  = ");
            int pilihan = input.nextInt();

            System.out.print("Masukan sesuai kata hatimu = cintaku");
            bil1 = input.nextFloat();
            System.out.print("Masukan sesuai kata hatimu  = cintamu");
            bil2 = input.nextFloat();

            switch(pilihan){

                case 1:
                    System.out.println( + bil1 + " + " + bil2 );//Revisi//
                    System.out.print("Hasilnya = cinta kita ");
                    total = bil1 + bil2;
                    break;
                case 2:
                    System.out.println( + bil1 + " - " + bil2 );
                    System.out.print("Hasilnya = cinta yang kurang sempurna");//Revisi//
                    total = bil1 - bil2;
                    break;
                case 3:
                    System.out.println( + bil1 + " x " + bil2 );
                    System.out.print("Hasilnya = cinta sehidup semati ");
                    total = bil1 * bil2;
                    break;
                case 4:
                    System.out.println( + bil1 + " : " + bil2 );
                    System.out.print("Hasilnya = cinta orang lain ");
                    total = bil1 / bil2;
                    break;
                default:
                    System.out.println("Anda harus mengisi angka");//Revisi//

            }
            System.out.println(total);

        }
    }
}