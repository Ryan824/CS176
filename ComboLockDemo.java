import java.util.Scanner;
public class ComboLockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int secret1 = 10;
		int secret2 = 20;
		int secret3 = 30;
		ComboLock mycomboLock = new ComboLock(secret1,secret2,secret3);
		while(true)
		{
			mycomboLock.reset();
			System.out.println("Enter number of ticks to turn to the right 0 - 39. Enter an invalid number to quit");
			int ticksRight1 = in.nextInt();
			if (ticksRight1 >= 0 && ticksRight1 <= 39)
			{
				mycomboLock.turnRight(ticksRight1);
			}
			else
			{
				break;
			}
			System.out.println("Enter number of ticks to turn to the left 0 - 39. Enter an invalid number to quit");
			int ticksLeft = in.nextInt();
			if (ticksLeft >= 0 && ticksLeft <= 39)
			{
				mycomboLock.turnLeft(ticksLeft);
			}
			else
			{
				break;
			}
			System.out.println("Enter number of ticks to turn to the right 0 - 39. Enter an invalid number to quit");
			int ticksRight2 = in.nextInt();
			if (ticksRight2 >= 0 && ticksRight2 <= 39)
			{
				mycomboLock.turnRight2(ticksRight2);
			}
			else
			{
				break;
			}
			if (mycomboLock.turn() == 3)
			{
				if (mycomboLock.open())
				{
					System.out.println("You have opened the lock!");
					new ComboLock(secret1 + 5, secret2 + 5, secret3 + 5);
				}
				else
				{
					System.out.println("You have not opened the lock!");
				}
			}
		}
	}

}
