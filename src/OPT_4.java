import java.util.Arrays;

public class OPT_4 {
int nodeList[],s=0,k,f,position,positionVal,diff;
/*Binary search*/
int linearSearch(int node[],int x,int maxSize)
{
	for(int i=0;i<maxSize;i++)
	{
		if(node[i]==x)
			return i;
	}
	return -1;
}
public void copyNode(int node[],int maxSize,double distance)
{
	int randomNode[]=new int[4];
	//int ttt[]=new int[maxSize];
	int updatedNode[]=new int[maxSize];
	int j=0,k=0,i1,i2,j1,j2,n,d=0,b=3,f=6,g=9;
	double updatedDistance;
	nodeList=node;
	
	for(int i=0;i<maxSize;i++)
	{
		System.out.print(node[i]+" ");
	}
	for(int x=0;x<maxSize;x++)
	{
		if(d==maxSize)
			d=0;
		if(b==maxSize)
			b=0;
		if(f==maxSize)
			f=0;
		if(g==maxSize)
			g=0;
		randomNode[0]=node[d];
		randomNode[1]=node[b];
		randomNode[2]=node[f];
		randomNode[3]=node[g];
		d=d+1;
		b=b+1;
		f=f+1;
		g=g+1;
	
	System.out.println();
	for(int i=0;i<4;i++)
	{
		System.out.print(randomNode[i]+" ");
	}
	//for(int i=0;i<4;i++)
	//{
		//n=randomNode[0];
	
		i1=randomNode[0];
		i2=randomNode[1];
		j1=randomNode[2];
		j2=randomNode[3];
		position=linearSearch(node,i1,maxSize);
		positionVal=node[position];
		updatedNode[0]=positionVal;
		////////////////////
		position=linearSearch(node,j1,maxSize);
		
		for(int i=0,a=1;i<3;i++)
		{
			position+=1;
			if(position==maxSize)
				position=0;
			positionVal=node[position];
			updatedNode[a]=positionVal;
			a++;
		}
		position=linearSearch(node,i2,maxSize);
		for(int i=0,a=4;i<3;i++)
		{
			position+=1;
			if(position==maxSize)
				position=0;
			positionVal=node[position];
			updatedNode[a]=positionVal;
			a++;
		}
		position=linearSearch(node,i1,maxSize);
		for(int i=0,a=7;i<3;i++)
		{
			position+=1;
			if(position==maxSize)
				position=0;
			positionVal=node[position];
			updatedNode[a]=positionVal;
			a++;
		}
		position=linearSearch(node,j2,maxSize);
		diff=maxSize-10;
		
		for(int i=0,a=10;i<diff;i++)
		{
			position+=1;
			if(position==maxSize)
				position=0;
			positionVal=node[position];
			updatedNode[a]=positionVal;
			a++;
			
		}
		System.out.println();
		for(int i=0;i<maxSize;i++)
		{
			System.out.print(updatedNode[i]+" ");
		}
		System.out.println();
		CreateTour dis=new CreateTour();
        updatedDistance=dis.distanceCalulation(updatedNode,maxSize);
        if(updatedDistance<distance)
        {
        	System.out.println("updated Distance "+updatedDistance);
        	distance=updatedDistance;
        	//node=updatedNode;
        	for(int y=0;y<maxSize;y++)
        	{
        		node[y]=updatedNode[y];
        	}
        	for(int e=0;e<maxSize;e++)
        	{
        		System.out.print(node[e]+" ");
        	}
        
        }
        else
        {
        	System.out.println("updated Distance1 "+distance);
        	System.out.println("updated list");
        	System.out.println();
        	for(int o=0;o<maxSize;o++)
        		System.out.print(node[o]+" ");
        	
        }
	
	}
	//}
	//System.out.println();
	
	//System.out.println(ttt[0]);
	
	/*
	 for(int i=0;i<maxSize;i++)
	 
	{
		randomNode[i][0]=nodeList[i];
		//System.out.println(randomNode[i][0]);
	}
	System.out.println("");
	for(int i=3;k<maxSize;i++,k++)
	{
		
		if(i==maxSize)
		{
			i=0;
			randomNode[j][1]=nodeList[i];
		}
		else
		{
			randomNode[j][1]=nodeList[i];
		}
		j++;
	}
	j=0;
	k=0;
	for(int i=6;k<maxSize;i++,k++)
	{
		if(i==maxSize)
		{	
			i=0;
			randomNode[j][2]=nodeList[i];
		}
		else
		{
			randomNode[j][2]=nodeList[i];
		}
		j++;
	}
	j=0;
	k=0;
	for(int i=9;k<maxSize;i++,k++)
	{
		if(i==maxSize)
		{	
			i=0;
			randomNode[j][3]=nodeList[i];
		}
		else
		{
			randomNode[j][3]=nodeList[i];
		}
		j++;
	}
	
	//****************Copy randomNode[][] to arr[] *******************/
	/*
	int arr[]=new int[4];
	for(int e=0;e<maxSize;e++)
	{
	for(int b=0;b<4;b++)
	{
		//System.out.print(randomNode[0][0]+" ");
		arr[b]=randomNode[e][b];
	}
	////////////////////////////
	/*
	 * 
	 *System.out.print(" ");
	 *for(int i=0;i<4;i++)
	 *{
	 *	System.out.print(arr[i]+" ");
	}*/
	//System.out.print(" ");
	
	/***********************Bubble Sorting**************************/
	/*
	for(int i=0;i<4-1;i++)
	{
		for(int s=0;s<4-i-1;s++)
		{
			if(arr[s]>arr[s+1])
			{
				int temp=arr[s];
				arr[s]=arr[s+1];
				arr[s+1]=temp;
			}
		}
	}
	for(int t=0;t<4;t++)//copy
	{
		updatedRandomNode[e][t]=arr[t];
	}
	}
	///////////printing////////
	for(int i=0;i<maxSize;i++)
	{
		System.out.println(randomNode[i][0]+" "+ randomNode[i][1]+" "+randomNode[i][2]+" "+randomNode[i][3]);
	}
	
	
	System.out.println("");
	for(int i=0;i<maxSize;i++)
	{
		for(int g=0;g<4;g++)
		{
			System.out.print(updatedRandomNode[i][g]+" ");
		}
		System.out.println();
	} */
}
}
