package com.kamiltalowski.practice.basics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] A = {-5,-100,-2,-2,2,1, 3, 6, 4, 1, 2, 200};
        int tempInt = 1;
        int j=1;
/*
        Arrays.sort(A);

        for(int i=0; i<A.length; i++){
            if(A[i]>0){
                if(temp==A[i]) {
                    temp = A[i];
                    temp++;
                }
                if(temp!=j)
                        j++;
            }
        }
*/
        for(int i=1; i<A.length; i++){
                for(int k=1; k<A.length; k++){
                    if (A[k]==tempInt) {
                        tempInt++;
                    }
                }

        }
        System.out.println(tempInt);
    }
}
