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
 *         &lt;element name="IBdter" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="IBster" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="IBwart" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="IKostl" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="ITable" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfZsmm023"/&gt;
 *         &lt;element name="IWempf" type="{urn:sap-com:document:sap:rfc:functions}char12"/&gt;
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
    "iBdter",
    "iBster",
    "iBwart",
    "iKostl",
    "iTable",
    "iWempf"
})
@XmlRootElement(name = "ZmmCreateMb21Mbd")
public class ZmmCreateMb21Mbd {

    @XmlElement(name = "IBdter", required = true)
    protected String iBdter;
    @XmlElement(name = "IBster", required = true)
    protected String iBster;
    @XmlElement(name = "IBwart", required = true)
    protected String iBwart;
    @XmlElement(name = "IKostl", required = true)
    protected String iKostl;
    @XmlElement(name = "ITable", required = true)
    protected TableOfZsmm023 iTable;
    @XmlElement(name = "IWempf", required = true)
    protected String iWempf;

    /**
     * iBdter 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBdter() {
        return iBdter;
    }

    /**
     * iBdter 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBdter(String value) {
        this.iBdter = value;
    }

    /**
     * iBster 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBster() {
        return iBster;
    }

    /**
     * iBster 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBster(String value) {
        this.iBster = value;
    }

    /**
     * iBwart 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBwart() {
        return iBwart;
    }

    /**
     * iBwart 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBwart(String value) {
        this.iBwart = value;
    }

    /**
     * iKostl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIKostl() {
        return iKostl;
    }

    /**
     * iKostl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIKostl(String value) {
        this.iKostl = value;
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

    /**
     * iWempf 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIWempf() {
        return iWempf;
    }

    /**
     * iWempf 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIWempf(String value) {
        this.iWempf = value;
    }

}
