package com.clark.chris.hackathon.repository;

import com.clark.chris.hackathon.model.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface TransactionRepo extends CrudRepository<Transaction, String> {
}
