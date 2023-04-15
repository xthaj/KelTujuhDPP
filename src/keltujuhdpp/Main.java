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

/**
 *
 * @author Kelompok Dua
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        
        
//        INI BARU DEKLARASI WILAYAH
        KodeProv papua = new KodeProv();
        papua.setKode("94");
        papua.setNama("PAPUA");

        KodeKab deiyai = new KodeKab();
        deiyai.setKode("36");
        deiyai.setNama("DEIYAI");

        KodeKec kapiraya = new KodeKec("010", "KAPIRAYA");
        KodeKec tigiBarat = new KodeKec("020", "TIGI BARAT");
        KodeKec tigi = new KodeKec("030", "TIGI");
        KodeKec tigiTimur = new KodeKec("040", "TIGI TIMUR");
        KodeKec bowobado = new KodeKec("050", "BOWOBADO");

        deiyai.addKodeKec(kapiraya);
        deiyai.addKodeKec(tigiBarat);
        deiyai.addKodeKec(tigi);
        deiyai.addKodeKec(tigiTimur);
        deiyai.addKodeKec(bowobado);

        KodeKab yalimo = new KodeKab("32", "YALIMO");
        KodeKec welarek = new KodeKec("010", "WELAREK");
        KodeKec apalapsili = new KodeKec("020", "APALAPSILI");
        KodeKec abenaho = new KodeKec("030", "ABNAHO");
        KodeKec elelim = new KodeKec("040", "ELELIM");
        KodeKec benawa = new KodeKec("050", "BENAWA");

        yalimo.addKodeKec(welarek);
        yalimo.addKodeKec(apalapsili);
        yalimo.addKodeKec(abenaho);
        yalimo.addKodeKec(elelim);
        yalimo.addKodeKec(benawa);

        papua.addKodeKab(deiyai);
        papua.addKodeKab(yalimo);
        
        
        
        
        
//        INI MULAI MENGISI KUESIONER
        KuesionerDPP kuesionerDeiyai = new KuesionerDPP();
        kuesionerDeiyai.setKodeProv(papua);
        kuesionerDeiyai.setKodeKab(deiyai);
        kuesionerDeiyai.setPeriodeData(2022);

//        Membuat perusahaan 1
        Perusahaan perusahaan1 = new Perusahaan();
        KIP kip1 = new KIP(kuesionerDeiyai.getKodeProv(), kuesionerDeiyai.getKodeKab());

        kip1.setKodeKec(tigiTimur);
        kip1.setKju("1");
        kip1.setNoUrut(1);
        
        perusahaan1.setKodeWilayah(kip1);
        perusahaan1.setNama("MAKMUR SEJAHTERA HAYUUUK");
        perusahaan1.setAlamat("Jalan Kenangan penuh luka");
        perusahaan1.addNoTelp("(021) 350093");
        perusahaan1.setFaksimili("(021) 3500990993");
        perusahaan1.setBbhu(11);

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

        kuesionerDeiyai.addPerusahaan(perusahaan1);
        System.out.println(perusahaan1);

//        Membuat perusahaan 2
        Perusahaan perusahaan2 = new Perusahaan();
        KIP kip2 = new KIP(kuesionerDeiyai.getKodeProv(), kuesionerDeiyai.getKodeKab());
        
        kip2.setKodeKec(tigiBarat);
        kip2.setKju("2");
        kip2.setNoUrut(4);

        perusahaan2.setKodeWilayah(kip2);
        perusahaan2.setNama("WAKWAW BAHAGIA SENTOSA");
        perusahaan2.setAlamat("Jalan Kenangan penuh kebahagiaan bersamanya");
        perusahaan2.addNoTelp("(021) 350093");
        perusahaan2.setFaksimili("(021) 350093");
        perusahaan2.setBbhu(10);

        Subsektor subsektor2 = new Subsektor();
        subsektor2.setHortikultura(0);
        subsektor2.setKehutanan(0);
        subsektor2.setKodePerkebunan("0");
        subsektor2.setPerikanan(0);
        subsektor2.setPeternakan(0);
        subsektor2.setTanamPangan(0);
        
        perusahaan2.setDpp(dpp1);
        perusahaan2.setSubsektor(subsektor2);
        perusahaan2.setUsahaUtama("3d");

        kuesionerDeiyai.addPerusahaan(perusahaan2);
        System.out.println(perusahaan2);
        
//        Membuat perusahaan 3
        Perusahaan perusahaan3 = new Perusahaan();

        perusahaan3.setKodeWilayah(kip2);
        perusahaan3.setNama("WAKWAW BAHAGIA SENTOSA");
        perusahaan3.setAlamat("Jalan Kenangan penuh kebahagiaan bersamanya");
        perusahaan3.addNoTelp("(021) 350093");
        perusahaan3.setFaksimili("(021) 350093");
        perusahaan3.setBbhu(10);

        perusahaan3.setDpp(dpp1);
        perusahaan3.setSubsektor(subsektor2);
        perusahaan3.setUsahaUtama("3d");

        kuesionerDeiyai.addPerusahaan(perusahaan3);
        System.out.println(perusahaan3);
        
        kuesionerDeiyai.validate();
        kuesionerDeiyai.addPerusahaan(perusahaan2);
        
        System.out.println(kuesionerDeiyai.getTotalPerusahaan());
        
        kuesionerDeiyai.cekDuplikasi();
        kuesionerDeiyai.cekDuplikasiGiani();

    }

}