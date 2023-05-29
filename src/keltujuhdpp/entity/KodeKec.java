/*
Kelompok 7
222111930 Atha JR
222111938 Azhari
222111971 Cindy Septia Trionita
222112085 Hamdani
222112212 Muhammad Fauzan Azima. A
*/

package keltujuhdpp.entity;

public class KodeKec extends Kode {

    private String kode;
    private String nama;

    public KodeKec() {
    }

    public KodeKec(String kode, String nama) {
        this.setKode(kode);
        this.setNama(nama);
    }

    public String getKode() {
        return kode;
    }
    @Override
    public void validasiKode(String kode) throws Exception {
        //Validasi input harus berupa  string dengan nilai angka
        if (!kode.matches("[0-9]*")) {
            throw new Exception("Error : Kode Kecamatan harus berupa angka");
        } else {
            this.kode = kode;
        }
    }

    @Override
    public void validasiNama(String nama) throws Exception {
        if (nama.matches("[^a-z|^A-Z|^ ]")|nama.matches(".*[0-9].*")) {
            throw new Exception("Error : Nama Kecamatan harus berupa huruf");
        } else {
            this.nama = nama.toUpperCase();
        }
    }

    @Override
    public String toString() {
        return 
                "KodeKec {" + 
                "\n\t\t\t\t  Kode\t= " + kode + 
                "\n\t\t\t\t  Nama\t= " + nama + 
                "\n\t\t\t\t  }";
    }
}
