public class MaximumPopulationYear {
    // https://leetcode.com/problems/maximum-population-year/

    // Q: You are given a 2D integer array logs where each logs[i] = [birthi, deathi] indicates the birth and death years of the ith person.
    //The population of some year x is the number of people alive during that year. The ith person is counted in year x's population
    // if x is in the inclusive range [birthi, deathi - 1]. Note that the person is not counted in the year that they die.
    //Return the earliest year with the maximum population.
    public static void main(String[] args) {
        int[][] logs = {{1950, 1961},{1960, 1971}, {1970, 1981}};
        System.out.println(maximumPopulation(logs));
    }

    public static int maximumPopulation(int[][] logs) {
        int min = logs[0][1];
        int max = logs[0][0];
        for (int i = 0; i < logs.length; i++) {
            if(logs[i][0] < min){
                min = logs[i][0];
            }
            if (logs[i][1] > max){
                max = logs[i][1];
            }
        }
        int years[] = new int[max - min];
        for (int j = 0; j < logs.length ; j++) {
            int k = 0;
            for (int i = min; i < max; i++) {
                if (logs[j][0] <= i && i < logs[j][1]){
                    years[k] = years[k] + 1;
                }
                k++;
            }
        }
        int maxx = 0;
        int index = 0;
        for (int i = 0; i < years.length; i++) {
            if (years[i] > maxx){
                maxx = years[i];
            }
        }
        for (int i = 0; i < years.length; i++) {
            if (years[i] == maxx){
                index = i;
                break;
            }
        }
        // ans = year i which max no of people are alive
        // here ans = i + min
        return index + min;
    }
}
