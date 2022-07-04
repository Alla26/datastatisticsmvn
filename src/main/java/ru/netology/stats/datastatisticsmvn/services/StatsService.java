package ru.netology.stats.datastatisticsmvn.services;

public class StatsService {

    public int getAmountSale(long[] sales) {
        long sum = 0;
        for (long x : sales) {
            sum += x;
        }
        return (int) sum;
    }

    public int getAverageAmountSale(long[] sales) {
        long sum = getAmountSale(sales);
        long average = 0;
        if (sales.length > 0) {
            //double sum = 0;
            for (int i = 0; i < sales.length; i++) {
                //      sum += sales[i];
            }
            average = (long) (sum / sales.length);
        }
        return (int) average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int getQuantityMinMonthSale(long[] sales) {
        // long average = 0;
        //  if (sales.length > 0) {
        //     double sum = 0;
        //      for (int i = 0; i < sales.length; i++) {
        //         sum += sales[i];
        //     }
        //     average = (long) (sum / sales.length);
        //   }
        long average = getAverageAmountSale(sales);
        int number = 0;
        for (long sale : sales) {
            if (sale < average) {
                number = number + 1;
            }
        }
        return (int) number;
    }

    public int getQuantityMaxMonthSale(long[] sales) {
        //  long average = 0;
        // if (sales.length > 0) {
        //    double sum = 0;
        //    for (int i = 0; i < sales.length; i++) {
        //        sum += sales[i];
        //   }
        //    average = (long) (sum / sales.length);
        // }
        long average = getAverageAmountSale(sales);
        int number = 0;
        for (long sale : sales) {
            if (sale > average) {
                number = number + 1;
            }
        }
        return (int) number;
    }
}
