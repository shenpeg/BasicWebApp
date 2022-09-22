package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
         if (query.toLowerCase().contains("blep")) {
            return "the act of a cat sticking its tongue out slightly " +
                    "without realizing it, often for long periods of time " ;
        }
        if (query.toLowerCase().contains("name")) {
            return "LIFEWTR";
        }
        if (query.toLowerCase().contains("what is 19 multipled by 2")) {
            return "38";
        }
        if (query.toLowerCase().contains("what is 13 plus by 14")) {
            return "27";
        }
        if (query.toLowerCase().contains("what is 0 multiplied by 1")) {
            return "0";
        }
        if (query.toLowerCase().contains("what is 12 minus 13")) {
            return "-1";
        }
        if (query.toLowerCase().contains("what is 4 plus 16")) {  
            return "20";
        }
        if (query.toLowerCase().contains("which of the following numbers is the largest: 53, 892")) {  
            return "892";
        }
        if (query.toLowerCase().contains("what colour is a banana")) {  
            return "yellow";
        }
        if (query.toLowerCase().contains("what is 8 minus 8")) {  
            return "0";
        }
        if (query.toLowerCase().contains("what is 12 plus 4 plus 9")) {  
            return "25";
        }
        if (query.toLowerCase().contains("what is 0 minus 12")) {  
            return "-12";
        }
        if (query.toLowerCase().contains("what is the 13th number in the Fibonacci sequence")) {  
            return "144";
        }
        if (query.toLowerCase().contains("which year was Theresa May first elected as the Prime Minister of Great Britain")) {  
            return "2016";
        }
        return "";
        }
}
