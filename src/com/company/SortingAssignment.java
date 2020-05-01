package com.company;

import java.util.ArrayList;

public class SortingAssignment {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Integer> sort = new ArrayList<>(50);

        for (int i = 0; i < 50; i++){

            sort.add(i, (int) (Math.random()*50));

        }

        System.out.println(sort);
        sort.sort(null);

        System.out.println(sort);

    }
}
