package oop.shop.v2;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	List<Product> datas = new ArrayList<>();
	
	public void add(Product p) {
		datas.add(p);
	}
	
	public List<Product> getList() {
		return datas;
	}
}
