package com.handok.soapClient.dto.request;

import lombok.Data;

@Data
public class Reservation {
    public String resvDate;     //예약만료일
    public String agentCode;    //실거래처코드
    public String prodCode;     //제품코드
    public String batch;        //Batch
    public int resvQty;         //예약수량
}
