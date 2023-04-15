package keltujuhdpp.entity;

/**
 *
 * @author Giani
 */
public class Subsektor {

    private Integer tanamPangan, hortikultura, peternakan, kehutanan, perikanan;
    private String kodePerkebunan, jenisPerkebunan;

    @Override
    public String toString() {
        return "Subsektor{" + "tanamPangan=" + tanamPangan + ", hortikultura=" + hortikultura + ", peternakan=" + peternakan + ", kehutanan=" + kehutanan + ", perikanan=" + perikanan + ", kodePerkebunan=" + kodePerkebunan + ", jenisPerkebunan=" + jenisPerkebunan + '}';
    }

    public Integer getHortikultura() {
        return hortikultura;
    }

    public void setHortikultura(Integer hortikultura) {
        this.hortikultura = hortikultura;
    }

    public Integer getTanamPangan() {
        return tanamPangan;
    }

    public void setTanamPangan(Integer tanamPangan) {
        this.tanamPangan = tanamPangan;
    }

    public Integer getPeternakan() {
        return peternakan;
    }

    public void setPeternakan(Integer peternakan) {
        this.peternakan = peternakan;
    }

    public Integer getKehutanan() {
        return kehutanan;
    }

    public void setKehutanan(Integer kehutanan) {
        this.kehutanan = kehutanan;
    }

    public Integer getPerikanan() {
        return perikanan;
    }

    public void setPerikanan(Integer perikanan) {
        this.perikanan = perikanan;
    }

//    public Integer getTanamPangan() {
//        if (tanamPangan == 0 || tanamPangan == 1) {
//            return tanamPangan;
//        } else {
//            System.out.println("Kode Tanam Pangan belum diset");
//        }
//        return null;
//    }
//
//    public void setTanamPangan(Integer tanamPangan) {
//        try {
//            this.tanamPangan = validasiId(tanamPangan);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public Integer getPeternakan() {
//        if (peternakan == 0 || peternakan == 1) {
//            return peternakan;
//        } else {
//            System.out.println("Kode Peternakan belum diset");
//        }
//        return null;
//    }
//
//    public void setPeternakan(Integer peternakan) {
//        try {
//            this.peternakan = validasiId(peternakan);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public Integer getKehutanan() {
//        if (kehutanan == 0 || kehutanan == 1) {
//            return kehutanan;
//        } else {
//            System.out.println("Kode Kehutanan belum diset");
//        }
//        return null;
//    }
//
//    public void setKehutanan(Integer kehutanan) {
//        try {
//            this.kehutanan = validasiId(kehutanan);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public Integer getPerikanan() {
//        if (perikanan == 0 || perikanan == 1) {
//            return perikanan;
//        } else {
//            System.out.println("Kode Perikanan belum diset");
//        }
//        return null;
//    }
//
//    public void setPerikanan(Integer perikanan) {
//        try {
//            this.perikanan = validasiId(perikanan);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
    public Integer validasiId(Integer kode) throws Exception {
        if (kode == 0 || kode == 1) {
            return kode;
        } else {
            throw new Exception("Kode Salah");
        }
    }

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

}
