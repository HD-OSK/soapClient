package com.handok.soapClient.service.soap;

import com.handok.soapClient.client.zsd_cust_return_create_ws.*;
import com.handok.soapClient.dto.request.Order;
import com.handok.soapClient.service.SoapClient;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ZsdCustReturnCreateSoap {
    @Value("${service.uri.zsd_cust_return_create_ws}")
    private String zsd_cust_return_create_ws;

    @Autowired
    private SoapClient client;

    public ZsdCustReturnCreateResponse invokeZsdCustReturnCreate(@NotNull Order order) {
        ZsdCustReturnCreate param = new ZsdCustReturnCreate();

        param.setBehaveWhenError("");
        param.setBinaryRelationshiptype("");
        param.setConvert("");
        param.setExtensionin(new TableOfBapiparex());
        param.setIntNumberAssignment("");
        Bapisdls bapisdls = new Bapisdls();
        bapisdls.setCondHandl("X");
        param.setLogicSwitch(bapisdls);

        param.setPartneraddresses(new TableOfBapiaddr1());
        param.setReturn(new TableOfBapiret2());

        param.setReturnCfgsBlob(new TableOfBapicublb());
        param.setReturnCfgsInst(new TableOfBapicuins());
        param.setReturnCfgsPartOf(new TableOfBapicuprt());
        param.setReturnCfgsRef(new TableOfBapicucfg());
        param.setReturnCfgsRefinst(new TableOfBapicuref());
        param.setReturnCfgsValue(new TableOfBapicuval());
        param.setReturnCfgsVk(new TableOfBapicuvk());
        param.setReturnConditionsIn(new TableOfBapicond());
        param.setReturnKeys(new TableOfBapisdkey());

        param.setReturnSchedulesInx(new TableOfBapischdlx());
        param.setSalesdocumentin("");
        param.setSender(new Sender());
        param.setTestrun("");

        // Order Header
        Bapisdhd1 bapisdhd1 = new Bapisdhd1();
        bapisdhd1.setDocType(order.getMaster().getDocType());
        bapisdhd1.setSalesOrg(order.getMaster().getSalesOrg());
        bapisdhd1.setSalesGrp(order.getMaster().getSalesGrp());
        bapisdhd1.setSalesOff(order.getMaster().getSalesOff());
        bapisdhd1.setDistrChan(order.getMaster().getDistrChan());
        bapisdhd1.setOrdReason(order.getMaster().getOrdReason());
        bapisdhd1.setDivision(order.getMaster().getDivision());
        bapisdhd1.setBillBlock(order.getMaster().getBillBlock());
        bapisdhd1.setPurchNoC(order.getMaster().getPurchNoC());
        bapisdhd1.setPurchNoS(order.getMaster().getPurchNoS());
        param.setReturnHeaderIn(bapisdhd1);
        // Order Header Extension
        param.setReturnHeaderInx(new Bapisdhd1X());

        //SAP Text
        TableOfBapisdtext tableOfBapisdtext = new TableOfBapisdtext();
        for (Order.Desc desc: order.getDescs()) {
            Bapisdtext bapisdtext = new Bapisdtext();
            bapisdtext.setTextId(desc.getTextId());
            bapisdtext.setFormatCol(desc.getFormatCol());
            bapisdtext.setLangu(desc.getLangu());
            bapisdtext.setTextLine(desc.getTextLine());
            tableOfBapisdtext.getItem().add(bapisdtext);
        }
        param.setReturnText(tableOfBapisdtext);

        //파트너
        TableOfBapiparnr tableOfBapiparnr = new TableOfBapiparnr();
        for (Order.Partner partner: order.getPartners()) {
            Bapiparnr bapiparnr = new Bapiparnr();
            bapiparnr.setPartnRole(partner.getPartnRole());
            bapiparnr.setPartnNumb(partner.getPartnNumb());
            tableOfBapiparnr.getItem().add(bapiparnr);
        }
        param.setReturnPartners(tableOfBapiparnr);

        param.setReturnItemsInx(new TableOfBapisditmx());

        // Order Detail
        TableOfBapisditm tableOfBapisditm = new TableOfBapisditm();
        TableOfBapischdl tableOfBapischdl = new TableOfBapischdl();
        TableOfBapicond tableOfBapicond = new TableOfBapicond();

        int itemNumber = 10;
        for (Order.Detail detail: order.getDetails()) {
            Bapisditm bapisditm = new Bapisditm();
            bapisditm.setMaterial(StringUtils.leftPad(detail.getProductCode(), 18, "0"));
            if(!StringUtils.isEmpty(detail.getBatch()))
                bapisditm.setBatch(detail.getBatch());
            bapisditm.setBillBlock("");
            if(detail.getAmt() == 0)
                bapisditm.setItemCateg("RENN");
            bapisditm.setItmNumber(StringUtils.leftPad(String.valueOf(itemNumber), 6, "0"));
            tableOfBapisditm.getItem().add(bapisditm);

            //반품 수량
            //qty: 넘어온 값 그대로 적용됨(양수이면 양수, 음수이면 음수)
            Bapischdl bapischdl = new Bapischdl();
            bapischdl.setReqQty(BigDecimal.valueOf(detail.getQty()));
            bapischdl.setItmNumber(StringUtils.leftPad(String.valueOf(itemNumber), 6, "0"));
            tableOfBapischdl.getItem().add(bapischdl);

            //반품가격 정보
            if(detail.getAmt() > 0) {
                Bapicond bapicond = new Bapicond();
                bapicond.setItmNumber(StringUtils.leftPad(String.valueOf(itemNumber), 6, "0"));
                bapicond.setCondType(order.getMaster().getCondType());
                bapicond.setCondValue(BigDecimal.valueOf(detail.getAmt()));
                bapicond.setCondcntrl("C");
                bapicond.setCondclass("B");
                bapicond.setCalctypcon("C");
                bapicond.setCurrency("KRW");
                bapicond.setCondUpdat("X");
                tableOfBapicond.getItem().add(bapicond);
            }

            itemNumber += 10;
        }

        param.setReturnItemsIn(tableOfBapisditm);
        param.setReturnSchedulesIn(tableOfBapischdl);
        param.setReturnConditionsIn(tableOfBapicond);

        return (ZsdCustReturnCreateResponse) client.getResponseData(zsd_cust_return_create_ws, param);
    }
}
