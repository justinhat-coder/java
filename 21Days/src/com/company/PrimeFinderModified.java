package com.company;

public class PrimeFinderModified implements Runnable {
    public long target;
    public long prime;
    public boolean finished = false;
    PrimeFinderModified(long inTarget) throws NegativeNumberException {
        if (inTarget < 0) {
            throw new NegativeNumberException(
                    "Neg numbers that aren't allowed shown: " + inTarget);
        }
        target = inTarget;
        Thread runner = new Thread(this);
        runner.start();
    }
    public void run() {
        long numPrimes = 0;
        long candidate = 2;
        while (numPrimes < target) {
            if (isPrime(candidate)) {
                numPrimes++;
                prime = candidate;
            }
            candidate++;
        }
        finished = true;
    }
    boolean isPrime(long checkNumber) {
        double root = Math.sqrt(checkNumber);
        for (int i = 2; i <= root; i++) {
            if (checkNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
class NegativeNumberException extends Exception {
    NegativeNumberException() {
        super();
    }
    NegativeNumberException(String message) {
        super(message);
    }
}
