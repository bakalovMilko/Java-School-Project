package Homework;
import javax.swing.JOptionPane;
public class uniTuition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tuition = Double.parseDouble((String)JOptionPane.showInputDialog(null,
                "What is the beggining university tuition?",
                "Tuition",
                2,
                null,
                null,
                "Type the tuition here."));
		double total=0;
		for(int i=0; i<14; i++) {
			if(i>9) {
				total+=tuition;
			}
			tuition=tuition*1.6;
		}
		total=(int)(total*100)/100;
		JOptionPane.showMessageDialog(null,
                "The total sum for education is $"+ total + ".",
                null,
                0);
	}

}
