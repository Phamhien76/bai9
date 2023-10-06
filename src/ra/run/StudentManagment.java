package ra.run;

import ra.IStudent;
import ra.impl.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagment {
    public static void main(String[] args) {
        /*
        Xây dựng lớp main có tên StudentManagement trong ra.run thực hiện các chức năng sau:
Khởi tạo 1 danh sách từ List và ArrayList chứa các sinh viên
**MENU**
Nhập thông tin n sinh viên (thêm sinh viên vào danh sách)
Hiển thị thông tin sinh viên (Hiển thị dữ liệu của danh sách)
Sắp xếp danh sách sinh viên theo tuổi tăng dần (get, set)        *
Thoát        *
         */
        List<IStudent> studentList=new ArrayList<>();
        Scanner scanner= new Scanner(System.in);
        boolean isRuning=true;
        Student newStudent=new Student();



        int choise;
        do {
            System.out.println("********MENU**********");
            System.out.println("Nhập thông tin sinh viên (thêm sinh viên vào danh sách)");
            System.out.println("Hiển thị thông tin sinh viên (Hiển thị dữ liệu của danh sách)");
            System.out.println("Sắp xếp danh sách sinh viên theo tuổi tăng dần (get, set)");
            System.out.println("Thoát");
            System.out.println("Hãy chọn lựa chọn của bạn");

            choise=Integer.parseInt(scanner.nextLine());
            switch (choise){
                case 1:

                    newStudent.inputData(scanner);
                    studentList.add(newStudent);
                    break;
                case 2:
                    newStudent.displayData();
                    break;
                case 3:

                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Hãy chọn từ 1 đến 3");

            }


        }while (true);


    }

}
