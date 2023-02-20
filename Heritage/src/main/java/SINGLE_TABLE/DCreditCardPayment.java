package SINGLE_TABLE;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("2")
public class DCreditCardPayment extends DPayment {
	
	@Column(name="card_number")
	private String cardNumber;
	
	@Column(name="expiration_date")
	private String expirationDate;
	

	public DCreditCardPayment() {
		super();
	}

	public DCreditCardPayment(String cardNumber, String expirationDate) {
		super();
		this.cardNumber = cardNumber;
		this.expirationDate = expirationDate;
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
		return super.toString() + "CreditCardPayment [cardNumber=" + cardNumber + ", expirationDate=" + expirationDate + "]";
	} 

}
