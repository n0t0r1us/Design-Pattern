package structural.composite.bt;

public abstract class TreeNode {
    //Viết lớp Node trước để đại diện cho 2 cấu trúc (lá Leaf - nhánh Tree)
    //Mỗi nốt có khả năng là Nhánh, vì thế có phương thức thêm & xóa nút con bên trái và bên phải
    //Ngoài ra, phương thức duyetCay sẽ tìm cách in tên nút và nhánh con của nó (nếu có)
    abstract void addLeft(TreeNode node);
    abstract void addRight(TreeNode node);
    abstract void removeLeft(TreeNode node);
    abstract void removeRight(TreeNode node);
    abstract void duyetCay();
}