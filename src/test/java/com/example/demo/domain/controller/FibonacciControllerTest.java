package com.example.demo.domain.controller;

import com.example.demo.controller.FibonacciController;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Pogba Ye
 * @create 2018-05-29 2:17 PM
 **/
public class FibonacciControllerTest {
    @Test
    public void getThe10FibonacciTest(){
        FibonacciController controller = new FibonacciController();
        int result = controller.getFibonacciNumber(10);
        Assert.assertEquals(55,result);
    }
}
