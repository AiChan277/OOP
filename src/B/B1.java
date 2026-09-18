package B;

import A.A1;

public class B1 extends A1 {
    public void testAkses() {
        System.out.println("Akses dari B1 (Subclass dari A1, namun berbeda package)");
        System.out.println("Nama Alat  (public)    : " + namaAlat);    // Attribut public bebas diakses darimana saja
        System.out.println("Harga      (protected) : " + harga);       // Attribut diwariskan ke subclass meski beda package

        // COMPILE ERROR:
        // System.out.println("Stok       (default)   : " + stok);
        // Attribut 'stok' tidak terlihat karena dibatasi hanya untuk Package A (default/package-private)

        // COMPILE ERROR:
        // System.out.println("Supplier   (private)   : " + supplier);
        // Attribut 'supplier' tidak diwariskan sehingga attribut 'supplier' hanya milik internal A1

        System.out.println();
    }
}
