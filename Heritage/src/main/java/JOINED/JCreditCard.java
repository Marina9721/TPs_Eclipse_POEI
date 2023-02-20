package JOINED;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="j_credit_card")
@PrimaryKeyJoinColumn(name="id_payment")
public class JCreditCard extends JPayment {
	@Column(name="card_number")
	private String cardNumber;
	
	@Column(name="expiration_date")
	private String expirationDate;
	

	public JCreditCard() {
		super();
	}

	public JCreditCard(String cardNumber, String expirationDate) {
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
