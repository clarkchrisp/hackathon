package com.clark.chris.hackathon.controller;


import com.clark.chris.hackathon.model.Transaction;
import com.clark.chris.hackathon.repository.TransactionRepo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clark.chris.hackathon.api.SentimentApi;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
public class TransactionController {

    private TransactionRepo transactionRepo;

    private SentimentApi sentimentApi;

    @GetMapping("transaction")
    public Iterable<Transaction> getTransactions() {
        return transactionRepo.findAll();
    }

    @PostMapping("transaction/clean")
    public Transaction cleanTransaction(@RequestBody Transaction transaction) {
        transaction.setDescription(sentimentApi.sanitiseString(transaction.getDescription()).getCensored());
        return transaction;
    }

}
