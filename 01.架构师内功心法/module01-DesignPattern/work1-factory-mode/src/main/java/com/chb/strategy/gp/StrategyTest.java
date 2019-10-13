package com.chb.strategy.gp;

import com.chb.strategy.gp.factory.PromotionStrategyFactory;

public class StrategyTest {
    public static void main(String[] args) {
        String promotionKey = "GROUPBUY";
        PromotionActivity promotionActivity =
                new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.execute();
    }
}
