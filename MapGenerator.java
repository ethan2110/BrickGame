import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MapGenerator {
    
    public int map [][]; //map using array
    public int brickWidth; //sets the width of the brick
    public int brickHeight; //sets height of the brick
    
    public MapGenerator(int row, int col) { // this creates the brick of size 3x7
        map = new int [row][col];
        for (int i = 0; i < map.length; i++) { 
            for (int j=0; j< map[0].length;j++) {
                map[i][j] = 1;
            }
        }
        
        brickWidth = 540/col;
        brickHeight = 150/row;
    }
    
    public void draw(Graphics2D g) { // this draws the bricks
        for (int i = 0; i < map.length; i++) {
            for (int j=0; j< map[0].length;j++) {
                if(map[i][j] > 0) {
                    g.setColor(Color.RED); // brick color
                    g.fillRect(j*brickWidth + 80, i*brickHeight + 50, brickWidth, brickHeight); //fills the brick with the color
                    
                    g.setStroke(new BasicStroke(4));
                    g.setColor(Color.BLACK); // brick outline color
                    g.drawRect(j*brickWidth + 80, i*brickHeight + 50, brickWidth, brickHeight); //outlines the brick with the color
                }
            }
            
        }
    }
    
    
    public void setBrickValue(int value, int row, int col) {// this sets the value of brick to 0 if it is hit by the ball if 0 then the brick dissapears
        map[row][col] = value;
    }
}
