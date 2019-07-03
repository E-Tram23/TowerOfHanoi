
public class TowerOfHanoi {
	
	private int numberOfDisks;
	private Pole [] poles;
	
	TowerOfHanoi()//constructor that makes tower
	{
		numberOfDisks=7;
		poles= new Pole[3];
		
		Pole aPole1 = new Pole(7);
		for(int i=7;i>=1;i--)
		{
			aPole1.addDisk(new Disk(i));
		}
		Pole aPole2 = new Pole(7);
		Pole aPole3 = new Pole(7);
		
		poles[0] = aPole1;
		poles[1] = aPole2;
		poles[2] = aPole3;
	}
	TowerOfHanoi(int aNumberOfDisks)//constructor that makes a variable number of disks tower
	{
		numberOfDisks=aNumberOfDisks;
		poles= new Pole[3];
		
		Pole aPole1 = new Pole(aNumberOfDisks);
		for(int i=aNumberOfDisks;i>=1;i--)
		{
			aPole1.addDisk(new Disk(i));
		}
		Pole aPole2 = new Pole(aNumberOfDisks);
		Pole aPole3 = new Pole(aNumberOfDisks);
		
		poles[0] = aPole1;
		poles[1] = aPole2;
		poles[2] = aPole3;
	}
	public Disk peekTopDisk(int aPoleNumber)//returns the top disk if not null
	{
		if(aPoleNumber==1||aPoleNumber==2||aPoleNumber==3)
		{
			if(poles[aPoleNumber-1].getNumberOfDisks()==0)
			{
				if(poles[0].getMaxNumberOfDisks()==0)
				{
					return null;
				}
				else
				{
				return null;
				}
			}
			else
			{
				return poles[aPoleNumber-1].peekTopDisk();
			}
		}

		else
		{
			return null;
		}
	}
	public int getNumberOfDisks(int aPoleNumber)//returns number of disks 
	{
		if (aPoleNumber==1)
		{
			return poles[0].getNumberOfDisks();
		}
		else if(aPoleNumber==2)
		{
			return poles[1].getNumberOfDisks();
		}
		else if (aPoleNumber==3)
		{
			return poles[2].getNumberOfDisks();
		}
		else
		{
			return -1;
		}
	}
	public String toString()//String represntation of tower, using split and 2 sep forloops
	{
		String[] p1= poles[0].toString().split("\n");
		String[] p2= poles[1].toString().split("\n");
		String[] p3= poles[2].toString().split("\n");
		
		StringBuilder towS = new StringBuilder();
		
		
			for(int a=0;a<(numberOfDisks) ;a++)//The first 2 forloops prints the numbers above pole
			{
				towS.append(" ");
			}
			towS.append(1);
			for(int a=0;a<(numberOfDisks) ;a++)
			{
				towS.append(" ");
			}
		
		for(int i=2;i<=3;i++)
		{
			for(int a=0;a<(numberOfDisks+1) ;a++)
			{
				towS.append(" ");
			}
			towS.append(i);
			for(int a=0;a<(numberOfDisks) ;a++)
			{
				towS.append(" ");
			}
		}
		towS.append("\n");
	      	for (int i=0;i<numberOfDisks+2;i++) //Prints rest of tower
	       {
	    	   towS.append(p1[i].toString()) ;
	           
	    	  if(i==numberOfDisks+1)
	    	  {
	    		  towS.append("=");
	    	  }
	    	  else
	    	  {
	    		  towS.append(" ");
	    	  }
	           towS.append(p2[i].toString()) ;
	          if(i==numberOfDisks+1)
	          {
	        	  towS.append("=");
	          }
	          else
	          {
	        	  towS.append(" ");
	          }
	           towS.append(p3[i].toString()) ;
	           towS.append("\n");
	       } 
		
		return towS.toString();
	}
	
	public boolean move(int fromPole, int toPole)//Moving poles and return false if not able to move
	{
		if (poles[fromPole-1].getNumberOfDisks()==0)
		{
			return false;
		}
		else if(poles[toPole-1].getNumberOfDisks()>poles[toPole-1].getMaxNumberOfDisks())
		{
			return false;
		}
		else
		{
		poles[toPole-1].addDisk(poles[fromPole-1].peekTopDisk());
		poles[fromPole-1].removeDisk();
		
		return true;
		}
	}
	public void reset()//resets tower
	{
		Pole aPole1 = new Pole(numberOfDisks);
		for(int i=numberOfDisks;i>=1;i--)
		{
			aPole1.addDisk(new Disk(i));
		}
		Pole aPole2 = new Pole(numberOfDisks);
		Pole aPole3 = new Pole(numberOfDisks);
		
		poles[0] = aPole1;
		poles[1] = aPole2;
		poles[2] = aPole3;
	}
	

}
