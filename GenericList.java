package edu.pnu.collection;

import edu.pnu.admin.School;
import edu.pnu.admin.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericList<T> {
    private static final int DEFAULT_SIZE = 10;
    private Object[] data;
    private int size;
    private int index = 0;

    public GenericList(){
        this.size = School.getLimit();
        if(this.size > 0){
            this.data = new Object[size];
        }
        else this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T data){
        if(index < this.data.length){
            this.data[index] = data;
            index++;
        }
    }

    public T get(int index){
        if(index < data.length){
            return (T) data[index];
        }
        else return null;
    }

    public int getSize() {
        return index;
    }

    public T findStudent(String studentName, int schoolYear) {
        Student target = new Student(studentName, schoolYear);
        for (Object o : data) {
            if (target.equals(o)) {
                return (T) target;
            }
        }
        return null;
    }

    public void removeAll() {
        List<Object> list = new ArrayList<>(Arrays.asList(data));
        list.clear();
        data = list.toArray(new Object[0]);
        index = 0;
    }

    @Override
    public String toString() {
        if(index == 0){
            return "\t";
        }
        else{
            String list = "\t"+data[0]+"\n";
            for(int i = 1; i < index; i++){
                list += "\t"+data[i]+"\n";
            }
            return list;
        }
    }
}
