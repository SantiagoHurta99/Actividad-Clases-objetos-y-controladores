package punto_4_5;

public class Student {
	private String fName = "Lisa";
	private String lName = "Palombo";
	private int stuId = 123456789;
	private String stuStatus = "Active";

	public Student() {
	}
	
	public Student(String fName, String lName, int stuId, String stuStatus) {
		this.fName = fName;
		this.lName = lName;
		this.stuId = stuId;
		this.stuStatus = stuStatus;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}
	
	public String getlName() {
		return lName;
	}
	
	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getStuId() {
		return stuId;
	}
	
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuStatus() {
		return stuStatus;
	}
	
	public void setStuStatus(String stuStatus) {
		this.stuStatus = stuStatus;
	}
}
