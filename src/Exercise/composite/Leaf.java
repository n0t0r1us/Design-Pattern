package composite;
public class Leaf extends Node{
    String leafInfo;
    public Leaf(String leafInfo) {
        this.leafInfo = leafInfo;
    }
    @Override
    void addLeft(Node node) {
    }
    @Override
    void addRight(Node node) {
    }
    @Override
    void removeLeft(Node node) {
    }
    @Override
    void removeRight(Node node) {
    }
    @Override
    void duyetCay() {
        System.out.println(leafInfo);
    }
}
