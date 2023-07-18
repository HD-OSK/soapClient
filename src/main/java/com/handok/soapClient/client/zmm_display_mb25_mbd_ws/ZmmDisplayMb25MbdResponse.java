//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.06.02 시간 07:11:21 PM KST 
//


package com.handok.soapClient.client.zmm_display_mb25_mbd_ws;

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
 *         &lt;element name="EMessage" type="{urn:sap-com:document:sap:rfc:functions}char200"/&gt;
 *         &lt;element name="EResult" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ETable" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfZsmm025"/&gt;
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
    "eMessage",
    "eResult",
    "eTable"
})
@XmlRootElement(name = "ZmmDisplayMb25MbdResponse")
public class ZmmDisplayMb25MbdResponse {

    @XmlElement(name = "EMessage", required = true)
    protected String eMessage;
    @XmlElement(name = "EResult", required = true)
    protected String eResult;
    @XmlElement(name = "ETable", required = true)
    protected TableOfZsmm025 eTable;

    /**
     * eMessage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMessage() {
        return eMessage;
    }

    /**
     * eMessage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMessage(String value) {
        this.eMessage = value;
    }

    /**
     * eResult 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEResult() {
        return eResult;
    }

    /**
     * eResult 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEResult(String value) {
        this.eResult = value;
    }

    /**
     * eTable 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfZsmm025 }
     *     
     */
    public TableOfZsmm025 getETable() {
        return eTable;
    }

    /**
     * eTable 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfZsmm025 }
     *     
     */
    public void setETable(TableOfZsmm025 value) {
        this.eTable = value;
    }

}
