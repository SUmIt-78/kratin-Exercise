import java.time.LocalTime;

public class tasklist {
	private String taskName;
	private String status = "NotCompleted";
	private LocalTime time;

	void setTime(int hour, int min) {
		this.time = LocalTime.of(hour, min);
	}

	public tasklist(String taskName, LocalTime time) {
		super();
		this.taskName = taskName;
		this.time = time;
	}

	String getName() {
		return this.taskName;
	}

	void changeStatus() {
		status = "Completed";
	}

	public String toString() {
		return "{" + "taskName :" + taskName + "  Time :" + time + "  status :" + status + "}";
	}

}
