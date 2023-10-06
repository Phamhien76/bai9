package ra1.businessImp;

import ra1.business.IEmployee;

import java.util.Scanner;

public class Employee implements IEmployee,Comparable<Employee> {
/*
2. Xây dựng lớp Employee kế thừa IEmployee trong package ra.businessImp có các thông tin:
a. Các thuộc tính
• Id – String: Mã nhân viên
• Name – String: Tên nhân viên
• Year – int: Năm sinh nhân viên
• Rate – float: hệ số lương nhân viên
• Commission - float: Hoa hồng của nhân viên hàng tháng
• Salary – float: Lương nhân viên hàng tháng
• Status – Boolean: Trạng thái nhân viên (true – đang làm việc, false – Nghỉ việc)
b. Các constructors và phương thức getter/setter
c. Triển khai các phương thức:
• inputData(Scanner scanner): nhập thông tin cho nhân viên (trừ salary)
• displayData(): hiển thị thông tin nhân viên
d. Xây dựng phương thức tính lương nhân viên calSalary theo công thức:
Salary = Rate * BASIC_SALARY + Commission
 */
  //a. Các thuộc tính
    private String id;
    private  String name;
    private int year;
    private float rate;
    private float commission;
    private float salary;
    private boolean status;

    //b. Các constructors và

    public Employee() {
    }

    public Employee(String id, String name, int year, float rate, float commission, float salary, boolean status) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.rate = rate;
        this.commission = commission;
        this.salary = salary;
        this.status = status;
    }

    //phương thức getter/setter


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public float getRate() {
        return rate;
    }

    public float getCommission() {
        return commission;
    }

    public float getSalary() {
        return salary;
    }

    public boolean isStatus() {
        return status;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public void setCommission(float commission) {
        this.commission = commission;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //c. Triển khai các phương thức:

    @Override
    public void inputData(Scanner scanner) {
        System.out.println("Nhập mã nhân viên:");
        this.id=scanner.nextLine();
        System.out.println("Nhập tên nhân viên:");
        this.name=scanner.nextLine();
        System.out.println("Nhập năm sinh nhân viên:");
        this.year= Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập hệ số lương:");
        this.rate= Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập hoa hồng của nhân viên:");
        this.commission= Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập lương nhân viên:");
        this.salary= Float.parseFloat(scanner.nextLine());
        this.status=true;//Mặc định nhân viên đang làm việc


    }

    @Override
    public void displayData() {
        System.out.println("Mã nhân viên: "+id);
        System.out.println("Tên nhân viên: "+name);
        System.out.println("Năm sinh nhân viên: "+year);
        System.out.println("Hệ số lương: "+rate);
        System.out.println("Hoa hồng của nhân viên: "+commission);
        System.out.println("Lương nhân viên: "+salary);
        System.out.println("Trạng thái nhân viên: "+(status?"Đang làm việc":"Nghỉ việc"));


    }
    //d. Xây dựng phương thức tính lương nhân viên calSalary theo công thức:
    //Salary = Rate * BASIC_SALARY + Commission
    public void calSalary(){
        salary= (float) (rate*BASIC_SALARY+commission);
    }

    @Override
    public int compareTo(Employee o) {
        return (int) (this.salary-o.salary);

    }
}
