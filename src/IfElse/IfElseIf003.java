package IfElse;

public class IfElseIf003 {
    public static void main(String[] args) {
        double marks = 100;

        if (marks < 0 || marks > 100) {
            System.out.println("Giá trị không hợp lệ!");
        } else {
            if (marks < 50) {
                System.out.println("Tạch!");
            } else if (marks >= 50 && marks < 60) {
                System.out.println("Xếp loại D");
            } else if (marks >= 60 && marks < 70) {
                System.out.println("Xếp loại C");
            } else if (marks >= 70 && marks < 80) {
                System.out.println("Xếp loại B");
            } else if (marks >= 80 && marks < 90) {
                System.out.println("Xếp loại A");
            } else if (marks >= 90 && marks <= 100) {
                System.out.println("Xếp loại A+");
            }
        }
    }
}
