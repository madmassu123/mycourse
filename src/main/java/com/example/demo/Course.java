package com.example.demo;

import java.time.Year;

public class Course {
    private String courseName;
    private String courseNumber;
    private String roomNumber;
    private String semester;
    private String year;


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseNumber='" + courseNumber + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", semester='" + semester + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    public void setYear(String year) {
        this.year = year;

    }
}
//    @Override
//
//
//
//    public string  () {
//        return "student { " + "coursename" =' " + courseName + '\"  + ", courseNumber= ' " + courseNumber + '\" + ",roomNumber = ' " + roomNumber'
//
//
//    }
//}
