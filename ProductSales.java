
public class ProductSales {
    public static void main(String[] args) {

        // 2D array: 5 days and 3 products
        int[][] sales = {
            {100, 80, 50},
            {120, 90, 65},
            {110, 75, 80},
            {90, 100, 45},
            {100, 110, 100}
        };

        // Calculate total sales for each product
        for (int j = 0; j < 3; j++) {

            int total = 0;

            // Add sales of each day for the current product
            for (int i = 0; i < 5; i++) {
                total += sales[i][j];
            }       

            System.out.println("Product " + (j + 1));
            System.out.println("Total Sales: " + total);

            // Check product performance
            if (total >= 500) {
                System.out.println("Target Achieved");
            }
            else if (total >= 300) {
                System.out.println("Average Performance");
            }
            else {
                System.out.println("Needs Improvement");
            }

            System.out.println("--------------------");
        }
    }
}
