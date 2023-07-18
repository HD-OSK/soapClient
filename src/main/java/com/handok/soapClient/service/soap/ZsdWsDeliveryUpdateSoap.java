package com.handok.soapClient.service.soap;

import com.handok.soapClient.client.zsd_ws_delivery_update_ws.*;
import com.handok.soapClient.service.SoapClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * The type Zsd ws delivery update soap.
 */
@Service
public class ZsdWsDeliveryUpdateSoap {
    @Value("${service.uri.zsd_ws_delivery_update_ws}")
    private String zsd_ws_delivery_update_ws;

    @Autowired
    private SoapClient client;

    /**
     * Invoke zsd ws delivery update ws delivery update response.
     *
     * @param deliveryNo the delivery no
     * @return the ws delivery update response
     */
    public WsDeliveryUpdateResponse invokeZsdWsDeliveryUpdate(String deliveryNo) {
        WsDeliveryUpdate wsDeliveryUpdate = new WsDeliveryUpdate();
        wsDeliveryUpdate.setCommit("X");
        wsDeliveryUpdate.setDelivery(deliveryNo);
        wsDeliveryUpdate.setEtCreatedHus(new TableOfVekpvb());
        wsDeliveryUpdate.setIfConfirmCentral("");
        wsDeliveryUpdate.setIfDatabaseUpdate("");
        wsDeliveryUpdate.setIfErrorMessagesSend0("");
        wsDeliveryUpdate.setIfGetDeliveryBuffered("");
        wsDeliveryUpdate.setIfLateDeliveryUpd("");
        wsDeliveryUpdate.setIfNoBufferRefresh("");
        wsDeliveryUpdate.setIfNoGenericSystemService("");
        wsDeliveryUpdate.setIfNoInit("");
        wsDeliveryUpdate.setIfNoMesUpdPack("");
        wsDeliveryUpdate.setIfNoRead("");
        wsDeliveryUpdate.setIfNoRemoteChg("");
        wsDeliveryUpdate.setIfWmpp("");
        wsDeliveryUpdate.setItAacItemBlock(new SpeBapidlvcoblitemT());
        wsDeliveryUpdate.setItBapiaddr1(new TableOfBapiaddr1());
        wsDeliveryUpdate.setItHandlingUnits(new TableOfHumRehangHu());
        wsDeliveryUpdate.setItHuItemsEpc(new TableOfSpeHuItemsEpc());
        wsDeliveryUpdate.setItObjects(new TableOfPgrObjects());
        wsDeliveryUpdate.setItPacking(new TableOfRepackHuWm());
        wsDeliveryUpdate.setItPackingSernr(new TableOfHumRepSernr());
        wsDeliveryUpdate.setItPartnerUpdate(new ShpPartnerUpdateT());
        wsDeliveryUpdate.setItRepack(new TableOfHumRepack());
        wsDeliveryUpdate.setItSernrUpdate(new ShpSernrUpdateT());
        wsDeliveryUpdate.setItTexth(new TableOfTexthGn());
        wsDeliveryUpdate.setItTextl(new TableOfTextlGn());
        wsDeliveryUpdate.setItTmstmp(new SpeTimestampT());
        wsDeliveryUpdate.setItVerpoSernr(new TableOfHumVerpoSernr());
        wsDeliveryUpdate.setNichtSperren("");
        wsDeliveryUpdate.setNoMessagesUpdate("");
        wsDeliveryUpdate.setProt(new TableOfPrott());
        wsDeliveryUpdate.setSynchron("");
        wsDeliveryUpdate.setTvpodTab(new TableOfTvpodvb());
        wsDeliveryUpdate.setUpdatePicking("");

        Vbkok vbkok = new Vbkok();
        vbkok.setVbelnVl(deliveryNo);
        vbkok.setWabuc("X");
        vbkok.setWadatIst(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        wsDeliveryUpdate.setVbkokWa(new Vbkok());

        wsDeliveryUpdate.setVbpokTab(new TableOfVbpok());
        wsDeliveryUpdate.setVbsupconTab(new TableOfVbsupcon());
        wsDeliveryUpdate.setVerkoTab(new TableOfVerko());
        wsDeliveryUpdate.setVerpoTab(new TableOfVerpo());

        return (WsDeliveryUpdateResponse) client.getResponseData(zsd_ws_delivery_update_ws, wsDeliveryUpdate);
    }
}
