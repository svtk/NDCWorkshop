package javacode;

public class Rectangle {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        System.out.println("in constructor");
    }

    public Rectangle(int size) {
        this(size, size);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isSquare() {
        return width == height;
    }
}
