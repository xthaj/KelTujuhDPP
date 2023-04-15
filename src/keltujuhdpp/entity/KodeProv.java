package keltujuhdpp.entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class KodeProv implements Kode {

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

    @Override
    public String getKode() {
        return kode;
    }

    @Override
    public void setKode(String kode) {
       this.kode = kode;
    }

    public List<KodeKab> getListKodeKab() {
        return listKodeKab;
    }

    public void addKodeKab(KodeKab kodeKab) {
        this.listKodeKab.add(kodeKab);
    }

    @Override
    public String toString() {
        return "KodeProv{" + "nama=" + nama + ", kode=" + kode + '}';
    }

}