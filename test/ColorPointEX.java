public class ColorPointEX {
    public static void main(String[] args) {
        Point p = new Point();
        p.setPoint(1, 2);
        p.showPoint();

        ColorPoint cp = new ColorPoint();
        cp.setColor("red");
        cp.setPoint(3, 4);
        cp.showColorPoint();
    }
}
