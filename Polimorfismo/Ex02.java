package Polimorfismo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Entities.Product;
import Entities.importedProduct;
import Entities.usedProduct;

public class Ex02 {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		List<Product> lsProducts = new ArrayList<Product>();
		
		System.out.println("Write of the number of the products");
		Integer n = sc.nextInt();
		for(int i = 0; i < n;i++) {
			System.out.print("What the type of the product: P/U/I");
			char choice = sc.next().charAt(0);
			if(choice == 'p') {
				  System.out.println("Write the name of product");
				  String name = sc.next();
				  System.out.print("Write the price of product");
				  double price = sc.nextDouble();
				  lsProducts.add(new Product(name, price));
			}
			else if(choice == 'u') {
				  System.out.println("Write the name of product");
				  String name = sc.next();
				  System.out.print("Write the price of product");
				  double price = sc.nextDouble();
				  System.out.print("Write the customsFee of product");
				  double customFee = sc.nextDouble();
				  lsProducts.add(new importedProduct(name, price, customFee));
			}
			else {
				  System.out.println("Write the name of product");
				  String name = sc.next();
				  System.out.print("Write the price of product");
				  double price = sc.nextDouble();
				  System.out.print("Write the date of the manufacture dd/mm/yy");
				  String stDate = sc.next();
				  SimpleDateFormat smdate = new SimpleDateFormat("dd/MM/yyyy");
				  Date date  = smdate.parse(stDate);
				  lsProducts.add(new usedProduct(name, price, date));
				  
			}
			
		}
		for(Product p: lsProducts) {
			System.out.printf("Product : %s \n price: %.2f \n", p.getName(), p.price());
 		}
	}
}
