//import javax.swing.JOptionPane;
package punto_4_5;

public class Principal {
	public static void main(String[] args) {
		StudentController sc = new StudentController();
		
		String result = sc.printStudent();
//		JOptionPane.showMessageDialog(null, result);
		System.out.println(result);
	}
}
