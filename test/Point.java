import java.util.*;

public class Point {
    private int x;
    private int y;
    
    void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void showPoint() {
        System.out.println("(" + x + "," + y + ")");
    }

}
