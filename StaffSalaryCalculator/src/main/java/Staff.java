abstract public class Staff {
    String staff_description;
    double payment;
    int staff_number;
    Double rate;
    Double hours_worked;
    abstract void  monthlyPayment();
    abstract void staffDescription();
    
    Staff(String desc, int num, Double rate, Double hours){
        staff_description = desc;
        staff_number = num;
        this.rate = rate;
        hours_worked = hours;
    }
    
    public void setDescription(String desc){
        staff_description = desc;
    }
    public String getDescription(){
        return staff_description;
    }
    
    public void setStaffNum(int num){
        staff_number = num;
    }
    public int getStaffNum(){
        return staff_number;
    } 
    
    public void setRate(Double rate){
        this.rate = rate;
    }
    public Double getRate(){
        return rate;
    }
    
    public void setHoursWorked(Double hours){
        hours_worked = hours;
    }
    public Double getHoursWorked(){
        return hours_worked;
    }
    public void setPay(double pay){
        payment = pay;
    } 
}
