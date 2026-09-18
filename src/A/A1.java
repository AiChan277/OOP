package A;

public class A1 {
    // 4 level access modifier pada atribut tentang item pada toko pancing
    public String namaAlat       = "Joran Shimano 210cm";       // Public: Secara bebas diakses dari mana saja
    protected double harga       = 350000;                      // Protected: Dimana satu package + subclass beda package
    String stok                  = "Tersedia 12 unit";          // Default: Attribut hanya bisa diakses dalam satu package
    private String supplier      = "PT. Pancing Sejahtera";     // Private: Attribut hanya bisa diakses di dalam kelas ini

    // Method untuk membuktikan akses di dalam kelas sendiri (internal)
    public void testAksesInternal() {
        System.out.println("Akses dari A1 (Kelas sendiri yang memuat alat-alat pancing)");
        System.out.println("Nama Alat  (public)    : " + namaAlat);    // Attribut ini dapat diakses
        System.out.println("Harga      (protected) : " + harga);       // Attribut ini dapat diakses
        System.out.println("Stok       (default)   : " + stok);        // Attribut ini dapat diakses
        System.out.println("Supplier   (private)   : " + supplier);    // Attribut ini dapat diakses
        System.out.println();
    }
}
