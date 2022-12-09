
public class TeacherInfo {
	private int id;
	static String Name;
	static int salary;

	TeacherInfo(int id, String name, int salary) {
		this.id = id;
		TeacherInfo.Name = name;
		TeacherInfo.salary = salary;

	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		TeacherInfo.salary = salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		TeacherInfo.Name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return Name;
	}

}
