package org.store.model.transaction;

import lombok.Getter;
import lombok.Setter;

import java.util.Enumeration;

@Getter
@Setter
public class ReturnTransaction implements Transaction{

    String transactionId;

    String userId;

    String itemId;

    String typeOfReturnGiven;

    Double amountOfReturn;

    Enumeration<ReturnType> reasonForReturn;

    @Override
    public Double calculateTotal() {
        return 0.0;
    }
}
