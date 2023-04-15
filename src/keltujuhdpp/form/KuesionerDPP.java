package keltujuhdpp.form;

import java.util.ArrayList;
import java.util.List;

import keltujuhdpp.entity.KodeKab;
import keltujuhdpp.entity.KodeKec;
import keltujuhdpp.entity.KodeProv;
import keltujuhdpp.entity.Perusahaan;
import keltujuhdpp.entity.Subsektor;

/**
 *
 * @author Asus
 */
public class KuesionerDPP extends Form {

    private KodeProv kodeProv;
    private KodeKab kodeKab;
    private int periodeData;
    private int jumlahPerusahaan;
    private List<Perusahaan> listPerusahaan = new ArrayList<Perusahaan>();

    public KuesionerDPP() {
    }

    public KuesionerDPP(KodeProv kodeProv, KodeKab kodeKab) {
        this.kodeProv = kodeProv;
        this.kodeKab = kodeKab;
    }

    public KodeProv getKodeProv() {
        return kodeProv;
    }

    public KodeKab getKodeKab() {
        return kodeKab;
    }

    public void setKodeProv(KodeProv kodeProv) {
        this.kodeProv = kodeProv;
    }

    public void setKodeKab(KodeKab kodeKab) {
        this.kodeKab = kodeKab;
    }

    public int getPeriodeData() {
        return periodeData;
    }

    public void setPeriodeData(int periodeData) {
        try {
            this.periodeData = periodeData;
        } catch (Exception e) {
            super.addErrorMessages("Periode data kuesioner belum benar");
        }
    }

    public List<Perusahaan> getListPerusahaan() {
        return listPerusahaan;
    }

    public void addPerusahaan(Perusahaan perusahaan) {
        jumlahPerusahaan++;
        this.listPerusahaan.add(perusahaan);
    }

    public int totalPerusahaan() {
        return listPerusahaan.size();
    }

//    METHOD METHOD VALIDASI
    public boolean validateKodeKec(List<KodeKec> listKodeKec, KodeKec kodeKec) {
        List<KodeKec> kode_kecamatan = new ArrayList<KodeKec>();
        kode_kecamatan = listKodeKec;
        for (int i = 0; i < kode_kecamatan.size(); i++) {
            if (kode_kecamatan.get(i) == kodeKec) {
                return true;
            }
        }
        return false;
    }

    public Boolean cekKonten(Subsektor subsektor) {
        return (subsektor.getTanamPangan() == 0 && subsektor.getHortikultura() == 0 && subsektor.getPeternakan() == 0
                && subsektor.getKehutanan() == 0 && subsektor.getPerikanan() == 0 && "0".equals(subsektor.getKodePerkebunan()));
    }

    public boolean validasiNolSatu(int x) {
        return x != 0 && x != 1;
    }

    private boolean cekDuplikasiDuaPerusahaan(Perusahaan perusahaan1, Perusahaan perusahaan2) {
        return (perusahaan1.getAlamat().equals(perusahaan2.getAlamat()) && perusahaan1.getBbhu() == perusahaan2.getBbhu() &&
                perusahaan1.getDpp() == perusahaan2.getDpp() && perusahaan1.getFaksimili().equals(perusahaan2.getFaksimili()) 
                && perusahaan1.getKodeWilayah() == perusahaan2.getKodeWilayah() && perusahaan1.getNama().equals(perusahaan2.getNama()) 
                && perusahaan1.getNoTelp() == perusahaan2.getNoTelp() && perusahaan1.getSubsektor() == perusahaan2.getSubsektor() 
                && perusahaan1.getUsahaUtama().equals(perusahaan2.getUsahaUtama()));
    }

    public boolean cekDuplikasi() {
        if (this.listPerusahaan.size() > 1) {
            for (int i = 0; i < this.listPerusahaan.size() - 1; i++) {
                if (cekDuplikasiDuaPerusahaan(this.listPerusahaan.get(i), this.listPerusahaan.get(i + 1))) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }
    
    public void cekDuplikasiGiani(){
        for (int i = 0; i < listPerusahaan.size(); i++) {
            if (i!=0){
                if (listPerusahaan.get(i-1) == listPerusahaan.get(i))
                    super.addErrorMessages("Data Perusahaan "+(i-1)+" dengan Perusahaan "+i+" sama");
            }
            
        }
    }

    @Override
    public void validate() {
        int i;
        String[] kumpulanKebun = {"3a", "3b", "3c", "3d", "3e", "3f", "3g", "3h", "3i", "3j", "3k", "0"};
        String[] listUsahaUtama = {"1", "2", "3a", "3b", "3c", "3d", "3e", "3f", "3g", "3h", "3i", "3j", "3k", "4", "5", "6", "7a", "7b", "7c", "7d", "7e", "7f", "8", "9", "10", "11"};

        for(int j=0; j<this.listPerusahaan.size();j++){
            if (this.periodeData > 9999 | this.periodeData < 0) {
                super.addErrorMessages("Periode data kuesioner belum benar");
            }

            if (kodeProv.getNama().matches("[^a-z|^A-Z|^ ]")) {
                super.addErrorMessages("Nama Provinsi belum benar");
            }

            if (!kodeProv.getKode().matches("[0-9]*")) {
                super.addErrorMessages("Kode Provinsi belum benar");
            }

            if (kodeKab.getNama().matches("[^a-z|^A-Z|^ ]")) {
                super.addErrorMessages("Nama Kabupaten belum benar");
            }

            if (!kodeKab.getKode().matches("[0-9]*")) {
                super.addErrorMessages("Kode Kabupaten belum benar");
            }

            if (listPerusahaan.get(j).getKodeWilayah().getKodeKec().getKode().matches("[^a-z|^A-Z|^ ]")) {
                super.addErrorMessages("Nama Kecamatan belum benar");
            }
            if (!listPerusahaan.get(j).getKodeWilayah().getKodeKec().getKode().matches("[0-9]*")) {
                super.addErrorMessages("Kode Kecamatan belum benar");
            }

    //        validasi faksimili
            if (listPerusahaan.get(j).getFaksimili().length() > 15) {
                super.addErrorMessages("Nomor Faksimili Perusahaan "+listPerusahaan.get(j).getNama()+" belum benar");
            }

    //        validasi no telp
            for (i = 0; i < listPerusahaan.get(j).getNoTelp().size(); i++) {
                if (listPerusahaan.get(j).getNoTelp().get(i).length() > 15) {
                    super.addErrorMessages("Nomor Telepon Perusahaan "+listPerusahaan.get(j).getNama()+" belum benar");
                }
            }

    //        validasi bbhu
            if (this.listPerusahaan.get(j).getBbhu() < 1 || listPerusahaan.get(j).getBbhu() > 10) {
                super.addErrorMessages("BBHU Perusahaan "+listPerusahaan.get(j).getNama()+" belum benar");
            }

    //        validasi usaha utama
            for (i = 0; i < listUsahaUtama.length; i++) {
                if (listPerusahaan.get(j).getUsahaUtama().equals(listUsahaUtama[i])) {
                    break;
                }
            }
            if (i == listUsahaUtama.length) {
                super.addErrorMessages("Kode Usaha Utama Perusahaan "+listPerusahaan.get(j).getNama()+" belum benar");
            }
            i = 0;

    //        validasi kode kabupaten apakah ada dalam kode provinsi
            List<KodeKab> listKodeKab = listPerusahaan.get(j).getKodeWilayah().getKodeProv().getListKodeKab();
            KodeKab kodeKabCheck = listPerusahaan.get(j).getKodeWilayah().getKodeKab();
            for (i = 0; i < listKodeKab.size(); i++) {
                if (listKodeKab.get(i) == kodeKabCheck) {
                    break;
                }
            }
            if (i == listKodeKab.size()) { // iterasi maksimum terpenuhi, berarti kode kabupaten tidak sesuai
                super.addErrorMessages("Kode Kecamatan Perusahaan "+listPerusahaan.get(j).getNama()+" belum sesuai");
            }
            i = 0;

    //        validasi kode kecamatan apakah ada dalam kode kabpaten
            List<KodeKec> listKodeKec = listPerusahaan.get(j).getKodeWilayah().getKodeKab().getListKodeKec();
            KodeKec kodeKecCheck = listPerusahaan.get(j).getKodeWilayah().getKodeKec();
            for (i = 0; i < listKodeKec.size(); i++) {
                if (listKodeKec.get(i) == kodeKecCheck) {
                    break;
                }
            }
            if (i == listKodeKec.size()) {
                super.addErrorMessages("Kode Kecamatan Perusahaan "+listPerusahaan.get(j).getNama()+" belum sesuai");
            }
            i = 0;

    //        validasi status DPP
            if (listPerusahaan.get(j).getDpp().getStatus() < 1 | listPerusahaan.get(j).getDpp().getStatus() > 9) {
                super.addErrorMessages("Input Status Perusahaan "+listPerusahaan.get(j).getNama()+" salah, harus di rentang 1-9");
            }

    //        validasi kunjungan DPP
            if (validasiNolSatu(listPerusahaan.get(j).getDpp().getKunjungan())) {
                super.addErrorMessages("Input Status Kunjungan Perusahaan "+listPerusahaan.get(j).getNama()+" harus antara 0 dan 1");
            }

    //        validasi Subsektor
            if (validasiNolSatu(listPerusahaan.get(j).getSubsektor().getHortikultura())) {
                super.addErrorMessages("Status Hortikultura Perusahaan "+listPerusahaan.get(j).getNama()+" belum benar");
            }

            if (validasiNolSatu(listPerusahaan.get(j).getSubsektor().getPerikanan())) {
                super.addErrorMessages("Status Perikanan Perusahaan "+listPerusahaan.get(j).getNama()+" belum benar");
            }

            if (validasiNolSatu(listPerusahaan.get(j).getSubsektor().getPeternakan())) {
                super.addErrorMessages("Status Peternakan Perusahaan "+listPerusahaan.get(j).getNama()+" belum benar");
            }

            if (validasiNolSatu(listPerusahaan.get(j).getSubsektor().getKehutanan())) {
                super.addErrorMessages("Status Kehutanan Perusahaan "+listPerusahaan.get(j).getNama()+" belum benar");
            }

            if (validasiNolSatu(listPerusahaan.get(j).getSubsektor().getTanamPangan())) {
                super.addErrorMessages("Status Tanam Pangan Perusahaan "+listPerusahaan.get(j).getNama()+" belum benar");
            }

            if (cekKonten(listPerusahaan.get(j).getSubsektor())) {
                super.addErrorMessages("Perusahaan " + listPerusahaan.get(j).getNama() + " minimal harus mempunyai satu subsektor");
            }

    //        validasi perkebunan
            for (i = 0; i < kumpulanKebun.length; i++) {
                if (listPerusahaan.get(j).getSubsektor().getKodePerkebunan().equals(kumpulanKebun[i])) {
                    break;
                }
            }
            if (i == kumpulanKebun.length) {
                super.addErrorMessages("Kode Perkebunan Perusahaan "+listPerusahaan.get(j).getNama()+" belum benar");
            }
            i = 0;
            
            if(cekDuplikasi()){
                super.addErrorMessages("");
            }
            
//            Tambahkan validasi baru di bawah sini

        }
        
        if(super.getErrorMessages().isEmpty()){
            System.out.println("Berhasil disimpan");
        }
        else{
            List<String> errorMessages = this.getErrorMessages();
            
            System.out.println("Input invalid. Fix errors below:");
            for (String errorMessage : errorMessages) {
                System.out.println("- "+ errorMessage);
            }
        }
    }
       

    public int getTotalPerusahaan() {
        return this.getListPerusahaan().size();
    }
}
