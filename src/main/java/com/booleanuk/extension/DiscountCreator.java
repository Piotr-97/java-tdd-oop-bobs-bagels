package com.booleanuk.extension;

public class DiscountCreator {

    private double totalDiscount;

    private int bglo;
    private int bglp;
    private int bgle;
    private int bgls;


    public DiscountCreator() {
        bglo = 0;
        bgls = 0;
        bgle = 0;
        bglp = 0;
    }

    public boolean isSpecialBGLOTwelveOffer(BasketExt basketExt) {
        bagelsCounter(basketExt);
        return bglo >=12;
    }
    public boolean isSpecialBGLPTwelveOffer(BasketExt basketExt) {
        bagelsCounter(basketExt);
        return bglp >=12;
    }
    public boolean isSpecialBGLETwelveOffer(BasketExt basketExt) {
        bagelsCounter(basketExt);
        return bgle >=12;
    }
    public boolean isSpecialBGLSTwelveOffer(BasketExt basketExt) {
        bagelsCounter(basketExt);
        return bgls >=12;
    }

    private void bagelsCounter(BasketExt basketExt) {
        for (BagelExt bagel :
                basketExt.getBagelsInBasket()) {
            if (bagel.getSku() == SKU.BGLP) {
                bglp++;
            } else if (bagel.getSku() == SKU.BGLO) {
                bglo++;
            } else if (bagel.getSku() == SKU.BGLE) {
                bgle++;
            } else if (bagel.getSku() == SKU.BGLS) {
                bgls++;
            }
        }
    }

}
