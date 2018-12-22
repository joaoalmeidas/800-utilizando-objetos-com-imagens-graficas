import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;

import javax.swing.JPanel;

public class DesenhoPanel extends JPanel{
	
	private SecureRandom aleatorio = new SecureRandom();
	private MinhaLinha[] linhas;
	
	public DesenhoPanel() {
		
		setBackground(Color.WHITE);
		
		linhas = new MinhaLinha[5 + aleatorio.nextInt(5)];
		
		for(int contador = 0; contador < linhas.length; contador++) {
			
			int x1 = aleatorio.nextInt(300);
			int y1 = aleatorio.nextInt(300);
			int x2 = aleatorio.nextInt(300);
			int y2 = aleatorio.nextInt(300);
			
			Color cor = new Color(aleatorio.nextInt(256), aleatorio.nextInt(256), aleatorio.nextInt(256));
			
			linhas[contador] = new MinhaLinha(x1, y1, x2, y2, cor);
			
		}
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		for(MinhaLinha linha : linhas) {
			
			linha.desenha(g);
			
		}
		
	}
	
}
