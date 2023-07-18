//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.06.02 시간 07:11:23 PM KST 
//


package com.handok.soapClient.client.zsd_so_createfromdat2_ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Bapicondx complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Bapicondx"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItmNumber" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="CondStNo" type="{urn:sap-com:document:sap:rfc:functions}numeric3"/&gt;
 *         &lt;element name="CondCount" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/&gt;
 *         &lt;element name="CondType" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Updateflag" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="CondValue" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Currency" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="CondUnit" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="CondPUnt" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Varcond" type="{urn:sap-com:document:sap:rfc:functions}char26"/&gt;
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
    "itmNumber",
    "condStNo",
    "condCount",
    "condType",
    "updateflag",
    "condValue",
    "currency",
    "condUnit",
    "condPUnt",
    "varcond"
})
public class Bapicondx {

    @XmlElement(name = "ItmNumber", required = true)
    protected String itmNumber;
    @XmlElement(name = "CondStNo", required = true)
    protected String condStNo;
    @XmlElement(name = "CondCount", required = true)
    protected String condCount;
    @XmlElement(name = "CondType", required = true)
    protected String condType;
    @XmlElement(name = "Updateflag", required = true)
    protected String updateflag;
    @XmlElement(name = "CondValue", required = true)
    protected String condValue;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "CondUnit", required = true)
    protected String condUnit;
    @XmlElement(name = "CondPUnt", required = true)
    protected String condPUnt;
    @XmlElement(name = "Varcond", required = true)
    protected String varcond;

    /**
     * itmNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItmNumber() {
        return itmNumber;
    }

    /**
     * itmNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItmNumber(String value) {
        this.itmNumber = value;
    }

    /**
     * condStNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondStNo() {
        return condStNo;
    }

    /**
     * condStNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondStNo(String value) {
        this.condStNo = value;
    }

    /**
     * condCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondCount() {
        return condCount;
    }

    /**
     * condCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondCount(String value) {
        this.condCount = value;
    }

    /**
     * condType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondType() {
        return condType;
    }

    /**
     * condType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondType(String value) {
        this.condType = value;
    }

    /**
     * updateflag 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateflag() {
        return updateflag;
    }

    /**
     * updateflag 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateflag(String value) {
        this.updateflag = value;
    }

    /**
     * condValue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondValue() {
        return condValue;
    }

    /**
     * condValue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondValue(String value) {
        this.condValue = value;
    }

    /**
     * currency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * currency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * condUnit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondUnit() {
        return condUnit;
    }

    /**
     * condUnit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondUnit(String value) {
        this.condUnit = value;
    }

    /**
     * condPUnt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondPUnt() {
        return condPUnt;
    }

    /**
     * condPUnt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondPUnt(String value) {
        this.condPUnt = value;
    }

    /**
     * varcond 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVarcond() {
        return varcond;
    }

    /**
     * varcond 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVarcond(String value) {
        this.varcond = value;
    }

}
