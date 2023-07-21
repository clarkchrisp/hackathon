package com.clark.chris.hackathon.message;

import com.clark.chris.hackathon.model.Transaction;
import com.clark.chris.hackathon.repository.TransactionRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@AllArgsConstructor
public class TransactionListener {

    private TransactionRepo transactionRepo;

    private ObjectMapper objectMapper;
    @JmsListener(destination = "transactionListener")
    public void processMessage(String content) throws Exception {
        log.info("Processing: " + content);
        var transaction = objectMapper.readValue(content, Transaction.class);
        transactionRepo.save(transaction);
    }
}
