
public class WeekTwo {

	public static void main(String[] args) {
		boolean isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = true;
		
		double costOfMilk = 2.50;
		double moneyInWallet = .50;
		int thirstLevel = 1;
		
		boolean shouldByIceCream;
		boolean willGoSwimming;
		boolean isAGoodDay;
		boolean willBuyMilk;
		
		
		if(isHotOutside && hasMoneyInPocket) {
			shouldByIceCream = true;
			System.out.println("Should buy Ice cream: "+shouldByIceCream);		
		} 
		
		
		if(isHotOutside && !isWeekday) {
			willGoSwimming = true;
			System.out.println("Should go swimming: "+willGoSwimming);
		} 
		
		
		if(isHotOutside && !isWeekday && hasMoneyInPocket) {
			isAGoodDay = true;
			System.out.println("Is a good day: "+ isAGoodDay);
		} 
		
		
		if(isHotOutside && thirstLevel >= 3 && (costOfMilk <= (moneyInWallet * 2))) {
			willBuyMilk = true;
			System.out.println("Will Buy Milk: "+ willBuyMilk);
			
		}
		

	}

}
