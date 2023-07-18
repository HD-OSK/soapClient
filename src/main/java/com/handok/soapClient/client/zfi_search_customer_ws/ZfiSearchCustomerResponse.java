//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.07.06 시간 02:56:53 PM KST 
//


package com.handok.soapClient.client.zfi_search_customer_ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RCode" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="RMessage" type="{urn:sap-com:document:sap:soap:functions:mc-style}char50"/&gt;
 *         &lt;element name="TData" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfZsfi027" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rCode",
    "rMessage",
    "tData"
})
@XmlRootElement(name = "ZfiSearchCustomerResponse")
public class ZfiSearchCustomerResponse {

    @XmlElement(name = "RCode", required = true)
    protected String rCode;
    @XmlElement(name = "RMessage", required = true)
    protected String rMessage;
    @XmlElement(name = "TData")
    protected TableOfZsfi027 tData;

    /**
     * rCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCode() {
        return rCode;
    }

    /**
     * rCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCode(String value) {
        this.rCode = value;
    }

    /**
     * rMessage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRMessage() {
        return rMessage;
    }

    /**
     * rMessage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRMessage(String value) {
        this.rMessage = value;
    }

    /**
     * tData 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfZsfi027 }
     *     
     */
    public TableOfZsfi027 getTData() {
        return tData;
    }

    /**
     * tData 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfZsfi027 }
     *     
     */
    public void setTData(TableOfZsfi027 value) {
        this.tData = value;
    }

}
