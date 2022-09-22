import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class personalData {
//
	private String name;
	private Double height;
	private int age;
	private int wt;
	private int BP;
	private ArrayList<tasklist> taskManager = new ArrayList<tasklist>();

	// we are registering users in such a way that the user should share his/her
	// name age and height to get register
	public personalData(String name, int age, double height) {
		super();
		this.name = name;
		if (age > 0) {
			this.age = age;
		}
		if (height > 0) {
			this.height = height;
		}
		System.out.println("You have sucessfully registered on our portal having following details \nName:" + name
				+ "\nAge:" + age + "\nHeight:" + height);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Double getHeight() {
		return this.height;
	}

//users can also add another data such as weight and BP
	public int getWt() {
		return wt;
	}

	public void setWt(int wt) {
		if (wt > 0) {
			this.wt = wt;

		}
	}

	public int getBP() {
		return BP;
	}

	public void setBP(int bP) {
		if (bP > 0) {
			BP = bP;
		}
	}

//comparing the weight this some standard weights
	void checkWt() {
		int wt = getWt();

		if (wt >= 35 && wt <= 70) {
			System.out.println("Healthy Weight." + " Congratulations you are within the defined range of weight");
		} else if (wt < 35) {
			System.out.println("Underweight." + " You are below the standered defined weight."
					+ " You must seek professional medical help to find reason and remedy for it");
		} else {
			System.out.println("Overweight." + " Your weight is above the standard weight."
					+ " It denotes that you are at risk of several diseases and have to adopt remedial measures for weight loss");
		}
	}

//checking the BP with some standard values the values which I used in program are just for practice
	void checkBP() {
		int BP = getBP();
		if (BP >= 70 && BP <= 120) {
			System.out.println("Normal Blood Pressure");
		} else if (BP > 120) {
			System.out.println("High Blood Pressure" + " You should inform about this to your home Doctor");
		} else {
			System.out.println("Low Blood Pressure" + " You should inform about this to your home Doctor");
		}
	}

// user can make His/her own task-list he can mention task name and task time for that
	void addTask(String name, int hr, int min) {
		LocalTime time = LocalTime.of(hr, min);
		taskManager.add(new tasklist(name, time));
		System.out.println("the task named " + name + " is sucessfully added in list");
	}

	// if we completed the task we can change the status of task using update task
	// method
	void updateStatus(String name) {
		boolean a = false;
		for (tasklist task : taskManager) {
			if (task.getName().equalsIgnoreCase(name)) {
				task.changeStatus();
				a = true;
			}
		}
		if (a == true) {
			System.out.println("your status for task named " + name + " is sucessfully changed");

		} else {

			System.out.println("OOPS! " + "Your task " + name + " is not added in list");
		}

	}

	void removeTask(String taskName) {
		Iterator<tasklist> it = taskManager.iterator();
		boolean xz = false;
		while (it.hasNext()) {
			if (it.next().getName().equals(taskName)) {
				it.remove();
				xz = true;
			}
		}
		if (xz == true) {
			System.out.println("your task named " + taskName + " is sucessfully deleted from list");
		} else {
			System.out.println("OOPS! " + "Your task " + taskName + " is not present in list");
		}

	}

	void clear() {
		taskManager.clear();
		System.out.println("Sucessfully Cleared all the task from your list.Now your list is empty");

	}

	void myTasks() {
		System.out.println(taskManager);
	}

	int menu() {
		int a;
		Scanner scan = new Scanner(System.in);
		System.out.println("Press 1 to check in which category your weight lies");
		System.out.println("Press 2 to know your Blood Pressure category");
		System.out.println("Press 3 to make your own TASKLIST so that you dont forget your TASKS");
		System.out.println("Press 4 to view your  complete profile");
		System.out.println("press 5 to get exit from menu");
		System.out.println("Enter you choice:");
		a = scan.nextInt();
		return a;
	}

	// to string to see all variables declared in program
	public String toString() {
		return ("your health Profile :" + "\nName :" + name + "\nage :" + age + "\nheight :" + height + "\nweight :"
				+ wt + "\nBlood Pressure :" + BP + " \nYour scheduled TASKS are :\n" + taskManager);
	}
}
