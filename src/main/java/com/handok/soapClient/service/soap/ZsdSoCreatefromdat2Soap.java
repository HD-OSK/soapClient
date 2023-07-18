package com.handok.soapClient.service.soap;

import com.handok.soapClient.client.zsd_so_createfromdat2_ws.*;
import com.handok.soapClient.dto.request.Order;
import com.handok.soapClient.service.SoapClient;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ZsdSoCreatefromdat2Soap {
    @Value("${service.uri.zsd_so_createfromdat2_ws}")
    private String zsd_so_createfromdat2_ws;

    @Autowired
    private SoapClient client;

    public ZsdSoCreatefromdat2Response invokeZsdSoCreatefromdat2(Order order) {
        ZsdSoCreatefromdat2 param = new ZsdSoCreatefromdat2();

        param.setBehaveWhenError("");
        param.setBinaryRelationshiptype("");
        param.setConvert("");
        param.setIntNumberAssignment("");

        Bapisdls bapisdls = new Bapisdls();
        bapisdls.setCondHandl("X");
        param.setLogicSwitch(bapisdls);

        //Order Header
        Bapisdhd1 bapisdhd1 = new Bapisdhd1();
        bapisdhd1.setDocType(order.getMaster().getDocType());
        bapisdhd1.setSalesOrg(order.getMaster().getSalesOrg());
        bapisdhd1.setSalesOff(order.getMaster().getSalesOff());
        bapisdhd1.setSalesGrp(order.getMaster().getSalesGrp());
        bapisdhd1.setDistrChan(order.getMaster().getDistrChan());
        bapisdhd1.setDivision(order.getMaster().getDivision());
        bapisdhd1.setOrdReason(order.getMaster().getOrdReason());
        bapisdhd1.setPurchNoC(order.getMaster().getPurchNoC());
        param.setOrderHeaderIn(bapisdhd1);

        param.setOrderHeaderInx(new Bapisdhd1X());
        param.setSalesdocumentin("");
        param.setSender(new Sender());
        param.setTestrun("");
        param.setExtensionin(new TableOfBapiparex());
        param.setOrderCcard(new TableOfBapiccard());
        param.setOrderCfgsBlob(new TableOfBapicublb());
        param.setOrderCfgsInst(new TableOfBapicuins());
        param.setOrderCfgsPartOf(new TableOfBapicuprt());
        param.setOrderCfgsRef(new TableOfBapicucfg());
        param.setOrderCfgsRefinst(new TableOfBapicuref());
        param.setOrderCfgsValue(new TableOfBapicuval());
        param.setOrderCfgsVk(new TableOfBapicuvk());
        param.setOrderConditionsIn(new TableOfBapicond());
        param.setOrderConditionsInx(new TableOfBapicondx());
        param.setOrderItemsIn(new TableOfBapisditm());
        param.setOrderItemsInx(new TableOfBapisditmx());
        param.setOrderKeys(new TableOfBapisdkey());

        //파트너
        TableOfBapiparnr tableOfBapiparnr = new TableOfBapiparnr();
        for (Order.Partner partner : order.getPartners()) {
            Bapiparnr bapiparnr = new Bapiparnr();
            bapiparnr.setPartnRole(partner.getPartnRole());
            bapiparnr.setPartnNumb(partner.getPartnNumb());
            tableOfBapiparnr.getItem().add(bapiparnr);
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

        param.setPartneraddresses(new TableOfBapiaddr1());
        param.setReturn(new TableOfBapiret2());

        TableOfBapisditm tableOfBapisditm = new TableOfBapisditm();
        TableOfBapischdl tableOfBapischdl = new TableOfBapischdl();
        TableOfBapicond tableOfBapicond = new TableOfBapicond();
        TableOfBapicondx tableOfBapicondx = new TableOfBapicondx();

        int itemNumber = 10;
        for (Order.Detail detail: order.getDetails()) {
            Bapisditm bapisditm = new Bapisditm();
            bapisditm.setMaterial(StringUtils.leftPad(detail.getProductCode(), 18, "0"));
            if(StringUtils.isEmpty(detail.getBatch())) bapisditm.setBatch(detail.getBatch());
            bapisditm.setItmNumber(StringUtils.leftPad(String.valueOf(itemNumber), 6, "0"));
            if(detail.getAmt() == 0) bapisditm.setItemCateg("ZHNN");
            tableOfBapisditm.getItem().add(bapisditm);

            Bapischdl bapischdl = new Bapischdl();
            bapischdl.setReqQty(BigDecimal.valueOf(detail.getQty()));
            bapischdl.setItmNumber(StringUtils.leftPad(String.valueOf(itemNumber), 6, "0"));
            tableOfBapischdl.getItem().add(bapischdl);

            if(detail.getAmt() > 0) {
                Bapicond bapicond = new Bapicond();
                bapicond.setItmNumber(StringUtils.leftPad(String.valueOf(itemNumber), 6, "0"));
                bapicond.setCondValue(BigDecimal.valueOf(detail.getAmt()));
                bapicond.setCondType("PR00");
                bapicond.setCondCount("");
                bapicond.setCondcntrl("C");
                bapicond.setCondclass("B");
                bapicond.setCalctypcon("C");
                bapicond.setCondorigin("A");
                bapicond.setCurrency("KRW");
                bapicond.setCondUpdat("X");
                tableOfBapicond.getItem().add(bapicond);

                Bapicondx bapicondx = new Bapicondx();
                bapicondx.setUpdateflag("U");
                bapicondx.setCondValue("X");
                bapicondx.setCondType("PR00");
                bapicondx.setCondCount("01");
                bapicondx.setCurrency("X");
                bapicondx.setItmNumber(StringUtils.leftPad(String.valueOf(itemNumber), 6, "0"));
                tableOfBapicondx.getItem().add(bapicondx);
            }
        }

        param.setOrderItemsIn(tableOfBapisditm);
        param.setOrderSchedulesIn(tableOfBapischdl);
        param.setOrderConditionsIn(tableOfBapicond);
        param.setOrderConditionsInx(tableOfBapicondx);

        return (ZsdSoCreatefromdat2Response) client.getResponseData(zsd_so_createfromdat2_ws, param);
    }
}
