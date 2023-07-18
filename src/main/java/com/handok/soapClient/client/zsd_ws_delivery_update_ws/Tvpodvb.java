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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Tvpodvb complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Tvpodvb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mandt" type="{urn:sap-com:document:sap:rfc:functions}clnt3"/&gt;
 *         &lt;element name="HandleLips" type="{urn:sap-com:document:sap:rfc:functions}char22"/&gt;
 *         &lt;element name="Grund" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="HandleLikp" type="{urn:sap-com:document:sap:rfc:functions}char22"/&gt;
 *         &lt;element name="UeHandleLips" type="{urn:sap-com:document:sap:rfc:functions}char22"/&gt;
 *         &lt;element name="Vbeln" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Posnr" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="LfimgDiff" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="Vrkme" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="LgmngDiff" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="Meins" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="Umvkz" type="{urn:sap-com:document:sap:rfc:functions}decimal5.0"/&gt;
 *         &lt;element name="Umvkn" type="{urn:sap-com:document:sap:rfc:functions}decimal5.0"/&gt;
 *         &lt;element name="Podmg" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="PodmgLme" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="PodmgFlo" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="LgmngDiffFlo" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Lfimg" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="Lgmng" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="KcmengVme" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/&gt;
 *         &lt;element name="Kcmeng" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/&gt;
 *         &lt;element name="Calcu" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Matnr" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="Arktx" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="Podat" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Potim" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="Rudat" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Rutim" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="Fobem" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Fobew" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Updkz" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Selkz" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Podmul" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Defgr" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tvpodvb", propOrder = {
    "mandt",
    "handleLips",
    "grund",
    "handleLikp",
    "ueHandleLips",
    "vbeln",
    "posnr",
    "lfimgDiff",
    "vrkme",
    "lgmngDiff",
    "meins",
    "umvkz",
    "umvkn",
    "podmg",
    "podmgLme",
    "podmgFlo",
    "lgmngDiffFlo",
    "lfimg",
    "lgmng",
    "kcmengVme",
    "kcmeng",
    "calcu",
    "matnr",
    "arktx",
    "podat",
    "potim",
    "rudat",
    "rutim",
    "fobem",
    "fobew",
    "updkz",
    "selkz",
    "podmul",
    "defgr"
})
public class Tvpodvb {

    @XmlElement(name = "Mandt", required = true)
    protected String mandt;
    @XmlElement(name = "HandleLips", required = true)
    protected String handleLips;
    @XmlElement(name = "Grund", required = true)
    protected String grund;
    @XmlElement(name = "HandleLikp", required = true)
    protected String handleLikp;
    @XmlElement(name = "UeHandleLips", required = true)
    protected String ueHandleLips;
    @XmlElement(name = "Vbeln", required = true)
    protected String vbeln;
    @XmlElement(name = "Posnr", required = true)
    protected String posnr;
    @XmlElement(name = "LfimgDiff", required = true)
    protected BigDecimal lfimgDiff;
    @XmlElement(name = "Vrkme", required = true)
    protected String vrkme;
    @XmlElement(name = "LgmngDiff", required = true)
    protected BigDecimal lgmngDiff;
    @XmlElement(name = "Meins", required = true)
    protected String meins;
    @XmlElement(name = "Umvkz", required = true)
    protected BigDecimal umvkz;
    @XmlElement(name = "Umvkn", required = true)
    protected BigDecimal umvkn;
    @XmlElement(name = "Podmg", required = true)
    protected BigDecimal podmg;
    @XmlElement(name = "PodmgLme", required = true)
    protected BigDecimal podmgLme;
    @XmlElement(name = "PodmgFlo")
    protected float podmgFlo;
    @XmlElement(name = "LgmngDiffFlo")
    protected float lgmngDiffFlo;
    @XmlElement(name = "Lfimg", required = true)
    protected BigDecimal lfimg;
    @XmlElement(name = "Lgmng", required = true)
    protected BigDecimal lgmng;
    @XmlElement(name = "KcmengVme", required = true)
    protected BigDecimal kcmengVme;
    @XmlElement(name = "Kcmeng", required = true)
    protected BigDecimal kcmeng;
    @XmlElement(name = "Calcu", required = true)
    protected String calcu;
    @XmlElement(name = "Matnr", required = true)
    protected String matnr;
    @XmlElement(name = "Arktx", required = true)
    protected String arktx;
    @XmlElement(name = "Podat", required = true)
    protected String podat;
    @XmlElement(name = "Potim", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar potim;
    @XmlElement(name = "Rudat", required = true)
    protected String rudat;
    @XmlElement(name = "Rutim", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar rutim;
    @XmlElement(name = "Fobem", required = true)
    protected String fobem;
    @XmlElement(name = "Fobew", required = true)
    protected String fobew;
    @XmlElement(name = "Updkz", required = true)
    protected String updkz;
    @XmlElement(name = "Selkz", required = true)
    protected String selkz;
    @XmlElement(name = "Podmul", required = true)
    protected String podmul;
    @XmlElement(name = "Defgr", required = true)
    protected String defgr;

    /**
     * mandt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandt() {
        return mandt;
    }

    /**
     * mandt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandt(String value) {
        this.mandt = value;
    }

    /**
     * handleLips 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandleLips() {
        return handleLips;
    }

    /**
     * handleLips 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandleLips(String value) {
        this.handleLips = value;
    }

    /**
     * grund 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrund() {
        return grund;
    }

    /**
     * grund 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrund(String value) {
        this.grund = value;
    }

    /**
     * handleLikp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandleLikp() {
        return handleLikp;
    }

    /**
     * handleLikp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandleLikp(String value) {
        this.handleLikp = value;
    }

    /**
     * ueHandleLips 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUeHandleLips() {
        return ueHandleLips;
    }

    /**
     * ueHandleLips 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUeHandleLips(String value) {
        this.ueHandleLips = value;
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
     * lfimgDiff 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLfimgDiff() {
        return lfimgDiff;
    }

    /**
     * lfimgDiff 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLfimgDiff(BigDecimal value) {
        this.lfimgDiff = value;
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
     * lgmngDiff 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLgmngDiff() {
        return lgmngDiff;
    }

    /**
     * lgmngDiff 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLgmngDiff(BigDecimal value) {
        this.lgmngDiff = value;
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
     * umvkz 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUmvkz() {
        return umvkz;
    }

    /**
     * umvkz 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUmvkz(BigDecimal value) {
        this.umvkz = value;
    }

    /**
     * umvkn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUmvkn() {
        return umvkn;
    }

    /**
     * umvkn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUmvkn(BigDecimal value) {
        this.umvkn = value;
    }

    /**
     * podmg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPodmg() {
        return podmg;
    }

    /**
     * podmg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPodmg(BigDecimal value) {
        this.podmg = value;
    }

    /**
     * podmgLme 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPodmgLme() {
        return podmgLme;
    }

    /**
     * podmgLme 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPodmgLme(BigDecimal value) {
        this.podmgLme = value;
    }

    /**
     * podmgFlo 속성의 값을 가져옵니다.
     * 
     */
    public float getPodmgFlo() {
        return podmgFlo;
    }

    /**
     * podmgFlo 속성의 값을 설정합니다.
     * 
     */
    public void setPodmgFlo(float value) {
        this.podmgFlo = value;
    }

    /**
     * lgmngDiffFlo 속성의 값을 가져옵니다.
     * 
     */
    public float getLgmngDiffFlo() {
        return lgmngDiffFlo;
    }

    /**
     * lgmngDiffFlo 속성의 값을 설정합니다.
     * 
     */
    public void setLgmngDiffFlo(float value) {
        this.lgmngDiffFlo = value;
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
     * lgmng 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLgmng() {
        return lgmng;
    }

    /**
     * lgmng 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLgmng(BigDecimal value) {
        this.lgmng = value;
    }

    /**
     * kcmengVme 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKcmengVme() {
        return kcmengVme;
    }

    /**
     * kcmengVme 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKcmengVme(BigDecimal value) {
        this.kcmengVme = value;
    }

    /**
     * kcmeng 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKcmeng() {
        return kcmeng;
    }

    /**
     * kcmeng 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKcmeng(BigDecimal value) {
        this.kcmeng = value;
    }

    /**
     * calcu 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalcu() {
        return calcu;
    }

    /**
     * calcu 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalcu(String value) {
        this.calcu = value;
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
     * podat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPodat() {
        return podat;
    }

    /**
     * podat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPodat(String value) {
        this.podat = value;
    }

    /**
     * potim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPotim() {
        return potim;
    }

    /**
     * potim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPotim(XMLGregorianCalendar value) {
        this.potim = value;
    }

    /**
     * rudat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRudat() {
        return rudat;
    }

    /**
     * rudat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRudat(String value) {
        this.rudat = value;
    }

    /**
     * rutim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRutim() {
        return rutim;
    }

    /**
     * rutim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRutim(XMLGregorianCalendar value) {
        this.rutim = value;
    }

    /**
     * fobem 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFobem() {
        return fobem;
    }

    /**
     * fobem 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFobem(String value) {
        this.fobem = value;
    }

    /**
     * fobew 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFobew() {
        return fobew;
    }

    /**
     * fobew 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFobew(String value) {
        this.fobew = value;
    }

    /**
     * updkz 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdkz() {
        return updkz;
    }

    /**
     * updkz 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdkz(String value) {
        this.updkz = value;
    }

    /**
     * selkz 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelkz() {
        return selkz;
    }

    /**
     * selkz 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelkz(String value) {
        this.selkz = value;
    }

    /**
     * podmul 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPodmul() {
        return podmul;
    }

    /**
     * podmul 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPodmul(String value) {
        this.podmul = value;
    }

    /**
     * defgr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefgr() {
        return defgr;
    }

    /**
     * defgr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefgr(String value) {
        this.defgr = value;
    }

}
