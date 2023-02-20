package TABLE_PER_CLASS;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )
public abstract class TPayment {
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	
	private int amount;
	
	@Column(name="payment_date")
	private Date paymentDate;
	
	

	public TPayment() {
		super();
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

	public void setAmount(int amount) {
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
		return "TPayment [id=" + id + ", amount=" + amount + ", paymentDate=" + paymentDate + "]";
	}

}
