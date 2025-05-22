class Restaurant {
    double foodPrice;

    Restaurant(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public double calculateTotalBill() {
        double tax = foodPrice * 0.10;
        return foodPrice + tax;
    }

    public int estimateDeliveryTime() {
        return 40;
    }
}

class FastFoodRestaurant extends Restaurant {
    FastFoodRestaurant(double foodPrice) {
        super(foodPrice);
    }

    @Override
    public double calculateTotalBill() {
        double tax = foodPrice * 0.15;
        return foodPrice + tax;
    }

    @Override
    public int estimateDeliveryTime() {
        return 20;
    }
}

class FineDiningRestaurant extends Restaurant {
    FineDiningRestaurant(double foodPrice) {
        super(foodPrice);
    }

    @Override
    public int estimateDeliveryTime() {
        return 60;
    }
}

public class Problem8_B {
    public static void main(String[] args) {
        double price = 115;

        Restaurant general = new Restaurant(price);
        FastFoodRestaurant fastFood = new FastFoodRestaurant(price);
        FineDiningRestaurant fineDining = new FineDiningRestaurant(price);

        System.out.println("General Restaurant:");
        System.out.println("Total Bill: $" + general.calculateTotalBill());
        System.out.println("Estimated Delivery Time: " + general.estimateDeliveryTime() + " mins\n");

        System.out.println("Fast Food Restaurant:");
        System.out.println("Total Bill: $" + fastFood.calculateTotalBill());
        System.out.println("Estimated Delivery Time: " + fastFood.estimateDeliveryTime() + " mins\n");

        System.out.println("Fine Dining Restaurant:");
        System.out.println("Total Bill: $" + fineDining.calculateTotalBill());
        System.out.println("Estimated Delivery Time: " + fineDining.estimateDeliveryTime() + " mins");
    }
}
