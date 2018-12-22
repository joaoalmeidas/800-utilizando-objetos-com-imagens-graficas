import java.awt.Color;
import java.awt.Graphics;

public class MinhaLinha {
	
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	private Color cor;

	public MinhaLinha(int x1, int y1, int x2, int y2, Color cor) {
		
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.cor = cor;
		
	}
	
	public void desenha(Graphics g) {
		
		g.setColor(cor);
		g.drawLine(x1, y1, x2, y2);
		
	}
	
}
