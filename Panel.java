
package ttt;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Panel extends JPanel{
	
	private Color color = new Color(10,130,135);
	private Color bgColor = new Color(33,33,33); 
	public Graphics g;	
	private int diameter = 50;
	
	private Color r1 = bgColor;
	private Color r2 = bgColor;
	private Color r3 = bgColor;
	private Color r4 = bgColor;
	private Color r5 = bgColor;
	private Color r6 = bgColor;
	private Color r7 = bgColor;
	private Color r8 = bgColor;
	private Color r9 = bgColor;
	
	private Color c1 = bgColor;
	private Color c2 = bgColor;
	private Color c3 = bgColor;
	private Color c4 = bgColor;
	private Color c5 = bgColor;
	private Color c6 = bgColor;
	private Color c7 = bgColor;
	private Color c8 = bgColor;
	private Color c9 = bgColor;
	
	
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		this.setBackground(new Color(33,33,33));
		this.setSize(200, 200);
		
		g.setColor(color);
		g.drawLine(67, 10, 67, 190);
		
		g.setColor(color);
		g.drawLine(134, 10, 134, 190);
		
		g.setColor(color);
		g.drawLine(10, 67, 190, 67);
		
		g.setColor(color);
		g.drawLine(10,134,190,134);
		
		
		//zero
		
		g.setColor(r1);
		g.drawOval(10, 10, diameter,diameter);
				
		g.setColor(r2);
		g.drawOval(75, 10, diameter,diameter);
		
		g.setColor(r3);
		g.drawOval(142, 10, diameter,diameter);
		
		g.setColor(r4);
		g.drawOval(10, 75, diameter,diameter);
		
		g.setColor(r5);
		g.drawOval(75, 75, diameter,diameter);
		
		g.setColor(r6);
		g.drawOval(142, 75,diameter,diameter);
		
		g.setColor(r7);
		g.drawOval(10, 142,diameter,diameter);
		
		g.setColor(r8);
		g.drawOval(75, 142, diameter,diameter);
		
		g.setColor(r9);
		g.drawOval(142, 142, diameter,diameter);
		
		//cross
		g.setColor(c1);
		g.drawLine(12, 12, 63, 63);
		g.setColor(c1);
		g.drawLine(12, 63, 63, 12);
		
		g.setColor(c2);
		g.drawLine(77, 12, 128, 63);
		g.setColor(c2);
		g.drawLine(77, 63, 128, 12);
		
		g.setColor(c3);
		g.drawLine(138, 12, 189, 63);
		g.setColor(c3);
		g.drawLine(138, 63, 189, 12);
		
				
		g.setColor(c4);
		g.drawLine(12, 76, 63, 127);
		g.setColor(c4);
		g.drawLine(12, 127, 63, 76);
		
		g.setColor(c5);
		g.drawLine(76, 76, 128, 128);
		g.setColor(c5);
		g.drawLine(76, 128, 128, 76);
		
		g.setColor(c6);
		g.drawLine(138, 76, 189, 127);
		g.setColor(c6);
		g.drawLine(138, 127, 189, 76);
		
		
		g.setColor(c7);
		g.drawLine(12, 139, 63, 190);
		g.setColor(c7);
		g.drawLine(12, 190, 63, 139);
		
		g.setColor(c8);
		g.drawLine(76, 139, 127, 190);
		g.setColor(c8);
		g.drawLine(76, 190, 127, 139);
		
		g.setColor(c9);
		g.drawLine(138, 139, 189, 190);
		g.setColor(c9);
		g.drawLine(138, 189, 189, 138);
		
	}
	
	public void setR1(){
		this.r1 = Color.CYAN;
		repaint();
	}
	public void setR2(){
		this.r2 = Color.CYAN;
		repaint();
	}
	public void setR3(){
		this.r3 = Color.CYAN;
		repaint();
	}
	public void setR4(){
		this.r4 = Color.CYAN;
		repaint();
	}
	public void setR5(){
		this.r5 = Color.CYAN;
		repaint();
	}
	public void setR6(){
		this.r6 = Color.CYAN;
		repaint();
	}
	public void setR7(){
		this.r7 = Color.CYAN;
		repaint();
	}
	public void setR8(){
		this.r8 = Color.CYAN;
		repaint();
	}
	public void setR9(){
		this.r9 = Color.CYAN;
		repaint();
	}

	public void setC1(){
		this.c1 = Color.RED;
		repaint();
	}
	public void setC2(){
		this.c2 = Color.RED;
		repaint();
	}
	public void setC3(){
		this.c3 = Color.RED;
		repaint();
	}
	public void setC4(){
		this.c4 = Color.RED;
		repaint();
	}
	public void setC5(){
		this.c5 = Color.RED;
		repaint();
	}
	public void setC6(){
		this.c6 = Color.RED;
		repaint();
	}
	public void setC7(){
		this.c7 = Color.RED;
		repaint();
	}
	public void setC8(){
		this.c8 = Color.RED;
		repaint();
	}
	public void setC9(){
		this.c9 = Color.RED;
		repaint();
	}
	
	public void clearBoard(){
		
		r1 = bgColor;
		r2 = bgColor;
		r3 = bgColor;
		r4 = bgColor;
		r5 = bgColor;
		r6 = bgColor;
		r7 = bgColor;
		r8 = bgColor;
		r9 = bgColor;
		
		c1 = bgColor;
		c2 = bgColor;
		c3 = bgColor;
		c4 = bgColor;
		c5 = bgColor;
		c6 = bgColor;
		c7 = bgColor;
		c8 = bgColor;
		c9 = bgColor;
		repaint();
	}
	

}
