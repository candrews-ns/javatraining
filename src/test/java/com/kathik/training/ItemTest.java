package com.kathik.training;

import com.kathik.training.ExpectedFailure.Optional;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/** Unit tests for the Item class */
public class ItemTest extends com.kathik.training.Test {

    // My boss told me to write more tests, but I know my implementation is good
    @Test
    public void itemsAreEqual() {
        Item item1 = new Item("dog2000", 1);
        Item item2 = new Item("dog2000", 1);
        assertEquals(item1, item2);
    }

    // "A customer reports that when she compares a widget2000 item with a
    // widget2001 item that the result is saying that they're equal."
    @Test
    @Optional(exception=AssertionError.class)
    public void differentItemsAreEqual() {
        Item item1 = new Item("widget2000", 1);
        Item item2 = new Item("widget2001", 1);
        assertEquals(item1, item2);
    }

    @Test
    public void differentItemsAreNotEqual() {
        Item item1 = new Item("widget2000", 1);
        Item item2 = new Item("widget2001", 1);
        assertNotEquals(item1, item2);
    }
}
