package entites;

public class SavingAccount extends Account {
	
	private Double intestRate;
	
	public SavingAccount() {
		super();
	}

	public SavingAccount(Integer number, String holder, Double balance, Double intestRate) {
		super(number, holder, balance);
		this.intestRate = intestRate;
	}

	public Double getIntestRate() {
		return intestRate;
	}

	public void setIntestRate(Double intestRate) {
		this.intestRate = intestRate;
	}
	public void updateBalance() {
		balance += balance * intestRate;
	}
}
