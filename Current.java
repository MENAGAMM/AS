package lab_2;

public class Current extends Account{
	
		final double overDraftLimit = 10000;

	
	public boolean checkOverDraftLimit(double amount){
		double balance  = super.getBalance();
		double withdrawableBalance = balance + overDraftLimit;
		if(amount > withdrawableBalance){
			return false;
		}
		return true;
		
	}
	

}
