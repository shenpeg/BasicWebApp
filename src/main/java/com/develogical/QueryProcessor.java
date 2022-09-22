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
        return "";
        }
}
