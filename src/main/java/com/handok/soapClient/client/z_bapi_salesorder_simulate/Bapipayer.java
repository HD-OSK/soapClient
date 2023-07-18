//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.06.02 시간 07:11:18 PM KST 
//


package com.handok.soapClient.client.z_bapi_salesorder_simulate;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Bapipayer complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Bapipayer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Payer" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Name" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="Street" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="PoBox" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="PostlCode" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="PobxPcd" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="City" type="{urn:sap-com:document:sap:rfc:functions}char25"/&gt;
 *         &lt;element name="Langu" type="{urn:sap-com:document:sap:rfc:functions}lang"/&gt;
 *         &lt;element name="Country" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Telephone" type="{urn:sap-com:document:sap:rfc:functions}char16"/&gt;
 *         &lt;element name="CCtrArea" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="CredAccnt" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="CredLimit" type="{urn:sap-com:document:sap:rfc:functions}curr15.2"/&gt;
 *         &lt;element name="OrderVals" type="{urn:sap-com:document:sap:rfc:functions}curr15.2"/&gt;
 *         &lt;element name="RcvblVals" type="{urn:sap-com:document:sap:rfc:functions}curr15.2"/&gt;
 *         &lt;element name="CredLiab" type="{urn:sap-com:document:sap:rfc:functions}curr15.2"/&gt;
 *         &lt;element name="Currency" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/&gt;
 *         &lt;element name="MnInvoice" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="BillSched" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="ListSched" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="ValLimit" type="{urn:sap-com:document:sap:rfc:functions}curr13.2"/&gt;
 *         &lt;element name="AccntAsgn" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Pmnttrms" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="AddValDy" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/&gt;
 *         &lt;element name="FixValDy" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="ProdProp" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="BillBlock" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="OrderBlck" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="VatRegNo" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="VatCntry" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="TaxClass1" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TaxClass2" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TaxClass3" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TaxClass4" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TaxClass5" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TaxClass6" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TaxClass7" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TaxClass8" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TaxClass9" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="RebateRel" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="RebateFrm" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="CredGroup" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="ReprGroup" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="RiskCateg" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="TradeId" type="{urn:sap-com:document:sap:rfc:functions}char6"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bapipayer", propOrder = {
    "payer",
    "name",
    "street",
    "poBox",
    "postlCode",
    "pobxPcd",
    "city",
    "langu",
    "country",
    "telephone",
    "cCtrArea",
    "credAccnt",
    "credLimit",
    "orderVals",
    "rcvblVals",
    "credLiab",
    "currency",
    "mnInvoice",
    "billSched",
    "listSched",
    "valLimit",
    "accntAsgn",
    "pmnttrms",
    "addValDy",
    "fixValDy",
    "prodProp",
    "billBlock",
    "orderBlck",
    "vatRegNo",
    "vatCntry",
    "taxClass1",
    "taxClass2",
    "taxClass3",
    "taxClass4",
    "taxClass5",
    "taxClass6",
    "taxClass7",
    "taxClass8",
    "taxClass9",
    "rebateRel",
    "rebateFrm",
    "credGroup",
    "reprGroup",
    "riskCateg",
    "tradeId"
})
public class Bapipayer {

    @XmlElement(name = "Payer", required = true)
    protected String payer;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Street", required = true)
    protected String street;
    @XmlElement(name = "PoBox", required = true)
    protected String poBox;
    @XmlElement(name = "PostlCode", required = true)
    protected String postlCode;
    @XmlElement(name = "PobxPcd", required = true)
    protected String pobxPcd;
    @XmlElement(name = "City", required = true)
    protected String city;
    @XmlElement(name = "Langu", required = true)
    protected String langu;
    @XmlElement(name = "Country", required = true)
    protected String country;
    @XmlElement(name = "Telephone", required = true)
    protected String telephone;
    @XmlElement(name = "CCtrArea", required = true)
    protected String cCtrArea;
    @XmlElement(name = "CredAccnt", required = true)
    protected String credAccnt;
    @XmlElement(name = "CredLimit", required = true)
    protected BigDecimal credLimit;
    @XmlElement(name = "OrderVals", required = true)
    protected BigDecimal orderVals;
    @XmlElement(name = "RcvblVals", required = true)
    protected BigDecimal rcvblVals;
    @XmlElement(name = "CredLiab", required = true)
    protected BigDecimal credLiab;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "MnInvoice", required = true)
    protected String mnInvoice;
    @XmlElement(name = "BillSched", required = true)
    protected String billSched;
    @XmlElement(name = "ListSched", required = true)
    protected String listSched;
    @XmlElement(name = "ValLimit", required = true)
    protected BigDecimal valLimit;
    @XmlElement(name = "AccntAsgn", required = true)
    protected String accntAsgn;
    @XmlElement(name = "Pmnttrms", required = true)
    protected String pmnttrms;
    @XmlElement(name = "AddValDy", required = true)
    protected String addValDy;
    @XmlElement(name = "FixValDy", required = true)
    protected String fixValDy;
    @XmlElement(name = "ProdProp", required = true)
    protected String prodProp;
    @XmlElement(name = "BillBlock", required = true)
    protected String billBlock;
    @XmlElement(name = "OrderBlck", required = true)
    protected String orderBlck;
    @XmlElement(name = "VatRegNo", required = true)
    protected String vatRegNo;
    @XmlElement(name = "VatCntry", required = true)
    protected String vatCntry;
    @XmlElement(name = "TaxClass1", required = true)
    protected String taxClass1;
    @XmlElement(name = "TaxClass2", required = true)
    protected String taxClass2;
    @XmlElement(name = "TaxClass3", required = true)
    protected String taxClass3;
    @XmlElement(name = "TaxClass4", required = true)
    protected String taxClass4;
    @XmlElement(name = "TaxClass5", required = true)
    protected String taxClass5;
    @XmlElement(name = "TaxClass6", required = true)
    protected String taxClass6;
    @XmlElement(name = "TaxClass7", required = true)
    protected String taxClass7;
    @XmlElement(name = "TaxClass8", required = true)
    protected String taxClass8;
    @XmlElement(name = "TaxClass9", required = true)
    protected String taxClass9;
    @XmlElement(name = "RebateRel", required = true)
    protected String rebateRel;
    @XmlElement(name = "RebateFrm", required = true)
    protected String rebateFrm;
    @XmlElement(name = "CredGroup", required = true)
    protected String credGroup;
    @XmlElement(name = "ReprGroup", required = true)
    protected String reprGroup;
    @XmlElement(name = "RiskCateg", required = true)
    protected String riskCateg;
    @XmlElement(name = "TradeId", required = true)
    protected String tradeId;

    /**
     * payer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayer() {
        return payer;
    }

    /**
     * payer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayer(String value) {
        this.payer = value;
    }

    /**
     * name 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * name 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * poBox 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoBox() {
        return poBox;
    }

    /**
     * poBox 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoBox(String value) {
        this.poBox = value;
    }

    /**
     * postlCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostlCode() {
        return postlCode;
    }

    /**
     * postlCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostlCode(String value) {
        this.postlCode = value;
    }

    /**
     * pobxPcd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPobxPcd() {
        return pobxPcd;
    }

    /**
     * pobxPcd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPobxPcd(String value) {
        this.pobxPcd = value;
    }

    /**
     * city 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * city 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * langu 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangu() {
        return langu;
    }

    /**
     * langu 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangu(String value) {
        this.langu = value;
    }

    /**
     * country 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * country 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * telephone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * telephone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
    }

    /**
     * cCtrArea 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCtrArea() {
        return cCtrArea;
    }

    /**
     * cCtrArea 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCtrArea(String value) {
        this.cCtrArea = value;
    }

    /**
     * credAccnt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredAccnt() {
        return credAccnt;
    }

    /**
     * credAccnt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredAccnt(String value) {
        this.credAccnt = value;
    }

    /**
     * credLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCredLimit() {
        return credLimit;
    }

    /**
     * credLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCredLimit(BigDecimal value) {
        this.credLimit = value;
    }

    /**
     * orderVals 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrderVals() {
        return orderVals;
    }

    /**
     * orderVals 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrderVals(BigDecimal value) {
        this.orderVals = value;
    }

    /**
     * rcvblVals 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRcvblVals() {
        return rcvblVals;
    }

    /**
     * rcvblVals 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRcvblVals(BigDecimal value) {
        this.rcvblVals = value;
    }

    /**
     * credLiab 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCredLiab() {
        return credLiab;
    }

    /**
     * credLiab 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCredLiab(BigDecimal value) {
        this.credLiab = value;
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
     * mnInvoice 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMnInvoice() {
        return mnInvoice;
    }

    /**
     * mnInvoice 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMnInvoice(String value) {
        this.mnInvoice = value;
    }

    /**
     * billSched 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillSched() {
        return billSched;
    }

    /**
     * billSched 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillSched(String value) {
        this.billSched = value;
    }

    /**
     * listSched 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListSched() {
        return listSched;
    }

    /**
     * listSched 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListSched(String value) {
        this.listSched = value;
    }

    /**
     * valLimit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValLimit() {
        return valLimit;
    }

    /**
     * valLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValLimit(BigDecimal value) {
        this.valLimit = value;
    }

    /**
     * accntAsgn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccntAsgn() {
        return accntAsgn;
    }

    /**
     * accntAsgn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccntAsgn(String value) {
        this.accntAsgn = value;
    }

    /**
     * pmnttrms 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmnttrms() {
        return pmnttrms;
    }

    /**
     * pmnttrms 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmnttrms(String value) {
        this.pmnttrms = value;
    }

    /**
     * addValDy 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddValDy() {
        return addValDy;
    }

    /**
     * addValDy 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddValDy(String value) {
        this.addValDy = value;
    }

    /**
     * fixValDy 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixValDy() {
        return fixValDy;
    }

    /**
     * fixValDy 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixValDy(String value) {
        this.fixValDy = value;
    }

    /**
     * prodProp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdProp() {
        return prodProp;
    }

    /**
     * prodProp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdProp(String value) {
        this.prodProp = value;
    }

    /**
     * billBlock 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillBlock() {
        return billBlock;
    }

    /**
     * billBlock 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillBlock(String value) {
        this.billBlock = value;
    }

    /**
     * orderBlck 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderBlck() {
        return orderBlck;
    }

    /**
     * orderBlck 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderBlck(String value) {
        this.orderBlck = value;
    }

    /**
     * vatRegNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatRegNo() {
        return vatRegNo;
    }

    /**
     * vatRegNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatRegNo(String value) {
        this.vatRegNo = value;
    }

    /**
     * vatCntry 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatCntry() {
        return vatCntry;
    }

    /**
     * vatCntry 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatCntry(String value) {
        this.vatCntry = value;
    }

    /**
     * taxClass1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxClass1() {
        return taxClass1;
    }

    /**
     * taxClass1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxClass1(String value) {
        this.taxClass1 = value;
    }

    /**
     * taxClass2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxClass2() {
        return taxClass2;
    }

    /**
     * taxClass2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxClass2(String value) {
        this.taxClass2 = value;
    }

    /**
     * taxClass3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxClass3() {
        return taxClass3;
    }

    /**
     * taxClass3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxClass3(String value) {
        this.taxClass3 = value;
    }

    /**
     * taxClass4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxClass4() {
        return taxClass4;
    }

    /**
     * taxClass4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxClass4(String value) {
        this.taxClass4 = value;
    }

    /**
     * taxClass5 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxClass5() {
        return taxClass5;
    }

    /**
     * taxClass5 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxClass5(String value) {
        this.taxClass5 = value;
    }

    /**
     * taxClass6 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxClass6() {
        return taxClass6;
    }

    /**
     * taxClass6 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxClass6(String value) {
        this.taxClass6 = value;
    }

    /**
     * taxClass7 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxClass7() {
        return taxClass7;
    }

    /**
     * taxClass7 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxClass7(String value) {
        this.taxClass7 = value;
    }

    /**
     * taxClass8 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxClass8() {
        return taxClass8;
    }

    /**
     * taxClass8 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxClass8(String value) {
        this.taxClass8 = value;
    }

    /**
     * taxClass9 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxClass9() {
        return taxClass9;
    }

    /**
     * taxClass9 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxClass9(String value) {
        this.taxClass9 = value;
    }

    /**
     * rebateRel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRebateRel() {
        return rebateRel;
    }

    /**
     * rebateRel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRebateRel(String value) {
        this.rebateRel = value;
    }

    /**
     * rebateFrm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRebateFrm() {
        return rebateFrm;
    }

    /**
     * rebateFrm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRebateFrm(String value) {
        this.rebateFrm = value;
    }

    /**
     * credGroup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredGroup() {
        return credGroup;
    }

    /**
     * credGroup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredGroup(String value) {
        this.credGroup = value;
    }

    /**
     * reprGroup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReprGroup() {
        return reprGroup;
    }

    /**
     * reprGroup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReprGroup(String value) {
        this.reprGroup = value;
    }

    /**
     * riskCateg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskCateg() {
        return riskCateg;
    }

    /**
     * riskCateg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskCateg(String value) {
        this.riskCateg = value;
    }

    /**
     * tradeId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeId() {
        return tradeId;
    }

    /**
     * tradeId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeId(String value) {
        this.tradeId = value;
    }

}
