package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		OgrenmenKrediManager ogretmenKrediManager = new OgrenmenKrediManager();
		
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new OgrenmenKrediManager());

	}

}
