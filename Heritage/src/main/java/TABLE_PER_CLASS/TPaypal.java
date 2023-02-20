package TABLE_PER_CLASS;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="t_paypal")
public class TPaypal extends TPayment {
	
	@Column(name="account_number")
	private String accountNumber;
	
	
	public TPaypal() {
		super();
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}



	@Override
	public String toString() {
		return super.toString() + "TPaypal [accountNumber=" + accountNumber + "]";
	}

}
