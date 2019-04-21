/* 
 * Repeat the preceding exercise, but now make translate and scale into mutators.
 */

public class Point {

    private double x;
    private double y;

    public Point() {
        this(0, 0);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public Point translate(double val1, double val2) {
        this.x = this.x + val1;
        this.y = this.y + val2;
        return this;
    }

    public Point scale(double value) {
        this.x = this.x * value;
        this.y = this.y * value;
        return this;
    }

    public static void main(String args[]) {
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.printf("x: %.2f, y: %.2f", p.getX(), p.getY());
    }
}
