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
        System.out.printf("| %-5s | %-15s | %-20s | %-10s |\n",
                "ID", "Nama", "Telepon", "Password");
        System.out.println("--------------------------------------------------------------------");

        for (admin mhs : list) {
            System.out.printf("| %-5d | %-15s | %-20s | %-10s |\n",
                    mhs.getId_Admin(),
                    mhs.getNama(),
                    mhs.getTelepon(),
                    mhs.getPassword());
        }

        System.out.println("--------------------------------------------------------------------");
    }

    public void tambah_Admin(int id, String nama, String alamat, String telepon, String password) {
        list.add(new admin(id, nama, alamat, telepon, password));
        System.out.println("Berhasil dimenambahkan ADMIN!");
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

    //udah mashok ki
    public void set_passwordAdmin(int idAdmin, String newPassword) {
        for (admin adm : list) {
            if (adm.getId_Admin() == idAdmin) {
                adm.setPassword(newPassword);
                System.out.println("Password berhasil diubah: " + newPassword); // Debugging
                return;
            }
        }
        System.out.println("ID Admin tidak ditemukan!");
    }

}
