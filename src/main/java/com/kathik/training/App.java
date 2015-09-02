package com.kathik.training;

/**
 * Hello world!
 *
 * Lots of tests with JUnit
 * Integration Test with H2SQL
 * Have a mock return a random number
 * Setup your jenkins to build this project
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Hello App!");

        // Create a Shopping cart to interact with it
        ShoppingCart cart = new ShoppingCart(new Person());
        cart.addItem(new Item("foobar", 5));
        cart.addItem(new InternalDiscountCoupon());

        // TODO Call a bunch of methods to interact with the domain
        // TODO Use CL tools to look at heap etc
        // TODO Attach with VisualVM
    }
}
