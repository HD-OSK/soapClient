package com.handok.soapClient.service.soap;

import com.handok.soapClient.client.zmm_create_mb21_mbd_ws.TableOfZsmm023;
import com.handok.soapClient.client.zmm_create_mb21_mbd_ws.ZmmCreateMb21Mbd;
import com.handok.soapClient.client.zmm_create_mb21_mbd_ws.ZmmCreateMb21MbdResponse;
import com.handok.soapClient.client.zmm_create_mb21_mbd_ws.Zsmm023;
import com.handok.soapClient.dto.request.Reservation;
import com.handok.soapClient.service.SoapClient;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class ZmmCreateMb21MbdSoap {
    @Value("${service.uri.zmm_create_mb21_mbd_ws}")
    private String zmm_create_mb21_mbd_ws;

    @Autowired
    private SoapClient client;

    /**
     * Invoke zmm create mb 21 mbd zmm create mb 21 mbd response.
     *
     * @param resv the resv
     * @return the zmm create mb 21 mbd response
     */
    public ZmmCreateMb21MbdResponse invokeZmmCreateMb21Mbd(Reservation resv) {
        ZmmCreateMb21Mbd zmmCreateMb21Mbd = new ZmmCreateMb21Mbd();
        zmmCreateMb21Mbd.setIBster(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        zmmCreateMb21Mbd.setIBdter(resv.getResvDate());
        zmmCreateMb21Mbd.setIBwart("201");
        zmmCreateMb21Mbd.setIWempf(resv.getAgentCode());
        zmmCreateMb21Mbd.setIKostl("0000079999");

        TableOfZsmm023 tableOfZsmm023 = new TableOfZsmm023();
        List<Zsmm023> list = tableOfZsmm023.getItem();
        Zsmm023 zsmm023 = new Zsmm023();
        zsmm023.setMatnr(StringUtils.leftPad(resv.getProdCode(), 18, "0"));
        zsmm023.setCharg(resv.getBatch());
        zsmm023.setLgort("KRCH");
        zsmm023.setMenge(BigDecimal.valueOf(resv.getResvQty()));
        list.add(zsmm023);

        zmmCreateMb21Mbd.setITable(tableOfZsmm023);

        return (ZmmCreateMb21MbdResponse) client.getResponseData(zmm_create_mb21_mbd_ws, zmmCreateMb21Mbd);
    }
}
