package Cau2;
import java.util.ArrayList;
import java.util.List;
public class QuanLyEmail extends MailClient {
    List<MailClient> list = new ArrayList<>();
    @Override
    public String getProfile() {
        String tenNV = " ";
        for (MailClient mailClient: list)
            tenNV += mailClient.getProfile();
        return tenNV;
    }
    @Override
    public int getSoDT() {
        int soDT = 0;
        for (MailClient mailClient: list)
            soDT += mailClient.getSoDT();
        return soDT;
    }
    @Override
    public String getPhongBan() {
        String phongBan = " ";
        for (MailClient mailClient: list)
            phongBan += mailClient.getPhongBan();
        return phongBan;
    }
    @Override
    public String getDiaChiEmail() {
        String diaChiEmail = " ";
        for (MailClient mailClient: list)
            diaChiEmail += mailClient.getDiaChiEmail();
        return diaChiEmail;
    }
    @Override
    public String getTenNhom() {
        String tenNhom = " ";
        for (MailClient mailClient: list)
            tenNhom += mailClient.getTenNhom();
        return tenNhom;
    }
    @Override
    public String getMoTa(){
        String moTa = " ";
        for (MailClient mailClient:list)
            moTa += mailClient.getMoTa();
        return moTa;


    }
    @Override
    public void add(MailClient mailClient) {
        list.add(mailClient);
    }
    @Override
    public String toString() {
        return "Tên thành viên: " + getProfile() + "\n" +
                "Số điện thoại: " + getSoDT() + "\n" +
                "Phòng ban: " + getPhongBan() + "\n" +
                "Địa chỉ Email: " + getDiaChiEmail() + "\n" +
                "Tên nhóm: " + getTenNhom() + "\n" +
                "Mô tả:" + getMoTa() ;
    }
}
