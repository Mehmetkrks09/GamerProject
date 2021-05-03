package Entities;

public class Game {
private int Id;
private String Name;
private Double Price;

public Game(int id, String name, Double price) {
	super();
	Id = id;
	Name = name;
	Price = price;
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
}
