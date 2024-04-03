package strategy.tinh;

public class Main{
    public static void main(String[] args) {
        TinhToan ct =new TinhToan();

        ct.setTinhToan(new Cong());
        System.out.println("1 + 1 = " + ct.tinh(1, 1));

        ct.setTinhToan(new Tru());
        System.out.println("10 - 5 = "+ct.tinh(10, 5));

        ct.setTinhToan(new Nhan());
        System.out.println("10 * 5 = " + ct.tinh(10, 5));

        ct.setTinhToan(new Chia());
        System.out.println("6 / 2 = "+ct.tinh(6, 2));
    }
}

