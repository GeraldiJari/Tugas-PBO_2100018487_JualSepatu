import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Barang extends Data{

    public Barang(int jumlah) {
        super(jumlah);
        //TODO Auto-generated constructor stub
    }

    Scanner input = new Scanner(System.in);
    private int harga;
    private int pajak = 2500;
    int total;
    int jml;
    
    public int getharga(int harga) {
        return harga;
    }
    public void setharga(int harga) {
        this.harga = harga;
    }

    public void pilih1(){     
            harga = 20000;
            System.out.println("Warna : ");
            System.out.println("Merk : Mike");
            System.out.println("Harga Jual : "+harga);
            total = (setJumlah(jumlah)*harga)+setJumlah(jml_sepatu(jml));
            System.out.println("Harga Total: "+total);
            System.out.println("============================");
            System.out.print("Bayar : ");
            int bayar = input.nextInt();
            bayar = total-bayar;
            bayar=-bayar;
            System.out.println("Sisa : "+bayar);
            String fileName = "src/struct.txt";
            try {
                FileWriter fileWriter = new FileWriter(fileName);
                fileWriter.write("Harga Barang :"+getharga(harga));
                fileWriter.write("\nPajak :"+getJumlah(bayar));
                fileWriter.write("\nTotal : "+total);
                fileWriter.close();
                
                System.out.println("Struct sedang di cetak :v.......");
            } catch (IOException e) {
                System.out.println("Terjadi kesalahan karena: " + e.getMessage());
            }
    }

        public void pilih2(){      
            harga = 30000;
            System.out.println("Warna : ");
            System.out.println("Merk : Adinda");
            System.out.println("Harga Jual : "+harga);
            total = (setJumlah(jumlah)*harga)+setJumlah(jml_sepatu(jml));
            System.out.println("Harga Total: "+total);
            System.out.println("============================");
            System.out.print("Bayar : ");
            int bayar = input.nextInt();
            bayar = total-bayar;
            bayar=-bayar;
            System.out.println("Sisa : "+bayar);
            String fileName = "src/struct.txt";
            try {
                FileWriter fileWriter = new FileWriter(fileName);
                fileWriter.write("Harga Barang :"+getharga(harga));
                fileWriter.write("\nPajak :"+getJumlah(bayar));
                fileWriter.write("\nTotal : "+total);
                fileWriter.close();
                
                System.out.println("Struct sedang di cetak :v.......");
            } catch (IOException e) {
                System.out.println("Terjadi kesalahan karena: " + e.getMessage());
            }
    }

        public void pilih3(){      
            harga = 40000;
            System.out.println("Warna : ");
            System.out.println("Merk : Untitle");
            System.out.println("Harga : "+harga);
            total = (setJumlah(jumlah)*harga)+setJumlah(jml_sepatu(jml));
            System.out.println("Harga Total: "+total);
            int bayar = input.nextInt();
            bayar = total-bayar;
            bayar=-bayar;
            System.out.println("Sisa : "+bayar);
    }
    
    @Override
    int jml_sepatu(int jml) {
        // TODO Auto-generated method stub
        return (super.getJumlah(jml)*pajak);
    }

}

