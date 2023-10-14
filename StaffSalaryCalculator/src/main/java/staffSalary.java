import javax.swing.JOptionPane;
public class staffSalary {
    public static void main(String[] args) {
        
        staffInfos jack = new staffInfos("",0,0.0,0.0);
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "What is your staff number?"));
        String desc = JOptionPane.showInputDialog(null, "What is your position?");
        double rate = Double.parseDouble(JOptionPane.showInputDialog(null, "What is your hourly rate?"));
        double hours = Double.parseDouble(JOptionPane.showInputDialog(null, "How many hours have you worked this month?"));
        jack.setStaffNum(num);
        jack.setDescription(desc);
        jack.setHoursWorked(hours);
        jack.setRate(rate);
        jack.monthlyPayment();
        jack.staffDescription();
        
    }
    
}
