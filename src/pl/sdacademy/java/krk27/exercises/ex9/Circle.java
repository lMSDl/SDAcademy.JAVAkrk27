package pl.sdacademy.java.krk27.exercises.ex9;

public class Circle {
    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    public Point2D getCenter() {
        return center;
    }

    public void setCenter(Point2D center) {
        this.center = center;
    }

    public Point2D getPoint() {
        return point;
    }

    public void setPoint(Point2D point) {
        this.point = point;
    }

    public  double getRadius() {
        return Math.sqrt(Math.pow((center.getX() - point.getX()), 2)
                + Math.pow((center.getY() - point.getY()), 2));
    }
    public double getPerimeter(){
        return 2 * Math.PI * getRadius();
    }
    public double getArea() {
        return Math.PI * Math.pow(getRadius(),2);
    }
}