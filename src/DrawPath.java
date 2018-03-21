
import javax.swing.*;
import java.awt.*;
public class DrawPath extends JPanel
{
	int xyCordinateArray[][],max;
	public void copyCoordinate(int xyCord[][],int sz)
	{
		xyCordinateArray=xyCord;
		max=sz;
	}
	public void paintComponent(Graphics g)
		{
		
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		//g.drawRect(100, 10, 30, 40);
		for(int i=0;i<max;i++)
		{
		//g.fillOval(xyCordinateArray[i][0],xyCordinateArray[i][1],10, 10);
		g.fillRect(xyCordinateArray[i][0], xyCordinateArray[i][1], 5, 5);
		if(i==max-1)
		{
			g.drawLine(xyCordinateArray[i][0],xyCordinateArray[i][1], xyCordinateArray[0][0], xyCordinateArray[0][1]);
		}
		else
		{
		g.drawLine(xyCordinateArray[i][0],xyCordinateArray[i][1], xyCordinateArray[i+1][0], xyCordinateArray[i+1][1]);
		}
		}
		//g.setColor(Color.BLUE);
		//g.fillOval(102, 78, 10, 10);
		//g.drawLine(50, 91, 102, 84);
	
	}
	
}
