public class Info implements Aplikasi {
    private String nama;
    private String alamat;

    public Info(String namaBaru, String alamatBaru){
        nama = namaBaru;
        alamat = alamatBaru;
     }
     static void test(){
        Info SupplierSepatu;
        SupplierSepatu = new Info("TOKO SEPATU UNTITEL","Jalan Kertayasa");
        System.out.println("===========================================");
        System.out.println("Informasi perusahaan : "+"\n"+SupplierSepatu);
        System.out.println("===========================================");
     }
    @Override
    public void Login() {
        // TODO Auto-generated method stub
        System.out.println("Anda Telah Login");
    }

    @Override
    public void out() {
        // TODO Auto-generated method stub
        
    }

      public void setNama(String namaBaru) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setAlamat(String alamatBaru) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getNama() {
        
        // TODO Auto-generated method stub
        return nama;
    }

    @Override
    public String getAlamat() {
        // TODO Auto-generated method stub
        return alamat;
    }

    public String toString(){
      return
        "Nama       : "+nama+"\n"+
        "Alamat     : "+alamat+"\n"+
        "Provinsi   : "+PROVINSI+"\n"; 
   }
    
}
