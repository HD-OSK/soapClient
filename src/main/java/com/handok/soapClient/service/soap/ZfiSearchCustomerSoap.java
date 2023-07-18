package com.handok.soapClient.service.soap;

import com.handok.soapClient.client.zfi_search_customer_ws.TableOfZsfi027;
import com.handok.soapClient.client.zfi_search_customer_ws.ZfiSearchCustomer;
import com.handok.soapClient.client.zfi_search_customer_ws.ZfiSearchCustomerResponse;
import com.handok.soapClient.service.SoapClient;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ZfiSearchCustomerSoap {
    @Value("${service.uri.zfi_search_customer_ws}")
    private String zfi_search_customer_ws;

    @Autowired
    private SoapClient client;

    public ZfiSearchCustomerResponse invokeZfiSearchCustomer(String i_gubun, String i_value) {
        i_value = i_gubun.equalsIgnoreCase("1") ? StringUtils.leftPad(i_value, 10, "0") : i_value;

        ZfiSearchCustomer zfiSearchCustomer = new ZfiSearchCustomer();
        zfiSearchCustomer.setIGubun(i_gubun);
        zfiSearchCustomer.setIValue(i_value);
        zfiSearchCustomer.setTData(new TableOfZsfi027());

        return (ZfiSearchCustomerResponse) client.getResponseData(zfi_search_customer_ws, zfiSearchCustomer);

    }
}
