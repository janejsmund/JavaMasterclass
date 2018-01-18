package com.company;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}
public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Tim");

//        ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(54));

        Integer integer = Integer.valueOf(54);
        Double doubleValue = Double.valueOf(54.5);

        ArrayList<Integer> intArrayList = new ArrayList<>();
        for (int i=0; i<10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }

        for (int i=0; i<10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        Integer myIntValue = 56; //new Integer.valueOf(56);

    }
}
