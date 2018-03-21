/*For Access File xyCoordinate*/


package readxy;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class test {
	//int xy[][]=new int[10][2];
	
	
	public int[] readLine(int n,int i) {
		int x,y;
		String line = "";
		String temp[];
		int xy[]=new int[2];
		//String delimiter=" ";
		int lineNo;
		try {
			FileReader fr = new FileReader("xyCoordinate.txt");
			BufferedReader br = new BufferedReader(fr);
			for (lineNo = 0; lineNo <= n; lineNo++) {
				if (lineNo == n) {
					line = br.readLine();
				} else
					br.readLine();
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		temp=line.split(" ");
		x=Integer.parseInt(temp[0]);
		y=Integer.parseInt(temp[1]);
		xy[0]=x;
		xy[1]=y;
		
		return xy;
		
		}
}
