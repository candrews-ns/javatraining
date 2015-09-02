package com.kathik.training;

public class InternalDiscountCoupon implements Coupon {

    private int id;

    private double value;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public double getValue() {
        return value;
    }
}
