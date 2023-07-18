package com.handok.soapClient.service.soap;

import com.handok.soapClient.client.zmm_change_mb22_mbd_ws.TableOfZsmm024;
import com.handok.soapClient.client.zmm_change_mb22_mbd_ws.ZmmChangeMb22Mbd;
import com.handok.soapClient.client.zmm_change_mb22_mbd_ws.ZmmChangeMb22MbdResponse;
import com.handok.soapClient.client.zmm_change_mb22_mbd_ws.Zsmm024;
import com.handok.soapClient.service.SoapClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ZmmChangeMb22MbdSoap {
    @Value("${service.uri.zmm_change_mb22_mbd_ws}")
    private String zmm_change_mb22_mbd_ws;

    @Autowired
    private SoapClient client;

    /**
     * Invoke zmm change mb 22 mbd response zmm change mb 22 mbd response.
     *
     * @param rsnum the rsnum
     * @param rspos the rspos
     * @param bdmng the bdmng
     * @return the zmm change mb 22 mbd response
     */
    public ZmmChangeMb22MbdResponse invokeZmmChangeMb22MbdResponse(String rsnum, String rspos, int bdmng) {
        ZmmChangeMb22Mbd zmmChangeMb22Mbd = new ZmmChangeMb22Mbd();
        zmmChangeMb22Mbd.setIRsnum(rsnum);

        TableOfZsmm024 tableOfZsmm024 = new TableOfZsmm024();
        List<Zsmm024> zsmm024List = tableOfZsmm024.getItem();
        Zsmm024 zsmm024 = new Zsmm024();
        zsmm024.setRspos(rspos);
        zsmm024.setBdmng(BigDecimal.valueOf(bdmng));
        zsmm024.setXloek("0");
        zsmm024.setLgort("KRCH");
        zsmm024List.add(zsmm024);

        zmmChangeMb22Mbd.setITable(tableOfZsmm024);

        return (ZmmChangeMb22MbdResponse) client.getResponseData(zmm_change_mb22_mbd_ws, zmmChangeMb22Mbd);
    }
}
