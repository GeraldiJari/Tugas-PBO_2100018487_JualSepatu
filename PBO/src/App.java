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

    private static void cek(){
        
    }

    public static void main(String[] args) throws Exception {
        //variabel
        int pilih;
        int pilih_mobil;//ganti jadi sepatu
        String[][] merk = {{"Sedan","01",},{"BMW ","02"},{"TAXI ","03"}};
        //inisialisasi objek
        Pembeli penyewa = new Pembeli();//sewa ganti jadi beli
        // Data data = new Data();
        Admin admin = new Admin();
        Scanner in = new Scanner(System.in);
        System.out.print("Admin : ");
        String name_admin = in.nextLine();
        admin.setNama_admin(name_admin);
        do {
            batas();
            System.out.println("Admin : "+admin.getNama_admin());
            System.out.println("1.Input Nama Pembeli");
            System.out.println("2.Pilih Sepatu");
            System.out.println("3.Bayar");
            System.out.println("4.Cetak");
            System.out.println("5.Keluar");
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
                    
                    int jml;
                    System.out.println("Pembeli : "+penyewa.getNama_pembeli());//ganti jadi pembeli
                    System.out.println("Berapa sepatu yang anda inginkan (Maks 5) ");
                    jml = in.nextInt();
                    Barang brg = new Barang(jml);
                    brg.jml_sepatu(jml);
                    for(int i=0; i < merk.length; i++){
                        System.out.print(merk[i][0]);System.out.print("\t"+merk[i][1]);
                        System.out.println();
                    }
                    batas();
                    System.out.println("PILIH MOBIL");
                    pilih = in.nextInt();
                    if(pilih==1){
                        brg.pilih1();
                    }
                    else if(pilih==2){
                        brg.pilih2();
                    }
                    else if(pilih==3){
                        brg.pilih3();
                    }
                    brg.jml_sepatu(jml);
                }
                break;
                case 3:
                Barang barang = new Barang(pilih);
                System.out.println("Penyewa : "+penyewa.getNama_pembeli());
                System.out.println("PILIH MOBIL");
                System.out.print(">> ");
                pilih_mobil = in.nextInt();
                barang.pilih1();
                break;
                case 4:
            }
        }
        while (pilih <= 4);
    }
}
