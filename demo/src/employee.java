public class employee {
    int empId;
    String name;
    public int calWages(int hourlyRate, int hoursWorked)
    {
        return(hourlyRate*hoursWorked);
    }
    public double calWages(int hourlyRate,int hoursWorked,int overTime)
    {
        return(hourlyRate*hoursWorked+(overTime*(hourlyRate*1.5)));
    }
    public double calWages(int hourlyRate, int hoursWorked, double bonus)
    {
        return(hourlyRate*hoursWorked+bonus);
    }
    public double calWages(int hourlyRate, int hoursWorked, double bonus, int overTime)

    {
        return(hourlyRate*hoursWorked+(overTime*(hourlyRate*1.5)+bonus));
    }
}
