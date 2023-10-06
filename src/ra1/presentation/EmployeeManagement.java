package ra1.presentation;

import ra1.business.IEmployee;
import ra1.businessImp.Employee;

import java.util.*;

public class EmployeeManagement {
    static List<Employee> employeeList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*
    3. Xây dựng lớp EmployeeManagement trong package ra.presentation thực hiện:
a. Khởi tạo danh sách nhân viên với List Interface và lớp ArrayList
b. Hiển thị menu và thực hiện các chức năng theo menu sau:
********************MENU*********************
1. Nhập thông tin cho n nhân viên
2. Hiển thị thông tin nhân viên
3. Tính lương cho các nhân viên
4. Tìm kiếm nhân viên theo tên nhân viên
5. Cập nhật thông tin nhân viên
6. Xóa nhân viên theo mã nhân viên
7. Sắp xếp nhân viên theo lương tăng dần (Comparable)
8. Sắp xếp nhân viên theo tên nhân viên giảm dần (Comparator)
9. Sắp xếp nhân vên theo năm sinh tăng dần (Comparator)
10. Thoát
     */
        //a. Khởi tạo danh sách nhân viên với List Interface và lớp ArrayList


        int choise;
        do {
            System.out.println("********************MENU*********************");
            System.out.println("1. Nhập thông tin cho nhân viên");
            System.out.println("2. Hiển thị thông tin nhân viên");
            System.out.println("3. Tính lương cho các nhân viên");
            System.out.println("4. Tìm kiếm nhân viên theo tên nhân viên");
            System.out.println("5. Cập nhật thông tin nhân viên");
            System.out.println("6. Xóa nhân viên theo mã nhân viên");
            System.out.println("7. Sắp xếp nhân viên theo lương tăng dần (Comparable)");
            System.out.println("8. Sắp xếp nhân viên theo tên nhân viên giảm dần (Comparator)");
            System.out.println("9. Sắp xếp nhân vên theo năm sinh tăng dần (Comparator)");
            System.out.println("10. Thoát");
            System.out.println(" Hãy chọn chức năng:");

            choise = Integer.parseInt(scanner.nextLine());


            switch (choise) {
                case 1:
                    inputListEmployee();
                    break;
                case 2:
                    displayListEmployee();
                    break;
                case 3:
                    calSalary();
                    break;
                case 4:
                    seacherEmployeeListbyName();
                    break;
                case 5:
                    editEmployeeList();
                    break;
                case 6:
                    deleteEmployeeList();
                    break;
                case 7:
                    sortEmployeeList();
                    break;
                case 8:
                    sortEmployeeName();
                    break;
                case 9:
                    sortEmployeeAge();
                    break;
                case 10:
                    System.exit(0);
                default:
                    System.out.println("Hãy chon các chức năng từ 1 đến 10!");
            }
        } while (true);


    }

    //1.1. Nhập thông tin cho n nhân viên
    public static void inputListEmployee() {
        System.out.println("Nhập số nhân viên cần nhập: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            Employee newEmployee = new Employee();
            newEmployee.inputData(scanner);
            employeeList.add(newEmployee);

        }
    }

    //"2. Hiển thị thông tin nhân viên"
    public static void displayListEmployee() {
        for (int i = 0; i < employeeList.size(); i++) {
            employeeList.get(i).displayData();
        }
    }

    //"3. Tính lương cho các nhân viên");
    public static void calSalary() {
        for (int i = 0; i < employeeList.size(); i++) {
            employeeList.get(i).calSalary();
        }
    }
    //"4. Tìm kiếm nhân viên theo tên nhân viên");

    public static void seacherEmployeeListbyName() {
        boolean check = true;
        System.out.println("Nhập tên nhân viên cần tìm: ");
        String seacherName = scanner.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            check = true;
            if (employeeList.get(i).getName().equals(seacherName)) {
                employeeList.get(i).displayData();
                break;
            } else {
                check = false;
            }
        }
        if (check = false) {
            System.out.println("Tên nhân viên không tồn tại, mời nhập lại");
        }
    }

    //"5. Cập nhật thông tin nhân viên");
    public static void editEmployeeList() {
        boolean check = true;
        System.out.println("Nhập mã Id nhân viên cần cập nhật:");
        String editEmployeeId = scanner.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            check = true;
            if (employeeList.get(i).getId().equals(editEmployeeId)) {
                employeeList.get(i).inputData(scanner);
                employeeList.get(i).setId(editEmployeeId);
            } else {
                check = false;
            }
        }
        if (check = false) {
            System.out.println("Không tìm thấy mã nhân viên cần cập nhật, vui lòng nhập lại");
        }
    }

    //("6. Xóa nhân viên theo mã nhân viên");
    public static void deleteEmployeeList() {
        boolean check=true;
        System.out.println("Nhâp mã nhân viên cần xóa:");
        String deleteEmployeeId = scanner.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            check=true;
            if (employeeList.get(i).getId().equals(deleteEmployeeId)) {
                employeeList.remove(i);
            }else {
                check=false;
            }
        }
        if (check=false){
            System.out.println("Không tìm thấy mã nhân viên cần xóa, vui lòng nhập lại");
        }
    }
    //"7. Sắp xếp nhân viên theo lương tăng dần (Comparable)");
    public static void sortEmployeeList(){
        Collections.sort(employeeList);

    }
    //"8. Sắp xếp nhân viên theo tên nhân viên giảm dần (Comparator)");
    public static void sortEmployeeName(){
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getName().compareTo(o1.getName()) ;
            }
        });
    }

    //"9. Sắp xếp nhân vên theo năm sinh tăng dần (Comparator)");
    public static void sortEmployeeAge(){
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getYear()-o2.getYear();
            }
        });
    }


}
