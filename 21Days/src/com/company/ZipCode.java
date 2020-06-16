package com.company;

public class ZipCode {
    private String zipCode;
    public ZipCode() {
        this.zipCode = "";
    }
    public String getZipCode() {
        return zipCode;
    }
    public void setZipCode(String inZipCode) {
        if ((inZipCode.length() == 5) | (inZipCode.length() == 9)) {
            zipCode = inZipCode;
        }
    }
    public static void main(String[] arguments) {
        ZipCode zip1 = new ZipCode();
        zip1.setZipCode("95116");
        ZipCode zip2 = new ZipCode();
        zip2.setZipCode("95121");
        if (!"".equals(zip1.getZipCode())) {
            System.out.println("Zip 1: " + zip1.getZipCode());
        } else {
            System.out.println("Zip 1 not set");
        }
        if (!"".equals(zip2.getZipCode())) {
            System.out.println("Zip 2: " + zip2.getZipCode());
        } else {
            System.out.println("Zip 2 not set");
        }
    }
}
