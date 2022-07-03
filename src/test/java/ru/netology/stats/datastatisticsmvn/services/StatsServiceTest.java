package ru.netology.stats.datastatisticsmvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test

    public void ShouldFindAmountSale() {
        StatsService service = new StatsService();
        long expected = 166;
        long actual = service.getAmountSale(new long[]{10, 15, 13, 3, 20, 19, 14, 18, 15, 10, 13, 16});

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void ShouldFindAverageAmountSale() {
        StatsService service = new StatsService();
        long expected = 13;
        long actual = service.getAverageAmountSale(new long[]{10, 15, 13, 3, 20, 19, 14, 18, 15, 10, 13, 16});

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldFindMaxMonth() {
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.maxSales(new long[]{10, 15, 13, 3, 20, 19, 14, 18, 15, 10, 13, 16});

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldFindMinMonth() {
        StatsService service = new StatsService();
        long expected = 4;
        long actual = service.minSales(new long[]{10, 15, 13, 3, 20, 19, 14, 18, 15, 10, 13, 16});

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldFindQuantityMinMonth() {
        StatsService service = new StatsService();
        long expected = 3;
        long actual = service.getQuantityMinMonthSale(new long[]{10, 15, 13, 3, 20, 19, 14, 18, 15, 10, 13, 16});

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldFindQuantityMaxMonth() {
        StatsService service = new StatsService();
        long expected = 7;
        long actual = service.getQuantityMaxMonthSale(new long[]{10, 15, 13, 3, 20, 19, 14, 18, 15, 10, 13, 16});

        Assertions.assertEquals(expected, actual);

    }
}

