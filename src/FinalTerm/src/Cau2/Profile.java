package Cau2;
public class Profile extends MailClient {
    String tenTV;
    int soDT;
    String phongBan;
    String diaChiEmail;
    String tenNhom;
    String moTa;
    public Profile(String tenTV, int soDT, String phongBan,String diaChiEmail, String tenNhom, String moTa){
        this.tenTV = tenTV;
        this.soDT = soDT;
        this.phongBan = phongBan;
        this.diaChiEmail = diaChiEmail;
        this.tenNhom = tenNhom;
        this.moTa = moTa;
    }
    @Override
    public String getProfile() {
        return tenTV + " ";
    }
    @Override
    public int getSoDT() {
        return soDT;
    }
    @Override
    public String getPhongBan() {
        return phongBan;
    }
    @Override
    public String getDiaChiEmail() {
        return diaChiEmail;
    }
    @Override
    public String getTenNhom() {
        return tenNhom;
    }
    @Override
    public String getMoTa() {
        return moTa;
    }
    @Override
    public void add(MailClient mailClient) {
    }
}

