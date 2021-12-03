package edu.pnu.admin;

import edu.pnu.collection.GenericList;

public class School {
    private final String name;
    private GenericList<Student> students = new GenericList<>();
    private static int limit;

    public School(String school, int index){
        this.name = school;
        School.limit = index;
    }

    public String toString(){
        String msg = "School Name: "+this.name+" Student Count: "+students.getSize()+"\n";
        msg += students.toString();
        return msg;
    }

    public void removeAllStudent() {
        students.removeAll();
    }

    public Student findStudent(String studentName, int schoolYear) {
        Student target = students.findStudent(studentName, schoolYear);
        if(target != null){
            return target;
        }
        return null;
    }

    public static int getLimit() {
        return School.limit;
    }

    public void addStudent(Student newStudent) {
        students.add(newStudent);
    }
}
