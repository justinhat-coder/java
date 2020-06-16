package com.company;

import java.util.Collections;
import java.util.LinkedList;

public class StoreFrontModified {
    private final LinkedList catalog = new LinkedList();
    public void addItem(String id, String name, String price,
                        String quant, String discount) {
        ItemModified it = new ItemModified(id, name, price, quant, discount);
        catalog.add(it);
    }
    public ItemModified getItem(int i) {
        return (ItemModified) catalog.get(i);
    }
    public int getSize() {
        return catalog.size();
    }
    public void sort() {
        Collections.sort(catalog);
    }
}
