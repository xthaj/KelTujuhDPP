package keltujuhdpp.entity;

/**
 *
 * @author atha <222111930>
 */

public class Validasi {
//    public static boolean cektahun(String tahun) {
//        // Memeriksa panjang string tahun
//        if (tahun.length() != 4) {
//            return false;
//        }
//
//        // Memeriksa karakter pertama (harus 1 atau 2)
//        char firstChar = tahun.charAt(0);
//        if (firstChar != '1' && firstChar != '2') {
//            return false;
//        }
//
//        // Memeriksa apakah semua karakter adalah angka
//        for (int i = 0; i < tahun.length(); i++) {
//            if (!Character.isDigit(tahun.charAt(i))) {
//                return false;
//            }
//        }
//        // Jika semua validasi berhasil, kembalikan true
//        return true;
//    }
    
    public static boolean cekKodeKJU(String kodeKJU) {
    // Pola ini memungkinkan hanya karakter angka 0-9 dalam kodeKJU
    if (!kodeKJU.matches("[0-9]+")) {
        return false;
    }
    return true;
    }
    
    public static boolean cekNoUrut(String noUrut) {
    // Pola ini memungkinkan hanya karakter angka 0-9 dalam noUrut
    if (!noUrut.matches("[0-9]+")) {
        return false;
    }
    return true;
}
    public static boolean cekNamaPerusahaan(String namaperusahaan) {
        // Memeriksa nama perusahaan (hanya boleh huruf atau angka, tidak boleh simbol)
        if (!namaperusahaan.matches("[a-zA-Z0-9]*")) {
            return false;
        }
    return true;
    }   
    
    public static boolean cekAlamatPerusahaan(String alamatPerusahaan) {
    // Pola ini memungkinkan karakter huruf (baik huruf besar maupun huruf kecil), 
    // angka, spasi, titik, koma, strip, tanda petik tunggal (single quotes), dan garis miring.
    if (!alamatPerusahaan.matches("^[a-zA-Z0-9\\s.,'/-]+$")) {
        return false;
    }
    return true;
}
   
    public static boolean cekNoTelepon(String nomorTelepon) {
        // Pola ini memungkinkan hanya karakter angka 0-9 dalam pengisian nomor telepon
        if (!nomorTelepon.matches("[0-9]+")) {
            return false;
        }
        // Memeriksa panjang nomor telepon yang tidak boleh kurang dari 10 karakter
        if (nomorTelepon.length() < 10) {
            return false;
        }
        // Memeriksa panjang nomor telepon yang tidak boleh lebih dari 15 karakter
        if (nomorTelepon.length() > 15) {
            return false;
        }
        return true;
    }
 
    
    
    public static boolean cekFaksimili(String faksimili) {
        // Pola ini memungkinkan karakter ANGKA 0-9 dalam pengisisan nomor telepon dan simbol +$()-
        if (faksimili.matches("^[0-9]+$()-")) {
            return false;
        }
        // Memeriksa panjang nomor faksimili yang tidak boleh lebih dari 15 karekater dan kurang dari10 karekater
        if (faksimili.length() < 10 || faksimili.length() > 15) {
                return false;

        }
    return true;
    }   
    

    
    public static boolean cekEmail(String email) {
    // Memeriksa format email dengan regex
        String pattern = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        if (!email.matches(pattern)) {
            return false;
        }
        return true;
    }
//    public static boolean cekAll(String nama, String alamat, String no_telp, String no_fak, String email){
//        validasi=
//    
//    }
          
}