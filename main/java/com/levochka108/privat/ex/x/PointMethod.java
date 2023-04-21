package main.java.com.levochka108.privat.ex.x;

public class PointMethod {
    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    public static void getDistance() {
        Point2D a = new Point2D(0,2);     // Стек все остальное куча
        Point2D b = new Point2D(10);



        System.out.println(a);
        System.out.println(b);
        System.out.println(distance(a, b));


    }
}
