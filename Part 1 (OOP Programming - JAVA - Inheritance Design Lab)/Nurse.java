class Nurse extends HospitalEmployee
{
    int numOfPatients;

    public Nurse(String name, int number, int numOfPatients)
    {
        super(name, number);
        this.numOfPatients = numOfPatients;
        setName(name);
        setNumber(number);
        name = getName();
        number = getNumber();
    }

    public String toString() 
    {
        return name + " " + number + " has " + numOfPatients + " patients.";
    }

    public void work() 
    {
        System.out.println(name + " works for the hospital. " + name + " is a nurse with " + numOfPatients + " patients.");
    }
}