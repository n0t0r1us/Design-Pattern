package builder.HoaDon;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    HoaDonHeader HD;
    //    HoaDonHeader HoaDon;
    List<CTHD> CTHD = new ArrayList<>();

    private HoaDon(Builder builder)
    {
        this.HD = builder.HDH;
        this.CTHD = builder.DSCTHD;
    }
    public static class Builder
    {
        HoaDonHeader HDH;
        ArrayList<CTHD> DSCTHD = new ArrayList<>();

        public Builder()
        {}

        public Builder addHoaDonHeader(HoaDonHeader HDH)
        {
            this.HDH = HDH;
            return this;
        }

        public Builder addCTHD(CTHD cthd)
        {
            this.DSCTHD.add(cthd);
            return this;
        }

        public HoaDon build()
        {
            return new HoaDon(this);
        }
    }

    @Override
    public String toString() //trar ve String tra ve 1 chuoi
    {
        String s = HD.toString();
        for (int i = 0; i < CTHD.size(); i++) {
            s += "\n" + CTHD.get(i).toString();
        }
        return s;
    }

}
