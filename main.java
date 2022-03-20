import java.util.Scanner;

class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int num, perfect=0;
		
		System.out.println("Enter an integer: ");

do{
		Scanner input = new Scanner(System.in);
		System.out.println(“Please enter a positive integer: ");
		num = input.nextInt();
		input.close();
		}while(num<0);
		
		for(int i = 1; i<num; i++)
		{
			if(num%i==0)
			{
				perfect = perfect + i;
			}
		}
		
		if(perfect==num)
		{
			System.out.println(num+" is a perfect number");
		}
		else
		{
			System.out.println(num+" is not a perfect number");
		}
		
		
	}

}
