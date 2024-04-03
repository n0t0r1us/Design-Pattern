package composite;

public abstract class Node {
    abstract void addLeft(Node node);
    abstract void addRight(Node node);
    abstract void removeLeft(Node node);
    abstract void removeRight(Node node);
    abstract void duyetCay();
}

