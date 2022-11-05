public class Pembeli extends Data {
    private String Nama_pembeli, no_hp, alamat;

    public String getNama_pembeli() {
        return Nama_pembeli;
    }

    public void setNama_pembeli(String nama_pembeli) {
        Nama_pembeli = nama_pembeli;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public void tes() {
        System.out.println("Kontol");
    }

    
}
