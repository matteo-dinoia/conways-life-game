

import java.awt.Dimension;
import java.awt.event.*;

import javax.swing.*;

public class Principale extends JFrame implements MouseListener, ActionListener, KeyListener, MouseMotionListener{
	private static final long serialVersionUID = 1L;
	private static final int DELAY = 300;
	private Timer tm;
	private Mappa m=new Mappa();
	private boolean bloccato=false;
	public static void main(String[] args) {
		 Principale p=new Principale();
		 p.addKeyListener(p);
		 p.setVisible(true);
	 }
	
	public Principale() {
		m.p.addMouseListener(this);
		m.p.addMouseMotionListener(this);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(m.p);
		this.setSize(new Dimension(Mappa.DIM*Pannello.DIMC, Mappa.DIM*Pannello.DIMC));
		tm=new Timer(DELAY, this);
		m.setTrue(1,0);
		m.setTrue(1,1);
		m.setTrue(1,2);
		tm.start();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(!bloccato) {
			m.aggiorna();
		}
		
		m.ristampa();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int x=e.getX();
		int y=e.getY();
		x/=Pannello.DIMC;
		y/=Pannello.DIMC;
		m.setTrue(x,y);
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {}

	@Override
	public void mouseExited(MouseEvent arg0) {}

	@Override
	public void mousePressed(MouseEvent arg0) {}

	@Override
	public void mouseReleased(MouseEvent arg0) {}

	@Override
	public void keyTyped(KeyEvent e) {
		if(e.getKeyChar()=='s')
			bloccato=!bloccato;
	}

	@Override
	public void keyPressed(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		int x=e.getX();
		int y=e.getY();
		x/=Pannello.DIMC;
		y/=Pannello.DIMC;
		m.setTrue(x,y);
	}

	@Override
	public void mouseMoved(MouseEvent e) {

	}
}
