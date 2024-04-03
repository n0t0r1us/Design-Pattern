package observer.CA2;

public class Activity implements MyButton.OnClickListener {
    int clickCount = 68 ;
    MyButton button;

    public Activity(MyButton button) {
        this.button = button;
        this.button.attach(this);

    }
    @Override
    public void onClick() {
        clickCount++;
        System.out.println(" bạn click lần thứ "  + clickCount + " lần");
    }
}

