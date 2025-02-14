package org.store.model.customer;

import lombok.Getter;
import lombok.Setter;
import org.store.model.transaction.PurchaseTransaction;
import org.store.model.transaction.ReturnTransaction;
import org.store.model.user.User;

import java.util.List;

import static java.util.UUID.randomUUID;

@Getter
@Setter
public class Customer implements User {

    String userId;

    String firstName;

    String lastName;

    Boolean hasCustomerRewards;

    Boolean isNewCustomer;

    @Override
    public void generateUserId() {
        if(isNewCustomer){
            userId = String.valueOf(randomUUID());
        }
    }

    @Override
    public List<PurchaseTransaction> getUserPurchaseTransactions() {
        return List.of();
    }

    @Override
    public List<ReturnTransaction> getUserReturnTransactions() {
        return List.of();
    }
}
