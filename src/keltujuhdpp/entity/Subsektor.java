/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keltujuhdpp.entity;

/*
Kelompok 7
222111930 Atha JR
222111938 Azhari
222111971 Cindy Septia Trionita
222112085 Hamdani
222112212 Muhammad Fauzan Azima. A
*/
public class Subsektor {

    private Integer tanamPangan, hortikultura, peternakan, kehutanan, perikanan;
    private String kodePerkebunan, jenisPerkebunan;

//Subsektor Tanaman Pangan
    public Integer getTanamPangan() {
        return tanamPangan;
    }

    public void setTanamPangan(Integer tanamPangan) {
        this.tanamPangan=tanamPangan;
    }

//Subsektor Hortikultura
    public Integer getHortikultura() {
        return hortikultura;
    }

    public void setHortikultura(Integer hortikultura) {
        this.hortikultura=hortikultura;
    }

//Subsektor Perkebunan
    public String getJenisPerkebunan(){
        return jenisPerkebunan;
    }
    public String getKodePerkebunan() {
        return kodePerkebunan;
    }

    public void setKodePerkebunan(String kodePerkebunan) {
        this.kodePerkebunan = kodePerkebunan;
        switch (this.kodePerkebunan) {
            case "3a" ->
                this.jenisPerkebunan = "Kakao/Cokelat";
            case "3b" ->
                this.jenisPerkebunan = "Karet";
            case "3c" ->
                this.jenisPerkebunan = "Kelapa Sawit";
            case "3d" ->
                this.jenisPerkebunan = "Kopi";
            case "3e" ->
                this.jenisPerkebunan = "Teh";
            case "3f" ->
                this.jenisPerkebunan = "Tebu";
            case "3g" ->
                this.jenisPerkebunan = "Tembakau";
            case "3h" ->
                this.jenisPerkebunan = "Cengkeh";
            case "3i" ->
                this.jenisPerkebunan = "Kelapa";
            case "3j" ->
                this.jenisPerkebunan = "Lada";
            case "3k" ->
                this.jenisPerkebunan = "Tanaman lainnya";
            case "0" ->
                this.jenisPerkebunan = "Tidak Ada";
            default ->
                this.jenisPerkebunan = "Kode Perkebunan Salah";
        }
    }

//Subsektor Peternakan
    public Integer getPeternakan() {
        return peternakan;
    }

    public void setPeternakan(Integer peternakan) {
        this.peternakan=peternakan;
    }

//Subsektor Kehutanan
    public Integer getKehutanan() {
        return kehutanan;
    }

    public void setKehutanan(Integer kehutanan) {
        this.kehutanan=kehutanan;
    }

//Subsektor Perikanan
    public Integer getPerikanan() {
        return perikanan;
    }

    public void setPerikanan(Integer perikanan) {
        this.perikanan=perikanan;
    }
    
    public Integer validasiId(Integer kode) throws Exception {
        if (kode == 0 || kode == 1) {
            return kode;
        } else {
            throw new Exception("Kode yang diinput salah, hanya boleh menginput kode 0 atau 1");
        }
    }
    
    @Override
    public String toString() {
        return "Subsektor {" + 
                "\n\t\t  Tanaman Pangan\t= " + tanamPangan + 
                "\n\t\t  Hortikultura\t\t= " + hortikultura +
                "\n\t\t  Kode Perkebunan\t= " + kodePerkebunan + 
                "\n\t\t  Jenis Perkebunan\t= " + jenisPerkebunan +
                "\n\t\t  Peternakan\t\t= " + peternakan + 
                "\n\t\t  Kehutanan\t\t= " + kehutanan + 
                "\n\t\t  Perikanan\t\t= " + perikanan + "\n\t\t  }";
    }

}

