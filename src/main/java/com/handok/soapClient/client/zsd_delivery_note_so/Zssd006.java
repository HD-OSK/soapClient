//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.06.02 시간 07:11:23 PM KST 
//


package com.handok.soapClient.client.zsd_delivery_note_so;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Zssd006 complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Zssd006"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Vbeln" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Bldat" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Auart" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Name1" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="City1" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="TelNumber" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="Cbldat" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Cdatum" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Vgbel" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Street" type="{urn:sap-com:document:sap:rfc:functions}char60"/&gt;
 *         &lt;element name="StreetCity" type="{urn:sap-com:document:sap:rfc:functions}char100"/&gt;
 *         &lt;element name="NoAuart" type="{urn:sap-com:document:sap:rfc:functions}char16"/&gt;
 *         &lt;element name="_--30004Text1" type="{urn:sap-com:document:sap:rfc:functions}char132"/&gt;
 *         &lt;element name="_--30004Text2" type="{urn:sap-com:document:sap:rfc:functions}char132"/&gt;
 *         &lt;element name="_--30004Text3" type="{urn:sap-com:document:sap:rfc:functions}char132"/&gt;
 *         &lt;element name="_--30004Text4" type="{urn:sap-com:document:sap:rfc:functions}char132"/&gt;
 *         &lt;element name="_--30004Text" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="_--30011Text" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="Pstlz" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Land1" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="PostTel" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="Spras" type="{urn:sap-com:document:sap:rfc:functions}lang"/&gt;
 *         &lt;element name="Cuzeit" type="{urn:sap-com:document:sap:rfc:functions}char5"/&gt;
 *         &lt;element name="VbelnKunnr" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="Waerk" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/&gt;
 *         &lt;element name="Gnetwr" type="{urn:sap-com:document:sap:rfc:functions}curr16.2"/&gt;
 *         &lt;element name="Gmwsbp" type="{urn:sap-com:document:sap:rfc:functions}curr14.2"/&gt;
 *         &lt;element name="Gtotal" type="{urn:sap-com:document:sap:rfc:functions}curr17.2"/&gt;
 *         &lt;element name="Gnetwrc" type="{urn:sap-com:document:sap:rfc:functions}char14"/&gt;
 *         &lt;element name="Gmwsbpc" type="{urn:sap-com:document:sap:rfc:functions}char13"/&gt;
 *         &lt;element name="Gtotalc" type="{urn:sap-com:document:sap:rfc:functions}char14"/&gt;
 *         &lt;element name="Kunnr" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Kunag" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Kuenr" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Zssd006", propOrder = {
    "vbeln",
    "bldat",
    "auart",
    "name1",
    "city1",
    "telNumber",
    "cbldat",
    "cdatum",
    "vgbel",
    "street",
    "streetCity",
    "noAuart",
    "_30004Text1",
    "_30004Text2",
    "_30004Text3",
    "_30004Text4",
    "_30004Text",
    "_30011Text",
    "pstlz",
    "land1",
    "postTel",
    "spras",
    "cuzeit",
    "vbelnKunnr",
    "waerk",
    "gnetwr",
    "gmwsbp",
    "gtotal",
    "gnetwrc",
    "gmwsbpc",
    "gtotalc",
    "kunnr",
    "kunag",
    "kuenr"
})
public class Zssd006 {

    @XmlElement(name = "Vbeln", required = true)
    protected String vbeln;
    @XmlElement(name = "Bldat", required = true)
    protected String bldat;
    @XmlElement(name = "Auart", required = true)
    protected String auart;
    @XmlElement(name = "Name1", required = true)
    protected String name1;
    @XmlElement(name = "City1", required = true)
    protected String city1;
    @XmlElement(name = "TelNumber", required = true)
    protected String telNumber;
    @XmlElement(name = "Cbldat", required = true)
    protected String cbldat;
    @XmlElement(name = "Cdatum", required = true)
    protected String cdatum;
    @XmlElement(name = "Vgbel", required = true)
    protected String vgbel;
    @XmlElement(name = "Street", required = true)
    protected String street;
    @XmlElement(name = "StreetCity", required = true)
    protected String streetCity;
    @XmlElement(name = "NoAuart", required = true)
    protected String noAuart;
    @XmlElement(name = "_--30004Text1", required = true)
    protected String _30004Text1;
    @XmlElement(name = "_--30004Text2", required = true)
    protected String _30004Text2;
    @XmlElement(name = "_--30004Text3", required = true)
    protected String _30004Text3;
    @XmlElement(name = "_--30004Text4", required = true)
    protected String _30004Text4;
    @XmlElement(name = "_--30004Text", required = true)
    protected String _30004Text;
    @XmlElement(name = "_--30011Text", required = true)
    protected String _30011Text;
    @XmlElement(name = "Pstlz", required = true)
    protected String pstlz;
    @XmlElement(name = "Land1", required = true)
    protected String land1;
    @XmlElement(name = "PostTel", required = true)
    protected String postTel;
    @XmlElement(name = "Spras", required = true)
    protected String spras;
    @XmlElement(name = "Cuzeit", required = true)
    protected String cuzeit;
    @XmlElement(name = "VbelnKunnr", required = true)
    protected String vbelnKunnr;
    @XmlElement(name = "Waerk", required = true)
    protected String waerk;
    @XmlElement(name = "Gnetwr", required = true)
    protected BigDecimal gnetwr;
    @XmlElement(name = "Gmwsbp", required = true)
    protected BigDecimal gmwsbp;
    @XmlElement(name = "Gtotal", required = true)
    protected BigDecimal gtotal;
    @XmlElement(name = "Gnetwrc", required = true)
    protected String gnetwrc;
    @XmlElement(name = "Gmwsbpc", required = true)
    protected String gmwsbpc;
    @XmlElement(name = "Gtotalc", required = true)
    protected String gtotalc;
    @XmlElement(name = "Kunnr", required = true)
    protected String kunnr;
    @XmlElement(name = "Kunag", required = true)
    protected String kunag;
    @XmlElement(name = "Kuenr", required = true)
    protected String kuenr;

    /**
     * vbeln 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVbeln() {
        return vbeln;
    }

    /**
     * vbeln 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVbeln(String value) {
        this.vbeln = value;
    }

    /**
     * bldat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBldat() {
        return bldat;
    }

    /**
     * bldat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBldat(String value) {
        this.bldat = value;
    }

    /**
     * auart 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuart() {
        return auart;
    }

    /**
     * auart 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuart(String value) {
        this.auart = value;
    }

    /**
     * name1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName1() {
        return name1;
    }

    /**
     * name1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName1(String value) {
        this.name1 = value;
    }

    /**
     * city1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity1() {
        return city1;
    }

    /**
     * city1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity1(String value) {
        this.city1 = value;
    }

    /**
     * telNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelNumber() {
        return telNumber;
    }

    /**
     * telNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelNumber(String value) {
        this.telNumber = value;
    }

    /**
     * cbldat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbldat() {
        return cbldat;
    }

    /**
     * cbldat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbldat(String value) {
        this.cbldat = value;
    }

    /**
     * cdatum 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdatum() {
        return cdatum;
    }

    /**
     * cdatum 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdatum(String value) {
        this.cdatum = value;
    }

    /**
     * vgbel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVgbel() {
        return vgbel;
    }

    /**
     * vgbel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVgbel(String value) {
        this.vgbel = value;
    }

    /**
     * street 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * street 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * streetCity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetCity() {
        return streetCity;
    }

    /**
     * streetCity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetCity(String value) {
        this.streetCity = value;
    }

    /**
     * noAuart 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoAuart() {
        return noAuart;
    }

    /**
     * noAuart 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoAuart(String value) {
        this.noAuart = value;
    }

    /**
     *  30004Text1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get30004Text1() {
        return _30004Text1;
    }

    /**
     *  30004Text1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set30004Text1(String value) {
        this._30004Text1 = value;
    }

    /**
     *  30004Text2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get30004Text2() {
        return _30004Text2;
    }

    /**
     *  30004Text2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set30004Text2(String value) {
        this._30004Text2 = value;
    }

    /**
     *  30004Text3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get30004Text3() {
        return _30004Text3;
    }

    /**
     *  30004Text3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set30004Text3(String value) {
        this._30004Text3 = value;
    }

    /**
     *  30004Text4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get30004Text4() {
        return _30004Text4;
    }

    /**
     *  30004Text4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set30004Text4(String value) {
        this._30004Text4 = value;
    }

    /**
     *  30004Text 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get30004Text() {
        return _30004Text;
    }

    /**
     *  30004Text 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set30004Text(String value) {
        this._30004Text = value;
    }

    /**
     *  30011Text 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get30011Text() {
        return _30011Text;
    }

    /**
     *  30011Text 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set30011Text(String value) {
        this._30011Text = value;
    }

    /**
     * pstlz 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstlz() {
        return pstlz;
    }

    /**
     * pstlz 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstlz(String value) {
        this.pstlz = value;
    }

    /**
     * land1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLand1() {
        return land1;
    }

    /**
     * land1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLand1(String value) {
        this.land1 = value;
    }

    /**
     * postTel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostTel() {
        return postTel;
    }

    /**
     * postTel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostTel(String value) {
        this.postTel = value;
    }

    /**
     * spras 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpras() {
        return spras;
    }

    /**
     * spras 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpras(String value) {
        this.spras = value;
    }

    /**
     * cuzeit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuzeit() {
        return cuzeit;
    }

    /**
     * cuzeit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuzeit(String value) {
        this.cuzeit = value;
    }

    /**
     * vbelnKunnr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVbelnKunnr() {
        return vbelnKunnr;
    }

    /**
     * vbelnKunnr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVbelnKunnr(String value) {
        this.vbelnKunnr = value;
    }

    /**
     * waerk 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaerk() {
        return waerk;
    }

    /**
     * waerk 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaerk(String value) {
        this.waerk = value;
    }

    /**
     * gnetwr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGnetwr() {
        return gnetwr;
    }

    /**
     * gnetwr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGnetwr(BigDecimal value) {
        this.gnetwr = value;
    }

    /**
     * gmwsbp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGmwsbp() {
        return gmwsbp;
    }

    /**
     * gmwsbp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGmwsbp(BigDecimal value) {
        this.gmwsbp = value;
    }

    /**
     * gtotal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGtotal() {
        return gtotal;
    }

    /**
     * gtotal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGtotal(BigDecimal value) {
        this.gtotal = value;
    }

    /**
     * gnetwrc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGnetwrc() {
        return gnetwrc;
    }

    /**
     * gnetwrc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGnetwrc(String value) {
        this.gnetwrc = value;
    }

    /**
     * gmwsbpc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGmwsbpc() {
        return gmwsbpc;
    }

    /**
     * gmwsbpc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGmwsbpc(String value) {
        this.gmwsbpc = value;
    }

    /**
     * gtotalc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGtotalc() {
        return gtotalc;
    }

    /**
     * gtotalc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGtotalc(String value) {
        this.gtotalc = value;
    }

    /**
     * kunnr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKunnr() {
        return kunnr;
    }

    /**
     * kunnr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKunnr(String value) {
        this.kunnr = value;
    }

    /**
     * kunag 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKunag() {
        return kunag;
    }

    /**
     * kunag 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKunag(String value) {
        this.kunag = value;
    }

    /**
     * kuenr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKuenr() {
        return kuenr;
    }

    /**
     * kuenr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKuenr(String value) {
        this.kuenr = value;
    }

}
