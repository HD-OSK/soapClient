package com.handok.soapClient.service.soap;

import com.handok.soapClient.client.zfi_credit_detail.ZfiCreditDetail;
import com.handok.soapClient.client.zfi_credit_detail.ZfiCreditDetailResponse;
import com.handok.soapClient.service.SoapClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ZfiCreditDetailSoap {
    @Value("${service.uri.zfi_credit_detail}") private String zfi_credit_detail;

    @Autowired
    private SoapClient client;

    /**
     * Invoke zfi credit detail zfi credit detail response.
     *
     * @param agentCode the agent code
     * @return the zfi credit detail response
     */
    public ZfiCreditDetailResponse invokeZfiCreditDetail(String agentCode) {
        ZfiCreditDetail zfiCreditDetail = new ZfiCreditDetail();
        zfiCreditDetail.setKkber("KR01");
        zfiCreditDetail.setBukrs("0913");
        zfiCreditDetail.setKunnr(agentCode);

        return (ZfiCreditDetailResponse) client.getResponseData(zfi_credit_detail, zfiCreditDetail);
    }
}
