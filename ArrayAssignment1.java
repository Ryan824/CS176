
public class ArrayAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

double [] values = {25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};
for (int i = 0; i < values.length; i++)
{
	System.out.print(values[i] + " ");
}
System.out.println("");

double largest = values[0];
for (int i = 0; i < values.length; i++)
{
	if (values[i] > largest)
	{
		largest = values[i];
	}
	
}
System.out.println("The largest value is: " + largest);
		
int negative = 0;
for (int i = 0; i < values.length; i++)
{
	if (values[i] < 0)
	{
		negative++;
	}
	
}
System.out.println("There are " + negative + " negative numbers in the array.");
	
	}

}
