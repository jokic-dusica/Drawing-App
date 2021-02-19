package projekat;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Platno extends Canvas{
	public int type = 1;
	
	public void paint(Graphics g) {
		switch (type) {
		case 1: g.drawOval(40, 40, 50, 50);
				g.drawLine(65, 90, 65, 180);
				//noge
				g.drawLine(65,180,45,210);
				g.drawLine(65,180,85,210);
				//ruka
				g.drawLine(65,120, 45, 130);
				g.drawLine(65,120, 85, 130);
				break;
		case 2: g.setColor(Color.BLUE);
				g.fillOval(30, 30, 150, 150);
				g.setColor(Color.RED);
				g.fillOval(200, 150, 100, 100);
				g.setColor(Color.GREEN);
				g.fillOval(250, 30, 70, 70);
				break;
		case 3: g.setColor(Color.MAGENTA);
				g.fill3DRect(50, 50, 150, 150, true);
				g.setColor(Color.cyan);
				g.fill3DRect(200, 200, 75, 75, true);
				break;
		case 4: break;
		}		
	}
}
