package com.example;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CustomerTest {
    @Test
    public void dummyTest() {
        Customer customer = new Customer();
        assertNotNull(customer.toString());
    }
}
