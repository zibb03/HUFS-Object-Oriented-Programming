public class MethodOverridingEx {
    public static void main(String[] args) {

        paint(new Shape());   	// Shape s = new Shape();
        paint(new Line());     	// Shape s = new Line();
        paint(new Rectangle()); 	// Shape s = new Rectangle();
        paint(new Circle());   	// Shape s = new Circle();
    }

    public static void paint(Shape s) {
        s.draw();         // s 객체 내에 오버라이딩된 draw() 호출 
    }
}
