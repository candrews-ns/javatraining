package com.kathik.training;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/** Unit tests for the Item class */
public class ItemTest {

    // My boss told me to write more tests, but I know my implementation is good
    @Test
    public void itemsAreEqual() {
        Item item1 = new Item("dog2000", 1);
        Item item2 = new Item("dog2000", 1);
        assertEquals(item1, item2);
    }
}
