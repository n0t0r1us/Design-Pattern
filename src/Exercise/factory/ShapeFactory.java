//package factory;
//
//public class ShapeFactory {
//    public Shape createShape(ShapeType type){
//        switch (type){
//            case Circle -> {
//                return new Circle();
//            }
//            case Triangle -> {
//                return new Triangle();
//            }
//            case Rectangle -> {
//                return new Rectangle();
//            }
//
//        }
//        return null;
//    }
//}
//// Define ShapeType enum
//enum ShapeType {
//    Circle, Triangle, Rectangle;
//}
//
//// Define the Shape interface (you might have other methods and properties here)
//interface Shape {
//    void draw();
//}
//
//// Define Circle class
//class Circle implements Shape {
//    @Override
//    public void draw() {
//        System.out.println("Drawing a Circle");
//    }
//}
//
//// Define Triangle class
//class Triangle implements Shape {
//    @Override
//    public void draw() {
//        System.out.println("Drawing a Triangle");
//    }
//}
//
//// Define Rectangle class
//class Rectangle implements Shape {
//    @Override
//    public void draw() {
//        System.out.println("Drawing a Rectangle");
//    }
//}
