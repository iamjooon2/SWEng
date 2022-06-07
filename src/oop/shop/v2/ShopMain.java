package oop.shop.v2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShopMain {
	Cart cart = new Cart();
	ProductDAO dao = new ProductDAO();

	public void go() {
		System.out.println("## 쇼핑몰 V1 ##");
		// 상품 출력
		for(Product p : dao.getAll()) {
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
				cart.add(dao.get(sel));
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
