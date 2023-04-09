import java.util.ArrayList;

public class StaffPartTime extends Staff {
    private final int ONE_HOUR_SALARY = 10000;
    private int workHours;

    public StaffPartTime(int idStaff, String name, int age, String phoneNumber, String address, int workHours) {
        super(idStaff, name, age, phoneNumber, address);
        this.workHours = workHours;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public StaffPartTime() {
    }

    @Override
    public double calculateSalary() {
        setSalary(workHours * ONE_HOUR_SALARY);
        return getSalary();
    }

    @Override
    public String toString() {
        return "StaffPartTime{" +
                this.getName()+
                '}';
    }
}
