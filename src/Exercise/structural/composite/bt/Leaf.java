package structural.composite.bt;

public class Leaf extends TreeNode {
    //Lá kế thừa Node
    String leafInfo; //Tên của lá
    //Contructor có tham số đầu vào là Tên Lá để tạo được đối tượng new Lá (có Tên Lá) trong hàm Main

    public Leaf(String leafInfo) {
        this.leafInfo = leafInfo;
    }

    //Lá chỉ có tên lá, không có khả năng tẻ nhánh nên trong các hàm addLeft-Right và removeLeft-Right không có code bên trong
    //Tuy nhiên vẫn phải Implement các hàm này để đảm bảo tính trừu tượng của Node
    @Override
    void addLeft(TreeNode node) {

    }

    @Override
    void addRight(TreeNode node) {

    }

    @Override
    void removeLeft(TreeNode node) {

    }

    @Override
    void removeRight(TreeNode node) {

    }
    //Lá in ra tên của Lá
    @Override
    void duyetCay() {
        System.out.println(leafInfo);
    }
}

