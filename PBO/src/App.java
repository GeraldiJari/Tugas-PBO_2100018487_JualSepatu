import java.util.Scanner;

public class App {

    protected static void batas(){
        int i=0;
        while ( i <= 10 ){
            System.out.print("===");
            i++;
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        //variabel
        int pilih;
        int pilih_mobil;
        //inisialisasi objek
        Pembeli penyewa = new Pembeli();
        Barang barang = new Barang();
        Data data = new Data();
        Scanner in = new Scanner(System.in);
        do {
            batas();
            System.out.println("1.Input Nama Penyewa");
            System.out.println("2.Pilih Mobil");
            System.out.println("3.Bayar");
            System.out.println("4.Cetak");
            System.out.print("Pilih >> ");
            pilih = in.nextInt();
            in.nextLine();
            batas();
            
            switch(pilih){
                case 1:
                    System.out.print("Masukan Nama : ");
                    String nama = in.nextLine();
                    penyewa.setNama_pembeli(nama);;
                    System.out.print("Masukan No Telp : ");
                    String no_hp = in.nextLine();
                    penyewa.setNo_hp(no_hp);
                    System.out.print("Masukan Alamat : ");
                    String alamat = in.nextLine();
                    penyewa.setAlamat(alamat);
                break;
                case 2:
                if(penyewa.getNama_pembeli()==null){
                    //kondisi jika inputan nama tidak dimasukan terlebih dahulu
                    System.out.println("!!! Inputkan Nama Anda Terlebih Dahulu !!!");    
                }
                else{
                    System.out.println("Penyewa : "+penyewa.getNama_pembeli());
                    barang.merk();
                    System.out.println("PILIH MOBIL");
                    System.out.print(">> ");pilih_mobil = in.nextInt();
                    barang.pilih(pilih_mobil);
                    System.out.println("Berapa Hari anda akan menyewa > ");
                }
    
                break;
                case 3:
                    data.tes();
                    penyewa.tes();
                break;
                case 4:
            }
        }
        while (pilih <= 4);
       

    }
}
