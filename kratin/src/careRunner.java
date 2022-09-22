import java.util.Scanner;

public class careRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"HEY! we Welcome you on our elderly care prtotype.To start with it please enter the following details");
		System.out.println("Enter your name:");
		String a = scan.nextLine();
		System.out.println("Enter your age:");
		int b = scan.nextInt();
		System.out.println("Enter your height(cm):");
		Double c = scan.nextDouble();
		personalData data = new personalData(a, b, c);
		System.out.println(
				"*******************************************************************************************************************************************************************");
		int l = 0;
		System.out.println("Lets explore with some MAIN MENU of our portal");
		do {
			System.out.println(
					"*******************************************************************************************************************************************************************");
			System.out.println("MAIN MENU");
			int x = data.menu();
			switch (x) {
			case 1:
				System.out.println(
						"*******************************************************************************************************************************************************************");
				System.out.println("Welcomes you to  our weight feature");
				System.out.println("Enter your weight(in Kg)");
				int wt = scan.nextInt();
				data.setWt(wt);
				data.checkWt();
				break;
			case 2:
				System.out.println(
						"*******************************************************************************************************************************************************************");
				System.out.println("Welcomes you to  our Blood Pressure monitoring feature");
				System.out.println("Enter your Blood Pressure(in 'mmHg')");
				int bp = scan.nextInt();
				data.setBP(bp);
				data.checkBP();
				break;
			case 3:
				System.out.println(
						"*******************************************************************************************************************************************************************");
				System.out.println("Welcomes you to  our Create your own TASKLIST feature");
				System.out.println(
						"Under this feature you can add task name and time at which you want to shedule your task");
				int q = 3;
				do {
					System.out.println("Enter your task name:");
					scan.nextLine();
					String tn = scan.nextLine();
					System.out.println("Enter the time you want to shedule for this task");
					System.out.println("Enter time(in Hours)(space)(in Minutes)[24hr format]");
					int hr = scan.nextInt();
					int min = scan.nextInt();
					data.addTask(tn, hr, min);
					System.out.println(
							"*******************************************************************************************************************************************************************");
					System.out.println("Press 0 if you want to add another task.");
					System.out.println("Press 1 to explore other options avilable for TASKLIST");
					System.out.println("Press 2 to go back on MAIN MENU");
					System.out.println(
							"*******************************************************************************************************************************************************************");
					System.out.println("Enter your choice");
					q = scan.nextInt();

				} while (q == 0);
				while (q == 1) {
					System.out.println(
							"*******************************************************************************************************************************************************************");
					char y;
					System.out.println("Welcomes you.The options avilable for TASKLIST are :");
					do {
						System.out.println(
								"*******************************************************************************************************************************************************************");
						System.out.println("Press a to view your created TASKLIST");
						System.out.println("Press b to update the status of completed tasks");
						System.out.println("Press c to delete particular task from TASKLIST");
						System.out.println("Press d to clear all tasks from TASKLIST");
						System.out.println("Press e to go back on the main MENU");
						System.out.println("Enter the choice here:");
						y = scan.next().charAt(0);

						switch (y) {
						case 'a':
							System.out.println(
									"*******************************************************************************************************************************************************************");
							data.myTasks();
							break;
						case 'b':
							System.out.println(
									"*******************************************************************************************************************************************************************");
							System.out.println("Enter the task name which you have completed :");
							scan.nextLine();
							String test = scan.nextLine();
							data.updateStatus(test);
							break;
						case 'c':
							System.out.println(
									"*******************************************************************************************************************************************************************");
							System.out.println("Enter the task name which you want to delete :");
							scan.nextLine();
							String test1 = scan.nextLine();
							data.removeTask(test1);
							break;
						case 'd':
							System.out.println(
									"*******************************************************************************************************************************************************************");
							data.clear();
							break;
						case 'e':
							q = 5;
							break;
						default:
							System.out.println(
									"*******************************************************************************************************************************************************************");
							System.out.println("Please enter valid choice");
							break;
						}
					} while (y != 'e');
				}
				break;

			case 4:
				System.out.println(
						"*******************************************************************************************************************************************************************");
				System.out.println(data);
				break;
			case 5:
				l = 5;
				break;
			default:
				System.out.println("Please enter valid choice");
				break;
			}
		} while (l == 0);
		System.out.println(
				"*******************************************************************************************************************************************************************");
		System.out.println("THANK YOU!");
	}

}
