package ra.impl;

import ra.IStudent;

import java.util.Scanner;

public class Student implements IStudent {
    /*
Xây dựng interface IStudent trong package ra có 2 phương thức trừu tượng:
inputData(Scanner scanner): cho phép nhập thông tin đối tượng
displayData(): Cho phep in thông tin đối tượng
Xây dựng lớp Student trong package ra.impl kế thừa từ IStudent có:
Các thuộc tính: studentId, studentName, age, sex
Các constructors
Các phương thức getter/setter
Triển khai các phương thức inputData, displayData
Có phương thức tính năm sinh của sinh viên
Xây dựng lớp Main thực hiện các chức năng sau:
**MENU**
Nhập thông tin sinh viên
Hiển thị thông tin sinh viên
Thoát
*/
    private int studetId;
    private String studentName;
    private int age;
    private boolean sex;
//Các constructors rỗng
    public Student() {
    }
    //Các constructors có


    public Student(int studetId, String studentName, int age, boolean sex) {
        this.studetId = studetId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
    }

//Các phương thức getter


    public int getStudetId() {
        return studetId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return age;
    }

    public boolean isSex() {
        return sex;
    }

    //Các phương thức setter


    public void setStudetId(int studetId) {
        this.studetId = studetId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }


    @Override
    public void inputData(Scanner scanner) {
        System.out.println(" Nhập mã sinh viên: ");
        this.studetId= Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sin viên: ");
        this.studentName=scanner.nextLine();
        System.out.println("Nhập tuổi sinh viên: ");
        this.age= Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính sinh viên (true nếu là nam, false nếu là nữ): ");
        this.sex=Boolean.parseBoolean(scanner.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("Mã sinh viên là: "+ studetId);
        System.out.println("Tên sinh viên là: "+ studentName);
        System.out.println("Tuổi sinh viên: "+ age);
        System.out.println("Giới tính sinh viên: "+(sex?"Nam":"Nữ"));

    }
    public int curbirthYear() {
        int currentYear = java.time.Year.now().getValue();
        return currentYear - age;
    }



}
