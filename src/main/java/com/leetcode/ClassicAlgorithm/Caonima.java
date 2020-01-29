package com.leetcode.ClassicAlgorithm;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: 𝓛.𝓕.𝓠
 */
public class Caonima {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        System.out.println(sdf.format(date));
    }
}
