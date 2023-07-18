//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.06.02 시간 07:11:25 PM KST 
//


package com.handok.soapClient.client.zsd_ws_delivery_update_ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ShpPartnerUpdate complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ShpPartnerUpdate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VbelnVl" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Parvw" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Parnr" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="UpdkzPar" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Adrnr" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Anred" type="{urn:sap-com:document:sap:rfc:functions}char15"/&gt;
 *         &lt;element name="Name1" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="Name2" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="Name3" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="Name4" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="Stras" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="Land1" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Pstlz" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Pstl2" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Pfort" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="Ort01" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="Ort02" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="Regio" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Cityc" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Counc" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Pfach" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Telf1" type="{urn:sap-com:document:sap:rfc:functions}char16"/&gt;
 *         &lt;element name="Telf2" type="{urn:sap-com:document:sap:rfc:functions}char16"/&gt;
 *         &lt;element name="Telbx" type="{urn:sap-com:document:sap:rfc:functions}char15"/&gt;
 *         &lt;element name="Telfx" type="{urn:sap-com:document:sap:rfc:functions}char31"/&gt;
 *         &lt;element name="Teltx" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="Telx1" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="Spras" type="{urn:sap-com:document:sap:rfc:functions}lang"/&gt;
 *         &lt;element name="Lzone" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Hausn" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="Parge" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="NameList" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="Txjcd" type="{urn:sap-com:document:sap:rfc:functions}char15"/&gt;
 *         &lt;element name="Adrnp" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="AddressType" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Duefl" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Stock" type="{urn:sap-com:document:sap:rfc:functions}char6"/&gt;
 *         &lt;element name="Strs2" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="Strasna" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="EmailAddr" type="{urn:sap-com:document:sap:rfc:functions}char241"/&gt;
 *         &lt;element name="Mobnum" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="UpdkzAdr" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShpPartnerUpdate", propOrder = {
    "vbelnVl",
    "parvw",
    "parnr",
    "updkzPar",
    "adrnr",
    "anred",
    "name1",
    "name2",
    "name3",
    "name4",
    "stras",
    "land1",
    "pstlz",
    "pstl2",
    "pfort",
    "ort01",
    "ort02",
    "regio",
    "cityc",
    "counc",
    "pfach",
    "telf1",
    "telf2",
    "telbx",
    "telfx",
    "teltx",
    "telx1",
    "spras",
    "lzone",
    "hausn",
    "parge",
    "nameList",
    "txjcd",
    "adrnp",
    "addressType",
    "duefl",
    "stock",
    "strs2",
    "strasna",
    "emailAddr",
    "mobnum",
    "updkzAdr"
})
public class ShpPartnerUpdate {

    @XmlElement(name = "VbelnVl", required = true)
    protected String vbelnVl;
    @XmlElement(name = "Parvw", required = true)
    protected String parvw;
    @XmlElement(name = "Parnr", required = true)
    protected String parnr;
    @XmlElement(name = "UpdkzPar", required = true)
    protected String updkzPar;
    @XmlElement(name = "Adrnr", required = true)
    protected String adrnr;
    @XmlElement(name = "Anred", required = true)
    protected String anred;
    @XmlElement(name = "Name1", required = true)
    protected String name1;
    @XmlElement(name = "Name2", required = true)
    protected String name2;
    @XmlElement(name = "Name3", required = true)
    protected String name3;
    @XmlElement(name = "Name4", required = true)
    protected String name4;
    @XmlElement(name = "Stras", required = true)
    protected String stras;
    @XmlElement(name = "Land1", required = true)
    protected String land1;
    @XmlElement(name = "Pstlz", required = true)
    protected String pstlz;
    @XmlElement(name = "Pstl2", required = true)
    protected String pstl2;
    @XmlElement(name = "Pfort", required = true)
    protected String pfort;
    @XmlElement(name = "Ort01", required = true)
    protected String ort01;
    @XmlElement(name = "Ort02", required = true)
    protected String ort02;
    @XmlElement(name = "Regio", required = true)
    protected String regio;
    @XmlElement(name = "Cityc", required = true)
    protected String cityc;
    @XmlElement(name = "Counc", required = true)
    protected String counc;
    @XmlElement(name = "Pfach", required = true)
    protected String pfach;
    @XmlElement(name = "Telf1", required = true)
    protected String telf1;
    @XmlElement(name = "Telf2", required = true)
    protected String telf2;
    @XmlElement(name = "Telbx", required = true)
    protected String telbx;
    @XmlElement(name = "Telfx", required = true)
    protected String telfx;
    @XmlElement(name = "Teltx", required = true)
    protected String teltx;
    @XmlElement(name = "Telx1", required = true)
    protected String telx1;
    @XmlElement(name = "Spras", required = true)
    protected String spras;
    @XmlElement(name = "Lzone", required = true)
    protected String lzone;
    @XmlElement(name = "Hausn", required = true)
    protected String hausn;
    @XmlElement(name = "Parge", required = true)
    protected String parge;
    @XmlElement(name = "NameList", required = true)
    protected String nameList;
    @XmlElement(name = "Txjcd", required = true)
    protected String txjcd;
    @XmlElement(name = "Adrnp", required = true)
    protected String adrnp;
    @XmlElement(name = "AddressType", required = true)
    protected String addressType;
    @XmlElement(name = "Duefl", required = true)
    protected String duefl;
    @XmlElement(name = "Stock", required = true)
    protected String stock;
    @XmlElement(name = "Strs2", required = true)
    protected String strs2;
    @XmlElement(name = "Strasna", required = true)
    protected String strasna;
    @XmlElement(name = "EmailAddr", required = true)
    protected String emailAddr;
    @XmlElement(name = "Mobnum", required = true)
    protected String mobnum;
    @XmlElement(name = "UpdkzAdr", required = true)
    protected String updkzAdr;

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
     * parvw 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParvw() {
        return parvw;
    }

    /**
     * parvw 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParvw(String value) {
        this.parvw = value;
    }

    /**
     * parnr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParnr() {
        return parnr;
    }

    /**
     * parnr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParnr(String value) {
        this.parnr = value;
    }

    /**
     * updkzPar 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdkzPar() {
        return updkzPar;
    }

    /**
     * updkzPar 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdkzPar(String value) {
        this.updkzPar = value;
    }

    /**
     * adrnr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrnr() {
        return adrnr;
    }

    /**
     * adrnr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrnr(String value) {
        this.adrnr = value;
    }

    /**
     * anred 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnred() {
        return anred;
    }

    /**
     * anred 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnred(String value) {
        this.anred = value;
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
     * name2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName2() {
        return name2;
    }

    /**
     * name2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName2(String value) {
        this.name2 = value;
    }

    /**
     * name3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName3() {
        return name3;
    }

    /**
     * name3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName3(String value) {
        this.name3 = value;
    }

    /**
     * name4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName4() {
        return name4;
    }

    /**
     * name4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName4(String value) {
        this.name4 = value;
    }

    /**
     * stras 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStras() {
        return stras;
    }

    /**
     * stras 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStras(String value) {
        this.stras = value;
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
     * pstl2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstl2() {
        return pstl2;
    }

    /**
     * pstl2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstl2(String value) {
        this.pstl2 = value;
    }

    /**
     * pfort 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfort() {
        return pfort;
    }

    /**
     * pfort 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfort(String value) {
        this.pfort = value;
    }

    /**
     * ort01 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrt01() {
        return ort01;
    }

    /**
     * ort01 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrt01(String value) {
        this.ort01 = value;
    }

    /**
     * ort02 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrt02() {
        return ort02;
    }

    /**
     * ort02 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrt02(String value) {
        this.ort02 = value;
    }

    /**
     * regio 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegio() {
        return regio;
    }

    /**
     * regio 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegio(String value) {
        this.regio = value;
    }

    /**
     * cityc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityc() {
        return cityc;
    }

    /**
     * cityc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityc(String value) {
        this.cityc = value;
    }

    /**
     * counc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounc() {
        return counc;
    }

    /**
     * counc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounc(String value) {
        this.counc = value;
    }

    /**
     * pfach 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfach() {
        return pfach;
    }

    /**
     * pfach 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfach(String value) {
        this.pfach = value;
    }

    /**
     * telf1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelf1() {
        return telf1;
    }

    /**
     * telf1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelf1(String value) {
        this.telf1 = value;
    }

    /**
     * telf2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelf2() {
        return telf2;
    }

    /**
     * telf2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelf2(String value) {
        this.telf2 = value;
    }

    /**
     * telbx 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelbx() {
        return telbx;
    }

    /**
     * telbx 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelbx(String value) {
        this.telbx = value;
    }

    /**
     * telfx 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelfx() {
        return telfx;
    }

    /**
     * telfx 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelfx(String value) {
        this.telfx = value;
    }

    /**
     * teltx 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeltx() {
        return teltx;
    }

    /**
     * teltx 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeltx(String value) {
        this.teltx = value;
    }

    /**
     * telx1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelx1() {
        return telx1;
    }

    /**
     * telx1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelx1(String value) {
        this.telx1 = value;
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
     * lzone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLzone() {
        return lzone;
    }

    /**
     * lzone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLzone(String value) {
        this.lzone = value;
    }

    /**
     * hausn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHausn() {
        return hausn;
    }

    /**
     * hausn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHausn(String value) {
        this.hausn = value;
    }

    /**
     * parge 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParge() {
        return parge;
    }

    /**
     * parge 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParge(String value) {
        this.parge = value;
    }

    /**
     * nameList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameList() {
        return nameList;
    }

    /**
     * nameList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameList(String value) {
        this.nameList = value;
    }

    /**
     * txjcd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxjcd() {
        return txjcd;
    }

    /**
     * txjcd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxjcd(String value) {
        this.txjcd = value;
    }

    /**
     * adrnp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrnp() {
        return adrnp;
    }

    /**
     * adrnp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrnp(String value) {
        this.adrnp = value;
    }

    /**
     * addressType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * addressType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressType(String value) {
        this.addressType = value;
    }

    /**
     * duefl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuefl() {
        return duefl;
    }

    /**
     * duefl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuefl(String value) {
        this.duefl = value;
    }

    /**
     * stock 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStock() {
        return stock;
    }

    /**
     * stock 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStock(String value) {
        this.stock = value;
    }

    /**
     * strs2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrs2() {
        return strs2;
    }

    /**
     * strs2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrs2(String value) {
        this.strs2 = value;
    }

    /**
     * strasna 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrasna() {
        return strasna;
    }

    /**
     * strasna 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrasna(String value) {
        this.strasna = value;
    }

    /**
     * emailAddr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddr() {
        return emailAddr;
    }

    /**
     * emailAddr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddr(String value) {
        this.emailAddr = value;
    }

    /**
     * mobnum 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobnum() {
        return mobnum;
    }

    /**
     * mobnum 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobnum(String value) {
        this.mobnum = value;
    }

    /**
     * updkzAdr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdkzAdr() {
        return updkzAdr;
    }

    /**
     * updkzAdr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdkzAdr(String value) {
        this.updkzAdr = value;
    }

}
