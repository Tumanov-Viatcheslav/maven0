package org.example;

public class Main {
    public static void main(String[] args) {
        Umbrella zont = new Umbrella("red");
        zont.open();
        System.out.println(zont);
        zont.close();
        System.out.println(zont);
    }
}