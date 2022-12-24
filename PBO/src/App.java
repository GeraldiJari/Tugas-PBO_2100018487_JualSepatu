import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class App {

    private static void batas(){
        int i=0;
        while ( i <= 10 ){
            System.out.print("===");
            i++;
        }
        System.out.println();
        //=======================
    }

    private static void daftar(){
        System.out.println("Daftar Sepatu : ");
        String[][] merk = {{"Mike","1",},{"Adinda ","2"},{"Naiki ","3"}};
        for(int i=0; i < merk.length; i++){
            System.out.print(merk[i][0]);System.out.print("\t"+merk[i][1]);
            System.out.println();
        }
        //daftar sepatu
    }

    public static void main(String[] args) throws Exception {
        //variabel
        int pilih;
        int jml;
        //inisialisasi objek
        Pembeli beli = new Pembeli();
        Admin admin = new Admin();
        
        Info.test();
        Scanner in = new Scanner(System.in);
        //input nama admin
        System.out.print("Admin : ");
        String name_admin = in.nextLine();
        admin.setNama_admin(name_admin);

        do {
            batas();
            System.out.println("Admin : "+admin.getNama_admin());
            System.out.println("1.Input Nama Pembeli");
            System.out.println("2.Daftar Sepatu");
            System.out.println("3.Beli Sepatu");
            System.out.println("4.Keluar");
            System.out.print("Pilih >> ");
            pilih = in.nextInt();
            in.nextLine();
            batas();
            
            switch(pilih){      
                case 1:
                    System.out.print("Masukan Nama : ");
                    String nama = in.nextLine();
                    beli.setNama_pembeli(nama);
                    System.out.print("Masukan No Telp : ");
                    String no_hp = in.nextLine();
                    beli.setNo_hp(no_hp);
                    System.out.print("Masukan Alamat : ");
                    String alamat = in.nextLine();
                    beli.setAlamat(alamat);
                break;

                case 2:
                if(beli.getNama_pembeli()==null){
                    //kondisi jika inputan nama tidak dimasukan terlebih dahulu
                    System.out.println("!!! Inputkan Nama Pembeli Terlebih Dahulu Baru Liat !!!");    
                }
                else{
                    daftar();
                }
                break;

                case 3:
                if(beli.getNama_pembeli()==null){
                    //kondisi jika inputan nama tidak dimasukan terlebih dahulu
                    System.out.println("!!! Inputkan Nama Pembeli Terlebih Dahulu, Baru Beli !!!");    
                }
                else{ 
                    System.out.println("Pembeli : "+beli.getNama_pembeli());//ganti jadi pembeli
                    System.out.println("Berapa sepatu yang anda inginkan  ");
                    jml = in.nextInt();
                    Barang brg = new Barang(jml);
                    brg.jml_sepatu(jml);
                    //tampilkan daftar sepatu
                    daftar();
                    batas();
                    System.out.println("PILIH SEPATU");
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
                    try {
                        System.out.printf("Tunggu sebentar cuyy....\n", LocalTime.now());
                        Thread.sleep(5 * 1000); 
                        System.out.printf("Ok bentar lagi....\n", LocalTime.now());
                        Thread.sleep(5 * 1000); 
                        System.out.printf("Selesai cuyy\n", LocalTime.now());
                        Thread.sleep(3 * 1000); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                
                break;
                
            }
        }
        while (pilih <= 3);
    }
}
