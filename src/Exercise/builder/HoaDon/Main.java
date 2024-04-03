package builder.HoaDon;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        HoaDonHeader HDH = new HoaDonHeader
                ("HD001", new SimpleDateFormat("dd/mm/yyyy").parse("10/09/2023"), "Chicken");
        CTHD CTHD1 = new CTHD("Keyboard", 2, 400000, 2);
        CTHD CTHD2 = new CTHD("AirPod", 2, 50000, 3);

        HoaDon HD = new HoaDon.Builder()
                .addHoaDonHeader(HDH)
                .addCTHD(CTHD1)
                .addCTHD(CTHD2)
                .build();
        System.out.println(HD.toString());
    }
}
