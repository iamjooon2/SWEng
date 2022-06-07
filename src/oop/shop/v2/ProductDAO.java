package oop.shop.v2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDAO {
	Map<String, Product> products = new HashMap<>();
	
	public ProductDAO() {
		products.put("101", new Product("101", "삼성 갤럭시 Z플립", 1500000));
		products.put("202", new Product("202", "애플 아이폰13 프로 맥스", 2000000));
		products.put("203", new Product("203", "모토로라 뉴 스타텍 폴더", 1200000));		
	}
	
	public List<Product> getAll() {
		return new ArrayList<Product>(products.values());
	}
	
	public Product get(String id) {
		return products.get(id);
	}
}
