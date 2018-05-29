package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

/**
 * @author Pogba Ye
 * @create 2018-05-29 2:25 PM
 **/
@Controller("/fibonacci")
public class FibonacciController {
    private static ArrayList<Integer> numList;

    public FibonacciController(){
        if (numList == null) {
            numList = new ArrayList();
            numList.add(1);
            numList.add(1);
        }
    }

    @RequestMapping("/{number}")
    @ResponseBody
    public int getFibonacciNumber(int number){
        int rtn = 0;

        if (numList.indexOf(number)==-1) {
            int tmpMax = numList.size();
            for (;tmpMax<=number;tmpMax++){
                numList.add(numList.get(tmpMax-2)+numList.get(tmpMax-1));
            }
            rtn = numList.get(number-1);
        } else {
            rtn = numList.get(number-1);
        }
        return rtn;
    }
}
