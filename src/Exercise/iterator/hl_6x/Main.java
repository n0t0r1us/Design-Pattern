package iterator.hl_6x;

public class Main {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        HL_Iterator iterator = myArray.createIterator();
        while (!iterator.isDone()){
            int n = (int) iterator.next();
            System.out.println(n);
        }
    }
}
