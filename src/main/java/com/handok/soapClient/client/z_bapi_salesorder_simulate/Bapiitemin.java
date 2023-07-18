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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Bapiitemin complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Bapiitemin"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItmNumber" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="HgLvItem" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="PoItmNo" type="{urn:sap-com:document:sap:rfc:functions}char6"/&gt;
 *         &lt;element name="Material" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="CustMat" type="{urn:sap-com:document:sap:rfc:functions}char22"/&gt;
 *         &lt;element name="Batch" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="DlvGroup" type="{urn:sap-com:document:sap:rfc:functions}numeric3"/&gt;
 *         &lt;element name="PartDlv" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ReasonRej" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="BillBlock" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="BillDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Plant" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="StoreLoc" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="TargetQty" type="{urn:sap-com:document:sap:rfc:functions}numeric13"/&gt;
 *         &lt;element name="TargetQu" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="ReqQty" type="{urn:sap-com:document:sap:rfc:functions}numeric13"/&gt;
 *         &lt;element name="SalesUnit" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="ItemCateg" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="ShortText" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="ReqDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="DateType" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ReqTime" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="CondType" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="CondValue" type="{urn:sap-com:document:sap:rfc:functions}curr11.2"/&gt;
 *         &lt;element name="CondPUnt" type="{urn:sap-com:document:sap:rfc:functions}numeric5"/&gt;
 *         &lt;element name="CondDUnt" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="PrcGroup1" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="PrcGroup2" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="PrcGroup3" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="PrcGroup4" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="PrcGroup5" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="ProdHiera" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="MatlGroup" type="{urn:sap-com:document:sap:rfc:functions}char9"/&gt;
 *         &lt;element name="PurchNoC" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="PurchDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="PoMethod" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Ref1" type="{urn:sap-com:document:sap:rfc:functions}char12"/&gt;
 *         &lt;element name="PurchNoS" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="PoDatS" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="PoMethS" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Ref1S" type="{urn:sap-com:document:sap:rfc:functions}char12"/&gt;
 *         &lt;element name="PoItmNoS" type="{urn:sap-com:document:sap:rfc:functions}char6"/&gt;
 *         &lt;element name="CondVal1" type="{urn:sap-com:document:sap:rfc:functions}decimal23.4"/&gt;
 *         &lt;element name="Currency" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/&gt;
 *         &lt;element name="CurrIso" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="TUnitIso" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="SUnitIso" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="CdUntIso" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="CustMat35" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="Incoterms1" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Incoterms2" type="{urn:sap-com:document:sap:rfc:functions}char28"/&gt;
 *         &lt;element name="DlvTime" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="AssortMod" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="ValContr" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="ValConI" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="RefDoc" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="RefDocIt" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="RefDocCa" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="CdType2" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="CdValue2" type="{urn:sap-com:document:sap:rfc:functions}decimal23.4"/&gt;
 *         &lt;element name="CdPUnt2" type="{urn:sap-com:document:sap:rfc:functions}numeric5"/&gt;
 *         &lt;element name="CdDUnt2" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="CdDUiso2" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="CdCurr2" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/&gt;
 *         &lt;element name="CdCuIso2" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="CdType3" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="CdValue3" type="{urn:sap-com:document:sap:rfc:functions}decimal23.4"/&gt;
 *         &lt;element name="CdPUnt3" type="{urn:sap-com:document:sap:rfc:functions}numeric5"/&gt;
 *         &lt;element name="CdDUnt3" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="CdDUiso3" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="CdCurr3" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/&gt;
 *         &lt;element name="CdCuIso3" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="CdType4" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="CdValue4" type="{urn:sap-com:document:sap:rfc:functions}decimal23.4"/&gt;
 *         &lt;element name="CdPUnt4" type="{urn:sap-com:document:sap:rfc:functions}numeric5"/&gt;
 *         &lt;element name="CdDUnt4" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="CdDUiso4" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="CdCurr4" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/&gt;
 *         &lt;element name="CdCuIso4" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="MatExt" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="MatGuid" type="{urn:sap-com:document:sap:rfc:functions}char32"/&gt;
 *         &lt;element name="MatVers" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="AlternBom" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="FkkConacct" type="{urn:sap-com:document:sap:rfc:functions}char12"/&gt;
 *         &lt;element name="EanUpc" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="ShipPoint" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Prodcat" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bapiitemin", propOrder = {
    "itmNumber",
    "hgLvItem",
    "poItmNo",
    "material",
    "custMat",
    "batch",
    "dlvGroup",
    "partDlv",
    "reasonRej",
    "billBlock",
    "billDate",
    "plant",
    "storeLoc",
    "targetQty",
    "targetQu",
    "reqQty",
    "salesUnit",
    "itemCateg",
    "shortText",
    "reqDate",
    "dateType",
    "reqTime",
    "condType",
    "condValue",
    "condPUnt",
    "condDUnt",
    "prcGroup1",
    "prcGroup2",
    "prcGroup3",
    "prcGroup4",
    "prcGroup5",
    "prodHiera",
    "matlGroup",
    "purchNoC",
    "purchDate",
    "poMethod",
    "ref1",
    "purchNoS",
    "poDatS",
    "poMethS",
    "ref1S",
    "poItmNoS",
    "condVal1",
    "currency",
    "currIso",
    "tUnitIso",
    "sUnitIso",
    "cdUntIso",
    "custMat35",
    "incoterms1",
    "incoterms2",
    "dlvTime",
    "assortMod",
    "valContr",
    "valConI",
    "refDoc",
    "refDocIt",
    "refDocCa",
    "cdType2",
    "cdValue2",
    "cdPUnt2",
    "cdDUnt2",
    "cdDUiso2",
    "cdCurr2",
    "cdCuIso2",
    "cdType3",
    "cdValue3",
    "cdPUnt3",
    "cdDUnt3",
    "cdDUiso3",
    "cdCurr3",
    "cdCuIso3",
    "cdType4",
    "cdValue4",
    "cdPUnt4",
    "cdDUnt4",
    "cdDUiso4",
    "cdCurr4",
    "cdCuIso4",
    "matExt",
    "matGuid",
    "matVers",
    "alternBom",
    "fkkConacct",
    "eanUpc",
    "shipPoint",
    "prodcat"
})
public class Bapiitemin {

    @XmlElement(name = "ItmNumber", required = true)
    protected String itmNumber;
    @XmlElement(name = "HgLvItem", required = true)
    protected String hgLvItem;
    @XmlElement(name = "PoItmNo", required = true)
    protected String poItmNo;
    @XmlElement(name = "Material", required = true)
    protected String material;
    @XmlElement(name = "CustMat", required = true)
    protected String custMat;
    @XmlElement(name = "Batch", required = true)
    protected String batch;
    @XmlElement(name = "DlvGroup", required = true)
    protected String dlvGroup;
    @XmlElement(name = "PartDlv", required = true)
    protected String partDlv;
    @XmlElement(name = "ReasonRej", required = true)
    protected String reasonRej;
    @XmlElement(name = "BillBlock", required = true)
    protected String billBlock;
    @XmlElement(name = "BillDate", required = true)
    protected String billDate;
    @XmlElement(name = "Plant", required = true)
    protected String plant;
    @XmlElement(name = "StoreLoc", required = true)
    protected String storeLoc;
    @XmlElement(name = "TargetQty", required = true)
    protected String targetQty;
    @XmlElement(name = "TargetQu", required = true)
    protected String targetQu;
    @XmlElement(name = "ReqQty", required = true)
    protected String reqQty;
    @XmlElement(name = "SalesUnit", required = true)
    protected String salesUnit;
    @XmlElement(name = "ItemCateg", required = true)
    protected String itemCateg;
    @XmlElement(name = "ShortText", required = true)
    protected String shortText;
    @XmlElement(name = "ReqDate", required = true)
    protected String reqDate;
    @XmlElement(name = "DateType", required = true)
    protected String dateType;
    @XmlElement(name = "ReqTime", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar reqTime;
    @XmlElement(name = "CondType", required = true)
    protected String condType;
    @XmlElement(name = "CondValue", required = true)
    protected BigDecimal condValue;
    @XmlElement(name = "CondPUnt", required = true)
    protected String condPUnt;
    @XmlElement(name = "CondDUnt", required = true)
    protected String condDUnt;
    @XmlElement(name = "PrcGroup1", required = true)
    protected String prcGroup1;
    @XmlElement(name = "PrcGroup2", required = true)
    protected String prcGroup2;
    @XmlElement(name = "PrcGroup3", required = true)
    protected String prcGroup3;
    @XmlElement(name = "PrcGroup4", required = true)
    protected String prcGroup4;
    @XmlElement(name = "PrcGroup5", required = true)
    protected String prcGroup5;
    @XmlElement(name = "ProdHiera", required = true)
    protected String prodHiera;
    @XmlElement(name = "MatlGroup", required = true)
    protected String matlGroup;
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
    @XmlElement(name = "CondVal1", required = true)
    protected BigDecimal condVal1;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "CurrIso", required = true)
    protected String currIso;
    @XmlElement(name = "TUnitIso", required = true)
    protected String tUnitIso;
    @XmlElement(name = "SUnitIso", required = true)
    protected String sUnitIso;
    @XmlElement(name = "CdUntIso", required = true)
    protected String cdUntIso;
    @XmlElement(name = "CustMat35", required = true)
    protected String custMat35;
    @XmlElement(name = "Incoterms1", required = true)
    protected String incoterms1;
    @XmlElement(name = "Incoterms2", required = true)
    protected String incoterms2;
    @XmlElement(name = "DlvTime", required = true)
    protected String dlvTime;
    @XmlElement(name = "AssortMod", required = true)
    protected String assortMod;
    @XmlElement(name = "ValContr", required = true)
    protected String valContr;
    @XmlElement(name = "ValConI", required = true)
    protected String valConI;
    @XmlElement(name = "RefDoc", required = true)
    protected String refDoc;
    @XmlElement(name = "RefDocIt", required = true)
    protected String refDocIt;
    @XmlElement(name = "RefDocCa", required = true)
    protected String refDocCa;
    @XmlElement(name = "CdType2", required = true)
    protected String cdType2;
    @XmlElement(name = "CdValue2", required = true)
    protected BigDecimal cdValue2;
    @XmlElement(name = "CdPUnt2", required = true)
    protected String cdPUnt2;
    @XmlElement(name = "CdDUnt2", required = true)
    protected String cdDUnt2;
    @XmlElement(name = "CdDUiso2", required = true)
    protected String cdDUiso2;
    @XmlElement(name = "CdCurr2", required = true)
    protected String cdCurr2;
    @XmlElement(name = "CdCuIso2", required = true)
    protected String cdCuIso2;
    @XmlElement(name = "CdType3", required = true)
    protected String cdType3;
    @XmlElement(name = "CdValue3", required = true)
    protected BigDecimal cdValue3;
    @XmlElement(name = "CdPUnt3", required = true)
    protected String cdPUnt3;
    @XmlElement(name = "CdDUnt3", required = true)
    protected String cdDUnt3;
    @XmlElement(name = "CdDUiso3", required = true)
    protected String cdDUiso3;
    @XmlElement(name = "CdCurr3", required = true)
    protected String cdCurr3;
    @XmlElement(name = "CdCuIso3", required = true)
    protected String cdCuIso3;
    @XmlElement(name = "CdType4", required = true)
    protected String cdType4;
    @XmlElement(name = "CdValue4", required = true)
    protected BigDecimal cdValue4;
    @XmlElement(name = "CdPUnt4", required = true)
    protected String cdPUnt4;
    @XmlElement(name = "CdDUnt4", required = true)
    protected String cdDUnt4;
    @XmlElement(name = "CdDUiso4", required = true)
    protected String cdDUiso4;
    @XmlElement(name = "CdCurr4", required = true)
    protected String cdCurr4;
    @XmlElement(name = "CdCuIso4", required = true)
    protected String cdCuIso4;
    @XmlElement(name = "MatExt", required = true)
    protected String matExt;
    @XmlElement(name = "MatGuid", required = true)
    protected String matGuid;
    @XmlElement(name = "MatVers", required = true)
    protected String matVers;
    @XmlElement(name = "AlternBom", required = true)
    protected String alternBom;
    @XmlElement(name = "FkkConacct", required = true)
    protected String fkkConacct;
    @XmlElement(name = "EanUpc", required = true)
    protected String eanUpc;
    @XmlElement(name = "ShipPoint", required = true)
    protected String shipPoint;
    @XmlElement(name = "Prodcat", required = true)
    protected String prodcat;

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
     * batch 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatch() {
        return batch;
    }

    /**
     * batch 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatch(String value) {
        this.batch = value;
    }

    /**
     * dlvGroup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvGroup() {
        return dlvGroup;
    }

    /**
     * dlvGroup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlvGroup(String value) {
        this.dlvGroup = value;
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
     * billDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillDate() {
        return billDate;
    }

    /**
     * billDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillDate(String value) {
        this.billDate = value;
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
     * storeLoc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreLoc() {
        return storeLoc;
    }

    /**
     * storeLoc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreLoc(String value) {
        this.storeLoc = value;
    }

    /**
     * targetQty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetQty() {
        return targetQty;
    }

    /**
     * targetQty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetQty(String value) {
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
     * reqQty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqQty() {
        return reqQty;
    }

    /**
     * reqQty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqQty(String value) {
        this.reqQty = value;
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
     * reqDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqDate() {
        return reqDate;
    }

    /**
     * reqDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqDate(String value) {
        this.reqDate = value;
    }

    /**
     * dateType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateType() {
        return dateType;
    }

    /**
     * dateType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateType(String value) {
        this.dateType = value;
    }

    /**
     * reqTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqTime() {
        return reqTime;
    }

    /**
     * reqTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqTime(XMLGregorianCalendar value) {
        this.reqTime = value;
    }

    /**
     * condType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondType() {
        return condType;
    }

    /**
     * condType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondType(String value) {
        this.condType = value;
    }

    /**
     * condValue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCondValue() {
        return condValue;
    }

    /**
     * condValue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCondValue(BigDecimal value) {
        this.condValue = value;
    }

    /**
     * condPUnt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondPUnt() {
        return condPUnt;
    }

    /**
     * condPUnt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondPUnt(String value) {
        this.condPUnt = value;
    }

    /**
     * condDUnt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondDUnt() {
        return condDUnt;
    }

    /**
     * condDUnt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondDUnt(String value) {
        this.condDUnt = value;
    }

    /**
     * prcGroup1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcGroup1() {
        return prcGroup1;
    }

    /**
     * prcGroup1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcGroup1(String value) {
        this.prcGroup1 = value;
    }

    /**
     * prcGroup2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcGroup2() {
        return prcGroup2;
    }

    /**
     * prcGroup2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcGroup2(String value) {
        this.prcGroup2 = value;
    }

    /**
     * prcGroup3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcGroup3() {
        return prcGroup3;
    }

    /**
     * prcGroup3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcGroup3(String value) {
        this.prcGroup3 = value;
    }

    /**
     * prcGroup4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcGroup4() {
        return prcGroup4;
    }

    /**
     * prcGroup4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcGroup4(String value) {
        this.prcGroup4 = value;
    }

    /**
     * prcGroup5 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcGroup5() {
        return prcGroup5;
    }

    /**
     * prcGroup5 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcGroup5(String value) {
        this.prcGroup5 = value;
    }

    /**
     * prodHiera 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdHiera() {
        return prodHiera;
    }

    /**
     * prodHiera 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdHiera(String value) {
        this.prodHiera = value;
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
     * condVal1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCondVal1() {
        return condVal1;
    }

    /**
     * condVal1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCondVal1(BigDecimal value) {
        this.condVal1 = value;
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
     * cdUntIso 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdUntIso() {
        return cdUntIso;
    }

    /**
     * cdUntIso 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdUntIso(String value) {
        this.cdUntIso = value;
    }

    /**
     * custMat35 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustMat35() {
        return custMat35;
    }

    /**
     * custMat35 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustMat35(String value) {
        this.custMat35 = value;
    }

    /**
     * incoterms1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncoterms1() {
        return incoterms1;
    }

    /**
     * incoterms1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncoterms1(String value) {
        this.incoterms1 = value;
    }

    /**
     * incoterms2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncoterms2() {
        return incoterms2;
    }

    /**
     * incoterms2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncoterms2(String value) {
        this.incoterms2 = value;
    }

    /**
     * dlvTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvTime() {
        return dlvTime;
    }

    /**
     * dlvTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlvTime(String value) {
        this.dlvTime = value;
    }

    /**
     * assortMod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssortMod() {
        return assortMod;
    }

    /**
     * assortMod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssortMod(String value) {
        this.assortMod = value;
    }

    /**
     * valContr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValContr() {
        return valContr;
    }

    /**
     * valContr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValContr(String value) {
        this.valContr = value;
    }

    /**
     * valConI 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValConI() {
        return valConI;
    }

    /**
     * valConI 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValConI(String value) {
        this.valConI = value;
    }

    /**
     * refDoc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefDoc() {
        return refDoc;
    }

    /**
     * refDoc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefDoc(String value) {
        this.refDoc = value;
    }

    /**
     * refDocIt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefDocIt() {
        return refDocIt;
    }

    /**
     * refDocIt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefDocIt(String value) {
        this.refDocIt = value;
    }

    /**
     * refDocCa 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefDocCa() {
        return refDocCa;
    }

    /**
     * refDocCa 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefDocCa(String value) {
        this.refDocCa = value;
    }

    /**
     * cdType2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdType2() {
        return cdType2;
    }

    /**
     * cdType2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdType2(String value) {
        this.cdType2 = value;
    }

    /**
     * cdValue2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCdValue2() {
        return cdValue2;
    }

    /**
     * cdValue2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCdValue2(BigDecimal value) {
        this.cdValue2 = value;
    }

    /**
     * cdPUnt2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdPUnt2() {
        return cdPUnt2;
    }

    /**
     * cdPUnt2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdPUnt2(String value) {
        this.cdPUnt2 = value;
    }

    /**
     * cdDUnt2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdDUnt2() {
        return cdDUnt2;
    }

    /**
     * cdDUnt2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdDUnt2(String value) {
        this.cdDUnt2 = value;
    }

    /**
     * cdDUiso2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdDUiso2() {
        return cdDUiso2;
    }

    /**
     * cdDUiso2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdDUiso2(String value) {
        this.cdDUiso2 = value;
    }

    /**
     * cdCurr2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdCurr2() {
        return cdCurr2;
    }

    /**
     * cdCurr2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdCurr2(String value) {
        this.cdCurr2 = value;
    }

    /**
     * cdCuIso2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdCuIso2() {
        return cdCuIso2;
    }

    /**
     * cdCuIso2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdCuIso2(String value) {
        this.cdCuIso2 = value;
    }

    /**
     * cdType3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdType3() {
        return cdType3;
    }

    /**
     * cdType3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdType3(String value) {
        this.cdType3 = value;
    }

    /**
     * cdValue3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCdValue3() {
        return cdValue3;
    }

    /**
     * cdValue3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCdValue3(BigDecimal value) {
        this.cdValue3 = value;
    }

    /**
     * cdPUnt3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdPUnt3() {
        return cdPUnt3;
    }

    /**
     * cdPUnt3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdPUnt3(String value) {
        this.cdPUnt3 = value;
    }

    /**
     * cdDUnt3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdDUnt3() {
        return cdDUnt3;
    }

    /**
     * cdDUnt3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdDUnt3(String value) {
        this.cdDUnt3 = value;
    }

    /**
     * cdDUiso3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdDUiso3() {
        return cdDUiso3;
    }

    /**
     * cdDUiso3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdDUiso3(String value) {
        this.cdDUiso3 = value;
    }

    /**
     * cdCurr3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdCurr3() {
        return cdCurr3;
    }

    /**
     * cdCurr3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdCurr3(String value) {
        this.cdCurr3 = value;
    }

    /**
     * cdCuIso3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdCuIso3() {
        return cdCuIso3;
    }

    /**
     * cdCuIso3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdCuIso3(String value) {
        this.cdCuIso3 = value;
    }

    /**
     * cdType4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdType4() {
        return cdType4;
    }

    /**
     * cdType4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdType4(String value) {
        this.cdType4 = value;
    }

    /**
     * cdValue4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCdValue4() {
        return cdValue4;
    }

    /**
     * cdValue4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCdValue4(BigDecimal value) {
        this.cdValue4 = value;
    }

    /**
     * cdPUnt4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdPUnt4() {
        return cdPUnt4;
    }

    /**
     * cdPUnt4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdPUnt4(String value) {
        this.cdPUnt4 = value;
    }

    /**
     * cdDUnt4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdDUnt4() {
        return cdDUnt4;
    }

    /**
     * cdDUnt4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdDUnt4(String value) {
        this.cdDUnt4 = value;
    }

    /**
     * cdDUiso4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdDUiso4() {
        return cdDUiso4;
    }

    /**
     * cdDUiso4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdDUiso4(String value) {
        this.cdDUiso4 = value;
    }

    /**
     * cdCurr4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdCurr4() {
        return cdCurr4;
    }

    /**
     * cdCurr4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdCurr4(String value) {
        this.cdCurr4 = value;
    }

    /**
     * cdCuIso4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdCuIso4() {
        return cdCuIso4;
    }

    /**
     * cdCuIso4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdCuIso4(String value) {
        this.cdCuIso4 = value;
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
     * alternBom 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternBom() {
        return alternBom;
    }

    /**
     * alternBom 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternBom(String value) {
        this.alternBom = value;
    }

    /**
     * fkkConacct 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFkkConacct() {
        return fkkConacct;
    }

    /**
     * fkkConacct 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFkkConacct(String value) {
        this.fkkConacct = value;
    }

    /**
     * eanUpc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEanUpc() {
        return eanUpc;
    }

    /**
     * eanUpc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEanUpc(String value) {
        this.eanUpc = value;
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
     * prodcat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdcat() {
        return prodcat;
    }

    /**
     * prodcat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdcat(String value) {
        this.prodcat = value;
    }

}
