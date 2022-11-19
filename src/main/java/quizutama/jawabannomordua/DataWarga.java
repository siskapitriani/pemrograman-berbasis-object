package quizutama.jawabannomordua;

import java.util.Scanner;

public class DataWarga {
    String nik;
    String nama;
    String alamat;
    String noTelp;
    String pekerjaan;
    String alamatKantor;
    String status;
    String namaSuamiAtauIstri;
    Integer jumlahAnak;

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getAlamatKantor() {
        return alamatKantor;
    }

    public void setAlamatKantor(String alamatKantor) {
        this.alamatKantor = alamatKantor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNamaSuamiAtauIstri() {
        return namaSuamiAtauIstri;
    }

    public void setNamaSuamiAtauIstri(String namaSuamiAtauIstri) {
        this.namaSuamiAtauIstri = namaSuamiAtauIstri;
    }

    public Integer getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(Integer jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public void inputData(){
        final String borderRecord = "-----------------o0o-----------------------";
        final Scanner scanner = new Scanner(System.in);
        System.out.println("* * * Data Warga * * *");
        System.out.println("Masukan Nama");
        nama = scanner.next();
        System.out.println("Masukan NIK");
        nik = scanner.next();
        System.out.println("Masukan Alamat");
        alamat = scanner.next();
        System.out.println("Masukan No. Tlp");
        noTelp = scanner.next();
        this.inputData(nama, nik, alamat, noTelp);

        System.out.println(borderRecord);
        System.out.println("* * * Data Pekerjaan * * *");
        System.out.println("Masukan Pekerjaan");
        pekerjaan = scanner.next();
        System.out.println("Masukan Alamat Kantor");
        alamatKantor = scanner.next();
        this.inputData(pekerjaan, alamatKantor);

        System.out.println(borderRecord);
        System.out.println("* * * Data Status * * *");
        System.out.println("Masukan Status");
        status = scanner.next();
        System.out.println("Masukan nama Suami/Istri");
        namaSuamiAtauIstri = scanner.next();
        System.out.println("Masukan Jumlah Anak");
        jumlahAnak = scanner.nextInt();
        this.inputData(status, namaSuamiAtauIstri, jumlahAnak);
    }

    public void inputData(final String nama, final String nik, final String alamat, final String noTelp) {
        this.nama = nama;
        this.nik = nik;
        this.alamat = alamat;
        this.noTelp = noTelp;
    }

    public void inputData(final String pekerjaan, final String alamatKantor){
        this.pekerjaan = pekerjaan;
        this.alamatKantor = alamatKantor;
    }

    public void inputData(final String status, final String namaSuamiAtauIstri, final Integer jumlahAnak){
        this.status = status;
        this.namaSuamiAtauIstri = namaSuamiAtauIstri;
        this.jumlahAnak = jumlahAnak;
    }
}
