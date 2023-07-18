package com.handok.soapClient.service.soap;

import com.handok.soapClient.client.z_bapi_ar_acc_getopenitems.ArAccGetopenitems;
import com.handok.soapClient.client.z_bapi_ar_acc_getopenitems.ArAccGetopenitemsResponse;
import com.handok.soapClient.client.z_bapi_ar_acc_getopenitems.TableOfBapi30072;
import com.handok.soapClient.service.SoapClient;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class ArAccGetOpenItemSoap {
    @Value("${service.uri.z_bapi_ar_acc_getopenitems}") private String z_bapi_ar_acc_getopenitems;

    @Autowired
    private SoapClient client;

    /**
     * Invoke ar acc get open items ar acc getopenitems response.
     *
     * @param agentCode the agent code
     * @return the ar acc getopenitems response
     */
    public ArAccGetopenitemsResponse invokeArAccGetOpenItems(String agentCode) {
        ArAccGetopenitems arAccGetopenitems = new ArAccGetopenitems();
        arAccGetopenitems.setKeydate(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        arAccGetopenitems.setCustomer(StringUtils.leftPad(agentCode, 10, "0"));
        arAccGetopenitems.setCompanycode("0913");
        arAccGetopenitems.setNoteditems("X");
        arAccGetopenitems.setLineitems(new TableOfBapi30072());
        arAccGetopenitems.setSecindex("");

        return (ArAccGetopenitemsResponse) client.getResponseData(z_bapi_ar_acc_getopenitems, arAccGetopenitems);
    }
}
