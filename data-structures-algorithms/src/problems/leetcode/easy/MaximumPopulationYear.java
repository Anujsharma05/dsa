package problems.leetcode.easy;

import java.util.Arrays;

public class MaximumPopulationYear {
    public static void main(String[] args) {
        int[][] logs = {{2008,2026},{2004,2008},{2034,2035},{1999,2050},{2049,2050},{2011,2035},{1966,2033},{2044,2049}};
        int year = maximumPopulationOptimized(logs);
        System.out.println(year);
    }

    public static int maximumPopulationOptimized(int[][] logs) {

        int[] populationChart = new int[2050 - 1950 + 1];

        int baseYear = 1950;

        for(int i=0; i<logs.length; i++) {

            int birthYear = logs[i][0];
            int deathYear = logs[i][1];

            populationChart[birthYear - baseYear]++;
            populationChart[deathYear - baseYear]--;

        }

        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i=1; i<populationChart.length; i++) {
            populationChart[i] = populationChart[i] + populationChart[i-1];

            if(max < populationChart[i]) {
                max = populationChart[i];
                index = i;
            }
        }
        return index + baseYear;
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
