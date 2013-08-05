/**
 * 
 * @author Bartholomew Brandner
 * @version 1.1 
 * <p>
 * Programmed for solving Project Euler #1
 * <ul>
 * <li>Version 1.0 Initially programmed on 11/24/2009</li>
 * <li>Version 1.1 Javadoc additions added on 7/5/2013</li>
 * </ul>
 * <br>
 * I realize that for such a simple program, the amount of comments are 
 * probably unnecessary.  However, I also believe strongly in good, thorough
 * documentation.  The heavy commenting is merely an extension of that 
 * philosophy.
 * <br><br>
 * Always code as if the guy who ends up maintaining your code will be a 
 * violent psychopath who knows where you live. --Martin Golding
 *</p>
 */

public class Euler1 
{
	private long answer;  //stores answer
	
	/**
	 * The constructor for this class only initializes the answer to 0.
	 */
	public void Euler1()
	{
		answer = 0;
	}
	
	/**
	 * The meat of the program, all calculations are performed in this method.
	 */
	public void oneToOneThousand()
	{
		System.out.println("Multiples:\tSum:");
		for( int i = 0; i < 1000; i++ )
		{
			if( ((i % 3) == 0) || ((i % 5) == 0) )  //tests to see if i is a multiple of 3 or 5
			{
				answer += i;
				System.out.println(i + "\t\t" + answer);
			}
		}
	}
	
	/**
	 * Merely returns the answer variable
	 * @return returns sum of multiples
	 */
	public long getAnswer()
	{
		return answer;
	}
	
	
	public static void main(String[] args) 
	{
		Euler1 theAnswer = new Euler1();
		theAnswer.oneToOneThousand();
		System.out.println("Final sum is: " + theAnswer.getAnswer());
	}

}
