package org.store.model.transaction;

public interface Transaction {

    public String createTransactionId();

    public Double calculateTotal();
}
