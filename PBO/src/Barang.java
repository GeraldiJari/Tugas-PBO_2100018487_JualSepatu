import java.util.Scanner;

public class Barang extends Data{

    int harga;
    public Barang(int jumlah) {
        super(jumlah);
        //TODO Auto-generated constructor stub
    }

    public String model;
    Scanner input = new Scanner(System.in);
    private int sewa;
    private int pajak = 2500;
    int total;
    int jml;
    public int getSewa(int sewa) {
        return sewa;
    }
    public void setSewa(int sewa) {
        this.sewa = sewa;
    }
    
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public void pilih1(){      
            sewa = 20000;
            System.out.println("Warna : ");
            System.out.println("Merk : Mike");
            System.out.println("Harga Sewa Per Hari: "+sewa);
            total = sewa+setJumlah(jml_sepatu(jml));
            System.out.println("Harga Sewa Per Hari: "+total);
            int bayar = input.nextInt();
            bayar = total-bayar;
            System.out.println("Totalnya : "+bayar);
    }
        public void pilih2(){      
            sewa = 30000;
            System.out.println("Warna : ");
            System.out.println("Merk : Adinda");
            System.out.println("Harga Sewa Per Hari: "+sewa);
            total = sewa+setJumlah(jml_sepatu(jml));
            System.out.println("Harga Sewa Per Hari: "+total);
            int bayar = input.nextInt();
            bayar = total-bayar;
            System.out.println("Totalnya : "+bayar);
    }
        public void pilih3(){      
            sewa = 40000;
            System.out.println("Warna : ");
            System.out.println("Merk : Untitle");
            System.out.println("Harga Sewa Per Hari: "+sewa);
            total = sewa+setJumlah(jml_sepatu(jml));
            System.out.println("Harga Sewa Per Hari: "+total);
            int bayar = input.nextInt();
            bayar = total-bayar;
            System.out.println("Totalnya : "+bayar);
    }
    
    @Override
    int jml_sepatu(int jml) {
        // TODO Auto-generated method stub
        return (super.getJumlah(jml)*pajak);
    } 
}

