package com.example.transactioncontrolsystem.controller;

import com.example.transactioncontrolsystem.entity.Transaction;
import com.example.transactioncontrolsystem.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/airway")
public class TransactionController {

    private final TransactionService transactionService;

    @GetMapping(value = "/{id}")
    public Transaction getTransaction(@PathVariable @Min(1) Integer id) {
        return transactionService.getTransaction(id);
    }
    @PostMapping(value = "/create")
    public void addTransaction(@Valid @RequestBody Transaction transaction) {
        transactionService.addTransaction(transaction);
    }
    @PutMapping(value = "/update")
    public Transaction updateTransaction(@Valid @RequestBody Transaction transaction) {
        return transactionService.updateTransaction(transaction);
    }
    @DeleteMapping(value = "/delete")
    public boolean deleteTransaction(@RequestParam @Min(1) Integer id) {
        return transactionService.deleteTransaction(id);
    }

}
