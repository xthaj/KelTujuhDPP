package keltujuhdpp.entity;

public class KodeKec implements Kode {

    private String kode;
    private String nama;

    public KodeKec() {
    }

    /**
     *
     * @param //kode
     * @param //nama
     */
    public KodeKec(String kode, String nama) {
        this.setKode(kode);
        this.setNama(nama);
    }

    @Override
    public String getKode() {
        return kode;
    }

    public void validasiKode(String kode) throws Exception {
        if (!kode.matches("[0-9]*")) {
            throw new Exception("Error : Kode harus berupa angka");
        } else {
            this.kode = kode;
        }
    }

    @Override
    public void setKode(String kode) {
        try {
            validasiKode(kode);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String getNama() {
        try {
            return nama.toUpperCase(); 
        } catch (Exception e) {
            return "Belum tersedia";
        }
    }

    public void validasiNama(String nama) throws Exception {
        if (nama.matches("[^a-z|^A-Z|^ ]")) {
            throw new Exception("Error : Nama harus berupa huruf");
        } else {
            this.nama = nama.toUpperCase();
        }
    }

    @Override
    public void setNama(String nama) {
        try {
            validasiNama(nama);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "KodeKec{" + "kode=" + kode + ", nama=" + nama + '}';
    }
}