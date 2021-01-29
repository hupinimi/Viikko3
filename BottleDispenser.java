package luento3;

public class BottleDispenser {
    
	private int bottles;
    private int money;
    
    public BottleDispenser() {
        bottles = 5;
        money = 0;
    }
    
    public void addMoney() {
        money += 1;
        System.out.println("Klink! Added more money!");
    }
    
    public void buyBottle() {
    	if (money + bottles < 6) {
    		System.out.println("Add money first!");
    	} else {
    		if (bottles > 0) {
    			bottles -= 1;
    			System.out.println("KACHUNK! A bottle came out of the dispenser!");
    		} else {
    			System.out.println("Out of bottles!");
    			returnMoney();
    		}
    	}	
    }
    
    public void returnMoney() {
        money = 0;
        System.out.println("Klink klink. Money came out!");
    }
}
