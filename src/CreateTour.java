import readxy.test;
import javax.swing.*;
import java.util.Random;

public class CreateTour{
	
	 public double distanceCalulation(int node[],int maxSize)
	 {
		 double distance=0.0,totalDistance=0;
		 int xyCoordinate[][]=new int[maxSize][2];
		 int x1=0,x2 = 0,p1,p2;
		 test t=new test();
		 for(int i=0;i<maxSize;i++)
     	{
     	int s=node[i];
     	 //a.readLine(s,i);
     	int ans[]=t.readLine(s, i);
     	 //System.out.println(f);
     	xyCoordinate[i][0]=ans[0];
     	xyCoordinate[i][1]=ans[1];
     	}
   /*  for(int i=0;i<maxSize;i++)
     {
     	System.out.println(xyCoordinate[i][0]+" "+xyCoordinate[i][1]);
     }  */
     
     for(int i=0;i<maxSize;i++)
     {
     	
     	if(i==maxSize-1)
     	{
     		x1=Math.abs(xyCoordinate[i][0]-xyCoordinate[0][0]);
     		x2=Math.abs(xyCoordinate[i][1]-xyCoordinate[0][1]);
     		p1=node[i];
     		p2=node[0];
     	}
     	else
     	{
     		x1=Math.abs(xyCoordinate[i+1][0]-xyCoordinate[i][0]);
     		x2=Math.abs(xyCoordinate[i+1][1]-xyCoordinate[i][1]);
     		p1=node[i];
     		p2=node[i+1];
     	}
     	distance=Math.sqrt(Math.pow(x1,2)+Math.pow(x2,2));
     	totalDistance=totalDistance+distance;
     	//System.out.println("Edge "+p1+" - "+p2+"  Distance "+ distance);
     	
     	///////////////////////////
     	
     }
     System.out.println("Total Distance: "+totalDistance);
     return totalDistance;
	 }
	 ///////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxSize=10;
		// int x1=0,x2=0,p1,p2;
		
		double distance=0.0;
		//int xyCoordinate[][]=new int[maxSize][2];
		int node[]=new int[maxSize];
		boolean[] check = new boolean[maxSize];
		Random rand=new Random();
		int amountFilled = 0;
        int trial;
        while (amountFilled < maxSize) 
        {
            trial = rand.nextInt(maxSize);
            if (!check[trial]) 
            {
                check[trial] = true;
                node[amountFilled] = trial;
                amountFilled++;
            }
        }
       // test t=new test();
        //abc a=new abc();
      /* 
        for(int i=0;i<maxSize;i++)
        	{
        	int s=node[i];
        	 //a.readLine(s,i);
        	int ans[]=t.readLine(s, i);
        	 //System.out.println(f);
        	xyCoordinate[i][0]=ans[0];
        	xyCoordinate[i][1]=ans[1];
        	}
        	*/
      /*  for(int i=0;i<maxSize;i++)
        {
        	System.out.println(xyCoordinate[i][0]+" "+xyCoordinate[i][1]);
        }  */
        
      /*  for(int i=0;i<maxSize;i++)
        {
        	
        	if(i==maxSize-1)
        	{
        		x1=Math.abs(xyCoordinate[i][0]-xyCoordinate[0][0]);
        		x2=Math.abs(xyCoordinate[i][1]-xyCoordinate[0][1]);
        		p1=node[i];
        		p2=node[0];
        	}
        	else
        	{
        		x1=Math.abs(xyCoordinate[i+1][0]-xyCoordinate[i][0]);
        		x2=Math.abs(xyCoordinate[i+1][1]-xyCoordinate[i][1]);
        		p1=node[i];
        		p2=node[i+1];
        	}
        	distance=Math.sqrt(Math.pow(x1,2)+Math.pow(x2,2));
        	totalDistance=totalDistance+distance;
        	System.out.println("Edge "+p1+" - "+p2+"  Distance "+ distance);
        	
        	///////////////////////////
        	
        }
       */
        CreateTour dis=new CreateTour();
        distance=dis.distanceCalulation(node,maxSize);
        OPT_4 opt4=new OPT_4();
        
        opt4.copyNode(node,maxSize,distance);
        /*
        DrawPath dd=new DrawPath();
		JFrame jf=new JFrame();
		jf.setTitle("Traveling Salesman Problem");
		jf.setSize(600,600);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.add(dd);
        System.out.println();
		
       dd.copyCoordinate(xyCoordinate,maxSize);*/
  }
}

