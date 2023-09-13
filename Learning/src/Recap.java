import javax.swing.*;
import java.awt.*;

// In Java you cannot make a top-level class static
public class Recap {
    // You can only make nested classes static or non-static
    // A non-static class is also referred to an inner class
    public static void main(String[] args) {
        JFrame frame = new JFrame("Recap");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Setting a size so I can see it.
        frame.setPreferredSize(new Dimension(500, 500));
        // emptyLabel error: "Cannot resolve symbol 'emptyLabel'... I tried using the IDE's help by creating a string, and initialising it.
        // I found a solution, make an object of class JLabel() called emptyLabel. However, I'm not wise enough to know why this works yet.
        JLabel emptyLabel = new JLabel();
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
        frame.pack();
        // If component is null, the window is placed at the center of screen.
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}