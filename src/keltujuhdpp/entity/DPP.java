/*
Kelompok 7
222111930 Atha JR
222111938 Azhari
222111971 Cindy Septia Trionita
222112085 Hamdani
222112212 Muhammad Fauzan Azima. A
*/

package keltujuhdpp.entity;

public class DPP {

    private int status;
    private String deskripsiStatus;
    private int kunjungan;
    private String deskripsiKunjungan;

    public DPP() {
    }

    public DPP(int status, int kunjungan) {
        this.setStatus(status);
        this.setKunjungan(kunjungan);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
        switch (status) {
            case 1 ->
                deskripsiStatus = "Aktif";
            case 2 ->
                deskripsiStatus = "Tutup Sementara/Tidak ada kegiatan";
            case 3 ->
                deskripsiStatus = "Belum Berproduksi";
            case 4 ->
                deskripsiStatus = "Tidak Bersedia di wawancarai";
            case 5 ->
                deskripsiStatus = "Alih Usaha ke non Pertanian";
            case 6 ->
                deskripsiStatus = "Tutup";
            case 7 ->
                deskripsiStatus = "Tidak ditemukan";
            case 8 ->
                deskripsiStatus = "Baru";
            case 9 ->
                deskripsiStatus = "ganda";
        }

    }

    public int getKunjungan() {
        return kunjungan;
    }

    public void setKunjungan(int kunjungan) {
        this.kunjungan = kunjungan;
        switch (kunjungan) {
            case 0 ->
                deskripsiKunjungan = "Belum dikonfirmasi keberadaannya";
            case 1 ->
                deskripsiKunjungan = "Sudah dikunjungi/mendapatkan informasi dari Pihak lain(dinas dll)";
        }
    }

    @Override
    public String toString() {
        return "DPP{" + "status= " + status + ", deskripsi Status= " + deskripsiStatus + ", kunjungan= " + kunjungan + ", deskripsi Kunjungan= " + deskripsiKunjungan + '}';
    }
}
