package com.kamiltalowski.practice.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Double[] array9 = {1.0,4.0,5.0,6.0,8.0,3.0,8.0};
        Double[] array = {null,-9.3,0.2,4.0,0.1,5.0,9.0,null};
        Double[] array46= {null, 5.0001};
        Double[] array56 = {null};


	    List<Double> input = Arrays.asList(array);
        BubbleSort bubble = new BubbleSort();
        System.out.println(bubble.sort(input));

    }
}
