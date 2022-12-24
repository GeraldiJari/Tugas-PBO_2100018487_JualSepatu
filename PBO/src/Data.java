public class Data extends Hitung implements Aplikasi{
    private String nama;
    private String alamat;

    public Data(int jumlah){
        super(jumlah);
    }
   

    @Override
    int jml_sepatu(int jml) {
        // TODO Auto-generated method stub
        return (super.getJumlah(jml));
    }

    @Override
    public void Login() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void out() {
        // TODO Auto-generated method stub
        
    }

    @Override
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
        "Alamat            : "+alamat+"\n"+
        "Provinsi   : "+PROVINSI+"\n"; 
   }
    
    
    
}
