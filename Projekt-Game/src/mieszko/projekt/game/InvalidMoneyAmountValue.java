package mieszko.projekt.game;

public class InvalidMoneyAmountValue extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidMoneyAmountValue() {
		super("Klient nie moze posiadac ujemnej ilosci pieniedzy");
	}

}
