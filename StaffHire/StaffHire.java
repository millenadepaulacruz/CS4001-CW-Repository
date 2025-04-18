
public class StaffHire
{
    //variables declaration
    protected int vacancyNumber;
    protected String designationType;
    protected String jobType;
    protected String staffName;
    protected String joiningDate;
    protected String qualification;
    protected String appointedBy;
    protected boolean joined;

    //constructor with parameters
    public StaffHire(int vacancyNumber, String designationType, String jobType, String staffName, String joiningDate, String qualification, String appointedBy, boolean joined){
        this.vacancyNumber = vacancyNumber; //"this." means that I'm refering to the global variables
        this.designationType = designationType;
        this.jobType = jobType;
        this.staffName = staffName;
        this.joiningDate = joiningDate;
        this.qualification = qualification;
        this.appointedBy = appointedBy;
        this.joined = joined;
    }

    //all get and set methods
    public int getVacancyNumber(){
        return vacancyNumber;    
    } 

    public void setVacancyNumber(int vacancyNumber){
        this.vacancyNumber = vacancyNumber;
    }

    public String getDesignationType(){
        return designationType;
    }

    public void setDesignationType(String designationType){
        this.designationType = designationType;
    }

    public String getJobType(){
        return jobType;
    }

    public void setJobType(String jobType){
        this.jobType = jobType;
    }

    public String getStaffName(){
        return staffName;
    }

    public void setStaffName(String staffName){
        this.staffName = staffName;
    }

    public String getJoiningDate(){
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate){
        this.joiningDate = joiningDate;
    }

    public String getQualification(){
        return qualification;
    }

    public void setQualification(String qualification){
        this.qualification = qualification;
    }

    public String getAppointedBy(){
        return appointedBy;
    }

    public void setAppointedBy(String appointedBy){
        this.appointedBy = appointedBy;
    }

    public boolean getJoined(){
        return joined;
    }

    public void changeStatus(boolean joined){
        this.joined = joined;
        System.out.println(staffName + "'s status has now been changed.");
        if (joined) {
            System.out.println("Status: enrolled");
        } else {
            System.out.println("Status: not enrolled");
        }
    }

    public String displayInfo(){
        //return a string to show info in GUI screen
        
        String employeeInfo = "Staff name: " + staffName +
                              "\nVacancy number: " + vacancyNumber +
                              "\nDesignation: " + designationType +
                              "\nJob type: " + jobType +
                              "\nJoining date: " + joiningDate +
                              "\nQualification: " + qualification +
                              "\nAppointed by: " + appointedBy;

        if (joined) {
            employeeInfo += "\nStatus: enrolled";
        } else {
            employeeInfo += "\nStatus: not enrolled";
        }
        return employeeInfo;
    }
}
