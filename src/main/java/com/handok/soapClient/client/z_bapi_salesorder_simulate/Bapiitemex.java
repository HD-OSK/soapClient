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
 * <p>Bapiitemex complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Bapiitemex"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItmNumber" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="PoItmNo" type="{urn:sap-com:document:sap:rfc:functions}char6"/&gt;
 *         &lt;element name="Material" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="MatEntrd" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="ShortText" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="NetValue" type="{urn:sap-com:document:sap:rfc:functions}numeric15"/&gt;
 *         &lt;element name="Currency" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/&gt;
 *         &lt;element name="Subtotal1" type="{urn:sap-com:document:sap:rfc:functions}numeric15"/&gt;
 *         &lt;element name="Subtotal2" type="{urn:sap-com:document:sap:rfc:functions}numeric15"/&gt;
 *         &lt;element name="Subtotal3" type="{urn:sap-com:document:sap:rfc:functions}numeric15"/&gt;
 *         &lt;element name="Subtotal4" type="{urn:sap-com:document:sap:rfc:functions}numeric15"/&gt;
 *         &lt;element name="Subtotal5" type="{urn:sap-com:document:sap:rfc:functions}numeric15"/&gt;
 *         &lt;element name="Subtotal6" type="{urn:sap-com:document:sap:rfc:functions}numeric15"/&gt;
 *         &lt;element name="SalesUnit" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="QtyReqDt" type="{urn:sap-com:document:sap:rfc:functions}numeric13"/&gt;
 *         &lt;element name="DlvDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="ReplTime" type="{urn:sap-com:document:sap:rfc:functions}numeric3"/&gt;
 *         &lt;element name="Configured" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="PurchNoC" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="PurchDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="PoMethod" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Ref1" type="{urn:sap-com:document:sap:rfc:functions}char12"/&gt;
 *         &lt;element name="PurchNoS" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="PoDatS" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="PoMethS" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Ref1S" type="{urn:sap-com:document:sap:rfc:functions}char12"/&gt;
 *         &lt;element name="PoItmNoS" type="{urn:sap-com:document:sap:rfc:functions}char6"/&gt;
 *         &lt;element name="NetValue1" type="{urn:sap-com:document:sap:rfc:functions}decimal23.4"/&gt;
 *         &lt;element name="CurrIso" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="SUnitIso" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="ReqQty" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/&gt;
 *         &lt;element name="Plant" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="TxDocCur" type="{urn:sap-com:document:sap:rfc:functions}decimal23.4"/&gt;
 *         &lt;element name="MatExt" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="MatGuid" type="{urn:sap-com:document:sap:rfc:functions}char32"/&gt;
 *         &lt;element name="MatVers" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="MatEExt" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="MatEGuid" type="{urn:sap-com:document:sap:rfc:functions}char32"/&gt;
 *         &lt;element name="MatEVers" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="TargetQty" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="TargetQu" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="TUnitIso" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="ItemCateg" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="ShipPoint" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="HgLvItem" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="CustMat" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="PartDlv" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ReasonRej" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="BillBlock" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="StgeLoc" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="ProdHier" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="MatlGroup" type="{urn:sap-com:document:sap:rfc:functions}char9"/&gt;
 *         &lt;element name="TSUBTOTAL1" type="{urn:sap-com:document:sap:rfc:functions}decimal23.4"/&gt;
 *         &lt;element name="TSUBTOTAL2" type="{urn:sap-com:document:sap:rfc:functions}decimal23.4"/&gt;
 *         &lt;element name="TSUBTOTAL3" type="{urn:sap-com:document:sap:rfc:functions}decimal23.4"/&gt;
 *         &lt;element name="TSUBTOTAL4" type="{urn:sap-com:document:sap:rfc:functions}decimal23.4"/&gt;
 *         &lt;element name="TSUBTOTAL5" type="{urn:sap-com:document:sap:rfc:functions}decimal23.4"/&gt;
 *         &lt;element name="TSUBTOTAL6" type="{urn:sap-com:document:sap:rfc:functions}decimal23.4"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bapiitemex", propOrder = {
    "itmNumber",
    "poItmNo",
    "material",
    "matEntrd",
    "shortText",
    "netValue",
    "currency",
    "subtotal1",
    "subtotal2",
    "subtotal3",
    "subtotal4",
    "subtotal5",
    "subtotal6",
    "salesUnit",
    "qtyReqDt",
    "dlvDate",
    "replTime",
    "configured",
    "purchNoC",
    "purchDate",
    "poMethod",
    "ref1",
    "purchNoS",
    "poDatS",
    "poMethS",
    "ref1S",
    "poItmNoS",
    "netValue1",
    "currIso",
    "sUnitIso",
    "reqQty",
    "plant",
    "txDocCur",
    "matExt",
    "matGuid",
    "matVers",
    "matEExt",
    "matEGuid",
    "matEVers",
    "targetQty",
    "targetQu",
    "tUnitIso",
    "itemCateg",
    "shipPoint",
    "hgLvItem",
    "custMat",
    "partDlv",
    "reasonRej",
    "billBlock",
    "stgeLoc",
    "prodHier",
    "matlGroup",
    "tsubtotal1",
    "tsubtotal2",
    "tsubtotal3",
    "tsubtotal4",
    "tsubtotal5",
    "tsubtotal6"
})
public class Bapiitemex {

    @XmlElement(name = "ItmNumber", required = true)
    protected String itmNumber;
    @XmlElement(name = "PoItmNo", required = true)
    protected String poItmNo;
    @XmlElement(name = "Material", required = true)
    protected String material;
    @XmlElement(name = "MatEntrd", required = true)
    protected String matEntrd;
    @XmlElement(name = "ShortText", required = true)
    protected String shortText;
    @XmlElement(name = "NetValue", required = true)
    protected String netValue;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "Subtotal1", required = true)
    protected String subtotal1;
    @XmlElement(name = "Subtotal2", required = true)
    protected String subtotal2;
    @XmlElement(name = "Subtotal3", required = true)
    protected String subtotal3;
    @XmlElement(name = "Subtotal4", required = true)
    protected String subtotal4;
    @XmlElement(name = "Subtotal5", required = true)
    protected String subtotal5;
    @XmlElement(name = "Subtotal6", required = true)
    protected String subtotal6;
    @XmlElement(name = "SalesUnit", required = true)
    protected String salesUnit;
    @XmlElement(name = "QtyReqDt", required = true)
    protected String qtyReqDt;
    @XmlElement(name = "DlvDate", required = true)
    protected String dlvDate;
    @XmlElement(name = "ReplTime", required = true)
    protected String replTime;
    @XmlElement(name = "Configured", required = true)
    protected String configured;
    @XmlElement(name = "PurchNoC", required = true)
    protected String purchNoC;
    @XmlElement(name = "PurchDate", required = true)
    protected String purchDate;
    @XmlElement(name = "PoMethod", required = true)
    protected String poMethod;
    @XmlElement(name = "Ref1", required = true)
    protected String ref1;
    @XmlElement(name = "PurchNoS", required = true)
    protected String purchNoS;
    @XmlElement(name = "PoDatS", required = true)
    protected String poDatS;
    @XmlElement(name = "PoMethS", required = true)
    protected String poMethS;
    @XmlElement(name = "Ref1S", required = true)
    protected String ref1S;
    @XmlElement(name = "PoItmNoS", required = true)
    protected String poItmNoS;
    @XmlElement(name = "NetValue1", required = true)
    protected BigDecimal netValue1;
    @XmlElement(name = "CurrIso", required = true)
    protected String currIso;
    @XmlElement(name = "SUnitIso", required = true)
    protected String sUnitIso;
    @XmlElement(name = "ReqQty", required = true)
    protected BigDecimal reqQty;
    @XmlElement(name = "Plant", required = true)
    protected String plant;
    @XmlElement(name = "TxDocCur", required = true)
    protected BigDecimal txDocCur;
    @XmlElement(name = "MatExt", required = true)
    protected String matExt;
    @XmlElement(name = "MatGuid", required = true)
    protected String matGuid;
    @XmlElement(name = "MatVers", required = true)
    protected String matVers;
    @XmlElement(name = "MatEExt", required = true)
    protected String matEExt;
    @XmlElement(name = "MatEGuid", required = true)
    protected String matEGuid;
    @XmlElement(name = "MatEVers", required = true)
    protected String matEVers;
    @XmlElement(name = "TargetQty", required = true)
    protected BigDecimal targetQty;
    @XmlElement(name = "TargetQu", required = true)
    protected String targetQu;
    @XmlElement(name = "TUnitIso", required = true)
    protected String tUnitIso;
    @XmlElement(name = "ItemCateg", required = true)
    protected String itemCateg;
    @XmlElement(name = "ShipPoint", required = true)
    protected String shipPoint;
    @XmlElement(name = "HgLvItem", required = true)
    protected String hgLvItem;
    @XmlElement(name = "CustMat", required = true)
    protected String custMat;
    @XmlElement(name = "PartDlv", required = true)
    protected String partDlv;
    @XmlElement(name = "ReasonRej", required = true)
    protected String reasonRej;
    @XmlElement(name = "BillBlock", required = true)
    protected String billBlock;
    @XmlElement(name = "StgeLoc", required = true)
    protected String stgeLoc;
    @XmlElement(name = "ProdHier", required = true)
    protected String prodHier;
    @XmlElement(name = "MatlGroup", required = true)
    protected String matlGroup;
    @XmlElement(name = "TSUBTOTAL1", required = true)
    protected BigDecimal tsubtotal1;
    @XmlElement(name = "TSUBTOTAL2", required = true)
    protected BigDecimal tsubtotal2;
    @XmlElement(name = "TSUBTOTAL3", required = true)
    protected BigDecimal tsubtotal3;
    @XmlElement(name = "TSUBTOTAL4", required = true)
    protected BigDecimal tsubtotal4;
    @XmlElement(name = "TSUBTOTAL5", required = true)
    protected BigDecimal tsubtotal5;
    @XmlElement(name = "TSUBTOTAL6", required = true)
    protected BigDecimal tsubtotal6;

    /**
     * itmNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItmNumber() {
        return itmNumber;
    }

    /**
     * itmNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItmNumber(String value) {
        this.itmNumber = value;
    }

    /**
     * poItmNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoItmNo() {
        return poItmNo;
    }

    /**
     * poItmNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoItmNo(String value) {
        this.poItmNo = value;
    }

    /**
     * material 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterial() {
        return material;
    }

    /**
     * material 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterial(String value) {
        this.material = value;
    }

    /**
     * matEntrd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatEntrd() {
        return matEntrd;
    }

    /**
     * matEntrd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatEntrd(String value) {
        this.matEntrd = value;
    }

    /**
     * shortText 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortText() {
        return shortText;
    }

    /**
     * shortText 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortText(String value) {
        this.shortText = value;
    }

    /**
     * netValue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetValue() {
        return netValue;
    }

    /**
     * netValue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetValue(String value) {
        this.netValue = value;
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
     * subtotal1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtotal1() {
        return subtotal1;
    }

    /**
     * subtotal1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtotal1(String value) {
        this.subtotal1 = value;
    }

    /**
     * subtotal2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtotal2() {
        return subtotal2;
    }

    /**
     * subtotal2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtotal2(String value) {
        this.subtotal2 = value;
    }

    /**
     * subtotal3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtotal3() {
        return subtotal3;
    }

    /**
     * subtotal3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtotal3(String value) {
        this.subtotal3 = value;
    }

    /**
     * subtotal4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtotal4() {
        return subtotal4;
    }

    /**
     * subtotal4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtotal4(String value) {
        this.subtotal4 = value;
    }

    /**
     * subtotal5 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtotal5() {
        return subtotal5;
    }

    /**
     * subtotal5 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtotal5(String value) {
        this.subtotal5 = value;
    }

    /**
     * subtotal6 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtotal6() {
        return subtotal6;
    }

    /**
     * subtotal6 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtotal6(String value) {
        this.subtotal6 = value;
    }

    /**
     * salesUnit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesUnit() {
        return salesUnit;
    }

    /**
     * salesUnit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesUnit(String value) {
        this.salesUnit = value;
    }

    /**
     * qtyReqDt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtyReqDt() {
        return qtyReqDt;
    }

    /**
     * qtyReqDt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtyReqDt(String value) {
        this.qtyReqDt = value;
    }

    /**
     * dlvDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvDate() {
        return dlvDate;
    }

    /**
     * dlvDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlvDate(String value) {
        this.dlvDate = value;
    }

    /**
     * replTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplTime() {
        return replTime;
    }

    /**
     * replTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplTime(String value) {
        this.replTime = value;
    }

    /**
     * configured 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigured() {
        return configured;
    }

    /**
     * configured 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigured(String value) {
        this.configured = value;
    }

    /**
     * purchNoC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchNoC() {
        return purchNoC;
    }

    /**
     * purchNoC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchNoC(String value) {
        this.purchNoC = value;
    }

    /**
     * purchDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchDate() {
        return purchDate;
    }

    /**
     * purchDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchDate(String value) {
        this.purchDate = value;
    }

    /**
     * poMethod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoMethod() {
        return poMethod;
    }

    /**
     * poMethod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoMethod(String value) {
        this.poMethod = value;
    }

    /**
     * ref1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef1() {
        return ref1;
    }

    /**
     * ref1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef1(String value) {
        this.ref1 = value;
    }

    /**
     * purchNoS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchNoS() {
        return purchNoS;
    }

    /**
     * purchNoS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchNoS(String value) {
        this.purchNoS = value;
    }

    /**
     * poDatS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoDatS() {
        return poDatS;
    }

    /**
     * poDatS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoDatS(String value) {
        this.poDatS = value;
    }

    /**
     * poMethS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoMethS() {
        return poMethS;
    }

    /**
     * poMethS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoMethS(String value) {
        this.poMethS = value;
    }

    /**
     * ref1S 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef1S() {
        return ref1S;
    }

    /**
     * ref1S 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef1S(String value) {
        this.ref1S = value;
    }

    /**
     * poItmNoS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoItmNoS() {
        return poItmNoS;
    }

    /**
     * poItmNoS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoItmNoS(String value) {
        this.poItmNoS = value;
    }

    /**
     * netValue1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetValue1() {
        return netValue1;
    }

    /**
     * netValue1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetValue1(BigDecimal value) {
        this.netValue1 = value;
    }

    /**
     * currIso 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrIso() {
        return currIso;
    }

    /**
     * currIso 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrIso(String value) {
        this.currIso = value;
    }

    /**
     * sUnitIso 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUnitIso() {
        return sUnitIso;
    }

    /**
     * sUnitIso 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUnitIso(String value) {
        this.sUnitIso = value;
    }

    /**
     * reqQty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReqQty() {
        return reqQty;
    }

    /**
     * reqQty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReqQty(BigDecimal value) {
        this.reqQty = value;
    }

    /**
     * plant 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlant() {
        return plant;
    }

    /**
     * plant 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlant(String value) {
        this.plant = value;
    }

    /**
     * txDocCur 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTxDocCur() {
        return txDocCur;
    }

    /**
     * txDocCur 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTxDocCur(BigDecimal value) {
        this.txDocCur = value;
    }

    /**
     * matExt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatExt() {
        return matExt;
    }

    /**
     * matExt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatExt(String value) {
        this.matExt = value;
    }

    /**
     * matGuid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatGuid() {
        return matGuid;
    }

    /**
     * matGuid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatGuid(String value) {
        this.matGuid = value;
    }

    /**
     * matVers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatVers() {
        return matVers;
    }

    /**
     * matVers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatVers(String value) {
        this.matVers = value;
    }

    /**
     * matEExt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatEExt() {
        return matEExt;
    }

    /**
     * matEExt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatEExt(String value) {
        this.matEExt = value;
    }

    /**
     * matEGuid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatEGuid() {
        return matEGuid;
    }

    /**
     * matEGuid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatEGuid(String value) {
        this.matEGuid = value;
    }

    /**
     * matEVers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatEVers() {
        return matEVers;
    }

    /**
     * matEVers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatEVers(String value) {
        this.matEVers = value;
    }

    /**
     * targetQty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTargetQty() {
        return targetQty;
    }

    /**
     * targetQty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTargetQty(BigDecimal value) {
        this.targetQty = value;
    }

    /**
     * targetQu 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetQu() {
        return targetQu;
    }

    /**
     * targetQu 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetQu(String value) {
        this.targetQu = value;
    }

    /**
     * tUnitIso 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTUnitIso() {
        return tUnitIso;
    }

    /**
     * tUnitIso 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTUnitIso(String value) {
        this.tUnitIso = value;
    }

    /**
     * itemCateg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCateg() {
        return itemCateg;
    }

    /**
     * itemCateg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCateg(String value) {
        this.itemCateg = value;
    }

    /**
     * shipPoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipPoint() {
        return shipPoint;
    }

    /**
     * shipPoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipPoint(String value) {
        this.shipPoint = value;
    }

    /**
     * hgLvItem 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHgLvItem() {
        return hgLvItem;
    }

    /**
     * hgLvItem 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHgLvItem(String value) {
        this.hgLvItem = value;
    }

    /**
     * custMat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustMat() {
        return custMat;
    }

    /**
     * custMat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustMat(String value) {
        this.custMat = value;
    }

    /**
     * partDlv 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartDlv() {
        return partDlv;
    }

    /**
     * partDlv 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartDlv(String value) {
        this.partDlv = value;
    }

    /**
     * reasonRej 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonRej() {
        return reasonRej;
    }

    /**
     * reasonRej 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonRej(String value) {
        this.reasonRej = value;
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
     * stgeLoc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStgeLoc() {
        return stgeLoc;
    }

    /**
     * stgeLoc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStgeLoc(String value) {
        this.stgeLoc = value;
    }

    /**
     * prodHier 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdHier() {
        return prodHier;
    }

    /**
     * prodHier 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdHier(String value) {
        this.prodHier = value;
    }

    /**
     * matlGroup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatlGroup() {
        return matlGroup;
    }

    /**
     * matlGroup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatlGroup(String value) {
        this.matlGroup = value;
    }

    /**
     * tsubtotal1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTSUBTOTAL1() {
        return tsubtotal1;
    }

    /**
     * tsubtotal1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTSUBTOTAL1(BigDecimal value) {
        this.tsubtotal1 = value;
    }

    /**
     * tsubtotal2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTSUBTOTAL2() {
        return tsubtotal2;
    }

    /**
     * tsubtotal2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTSUBTOTAL2(BigDecimal value) {
        this.tsubtotal2 = value;
    }

    /**
     * tsubtotal3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTSUBTOTAL3() {
        return tsubtotal3;
    }

    /**
     * tsubtotal3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTSUBTOTAL3(BigDecimal value) {
        this.tsubtotal3 = value;
    }

    /**
     * tsubtotal4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTSUBTOTAL4() {
        return tsubtotal4;
    }

    /**
     * tsubtotal4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTSUBTOTAL4(BigDecimal value) {
        this.tsubtotal4 = value;
    }

    /**
     * tsubtotal5 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTSUBTOTAL5() {
        return tsubtotal5;
    }

    /**
     * tsubtotal5 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTSUBTOTAL5(BigDecimal value) {
        this.tsubtotal5 = value;
    }

    /**
     * tsubtotal6 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTSUBTOTAL6() {
        return tsubtotal6;
    }

    /**
     * tsubtotal6 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTSUBTOTAL6(BigDecimal value) {
        this.tsubtotal6 = value;
    }

}
