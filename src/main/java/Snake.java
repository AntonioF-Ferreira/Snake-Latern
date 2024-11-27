import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;


public class Snake extends Rectangle{
    public int xspeed;
    public int yspeed;

    public Snake(int x, int y){
        super(x, y);
        this.xspeed = 1;
        this.yspeed = 0;
    }


    public void update(){
        position.setX(position.getX() + xspeed);
        position.setY(position.getY() + yspeed);

        if (position.getX() > 30-1){
            position.setX(30-1);
        } else if (position.getX() < 0){
            position.setX(0);
        } else if (position.getY() > 30-1){
            position.setY(30-1);
        } else if (position.getY() < 0){
            position.setY(0);
        }

    }

    public void show(TextGraphics graphics){
        graphics.setBackgroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.fillRectangle(new TerminalPosition(position.getX(), position.getY()), new TerminalSize(1, 1), ' ');
    }

    public void dir(int x, int y){
        this.xspeed = x*1;
        this.yspeed= y*1;
    }


}
