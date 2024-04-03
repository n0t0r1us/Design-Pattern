package Cau2;
public abstract class MailClient {
    public abstract String getProfile();
    public abstract int getSoDT();
    public abstract String getPhongBan();
    public abstract String getDiaChiEmail();
    public abstract String getTenNhom();
    public abstract String getMoTa();
    public abstract void add(MailClient mailClient);
}

