//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.06.02 시간 07:11:17 PM KST 
//


package com.handok.soapClient.client.z_bapi_ar_acc_getopenitems;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.handok.soapClient.client.z_bapi_ar_acc_getopenitems package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.handok.soapClient.client.z_bapi_ar_acc_getopenitems
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArAccGetopenitems }
     * 
     */
    public ArAccGetopenitems createArAccGetopenitems() {
        return new ArAccGetopenitems();
    }

    /**
     * Create an instance of {@link TableOfBapi30072 }
     * 
     */
    public TableOfBapi30072 createTableOfBapi30072() {
        return new TableOfBapi30072();
    }

    /**
     * Create an instance of {@link ArAccGetopenitemsResponse }
     * 
     */
    public ArAccGetopenitemsResponse createArAccGetopenitemsResponse() {
        return new ArAccGetopenitemsResponse();
    }

    /**
     * Create an instance of {@link Bapireturn }
     * 
     */
    public Bapireturn createBapireturn() {
        return new Bapireturn();
    }

    /**
     * Create an instance of {@link Bapi30072 }
     * 
     */
    public Bapi30072 createBapi30072() {
        return new Bapi30072();
    }

}
