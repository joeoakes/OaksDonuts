/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
/**
 *
 * @author Gokhan
 */
public class MenuItem
{
    private int ID;
    private String itemName;
    private String itemDescription;
    private double price;
    
    public MenuItem(int ID, String itemName, String itemDescription, double price)
    {
        this.ID = ID;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "MenuItem{" + "ID=" + ID + ", itemName=" + itemName + ", itemDescription=" + itemDescription + ", price=" + price + '}';
    }
}
