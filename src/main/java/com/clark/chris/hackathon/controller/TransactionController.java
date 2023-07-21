package com.clark.chris.hackathon.controller;

import com.clark.chris.hackathon.model.Transaction;
import com.clark.chris.hackathon.repository.TransactionRepo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class TransactionController {

    private TransactionRepo transactionRepo;

    @GetMapping("transaction")
    public Iterable<Transaction> getTransactions() {
        return transactionRepo.findAll();
    }
}
