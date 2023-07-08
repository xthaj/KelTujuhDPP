/*
Kelompok 7
222111930 Atha JR
222111938 Azhari
222111971 Cindy Septia Trionita
222112085 Hamdani
222112212 Muhammad Fauzan Azima. A
*/

package keltujuhdpp;

import java.util.List;
import keltujuhdpp.entity.DPP;
import keltujuhdpp.entity.KIP;
import keltujuhdpp.entity.KodeKab;
import keltujuhdpp.entity.KodeKec;
import keltujuhdpp.entity.KodeProv;
import keltujuhdpp.entity.Perusahaan;
import keltujuhdpp.entity.Subsektor;
import keltujuhdpp.form.KuesionerDPP;

public class Main {

    public static void main(String[] args) {
        
        KodeProv sumbar = new KodeProv();
        sumbar.setKode("13");
        sumbar.setNama("SUMATERA BARAT");
        
        KodeKab pasaman = new KodeKab();
        pasaman.setKode("09");
        pasaman.setNama("PASAMAN");
        sumbar.addKodeKab(pasaman);
        KodeKec bonjol = new KodeKec("070", "BONJOL");
        KodeKec lubuksikaping = new KodeKec("080", "LUBUK SIKAPING");
        KodeKec duakoto = new KodeKec("100", "DUA KOTO");
        KodeKec panti = new KodeKec("110", "PANTI");
        KodeKec rao = new KodeKec("121", "RAO");

        pasaman.addKodeKec(lubuksikaping);
        pasaman.addKodeKec(duakoto);
         pasaman.addKodeKec(panti);
//        pasaman.addKodeKec(rao);
        pasaman.addKodeKec(bonjol);
        
//PENGISIAN KUESIONER

        KuesionerDPP kuesionerPasaman = new KuesionerDPP();
        kuesionerPasaman.setKodeProv(sumbar);
        kuesionerPasaman.setKodeKab(pasaman);
        kuesionerPasaman.setPeriodeData(2022);

//PERUSAHAAN 1
        Perusahaan perusahaan1 = new Perusahaan();
        KIP kip1 = new KIP(kuesionerPasaman.getKodeProv(), kuesionerPasaman.getKodeKab());

        kip1.setKodeKec(rao);
        kip1.setKju("1");
        kip1.setNoUrut(1);
        
        perusahaan1.setKodeWilayah(kip1);
        perusahaan1.setNama("PERUSAHAAN NORMAL 1");
        perusahaan1.setAlamat("Jalan Contoh 1");
        perusahaan1.addNoTelp("02123456678");
        perusahaan1.setFaksimili("02345673456");
        perusahaan1.setBbhu(9);

        DPP dpp1 = new DPP();
        dpp1.setKunjungan(1);
        dpp1.setStatus(1);

        perusahaan1.setDpp(dpp1);

        Subsektor subsektor1 = new Subsektor();
        subsektor1.setTanamPangan(1);
        subsektor1.setHortikultura(1);
        subsektor1.setKehutanan(1);
        subsektor1.setPerikanan(1);
        subsektor1.setPeternakan(1);
        subsektor1.setKodePerkebunan("3b");

        perusahaan1.setSubsektor(subsektor1);
        perusahaan1.setUsahaUtama("3c");

        kuesionerPasaman.addPerusahaan(perusahaan1);
        System.out.println(perusahaan1);

//PERUSAHAAN 2 
        Perusahaan perusahaan2 = new Perusahaan();
        KIP kip2 = new KIP(kuesionerPasaman.getKodeProv(), kuesionerPasaman.getKodeKab());
        
        kip2.setKodeKec(bonjol);
        kip2.setKju("2");
        kip2.setNoUrut(4);

        perusahaan2.setKodeWilayah(kip2);
        perusahaan2.setNama("PERUSAHAAN NORMAL 2");
        perusahaan2.setAlamat("Jalan Contoh 2");
        perusahaan2.addNoTelp("&223350093");
        perusahaan2.setFaksimili("(021)67350093");
        perusahaan2.setBbhu(10);

        Subsektor subsektor2 = new Subsektor();
        subsektor2.setHortikultura(0);
        subsektor2.setKehutanan(1);
        subsektor2.setKodePerkebunan("0");
        subsektor2.setPerikanan(0);
        subsektor2.setPeternakan(0);
        subsektor2.setTanamPangan(0);
        
        perusahaan2.setDpp(dpp1);
        perusahaan2.setSubsektor(subsektor2);
        perusahaan2.setUsahaUtama("3d");

        kuesionerPasaman.addPerusahaan(perusahaan2);
        System.out.println(perusahaan2);
        
        kuesionerPasaman.validate();
        
//        System.out.println("Data diubah agar sesuai dengan peraturan");
        
//        ??
//        perusahaan1.setBbhu(5);
//        System.out.println(perusahaan1);
//        kuesionerPasaman.validate();

//        pasaman.addKodeKec(bonjol);
//        kuesionerPasaman.validate();
        

        kuesionerPasaman.getTotalPerusahaan();
        
        kuesionerPasaman.cekDuplikasi();
    }

}