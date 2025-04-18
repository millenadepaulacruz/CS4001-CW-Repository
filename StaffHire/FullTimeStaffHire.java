public class FullTimeStaffHire extends StaffHire
{
    private double salary;
    private int weeklyFractionalHours;

    public FullTimeStaffHire(int vacancyNumber, String designationType, String jobType, String staffName, String joiningDate, String qualification, String appointedBy,
    boolean joined, double salary, int weeklyFractionalHours){
        super(vacancyNumber,designationType, jobType, staffName, joiningDate, qualification, appointedBy, joined);
        this.salary = salary;
        this.weeklyFractionalHours = weeklyFractionalHours;
    }

    public double getSalary(){
        System.out.println(super.vacancyNumber);
        return salary;
    }

    public double setNewSalary(double salary){
        double newSalary = 0.0;
        if(joined) {
            this.salary = salary;
            return salary;
        } else {
            return -1;
        }
    }

    public int getWeeklyFractionalHours(){
        return weeklyFractionalHours;
    }

    public void setWeeklyFractionalHours(int weeklyFractionalHours){
        if(joined) {
            this.weeklyFractionalHours = weeklyFractionalHours;
            System.out.println("New working hours have been set for " + staffName);
            System.out.println("New hours: " + weeklyFractionalHours + " weekly.");
        } else {
            System.out.println("Employee status: not enrolled.");
            System.out.println("New working hours cannot be set yet.");
        }
    }

    @Override 
    public String displayInfo(){ //declare as string to return a string
        String fullTimeInfo = super.displayInfo();
        if (joined) {
            fullTimeInfo += "\nSalary: " + salary + " yearly.";
            fullTimeInfo += "\nWorking hours: " + weeklyFractionalHours + " weekly.";
        } else {
            fullTimeInfo += "\nSalary and working hours not available.";
        }
        return fullTimeInfo + "\n";
    }
}
