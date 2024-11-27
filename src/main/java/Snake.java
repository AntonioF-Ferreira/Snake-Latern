import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;

public class Snake {
    public int x;
    public int y;
    public int xspeed;
    public int yspeed;

    public Snake(){
        this.x = 1;
        this.y = 1;
        this.xspeed = 1;
        this.yspeed = 0;
    }


    public void update(){
        this.x += xspeed;
        this.y += yspeed;

    }

    public void show(TextGraphics graphics){
        graphics.setBackgroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.fillRectangle(new TerminalPosition(this.x, this.y), new TerminalSize(1, 1), ' ');
    }

}
