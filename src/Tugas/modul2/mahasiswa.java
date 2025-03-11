/*
 * ===========================================
 * Author   : Nabil Sahsada Suratno
 * Mode     : Java Main Class
 * Nim      : 202410370110357
 * ===========================================
 */

package Tugas.modul2;


/**
 * Class mahasiswa - Deskripsi singkat mengenai kelas ini.
 */
public class mahasiswa implements user_interface {
    private String nama, alamat, telepon, password;
    private int id_Mahasiswa;
    private long nim;


    // Constructor
    public mahasiswa(int id_Mahasiswa, long nim, String nama, String alamat, String telepon, String password ) {
        this.id_Mahasiswa = id_Mahasiswa;
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.password = password;
    }

    /**
     * method for login sistem
     * @param nim
     * @param password
     * @return
     */
    public boolean login(int nim, String password) {
        long nimL = (long) nim;
        return this.nim == nimL && this.password.equals(password);
    }

    /**
     * getter dan setter id admin
     * @return
     */
    public int getId_Mahasiswa() {
        return id_Mahasiswa;
    }

    public void setId_Mahasiswa(int id_Mahasiswa) {
        this.id_Mahasiswa = id_Mahasiswa;
    }

    /**
     * getter dan setter nim
     * @return
     */
    public long getNim() {
        return nim;
    }
    public void setNim(long nim) {
        this.nim = nim;
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
