package com.handok.soapClient.dto.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AgentCredit {
    public String agentCode;
    public String agentName;
    public BigDecimal agentKeep;
}
