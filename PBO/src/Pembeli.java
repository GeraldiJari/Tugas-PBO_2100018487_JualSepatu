public class Pembeli extends Data {

    public Pembeli() {
        super(jumlah);
        //TODO Auto-generated constructor stub
    }

    private String Nama_pembeli, no_hp, alamat;

    protected String getNama_pembeli() {
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
    int jml_sepatu(int jml) {
        // TODO Auto-generated method stub
        return (super.getJumlah(jml));
    }
    
}
