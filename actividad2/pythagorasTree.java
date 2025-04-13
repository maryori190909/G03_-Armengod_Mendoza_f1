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
        g2d.setColor(new Color(25, 25, 25));
        g2d.fillRect(0, 0, getWidth(), getHeight());

        trazaArbol(g2d, getWidth() / 2, getHeight() - 50, 120, -90, profundidad);
    }
    private void trazaArbol(Graphics2D g, int x, int y, int lado, double angulo, int nivel) {
        
    }
}
