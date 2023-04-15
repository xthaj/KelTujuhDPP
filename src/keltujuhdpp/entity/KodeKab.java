package keltujuhdpp.entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class KodeKab implements Kode {

    private String kode;
    private String nama;
//    private Integer noUrut;
    private List<KodeKec> listKodeKec = new ArrayList<KodeKec>();

    public KodeKab(String kode, String nama) {
        this.setKode(kode);
        this.setNama(nama);
//        this.noUrut=0;
    }

    public KodeKab() {
//        this.noUrut=0;
    }

    @Override
    public String getKode() {
        return kode;
    }

    @Override
    public void setKode(String kode) {
        this.kode = kode;
    }

    @Override
    public String getNama() {
        try {
            return nama.toUpperCase(); 
        } catch (Exception e) {
            return "Belum tersedia";
        }
    }

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

//    public Integer getNoUrut() {
//        return noUrut;
//    }
//
//    public void setNoUrut(Integer noUrut) {
//        this.noUrut = noUrut;
//    }

    public List<KodeKec> getListKodeKec() {
        return listKodeKec;
    }

    public void addKodeKec(KodeKec kodeKec) {
        this.listKodeKec.add(kodeKec);
    }

    @Override
    public String toString() {
        return "KodeKab{" + "kode=" + kode + ", nama=" + nama + '}';
    }

}