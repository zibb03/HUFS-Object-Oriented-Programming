public class AutoCarTest {
    public static void main(String[] args) {
        OperateCar oc = new AutoCar();
        oc.start();
        oc.setSpeed(30);
        oc.turn(15);
        oc.stop();
    }
}
