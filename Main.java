import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main {
    public static void main(String[] args) {
        JFrame obj = new JFrame(); //new JFrame to see the game
        GamePlay gamePlay = new GamePlay(); //creates new GamePlay object that intiates the game
        obj.setBounds(10, 10, 700, 600);
        obj.setTitle("Brick Breaker");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
        
    }
}

