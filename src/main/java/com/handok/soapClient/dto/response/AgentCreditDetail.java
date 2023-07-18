package com.handok.soapClient.dto.response;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public class AgentCreditDetail {
    public String agentCode;
    public String agentName;
    public BigDecimal agentCreditTotal; //여신한도
    public BigDecimal agentAr;          //미수금
    public BigDecimal agentKeep;        //접수
    public BigDecimal agentCredit;      //잔여여신
    public BigDecimal agentOverdue;     //전월 미 입금액
    public String agentPayTerm;         //지급조건
}
