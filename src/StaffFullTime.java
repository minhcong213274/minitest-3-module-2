import java.util.ArrayList;
import java.util.Comparator;

public class StaffFullTime extends Staff {
    private int bonus,fines,hardSalary;

    public StaffFullTime(int idStaff, String name, int age, String phoneNumber, String address, int bonus, int fines, int hardSalary) {
        super(idStaff, name, age, phoneNumber, address);
        this.bonus = bonus;
        this.fines = fines;
        this.hardSalary = hardSalary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getFines() {
        return fines;
    }

    public void setFines(int fines) {
        this.fines = fines;
    }

    public int getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(int hardSalary) {
        this.hardSalary = hardSalary;
    }

    public StaffFullTime() {
    }

    @Override
    public double calculateSalary() {
         setSalary(hardSalary + bonus - fines);
         return getSalary();
    }

    @Override
    public String toString() {
        return "StaffFullTime{" +
              this.getName()+
                '}';
    }
}
