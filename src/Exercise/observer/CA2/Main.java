package observer.CA2;

public class Main {
    public static void main(String[] args) {
        MyButton button = new MyButton();
        Activity activity = new Activity(button);
        activity.onClick();
    }
}

