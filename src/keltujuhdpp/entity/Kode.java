/*
Kelompok 7
222111930 Atha JR
222111938 Azhari
222111971 Cindy Septia Trionita
222112085 Hamdani
222112212 Muhammad Fauzan Azima. A
*/

package keltujuhdpp.entity;

public abstract class Kode {
    private String nama;
    private String kode;
    
    public abstract void validasiNama(String nama)throws Exception;
    public abstract void validasiKode(String kode) throws Exception;
    
    public String getNama() {
        try {
            return nama.toUpperCase(); 
        } catch (Exception e) {
            return "Belum tersedia";
        }
    }
    

    public void setNama(String nama) {
        try {
            validasiNama(nama);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void setKode(String kode) {
        try {
            validasiKode(kode);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}