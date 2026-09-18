package A;

public class A1 {
    // 4 level access modifier pada atribut bertema Toko Pancing
    public String namaAlat       = "Joran Shimano 210cm";       // public    — bebas diakses dari mana saja
    protected double harga       = 350000;                      // protected — satu package + subclass beda package
    String stok                  = "Tersedia 12 unit";          // default   — hanya bisa diakses dalam satu package
    private String supplier      = "PT. Pancing Sejahtera";     // private   — hanya bisa diakses di dalam kelas ini

    // Method untuk membuktikan akses di dalam kelas sendiri (internal)
    public void testAksesInternal() {
        System.out.println("Akses dari A1 (Kelas Sendiri — AlatPancing)");
        System.out.println("Nama Alat  (public)    : " + namaAlat);    // BISA
        System.out.println("Harga      (protected) : " + harga);       // BISA
        System.out.println("Stok       (default)   : " + stok);        // BISA
        System.out.println("Supplier   (private)   : " + supplier);    // BISA
        System.out.println();
    }
}
