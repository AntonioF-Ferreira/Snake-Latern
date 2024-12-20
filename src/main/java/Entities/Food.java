package Entities;

import Logic.Rectangle;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
;

public class Food extends Rectangle {
    private String color;

    public Food(int x, int y, String color){
        super(x, y);
        this.color = color;
    }


    public void show(TextGraphics graphics, int width, int height){
        graphics.setBackgroundColor(TextColor.Factory.fromString(color));
        graphics.fillRectangle(new TerminalPosition(position.getX(), position.getY()), new TerminalSize(width, height), ' ');
    }



}

