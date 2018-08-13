package org.jabangs.arrays;

public class HighArrayApp {

    public static void main(String[] args) {
        int maxSize = 50;
        HighArray array = new HighArray(maxSize);

        array.insert(82);
        array.insert(99);
        array.insert(43);
        array.insert(12);
        array.insert(25);
        array.insert(11);

        array.display();

        int searchKey = 25;
        if (array.find(searchKey)) {
            System.out.println("Found: " + searchKey);
        } else {
            System.out.println("Cannot find: " + searchKey);
        }

        array.delete(12);

        array.display();

    }

}
