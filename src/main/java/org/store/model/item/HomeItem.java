package org.store.model.item;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class HomeItem implements Item{

    String itemId;

    String itemName;

    String itemManufacturer;

    Double itemPrice;

    Boolean hasWarranty;

    @Override
    public String generateItemId() {
        return "";
    }

    @Override
    public Double calculateItemPurchasePrice() {
        return 0.0;
    }
}
