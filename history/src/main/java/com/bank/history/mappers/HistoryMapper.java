package com.bank.history.mappers;

import com.bank.history.models.History;
import com.bank.history.models.dto.HistoryDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface HistoryMapper {
    HistoryMapper HISTORY_MAPPER = Mappers.getMapper(HistoryMapper.class);
    HistoryDTO toDTO(History history);
}
