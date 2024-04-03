package factory;

public abstract class Shape {

        public abstract void draw();

    // Define Circle class
    class Circle extends Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a Circle");
        }
    }

    // Define Triangle class
    class Triangle extends Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a Triangle");
        }
    }

    // Define Rectangle class
    class Rectangle extends Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a Rectangle");
        }
    }

}
