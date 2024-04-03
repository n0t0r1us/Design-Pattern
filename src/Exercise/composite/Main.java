package composite;

public class Main {
    public static void main(String[] args) {
        Node nutLa1 = new Leaf("Lá 1");
        Node nutLa2 = new Leaf("Lá 2");
        Node nutLa3 = new Leaf("Lá 3");
        Node nutLa4 = new Leaf("Lá 4");
        Node nutLa5 = new Leaf("Lá 5");
        Node nutGoc = new Tree("Gốc");
        Node nhanh1 = new Tree("Nhánh 1");
        Node nhanh2 = new Tree("Nhánh 2");
        Node nhanh3 = new Tree("Nhánh 3");
        Node nhanh4 = new Tree("Nhánh 4");
        nutGoc.addLeft(nutLa1);
        nutGoc.addRight(nhanh1);
        nhanh1.addLeft(nhanh2);
        nhanh1.addRight(nhanh3);
        nhanh2.addLeft(nhanh4);
        nhanh2.addRight(nutLa2);
        nhanh3.addLeft(nutLa3);
        nhanh3.addRight(nutLa4);
        nhanh4.addLeft(nutLa5);
        nutGoc.duyetCay();
        System.out.println("---------------------\nThử xóa nhánh bên phải của Gốc");
        nutGoc.removeRight(nutGoc);
        nutGoc.duyetCay();
    }
}
