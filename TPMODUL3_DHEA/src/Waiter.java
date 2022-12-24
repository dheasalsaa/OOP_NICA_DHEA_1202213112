public class Waiter implements Runnable {

    private final int orderQty;
    private final int customerID;
    static int foodPrice = 30000;

    public Waiter(int customerID, int orderQty){
        this.customerID = customerID;
        this.orderQty = orderQty;
    }

    @Override
    public void run(){
        while (true) {
            getFood();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void orderInfo(){
System.out.println("----------------------------------------------------");
        System.out.println("Customer ID : " + this.customerID);
        System.out.println("Number of Food : " + this.orderQty);
        System.out.println("Total : " + this.orderQty*foodPrice);
System.out.println("----------------------------------------------------");
    }

    public void getFood(){
        synchronized(Restaurant.getLock()) {
            System.out.println("Waiter: Food is ready to deliver for customer");
            Restaurant restaurant = new Restaurant();
            restaurant.setWaitingForPickUp(false);

            if (Restaurant.getfoodNumber() == this.orderQty + 1) {
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Waiter: Tell the restaurant to make another food \n");
        }
    }
}
