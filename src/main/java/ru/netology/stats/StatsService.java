package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int[] findMax (int[]sales){
        int[] maxMonth;
        maxMonth = new int[sales.length];
        int max =0;
        int i =0;
        for (int sale : sales) {
            if(sale> max){
                max=sale;
            }
        }
        for (int month = 0; month < sales.length; month++) {
            if(sales[month] == max){
                maxMonth[i] = month+1;
                i++;
            }
        }
        return maxMonth;
    }

   public int findMin (int[]sales){
        int minMonth = 0;
        int month = 0;
       for (int sale : sales) {
           if(sale<= sales[minMonth]){
               minMonth = month;
           }
           month = month+1;

       }
       return minMonth+1;
   }

   public int findAvg(int[]sales){
        return calculateSum(sales)/ sales.length;

   }

    public int countMonthLessAvg(int[] sales) {
        int avg = findAvg(sales);
        int counter = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg) {
                counter++;
            }
        }
        return counter;
    }

    public int countMonthOverAvg(int[] sales) {
        int avg = findAvg(sales);
        int counter = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avg) {
                counter++;
            }
        }
        return counter;
    }


}
