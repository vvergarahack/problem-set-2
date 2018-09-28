/**
 * INSTRUCTIONS.
 * 
 * Problem Set 2 will test your knowledge and understanding of arithmetic
 * operators and String concatenation. You'll be asked use the Scanner to
 * read user input from the keyboard, and use this input later to compute
 * and print certain required values to the console. All of this is explained
 * (and demonstrated, when appropriate) in the README file.
 */
import java.util.Scanner;
public class ProblemSet2 {

	/**
	 * You need not modify the main method.
	 */
	Scanner in = new Scanner (System.in); //Scanner declared
	
	public static void main (String[] args) {
		ProblemSet2 ps2 = new ProblemSet2();
		ps2.sayHello();
		ps2.gradeMe();
		ps2.groupUs();
		ps2.info();
		ps2.initials();
	}
	
	public void sayHello() {
		System.out.println("What is your first name?");
		String First = in.nextLine();
		System.out.println("What is your last name?");
		String Last = in.nextLine();
		System.out.println("Hello, "+First+" "+Last+"!\n");
	}

	public void gradeMe() {
		System.out.println("Enter your first homework score:");
		double h1 = in.nextDouble();
		System.out.println("Enter your second homework score:");
		double h2 = in.nextDouble();
		System.out.println("Enter your third homework score:");
		double h3 = in.nextDouble();
		double hAvg = (h1+h2+h3)/3;
		System.out.println("Enter your first quiz score:");
		double q1 = in.nextDouble();
		System.out.println("Enter your second quiz score:");
		double q2 = in.nextDouble();
		System.out.println("Enter your third quiz score:");
		double q3 = in.nextDouble();
		double qAvg = (q1+q2+q3)/3;
		System.out.println("Enter your first test score:");
		double t1 = in.nextDouble();
		System.out.println("Enter your second test score:");
		double t2 = in.nextDouble();
		System.out.println("Enter your third test score:");
		double t3 = in.nextDouble();
		double tAvg = (t1+t2+t3)/3;
		double finalGrade = (hAvg*.15 + qAvg*.30 + tAvg*.55)/100;
		System.out.printf("Your Final Grade: %.2f ", finalGrade);
		System.out.println("%\n");
	}
	
	public void groupUs() {
		System.out.println("Enter the number of teachers on the field trip:");
		int stud = in.nextInt();
		System.out.println("Enter the number of students on the field trip:");
		int teach = in.nextInt();
		int buses = (int) Math.ceil((double)(stud+teach)/47);
		System.out.println(buses+" buses are required.\n");
	}
	
	public void info() {
		System.out.println("Enter your first name:");
		String first_name = in.nextLine();
		System.out.println("Enter your last name:");
		String last_name = in.nextLine();
		System.out.println("Enter your grade:");
		int grade = in.nextInt();
		System.out.println("Enter your age:");
		int age = in.nextInt();
		System.out.println("Enter your hometown:");
		in.nextLine();
		String hometown = in.nextLine();
		System.out.println("NAME     : "+first_name+" "+last_name+"\nGRADE    : "+grade+"\nAGE      : "+age+"\nHOMETOWN : "+hometown+"\n");
	}
	
	public void initials() {
		System.out.print("Enter your first name: ");
		String first_name = in.nextLine();
		System.out.print("Enter your middle name: ");
		String middle_name = in.nextLine();
		System.out.print("Enter your last name: ");
		String last_name = in.nextLine();
		char f = Character.toUpperCase((first_name.charAt(0)));
		char m = Character.toUpperCase(middle_name.charAt(0));
		char l = Character.toUpperCase(last_name.charAt(0));
		System.out.println("\nYour initials are "+f+m+l);
		in.close(); //Scanner close
	}
}