package com.handok.soapClient.dto.response;

import lombok.Builder;

@Builder
public class BatchStockDetail {
    public String productCode;
    public String batch;
    public Integer stockQty;
    public String batchExpiryDate;
    public Integer batchPeriod;
    public String lot;
    public Integer reservationQty;
    public Integer qty;
}
