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
 *         &lt;element name="ETable" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfZsmm025"/&gt;
 *         &lt;element name="IFrbatch" type="{urn:sap-com:document:sap:rfc:functions}char10" minOccurs="0"/&gt;
 *         &lt;element name="IFrbdter" type="{urn:sap-com:document:sap:rfc:functions}date10" minOccurs="0"/&gt;
 *         &lt;element name="IFrbster" type="{urn:sap-com:document:sap:rfc:functions}date10" minOccurs="0"/&gt;
 *         &lt;element name="IFrkostl" type="{urn:sap-com:document:sap:rfc:functions}char10" minOccurs="0"/&gt;
 *         &lt;element name="IFrlgort" type="{urn:sap-com:document:sap:rfc:functions}char4" minOccurs="0"/&gt;
 *         &lt;element name="IFrmatnr" type="{urn:sap-com:document:sap:rfc:functions}char18" minOccurs="0"/&gt;
 *         &lt;element name="IFrwempf" type="{urn:sap-com:document:sap:rfc:functions}char12" minOccurs="0"/&gt;
 *         &lt;element name="ITobatch" type="{urn:sap-com:document:sap:rfc:functions}char10" minOccurs="0"/&gt;
 *         &lt;element name="ITobdter" type="{urn:sap-com:document:sap:rfc:functions}date10" minOccurs="0"/&gt;
 *         &lt;element name="ITobster" type="{urn:sap-com:document:sap:rfc:functions}date10" minOccurs="0"/&gt;
 *         &lt;element name="ITokostl" type="{urn:sap-com:document:sap:rfc:functions}char10" minOccurs="0"/&gt;
 *         &lt;element name="ITolgort" type="{urn:sap-com:document:sap:rfc:functions}char4" minOccurs="0"/&gt;
 *         &lt;element name="ITomatnr" type="{urn:sap-com:document:sap:rfc:functions}char18" minOccurs="0"/&gt;
 *         &lt;element name="ITowempf" type="{urn:sap-com:document:sap:rfc:functions}char12" minOccurs="0"/&gt;
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
    "eTable",
    "iFrbatch",
    "iFrbdter",
    "iFrbster",
    "iFrkostl",
    "iFrlgort",
    "iFrmatnr",
    "iFrwempf",
    "iTobatch",
    "iTobdter",
    "iTobster",
    "iTokostl",
    "iTolgort",
    "iTomatnr",
    "iTowempf"
})
@XmlRootElement(name = "ZmmDisplayMb25Mbd")
public class ZmmDisplayMb25Mbd {

    @XmlElement(name = "ETable", required = true)
    protected TableOfZsmm025 eTable;
    @XmlElement(name = "IFrbatch")
    protected String iFrbatch;
    @XmlElement(name = "IFrbdter")
    protected String iFrbdter;
    @XmlElement(name = "IFrbster")
    protected String iFrbster;
    @XmlElement(name = "IFrkostl")
    protected String iFrkostl;
    @XmlElement(name = "IFrlgort")
    protected String iFrlgort;
    @XmlElement(name = "IFrmatnr")
    protected String iFrmatnr;
    @XmlElement(name = "IFrwempf")
    protected String iFrwempf;
    @XmlElement(name = "ITobatch")
    protected String iTobatch;
    @XmlElement(name = "ITobdter")
    protected String iTobdter;
    @XmlElement(name = "ITobster")
    protected String iTobster;
    @XmlElement(name = "ITokostl")
    protected String iTokostl;
    @XmlElement(name = "ITolgort")
    protected String iTolgort;
    @XmlElement(name = "ITomatnr")
    protected String iTomatnr;
    @XmlElement(name = "ITowempf")
    protected String iTowempf;

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

    /**
     * iFrbatch 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIFrbatch() {
        return iFrbatch;
    }

    /**
     * iFrbatch 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIFrbatch(String value) {
        this.iFrbatch = value;
    }

    /**
     * iFrbdter 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIFrbdter() {
        return iFrbdter;
    }

    /**
     * iFrbdter 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIFrbdter(String value) {
        this.iFrbdter = value;
    }

    /**
     * iFrbster 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIFrbster() {
        return iFrbster;
    }

    /**
     * iFrbster 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIFrbster(String value) {
        this.iFrbster = value;
    }

    /**
     * iFrkostl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIFrkostl() {
        return iFrkostl;
    }

    /**
     * iFrkostl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIFrkostl(String value) {
        this.iFrkostl = value;
    }

    /**
     * iFrlgort 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIFrlgort() {
        return iFrlgort;
    }

    /**
     * iFrlgort 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIFrlgort(String value) {
        this.iFrlgort = value;
    }

    /**
     * iFrmatnr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIFrmatnr() {
        return iFrmatnr;
    }

    /**
     * iFrmatnr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIFrmatnr(String value) {
        this.iFrmatnr = value;
    }

    /**
     * iFrwempf 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIFrwempf() {
        return iFrwempf;
    }

    /**
     * iFrwempf 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIFrwempf(String value) {
        this.iFrwempf = value;
    }

    /**
     * iTobatch 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITobatch() {
        return iTobatch;
    }

    /**
     * iTobatch 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITobatch(String value) {
        this.iTobatch = value;
    }

    /**
     * iTobdter 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITobdter() {
        return iTobdter;
    }

    /**
     * iTobdter 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITobdter(String value) {
        this.iTobdter = value;
    }

    /**
     * iTobster 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITobster() {
        return iTobster;
    }

    /**
     * iTobster 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITobster(String value) {
        this.iTobster = value;
    }

    /**
     * iTokostl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITokostl() {
        return iTokostl;
    }

    /**
     * iTokostl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITokostl(String value) {
        this.iTokostl = value;
    }

    /**
     * iTolgort 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITolgort() {
        return iTolgort;
    }

    /**
     * iTolgort 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITolgort(String value) {
        this.iTolgort = value;
    }

    /**
     * iTomatnr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITomatnr() {
        return iTomatnr;
    }

    /**
     * iTomatnr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITomatnr(String value) {
        this.iTomatnr = value;
    }

    /**
     * iTowempf 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITowempf() {
        return iTowempf;
    }

    /**
     * iTowempf 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITowempf(String value) {
        this.iTowempf = value;
    }

}
