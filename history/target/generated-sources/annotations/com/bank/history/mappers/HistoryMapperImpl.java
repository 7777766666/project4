package com.bank.history.mappers;

import com.bank.history.models.History;
import com.bank.history.models.dto.HistoryDTO;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-15T04:37:04+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
public class HistoryMapperImpl implements HistoryMapper {

    @Override
    public HistoryDTO toDTO(History history) {
        if ( history == null ) {
            return null;
        }

        HistoryDTO historyDTO = new HistoryDTO();

        historyDTO.setId( history.getId() );
        historyDTO.setTransferAuditId( history.getTransferAuditId() );
        historyDTO.setProfileAuditId( history.getProfileAuditId() );
        historyDTO.setAccountAuditId( history.getAccountAuditId() );
        historyDTO.setAntiFraudAuditId( history.getAntiFraudAuditId() );
        historyDTO.setPublicBankInfoAuditId( history.getPublicBankInfoAuditId() );
        historyDTO.setAuthorizationAuditId( history.getAuthorizationAuditId() );

        return historyDTO;
    }
}
