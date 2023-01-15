package com.bank.history.services.abstracts;

import com.bank.history.models.History;
import com.bank.history.models.dto.HistoryDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface HistoryService {

    void save(History history);

    HistoryDTO getById(Long id);

    List<HistoryDTO> getAllHistories();

    boolean update(Long id, History history);

    History findById(Long id);

    ResponseEntity<String> updateHistory(Long id, History history);

    ResponseEntity<List<HistoryDTO>> getAll();

}
