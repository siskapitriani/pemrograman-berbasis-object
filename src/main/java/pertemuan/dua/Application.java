package pertemuan.dua;

public class Application {
    public static void main(String[] args){
        Hewan kelinci = new Hewan();
        kelinci.setMata("hitam");
        kelinci.setMulut("kecil");
        kelinci.setTelinga("panjang");
        kelinci.setKaki(4);
        kelinci.setEkor("pendek");
        String outBorder = "==========================================================";
        String innerBorder = "----------------------------------------------------------";
        System.out.println(outBorder);
        System.out.println("                      Kelinci");
        System.out.println(innerBorder);
        System.out.println("Warna mata     : " + kelinci.getMata());
        System.out.println("Bentuk mulut   : " + kelinci.getMulut());
        System.out.println("Bentuk telinga : " + kelinci.getTelinga());
        System.out.println("Jumlah kaki    : " + kelinci.getKaki());
        System.out.println("Bentuk ekor    : " + kelinci.getEkor());
        System.out.println();
        System.out.println("Bermain : " + kelinci.bermain("bola"));
        System.out.println("Makan   : " + kelinci.makan("wortel"));
        System.out.println("Tidur   : " + kelinci.tidur(false));
        System.out.println(outBorder);

        PesawatTelepon pesawatTelepon = new PesawatTelepon();
        pesawatTelepon.setBentuk("kotak");
        pesawatTelepon.setGagangTelepon("persegi panjang");
        pesawatTelepon.setKabel("panjang");

        System.out.println("                   Pesawat telepon");
        System.out.println(innerBorder);
        System.out.println("Bentuk                : " + pesawatTelepon.getBentuk());
        System.out.println("Bentuk gagang telepon : " + pesawatTelepon.getGagangTelepon());
        System.out.println("Kabel                 : " + pesawatTelepon.getKabel());
        System.out.println();
        System.out.println("Terima panggilan    : " + pesawatTelepon.terimaPanggilan(false));
        System.out.println("Melakukan panggilan : " +pesawatTelepon.melakukanPanggilan(true));
        System.out.println(outBorder);

        Manusia fatimah = new Manusia();
        fatimah.setMata("coklat tua");
        fatimah.setTelinga("lebar");
        fatimah.setMulut("kecil");
        fatimah.setRambut("hitam");
        fatimah.setTangan("lentik");
        fatimah.setKaki("jenjang");
        System.out.println("                        Fatimah");
        System.out.println(innerBorder);
        System.out.println("Warna mata     : " + fatimah.getMata());
        System.out.println("Bentuk mulut   : " + fatimah.getMulut());
        System.out.println("Bentuk telinga : " + fatimah.getTelinga());
        System.out.println("Warna rambut   : " + fatimah.getRambut());
        System.out.println("Bentuk tangan  : " + fatimah.getTangan());
        System.out.println("Bentuk kaki    : " + fatimah.getKaki());
        System.out.println();
        System.out.println("Fatimah suka bermain bola dengan " + fatimah.bermain("kelinci"));
        System.out.println("Makanan favorit fatimah yaitu " + fatimah.makan("lotek atah"));
        System.out.println("Pekerjaan fatimah adalah seorang " + fatimah.bekerja("programmer"));
        System.out.println("Fatimah bisa memasak " + fatimah.memasak("rendang"));
        System.out.println("Fatimah mencuci " + fatimah.mencuci("piring"));
        System.out.println("Apakah fatimah tidur di siang hari ? " + fatimah.tidur(false));
    }
}
