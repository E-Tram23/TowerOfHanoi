


public class Pole {
	private int maxNumberOfDisks;
	private Disk[] disks;
	private int numberOfDisks;
    private int maxDiskSize;
    private char PoleChar;
    String diskS;
    int diskL;
    String diskS2;
    int diskL2;
    
  public Pole(int aMaxNumberOfDisk, int aMaxDiskSize, char aPoleChar)
	{
		if (aMaxNumberOfDisk<1)
		{
			maxNumberOfDisks=1;
		}
		else
		{
			maxNumberOfDisks=aMaxNumberOfDisk;
		}
		if(aMaxDiskSize<1)
		{
			maxDiskSize=1;
		}
		else
		{
			maxDiskSize=aMaxDiskSize;
		}
		disks= new Disk[maxNumberOfDisks];
		numberOfDisks=0;
		PoleChar=aPoleChar;
	}
	
  public Pole(int aMaxNumberOfDisk, int aMaxDiskSize)
	{
		if (aMaxNumberOfDisk<1)
		{
			maxNumberOfDisks=1;
		}
		else
		{
			maxNumberOfDisks=aMaxNumberOfDisk;
		}
		if(aMaxDiskSize<1)
		{
			maxDiskSize=1;
		}
		else
		{
			maxDiskSize=aMaxDiskSize;
		}
		disks= new Disk[maxNumberOfDisks];
		numberOfDisks=0;
		PoleChar=('|');
	}
	
  public Pole(int aMaxNumberOfDisk)
	{
		if (aMaxNumberOfDisk<1)
		{
			maxNumberOfDisks=1;
		}
		else
		{
			maxNumberOfDisks=aMaxNumberOfDisk;
		}
		
		disks= new Disk[aMaxNumberOfDisk];
		
		numberOfDisks=0;
		maxDiskSize=aMaxNumberOfDisk;
		PoleChar=('|');
	
	}
	
  public int getMaxNumberOfDisks()
	{
		return maxNumberOfDisks;
	}
	
  public int getMaxDiskSize()
	{
		return maxDiskSize;
	}
	
  public int getNumberOfDisks()
	{
		return numberOfDisks;
	}
	
  public Disk peekTopDisk()//Looks at top disk and returns if null
	{
	  	
	  	if(numberOfDisks==0)
		{
			//System.out.println(disks.length);
			return null;
		}
		
		else 
		{
			return disks[numberOfDisks-1];
		}
	}
	
  public String toString() //***TO STRING***
	{	
		StringBuilder poleS = new StringBuilder();
		
		for(int i=numberOfDisks;i<=maxNumberOfDisks;i++)
		{
			for(int a=0;a<(maxDiskSize) ;a++)
			{
				poleS.append(" ");
			}
			poleS.append(PoleChar);
			for(int a=0;a<(maxDiskSize) ;a++)
			{
				poleS.append(" ");
			}
			poleS.append("\n");
		}
		
		for (int i=numberOfDisks-1;i>=0; i--)
		{
			diskS=disks[i].toString();
			diskL=(diskS.length()-1)/2;
			
			for(int a=diskL;a<maxDiskSize;a++)
				{
					poleS.append(" ");
				}
			poleS.append(disks[i]);
			for(int a=diskL;a<(maxDiskSize) ;a++)
				{
					poleS.append(" ");
				}
			poleS.append("\n");
			
		}
		for(int a=0;a<((maxDiskSize*2)+1) ;a++)
			{
				poleS.append("=");
			}
		
		return poleS.toString();
	}
	
  public boolean addDisk(Disk aDisk)//*ADD DISK* 
	
	{
		diskS2=aDisk.toString();
		diskL2=(diskS2.length()-1)/2;
		
		if ((numberOfDisks < disks.length&&diskL2<=maxDiskSize))
		{
			disks[numberOfDisks] = aDisk;
			numberOfDisks++;
			return true;
		}
		else
		{
			//System.out.println("No more room!!!!");
			return false;
		}
	
	}
	
  public Disk removeDisk()
	{
		if((numberOfDisks==0))
		{
			return null;
		}
		else
		{
			numberOfDisks=numberOfDisks-1;
			return disks[numberOfDisks];
		}
	
	}

}
