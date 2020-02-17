package com.techtarget.corejava;

public class Menu {

    private int itemNumber;
    private String itemName;
    private String itemDescription;

    public Menu(int itemNumber, String itemName, String itemDescription) {
        this.itemNumber = itemNumber;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "itemNumber=" + itemNumber +
                ", itemName='" + itemName + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                '}';
    }
}
