/*
 * ===========================================
 * Author   : Nabil Sahsada Suratno
 * Mode     : Java Main Class
 * Nim      : 202410370110357
 * ===========================================
 */

package Codelab.modul2.codelab2;


/**
 * Interface rekening_interface - Deskripsi singkat mengenai Interface ini.
 */
public interface rekening_interface {

    // Abstract Method
    void tampilkanInfo();
    void setorUang(double jumlah);
    void tarikUang(double jumlah);
    String getNomorRekening();
    void setNomorRekening(String nomorRekening);
}
