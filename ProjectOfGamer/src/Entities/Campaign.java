package Entities;

public class Campaign {
private	int Id;
private	String Name;
private Double Price;
private Double Discount;

public Campaign(int id, String name, Double price, Double discount) {
	super();
	Id = id;
	Name = name;
	Price = price;
	Discount = discount;
}

public int getId() {
	return Id;
}

public void setId(int id) {
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

public Double getDiscount() {
	return 	this.Price-(this.Price*this.Discount/100);
}

public void setDiscount(Double discount) {
	Discount = discount;
}

}
