package Cau1;

public class MainIter {
        public static void main(String[] args) {
            MonHoc myArray = new MonHoc();
            Hl_Inter iterator = myArray.createIterator();
            while (!iterator.isDone()){
                int n = (int) iterator.next();
                System.out.println("Tên môn học và số tín chỉ: " +n);
            }
        }
    }


