import java.util.Scanner;

public class TowerOfHanoiPuzzle {
	
	public static void main(String[]args){
		
		int loop1=1;
		
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Welcome to the Tower of Hanoi!");
		
		while(loop1==1) {
			int loop2=1;
			//**STEP 1**
			System.out.println("Please choose? ");
			System.out.println("1.Play Tower of Hanoi Puzzle.");
			System.out.println("2.Quit");
			int choice=keyboard.nextInt();
		
			if (choice==1)
			{
				//**STEP2**
				System.out.println("How many disks would you like to play with (between 1-64)?");
				int dNum=keyboard.nextInt();
				//**STEP3**
				TowerOfHanoi toh = new TowerOfHanoi(dNum);
				System.out.print(toh+ "\n");
				System.out.println("The goal is to move all "+dNum+" disks from pole 1 to pole 3.");
				System.out.print("The least number of moves for "+dNum+" Disks is ");
				System.out.print((int)(Math.pow(2, dNum))-1);
				System.out.print(" moves.\n");
				
				while(loop2==1)
				{
					//**STEP4**
					int loop3=1;
					System.out.println("Are you ready to play?(y/n)");
					String choice2=keyboard.next();
					
					if(choice2.equals("y"))
					{
						int nMoves=0;
						while(loop3==1)
						{
							System.out.print(toh+ "\n");
							if((toh.getNumberOfDisks(1)==0)&&(toh.getNumberOfDisks(2)==0))
							{
								//**STEP6**
								System.out.println("Congratulations!!!");
								System.out.println("Number of moves:"+nMoves);
								System.out.print("The least number of moves for "+dNum+" Disks is ");
								System.out.print((int)(Math.pow(2, dNum))-1);
								System.out.print(" moves.\n\n");
								loop3=2;
								loop2=2;
								break;
							}
							//**STEP5**
							System.out.println("Number of moves:"+nMoves);
							System.out.println("Enter <from><space><to> to move a disk: ");
							int fPole=keyboard.nextInt();
							int tPole=keyboard.nextInt();
							
							if ((fPole==0)&&(tPole==0))
							{
								loop3=2;
								loop2=2;
							}
							else if((fPole>3||fPole<1)||(tPole>3||tPole<1))
							{
								System.out.println("That pole doesnt exist!");
								nMoves++;
							}
						
							else 
							{
								String tString;
								String fString;
								int t;
								int f;
								
								
								if (toh.getNumberOfDisks(tPole)==0)
								{
									 
									 t=(dNum*2)+1;
								}
								else
								{
									 tString=toh.peekTopDisk(tPole).toString();
									 t=tString.length();
								}
								if(toh.getNumberOfDisks(fPole)==0)
								{
					
									 f=0;
								}
								else
								{
									fString=toh.peekTopDisk(fPole).toString();
									f=fString.length();
								}
								if(f>t)
								{
									System.out.println("You cannot move the top disk from pole "+fPole+" to pole "+tPole+".");
									System.out.println("The top disk of pole "+fPole+" is larger then the top disk of "+tPole+".\n");
									nMoves++;
								}
								else if(f==0)
								{
									System.out.println("There is no disk on that pole!");
									nMoves++;
								}
								else
								{
									toh.move(fPole, tPole);
									nMoves++;
								}
							}
						}
					}
					else if(choice2.equals("n"))
					{
						loop2=2;
					}
					else
					{
						System.out.println("Thats not an option.Enter (y/n). ");
						loop2=1;
					}
				}
			}
			else if(choice==2)
			{
				System.exit(0);
			}
			else
			{
				System.out.println("That is not an option. Select again.");
			}
		}
	}

}
