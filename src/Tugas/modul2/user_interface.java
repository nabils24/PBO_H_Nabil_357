/*
 * ===========================================
 * Author   : Nabil Sahsada Suratno
 * Mode     : Java Main Class
 * Nim      : 202410370110357
 * ===========================================
 */

package Tugas.modul2;


/**
 * Interface login_interface - Deskripsi singkat mengenai Interface ini.
 */
public interface user_interface {

    // Abstract Method
    public void setNama(String Alamat);
    public String getNama();

    public void setAlamat(String Alamat);
    public String getAlamat();

    public void setTelepon(String Telepon);
    public String getTelepon();

    public void setPassword(String Password);
    public String getPassword();
}
