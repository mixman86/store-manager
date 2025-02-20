package org.store.model.item;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class HomeItem extends Item {

    Double itemPrice;

    Boolean hasWarranty;
}
