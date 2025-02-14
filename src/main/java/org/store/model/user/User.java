package org.store.model.user;

import org.store.model.transaction.PurchaseTransaction;
import org.store.model.transaction.ReturnTransaction;

import java.util.List;

public interface User {

    public void generateUserId();

    public List<PurchaseTransaction> getUserPurchaseTransactions();

    public List<ReturnTransaction> getUserReturnTransactions();
}
