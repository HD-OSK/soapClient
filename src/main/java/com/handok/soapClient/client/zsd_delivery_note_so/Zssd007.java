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
 * <p>Zssd007 complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Zssd007"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Posnr" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="Matnr" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="Arktx" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="Lfimg" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="Charg" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Vfdat" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Vrkme" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="Lfimgc" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Uecha" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="Vgbel" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Cvfdat" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Cno3" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Kdmat" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="Licha" type="{urn:sap-com:document:sap:rfc:functions}char15"/&gt;
 *         &lt;element name="Empst" type="{urn:sap-com:document:sap:rfc:functions}char25"/&gt;
 *         &lt;element name="Vgpos" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="Netwr" type="{urn:sap-com:document:sap:rfc:functions}curr15.2"/&gt;
 *         &lt;element name="Mwsbp" type="{urn:sap-com:document:sap:rfc:functions}curr13.2"/&gt;
 *         &lt;element name="Netpr" type="{urn:sap-com:document:sap:rfc:functions}curr11.2"/&gt;
 *         &lt;element name="Netprc" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Netwrc" type="{urn:sap-com:document:sap:rfc:functions}char11"/&gt;
 *         &lt;element name="Mwsbpc" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Kulab" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="Kulabc" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Werks" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Idnlf" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Zssd007", propOrder = {
    "posnr",
    "matnr",
    "arktx",
    "lfimg",
    "charg",
    "vfdat",
    "vrkme",
    "lfimgc",
    "uecha",
    "vgbel",
    "cvfdat",
    "cno3",
    "kdmat",
    "licha",
    "empst",
    "vgpos",
    "netwr",
    "mwsbp",
    "netpr",
    "netprc",
    "netwrc",
    "mwsbpc",
    "kulab",
    "kulabc",
    "werks",
    "idnlf"
})
public class Zssd007 {

    @XmlElement(name = "Posnr", required = true)
    protected String posnr;
    @XmlElement(name = "Matnr", required = true)
    protected String matnr;
    @XmlElement(name = "Arktx", required = true)
    protected String arktx;
    @XmlElement(name = "Lfimg", required = true)
    protected BigDecimal lfimg;
    @XmlElement(name = "Charg", required = true)
    protected String charg;
    @XmlElement(name = "Vfdat", required = true)
    protected String vfdat;
    @XmlElement(name = "Vrkme", required = true)
    protected String vrkme;
    @XmlElement(name = "Lfimgc", required = true)
    protected String lfimgc;
    @XmlElement(name = "Uecha", required = true)
    protected String uecha;
    @XmlElement(name = "Vgbel", required = true)
    protected String vgbel;
    @XmlElement(name = "Cvfdat", required = true)
    protected String cvfdat;
    @XmlElement(name = "Cno3", required = true)
    protected String cno3;
    @XmlElement(name = "Kdmat", required = true)
    protected String kdmat;
    @XmlElement(name = "Licha", required = true)
    protected String licha;
    @XmlElement(name = "Empst", required = true)
    protected String empst;
    @XmlElement(name = "Vgpos", required = true)
    protected String vgpos;
    @XmlElement(name = "Netwr", required = true)
    protected BigDecimal netwr;
    @XmlElement(name = "Mwsbp", required = true)
    protected BigDecimal mwsbp;
    @XmlElement(name = "Netpr", required = true)
    protected BigDecimal netpr;
    @XmlElement(name = "Netprc", required = true)
    protected String netprc;
    @XmlElement(name = "Netwrc", required = true)
    protected String netwrc;
    @XmlElement(name = "Mwsbpc", required = true)
    protected String mwsbpc;
    @XmlElement(name = "Kulab", required = true)
    protected BigDecimal kulab;
    @XmlElement(name = "Kulabc", required = true)
    protected String kulabc;
    @XmlElement(name = "Werks", required = true)
    protected String werks;
    @XmlElement(name = "Idnlf", required = true)
    protected String idnlf;

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
     * arktx 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArktx() {
        return arktx;
    }

    /**
     * arktx 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArktx(String value) {
        this.arktx = value;
    }

    /**
     * lfimg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLfimg() {
        return lfimg;
    }

    /**
     * lfimg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLfimg(BigDecimal value) {
        this.lfimg = value;
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
     * lfimgc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLfimgc() {
        return lfimgc;
    }

    /**
     * lfimgc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLfimgc(String value) {
        this.lfimgc = value;
    }

    /**
     * uecha 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUecha() {
        return uecha;
    }

    /**
     * uecha 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUecha(String value) {
        this.uecha = value;
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
     * cvfdat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvfdat() {
        return cvfdat;
    }

    /**
     * cvfdat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvfdat(String value) {
        this.cvfdat = value;
    }

    /**
     * cno3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCno3() {
        return cno3;
    }

    /**
     * cno3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCno3(String value) {
        this.cno3 = value;
    }

    /**
     * kdmat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKdmat() {
        return kdmat;
    }

    /**
     * kdmat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKdmat(String value) {
        this.kdmat = value;
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
     * empst 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpst() {
        return empst;
    }

    /**
     * empst 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpst(String value) {
        this.empst = value;
    }

    /**
     * vgpos 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVgpos() {
        return vgpos;
    }

    /**
     * vgpos 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVgpos(String value) {
        this.vgpos = value;
    }

    /**
     * netwr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetwr() {
        return netwr;
    }

    /**
     * netwr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetwr(BigDecimal value) {
        this.netwr = value;
    }

    /**
     * mwsbp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMwsbp() {
        return mwsbp;
    }

    /**
     * mwsbp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMwsbp(BigDecimal value) {
        this.mwsbp = value;
    }

    /**
     * netpr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetpr() {
        return netpr;
    }

    /**
     * netpr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetpr(BigDecimal value) {
        this.netpr = value;
    }

    /**
     * netprc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetprc() {
        return netprc;
    }

    /**
     * netprc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetprc(String value) {
        this.netprc = value;
    }

    /**
     * netwrc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetwrc() {
        return netwrc;
    }

    /**
     * netwrc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetwrc(String value) {
        this.netwrc = value;
    }

    /**
     * mwsbpc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMwsbpc() {
        return mwsbpc;
    }

    /**
     * mwsbpc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMwsbpc(String value) {
        this.mwsbpc = value;
    }

    /**
     * kulab 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKulab() {
        return kulab;
    }

    /**
     * kulab 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKulab(BigDecimal value) {
        this.kulab = value;
    }

    /**
     * kulabc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKulabc() {
        return kulabc;
    }

    /**
     * kulabc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKulabc(String value) {
        this.kulabc = value;
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
     * idnlf 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdnlf() {
        return idnlf;
    }

    /**
     * idnlf 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdnlf(String value) {
        this.idnlf = value;
    }

}
