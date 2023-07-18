package com.handok.soapClient.dto.response;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public class SimulateData {
    private String Material;
    private BigDecimal NetValue1;
    private BigDecimal TxDocCur;
    private Long seq;
    private String ItmNumber;

}
