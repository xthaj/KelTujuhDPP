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

public class KodeProv extends Kode {

    private String nama;
    private String kode;
    private List<KodeKab> listKodeKab = new ArrayList<KodeKab>();

    public KodeProv(String nama, String kode) {
        this.setKode(kode);
        this.setNama(nama);
    }

    public KodeProv() {

    }
   @Override
   public void validasiNama(String nama) throws Exception {
        if (nama.matches("[^a-z|^A-Z|^ ]")|nama.matches(".*[0-9].*")) {
            throw new Exception("Error : Nama Provinsi harus berupa huruf");
        } else {
            this.nama = nama.toUpperCase();
        }
    }

    @Override
    public void validasiKode(String kode) throws Exception {
        //Validasi input harus berupa  string dengan nilai angka
        if (!kode.matches("[0-9]*")) {
            throw new Exception("Error : Kode Provinsi harus berupa angka");
        } else {
            this.kode = kode;
        }
    }

    public String getKode() {
        return kode;
    }

    public List<KodeKab> getListKodeKab() {
        return listKodeKab;
    }

    public void addKodeKab(KodeKab kodeKab) {
        this.listKodeKab.add(kodeKab);
    }

    @Override
    public String toString() {
        return 
                "KodeProv {" + 
                "\n\t\t\t\t  Kode\t= " + kode + 
                "\n\t\t\t\t  Nama\t= " + nama + 
                "\n\t\t\t\t  }";
    }
}
