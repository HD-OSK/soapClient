package com.handok.soapClient.service.soap;

import com.handok.soapClient.client.z_bapi_salesorder_simulate.*;
import com.handok.soapClient.dto.request.SimulationProductDto;
import com.handok.soapClient.dto.request.SimulationRequestDto;
import com.handok.soapClient.service.SoapClient;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ZbapiSalesOrderSimulate {
    @Value("${service.uri.z_bapi_salesorder_simulate}")
    private String z_bapi_salesorder_simulate;

    @Autowired
    private SoapClient client;

    public SalesorderSimulateResponse invokeZbapiSalesOrderSimulate(SimulationRequestDto order) {
        SalesorderSimulate param = new SalesorderSimulate();

        param.setConvertParvwAuart("");
        Bapisdhead bapisdhead = new Bapisdhead();
        bapisdhead.setDocType(order.getDocType());
        bapisdhead.setSalesOrg("KR01");
        bapisdhead.setDistrChan(order.getDistrChan());
        bapisdhead.setDivision("K1");
        bapisdhead.setSalesOff("KR03");
        param.setOrderHeaderIn(bapisdhead);

        param.setExtensionin(new TableOfBapiparex());
        param.setMessagetable(new TableOfBapiret2());
        param.setOrderCcard(new TableOfBapiccard());
        param.setOrderCcardEx(new TableOfBapiccardEx());
        param.setOrderCfgsBlob(new TableOfBapicublb());
        param.setOrderCfgsInst(new TableOfBapicuins());
        param.setOrderCfgsPartOf(new TableOfBapicuprt());
        param.setOrderCfgsRef(new TableOfBapicucfg());
        param.setOrderCfgsValue(new TableOfBapicuval());
        param.setOrderConditionEx(new TableOfBapicond());
        param.setOrderIncomplete(new TableOfBapiincomp());
        param.setOrderItemsOut(new TableOfBapiitemex());
        param.setOrderScheduleEx(new TableOfBapisdhedu());
        param.setPartneraddresses(new TableOfBapiaddr1());

        //파트너
        TableOfBapipartnr tableOfBapipartnr = new TableOfBapipartnr();
        //파트너(거래처)
        Bapipartnr agentCode = new Bapipartnr();
        agentCode.setPartnRole("AG");
        agentCode.setPartnNumb(StringUtils.leftPad(order.getAgentCode(), 10, "0"));
        tableOfBapipartnr.getItem().add(agentCode);

        //파트너(실거래처)
        if(!StringUtils.isEmpty(order.getEndCustomerId())) {
            Bapipartnr endCustomer = new Bapipartnr();
            agentCode.setPartnRole("EC");
            agentCode.setPartnNumb(StringUtils.leftPad(order.getEndCustomerId(), 10, "0"));
            tableOfBapipartnr.getItem().add(agentCode);
        }

        param.setOrderPartners(tableOfBapipartnr);

        //OrderItemsIn
        //OrderScheduleIn
        TableOfBapiitemin tableOfBapiitemin = new TableOfBapiitemin();
        TableOfBapischdl tableOfBapischdl = new TableOfBapischdl();

        int itemNumber = 10;
        for (SimulationProductDto detail: order.getProducts()) {
            Bapiitemin bapiitemin = new Bapiitemin();
            bapiitemin.setMaterial(StringUtils.leftPad(detail.getProductCode(), 18, "0"));
            bapiitemin.setItmNumber(StringUtils.leftPad(String.valueOf(itemNumber), 6, "0"));
            tableOfBapiitemin.getItem().add(bapiitemin);

            Bapischdl bapischdl = new Bapischdl();
            bapischdl.setReqQty(BigDecimal.valueOf(detail.getQty()));
            bapischdl.setItmNumber(StringUtils.leftPad(String.valueOf(itemNumber), 6, "0"));
            bapischdl.setReqTime("");
            tableOfBapischdl.getItem().add(bapischdl);

            itemNumber += 10;
        }
        param.setOrderItemsIn(tableOfBapiitemin);
        param.setOrderScheduleIn(tableOfBapischdl);

        return (SalesorderSimulateResponse) client.getResponseData(z_bapi_salesorder_simulate, param);
    }
}
