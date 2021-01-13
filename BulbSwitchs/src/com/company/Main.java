
package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some numbers.");

        ArrayList<Integer> mylist = new ArrayList<Integer>();
        ArrayList<Integer> mylist2 = new ArrayList<Integer>();
        ArrayList<Integer> mylist3 = new ArrayList<Integer>();

        mylist.add(0);
        while (sc.hasNextInt()) {
            int i = 0;
            i = sc.nextInt();
            mylist.add(i);
            if(mylist.size() == 8){
                break;
            }
        }
        if(mylist.indexOf(2)==1){
            mylist3.add(mylist.indexOf(2));
        }
        for (int j=1; j<=mylist.size(); j++){
            if(j == mylist.indexOf(j)){
                if(mylist.indexOf(j+1)>mylist.indexOf(j)){
                    System.out.println(mylist.indexOf(j));
                    mylist2.add(j);
                }
                for (int i=j; i <mylist.size();i++){
                    if (mylist.indexOf(i) < i){
                        System.out.println(mylist.indexOf(i));
                        mylist3.add(mylist.indexOf(i));
                    }
                }
                {

                }
            }
        }
//        System.out.println(mylist2);
//        System.out.println(mylist3);
        int b = mylist2.size()+ mylist3.size();
        System.out.println(b);


    }
}

