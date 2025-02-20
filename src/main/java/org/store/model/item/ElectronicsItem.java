package org.store.model.item;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ElectronicsItem extends Item {

    Double itemPrice;

    Boolean hasWarranty;

    Boolean hasAgeRestriction;

    Boolean hasSecurityRestriction;
}
