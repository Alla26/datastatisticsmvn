import ru.netology.stats.datastatisticsmvn.services.StatsService;

public class Main {

    public static void main(String[] args) {
        StatsService service = new StatsService();
        System.out.println("Сумма всех продаж:   " + service.getAmountSale(new long[]{10, 15, 13, 3, 20, 19, 14, 18, 15, 10, 13, 16}));
        System.out.println("Средняя сумма продаж в месяц:   " + service.getAverageAmountSale(new long[]{10, 15, 13, 3, 20, 19, 14, 18, 15, 10, 13, 16}));
        System.out.println("Номер месяца с максимальной суммой продаж:   " + service.maxSales(new long[]{10, 15, 13, 3, 20, 19, 14, 18, 15, 10, 13, 16}));
        System.out.println("Номер месяца с минимальной суммой продаж:   " + service.minSales(new long[]{10, 15, 13, 3, 20, 19, 14, 18, 15, 10, 13, 16}));
        System.out.println("Количество месяцев с продажами ниже среднего:   " + service.getQuantityMinMonthSale(new long[]{10, 15, 13, 3, 20, 19, 14, 18, 15, 10, 13, 16}));
        System.out.println("Количество месяцев с продажами выше среднего:   " + service.getQuantityMaxMonthSale(new long[]{10, 15, 13, 3, 20, 19, 14, 18, 15, 10, 13, 16}));

    }

}
