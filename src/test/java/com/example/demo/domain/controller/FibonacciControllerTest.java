package com.example.demo.domain.controller;

import com.example.demo.controller.FibonacciController;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Pogba Ye
 * @create 2018-05-29 2:17 PM
 **/
public class FibonacciControllerTest {
    FibonacciController controller;
    @Before
    public void setup(){
        controller = new FibonacciController();
    }

    @Test
    public void getThe10FibonacciTest(){
        int result = controller.getFibonacciNumber(10);
        Assert.assertEquals(55,result);
    }
}
