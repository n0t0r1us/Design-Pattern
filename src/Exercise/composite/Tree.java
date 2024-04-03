package composite;

public class Tree extends Node{
    String treeInfo;
    Node left, right;
    public Tree(String treeInfo) {
        this.treeInfo = treeInfo;
    }
    @Override
    void addLeft(Node node) {
        left=node;
    }
    @Override
    void addRight(Node node) {
        right=node;
    }
    @Override
    void removeLeft(Node node) {
        node.addLeft(null);
    }
    @Override
    void removeRight(Node node) {
        node.addRight(null);
    }
    @Override
    void duyetCay() {
        System.out.println("\t"+treeInfo);
        if(left!=null)
            left.duyetCay();
        if(right!=null)
            right.duyetCay();
    }
}
