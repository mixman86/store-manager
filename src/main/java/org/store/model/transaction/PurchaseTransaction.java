package org.store.model.transaction;

import lombok.Getter;
import lombok.Setter;
import org.store.model.item.FoodItem;
import org.store.model.item.HomeItem;

import java.util.List;

@Getter
@Setter
public class PurchaseTransaction implements Transaction{

    public String userId;

    public List<FoodItem> purchasedFoodItems;

    public List<HomeItem> purchasedHomeItems;

    public Boolean customerRewardsUsed;

    @Override
    public Double calculateTotal() {
        return 0.0;
    }
}
