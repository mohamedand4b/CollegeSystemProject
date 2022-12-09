import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<String> name = new ArrayList<>();
	static List<Integer> collegeyear = new ArrayList<>();
	static List<String> teachername = new ArrayList<>();
	static List<Integer> salary = new ArrayList<>();

	public static void main(String[] args) {

		int choice;
		int i = 0;
		int anotherchoice = 0;
		try (Scanner sc = new Scanner(System.in)) {
			try {
				do {

					System.out.println("enter 1 for student or 2 for professor");

					choice = sc.nextInt();

					if (choice == 1) {
						System.out.println("enter 1 to add a student or 2 for full list");
						anotherchoice = sc.nextInt();
						if (anotherchoice == 1) {
							System.out.println("enter the number of students to add");
							int size = sc.nextInt();

							for (int kk = 0; kk < size; kk++) {
								System.out.println('\n' + "enter student name");
								try {
									StudentsInfo.name = sc.next();
									name.add(StudentsInfo.name);
								} catch (Exception e) {
									e.printStackTrace();
								}
								System.out.println("enter student college year");
								try {
									StudentsInfo.collegeyear = sc.nextInt();
									collegeyear.add(StudentsInfo.collegeyear);
								} catch (Exception e) {
									e.printStackTrace();
								}
								System.out.println("enter fees paid");
								StudentsInfo.feespaid = sc.nextInt();
								StudentsInfo mas = new StudentsInfo();
								System.out.println("fees needed to be paid =" + mas.getrenainingfees());
								System.out.println('\n' + "the student's name is " + StudentsInfo.name + " "
										+ "there college year is " + StudentsInfo.collegeyear + " "
										+ "the fees they have paid " + StudentsInfo.feespaid);

							}

						} else if (anotherchoice == 2) {
							System.out.println("the names are" + name.toString());
							System.out.println("and there corresponding years are " + salary.toString());
						}

					}

					else if (choice == 2) {
						System.out.println("enter 1 to add a professors or 2 for full list");
						int anotherchoicee = sc.nextInt();
						if (anotherchoicee == 1) {
							
							System.out.println("enter the number of professors to add");

							int sizee1 = sc.nextInt();
							for (int kkl = 0; kkl < sizee1; kkl++) {
								System.out.println("enter professor name");
								TeacherInfo.Name = sc.next();
								teachername.add(TeacherInfo.Name);
								System.out.println("enter the professor salary");
								TeacherInfo.salary = sc.nextInt();
								salary.add(TeacherInfo.salary);
								System.out.println('\n' + "the professor's name is " + TeacherInfo.Name + " "
										+ "there salary is " + TeacherInfo.salary);

							}

						} else if (anotherchoicee == 2) {
							System.out.println("the names are" + teachername.toString());
							System.out.println("and there corresponding salary is " + salary.toString());
						}
					}

					System.out.println('\n' + "enter 1 if you want to enter new values or 0 to exist");
					i = sc.nextInt();

				} while (i == 1);
			} catch (InputMismatchException ex) {
				System.out.println("you entered invalid value");
			}
		}

	}
}
