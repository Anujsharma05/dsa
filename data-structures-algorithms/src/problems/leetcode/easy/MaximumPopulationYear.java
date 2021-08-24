package problems.leetcode.easy;

import java.util.Arrays;

public class MaximumPopulationYear {
    public static void main(String[] args) {
        int[][] logs = {{2008,2026},{2004,2008},{2034,2035},{1999,2050},{2049,2050},{2011,2035},{1966,2033},{2044,2049}};
        int year = maximumPopulation(logs);
        System.out.println(year);
    }

    public static int maximumPopulations(int[][] logs) {

        int population = 0;
        int maxPop = Integer.MIN_VALUE;
        int minYear = 0;
        for(int year=1950; year<=2050; year++) {
            for(int i=0; i<logs.length; i++) {
                if(year == logs[i][0]) {
                    population++;
                }
                if(year == logs[i][1]) {
                    population--;
                }
            }
            if(population > maxPop) {
                maxPop = population;
                minYear = year;
            }
        }
        return minYear;
    }

    public static int maximumPopulation(int[][] logs) {
        int year[] = new int[2051], i, max = Integer.MIN_VALUE, j;
        for(i=0;i<logs.length;i++)
            for(j=logs[i][0];j<logs[i][1];j++)
                year[j]++;
        j = 1949;
        for(i=1950;i<=2050;i++)
            if(year[i] > max) {
                j = i;
                max = year[i];
            }
        return j;
    }
}
