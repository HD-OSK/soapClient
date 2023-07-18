package com.handok.soapClient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class SoapClient<T> {
    @Autowired
    private Jaxb2Marshaller marshaller;

    private WebServiceTemplate template;

    public T getResponseData(String uri, Object request) {
        template = new WebServiceTemplate(marshaller);
        T response = (T) template.marshalSendAndReceive(uri, request);
        return response;
    }
}
