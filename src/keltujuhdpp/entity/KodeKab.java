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

public class KodeKab extends Kode {

    private String kode;
    private String nama;

    private List<KodeKec> listKodeKec = new ArrayList<KodeKec>();

    public KodeKab(String kode, String nama) {
        this.setKode(kode);
        this.setNama(nama);
    }

    public KodeKab() {
    }

    public String getKode() {
        return kode;
    }
    @Override
    public void validasiKode(String kode) throws Exception {
        //Validasi input harus berupa string dengan nilai angka 
        if (!kode.matches("[0-9]*")) {
            
            throw new Exception("Error : Kode Kabupaten harus berupa angka");
        } else {
            this.kode = kode;
        }
    }

    @Override
    public void validasiNama(String nama) throws Exception {
        //Validasi input harus berupa string dengan nilai tidak boleh angka 
        if (nama.matches("[^a-z|^A-Z|^ ]")|nama.matches(".*[0-9].*")) {
            throw new Exception("Error : Nama Kabupaten harus berupa huruf");
        } else {
            this.nama = nama.toUpperCase();
        }
    }

    public List<KodeKec> getListKodeKec() {
        return listKodeKec;
    }

    public void addKodeKec(KodeKec kodeKec) {
        this.listKodeKec.add(kodeKec);
    }

    @Override
    public String toString() {
        return 
                "KodeKab {" + 
                "\n\t\t\t\t  Kode\t= " + kode + 
                "\n\t\t\t\t  Nama\t= " + nama + 
                "\n\t\t\t\t  }";
    }
}
