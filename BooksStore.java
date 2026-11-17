public class BooksStore {
    public static void main(String[] args) {
        int books = 3;
        int price = 275;
        int discount = 10;
        double total =(double)(books*price);
        double discountPercentage = (double)discount;
        double discountPrice = (total*discountPercentage)/100;
        double finalBill = total-discountPrice;
        System.out.println("Quantity: " + books);
        System.out.println("Price per book: " + price);
        System.out.println("Total Price: " + total);
        System.out.println("Discount: " + discountPercentage + "%");
        System.out.println("Discount Amount: " + discountPrice);
        System.out.println("Final bill: " + finalBill);
    }
}
