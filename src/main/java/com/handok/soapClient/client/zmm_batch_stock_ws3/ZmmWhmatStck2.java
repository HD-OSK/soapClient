//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.06.02 시간 07:11:19 PM KST 
//


package com.handok.soapClient.client.zmm_batch_stock_ws3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ZmmWhmatStck2 complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ZmmWhmatStck2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Matnr" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="Maktx" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="Werks" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Lgort" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Charg" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Licha" type="{urn:sap-com:document:sap:rfc:functions}char15"/&gt;
 *         &lt;element name="Clabs" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="Bdmng" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="Vfdat" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Atwtb" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="Hsdat" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Lwedt" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZmmWhmatStck2", propOrder = {
    "matnr",
    "maktx",
    "werks",
    "lgort",
    "charg",
    "licha",
    "clabs",
    "bdmng",
    "vfdat",
    "atwtb",
    "hsdat",
    "lwedt"
})
public class ZmmWhmatStck2 {

    @XmlElement(name = "Matnr", required = true)
    protected String matnr;
    @XmlElement(name = "Maktx", required = true)
    protected String maktx;
    @XmlElement(name = "Werks", required = true)
    protected String werks;
    @XmlElement(name = "Lgort", required = true)
    protected String lgort;
    @XmlElement(name = "Charg", required = true)
    protected String charg;
    @XmlElement(name = "Licha", required = true)
    protected String licha;
    @XmlElement(name = "Clabs", required = true)
    protected BigDecimal clabs;
    @XmlElement(name = "Bdmng", required = true)
    protected BigDecimal bdmng;
    @XmlElement(name = "Vfdat", required = true)
    protected String vfdat;
    @XmlElement(name = "Atwtb", required = true)
    protected String atwtb;
    @XmlElement(name = "Hsdat", required = true)
    protected String hsdat;
    @XmlElement(name = "Lwedt", required = true)
    protected String lwedt;

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
     * maktx 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaktx() {
        return maktx;
    }

    /**
     * maktx 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaktx(String value) {
        this.maktx = value;
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
     * licha 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicha() {
        return licha;
    }

    /**
     * licha 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicha(String value) {
        this.licha = value;
    }

    /**
     * clabs 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClabs() {
        return clabs;
    }

    /**
     * clabs 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setClabs(BigDecimal value) {
        this.clabs = value;
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

    /**
     * atwtb 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtwtb() {
        return atwtb;
    }

    /**
     * atwtb 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtwtb(String value) {
        this.atwtb = value;
    }

    /**
     * hsdat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHsdat() {
        return hsdat;
    }

    /**
     * hsdat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHsdat(String value) {
        this.hsdat = value;
    }

    /**
     * lwedt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLwedt() {
        return lwedt;
    }

    /**
     * lwedt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLwedt(String value) {
        this.lwedt = value;
    }

}
