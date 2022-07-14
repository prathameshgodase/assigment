package Que5;

import java.util.Scanner;

public class Pythagoras {

    public static boolean P1(int i,int j,int k) {
       int I=i*i, J=j*j, K=k*k; 
        if (I==J+K || J==I+K ||K==I+J)
            return true;
        else
        	return false;
    }

}