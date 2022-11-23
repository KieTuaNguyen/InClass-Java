package labotory.Fraction;

public class Point {
  private double x;
  private double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

  public void printXY() {
    System.out.println("(" + x + ", " + y + ")");
  }

  public double distance(Point f, Point s) {
    double x = f.getX() - s.getX();
    double y = f.getY() - s.getY();
    double distance = Math.sqrt(x * x + y * y);
    return distance;
  }

  public double areaTriangle(Point f, Point s, Point t) {
    double a = distance(f, s);
    double b = distance(s, t);
    double c = distance(t, f);
    double p = (a + b + c) / 2;
    double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    return area;
  }
}