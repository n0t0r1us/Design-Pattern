package observer;

public class Main {
    public static void main(String[] args) {
        TiGia t = new TiGia();
        NhaDauTuA a = new NhaDauTuA(t);
        NhaDauTuB b = new NhaDauTuB(t);
        System.out.println("Lần 1");
//        a.capNhatTiGia(5);
        t.notifyTiGia(-5);
        a.huyDangKy();
        System.out.println("Lần 2");
        t.notifyTiGia(5);
//        b.capNhatTiGia(5);


    }

}
