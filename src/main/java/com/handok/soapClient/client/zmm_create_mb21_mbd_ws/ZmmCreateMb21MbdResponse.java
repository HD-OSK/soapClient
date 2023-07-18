//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.06.02 시간 07:11:21 PM KST 
//


package com.handok.soapClient.client.zmm_create_mb21_mbd_ws;

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
 *         &lt;element name="ERsnum" type="{urn:sap-com:document:sap:rfc:functions}numeric10"/&gt;
 *         &lt;element name="ITable" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfZsmm023"/&gt;
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
    "eRsnum",
    "iTable"
})
@XmlRootElement(name = "ZmmCreateMb21MbdResponse")
public class ZmmCreateMb21MbdResponse {

    @XmlElement(name = "EMessage", required = true)
    protected String eMessage;
    @XmlElement(name = "EResult", required = true)
    protected String eResult;
    @XmlElement(name = "ERsnum", required = true)
    protected String eRsnum;
    @XmlElement(name = "ITable", required = true)
    protected TableOfZsmm023 iTable;

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
     * eRsnum 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERsnum() {
        return eRsnum;
    }

    /**
     * eRsnum 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERsnum(String value) {
        this.eRsnum = value;
    }

    /**
     * iTable 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfZsmm023 }
     *     
     */
    public TableOfZsmm023 getITable() {
        return iTable;
    }

    /**
     * iTable 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfZsmm023 }
     *     
     */
    public void setITable(TableOfZsmm023 value) {
        this.iTable = value;
    }

}
