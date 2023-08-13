package utilizandoSwitch;

public class AutoPolicyTest {

	public static void main(String[] args) {
		
		//criar dois objetos
		AutoPolicy policy1 = new AutoPolicy(1111111, "Toyta Camry", "NJ");
		AutoPolicy policy2 = new AutoPolicy(2222222, "Ford Fusion", "ME");
		
		//exibe se cada apólice está em um estado "sem culpa"
		policyInNoFaulState(policy1);
		policyInNoFaulState(policy2);
		
	}
	
	// método que mostra se um Autopolicy
	// está em um estado com seguro de automóvel sem culpa
	
	public static void policyInNoFaulState(AutoPolicy policy) {
		System.out.println("The auto policy: ");
		System.out.printf("Account n°: %d; car: %s; State %s %s a no-fault state %n%n",
				policy.getAccountNumber(), policy.getMakeAndMode1(),
				policy.getState(), (policy.isNoFaulState() ? "is": "is not"));
	}
}
