package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String [ ]args ) {

        Scanner scan = new Scanner(System.in);
        Course newCourse;

        ArrayList<Course> courses = new ArrayList<>();
        for (int i = 1; i<5; i++)

        {
        newCourse = new Course();
        System.out.println("Enter courseName");
        newCourse.setCourseName(scan.nextLine());
        System.out.println("Enter CourseNumber");
        newCourse.setCourseNumber(scan.nextLine());
        System.out.println("Enter RoomNumber");
        newCourse.setRoomNumber(scan. nextLine());
        System.out.println ("Enter Semister");
        newCourse.setSemester(scan. nextLine());
        System.out.println("Enter the year");
        newCourse.setSemester(scan.nextLine());
        courses.add(newCourse);

        for(Course eachCourse: courses){

            System.out.println(" Course number" + eachCourse.getCourseName());
            System.out.println(" Course number" + eachCourse.getCourseNumber());
            System.out.println(" Course number" + eachCourse.getRoomNumber());
            System.out.println(" Course number" + eachCourse.getSemester());
            System.out.println(" Course number" + eachCourse.getYear());

            System.out.println("Coursecontents:"+ eachCourse.toString());

        }


    }
}

}
