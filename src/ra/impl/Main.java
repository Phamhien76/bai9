package ra.impl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
        Scanner scanner=new Scanner(System.in);
        Student student=new Student();

        int choise;
        do {
            System.out.println("********MENU**********");
            System.out.println("Nhập thông tin sinh viên");
            System.out.println("Hiển thị thông tin sinh viên");
            System.out.println("Tính năm sinh");
            System.out.println("Thoát");
            System.out.println("Hãy chọn lựa chọn của bạn");

            choise=Integer.parseInt(scanner.nextLine());
            switch (choise){
                case 1:
                    student.inputData(scanner);
                    break;
                case 2:
                    student.displayData();
                    break;
                case 3:
                    int birtrYear= student.curbirthYear();
                    System.out.println("Tuổi của sinh viên là:"+birtrYear);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Hãy chọn từ 1 đến 3");

            }


        }while (true);
    }
}
