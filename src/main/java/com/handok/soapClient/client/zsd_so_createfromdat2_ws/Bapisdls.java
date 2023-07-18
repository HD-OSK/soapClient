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
 * <p>Bapisdls complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Bapisdls"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Pricing" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="AtpWrkmod" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Scheduling" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Nostructure" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="CondHandl" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
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
    "pricing",
    "atpWrkmod",
    "scheduling",
    "nostructure",
    "condHandl"
})
public class Bapisdls {

    @XmlElement(name = "Pricing", required = true)
    protected String pricing;
    @XmlElement(name = "AtpWrkmod", required = true)
    protected String atpWrkmod;
    @XmlElement(name = "Scheduling", required = true)
    protected String scheduling;
    @XmlElement(name = "Nostructure", required = true)
    protected String nostructure;
    @XmlElement(name = "CondHandl", required = true)
    protected String condHandl;

    /**
     * pricing 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricing() {
        return pricing;
    }

    /**
     * pricing 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricing(String value) {
        this.pricing = value;
    }

    /**
     * atpWrkmod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtpWrkmod() {
        return atpWrkmod;
    }

    /**
     * atpWrkmod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtpWrkmod(String value) {
        this.atpWrkmod = value;
    }

    /**
     * scheduling 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduling() {
        return scheduling;
    }

    /**
     * scheduling 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduling(String value) {
        this.scheduling = value;
    }

    /**
     * nostructure 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNostructure() {
        return nostructure;
    }

    /**
     * nostructure 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNostructure(String value) {
        this.nostructure = value;
    }

    /**
     * condHandl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondHandl() {
        return condHandl;
    }

    /**
     * condHandl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondHandl(String value) {
        this.condHandl = value;
    }

}
