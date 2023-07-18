package com.handok.soapClient.dto.response;

import lombok.Builder;

import java.math.BigDecimal;
import java.util.List;

@Builder
public class DeliveryNoteSo {
    private BigDecimal Gnetwrc;
    private BigDecimal Gtotalc;
    private List<GtTab> gtTabList;
}
