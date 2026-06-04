package com.aittr.supermarket.supermarket;

import java.util.ArrayList;
import java.util.Comparator;

public class Supermarket {
    private  String name;
    private String address;
    private ArrayList<Product> stock =
         new    ArrayList<>();


    public Supermarket(String name, String address) {
        super();
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null)
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (name != null)
        this.address = address;
    }

    public void addProduct(Product p,double quantity){
        if(stock.contains(p) == false){
            p.setQuantity(quantity);
            stock.add(p);
            stock.sort(null);

        }
        else {
            for (Product pr: stock){
            if (pr.getCode()  == p.getCode()) {
                double q = pr.getCode();
                q +=quantity;
                pr.setQuantity(q);
                break;

            }
            }
        }


    }
        public void printProduct(){
            System.out.println("**************************");
            System.out.println("Supermarket: " + name);
            System.out.println("Address: " + address);
            System.out.println("\t\t\tStock: ");
            for (Product pr: stock){
                System.out.println(pr);
            }

            System.out.println("**************************");


        }
        public void removeProduct(int code,double quantity){
           for (Product pr: stock){
               if (pr.getCode() == code){
                   double q = pr.getQuantity();
                   q -= quantity;
                   if (q<0)
                   q=0;
                   pr.setQuantity(q);
                   return;
               }
           }
            System.out.println("_________________________");
            System.out.println("Wrong code ! ! !" + code);
            System.out.println("_________________________");
        }
        public void reducePrice(int code, double percent){
        for (Product pr: stock){
            if (pr.getCode() == code){
                double price = pr.getPrice();
                double discount = (price * percent)/100;
                price -= discount;
                pr.setPrice(price);
                return;
            }
        }
            System.out.println("_________________________");
            System.out.println("Wrong code ! ! !" + code);
            System.out.println("_________________________");
        }
    public void reducePriceAll( double percent){
        for (Product pr: stock){
                double price = pr.getPrice();
                double discount = (price * percent)/100;
                price -= discount;
                pr.setPrice(price);
                return;

        }

}
    public void sortProductsBy(int criteria){
        switch (criteria){
                case ISortingCriteria.SORT_BY_PRICE:
                ComparatorProductsByPrice comp1 =
               new  ComparatorProductsByPrice();
               stock.sort(comp1);
               break;
                   case ISortingCriteria.SORT_BY_PRICE_REVERSE:
                   ComparatorProductsByPriceReverse comp2 =
                           new ComparatorProductsByPriceReverse();
                   stock.sort(comp2);
                   break;

                   case ISortingCriteria.SORT_BY_NAME:
                   ComparatorProductsByName comp3 =
                           new ComparatorProductsByName();
                   stock.sort(comp3);
                   break;
                   case ISortingCriteria.SORT_BY_NAME_REVERSE:
                   ComparatorProductsByNameReverse comp4 =
                           new ComparatorProductsByNameReverse();
                   stock.sort(comp4);
                   break;

                   case ISortingCriteria.SORT_BY_CODE:
                       ComparatorProductsByCode comp5 =
                               new ComparatorProductsByCode();
                       stock.sort(comp5);
                       break;
                   case ISortingCriteria.SORT_BY_CODE_REVERSE:
                       ComparatorProductsByCodeReverse comp6 =
                              new  ComparatorProductsByCodeReverse();
                       stock.sort(comp6);
                       break;

                   case ISortingCriteria.SORT_BY_QUANTITY:
                       ComparatorProductsByQuantity comp7 =
                              new ComparatorProductsByQuantity();
                       stock.sort(comp7);
                       break;
                   case ISortingCriteria.SORT_BY_QUANTITY_REVERSE:
                       ComparatorProductsByQuantityReverse comp8 =
                               new ComparatorProductsByQuantityReverse();
                       stock.sort(comp8);
                       break;

        }

    }
    public void findProduct(int code){
        for (Product pr: stock){
            if (pr.getCode() == code){
                return;
            }
        }
    }
    public void removeProductFromStock(int code){
        for (int i=0; i<stock.size(); i++){
         Product pr = stock.get(i);
            if (pr.getCode() == code){
                stock.remove(i);

                return;

        }
    }
}}
