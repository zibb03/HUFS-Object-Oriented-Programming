public class ColorPoint extends Point{
    private String color;

    void setColor(String color) {
        this.color = color;
    }

    void showColorPoint() {
        System.out.print(color);
        showPoint();
    }
}
