package com.kathik.training;

public class Item {

    private String sku;
    private int cost;

    public Item(String sku, int cost) {
        this.sku = sku;
        this.cost = cost;
    }

    public String getSku() {
        return sku;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public int hashCode() {
        int result = sku.hashCode();
        result = 31 * result + cost;
        return result;
    }

    @Override
    public boolean equals(Object object) {
        // Order of operations with instanceof keyword sucks in Java
        if (!(object instanceof Item)) {
            return false;
        }
        Item other = (Item) object;

        if (other.sku.equals(this.sku) && other.cost == this.cost) {
            return true;
        }
        return false;
    }
}
