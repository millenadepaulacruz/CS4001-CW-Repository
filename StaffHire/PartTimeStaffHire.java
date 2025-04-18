public class PartTimeStaffHire extends StaffHire
{
    private double workingHours;
    private double wagesPerHour;
    private String shifts;
    private boolean terminated;
    
    public PartTimeStaffHire(int vacancyNumber, String designationType, String jobType, String staffName, String joiningDate, String qualification, String appointedBy,
    boolean joined, double workingHours, double wagesPerHour, String shifts)
    {
        super(vacancyNumber,designationType, jobType, staffName, joiningDate, qualification, appointedBy,joined);
        this.workingHours = workingHours;
        this.wagesPerHour = wagesPerHour;
        this.shifts = shifts;
        this.terminated = false;
    }
    
    public double getWorkingHours(){
        return workingHours;
    }

    public void setWorkingHours(int workingHours){
        this.workingHours = workingHours;
    }
    
    public double getWagesPerHour(){
        return wagesPerHour;
    }

    public void setWagesPerHour(double wagesPerHour){
        this.wagesPerHour = wagesPerHour;
    }
    
    public String getShifts(){
        return shifts;
    }

    public String setWorkingShifts(String shifts){
        if (super.joined) {
            this.shifts = shifts;
            return "New shifts assigned to " + super.staffName;
        } else {
            return "Employee has not joined yet.";
        }
    }
    
    public boolean terminateStaff(){
        if(terminated){
            return true;
        } else {
            super.staffName = "";
            super.joiningDate = "";
            super.qualification = "";
            super.appointedBy = "";
            super.joined = false;
            terminated = true;
            return true;
        }
    }
    
    public boolean getTerminated(){
        if(terminated){
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public String displayInfo(){
        String partTimeInfo = super.displayInfo();
        if(workingHours != 0){
            partTimeInfo += "\nWages per hour: " + wagesPerHour;
            partTimeInfo += "\nDaily working hours: " + workingHours;
            partTimeInfo += "\nIncome per day: " + String.format("%.2f", wagesPerHour * workingHours);
            partTimeInfo += "\nShifts: " + shifts;
            if(!terminated){
                partTimeInfo += "\n\nEmployee currently enrolled.";
            } else {
                partTimeInfo += "\n\nEmployee no longer enrolled.";
            }
        } else {
            partTimeInfo += "\nNo working hours registered.";
        }
        partTimeInfo += "\n";
        return partTimeInfo;
    }
}
