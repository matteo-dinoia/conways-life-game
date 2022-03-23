

public class Mappa {
	public Pannello p=new Pannello(this);
	public final static int DIM=100;
	public boolean array[][][]=new boolean[DIM][DIM][2];
	public int lettura=0;
	private int scrittura=1;
	public void aggiorna() {
		int v;
		boolean t;
		for(int i=0; i<DIM; i++) {
			for(int i2=0; i2<DIM; i2++) {
				v=intorno(i, i2, lettura);
				if(v==3||(v==2&&array[i][i2][lettura])) {
					t=true;
				}
				else t=false;
				
				array[i][i2][scrittura]=t;
			}
		}
		
		invLet();
	}

	private int intorno(int x, int y, int l) {
		int n=0;
		for(int dX=-1; dX<=1; dX++) {
			for(int dY=-1; dY<=1; dY++) {
				if(dX!=0||dY!=0) {
					if(!(x+dX>=DIM||y+dY>=DIM||x+dX<0||y+dY<0)) {
						if(array[x+dX][y+dY][l])n++;
					}
				}
			}
		}
		return n;
	}

	private void invLet() {
		lettura=(lettura+1)%2;
		scrittura=(scrittura+1)%2;
		
	}

	public void ristampa() {
		p.repaint();
		
	}

	public void setTrue(int x, int y) {
		array[x][y][lettura]=true;
		array[x][y][scrittura]=true;
		ristampa();
	}

}
