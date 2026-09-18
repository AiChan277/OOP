package B;

import A.A1;

public class B1 extends A1 {
    public void testAkses() {
        System.out.println("Akses dari B1 (Beda Package, Subclass A1)");
        System.out.println("Nama Alat  (public)    : " + namaAlat);    // BISA: public bebas diakses
        System.out.println("Harga      (protected) : " + harga);       // BISA: diwariskan ke subclass meski beda package

        // COMPILE ERROR:
        // System.out.println("Stok       (default)   : " + stok);
        // Alasan error: 'stok' tidak terlihat karena dibatasi hanya untuk Package A (default/package-private)

        // COMPILE ERROR:
        // System.out.println("Supplier   (private)   : " + supplier);
        // Alasan error: 'supplier' tidak diwariskan / hanya milik internal A1

        System.out.println();
    }
}
