package quizutama.soalnomordua;

import java.util.Scanner;

public class IuranWarga extends DataWarga{
    Integer iuranSampah;
    Integer iuranKeamanan;
    Integer sumbangan;

    public Integer menghitungTotalIuranWarga(){
        return iuranSampah + iuranKeamanan + sumbangan;
    }

    public void inputDataIuran(){
        String borderRecord = "-----------------o0o-----------------------";
        Scanner scanner = new Scanner(System.in);
        System.out.println(borderRecord);
        System.out.println("* * * Data Iuran Pokok * * *");
        System.out.println("NIK => " + nik);
        System.out.println("Masukan Iuran Sampah");
        iuranSampah = scanner.nextInt();
        System.out.println("Masukan Iuran Keamanan");
        iuranKeamanan = scanner.nextInt();
        System.out.println();
        System.out.println("* * * Data Sekunder * * *");
        System.out.println("Masukan sumbangan");
        sumbangan = scanner.nextInt();
    }
}
