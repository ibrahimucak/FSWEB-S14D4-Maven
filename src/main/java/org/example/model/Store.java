package org.example.model;

public class Store {
    public static void main(String[] args) {

        //listProducts();
        ProductForSale[] products = new ProductForSale[5];
        products[0] = new Chocolate("dark",25,"frambuazlı");
        products[1] = new Bread("ekmek",15,"st dsc");
        products[2] = new Coke("dg pastası",50,"fıstklı",true,2.5);
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
for(ProductForSale product: products){
    if(product != null){
        product.showDetails();
    }
}

    }
}