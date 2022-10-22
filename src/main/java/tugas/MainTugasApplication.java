package tugas;

import java.util.Scanner;

public class MainTugasApplication {
    public static void main(String[] args){
        Integer pilih;
        String nik, noHp, nama;
        double jumlahUang;
        Anggota anggota;
        Scanner input = new Scanner(System.in);

        System.out.println("SELAMAT DATANG DI KOPERASI JAYA WIJAYA");
        System.out.println("Silahkan pilih menu : ");
        System.out.println("1. Simpan");
        System.out.println("2. Pinjam");
        System.out.println("Pilihan anda : ");
        pilih = input.nextInt();

        if (pilih == 1){
            System.out.println("Masukan nik : ");
            nik = input.next();
            System.out.println("Masukan jumlah uang yang akan disimpan : ");
            jumlahUang = input.nextDouble();
            anggota = new Anggota(nik, jumlahUang);
            anggota.saving(anggota);
        }else if(pilih == 2){
            System.out.println("Masukan nik :");
            nik = input.next();
            System.out.println("Masukan nama: ");
            nama = input.next();
            System.out.println("Masukan noHp: ");
            noHp = input.next();
            System.out.println("Masukan jumlah uang yang akan dipinjam : ");
            jumlahUang = input.nextDouble();
            anggota = new Anggota(nama, nik, noHp, jumlahUang);
            anggota.pinjaman(anggota);
        }
    }
}
