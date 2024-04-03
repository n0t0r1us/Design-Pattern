package observer.CA6;

public class DrashBoard implements PlayerData.I_theoDoi{
    int thoiGian,countdown,grade;

    PlayerData playerData;

    public DrashBoard(PlayerData playerData) {
        this.playerData = playerData;
        playerData.attach(this);
    }

    public void huyDangKy()
    {
        playerData.detach(this);
    }

    @Override
    public void updateInfo(int thoiGian, int soLuot, int diemToiDa) {
        this.thoiGian = thoiGian;
        this.countdown = soLuot;
        this.grade = diemToiDa;

        System.out.println("Thời gian:"+thoiGian+"\nSố lượt:"+countdown+"Điểm tối đa:"+grade);
    }

    @Override
    public void updateLevel(int thoiGian, int soLuot, int diemToiDa) {
        this.thoiGian += thoiGian;
        this.countdown += soLuot;
        this.grade = +diemToiDa;

        System.out.println("Thời gian update :"+thoiGian+"\nSố lượt:"+countdown+ "\n" +"Số điểm số ta:"+grade);
    }

}
