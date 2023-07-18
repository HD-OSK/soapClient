package com.handok.soapClient.service.soap;

import com.handok.soapClient.client.zmm_display_mb58_ws.TableOfZsmm026;
import com.handok.soapClient.client.zmm_display_mb58_ws.ZmmDisplayMb58;
import com.handok.soapClient.client.zmm_display_mb58_ws.ZmmDisplayMb58Response;
import com.handok.soapClient.service.SoapClient;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ZmmDisplayMb58Soap {
    @Value("${service.uri.zmm_display_mb58_ws}")
    private String zmm_display_mb58_ws;

    @Autowired
    private SoapClient client;

    /**
     * Invoke zmm display mb 58 zmm display mb 58 response.
     *
     * @param partner 재고파트너
     * @param mat     제품코드
     * @return the zmm display mb 58 response
     */
    public ZmmDisplayMb58Response invokeZmmDisplayMb58(String partner, String mat) {
        ZmmDisplayMb58 zmmDisplayMb58 = new ZmmDisplayMb58();

        zmmDisplayMb58.setIKunnr(StringUtils.leftPad(partner, 10, "0"));
        if(StringUtils.isEmpty(mat)) zmmDisplayMb58.setIMatnr("");
        else zmmDisplayMb58.setIMatnr(StringUtils.leftPad(mat, 18, "0"));
        zmmDisplayMb58.setETable(new TableOfZsmm026());

        return (ZmmDisplayMb58Response) client.getResponseData(zmm_display_mb58_ws, zmmDisplayMb58);
    }
}
