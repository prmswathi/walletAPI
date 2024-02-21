package com.edureka.wallet.api;

import com.edureka.wallet.model.PaymentTransactionDto;
import com.edureka.wallet.model.WalletDto;

//one small comment
public interface WalletService {

	WalletDto doTransaction(PaymentTransactionDto transaction);

	WalletDto getBalance(String emailId);

}
