package com.handok.soapClient.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SimulationRequestDto {
    private String agentCode;           //거래처코드
    private String endCustomerId;       //실거래처코드
    private String docType;             //주문유형
    private String distrChan;           //직(간)납
    private List<SimulationProductDto> products;   //제품
}
