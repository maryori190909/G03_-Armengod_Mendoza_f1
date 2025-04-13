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
        if (nivel == 0 || lado < 2) return;

        int x2 = x + (int)(lado * Math.cos(Math.toRadians(angulo)));
        int y2 = y + (int)(lado * Math.sin(Math.toRadians(angulo)));
        float ratio = (float) nivel / profundidad;
        Color color = new Color((int)(100 + 155 * (1 - ratio)), (int)(200 * ratio), 50);
        g.setColor(color);
        g.setStroke(new BasicStroke(nivel));
        g.drawLine(x, y, x2, y2);

        int nuevoLado = (int)(lado * 0.7);
        trazaArbol(g, x2, y2, nuevoLado, angulo - 30, nivel - 1);
        trazaArbol(g, x2, y2, nuevoLado, angulo + 30, nivel - 1);
    }
    public static void main(String[] args) {
        
    }
}
