
public class CalculateBalance1 {

	public static void main(String[] args) {
		int BalanceInitial = 1000;
		System.out.println("Initial Balance: $" + (BalanceInitial)); //Initial Balance
		
		int BalanceY1 = (int) (BalanceInitial + (BalanceInitial * 0.05));
		System.out.println("First Year Balance: $" + (BalanceY1)); //1st Year Balance
		
		int BalanceY2 = (int) (BalanceY1 + (BalanceY1 * 0.05));
		System.out.println("Second Year Balance: $" + (BalanceY2)); //2nd Year Balance
		
		int BalanceY3 = (int) (BalanceY2 + (BalanceY2 * 0.05));
		System.out.println("Third Year Balance: $" + (BalanceY3)); //3rd Year Balance

	}

}
