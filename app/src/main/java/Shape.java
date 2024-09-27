package jigsaw.app.src.main.java;

public abstract class Shape {
    public int x;
    public int y;
    String color = "blue";

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
