package com.handok.soapClient.service.soap;

import com.handok.soapClient.client.zsd_delivery_note_so.TableOfZssd007;
import com.handok.soapClient.client.zsd_delivery_note_so.ZsdDeliveryNoteSo;
import com.handok.soapClient.client.zsd_delivery_note_so.ZsdDeliveryNoteSoResponse;
import com.handok.soapClient.service.SoapClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ZsdDeliveryNoteSoSoap {
    @Value("${service.uri.zsd_delivery_note_so}")
    private String zsd_delivery_note_so;

    @Autowired
    private SoapClient client;

    /**
     * Invoke zsd delivery note so zsd delivery note so response.
     *
     * @param Vbeln the 주문번호
     * @return the zsd delivery note so response
     */
    public ZsdDeliveryNoteSoResponse invokeZsdDeliveryNoteSo(String Vbeln) {
        ZsdDeliveryNoteSo zsdDeliveryNoteSo = new ZsdDeliveryNoteSo();
        zsdDeliveryNoteSo.setVbeln(Vbeln);
        zsdDeliveryNoteSo.setGtTab(new TableOfZssd007());

        return (ZsdDeliveryNoteSoResponse) client.getResponseData(zsd_delivery_note_so, zsdDeliveryNoteSo);
    }
}
