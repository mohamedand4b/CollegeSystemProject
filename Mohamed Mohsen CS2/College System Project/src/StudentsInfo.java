
public class StudentsInfo {
	private int id;
	static String name;
	static int collegeyear;
	static int feespaid = 0;
	static int feestotal = 35000;

	StudentsInfo(int id, String name, int collegeyear) {
		this.id = id;
		StudentsInfo.name = name;
		StudentsInfo.collegeyear = collegeyear;
		StudentsInfo.feespaid = 0;
		StudentsInfo.feestotal = 35000;

	}

	public StudentsInfo() {
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		StudentsInfo.name = name;
	}

	public void setCollegeyear(int collegeyear) {
		StudentsInfo.collegeyear = collegeyear;
	}

	public int getFeespaid() {
		return feespaid;
	}

	public void setFeespaid(int feespaid) {
		StudentsInfo.feespaid = feespaid;
	}

	public int getFeestotal() {
		return feestotal;
	}

	public void setFeestotal(int feestotal) {
		StudentsInfo.feestotal = feestotal;
	}

	public void setCollegeYear(int collegeyear) {
		StudentsInfo.collegeyear = collegeyear;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getCollegeyear() {
		return collegeyear;
	}

	public void updateFeesPaid(int fees) {
		feespaid += fees;
	}

	public int getrenainingfees() {
		return feestotal - feespaid;

	}

}
