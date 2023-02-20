package JOINED;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="j_paypal")
@PrimaryKeyJoinColumn(name="id_payment")
public class JPaypal extends JPayment {
	@Column(name="account_number")
	private String accountNumber;

	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	
	public JPaypal(String accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}

	public JPaypal() {
		super();
	}

	@Override
	public String toString() {
		return super.toString() + "PaypalPayment [accountNumber=" + accountNumber + "]";
	}

}
