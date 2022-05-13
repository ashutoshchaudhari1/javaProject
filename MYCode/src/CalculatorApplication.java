


import java.util.Scanner;

public class CalculatorApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String yn;
		do {
			Scanner s= new Scanner(System.in);
		double fnum,snum,ans;
		System.out.println("Enter first num: ");
		fnum = s.nextDouble();
		System.out.println("Enter second num: ");
		snum = s.nextDouble();
		System.out.println("select Symbol (+,-,*,/)");
		String sym=s.next();
		switch(sym) {
		case"+":ans=fnum+snum;
		System.out.println("Addition is:"+ans);
		break;
		case"-":ans=fnum-snum;
		System.out.println("Subtraction is:"+ans);
		break;
		case"*":ans=fnum*snum;
		System.out.println("Multiplication is:"+ans);
		break;
		case"/":ans=fnum/snum;
		System.out.println("Division is:"+ans);
		break;
		default:System.out.println("invalid symbol");
		break;
		}
		System.out.println("Do you want to countinue(press y for Yes and n for No. )");
		yn=s.next();
			
		}while(yn.equals("y")||yn.equals("Y"));
	}

}


