package projekat;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Prozor extends JFrame{
	private JButton dugme1;
	private JButton dugme2;
	private JButton dugme3;
	private JButton dugme4;
	private Platno platno;
	
	public Prozor() {
		    super("Crtanje");
		    super.setBounds(100,100,400,400);
		    super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    dodajKomponente();
	        super.setVisible(true);
		    
	        dugme1.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent d)
	              { platno.type=1; platno.repaint(); }
	          });
	        dugme2.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent d)
	              { platno.type=2; platno.repaint(); }
	          });
	        dugme3.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent d)
	              { platno.type=3; platno.repaint(); }
	          });
	        dugme4.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent d)
	              { platno.type=4; platno.repaint(); }
	          });
	} 
	
	private void dodajKomponente() {
		platno = new Platno();
        add(platno,"Center");
        
        JPanel p = new JPanel(new GridLayout(2,2));
        p.setBackground(new Color(192, 192, 255));
        add(p, "South");
        p.add(dugme1 = new JButton("Nacrtaj 1"));
        p.add(dugme2 = new JButton("Nacrtaj 2"));
        p.add(dugme3=new JButton("Nacrtaj 3"));
        p.add(dugme4=new JButton("Obrisi"));
	}
	
		  // GLAVNA FUNKCIJA.
		  public static void main(String[] varg)
		    { new Prozor(); }
}
