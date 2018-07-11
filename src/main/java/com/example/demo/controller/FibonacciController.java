package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author Pogba Ye
 * @create 2018-05-29 2:25 PM
 **/
@RestController
@RequestMapping("/fibonacci")
public class FibonacciController {
    private static ArrayList<Integer> numList = new ArrayList();

    public FibonacciController() {
        if (numList != null && numList.size() <= 0) {
            numList.add(1);
            numList.add(1);
        }
    }

    @RequestMapping(path="/{number}",method = RequestMethod.GET)
    public int getFibonacciNumber(@PathVariable("number") int number) {
        if (numList.indexOf(number) == -1) {
            int curIdx = numList.size();
            for (; curIdx <= number; curIdx++) {
                numList.add(numList.get(curIdx - 2) + numList.get(curIdx - 1));
            }
        }
        return numList.get(number - 1);
    }


    public int aa(){return 0;}
}
