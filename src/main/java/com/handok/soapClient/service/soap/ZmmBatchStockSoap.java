package com.handok.soapClient.service.soap;

import com.handok.soapClient.client.zmm_batch_stock_ws3.TableOfZmmWhmatStck2;
import com.handok.soapClient.client.zmm_batch_stock_ws3.ZmmBatchStock2;
import com.handok.soapClient.client.zmm_batch_stock_ws3.ZmmBatchStock2Response;
import com.handok.soapClient.service.SoapClient;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ZmmBatchStockSoap {
    @Value("${service.uri.zmm_batch_stock_ws3}")
    private String zmm_batch_stock_ws3;

    @Autowired
    private SoapClient client;

    /**
     * Invoke zmm batch stock 2 response zmm batch stock 2 response.
     *
     * @param lgort the lgort
     * @param mat   the mat
     * @param batch the batch
     * @return the zmm batch stock 2 response
     * @throws JSONException the json exception
     */
    public ZmmBatchStock2Response invokeZmmBatchStock2Response(String lgort, String mat, String batch) throws JSONException {
        ZmmBatchStock2 zmmBatchStock2 = new ZmmBatchStock2();
        zmmBatchStock2.setAtnam(StringUtils.isEmpty(batch) ? "" : "ACI_BATCH_VERSION");
        zmmBatchStock2.setBatchFrom("");
        zmmBatchStock2.setBatchTo("");
        zmmBatchStock2.setClazz("");

        String storageCode = System.getenv("storage.code");
        JSONObject jsonObject= new JSONObject(storageCode);
        String storage = jsonObject.getString(lgort);

        zmmBatchStock2.setLgort(StringUtils.isEmpty(storage) ? "KR40" : storage);
        zmmBatchStock2.setWerks("KR01");
        zmmBatchStock2.setMatFrom(StringUtils.leftPad(mat, 18, "0"));
        zmmBatchStock2.setMatTo(StringUtils.leftPad(mat, 18, "0"));
        zmmBatchStock2.setItWhmatStck(new TableOfZmmWhmatStck2());

        return (ZmmBatchStock2Response) client.getResponseData(zmm_batch_stock_ws3, zmmBatchStock2);
    }
}
