import java.util.ArrayList;
import java.util.Scanner;

public class ColorSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
		
String SENTINAL = "Q";		
ArrayList <String> colors = new ArrayList <String>();

while(true)
{
	System.out.println("Enter a color or 'Q' to quit: ");
	String color = in.nextLine();
	if(color.equals(SENTINAL))
	{
		break;
	}
	else
	{
		colors.add(color);
	}
}

while(true)
{
	System.out.println("Enter a color to search for, or ‘Q’ to quit: ");
	String colorSearch = in.nextLine();
	if(colorSearch.equals(SENTINAL))
	{
		break;
	}
	else
	{
	SearchColor(colors, colorSearch);
	}
	
	}
}

public static void SearchColor(ArrayList <String> colors, String color)
{
	int searches = 0;
	boolean found = false;

for(String colorSearch : colors)
{
	searches++;
	if(colorSearch.equals(color))
	{
		found = true;
		break;
	}
}

if(found)

{
	System.out.println("The color " + color + " was found after " + searches + " searche(s)");
}
else
{
	System.out.println("The color " + color + " was not found after " + searches + " searche(s)");
}


	}
}