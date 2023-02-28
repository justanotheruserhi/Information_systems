package com.javapoint.habits.Queue;

import java.util.ArrayList;

public class Q<T> implements InQ<T>{
    private ArrayList<T> list = new ArrayList<>();

    @Override
    public void add(T element){
        list.add(element);
    }

    @Override
    public T remove(){
        return null;
    }
}
