package utilizandoSwitch;

public class AutoPolicy {

	int accountNumber; //número da conta da apólice
	String makeAndMode1; // marca e modelo do carro
	String state; //sigla do estado de dois caracteres
	
	public AutoPolicy(int accountNumber, String makeAndMode1, String state) {
		this.accountNumber = accountNumber;
		this.makeAndMode1 = makeAndMode1;
		this.state = state;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getMakeAndMode1() {
		return makeAndMode1;
	}

	public void setMakeAndMode1(String makeAndMode1) {
		this.makeAndMode1 = makeAndMode1;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	//método predicado é retornado se o estado tem seguros sem culpa
	public boolean isNoFaulState() {
		boolean noFaulState;
		
		//determina se o estado tem seguros de automóvel "sem culpa"
		switch (getState()) 
		{ //obtem a abreviatura do estado
			case "MA" :
			case "NJ" :
			case "NY" :
			case "PA" :
				noFaulState = true;
				break;
			default:
				noFaulState = false;
				break;
		}
		
		return noFaulState;
	}
	
}
