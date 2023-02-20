package SINGLE_TABLE;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class DPaypalPayment extends DPayment {
	
	@Column(name="account_number")
	private String accountNumber;

	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	
	public DPaypalPayment(String accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}

	public DPaypalPayment() {
		super();
	}

	public DPaypalPayment(double amount, Date paymentDate) {
		super(amount, paymentDate);
	}

	public DPaypalPayment(int id, double amount, Date paymentDate) {
		super(id, amount, paymentDate);
	}

	@Override
	public String toString() {
		return super.toString() + "PaypalPayment [accountNumber=" + accountNumber + "]";
	}


}
