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
 * <p>Vbsupcon complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Vbsupcon"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VbelnVl" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="PosnrVl" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="Sobkz" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="LvsSonum" type="{urn:sap-com:document:sap:rfc:functions}char16"/&gt;
 *         &lt;element name="Rfmng" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/&gt;
 *         &lt;element name="Meins" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="MeinsIso" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Lfimg" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="Vrkme" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="VrkmeIso" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vbsupcon", propOrder = {
    "vbelnVl",
    "posnrVl",
    "sobkz",
    "lvsSonum",
    "rfmng",
    "meins",
    "meinsIso",
    "lfimg",
    "vrkme",
    "vrkmeIso"
})
public class Vbsupcon {

    @XmlElement(name = "VbelnVl", required = true)
    protected String vbelnVl;
    @XmlElement(name = "PosnrVl", required = true)
    protected String posnrVl;
    @XmlElement(name = "Sobkz", required = true)
    protected String sobkz;
    @XmlElement(name = "LvsSonum", required = true)
    protected String lvsSonum;
    @XmlElement(name = "Rfmng", required = true)
    protected BigDecimal rfmng;
    @XmlElement(name = "Meins", required = true)
    protected String meins;
    @XmlElement(name = "MeinsIso", required = true)
    protected String meinsIso;
    @XmlElement(name = "Lfimg", required = true)
    protected BigDecimal lfimg;
    @XmlElement(name = "Vrkme", required = true)
    protected String vrkme;
    @XmlElement(name = "VrkmeIso", required = true)
    protected String vrkmeIso;

    /**
     * vbelnVl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVbelnVl() {
        return vbelnVl;
    }

    /**
     * vbelnVl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVbelnVl(String value) {
        this.vbelnVl = value;
    }

    /**
     * posnrVl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosnrVl() {
        return posnrVl;
    }

    /**
     * posnrVl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosnrVl(String value) {
        this.posnrVl = value;
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
     * lvsSonum 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLvsSonum() {
        return lvsSonum;
    }

    /**
     * lvsSonum 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLvsSonum(String value) {
        this.lvsSonum = value;
    }

    /**
     * rfmng 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRfmng() {
        return rfmng;
    }

    /**
     * rfmng 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRfmng(BigDecimal value) {
        this.rfmng = value;
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
     * meinsIso 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeinsIso() {
        return meinsIso;
    }

    /**
     * meinsIso 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeinsIso(String value) {
        this.meinsIso = value;
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
     * vrkmeIso 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrkmeIso() {
        return vrkmeIso;
    }

    /**
     * vrkmeIso 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrkmeIso(String value) {
        this.vrkmeIso = value;
    }

}
