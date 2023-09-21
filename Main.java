import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число");
		String inpnum;
		inpnum = scanner.nextLine();
		int[] fib = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711};
		int dec = 0;
		for (int i = inpnum.length()-1; i >= 0; i--)
		{
			if (inpnum.toCharArray()[i] >= '0' && inpnum.toCharArray()[i] <= '9')
                       	{
				dec += (int)(inpnum.toCharArray()[i]-'0')*fib[inpnum.length()-1-i];
                        }
		}
		System.out.println(dec);
	}
}
