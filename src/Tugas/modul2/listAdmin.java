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
 * Class listAdmin - Deskripsi singkat mengenai kelas ini.
 */
public class listAdmin {

    //Init
    public ArrayList<admin> list;

    // Constructor
    public listAdmin() {
        list = new ArrayList<admin>();
        list.add(
                new admin(
                        1,
                        "admin",
                        "jalan jalan",
                        "085930258437",
                        "admin123"
                )
        );
    }

    public boolean validateAdmin(String nama, String password) {
        for (admin admin : list) {
            if (admin.login(nama, password)) {
                return true;
            }
        }
        return false;
    }

    public void Tampil_admin() {
        System.out.println("\tDaftar Admin");
        System.out.println("Nama \tAlamat \tTelepon \tpassword");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId_Admin() + " "
                    + list.get(i).getNama() + "\t"
                    + list.get(i).getAlamat() + "\t"
                    + list.get(i).getTelepon() + "\t"
                    + list.get(i).getPassword());
        }
    }
    //menampilkan admin menurut id
    public admin findAllAdmin(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId_Admin() == id) {
                return list.get(i);
            }
        }
        return null;
    }
    //Cari nama berdasarkan ID
    public String findAdmin(int id) {
        return list.get(id).getNama();
    }

    //ubah password admin
    public void set_passwordAdmin(int id,String pass) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId_Admin() == id) {
                list.get(i).setPassword(pass);
            }
        }
    }

}
