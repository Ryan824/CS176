import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Scanner;
/**
   This program demonstrates the measurable Country class.
 */
public class MeasurableTester
{
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 200;

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		//Countries
		System.out.println("Countries Data");
		Measurable[] countries = new Measurable[3];
		countries[0] = new Country("Uruguay", 176220);
		countries[1] = new Country("Thailand", 513120);
		countries[2] = new Country("Belgium", 30510);
		double avg=Data.average(countries);
		System.out.println("Average area: " + avg);
		System.out.println("Expected: 239950");
		System.out.println("");
		double maxData = Data.max(countries);
		System.out.println("Maximum area: " + maxData);
		System.out.println("Expected: 513120");
		System.out.println("");

		//Bank Accounts
		System.out.println("Bank account data");
		Measurable[] bank = new Measurable[3];
		bank[0] = new BankAccount(176220);
		bank[1] = new BankAccount(513120);
		bank[2] = new BankAccount(30510);
		avg=Data.average(bank);
		System.out.println("Average balance: " + avg);
		System.out.println("Expected: 239950");
		System.out.println("");
		maxData = Data.max(bank);
		System.out.println("Maximum balance: " + maxData);
		System.out.println("Expected: 513120");
		System.out.println("");

		//Quizzes
		System.out.println("Quiz data");
		Measurable[] quiz = new Measurable[5];
		quiz[0] = new Quiz(95);
		quiz[1] = new Quiz(80);
		quiz[2] = new Quiz(90);
		quiz[3] = new Quiz(50);
		quiz[4] = new Quiz(75);
		avg=Data.average(quiz);
		System.out.println("Average balance: " + avg);
		System.out.println("Expected: 78");
		System.out.println("");
		maxData = Data.max(quiz);
		System.out.println("Maximum balance: " + maxData);
		System.out.println("Expected: 95");

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		System.out.println("Enter metric to use, 1 for maximum, 2 for minimum, 3 for average:");
		int metric = in.nextInt();
		String metricToUse = " ";

		if (metric == 1)
		{
			metricToUse = "Maximum";
		}
		if (metric == 2)
		{
			metricToUse = "Minimum";
		}
		if (metric == 3)
		{
			metricToUse = "Average";
		}
		JButton button = new JButton("Get " + metricToUse + " Balance");
		panel.add(button);
		frame.add(panel);
		ActionListener listener = new ClickListener(bank, metricToUse);
		button.addActionListener(listener);

		JButton button2 = new JButton("Get " + metricToUse + " Area");
		panel.add(button2);
		ActionListener listener2 = new ClickListener(countries, metricToUse);
		button2.addActionListener(listener2);

		JButton button3 = new JButton("Get " + metricToUse + " Score");
		panel.add(button3);
		//frame.add(panel);
		ActionListener listener3 = new ClickListener(quiz, metricToUse);
		button3.addActionListener(listener3);

		frame.add(panel);
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}