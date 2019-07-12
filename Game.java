import java.util.*;
class Hangman extends RuntimeException
{
	String message;
	Hangman()
	{

	}
	Hangman(String message)
	{
		this.message=message;
	}
	public String getMessage()
	{
		return this.message;
	}
}
class Jumble extends RuntimeException
{
	String msg;
	Jumble()
	{

	}
	Jumble(String msg)
	{
		this.msg=msg;
	}
	public String getMessage()
	{
		return this.msg;
	}
}
public class Game
{
	public static void main(String... args)
	{
			int c=1;
			int count=0;
			int flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("-----MENU------");
		System.out.println("---------------------------------");
		System.out.println("1.Play the Game");
		System.out.println("2.Read instructions");
		System.out.println("3.Exit Game");
		System.out.println("Enter your option:");
		System.out.println("=>");
		int input;
		input=s.nextInt();
		try
		{
			if(input>3)
			{
				throw new Hangman();
			}
			else if(input==1)
			{
				System.out.println("You will enter into the game in a few seconds..!");
				System.out.println("         The clue is that the word has 9 letters.......");
				System.out.println("                   And remember you can make only 3 wrong guesses.......");
				System.out.println("============================================================================");


				//System.out.println("Your option is being processed..");
				String a;

			String b="documents";
			Scanner ss=new Scanner(System.in);
			System.out.println("Enter your guessing character");
			a=ss.nextLine();
			b.toCharArray();
			a.toCharArray();
			try
			{
				do
					{
				if(a.length()>1)
				{
					throw new Jumble();
				}
				else
				{
					
						
					
					System.out.println("Your guess is being checked..");
					System.out.println("====================================");


					for(int i=0;i<b.length();i++)
					{
						
						if(a.charAt(0)==b.charAt(i))
						{
							flag=1;
							//System.out.println("Correct Guess");
							break;
						}


						
					
					}
					if(flag==1)
					{
						System.out.println("Correct Guess");
						System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
					}
					else
					{
						System.out.println("Sorry..Wrong guess");
						System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
						count++;
					}

					

				}
				if(count>=3)
					{
						System.out.println("===================");

						System.out.println("Game over...You made 3 wrong guesses");
						break;
				
					}

				c++;
					System.out.println("Enter the next Character:");
					Scanner sss=new Scanner(System.in);
					a=sss.nextLine();
					flag=0;
					//System.out.println("a="+a);

				}while(c<(9+count));
				if(count!=3)
				{
				
						System.out.println("================================");
						System.out.println("Congrats you got the correct word...");
					}
					
					
			}
			catch(Jumble j)
			{
				j=new Jumble("Only one character at a time...");
				System.out.println(j.getMessage());
			}


				}
			else if(input==2)
			{
				System.out.println("This a word game..There is a hidden word...");
				System.out.println("You can guess the letters and find the word...");
                                System.out.println("You can only make 3 wrong guesses...or else you fail..");
                                System.out.println("Have fun :)");
			}
			else
			{
				System.out.println("Thank you");
			}
			}
			catch(Hangman h)
			{
				h=new Hangman("Sorry..You have entered a wrong option. There are only 3 options...!");
				System.out.println(h.getMessage());
			}
			

	}
}