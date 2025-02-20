package org.store.model.item;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class FoodItem extends Item{

    String itemBrand;

    Double itemPrice;

    Date dateOfPurchase;

    Date dateOfExpiration;

}
