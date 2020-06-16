package com.company;

public class PrimeThreadsModified {
    public static void main(String[] arguments) {
        try {
            PrimeFinderModified[] finder = new PrimeFinderModified[arguments.length];
            for (int i = 0; i < arguments.length; i++) {
                long count = Long.parseLong(arguments[i]);
                finder[i] = new PrimeFinderModified(count);
                System.out.println("Looking for prime " + count);
            }
            boolean complete = false;
            while (!complete) {
                complete = true;
                for (PrimeFinderModified primeFinderModified : finder) {
                    if (!primeFinderModified.finished) {
                        complete = false;
                        break;
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ignored) {
                }
            }
            for (PrimeFinderModified primeFinderModified : finder) {
                System.out.println("Prime " + primeFinderModified.target
                        + " is " + primeFinderModified.prime);
            }
        } catch (NumberFormatException | NegativeNumberException nfe) {
            System.out.println("Error: " + nfe.getMessage());
        }
    }
}
