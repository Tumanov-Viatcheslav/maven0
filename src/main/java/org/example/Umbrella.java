package org.example;

public class Umbrella {
    private final String color;
    private boolean isOpen;

    public Umbrella(String color) {
        this.color = color;
        isOpen = false;
    }

    public void open() {
        isOpen = true;
    }

    public void close() {
        isOpen = false;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return color + " umbrella is " + (isOpen ? "opened" : "closed");
    }
}
