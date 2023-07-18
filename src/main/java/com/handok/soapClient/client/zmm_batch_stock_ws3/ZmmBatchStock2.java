//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.06.02 시간 07:11:19 PM KST 
//


package com.handok.soapClient.client.zmm_batch_stock_ws3;

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
 *         &lt;element name="Atnam" type="{urn:sap-com:document:sap:rfc:functions}char30" minOccurs="0"/&gt;
 *         &lt;element name="BatchFrom" type="{urn:sap-com:document:sap:rfc:functions}char10" minOccurs="0"/&gt;
 *         &lt;element name="BatchTo" type="{urn:sap-com:document:sap:rfc:functions}char10" minOccurs="0"/&gt;
 *         &lt;element name="Class" type="{urn:sap-com:document:sap:rfc:functions}char18" minOccurs="0"/&gt;
 *         &lt;element name="ItWhmatStck" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfZmmWhmatStck2" minOccurs="0"/&gt;
 *         &lt;element name="Lgort" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="MatFrom" type="{urn:sap-com:document:sap:rfc:functions}char18" minOccurs="0"/&gt;
 *         &lt;element name="MatTo" type="{urn:sap-com:document:sap:rfc:functions}char18" minOccurs="0"/&gt;
 *         &lt;element name="Werks" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
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
    "atnam",
    "batchFrom",
    "batchTo",
    "clazz",
    "itWhmatStck",
    "lgort",
    "matFrom",
    "matTo",
    "werks"
})
@XmlRootElement(name = "ZmmBatchStock2")
public class ZmmBatchStock2 {

    @XmlElement(name = "Atnam")
    protected String atnam;
    @XmlElement(name = "BatchFrom")
    protected String batchFrom;
    @XmlElement(name = "BatchTo")
    protected String batchTo;
    @XmlElement(name = "Class")
    protected String clazz;
    @XmlElement(name = "ItWhmatStck")
    protected TableOfZmmWhmatStck2 itWhmatStck;
    @XmlElement(name = "Lgort", required = true)
    protected String lgort;
    @XmlElement(name = "MatFrom")
    protected String matFrom;
    @XmlElement(name = "MatTo")
    protected String matTo;
    @XmlElement(name = "Werks", required = true)
    protected String werks;

    /**
     * atnam 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtnam() {
        return atnam;
    }

    /**
     * atnam 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtnam(String value) {
        this.atnam = value;
    }

    /**
     * batchFrom 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchFrom() {
        return batchFrom;
    }

    /**
     * batchFrom 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchFrom(String value) {
        this.batchFrom = value;
    }

    /**
     * batchTo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchTo() {
        return batchTo;
    }

    /**
     * batchTo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchTo(String value) {
        this.batchTo = value;
    }

    /**
     * clazz 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * clazz 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * itWhmatStck 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfZmmWhmatStck2 }
     *     
     */
    public TableOfZmmWhmatStck2 getItWhmatStck() {
        return itWhmatStck;
    }

    /**
     * itWhmatStck 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfZmmWhmatStck2 }
     *     
     */
    public void setItWhmatStck(TableOfZmmWhmatStck2 value) {
        this.itWhmatStck = value;
    }

    /**
     * lgort 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgort() {
        return lgort;
    }

    /**
     * lgort 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgort(String value) {
        this.lgort = value;
    }

    /**
     * matFrom 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatFrom() {
        return matFrom;
    }

    /**
     * matFrom 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatFrom(String value) {
        this.matFrom = value;
    }

    /**
     * matTo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatTo() {
        return matTo;
    }

    /**
     * matTo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatTo(String value) {
        this.matTo = value;
    }

    /**
     * werks 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWerks() {
        return werks;
    }

    /**
     * werks 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWerks(String value) {
        this.werks = value;
    }

}
