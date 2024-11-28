import com.googlecode.lanterna.graphics.TextGraphics;

public abstract class Rectangle {
    protected Position position;

    public Rectangle(int x, int y) {
        this.position = new Position(x, y);
    }

    public abstract void show(TextGraphics graphics, int width, int height);
}
