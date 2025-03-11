/*
 * ===========================================
 * Author   : Nabil Sahsada Suratno
 * Mode     : Java Main Class
 * Nim      : 202410370110357
 * ===========================================
 */

package Tugas.modul2;
import java.util.ArrayList;

/**
 * Class listMahasiswa - Deskripsi singkat mengenai kelas ini.
 */
public class listMahasiswa {

    //Init
    public ArrayList<mahasiswa> list;

    // Constructor
    public listMahasiswa() {
        list = new ArrayList<mahasiswa>();
        list.add(
                new mahasiswa(
                        1,
                        202410370110357L,
                        "nabil",
                        "jalan jalan",
                        "085930258437",
                        "123321"
                )
        );
    }

    public boolean validateMahasiswa(int nim, String password) {
        for (mahasiswa mhs : list) {
            if (mhs.login(nim, password)) {
                return true;
            }
        }
        return false;
    }

    public void Tampil_mahasiswa() {
        System.out.println("\tDaftar Mahasiswa");
        System.out.println("Nim \tNama \tAlamat \tTelepon \tpassword");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId_Mahasiswa() + " "
                    + list.get(i).getNim() + "\t"
                    + list.get(i).getNama() + "\t"
                    + list.get(i).getAlamat() + "\t"
                    + list.get(i).getTelepon() + "\t"
                    + list.get(i).getPassword());
        }
    }
    //menampilkan mahasiswa menurut id
    public mahasiswa findAllMahasiswa(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId_Mahasiswa() == id) {
                return list.get(i);
            }
        }
        return null;
    }
    //Cari nama berdasarkan ID
    public String findAdmin(int id) {
        return list.get(id).getNama();
    }

    //ubah password mahasiswa
    public void set_passwordMhs(int id,String pass) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId_Mahasiswa() == id) {
                list.get(i).setPassword(pass);
            }
        }
    }
}
