package org.store.model.item;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class FoodItem implements Item{

    String itemId;

    String itemName;

    String itemBrand;

    Double itemPrice;

    Date dateOfPurchase;

    Date dateOfExpiration;

    @Override
    public String generateItemId() {
        return "";
    }

    @Override
    public Double calculateItemPurchasePrice() {
        return 0.0;
    }
}
