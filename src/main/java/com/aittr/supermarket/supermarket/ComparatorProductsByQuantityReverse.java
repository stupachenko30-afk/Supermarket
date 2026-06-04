package com.aittr.supermarket.supermarket;

import java.util.Comparator;

public class ComparatorProductsByQuantityReverse implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        double quantity1 = p1.getQuantity();
        double quantity2 = p2.getQuantity();
        return Double.compare(quantity2,quantity1);
    }
}
