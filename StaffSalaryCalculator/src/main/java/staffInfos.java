import javax.swing.JOptionPane;

public class staffInfos extends Staff{

    staffInfos(String desc, int num, Double rate, Double hours){
        super(desc, num, rate, hours);
    }
    
    @Override
    void monthlyPayment() {
        double pay;
        double cleaner = 0.14, lecturer = 0.20, admin = 0.17;
        if(rate<=500){
      
            if(hours_worked<=200){
                
                if(staff_description.equals("cleaner")){
                    pay = hours_worked * rate;
                    payment = pay - (pay*cleaner);
                    
                }
                else if(staff_description.equals("lecturer")){
                    pay = hours_worked * rate;
                    payment = pay - (pay*lecturer);
                    
                }
                else if(staff_description.equals("admin")){
                    pay = hours_worked * rate;
                    payment = pay - (pay*admin);
                  
                }
            }       
        }
        ;
    }

    @Override
    void staffDescription() {
        JOptionPane.showMessageDialog(null, 
                "Staff Number: "+staff_number+
                "\nDescription: "+staff_description+
                "\nHours Worked: "+hours_worked+
                "\nRate: "+rate+
                "\nPay After Tax: "+payment);
    }
    
}
