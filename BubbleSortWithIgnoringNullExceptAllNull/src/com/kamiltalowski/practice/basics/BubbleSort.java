package com.kamiltalowski.practice.basics;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BubbleSort {
    public List<Double> sort(List<Double> input){
         int iIndex=0;
         int jIndex=0;
         int numberOfNull=0;
            for (int j = jIndex; j < input.size()-jIndex; j++){
                    if(input.get(j)==null)
                    {
                        jIndex ++;
                        iIndex ++;
                        numberOfNull++;
                    }
                    if (numberOfNull >= input.size()) throw new RuntimeException("RuntimeException");
                    for (int i = iIndex; i < input.size() - iIndex; i++)
                        if(input.get(i)==null||input.get(i+1)==null) continue;
                        else if(input.get(i) > input.get(i + 1) && input.get(i)!=null)
                        Collections.swap(input, i, i + 1);


        }
        return input;
    }
}
