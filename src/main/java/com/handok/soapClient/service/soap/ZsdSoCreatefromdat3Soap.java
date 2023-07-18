package com.handok.soapClient.service.soap;

import com.handok.soapClient.client.zsd_so_createfromdat3_ws.*;
import com.handok.soapClient.dto.request.Order;
import com.handok.soapClient.service.SoapClient;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ZsdSoCreatefromdat3Soap {
    @Value("${service.uri.zsd_so_createfromdat3_ws}")
    private String zsd_so_createfromdat3_ws;

    @Autowired
    private SoapClient client;

    public ZsdSoCreatefromdat3Response invokeZsdSoCreatefromdat3(Order order) {
        ZsdSoCreatefromdat3 param = new ZsdSoCreatefromdat3();

        param.setBehaveWhenError("");
        param.setBinaryRelationshiptype("");
        param.setConvert("");
        param.setExtensionin(new TableOfBapiparex());
        param.setIntNumberAssignment("");

        Bapisdls bapisdls = new Bapisdls();
        bapisdls.setCondHandl("X");
        param.setLogicSwitch(bapisdls);

        param.setOrderCcard(new TableOfBapiccard());
        param.setOrderCfgsBlob(new TableOfBapicublb());
        param.setOrderCfgsInst(new TableOfBapicuins());
        param.setOrderCfgsPartOf(new TableOfBapicuprt());
        param.setOrderCfgsRef(new TableOfBapicucfg());
        param.setOrderCfgsRefinst(new TableOfBapicuref());
        param.setOrderCfgsValue(new TableOfBapicuval());
        param.setOrderCfgsVk(new TableOfBapicuvk());
        param.setOrderHeaderInx(new Bapisdhd1X());
        param.setOrderKeys(new TableOfBapisdkey());
        param.setOrderSchedulesInx(new TableOfBapischdlx());
        param.setPartneraddresses(new TableOfBapiaddr1());
        param.setReturn(new TableOfBapiret2());
        param.setSalesdocumentin("");
        param.setSender(new Sender());
        param.setTestrun("");

        //파트너
        TableOfBapiparnr tableOfBapiparnr = new TableOfBapiparnr();
        for (Order.Partner partner: order.getPartners()) {
            Bapiparnr bapiparnr = new Bapiparnr();
            bapiparnr.setPartnRole(partner.getPartnRole());
            bapiparnr.setPartnNumb(partner.getPartnNumb());
        }
        param.setOrderPartners(tableOfBapiparnr);

        //Text
        TableOfBapisdtext tableOfBapisdtext = new TableOfBapisdtext();
        for (Order.Desc text : order.getDescs()) {
            Bapisdtext bapisdtext = new Bapisdtext();
            bapisdtext.setTextId("0004");
            bapisdtext.setFormatCol("*");
            bapisdtext.setLangu("3");
            bapisdtext.setTextLine(text.getTextLine());
            tableOfBapisdtext.getItem().add(bapisdtext);
        }
        param.setOrderText(tableOfBapisdtext);

        //Order Header
        Bapisdhd1 bapisdhd1 = new Bapisdhd1();
        bapisdhd1.setDocType(order.getMaster().getDocType());
        bapisdhd1.setOrdReason(order.getMaster().getOrdReason());
        bapisdhd1.setSalesGrp(order.getMaster().getSalesGrp());
        bapisdhd1.setDistrChan(order.getMaster().getDistrChan());
        bapisdhd1.setDivision(order.getMaster().getDivision());
        bapisdhd1.setSalesGrp(order.getMaster().getSalesGrp());
        bapisdhd1.setSalesOff(order.getMaster().getSalesOff());
        bapisdhd1.setPurchNoC(order.getMaster().getPurchNoC());
        param.setOrderHeaderIn(bapisdhd1);

        //Order Detail
        TableOfBapisditm tableOfBapisditm = new TableOfBapisditm();
        TableOfBapicond tableOfBapicond = new TableOfBapicond();
        TableOfBapischdl tableOfBapischdl = new TableOfBapischdl();
        TableOfBapicondx tableOfBapicondx = new TableOfBapicondx();

        int itemNumber = 10;
        for (Order.Detail item: order.getDetails()) {
            Bapisditm bapisditm = new Bapisditm();
            bapisditm.setMaterial(StringUtils.leftPad(item.getProductCode(), 18, "0"));
            bapisditm.setItmNumber(StringUtils.leftPad(String.valueOf(itemNumber), 6, "0"));
            if(!StringUtils.isEmpty(item.getBatch())) bapisditm.setBatch(item.getBatch());
            if(order.getMaster().getDocType().equals("G2")) bapisditm.setTargetQty(BigDecimal.valueOf(item.getQty()));
            if(order.getMaster().getDocType().equals("ZM") && item.getAmt() == 0) bapisditm.setItemCateg("ZHNN");
            else if(order.getMaster().getDocType().equals("KE") && item.getAmt() == 0) bapisditm.setItemCateg("KENN");
            tableOfBapisditm.getItem().add(bapisditm);

            if(!order.getMaster().getDocType().equals("G2")) {
                Bapischdl bapischdl = new Bapischdl();
                bapischdl.setItmNumber(StringUtils.leftPad(String.valueOf(itemNumber), 6, "0"));
                bapischdl.setReqQty(BigDecimal.valueOf(item.getQty()));
                bapischdl.setReqTime("");
                tableOfBapischdl.getItem().add(bapischdl);
            }

            if(item.getAmt() > 0) {
                Bapicond bapicond = new Bapicond();
                bapicond.setItmNumber(StringUtils.leftPad(String.valueOf(itemNumber), 6, "0"));
                bapicond.setCondType(order.getMaster().getCondType());
                bapicond.setCondValue(BigDecimal.valueOf(item.getAmt()));
                bapicond.setCondcntrl("C");
                bapicond.setCondclass("B");
                bapicond.setCalctypcon("C");
                bapicond.setCondorigin("A");
                bapicond.setCurrency("KRW");
                bapicond.setCondUpdat("X");
                bapicond.setCondcount("1");
                tableOfBapicond.getItem().add(bapicond);

                if(!order.getMaster().getDocType().equals("G2")) {
                    Bapicondx bapicondx = new Bapicondx();
                    bapicondx.setItmNumber(StringUtils.leftPad(String.valueOf(itemNumber), 6, "0"));
                    bapicondx.setUpdateflag("U");
                    bapicondx.setCondValue("X");
                    bapicondx.setCurrency("X");
                    bapicondx.setCondType(order.getMaster().getCondType());
                    bapicondx.setCondCount("1");
                    tableOfBapicondx.getItem().add(bapicondx);
                }
            }

            itemNumber += 10;
        }
        param.setOrderItemsIn(tableOfBapisditm);
        param.setOrderConditionsIn(tableOfBapicond);
        param.setOrderSchedulesIn(tableOfBapischdl);
        param.setOrderConditionsInx(tableOfBapicondx);

        return (ZsdSoCreatefromdat3Response) client.getResponseData(zsd_so_createfromdat3_ws, param);
    }
}
