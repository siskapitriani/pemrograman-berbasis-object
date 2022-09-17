package pertemuan.dua;

public class PesawatTelepon {
    String bentuk, gagangTelepon, kabel;

    public String getBentuk() {
        return bentuk;
    }

    public void setBentuk(String bentuk) {
        this.bentuk = bentuk;
    }

    public String getGagangTelepon() {
        return gagangTelepon;
    }

    public void setGagangTelepon(String gagangTelepon) {
        this.gagangTelepon = gagangTelepon;
    }

    public String getKabel() {
        return kabel;
    }

    public void setKabel(String kabel) {
        this.kabel = kabel;
    }

    boolean terimaPanggilan(boolean tp){
        return tp;
    }

    boolean melakukanPanggilan(boolean mp){
        return mp;
    }
}
