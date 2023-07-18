package com.handok.soapClient.dto.response;

import lombok.Builder;

@Builder
public class BatchDetail {
    public String rsnum;
    public String rspos;
    public String bster;
    public String bdter;
    public String lgort;
    public String kostl;
    public String matnr;
    public String charg;
    public int bdmng;
    public String meins;
    public String wempf;
    public String vfdat;
    public String batchPeriod;
    public String agentName;
    public String productName;
}
