/*
 * ===========================================
 * Author   : Nabil Sahsada Suratno
 * Mode     : Java Main Class
 * Nim      : 202410370110357
 * ===========================================
 */

package Tugas.modul2;


/**
 * Class admin - Deskripsi singkat mengenai kelas ini.
 */
public class admin implements user_interface {
    private String nama, alamat, telepon, password;
    private int id_Admin;

    // Constructor
    public admin(int id_Admin, String nama, String alamat, String telepon, String password ) {
        this.id_Admin = id_Admin;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.password = password;
    }


    /**
     * method for login sistem
     * @param nama
     * @param password
     * @return
     */
    public boolean login(String nama, String password) {
        if (this.nama == null || this.password == null || nama == null || password == null) {
            return false;
        }
        return this.nama.equals(nama) && this.password.equals(password);
    }


    /**
     * getter dan setter id admin
     * @return
     */
    public int getId_Admin() {
        return id_Admin;
    }

    public void setId_Admin(int id_Admin) {
        this.id_Admin = id_Admin;
    }

    /**
     * getter dan setter nama
     * @return
     */
    @Override
    public String getNama() {
        return nama;
    }
    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * getter & setter alamat
     * @return
     */
    @Override
    public String getAlamat() {
        return alamat;
    }
    @Override
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * getter dan setter telepon
     * @return
     */
    @Override
    public String getTelepon() {
        return telepon;
    }
    @Override
    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    /**
     * getter dan setter password
     * @return
     */
    @Override
    public String getPassword() {
        return password;
    }
    @Override
    public void setPassword(String password) {
        this.password = password;
    }
}
