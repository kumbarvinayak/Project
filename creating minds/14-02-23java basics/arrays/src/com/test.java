package com;

public class test {
    public static void main(String[]args){
        int[] a = {10,20,30};
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);

            System.out.println("==================");
        }
        System.out.println("==================");
        int[] data = {10,20,30,40,50};
        int sum = 0;
        for (int i = 0; i<data.length; i++)
        {
            sum = sum + data[i];

        }
        System.out.println("sum: "+sum);


    }
}
