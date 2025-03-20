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
    public minion(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    @Override
    public void serang(karakterGame target, int damage , String skil) {
        System.out.println(getNama() + " menyerang "+target.getNama()+ " menggunakan "+skil);
        target.setKesehatan(target.getKesehatan() - damage);
        System.out.println("Kesehatan " + target.getNama() + " sekarang: " + target.getKesehatan());
    }
}
