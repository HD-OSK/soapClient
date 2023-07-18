//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.06.02 시간 07:11:25 PM KST 
//


package com.handok.soapClient.client.zsd_ws_delivery_update_ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Verpo complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Verpo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExidvOb" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="Exidv" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="Velin" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Vbeln" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Posnr" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="Tmeng" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="Vrkme" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="Matnr" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="Charg" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Werks" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Lgort" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Anzsn" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Rfbel" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Rfpos" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="PMaterial" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="VenumOb" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Venum" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Cuobj" type="{urn:sap-com:document:sap:rfc:functions}numeric18"/&gt;
 *         &lt;element name="Bestq" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Sobkz" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Sonum" type="{urn:sap-com:document:sap:rfc:functions}char16"/&gt;
 *         &lt;element name="Wdatu" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="SpeIdplate" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="SpeUpdkz" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Verpo", propOrder = {
    "exidvOb",
    "exidv",
    "velin",
    "vbeln",
    "posnr",
    "tmeng",
    "vrkme",
    "matnr",
    "charg",
    "werks",
    "lgort",
    "anzsn",
    "rfbel",
    "rfpos",
    "pMaterial",
    "venumOb",
    "venum",
    "cuobj",
    "bestq",
    "sobkz",
    "sonum",
    "wdatu",
    "speIdplate",
    "speUpdkz"
})
public class Verpo {

    @XmlElement(name = "ExidvOb", required = true)
    protected String exidvOb;
    @XmlElement(name = "Exidv", required = true)
    protected String exidv;
    @XmlElement(name = "Velin", required = true)
    protected String velin;
    @XmlElement(name = "Vbeln", required = true)
    protected String vbeln;
    @XmlElement(name = "Posnr", required = true)
    protected String posnr;
    @XmlElement(name = "Tmeng", required = true)
    protected BigDecimal tmeng;
    @XmlElement(name = "Vrkme", required = true)
    protected String vrkme;
    @XmlElement(name = "Matnr", required = true)
    protected String matnr;
    @XmlElement(name = "Charg", required = true)
    protected String charg;
    @XmlElement(name = "Werks", required = true)
    protected String werks;
    @XmlElement(name = "Lgort", required = true)
    protected String lgort;
    @XmlElement(name = "Anzsn")
    protected int anzsn;
    @XmlElement(name = "Rfbel", required = true)
    protected String rfbel;
    @XmlElement(name = "Rfpos", required = true)
    protected String rfpos;
    @XmlElement(name = "PMaterial", required = true)
    protected String pMaterial;
    @XmlElement(name = "VenumOb", required = true)
    protected String venumOb;
    @XmlElement(name = "Venum", required = true)
    protected String venum;
    @XmlElement(name = "Cuobj", required = true)
    protected String cuobj;
    @XmlElement(name = "Bestq", required = true)
    protected String bestq;
    @XmlElement(name = "Sobkz", required = true)
    protected String sobkz;
    @XmlElement(name = "Sonum", required = true)
    protected String sonum;
    @XmlElement(name = "Wdatu", required = true)
    protected String wdatu;
    @XmlElement(name = "SpeIdplate", required = true)
    protected String speIdplate;
    @XmlElement(name = "SpeUpdkz", required = true)
    protected String speUpdkz;

    /**
     * exidvOb 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExidvOb() {
        return exidvOb;
    }

    /**
     * exidvOb 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExidvOb(String value) {
        this.exidvOb = value;
    }

    /**
     * exidv 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExidv() {
        return exidv;
    }

    /**
     * exidv 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExidv(String value) {
        this.exidv = value;
    }

    /**
     * velin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVelin() {
        return velin;
    }

    /**
     * velin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVelin(String value) {
        this.velin = value;
    }

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
     * posnr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosnr() {
        return posnr;
    }

    /**
     * posnr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosnr(String value) {
        this.posnr = value;
    }

    /**
     * tmeng 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTmeng() {
        return tmeng;
    }

    /**
     * tmeng 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTmeng(BigDecimal value) {
        this.tmeng = value;
    }

    /**
     * vrkme 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrkme() {
        return vrkme;
    }

    /**
     * vrkme 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrkme(String value) {
        this.vrkme = value;
    }

    /**
     * matnr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatnr() {
        return matnr;
    }

    /**
     * matnr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatnr(String value) {
        this.matnr = value;
    }

    /**
     * charg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharg() {
        return charg;
    }

    /**
     * charg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharg(String value) {
        this.charg = value;
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
     * anzsn 속성의 값을 가져옵니다.
     * 
     */
    public int getAnzsn() {
        return anzsn;
    }

    /**
     * anzsn 속성의 값을 설정합니다.
     * 
     */
    public void setAnzsn(int value) {
        this.anzsn = value;
    }

    /**
     * rfbel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfbel() {
        return rfbel;
    }

    /**
     * rfbel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfbel(String value) {
        this.rfbel = value;
    }

    /**
     * rfpos 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfpos() {
        return rfpos;
    }

    /**
     * rfpos 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfpos(String value) {
        this.rfpos = value;
    }

    /**
     * pMaterial 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMaterial() {
        return pMaterial;
    }

    /**
     * pMaterial 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMaterial(String value) {
        this.pMaterial = value;
    }

    /**
     * venumOb 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVenumOb() {
        return venumOb;
    }

    /**
     * venumOb 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVenumOb(String value) {
        this.venumOb = value;
    }

    /**
     * venum 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVenum() {
        return venum;
    }

    /**
     * venum 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVenum(String value) {
        this.venum = value;
    }

    /**
     * cuobj 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuobj() {
        return cuobj;
    }

    /**
     * cuobj 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuobj(String value) {
        this.cuobj = value;
    }

    /**
     * bestq 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBestq() {
        return bestq;
    }

    /**
     * bestq 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBestq(String value) {
        this.bestq = value;
    }

    /**
     * sobkz 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSobkz() {
        return sobkz;
    }

    /**
     * sobkz 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSobkz(String value) {
        this.sobkz = value;
    }

    /**
     * sonum 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSonum() {
        return sonum;
    }

    /**
     * sonum 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonum(String value) {
        this.sonum = value;
    }

    /**
     * wdatu 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWdatu() {
        return wdatu;
    }

    /**
     * wdatu 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWdatu(String value) {
        this.wdatu = value;
    }

    /**
     * speIdplate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeIdplate() {
        return speIdplate;
    }

    /**
     * speIdplate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeIdplate(String value) {
        this.speIdplate = value;
    }

    /**
     * speUpdkz 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeUpdkz() {
        return speUpdkz;
    }

    /**
     * speUpdkz 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeUpdkz(String value) {
        this.speUpdkz = value;
    }

}
