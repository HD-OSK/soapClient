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
 * <p>RepackHuWm complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="RepackHuWm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Desthu" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="Sourcehu" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="Kzueb" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Quantity" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/&gt;
 *         &lt;element name="Meins" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="Matnr" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="Charg" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Werks" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Lgort" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Bestq" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Sobkz" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Sonum" type="{urn:sap-com:document:sap:rfc:functions}char16"/&gt;
 *         &lt;element name="Qplos" type="{urn:sap-com:document:sap:rfc:functions}numeric12"/&gt;
 *         &lt;element name="Tanum" type="{urn:sap-com:document:sap:rfc:functions}numeric10"/&gt;
 *         &lt;element name="Tapos" type="{urn:sap-com:document:sap:rfc:functions}numeric4"/&gt;
 *         &lt;element name="VbelnVl" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="PosnrVl" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="Zeile" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Object" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Objkey" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="ObjectAssignment" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="NewAltme" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepackHuWm", propOrder = {
    "desthu",
    "sourcehu",
    "kzueb",
    "quantity",
    "meins",
    "matnr",
    "charg",
    "werks",
    "lgort",
    "bestq",
    "sobkz",
    "sonum",
    "qplos",
    "tanum",
    "tapos",
    "vbelnVl",
    "posnrVl",
    "zeile",
    "object",
    "objkey",
    "objectAssignment",
    "newAltme"
})
public class RepackHuWm {

    @XmlElement(name = "Desthu", required = true)
    protected String desthu;
    @XmlElement(name = "Sourcehu", required = true)
    protected String sourcehu;
    @XmlElement(name = "Kzueb", required = true)
    protected String kzueb;
    @XmlElement(name = "Quantity", required = true)
    protected BigDecimal quantity;
    @XmlElement(name = "Meins", required = true)
    protected String meins;
    @XmlElement(name = "Matnr", required = true)
    protected String matnr;
    @XmlElement(name = "Charg", required = true)
    protected String charg;
    @XmlElement(name = "Werks", required = true)
    protected String werks;
    @XmlElement(name = "Lgort", required = true)
    protected String lgort;
    @XmlElement(name = "Bestq", required = true)
    protected String bestq;
    @XmlElement(name = "Sobkz", required = true)
    protected String sobkz;
    @XmlElement(name = "Sonum", required = true)
    protected String sonum;
    @XmlElement(name = "Qplos", required = true)
    protected String qplos;
    @XmlElement(name = "Tanum", required = true)
    protected String tanum;
    @XmlElement(name = "Tapos", required = true)
    protected String tapos;
    @XmlElement(name = "VbelnVl", required = true)
    protected String vbelnVl;
    @XmlElement(name = "PosnrVl", required = true)
    protected String posnrVl;
    @XmlElement(name = "Zeile")
    protected int zeile;
    @XmlElement(name = "Object", required = true)
    protected String object;
    @XmlElement(name = "Objkey", required = true)
    protected String objkey;
    @XmlElement(name = "ObjectAssignment", required = true)
    protected String objectAssignment;
    @XmlElement(name = "NewAltme", required = true)
    protected String newAltme;

    /**
     * desthu 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesthu() {
        return desthu;
    }

    /**
     * desthu 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesthu(String value) {
        this.desthu = value;
    }

    /**
     * sourcehu 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcehu() {
        return sourcehu;
    }

    /**
     * sourcehu 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcehu(String value) {
        this.sourcehu = value;
    }

    /**
     * kzueb 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzueb() {
        return kzueb;
    }

    /**
     * kzueb 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzueb(String value) {
        this.kzueb = value;
    }

    /**
     * quantity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * quantity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
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
     * qplos 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQplos() {
        return qplos;
    }

    /**
     * qplos 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQplos(String value) {
        this.qplos = value;
    }

    /**
     * tanum 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTanum() {
        return tanum;
    }

    /**
     * tanum 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTanum(String value) {
        this.tanum = value;
    }

    /**
     * tapos 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTapos() {
        return tapos;
    }

    /**
     * tapos 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTapos(String value) {
        this.tapos = value;
    }

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
     * zeile 속성의 값을 가져옵니다.
     * 
     */
    public int getZeile() {
        return zeile;
    }

    /**
     * zeile 속성의 값을 설정합니다.
     * 
     */
    public void setZeile(int value) {
        this.zeile = value;
    }

    /**
     * object 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObject() {
        return object;
    }

    /**
     * object 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObject(String value) {
        this.object = value;
    }

    /**
     * objkey 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjkey() {
        return objkey;
    }

    /**
     * objkey 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjkey(String value) {
        this.objkey = value;
    }

    /**
     * objectAssignment 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectAssignment() {
        return objectAssignment;
    }

    /**
     * objectAssignment 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectAssignment(String value) {
        this.objectAssignment = value;
    }

    /**
     * newAltme 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewAltme() {
        return newAltme;
    }

    /**
     * newAltme 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewAltme(String value) {
        this.newAltme = value;
    }

}
