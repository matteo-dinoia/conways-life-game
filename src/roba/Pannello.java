package roba;



import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Pannello extends JPanel {
	private static final long serialVersionUID = 1L;
	public static final int DIMC=7;
	public static final int DIMC2=3;
	private Mappa m;
	
	public Pannello(Mappa mappa) {
		this.m=mappa;
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Mappa.DIM*DIMC, Mappa.DIM*DIMC);
		g.setColor(Color.white);
		for(int y=0; y<Mappa.DIM; y++) {
			for(int x=0; x<Mappa.DIM; x++) {
				if(m.array[y][x][m.lettura]) {
					g.fillRect(y*DIMC, x*DIMC, DIMC, DIMC);
				}
				
			}
		}
	}
}
