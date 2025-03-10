/*
 * ===========================================
 * Author   : Nabil Sahsada Suratno
 * Mode     : Java Main Class
 * Nim      : 202410370110357
 * ===========================================
 */

package Codelab.modul2.codelab2;


/**
 * Class rekBank - Deskripsi singkat mengenai kelas ini.
 */
public class rekBank implements rekening_interface {

    /**
     * Private variable berisikan nomorRekening, namaPemilik, saldo
     */
    private String nomorRekening;
    private String namaPemilik;
    private double saldo;


    // Constructor
    public rekBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    /**
     * Override dri function tampilkanInfo yg berasal dari rekening_interface
     * Menampilkan variable instance nomorRekening, namaPemilik, saldo
     */
    @Override
    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: " + saldo);
    }


    /**
     * Override dri function setorUang yg berasal dari rekening_interface
     * @param jumlah digunakan untuk menambahkan pada variable instance dari saldo, jika saldo ada maka ditambahkan dengan jumlah
     */
    @Override
    public void setorUang(double jumlah) {
        if(jumlah >= 10000){
            saldo += jumlah;
            System.out.println("INFO: Berhasil Setor Uang!");
            System.out.println("Setor Uang: " + jumlah);
            tampilkanInfo();
        }else{
            System.out.println("INFO: Gagal Setor Uang!");
            System.out.println("DESC: Jumlah Setor Uang Minimal 10000");
        }
    }


    /**
     * Override dri function tarikUang yg berasal dari rekening_interface
     * @param jumlah
     * dimethod ini ada perbedaan dari method setorUang yaitu ada pengondisian jika saldo >= dari jumlah maka bisa menarik uang dan saldo - dari jumlah
     * namun jika saldo <= maka tidak bisa menarik uang dan saldo tidak berkurang
     */
    @Override
    public void tarikUang(double jumlah) {
        if (saldo >= jumlah) {
            if(saldo - jumlah >= 10000) {
                saldo -= jumlah;
                System.out.println("INFO: Berhasil Tarik Uang!");
                System.out.println("Tarik Uang: " + jumlah);
            }else{
                System.out.println("INFO: Gagal Tarik Uang!");
                System.out.println("DESC: Jumlah Minimal Saldo Kurang dari 10000");
            }
        } else {
            System.out.println("INFO: Gagal Menarik Uang!");
            System.out.println("Saldo tidak mencukupi untuk tarik uang sebesar: " + jumlah);
        }
        tampilkanInfo();
    }

    /**
     * Override dri function getNomorRekening yg berasal dari rekening_interface
     * @return
     * mengembalikan nilai variable instance nomorRekening
     */
    @Override
    public String getNomorRekening() {
        return nomorRekening;
    }

    /**
     * Override dri function setNomorRekening yg berasal dari rekening_interface
     * @param nomorRekening
     * menset atau menetapkan value dari variable instance nomorRekening dari attribute nomorRekening
     */
    @Override
    public void setNomorRekening(String nomorRekening) {
        this.nomorRekening = nomorRekening;
    }
}
