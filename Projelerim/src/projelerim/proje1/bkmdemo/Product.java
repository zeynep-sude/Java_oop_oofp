package projelerim.proje1.bkmdemo;

public class Product implements IPayable {
	//protected int id;
	protected String name;
	protected String type;
	protected double price;
	protected int sales;
	
	@Override
	public void addToCart() {
		System.out.println(name+"Sepete Eklendi");
		
	}
	@Override
	public void addToMyFavorites() {
		System.out.println(name+"Favorilere Eklendi");
		
	}
	@Override
	public void addComment() {
		System.out.println("Yorumunuz Eklendi");
		
	}
	@Override
	public void defineDiscount() {
		System.out.println("İndiriminiz tanımlandı");
		
	}
	

}
