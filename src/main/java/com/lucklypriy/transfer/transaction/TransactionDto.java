package com.lucklypriy.transfer.transaction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

import com.lucklypriy.transfer.transaction.TransactionInfo.TransactionStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDto {
    private long id;
    private long srcAccountId;
    private long targetAccountId;
    private BigDecimal amount;
    private TransactionStatus status;
    private String statusReason;
}
