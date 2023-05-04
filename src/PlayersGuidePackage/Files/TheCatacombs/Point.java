package PlayersGuidePackage.Files.TheCatacombs;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(-4, 0);
        System.out.println("Point 1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Point 2: (" + p2.getX() + ", " + p2.getY() + ")");
    }


}
/*
Objectives:

Define a new Point class with fields and getter methods for x and y.
Add a constructor to create a point from a specific x- and y-coordinate.
Add a parameterless constructor to create a point at the origin (0, 0).
In your main method, create a point at (2, 3) and another at (-4, 0). Display these points on the console window in the format (x, y) to illustrate that the class works.
Answer this question: Are your x and y immutable? Why did you choose what you did?
X and Y are immutable to make sure they are not suddenly / constantly changed, next they are thread-safe.
 */
