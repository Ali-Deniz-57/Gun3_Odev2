package staticDemo;

public class ProductValidator {
	static {
		System.out.println("Staci Yapıcı Blok Çalıştı");
	}
	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı");
			
	}
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	public static class BaskaBirClass{ //inner class
		public static void Sil() {
			
		}
	}
}
