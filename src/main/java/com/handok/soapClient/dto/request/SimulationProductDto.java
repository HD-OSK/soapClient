package com.handok.soapClient.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SimulationProductDto {
    private String productCode; //제품코드
    private int qty;            //수량
    private int rowIndex;       //로우 인덱스
}
