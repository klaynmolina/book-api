package src;

public class Book {
	
	private String Id;
	private String Name; 
	private Double Price; 
	private String Category; 
	private String Img;
	
	public Book() {
		
	}
		
	public Book(String id, String name, Double price, String category, String img) {
		Id = id;
		Name = name;
		Price = price;
		Category = category;
		Img = img;
	}


	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getImg() {
		return Img;
	}
	public void setImg(String img) {
		Img = img;
	} 

}
