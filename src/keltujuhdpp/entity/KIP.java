package keltujuhdpp.entity;

import java.util.ArrayList;
import java.util.List;
import keltujuhdpp.form.KuesionerDPP;

/**
 *
 * @author Asus
 */
public class KIP {

    private String kju;
    private Integer noUrut;
    private KodeProv kodeProv;
    private KodeKab kodeKab;
    private KodeKec kodeKec;

    public KIP() {
    }

    public KIP(KodeProv kodeProv, KodeKab kodeKab) {
        this.kodeProv = kodeProv;
        this.kodeKab = kodeKab;
    }

    public String getKju() {
        return kju;
    }

    public void setKju(String kju) {
        this.kju = kju;
    }

    public Integer getNoUrut() {
        return noUrut;
    }

    public void setNoUrut(Integer noUrut) {
        this.noUrut = noUrut;
    }

    public KodeProv getKodeProv() {
        return kodeProv;
    }
    
    public void setKodeProv(KodeProv kodeProv) {
        this.kodeProv = kodeProv;
    }

    public void setKodeKab(KodeKab kodeKab) {    
        this.kodeKab = kodeKab;
    }

    public KodeKab getKodeKab() {
        return kodeKab;
    }

    public KodeKec getKodeKec() {
        return kodeKec;
    }

    public void setKodeKec(KodeKec kodeKec) {
        this.kodeKec = kodeKec;
    }

    public KIP(String kju, Integer noUrut, KodeProv kodeProv, KodeKab kodeKab, KodeKec kodeKec) {
        this.kju = kju;
        this.noUrut = noUrut;
        this.kodeKec = kodeKec;
    }

    @Override
    public String toString() {
        return "KIP{" + "kju=" + kju + ", noUrut=" + noUrut + ", kodeProv=" + kodeProv + ", kodeKab=" + kodeKab + ", kodeKec=" + kodeKec + '}';
    }

}