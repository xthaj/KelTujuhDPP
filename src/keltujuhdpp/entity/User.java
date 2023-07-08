package keltujuhdpp.entity;

/**
 *
 * @author atha <222111930>
 */
public class User {
    private String nik;
    private String nama;
    private String pw;
    private String email;
    private Boolean is_admin;

    public User() {
    }

    public User(String nik, String nama, String pw, String email, Boolean is_admin) {
        this.nik = nik;
        this.nama = nama;
        this.pw = pw;
        this.email = email;
        this.is_admin = is_admin;
    }
    
    public User(String nik, String pw, Boolean is_admin) {
        this.nik = nik;
        this.pw = pw;
        this.is_admin = is_admin;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(Boolean is_admin) {
        this.is_admin = is_admin;
    }
    
}