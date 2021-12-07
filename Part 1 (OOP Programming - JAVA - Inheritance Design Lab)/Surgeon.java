class Surgeon extends Doctor
{
    boolean operating = false;

    public Surgeon(String name, int number, String speciality, boolean operating)
    {
        super(name,number,speciality);
        this.operating = operating;
    }
    
    public void work()
    {
        System.out.println(name + " works for the hospital." + name + " is operating now.");
    }


    public String toString() 
    {
        return name + "   " + number + "   " + speciality + " Operating: " + operating;
    }
}