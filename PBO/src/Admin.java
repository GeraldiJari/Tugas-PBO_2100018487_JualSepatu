public class Admin extends Data{
    
    
    public Admin() {
        super(jumlah);
        //TODO Auto-generated constructor stub
    }

    private String nama_admin;
    private String tampil;

    public String getNama_admin() {
        return nama_admin;
    }

    public void setNama_admin(String nama_admin) {
        this.nama_admin = nama_admin;
    }

    public String getTampil() {
        return tampil;
    }

    public void setTampil(String tampil) {
        this.tampil = tampil;
    }

    
   @Override
   String info(String alamat) {
       // TODO Auto-generated method stub
       return super.info(alamat);
   }

    

    

}
