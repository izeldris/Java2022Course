package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("HELLO WORLD");
		
		String ortaMetin = "İlginizi Çekebilir!";
		String altMetin = "Vade Süresi";
		
		System.out.println(ortaMetin);
		
		
		//integer
		
		int vade = 12;
		
		double dolarDun = 18.25;
		double dolarBugun = 18.25;
		
		boolean dolarDustuMu = false;
		String okYonu ="";
		
		if (dolarBugun < dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		}
		else if(dolarBugun > dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}

	}
	

}
