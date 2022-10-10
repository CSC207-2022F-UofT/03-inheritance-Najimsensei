/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */

public abstract class Bag {
    private String color;
    private int numberOfContents;
    private int capacity;
    private String[] contents;


    public  Bag( String color, int capacity){
        this.color = color;
        this.capacity = capacity;
        this.contents = new String[capacity];
    }



    public String getColor(){
        return this.color;
    }

    public int getNumberOfContents(){
        return this.numberOfContents;
    }

    public int getCapacity(){
        return this.capacity;
    }



    public void setColor(String new_color){
        this.color = new_color;
    }



    public void addItem(String new_item){
        if (this.capacity > this.numberOfContents) {
            this.contents[this.numberOfContents] = (new_item);
            this.numberOfContents++;
        }
    }



    public String popItem(){
        if(this.numberOfContents == 0){
            return null;
        }
        String poped_item = this.contents[this.numberOfContents - 1];
        this.contents[this.numberOfContents - 1] = null;
        this.numberOfContents--;
        return poped_item;
    }








    /**
     * Increase this bag's capacity by n.
     *
     * @param n the amount to increase this Bag's capacity by
     */
    public void increaseCapacity(int n) {
        int old_capacity = this.capacity;
        this.capacity += n;
        String[] new_items = new String[capacity];
        for (int i = 0; i < old_capacity; i++){
            new_items[i] = this.contents[i];
        }

        this.contents = new_items;
    }

    /**
     * Return the details of this Bag.
     * This method requires you to have created the private
     * instance variables mentioned above.
     *
     * @return
     */
    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    /*
     * Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();
}