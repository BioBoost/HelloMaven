package be.vives.oop.hellomaven;

public class Square {

  public Square(double size) {
    setSize(size);
  }

  public double getSize() {
    return size;
  }

  public void setSize(double size) {
    this.size = size;
  }

  public double area() {
    return size * size;
  }

  private double size = 0;
}