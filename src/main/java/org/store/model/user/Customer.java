package org.store.model.user;

import lombok.Getter;
import lombok.Setter;
import org.store.model.transaction.PurchaseTransaction;
import org.store.model.transaction.ReturnTransaction;

import java.util.List;

import static java.util.UUID.randomUUID;

@Getter
@Setter
public class Customer {

    String userId;

    String firstName;

    String lastName;

    Boolean hasCustomerRewards;

}
