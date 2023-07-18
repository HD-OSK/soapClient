//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.06.02 시간 07:11:21 PM KST 
//


package com.handok.soapClient.client.zmm_display_mb25_mbd_ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Zsmm025 complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Zsmm025"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rsnum" type="{urn:sap-com:document:sap:rfc:functions}numeric10"/&gt;
 *         &lt;element name="Rspos" type="{urn:sap-com:document:sap:rfc:functions}numeric4"/&gt;
 *         &lt;element name="Bster" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Bdter" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Lgort" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Kostl" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Matnr" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="Charg" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Bdmng" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="Meins" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="Wempf" type="{urn:sap-com:document:sap:rfc:functions}char12"/&gt;
 *         &lt;element name="Vfdat" type="{urn:sap-com:document:sap:soap:functions:mc-style}date10"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Zsmm025", propOrder = {
    "rsnum",
    "rspos",
    "bster",
    "bdter",
    "lgort",
    "kostl",
    "matnr",
    "charg",
    "bdmng",
    "meins",
    "wempf",
    "vfdat"
})
public class Zsmm025 {

    @XmlElement(name = "Rsnum", required = true)
    protected String rsnum;
    @XmlElement(name = "Rspos", required = true)
    protected String rspos;
    @XmlElement(name = "Bster", required = true)
    protected String bster;
    @XmlElement(name = "Bdter", required = true)
    protected String bdter;
    @XmlElement(name = "Lgort", required = true)
    protected String lgort;
    @XmlElement(name = "Kostl", required = true)
    protected String kostl;
    @XmlElement(name = "Matnr", required = true)
    protected String matnr;
    @XmlElement(name = "Charg", required = true)
    protected String charg;
    @XmlElement(name = "Bdmng", required = true)
    protected BigDecimal bdmng;
    @XmlElement(name = "Meins", required = true)
    protected String meins;
    @XmlElement(name = "Wempf", required = true)
    protected String wempf;
    @XmlElement(name = "Vfdat", required = true)
    protected String vfdat;

    /**
     * rsnum 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsnum() {
        return rsnum;
    }

    /**
     * rsnum 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsnum(String value) {
        this.rsnum = value;
    }

    /**
     * rspos 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspos() {
        return rspos;
    }

    /**
     * rspos 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRspos(String value) {
        this.rspos = value;
    }

    /**
     * bster 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBster() {
        return bster;
    }

    /**
     * bster 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBster(String value) {
        this.bster = value;
    }

    /**
     * bdter 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBdter() {
        return bdter;
    }

    /**
     * bdter 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBdter(String value) {
        this.bdter = value;
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
     * kostl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKostl() {
        return kostl;
    }

    /**
     * kostl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKostl(String value) {
        this.kostl = value;
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
     * bdmng 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBdmng() {
        return bdmng;
    }

    /**
     * bdmng 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBdmng(BigDecimal value) {
        this.bdmng = value;
    }

    /**
     * meins 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeins() {
        return meins;
    }

    /**
     * meins 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeins(String value) {
        this.meins = value;
    }

    /**
     * wempf 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWempf() {
        return wempf;
    }

    /**
     * wempf 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWempf(String value) {
        this.wempf = value;
    }

    /**
     * vfdat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVfdat() {
        return vfdat;
    }

    /**
     * vfdat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVfdat(String value) {
        this.vfdat = value;
    }

}
