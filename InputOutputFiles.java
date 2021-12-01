import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
   Used to test the BlankLinesRemover class.
 */
public class InputOutputFiles
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner in = new Scanner(System.in);

		while (true)
		{
			System.out.println("Please enter the path to open the input file for example C:\\\\Downloads\\\\lines.txt: ");
			String filePath = in.next();

			try
			{
				File inputFile = new File(filePath);
				PrintWriter outputFile = new PrintWriter("outlines.txt");
				Scanner in2 = new Scanner(inputFile);


				while (in2.hasNext()) 
				{
					String what =in2.next();
					outputFile.println(what);
				}

				in2.close();
				outputFile.close();
				break;
			}
			catch (FileNotFoundException e)
			{
				System.out.println("File is not found, please try again ");
			}
		}
	}
}
