import java.util.Scanner;

public class Disk {
	
	private int diskSize;
	private char diskChar;
	private char poleChar;
	private String diskString;
	

	public Disk(int aDiskSize, char aDiskChar, char aPoleChar)//constructor for diff disks
	{
			diskSize= aDiskSize;
			diskChar= aDiskChar;
			poleChar= aPoleChar;
		
	}
	public Disk(int aDiskSize)//constructor for standard
	{
		 diskSize=aDiskSize;
		 diskChar=('*');
		 poleChar=('|');
		
	}
	public int getSize()//returns size
	{
		if (diskSize<=0)
		{
			diskSize=1;
		}
		return diskSize;
	}
	public String toString()//to string returns a string rep
	{
		StringBuilder diskString = new StringBuilder();
		
		for(int i=0;i<(diskSize) ;i++)
		{
			diskString.append(diskChar);
		}
		
		diskString.append(poleChar);
		
		for(int i=0;i<(diskSize) ;i++)
		{
			diskString.append(diskChar);
		}
		
		return diskString.toString();
	
	}
	
	
	
	
}
