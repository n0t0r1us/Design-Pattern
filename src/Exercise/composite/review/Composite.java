package composite.review;

public class Composite {
    public class Employee implements IComponent{
        public String name;
        public String position;

        public Employee(String name, String position) {
            this.name = name;
            this.position = position;
        }

        @Override
        public void displayInformation() {
            System.out.println("Tên: " + name + ", Vị Trí: " + position);
        }
    }
}
