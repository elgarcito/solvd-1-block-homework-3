import abstract_classes.Person;

public class Employee extends Person {

    private String personalId;//The personal id of the worker
    private double costPerHour;//The pay per hour of the worker
    private String speciality;//What kind of job the worker does
    private int employeeAge;//how old is the employee



    //Constructor

    public Employee(String personName, String personEmail, String phoneNumber,String speciality) {
        super(personName, personEmail, phoneNumber);
        this.speciality=speciality;
    }
    //End constructor

    //Getter and setters

    public String getPersonalId() {
        return personalId;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }

    public double getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(double costPerHour) {
        this.costPerHour = costPerHour;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }
    //end getters and setters

    //Abstract method implementation
    @Override
    public void checkAge(){
        if (this.getEmployeeAge()<21){
            System.out.println("You must be older than 18 years to be an employee.");
            if (this.employeeAge==0){
                System.out.println("Please set the employee age.");
            }
        }else {
            System.out.println("You can be an employee.");
        }
    }


}
