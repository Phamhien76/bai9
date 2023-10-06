package ra1.business;

import java.util.Scanner;

public interface IEmployee {
    /*
     . Xây dựng interface IEmployee trong package ra.business có:
a. Hằng số BASIC_SALARY = 1.300.000
b. Các phương thức:
• inputData(Scanner scanner): Nhập thông tin cho đối tượng
• displayData(): Hiển thị thông tin đối tượng
     */
    double BASIC_SALARY = 1_300_000;

    void inputData(Scanner scanner);
    void displayData();
}
