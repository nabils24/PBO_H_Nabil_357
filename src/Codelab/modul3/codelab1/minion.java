/*
 * ===========================================
 * Author   : Nabil Sahsada Suratno
 * Mode     : Java Main Class
 * Nim      : 202410370110357
 * ===========================================
 */

package Codelab.modul3.codelab1;


/**
 * Class minion - Deskripsi singkat mengenai kelas ini.
 */
public class minion extends karakterGame {

    /**
     * minion disini berguna sebagai constructor yang akan mengakses superclass super(nama,kesehatan)
     * @param nama
     * @param kesehatan
     */
    public minion(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    /**
     * method serang disini bertugas mengoveride pada superclass serang yang dimana berisi 3 parameter dan mengembalikan nilai sesuai pada code
     * @param target
     * @param damage
     * @param skil
     */
    @Override
    public void serang(karakterGame target, int damage , String skil) {
        System.out.println(getNama() + " menyerang "+target.getNama()+ " menggunakan "+skil);
        target.setKesehatan(target.getKesehatan() - damage);
        System.out.println("Kesehatan " + target.getNama() + " sekarang: " + target.getKesehatan());
    }
}
