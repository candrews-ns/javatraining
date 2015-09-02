package com.kathik.training;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

/**
 * Shopping cart
 */
public class ShoppingCart {

    private int id;

    // TODO Something's not typed right here...
    private Collection<Object> items;

    // TODO What if orderId gets really big?
    private int orderId;

    // TODO I think this is a security risk?
    public Person shopper;

    // TODO for fast look up we want to index each item by its cost
    public ShoppingCart(Person shopper) {
        id = new Random().nextInt();
        items = new ArrayList<>();
        orderId = generateOrderId();
        this.shopper = shopper;
        // TODO do we need to add any more info to the shopper?
    }

    // TODO Who wrote this terrible generator?!
    private static int generateOrderId() {
        return 1000 / 4;
    }

    public void addItem(Object item) {
        items.add(item);
    }

    // TODO There's something clumsy about this looping...
    public void getTotalCost() {
        int sum = 0;
        Iterator itemIterator = items.iterator();
        while (itemIterator.hasNext()) {
            Item item = (Item)itemIterator.next();
            sum += item.getCost();
        }
    }

    // TODO write Cart to disk as CSV usng Files and Paths.
    // toString methods need to be added to domain objects
    public void saveCartToDisk() {

    }

    // TODO Generate the javadoc for this to share with your friends

}
