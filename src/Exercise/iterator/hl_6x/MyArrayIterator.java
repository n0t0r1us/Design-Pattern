package iterator.hl_6x;

public class MyArrayIterator extends HL_Iterator {
    MyArray myArray;
    int current = -1;

    public MyArrayIterator(MyArray myArray) {
        this.myArray = myArray;
    }

    @Override
    public Object first() {
        current=0;
        return myArray.getItem(current);
    }

    @Override
    public Object next() {
        if (!isDone()){
            return myArray.getItem(++current);
        }
        return null;
    }

    @Override
    public Object currentItem() {
        if (current>=0 && current<myArray.count())
            return myArray.getItem(current);
        return null;
    }

    @Override
    public boolean isDone() {
        if (current>=myArray.count()-1)
            return true;
        return false;
    }
}
