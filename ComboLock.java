
public class ComboLock {

	private int currentPos;
	private int turn;
	private int guess1;
	private int guess2;
	private int guess3;
	private int secret1;
	private int secret2;
	private int secret3;

	public ComboLock(int secret1, int secret2, int secret3)
	{
		this.secret1 = secret1;
		this.secret2 = secret2;
		this.secret3 = secret3;
		currentPos = 0;
		turn = 0;
	}

	public void turnRight(int ticks)
	{
		currentPos = (currentPos - ticks);
		if (currentPos < 0)
		{
			currentPos = 40 + currentPos;
		}
		guess1 = currentPos;
		turn++;
	}

	public void turnLeft(int ticks)
	{
		currentPos = (currentPos + ticks);
		if (currentPos >= 40)
		{
			currentPos = currentPos;
		}
		currentPos = Math.abs(currentPos);
		guess2 = currentPos;
		turn++;
	}
	
	public void turnRight2(int ticks)
	{
		currentPos = (currentPos - ticks);
		if (currentPos < 0)
		{
			currentPos = 40 + currentPos;
		}
		guess3 = currentPos;
		turn++;
	}

	public int turn()
	{
		return turn;
	}

	public boolean open()
	{
		if (guess1 == secret1 && guess2 == secret2 && guess3 == secret3)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public void reset()
	{
		currentPos = 0; 
		turn = 0;
	}



}
