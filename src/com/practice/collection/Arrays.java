package com.practice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arrays {
    List<Student> str = new ArrayList<Student>();
    Arrays(Student... str){
        this.str = new ArrayList<Student>();
        Collections.addAll(this.str,str);
    }

    public void getStudent(){
        System.out.println(str);
    }
}
