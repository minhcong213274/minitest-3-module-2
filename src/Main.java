
public class Main {
    public static void main(String[] args) {
        StaffManager staffManager = new StaffManager();
        Staff staff = new StaffFullTime(1,"cong",24,"0123466","bg",20000,10000,100000);
        Staff staff1 = new StaffPartTime(2,"hung",23,"02102","hn",200);
        Staff staff2 = new StaffPartTime(3,"hai",23,"021032","hn",100);
        Staff staff3 = new StaffPartTime(4,"chung",23,"0210234","hn",150);
        Staff staff4 = new StaffFullTime(5,"son",27,"0125553466","bg",50000,20000,500000);
        Staff staff5 = new StaffFullTime(5,"nam",30,"01255533466","bg2",50000,20000,400000);
        staffManager.addStaff(staff);
        staffManager.addStaff(staff1);
        staffManager.addStaff(staff2);
        staffManager.addStaff(staff3);
        staffManager.addStaff(staff4);
        staffManager.addStaff(staff5);
        System.out.println(staffManager.getTotalSalaryStaffPartTime());
        System.out.println(staffManager.getAverageSalary());
        staffManager.listStaffFullTimeLowerThanAverageSalary();
        System.out.println(staffManager);
       staffManager.sortStaffFullTimeBySalaryAscending();
        System.out.println(staffManager);
    }
}