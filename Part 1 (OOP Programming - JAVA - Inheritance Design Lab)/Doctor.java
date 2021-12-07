class Doctor extends HospitalEmployee
{
    String speciality;
    
    public Doctor(String name, int number, String speciality)
    {
        super(name, number);
        this.speciality = speciality;
        setName(name);
        setNumber(number);
        name = getName();
        number = getNumber();

    }

    public void setSpeciality(String speciality)
    {
        this.speciality = speciality;
    }

    public String getSpeciality()
    {
        return speciality;
    }

    public String toString() 
    {
        return name + "   " + number + "   " + speciality;
    }

    public void work() 
    {
        System.out.println(name + " works for the hospital. " + name + " is a(n) Heart doctor.");
    }

}