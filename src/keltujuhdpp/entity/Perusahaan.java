/*
Kelompok 7
222111930 Atha JR
222111938 Azhari
222111971 Cindy Septia Trionita
222112085 Hamdani
222112212 Muhammad Fauzan Azima. A
*/

package keltujuhdpp.entity;

import java.util.ArrayList;
import java.util.List;


public class Perusahaan {

    private KIP kodeWilayah;
    private String nama;
    private String alamat;
    private List<String> noTelp = new ArrayList<String>();
    private int bbhu;
    private DPP dpp;
    private Subsektor subsektor;
    private String usahaUtama;
    private String faksimili;
    private String deskripsiBbhu;
    private String deskripsiUsahaUtama;

    public Perusahaan() {
    }

    public String getFaksimili() {
        return faksimili;
    }
    public void setFaksimili(String faksimili) {
        this.faksimili = faksimili;
    }

    public KIP getKodeWilayah() {
        return kodeWilayah;
    }

    public void setKodeWilayah(KIP kodeWilayah) {
        this.kodeWilayah = kodeWilayah;
    }

    public String getNama() {
        return nama.toUpperCase();
    }

    //Metode replaceAll() menggantikan semua kemunculan String di String lain yang cocok dengan regex.
    //Metode replaceAll() membutuhkan dua parameter.
    //regex - regex (bisa berupa string biasa) yang akan diganti
    //penggantian - penggantian urutan karakter
    //Bagian dibawah ini menunjukan apabila input nama perusahaan selaian huruf a-z dan A-Z serta angka 0-9 maka akan direplace menjadi tidak ada.
    public void setNama(String nama) {
        this.nama = nama.replaceAll("[^a-z | ^A-Z| ^0-9|^ ]", "");
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public List<String> getNoTelp() {
        return noTelp;
    }

    //Bagian dibawah ini menunjukan apabila input nomor telepon selain angka 0-9 dan () maka akan direplace menjadi tidak ada.
    public void addNoTelp(String noTelp) {
        this.noTelp.add(noTelp.replaceAll("[^0-9|^()|^ ]", ""));
    }

    public int getBbhu() {
        return bbhu;
    }

    //set Keterangan Kode Bentuk Badan Hukum Usaha
    public void setBbhu(int bbhu) {
        this.bbhu = bbhu;
        switch (bbhu) {
            case 1:
                deskripsiBbhu = "Perusahaan Negara";
                break;
            case 2:
                deskripsiBbhu = "Perusahaan Daerah";
                break;
            case 3:
                deskripsiBbhu = "Persero";
                break;
            case 4:
                deskripsiBbhu = "Perum";
                break;
            case 5:
                deskripsiBbhu = "PPT";
                break;
            case 6:
                deskripsiBbhu = "NV";
                break;
            case 7:
                deskripsiBbhu = "CV";
                break;
            case 8:
                deskripsiBbhu = "Firma";
                break;
            case 9:
                deskripsiBbhu = "Koperasi/KUD";
                break;
            case 10:
                deskripsiBbhu = "Yayasan";
                break;
        }
    }

    public DPP getDpp() {
        return dpp;
    }

    public void setDpp(DPP dpp) {
        this.dpp = dpp;
    }

    public Subsektor getSubsektor() {
        return subsektor;
    }

    public void setSubsektor(Subsektor subsektor) {
        this.subsektor = subsektor;
    }

    public String getUsahaUtama() {
        return usahaUtama;
    }

    //set Keterangan Kode Jenis Usaha Utama
    public void setUsahaUtama(String usahaUtama) {
        this.usahaUtama = usahaUtama;
        switch (this.usahaUtama) {
            case "1":
                this.deskripsiUsahaUtama = "Padi/palawija";
                break;
            case "2":
                this.deskripsiUsahaUtama = "Holtikultura";
                break;
            case "3a":
                this.deskripsiUsahaUtama = "Perkebunan Kakao/cokelat";
                break;
            case "3b":
                this.deskripsiUsahaUtama = "Perkebunan Karet";
                break;
            case "3c":
                this.deskripsiUsahaUtama = "Perkebunan Kelapa sawit";
                break;
            case "3d":
                this.deskripsiUsahaUtama = "Perkebunan Kopi";
                break;
            case "3e":
                this.deskripsiUsahaUtama = "Perkebunan Teh";
                break;
            case "3f":
                this.deskripsiUsahaUtama = "Perkebunan Tebu";
                break;
            case "3g":
                this.deskripsiUsahaUtama = "Perkebunan Tembakau";
                break;
            case "3h":
                this.deskripsiUsahaUtama = "Perkebunan Cengkeh";
                break;
            case "3i":
                this.deskripsiUsahaUtama = "Perkebunan Kelapa";
                break;
            case "3j":
                this.deskripsiUsahaUtama = "Perkebunan Lada";
                break;
            case "3k":
                this.deskripsiUsahaUtama = "Tanaman Perkebunan Lainnya";
                break;
            case "4":
                this.deskripsiUsahaUtama = "HPH/IUPHHK-HA";
                break;
            case "5":
                this.deskripsiUsahaUtama = "HPHT/IUPHHK-HT/Perhutani/Kehutanan lainnya";
                break;
            case "6":
                this.deskripsiUsahaUtama = "Penangkaran STL";
                break;
            case "7a":
                this.deskripsiUsahaUtama = "Budidaya Udang";
                break;
            case "7b":
                this.deskripsiUsahaUtama = "Budidaya Bandeng";
                break;
            case "7c":
                this.deskripsiUsahaUtama = "Budidaya Ikan lainnya di tambak";
                break;
            case "7d":
                this.deskripsiUsahaUtama = "Budidaya Ikan di laut";
                break;
            case "7e":
                this.deskripsiUsahaUtama = "Budidaya Ikan di air tawar";
                break;
            case "7f":
                this.deskripsiUsahaUtama = "Budidaya Pembenihan";
                break;
            case "8":
                this.deskripsiUsahaUtama = "Penangkapan Ikan";
                break;
            case "9":
                this.deskripsiUsahaUtama = "Ternak Sapi Perah";
                break;
            case "11":
                this.deskripsiUsahaUtama = "Unggas";
                break;
            default:
                this.deskripsiUsahaUtama = "Deskripsi belum disetel";
        }
    }

    @Override
    public String toString() {
        return 
                "\nPerusahaan {" + 
                "\nKode Wilayah\t= " + kodeWilayah + 
                "\nNama\t\t= " + nama + 
                "\nAlamat\t\t= " + alamat + 
                "\nNo Tel\t\t= " + noTelp + 
                "\nBBHU\t\t= " + bbhu + 
                "\nDPP\t\t= " + dpp + 
                "\nSubsektor\t= " + subsektor + 
                "\nUsaha Utama\t= " + usahaUtama + 
                "\nFaksimile\t= " + faksimili + 
                "\nDeskripsi BBHU\t= " + deskripsiBbhu + 
                "\nDeskripsi Usaha Utama = " + deskripsiUsahaUtama + "\n}\n";
    }
}
