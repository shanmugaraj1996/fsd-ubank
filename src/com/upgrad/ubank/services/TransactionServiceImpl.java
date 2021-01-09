package com.upgrad.ubank.services;

import com.upgrad.ubank.dtos.Transaction;

public class TransactionServiceImpl implements TransactionService{
    private Transaction[] transactions;
    private int count;

    public TransactionServiceImpl() {
        this.transactions = new Transaction[100];
        this.count = 0;
    }

    @Override
    public Transaction createTransaction(Transaction transaction) {
        transactions[count]=transaction;
        count++;

        return transaction;
    }

    @Override
    public Transaction[] getTransactions(int accountNo) {
        Transaction[] tempTransaction=new Transaction[100];
        int tempCount=0;
        for(int i=0;i< transactions.length;i++){
            if(transactions[i].getAccountNo()==accountNo){
                tempTransaction[tempCount++]=transactions[i];
            }
        }
        return tempTransaction;
    }
}
