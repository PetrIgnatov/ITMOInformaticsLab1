import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число, основание базовой системы счисления и основание итоговой системы счисления (число, fib для фиббоначиевой, b для Бергмана, fact для факториальной)");
		String inpnum, inpsys, finsys;
		inpnum = scanner.nextLine();
		inpsys = scanner.nextLine();
		finsys = scanner.nextLine();
		int[] fib = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711};
		int dec = 0;
		for (int i = inpnum.length()-1; i >= 0; i--)
		{
			switch (inpsys)
			{
				case "fib":
					if (inpnum.toCharArray()[i] >= '0' && inpnum.toCharArray()[i] <= '9')
                       			{
                		                dec += (int)(inpnum.toCharArray()[i]-'0')*fib[inpnum.length()-1-i];
		                        }
					else
					{
						dec += (int)(inpnum.toCharArray()[i]-'A'+10)*fib[inpnum.length()-1-i];
					}
					break;
				default:
					if (inpnum.toCharArray()[i] >= '0' && inpnum.toCharArray()[i] <= '9')
					{
						dec += (int)(inpnum.toCharArray()[i]-'0')*Math.pow((int)Double.parseDouble(inpsys),inpnum.length()-1-i);
					}
					else
					{
                               			dec += (int)(inpnum.toCharArray()[i]-'A'+10)*Math.pow((int)Double.parseDouble(inpsys),inpnum.length()-1-i);
                        		}
					break;
			}
		}
		String ans = "";
		while (dec > 0)
		{
			int cur = dec%(int)Double.parseDouble(finsys);
			if (cur < 10)
			{
				ans = (char)('0'+cur)+ans;
			}
			else
			{
				ans = (char)('A'+cur-10)+ans;
			}
			dec /= (int)Double.parseDouble(finsys);
		}
		System.out.println(ans);
	}
}
