package com.example.material_design_app.mainScreens.pojo;

public class ShoppingPojo {

    int shoppingItemPhoto;
    String shoppingItemName;
    double shoppingItemPrice;
    int shoppingItemAmount;
    int shoppingPlus;
    int shoppingMinus;

    public ShoppingPojo(int shoppingItemPhoto, String shoppingItemName, double shoppingItemPrice, int shoppingItemAmount, int shoppingPlus, int shoppingMinus) {
        this.shoppingItemPhoto = shoppingItemPhoto;
        this.shoppingItemName = shoppingItemName;
        this.shoppingItemPrice = shoppingItemPrice;
        this.shoppingItemAmount = shoppingItemAmount;
        this.shoppingPlus = shoppingPlus;
        this.shoppingMinus = shoppingMinus;
    }

    public int getShoppingItemPhoto() {
        return shoppingItemPhoto;
    }

    public String getShoppingItemName() {
        return shoppingItemName;
    }

    public double getShoppingItemPrice() {
        return shoppingItemPrice;
    }

    public int getShoppingItemAmount() {
        return shoppingItemAmount;
    }

    public int getShoppingPlus() {
        return shoppingPlus;
    }

    public int getShoppingMinus() {
        return shoppingMinus;
    }

    public void setShoppingItemPhoto(int shoppingItemPhoto) {
        this.shoppingItemPhoto = shoppingItemPhoto;
    }

    public void setShoppingItemName(String shoppingItemName) {
        this.shoppingItemName = shoppingItemName;
    }

    public void setShoppingItemPrice(double shoppingItemPrice) {
        this.shoppingItemPrice = shoppingItemPrice;
    }

    public void setShoppingItemAmount(int shoppingItemAmount) {
        this.shoppingItemAmount = shoppingItemAmount;
    }

    public void setShoppingPlus(int shoppingPlus) {
        this.shoppingPlus = shoppingPlus;
    }

    public void setShoppingMinus(int shoppingMinus) {
        this.shoppingMinus = shoppingMinus;
    }
}
