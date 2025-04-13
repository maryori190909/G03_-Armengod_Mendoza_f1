package actividad2;

import java.awt.*;
import javax.swing.*;
public class pythagorasTree extends JPanel{
    private int profundidad;

    public pythagorasTree(int profundidad) {
        this.profundidad = profundidad;
        setPreferredSize(new Dimension(1000, 800));
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
    }

}
