import java.util.Scanner;

public class Barang extends Data{
    String[][] merk = {{"Sedan","01",},{"BMW ","02"},{"TAXI ","03"},{"LANCER","04"},{"TOYOTA","05"}};
    public String model;
    private int pilih_mobil;
    private int sewa1,sewa2,sewa3,sewa4,sewa5;
    Scanner input = new Scanner(System.in);
    public String[][] getMerk() {
        return merk;
    }
    public void setMerk(String[][] merk) {
        this.merk = merk;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public void merk(){
        for(int i=0; i < merk.length; i++){
            System.out.print(merk[i][0]);System.out.print("\t"+merk[i][1]);
            System.out.println();
        }
    }

    public void pilih(int pilih_mobil){
        if(pilih_mobil==1){
            sewa1 = 20000;
            System.out.println("Warna : ");
            System.out.println("Merk : Mobil Sedan");
            System.out.println("Harga Sewa Per Hari: "+sewa1);
            System.out.println(">");

            System.out.println();
        }
        else if(pilih_mobil==2){
            System.out.println("Deskripsi : ");
            System.out.println("Merk : BMW");
            System.out.println("Harga Sewa Per Hari: "+sewa2);
            System.out.println();
        }
        else if(pilih_mobil==3){
            System.out.println("Deskripsi : ");
            System.out.println("Merk : TAXI ");
            System.out.println("Harga Sewa Per Hari: "+sewa3);
            System.out.println();
        }
        
    }  
}
