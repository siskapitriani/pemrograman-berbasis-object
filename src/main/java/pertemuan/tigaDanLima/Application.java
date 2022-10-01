package pertemuan.tigaDanLima;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Application {
    public static void main(String[] args){
        Integer pilih = 0;
        ArrayList<Pesan> orderList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("================================================");
            System.out.println("            Bintang Bucks Coffee");
            System.out.println("================================================");
            System.out.println("1. Pemesanan");
            System.out.println("2. Pembayaran");
            System.out.println("3. Keluar");
            System.out.println("------------------------------------------------");
            System.out.print("Pilihanmu : ");
            pilih = scanner.nextInt();
            if(pilih == 1){
                beli(orderList);
            } else if (pilih == 2) {
                bayar(orderList);
            }
        }while (pilih != 3);
    }

    private static void bayar(ArrayList<Pesan> orderList) {
        int bayar, jumlah, total = 0;
        Scanner scanner = new Scanner(System.in);
        for (Pesan pesan : orderList) {
            Integer harga = pesan.getHarga();
            Integer quantity = pesan.getQuantity();
            jumlah = harga * quantity;
            System.out.printf("| %-7s | %-5s | %-7s | %-7s | %-7s |",
                    pesan.getNama(),
                    pesan.getGula(),
                    harga,
                    quantity, jumlah);
            System.out.println();
            System.out.println("------------------------------------------------");
            total += jumlah;
        }

        System.out.println("Total    : " + total );

        boolean correct;
        do{
            System.out.println("Bayar  : ");
            bayar = scanner.nextInt();

            if ( bayar < total ){
                System.out.println( "[ kurang dari Total ]");
                correct = false;
            }else{
                correct = true;
            }
        } while (!correct);

        System.out.println( "Kembalian : "+ abs( bayar - total ));
        orderList.clear();
        System.out.println("Tekan Enter....");
        scanner.nextLine();
    }

    private static void beli(ArrayList<Pesan> orderList) {
        String nama, gula;
        int harga, quantity;
        Scanner input = new Scanner(System.in);

        System.out.print("Nama      : ");
        nama = input.nextLine();
        boolean isAmericano = nama.equalsIgnoreCase("Americano");
        boolean isLatte = nama.equalsIgnoreCase("Latte");
        boolean isArabika = nama.equalsIgnoreCase("Arabika") || nama.equalsIgnoreCase("Arabica");
        boolean isNamaInMenu = isAmericano || isLatte || isArabika;
        if (!isNamaInMenu){
            System.out.print("["+nama + " tidak tersedia di menu]");
        }
        System.out.print("Gula      : ");
        gula = input.nextLine();
        System.out.print("Harga     : ");
        harga = input.nextInt();
        System.out.print("Quantity  : ");
        quantity = input.nextInt();
        if (quantity < 1){
            System.out.println("[Minimum order 1]");
        }
        orderList.add(new Pesan(nama, gula, harga, quantity));
        System.out.println();
    }
}
