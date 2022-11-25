package quizutama.jawabannomorsatu;

public class Login {
    String id;

    public boolean isLoginAdmin(String id) {
        String adminId = "admin123";
        boolean isAdmin = true;
        if (!adminId.equalsIgnoreCase(id)){
            System.out.println("ID Anda Salah -> " + id);
            System.out.println();
            System.out.println("Administrasi Persediaan Barang Distributor PT. Garuda Abadi Group");
            System.out.println("Check, Data dan Anter, Ketelitian Anda dalam Administrasi di Utamakan (*_*)");

            return false;
        }
        return isAdmin;
    }
}