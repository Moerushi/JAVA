package oop_project001.dictionaries;

public class Coordinates {
  public int x;
  public int y;

  public Coordinates(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public double CalculateDistance (Coordinates point) {
    int dx = point.x - x;
    int dy = point.y - y;
    return Math.sqrt(Math.pow(dx,2) + Math.pow(dy,2));
  }
}
