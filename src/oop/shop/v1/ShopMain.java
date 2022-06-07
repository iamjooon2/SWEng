package oop.shop.v1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShopMain {
	Map<String, Product> products = new HashMap<>();
	Cart cart = new Cart();

	public ShopMain() {
		products.put("101", new Product("101", "삼성 갤럭시 Z플립", 1500000));
		products.put("202", new Product("202", "애플 아이폰13 프로 맥스", 2000000));
		products.put("203", new Product("203", "모토로라 뉴 스타텍 폴더", 1200000));
	}

	public void go() {
		System.out.println("## 쇼핑몰 V1 ##");
		// 상품 출력
		for(Product p : products.values()) {
			System.out.printf("[%s]%s\t%d\n", p.getId(), p.getName(), p.getPrice());		
		}
		System.out.println("===========================");
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("# 장바구니 넣기(코드입력): ");
			String sel = scan.next();
			if(sel.equals("0")) {
				printCart();
				System.exit(0);
			} else {
				cart.add(products.get(sel));
			}
		}	
	}
	
	public void printCart() {
		System.out.println("## 장바구니 출력 ##");
		for(Product p : cart.getList()) {
			System.out.printf("[%s]%s\t%d\n", p.getId(), p.getName(), p.getPrice());		
		}
	}
	
	public static void main(String[] args) {
		ShopMain app = new ShopMain();
		app.go();
	}

}
