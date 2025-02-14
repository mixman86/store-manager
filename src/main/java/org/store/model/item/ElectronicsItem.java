package org.store.model.item;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ElectronicsItem implements Item{

    String itemId;

    String itemName;

    String itemManufacturer;

    Double itemPrice;

    Boolean hasWarranty;

    Boolean hasAgeRestriction;

    Boolean hasSecurityRestriction;

    @Override
    public String generateItemId() {
        return "";
    }

    @Override
    public Double calculateItemPurchasePrice() {
        return 0.0;
    }
}
