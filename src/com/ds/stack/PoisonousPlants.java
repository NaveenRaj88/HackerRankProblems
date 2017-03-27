package com.ds.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by anandran on 3/24/17.
 */
public class PoisonousPlants {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> plants = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            plants.add(scan.nextInt());
        }
        int days = -1;
        List<Integer> plantsToKill = new ArrayList<>();
        do {
//            for(int i =0; i <plantsToKill.size(); i++){
//                plants.remove(plantsToKill.get(i)-i);
//            }
            for(int i =plantsToKill.size()-1; i>=0 ; i--){
                plants.remove(plantsToKill.get(i));
            }
            plantsToKill.clear();
            for (int i = 1; i < plants.size(); i++) {
                if (plants.get(i - 1) < plants.get(i)) {
                    plantsToKill.add(i);
                }
            }
            days++;
        } while (!plantsToKill.isEmpty());
        System.out.println(days);
    }
}
