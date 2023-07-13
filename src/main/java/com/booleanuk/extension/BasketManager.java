package com.booleanuk.extension;

public class BasketManager {


    private BasketExt basketExt;


    public BasketManager(BasketExt basketExt) {
        this.basketExt = basketExt;
    }


    public BasketExt getBasketExt() {
        return basketExt;
    }


    public boolean add(BagelExt bagelExt) {

        if (checkIsBasketFull()) {
            basketExt.add(bagelExt);
            return true;
        } else {
            System.out.println("Basket is full!");
            return false;
        }


    }
    public boolean add(CoffeeExt coffeeExt) {
        if (checkIsBasketFull()) {
            basketExt.add(coffeeExt);
            return true;
        } else {
            System.out.println("Basket is full!");
            return false;
        }
    }
    public boolean add(FillingExt fillingExt) {
        if (checkIsBasketFull()) {
            basketExt.add(fillingExt);
            return true;

        } else {
            System.out.println("Basket is full!");
            return false;
        }
    }

    public boolean remove(BagelExt bagelExt) {
        if(checkSanity(bagelExt)) {
            basketExt.remove(bagelExt);
            return true;
            }
        return false;
    }
    public boolean remove(FillingExt fillingExt) {
        if(checkSanity(fillingExt)) {

            basketExt.remove(fillingExt);
            return true;
            }
        return false;
    }
    public boolean remove(CoffeeExt coffeeExt) {
        if(checkSanity(coffeeExt)) {
            basketExt.remove(coffeeExt);
            return true;
        }
        return false;
    }

    private boolean checkIsBasketFull(){
        int occupiedCapacity = basketExt.getBagelsInBasket().size() + basketExt.getCoffeesInBasket().size() + basketExt.getFillingInBasket().size();
        return occupiedCapacity < basketExt.getCapacity();

    }

    private boolean checkSanity(CoffeeExt coffeeExt){
        return basketExt.getCoffeesInBasket().contains(coffeeExt);
    }
    private boolean checkSanity(FillingExt fillingExt){
        return basketExt.getFillingInBasket().contains(fillingExt);
    }
    private boolean checkSanity(BagelExt bagelExt){
        return basketExt.getBagelsInBasket().contains(bagelExt);
    }


}
