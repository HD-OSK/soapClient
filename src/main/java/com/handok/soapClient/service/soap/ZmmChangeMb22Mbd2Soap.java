package com.handok.soapClient.service.soap;

import com.handok.soapClient.client.zmm_change_mb22_mbd_2_ws.TableOfZsmm024;
import com.handok.soapClient.client.zmm_change_mb22_mbd_2_ws.ZmmChangeMb22Mbd2;
import com.handok.soapClient.client.zmm_change_mb22_mbd_2_ws.ZmmChangeMb22Mbd2Response;
import com.handok.soapClient.client.zmm_change_mb22_mbd_2_ws.Zsmm024;
import com.handok.soapClient.service.SoapClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ZmmChangeMb22Mbd2Soap {
    @Value("${service.uri.zmm_change_mb22_mbd_2_ws}")
    private String zmm_change_mb22_mbd_2_ws;

    @Autowired
    private SoapClient client;

    public ZmmChangeMb22Mbd2Response invokeZmmChangeMb22Mbd2(String rsnum, String rspos, BigDecimal bdmng, String wempf, String xloek) {
        ZmmChangeMb22Mbd2 zmmChangeMb22Mbd2 = new ZmmChangeMb22Mbd2();
        zmmChangeMb22Mbd2.setIRsnum(rsnum);

        TableOfZsmm024 tableOfZsmm024 = new TableOfZsmm024();
        List<Zsmm024> zsmm024List = tableOfZsmm024.getItem();
        Zsmm024 zsmm024 = new Zsmm024();
        zsmm024.setRspos(rspos);
        zsmm024.setLgort("KRCH");

        if (xloek.equals("1")) {
            //삭제
            zsmm024.setXloek("1");
        } else {
            //수정
            zsmm024.setXloek("0");
            zsmm024.setBdmng(bdmng);
            zsmm024.setWempf(wempf);
        }
        zsmm024List.add(zsmm024);

        zmmChangeMb22Mbd2.setITable(tableOfZsmm024);

        return (ZmmChangeMb22Mbd2Response) client.getResponseData(zmm_change_mb22_mbd_2_ws, zmmChangeMb22Mbd2);
    }
}
