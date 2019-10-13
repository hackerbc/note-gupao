package com.chb.strategy.gp;

import com.chb.strategy.gp.strategy.PromotionStrategy;

//优惠活动方案
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;
    public PromotionActivity(PromotionStrategy promotionStrategy){
        this.promotionStrategy = promotionStrategy;
    }
    public void execute(){
        promotionStrategy.doPromotion();
    }
}
