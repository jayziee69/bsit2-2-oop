public class Main {
    public static void main(String[] args) {
        try {


            Order order1 = new Order("Alice");
            Order order2 = new Order("Bob");
            Order order3 = new Order("Charlie");


            order1.addItem("Pizza", 12.99);
            order2.addItem("Burger", 8.50);
            order3.addItem("Fries", 3.25);


            order2.addMultipleItems(new String[]{"Fries", "Soda"}, 3.25, 1.99);
            order3.addMultipleItems(new String[]{"Pizza", "Pasta", "Salad"}, 10.00, 7.50, 5.00);


            try {
                order1.addItem("Pasta", -5.00);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

            try {
                order2.addItem("", 8.00);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

            try {
                order3.addMultipleItems(new String[]{"Pizza", "Burger"}, 10.00, 5.50, 3.00);  
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }


            System.out.println(order1);
            System.out.println(order2);
            System.out.println(order3);


            System.out.println("Total Orders Created: " + Order.getTotalOrders());


            Order highestOrder = findHighestTotalOrder(order1, order2, order3);
            System.out.println("Order with the highest total amount: " + highestOrder);

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }


    private static Order findHighestTotalOrder(Order... orders) {
        Order highest = orders[0];
        for (Order order : orders) {
            if (order.getTotalAmount() > highest.getTotalAmount()) {
                highest = order;
            }
        }
        return highest;
    }
}
