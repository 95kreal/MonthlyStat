package ru.netology.stats;

public class StatsService {


    public int sum(int[] monthlySales) {
        int sum = 0;
        for (int monthlySale : monthlySales) {
            sum += monthlySale;
        }
        return sum;
    }

    public int avg(int[] monthlySales) {
        int avg = 0;
        for (int monthlySale : monthlySales) {
            avg += monthlySale;
        }
        avg = avg / monthlySales.length;
        return avg;
    }

    public int max(int[] monthlySales) {
        int maxMounth = 0;
        int mounth = 0;
        for (int monthlySale : monthlySales) {
            if (monthlySale >= monthlySales[maxMounth]) {
                maxMounth = mounth;
            }
            mounth = mounth + 1;
        }
        return maxMounth + 1;
    }

    public int min(int[] monthlySales) {
        int minMounth = 0;
        int mounth = 0;
        for (int monthlySale : monthlySales) {
            if (monthlySale <= monthlySales[minMounth]) {
                minMounth = mounth;
            }
            mounth = mounth + 1;
        }
        return minMounth + 1;
    }

    public int belowAvg(int[] monthlySales) {
        int avg = 0;
        for (int monthlySale : monthlySales) {
            avg += monthlySale;
        }
        int minMounth = 0;
        for (int monthlySale : monthlySales) {
            if (monthlySale < avg / monthlySales.length) {
                minMounth++;
            }
        }
        return minMounth;
    }

    public int aboveAvg(int[] monthlySales) {
        int avg = 0;
        for (int monthlySale : monthlySales) {
            avg += monthlySale;
        }
        int minMounth = 0;
        for (int monthlySale : monthlySales) {
            if (monthlySale > avg / monthlySales.length) {
                minMounth++;
            }
        }
        return minMounth;
    }
}