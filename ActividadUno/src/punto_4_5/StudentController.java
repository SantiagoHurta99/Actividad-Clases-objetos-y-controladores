//import javax.swing.JOptionPane;
package punto_4_5;

public class StudentController {
	
	public StudentController() {
	}
	
	public Student newStudent() {
		Student newSt = new Student("Lisa","Palombo",123456789,"Active");
//		Student newSt = new Student();
//		newSt.setfName(JOptionPane.showInputDialog("Ingrese el nombre:"));
//		newSt.setlName(JOptionPane.showInputDialog("Ingrese el apellido:"));
//		newSt.setStuId(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Id:")));
//		newSt.setStuStatus(JOptionPane.showInputDialog("Ingrese el estado:"));
		return newSt;
	}
	
	public String printStudent() {
		Student st = newStudent();
		String infoStudent = "Student Name: "+st.getfName()+" "+st.getlName()+"\nStudent ID: "+st.getStuId()+"\nStudent Status: "+st.getStuStatus();
		return infoStudent;
	}
}
