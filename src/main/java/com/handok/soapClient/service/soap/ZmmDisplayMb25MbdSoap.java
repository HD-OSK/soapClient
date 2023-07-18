package com.handok.soapClient.service.soap;

import com.handok.soapClient.client.zmm_display_mb25_mbd_ws.TableOfZsmm025;
import com.handok.soapClient.client.zmm_display_mb25_mbd_ws.ZmmDisplayMb25Mbd;
import com.handok.soapClient.client.zmm_display_mb25_mbd_ws.ZmmDisplayMb25MbdResponse;
import com.handok.soapClient.service.SoapClient;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ZmmDisplayMb25MbdSoap {
    @Value("${service.uri.zmm_display_mb25_mbd_ws}")
    private String zmm_display_mb25_mbd_ws;

    @Autowired
    private SoapClient client;

    /**
     * Invoke zmm display mb 25 mbd zmm display mb 25 mbd response.
     *
     * @param partner the partner
     * @param mat     the mat
     * @return the zmm display mb 25 mbd response
     */
    public ZmmDisplayMb25MbdResponse invokeZmmDisplayMb25Mbd(String partner, String mat) {
        ZmmDisplayMb25Mbd zmmDisplayMb25Mbd = new ZmmDisplayMb25Mbd();
        if(!StringUtils.isEmpty(mat)) {
            zmmDisplayMb25Mbd.setIFrmatnr(StringUtils.leftPad(mat, 18, "0"));
            zmmDisplayMb25Mbd.setITomatnr(StringUtils.leftPad(mat, 18, "0"));
        }

        if(!StringUtils.isEmpty(partner)) {
            zmmDisplayMb25Mbd.setIFrwempf(partner);
            zmmDisplayMb25Mbd.setITowempf(partner);
        }

        zmmDisplayMb25Mbd.setIFrkostl("0000079999");
        zmmDisplayMb25Mbd.setITokostl("0000079999");
        zmmDisplayMb25Mbd.setETable(new TableOfZsmm025());

        return (ZmmDisplayMb25MbdResponse) client.getResponseData(zmm_display_mb25_mbd_ws, zmmDisplayMb25Mbd);
    }
}
