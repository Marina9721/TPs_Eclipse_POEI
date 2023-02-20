package TABLE_PER_CLASS;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="t_credit_card")
public class TCreditCard extends TPayment {
	
	@Column(name="card_number")
	private String cardNumber;
	
	@Column(name="expiration_date")
	private String expirationDate;
	

	public TCreditCard() {
		super();
	}
	

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	@Override
	public String toString() {
		return super.toString() + "TCreditCard [cardNumber=" + cardNumber + ", expirationDate=" + expirationDate + "]";
	} 

}
