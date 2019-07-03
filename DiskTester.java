
import java.util.*;

public class DiskTester
{
	public static void main(String[] args)
	{
	
		TowerOfHanoi toh = new TowerOfHanoi(3);
		System.out.println(toh.peekTopDisk(1));
		System.out.println(toh);
		
	}
}