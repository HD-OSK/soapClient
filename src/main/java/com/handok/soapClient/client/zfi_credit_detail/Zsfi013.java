//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.06.02 시간 07:11:20 PM KST 
//


package com.handok.soapClient.client.zfi_credit_detail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Zsfi013 complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Zsfi013"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Kunnr" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Name1" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="Kkber" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Currency" type="{urn:sap-com:document:sap:rfc:functions}char5"/&gt;
 *         &lt;element name="Klimk" type="{urn:sap-com:document:sap:rfc:functions}char25"/&gt;
 *         &lt;element name="Skfor" type="{urn:sap-com:document:sap:rfc:functions}char25"/&gt;
 *         &lt;element name="Ssobl" type="{urn:sap-com:document:sap:rfc:functions}char25"/&gt;
 *         &lt;element name="Klprz" type="{urn:sap-com:document:sap:rfc:functions}char8"/&gt;
 *         &lt;element name="OpenDelivery" type="{urn:sap-com:document:sap:rfc:functions}char25"/&gt;
 *         &lt;element name="Oblig" type="{urn:sap-com:document:sap:rfc:functions}char25"/&gt;
 *         &lt;element name="Absbt" type="{urn:sap-com:document:sap:rfc:functions}char25"/&gt;
 *         &lt;element name="Ctlpc" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Crblb" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Sbgrp" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Grupp" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Kdgrp" type="{urn:sap-com:document:sap:rfc:functions}char8"/&gt;
 *         &lt;element name="Sbdat" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Dtrev" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Nxtrv" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Kraus" type="{urn:sap-com:document:sap:rfc:functions}char11"/&gt;
 *         &lt;element name="Dbpay" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Revdb" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Dbrtg" type="{urn:sap-com:document:sap:rfc:functions}char5"/&gt;
 *         &lt;element name="Dbmon" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Dbekr" type="{urn:sap-com:document:sap:rfc:functions}char25"/&gt;
 *         &lt;element name="Zterm" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Zsfi013", propOrder = {
    "kunnr",
    "name1",
    "kkber",
    "currency",
    "klimk",
    "skfor",
    "ssobl",
    "klprz",
    "openDelivery",
    "oblig",
    "absbt",
    "ctlpc",
    "crblb",
    "sbgrp",
    "grupp",
    "kdgrp",
    "sbdat",
    "dtrev",
    "nxtrv",
    "kraus",
    "dbpay",
    "revdb",
    "dbrtg",
    "dbmon",
    "dbekr",
    "zterm"
})
public class Zsfi013 {

    @XmlElement(name = "Kunnr", required = true)
    protected String kunnr;
    @XmlElement(name = "Name1", required = true)
    protected String name1;
    @XmlElement(name = "Kkber", required = true)
    protected String kkber;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "Klimk", required = true)
    protected String klimk;
    @XmlElement(name = "Skfor", required = true)
    protected String skfor;
    @XmlElement(name = "Ssobl", required = true)
    protected String ssobl;
    @XmlElement(name = "Klprz", required = true)
    protected String klprz;
    @XmlElement(name = "OpenDelivery", required = true)
    protected String openDelivery;
    @XmlElement(name = "Oblig", required = true)
    protected String oblig;
    @XmlElement(name = "Absbt", required = true)
    protected String absbt;
    @XmlElement(name = "Ctlpc", required = true)
    protected String ctlpc;
    @XmlElement(name = "Crblb", required = true)
    protected String crblb;
    @XmlElement(name = "Sbgrp", required = true)
    protected String sbgrp;
    @XmlElement(name = "Grupp", required = true)
    protected String grupp;
    @XmlElement(name = "Kdgrp", required = true)
    protected String kdgrp;
    @XmlElement(name = "Sbdat", required = true)
    protected String sbdat;
    @XmlElement(name = "Dtrev", required = true)
    protected String dtrev;
    @XmlElement(name = "Nxtrv", required = true)
    protected String nxtrv;
    @XmlElement(name = "Kraus", required = true)
    protected String kraus;
    @XmlElement(name = "Dbpay", required = true)
    protected String dbpay;
    @XmlElement(name = "Revdb", required = true)
    protected String revdb;
    @XmlElement(name = "Dbrtg", required = true)
    protected String dbrtg;
    @XmlElement(name = "Dbmon", required = true)
    protected String dbmon;
    @XmlElement(name = "Dbekr", required = true)
    protected String dbekr;
    @XmlElement(name = "Zterm", required = true)
    protected String zterm;

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
     * kkber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKkber() {
        return kkber;
    }

    /**
     * kkber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKkber(String value) {
        this.kkber = value;
    }

    /**
     * currency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * currency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * klimk 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKlimk() {
        return klimk;
    }

    /**
     * klimk 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKlimk(String value) {
        this.klimk = value;
    }

    /**
     * skfor 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkfor() {
        return skfor;
    }

    /**
     * skfor 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkfor(String value) {
        this.skfor = value;
    }

    /**
     * ssobl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsobl() {
        return ssobl;
    }

    /**
     * ssobl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsobl(String value) {
        this.ssobl = value;
    }

    /**
     * klprz 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKlprz() {
        return klprz;
    }

    /**
     * klprz 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKlprz(String value) {
        this.klprz = value;
    }

    /**
     * openDelivery 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenDelivery() {
        return openDelivery;
    }

    /**
     * openDelivery 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenDelivery(String value) {
        this.openDelivery = value;
    }

    /**
     * oblig 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOblig() {
        return oblig;
    }

    /**
     * oblig 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOblig(String value) {
        this.oblig = value;
    }

    /**
     * absbt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbsbt() {
        return absbt;
    }

    /**
     * absbt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbsbt(String value) {
        this.absbt = value;
    }

    /**
     * ctlpc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtlpc() {
        return ctlpc;
    }

    /**
     * ctlpc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtlpc(String value) {
        this.ctlpc = value;
    }

    /**
     * crblb 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrblb() {
        return crblb;
    }

    /**
     * crblb 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrblb(String value) {
        this.crblb = value;
    }

    /**
     * sbgrp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSbgrp() {
        return sbgrp;
    }

    /**
     * sbgrp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSbgrp(String value) {
        this.sbgrp = value;
    }

    /**
     * grupp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrupp() {
        return grupp;
    }

    /**
     * grupp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrupp(String value) {
        this.grupp = value;
    }

    /**
     * kdgrp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKdgrp() {
        return kdgrp;
    }

    /**
     * kdgrp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKdgrp(String value) {
        this.kdgrp = value;
    }

    /**
     * sbdat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSbdat() {
        return sbdat;
    }

    /**
     * sbdat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSbdat(String value) {
        this.sbdat = value;
    }

    /**
     * dtrev 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtrev() {
        return dtrev;
    }

    /**
     * dtrev 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtrev(String value) {
        this.dtrev = value;
    }

    /**
     * nxtrv 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNxtrv() {
        return nxtrv;
    }

    /**
     * nxtrv 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNxtrv(String value) {
        this.nxtrv = value;
    }

    /**
     * kraus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKraus() {
        return kraus;
    }

    /**
     * kraus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKraus(String value) {
        this.kraus = value;
    }

    /**
     * dbpay 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbpay() {
        return dbpay;
    }

    /**
     * dbpay 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbpay(String value) {
        this.dbpay = value;
    }

    /**
     * revdb 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevdb() {
        return revdb;
    }

    /**
     * revdb 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevdb(String value) {
        this.revdb = value;
    }

    /**
     * dbrtg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbrtg() {
        return dbrtg;
    }

    /**
     * dbrtg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbrtg(String value) {
        this.dbrtg = value;
    }

    /**
     * dbmon 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbmon() {
        return dbmon;
    }

    /**
     * dbmon 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbmon(String value) {
        this.dbmon = value;
    }

    /**
     * dbekr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbekr() {
        return dbekr;
    }

    /**
     * dbekr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbekr(String value) {
        this.dbekr = value;
    }

    /**
     * zterm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZterm() {
        return zterm;
    }

    /**
     * zterm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZterm(String value) {
        this.zterm = value;
    }

}
