package eg;

import java.io.Serializable;

public class CreditCard implements Serializable{

	private long ccNumber;
	private String cardHolderName;
	private String bankName;
	private transient int cvv;
	
	public CreditCard() {
		// TODO Auto-generated constructor stub
	}

	public CreditCard(long ccNumber, String cardHolderName, String bankName, int cvv) {
		super();
		this.ccNumber = ccNumber;
		this.cardHolderName = cardHolderName;
		this.bankName = bankName;
		this.cvv = cvv;
	}

	public long getCcNumber() {
		return ccNumber;
	}

	public void setCcNumber(long ccNumber) {
		this.ccNumber = ccNumber;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	@Override
	public String toString() {
		return "CreditCard [ccNumber=" + ccNumber + ", cardHolderName=" + cardHolderName + ", bankName=" + bankName
				+ ", cvv=" + cvv + "]";
	}
	
}
