package JOINED;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="j_payments")
@Inheritance(strategy=InheritanceType.JOINED)
public class JPayment {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private double amount;
	
	@Column(name="payment_date")
	private Date paymentDate;

	
	public JPayment() {
		super();
	}

	public JPayment(int id, double amount, Date paymentDate) {
		super();
		this.id = id;
		this.amount = amount;
		this.paymentDate = paymentDate;
	}

	public JPayment(double amount, Date paymentDate) {
		super();
		this.amount = amount;
		this.paymentDate = paymentDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", amount=" + amount + ", paymentDate=" + paymentDate + "]";
	}


}
