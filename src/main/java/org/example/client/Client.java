package org.example.client;

import org.example.service.ServiceIsItTrue;

public class Client {


    public final static ServiceIsItTrue serviceIsItTrue = new ServiceIsItTrue();

    public static void main(String[] args) {
        evaluate("onino");
        evaluate("Txuba");
        System.out.println("MAVEN HOME IS DEFINED AS: " + System.getenv("MAVEN_HOME") );
    }

    private static void evaluate(String input) {
        printResult(serviceIsItTrue.checkPalindromeString(input), input);
    }

    private static void printResult(boolean result, String palindrome) {
        System.out.println("Is [ "+ palindrome +" ] a palindronme? "+ result);
    }
}
