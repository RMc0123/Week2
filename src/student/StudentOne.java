package student;

import java.util.Scanner;

/**
 * This class +++Insert Description Here+++
 *
 * @author Ryan McMahon
 */
public class StudentOne {
    
    public static void main(String[] args){
    
    // Scanner scan = new Scanner(System.in);
    
    // System.out.println("Please enter student name.");
    // String sName = scan.nextLine();
    
    // Student student = new Student (sName);
    // student.setStudentId(1234567);
    
    // System.out.println("Student Information:");
    // System.out.println(student.getName());
    // System.out.println(student.getStudentId());
    
    Student[] studentList = new Student[3];
    
    studentList[0] = new Student("Ryan");
    studentList[1] = new Student("Larisa");
    studentList[2] = new Student("Josh");
    
    System.out.println("Let's print the names");
    
    for(Student s: studentList){
        System.out.println(s.getName());
        }
    }
}
