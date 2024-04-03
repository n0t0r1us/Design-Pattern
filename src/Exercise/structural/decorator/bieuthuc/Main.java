package structural.decorator.bieuthuc;

public class Main {
    public static void main(String[] args) {
        BieuThuc b = new BieuThucDonGian(8);
        b = new Tru(9, b);
        b = new Cong(8,b);
        System.out.println(b.bieuThuc()+ "=" + b.giaTri());
    }
}
