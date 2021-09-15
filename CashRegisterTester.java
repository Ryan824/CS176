import java.util.Scanner;
public class CashRegisterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);

CashRegister newCashRegister = new CashRegister();

System.out.println("Enter a purchase amount, or -1 to stop: ");

while (in.hasNextDouble())
{
	double saleAmount = in.nextDouble();
	if (saleAmount != -1)
	{
		System.out.println("Enter a purchase amount, or -1 to stop: ");
		newCashRegister.recordPurchase(saleAmount);
	}
	
	else
	{
		System.out.println("Enter payment: ");
		double paymentAmount = in.nextDouble();
		newCashRegister.recievePayment(paymentAmount);
		System.out.printf("Your change is: %.2f " , newCashRegister.giveChange());
	}
}

	
	
	}
	
	
}