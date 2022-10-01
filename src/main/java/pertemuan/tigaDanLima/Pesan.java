package pertemuan.tigaDanLima;

public class Pesan {
    String nama, gula;
    Integer harga, quantity;

    public Pesan(String nama, String gula, Integer harga, Integer quantity) {
        this.nama = nama;
        this.gula = gula;
        this.harga = harga;
        this.quantity = quantity;
    }

    public String getNama() {
        return nama;
    }

    public String getGula() {
        return gula;
    }

    public Integer getHarga() {
        return harga;
    }

    public Integer getQuantity() {
        return quantity;
    }


}
