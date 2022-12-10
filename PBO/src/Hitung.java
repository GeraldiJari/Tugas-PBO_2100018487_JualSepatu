abstract public class Hitung{
    static int jumlah;

    public Hitung(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getJumlah(int jml) {
        return jumlah;
    }

    public int setJumlah(int jumlah) {
        return this.jumlah = jumlah;
    }

    abstract int jml_sepatu(int jml);
}
