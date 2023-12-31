//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.07.06 시간 02:56:53 PM KST 
//


package com.handok.soapClient.client.zfi_search_customer_ws;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.handok.soapClient.client.zfi_search_customer_ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.handok.soapClient.client.zfi_search_customer_ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ZfiSearchCustomer }
     * 
     */
    public ZfiSearchCustomer createZfiSearchCustomer() {
        return new ZfiSearchCustomer();
    }

    /**
     * Create an instance of {@link TableOfZsfi027 }
     * 
     */
    public TableOfZsfi027 createTableOfZsfi027() {
        return new TableOfZsfi027();
    }

    /**
     * Create an instance of {@link ZfiSearchCustomerResponse }
     * 
     */
    public ZfiSearchCustomerResponse createZfiSearchCustomerResponse() {
        return new ZfiSearchCustomerResponse();
    }

    /**
     * Create an instance of {@link Zsfi027 }
     * 
     */
    public Zsfi027 createZsfi027() {
        return new Zsfi027();
    }

}
