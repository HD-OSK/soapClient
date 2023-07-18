package com.handok.soapClient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import java.util.ArrayList;

@Configuration
public class SoapConfig {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();

        ArrayList<String> packages = new ArrayList<>();
        packages.add("com.handok.soapClient.client.z_bapi_ar_acc_getopenitems");
        packages.add("com.handok.soapClient.client.z_bapi_salesorder_simulate");
        packages.add("com.handok.soapClient.client.zfi_credit_detail");
        packages.add("com.handok.soapClient.client.zmm_batch_stock_ws3");
        packages.add("com.handok.soapClient.client.zmm_change_mb22_mbd_2_ws");
        packages.add("com.handok.soapClient.client.zmm_change_mb22_mbd_ws");
        packages.add("com.handok.soapClient.client.zmm_create_mb21_mbd_ws");
        packages.add("com.handok.soapClient.client.zmm_display_mb25_mbd_ws");
        packages.add("com.handok.soapClient.client.zmm_display_mb58_ws");
        packages.add("com.handok.soapClient.client.zsd_cust_return_create_ws");
        packages.add("com.handok.soapClient.client.zsd_delivery_note_so");
        packages.add("com.handok.soapClient.client.zsd_so_createfromdat2_ws");
        packages.add("com.handok.soapClient.client.zsd_so_createfromdat3_ws");
        packages.add("com.handok.soapClient.client.zsd_ws_delivery_update_ws");
        packages.add("com.handok.soapClient.client.zfi_search_customer_ws");

        marshaller.setPackagesToScan(packages.stream().toArray(String[]::new));
        return marshaller;
    }
}
