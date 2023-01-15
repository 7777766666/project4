package com.bank.history.controllers;

import com.bank.history.mappers.HistoryMapper;
import com.bank.history.models.History;
import com.bank.history.models.dto.HistoryDTO;
import com.bank.history.repositories.HistoryRepository;
import com.bank.history.services.abstracts.HistoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HistoryController {
    private final HistoryService historyService;
    private final HistoryRepository historyRepository;

    public HistoryController(HistoryService historyService, HistoryRepository historyRepository) {
        this.historyService = historyService;
        this.historyRepository = historyRepository;
    }

    @GetMapping(path = "/{id}")
    public HistoryDTO getHistoryById(@PathVariable("id") Long id) {
        return HistoryMapper.HISTORY_MAPPER.toDTO(historyService.findById(id));
    }

    @GetMapping(path = "/all")
    public ResponseEntity<List<HistoryDTO>> getAll() {
        return historyService.getAll();
    }

    @PostMapping(path = "/save")
    public void addHistory(@RequestBody History history) {
        historyService.save(history);
    }

    @PutMapping(path = "/{id}/update")
    public ResponseEntity<String> updateHistory(@PathVariable("id") Long id, @RequestBody History history) {
        return historyService.updateHistory(id, history);
    }
}