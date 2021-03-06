package com.company;

import java.util.HashMap;

public class ComicBooksModified {
    public ComicBooksModified() {
    }
    public static void main(String[] arguments) {
        HashMap quality = new HashMap();
        quality.put("pristine mint", 5.00F);
        quality.put("mint", 3.00F);
        quality.put("near mint", 2.00F);
        quality.put("very fine", 1.50F);
        quality.put("fine", 1.00F);
        quality.put("good", 0.50F);
        quality.put("poor", 0.25F);
        quality.put("coverless", 0.10F);
        // set up collection
        Comic[] comix = new Comic[5];
        comix[0] = new Comic("Amazing Spider-Man", "1A", "very fine",
                12_000.00F);
        comix[0].setPrice( (Float) quality.get(comix[0].condition) );
        comix[1] = new Comic("Incredible Hulk", "181", "near mint",
                680.00F);
        comix[1].setPrice( (Float) quality.get(comix[1].condition) );
        comix[2] = new Comic("Cerebus", "1A", "good", 190.00F);
        comix[2].setPrice( (Float) quality.get(comix[2].condition) );
        comix[3] = new Comic("Prez", "1", "pristine mint", 30.00F);
        comix[3].setPrice( (Float)quality.get(comix[3].condition) );
        comix[4] = new Comic("Night Nurse", "1", "coverless", 22.00F);
        comix[4].setPrice( (Float)quality.get(comix[4].condition) );
        for (Comic comix1 : comix) {
            System.out.println("Title: " + comix1.title);
            System.out.println("Issue: " + comix1.issueNumber);
            System.out.println("Condition: " + comix1.condition);
            System.out.println("Price: $" + comix1.price + "\n");
        }
    }
}
