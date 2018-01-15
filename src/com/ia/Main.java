package com.ia;

public class Main {

    public static void main(String[] args) {
        int n=4;
        int i, j, k;
	for (i = 0; i < n; i++){
	    for (j = n-i-1;j > 0; j--){
            System.out.print(" ");
        }
        for (k = 1; k <= i*2+1; k++){
            System.out.print("x");
        }
        System.out.println();
	}
	for (i = n-1; i >0; i--){
	    for (j = 1; j < n-i+1; j++){
            System.out.print(" ");
        }
        for (k = i*2-1; k > 0; k--){
            System.out.print("x");
        }
        System.out.println();
    }
    }
}
