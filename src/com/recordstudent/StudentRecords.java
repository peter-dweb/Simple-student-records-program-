package com.recordstudent;

public class StudentRecords {
    //local variables (members of class student)
     int id;
     String name;
     int age;
     int yearOfStudy;
     char gender;

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "StudentRecords{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", yearOfStudy=" + yearOfStudy +
                ", gender=" + gender +
                '}';
    }

    public  void printStudentRecords(){
        System.out.println("  id  :  " +  id);
        System.out.println("Name  :  " +  name);
        System.out.println("age   :  " +  age);
        System.out.println("yearOfStudy:  " +  yearOfStudy);
        System.out.println("gender:  " +  gender);
    }
}
