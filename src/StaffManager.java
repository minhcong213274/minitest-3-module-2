import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StaffManager {
    private List<Staff> staffManager;
    private static int count = 0;

    public StaffManager() {
        staffManager = new ArrayList<>();
    }

    public void addStaff(Staff staff) {
        staffManager.add(staff);
        count++;
    }
    public double getTotalSalaryStaffPartTime(){
        double getTotalSalary=0;
        for (Staff staff:staffManager){
            if(staff instanceof StaffPartTime){
            getTotalSalary += staff.calculateSalary();
        }
        }
        return getTotalSalary;
    }
    public double getAverageSalary(){
        double getAverageSalary=0;
        for (Staff staff:staffManager){
            getAverageSalary += staff.calculateSalary();
        }
        return getAverageSalary/count;
    }
    public void listStaffFullTimeLowerThanAverageSalary(){
        List<Staff> staffList = new ArrayList<>();
        for (Staff staff: staffManager){
            if (staff.calculateSalary()<getAverageSalary()){
                staffList.add(staff);
            }
        }
        System.out.println(staffList);
    }
    public void sortStaffFullTimeBySalaryAscending(){
        Collections.sort(staffManager,(staff1,staff2)->{
            if(staff1 instanceof StaffFullTime && staff2 instanceof StaffFullTime){
                double salary1 = ((StaffFullTime) staff1).getSalary();
                double salary2 = ((StaffFullTime) staff2).getSalary();
                return Double.compare(salary1, salary2);
            }
            return 0;
        });
    }

    @Override
    public String toString() {
        return "StaffManager{" +
                "staffManager=" + staffManager +
                '}';
    }

}
