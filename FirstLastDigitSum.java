
public class FirstLastDigitSum {
	
	public static void main (String[] args)
	{
		System.out.println(sumFirstAndLastDigit(423423453));
	}
	
	public static int sumFirstAndLastDigit (int number)
	{
		if (number <0)
		{
			return -1;
		}
		else
		{
			int sum=0;
			int lastNumber = number%10;
			
			int newNumber=number;
			int remainder =0;
			while (newNumber != 0)
			{
				remainder = newNumber%10;
				newNumber= newNumber/10;
			}
			sum = lastNumber + remainder;
			return sum;
		}
	}

}
