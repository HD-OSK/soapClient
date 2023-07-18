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
 * <p>Bapisdhead complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Bapisdhead"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocNumber" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="DocType" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="CollectNo" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="SalesOrg" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="DistrChan" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Division" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="SalesGrp" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="SalesOff" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="ReqDateH" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="DateType" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="PurchNo" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="PurchDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="PoMethod" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="PoSupplem" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Ref1" type="{urn:sap-com:document:sap:rfc:functions}char12"/&gt;
 *         &lt;element name="Name" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="Telephone" type="{urn:sap-com:document:sap:rfc:functions}char16"/&gt;
 *         &lt;element name="PriceGrp" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="CustGroup" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="SalesDist" type="{urn:sap-com:document:sap:rfc:functions}char6"/&gt;
 *         &lt;element name="PriceList" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Incoterms1" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Incoterms2" type="{urn:sap-com:document:sap:rfc:functions}char28"/&gt;
 *         &lt;element name="Pmnttrms" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="DlvBlock" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="BillBlock" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="OrdReason" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="ComplDlv" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="PriceDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="QtValidF" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="QtValidT" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="CtValidF" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="CtValidT" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="CustGrp1" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="CustGrp2" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="CustGrp3" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="CustGrp4" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="CustGrp5" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="PurchNoC" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="PurchNoS" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="PoDatS" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="PoMethS" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Ref1S" type="{urn:sap-com:document:sap:rfc:functions}char12"/&gt;
 *         &lt;element name="SdDocCat" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ShipCond" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Currency" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/&gt;
 *         &lt;element name="CurrencyIso" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="DlvTime" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="CdType1" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="CdValue1" type="{urn:sap-com:document:sap:rfc:functions}decimal23.4"/&gt;
 *         &lt;element name="CdPUnt1" type="{urn:sap-com:document:sap:rfc:functions}numeric5"/&gt;
 *         &lt;element name="CdDUnt1" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="CdDUiso1" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="CdCurr1" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/&gt;
 *         &lt;element name="CdCuIso1" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
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
 *         &lt;element name="FkkConacct" type="{urn:sap-com:document:sap:rfc:functions}char12"/&gt;
 *         &lt;element name="RefDoc" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="RefDocCa" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bapisdhead", propOrder = {
    "docNumber",
    "docType",
    "collectNo",
    "salesOrg",
    "distrChan",
    "division",
    "salesGrp",
    "salesOff",
    "reqDateH",
    "dateType",
    "purchNo",
    "purchDate",
    "poMethod",
    "poSupplem",
    "ref1",
    "name",
    "telephone",
    "priceGrp",
    "custGroup",
    "salesDist",
    "priceList",
    "incoterms1",
    "incoterms2",
    "pmnttrms",
    "dlvBlock",
    "billBlock",
    "ordReason",
    "complDlv",
    "priceDate",
    "qtValidF",
    "qtValidT",
    "ctValidF",
    "ctValidT",
    "custGrp1",
    "custGrp2",
    "custGrp3",
    "custGrp4",
    "custGrp5",
    "purchNoC",
    "purchNoS",
    "poDatS",
    "poMethS",
    "ref1S",
    "sdDocCat",
    "shipCond",
    "currency",
    "currencyIso",
    "dlvTime",
    "cdType1",
    "cdValue1",
    "cdPUnt1",
    "cdDUnt1",
    "cdDUiso1",
    "cdCurr1",
    "cdCuIso1",
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
    "fkkConacct",
    "refDoc",
    "refDocCa"
})
public class Bapisdhead {

    @XmlElement(name = "DocNumber", required = true)
    protected String docNumber;
    @XmlElement(name = "DocType", required = true)
    protected String docType;
    @XmlElement(name = "CollectNo", required = true)
    protected String collectNo;
    @XmlElement(name = "SalesOrg", required = true)
    protected String salesOrg;
    @XmlElement(name = "DistrChan", required = true)
    protected String distrChan;
    @XmlElement(name = "Division", required = true)
    protected String division;
    @XmlElement(name = "SalesGrp", required = true)
    protected String salesGrp;
    @XmlElement(name = "SalesOff", required = true)
    protected String salesOff;
    @XmlElement(name = "ReqDateH", required = true)
    protected String reqDateH;
    @XmlElement(name = "DateType", required = true)
    protected String dateType;
    @XmlElement(name = "PurchNo", required = true)
    protected String purchNo;
    @XmlElement(name = "PurchDate", required = true)
    protected String purchDate;
    @XmlElement(name = "PoMethod", required = true)
    protected String poMethod;
    @XmlElement(name = "PoSupplem", required = true)
    protected String poSupplem;
    @XmlElement(name = "Ref1", required = true)
    protected String ref1;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Telephone", required = true)
    protected String telephone;
    @XmlElement(name = "PriceGrp", required = true)
    protected String priceGrp;
    @XmlElement(name = "CustGroup", required = true)
    protected String custGroup;
    @XmlElement(name = "SalesDist", required = true)
    protected String salesDist;
    @XmlElement(name = "PriceList", required = true)
    protected String priceList;
    @XmlElement(name = "Incoterms1", required = true)
    protected String incoterms1;
    @XmlElement(name = "Incoterms2", required = true)
    protected String incoterms2;
    @XmlElement(name = "Pmnttrms", required = true)
    protected String pmnttrms;
    @XmlElement(name = "DlvBlock", required = true)
    protected String dlvBlock;
    @XmlElement(name = "BillBlock", required = true)
    protected String billBlock;
    @XmlElement(name = "OrdReason", required = true)
    protected String ordReason;
    @XmlElement(name = "ComplDlv", required = true)
    protected String complDlv;
    @XmlElement(name = "PriceDate", required = true)
    protected String priceDate;
    @XmlElement(name = "QtValidF", required = true)
    protected String qtValidF;
    @XmlElement(name = "QtValidT", required = true)
    protected String qtValidT;
    @XmlElement(name = "CtValidF", required = true)
    protected String ctValidF;
    @XmlElement(name = "CtValidT", required = true)
    protected String ctValidT;
    @XmlElement(name = "CustGrp1", required = true)
    protected String custGrp1;
    @XmlElement(name = "CustGrp2", required = true)
    protected String custGrp2;
    @XmlElement(name = "CustGrp3", required = true)
    protected String custGrp3;
    @XmlElement(name = "CustGrp4", required = true)
    protected String custGrp4;
    @XmlElement(name = "CustGrp5", required = true)
    protected String custGrp5;
    @XmlElement(name = "PurchNoC", required = true)
    protected String purchNoC;
    @XmlElement(name = "PurchNoS", required = true)
    protected String purchNoS;
    @XmlElement(name = "PoDatS", required = true)
    protected String poDatS;
    @XmlElement(name = "PoMethS", required = true)
    protected String poMethS;
    @XmlElement(name = "Ref1S", required = true)
    protected String ref1S;
    @XmlElement(name = "SdDocCat", required = true)
    protected String sdDocCat;
    @XmlElement(name = "ShipCond", required = true)
    protected String shipCond;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "CurrencyIso", required = true)
    protected String currencyIso;
    @XmlElement(name = "DlvTime", required = true)
    protected String dlvTime;
    @XmlElement(name = "CdType1", required = true)
    protected String cdType1;
    @XmlElement(name = "CdValue1", required = true)
    protected BigDecimal cdValue1;
    @XmlElement(name = "CdPUnt1", required = true)
    protected String cdPUnt1;
    @XmlElement(name = "CdDUnt1", required = true)
    protected String cdDUnt1;
    @XmlElement(name = "CdDUiso1", required = true)
    protected String cdDUiso1;
    @XmlElement(name = "CdCurr1", required = true)
    protected String cdCurr1;
    @XmlElement(name = "CdCuIso1", required = true)
    protected String cdCuIso1;
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
    @XmlElement(name = "FkkConacct", required = true)
    protected String fkkConacct;
    @XmlElement(name = "RefDoc", required = true)
    protected String refDoc;
    @XmlElement(name = "RefDocCa", required = true)
    protected String refDocCa;

    /**
     * docNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * docNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNumber(String value) {
        this.docNumber = value;
    }

    /**
     * docType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocType() {
        return docType;
    }

    /**
     * docType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocType(String value) {
        this.docType = value;
    }

    /**
     * collectNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectNo() {
        return collectNo;
    }

    /**
     * collectNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectNo(String value) {
        this.collectNo = value;
    }

    /**
     * salesOrg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOrg() {
        return salesOrg;
    }

    /**
     * salesOrg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOrg(String value) {
        this.salesOrg = value;
    }

    /**
     * distrChan 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrChan() {
        return distrChan;
    }

    /**
     * distrChan 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrChan(String value) {
        this.distrChan = value;
    }

    /**
     * division 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision() {
        return division;
    }

    /**
     * division 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision(String value) {
        this.division = value;
    }

    /**
     * salesGrp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesGrp() {
        return salesGrp;
    }

    /**
     * salesGrp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesGrp(String value) {
        this.salesGrp = value;
    }

    /**
     * salesOff 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOff() {
        return salesOff;
    }

    /**
     * salesOff 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOff(String value) {
        this.salesOff = value;
    }

    /**
     * reqDateH 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqDateH() {
        return reqDateH;
    }

    /**
     * reqDateH 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqDateH(String value) {
        this.reqDateH = value;
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
     * purchNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchNo() {
        return purchNo;
    }

    /**
     * purchNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchNo(String value) {
        this.purchNo = value;
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
     * poSupplem 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoSupplem() {
        return poSupplem;
    }

    /**
     * poSupplem 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoSupplem(String value) {
        this.poSupplem = value;
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
     * priceGrp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceGrp() {
        return priceGrp;
    }

    /**
     * priceGrp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceGrp(String value) {
        this.priceGrp = value;
    }

    /**
     * custGroup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustGroup() {
        return custGroup;
    }

    /**
     * custGroup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustGroup(String value) {
        this.custGroup = value;
    }

    /**
     * salesDist 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesDist() {
        return salesDist;
    }

    /**
     * salesDist 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesDist(String value) {
        this.salesDist = value;
    }

    /**
     * priceList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceList() {
        return priceList;
    }

    /**
     * priceList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceList(String value) {
        this.priceList = value;
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
     * dlvBlock 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvBlock() {
        return dlvBlock;
    }

    /**
     * dlvBlock 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlvBlock(String value) {
        this.dlvBlock = value;
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
     * ordReason 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdReason() {
        return ordReason;
    }

    /**
     * ordReason 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdReason(String value) {
        this.ordReason = value;
    }

    /**
     * complDlv 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplDlv() {
        return complDlv;
    }

    /**
     * complDlv 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplDlv(String value) {
        this.complDlv = value;
    }

    /**
     * priceDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceDate() {
        return priceDate;
    }

    /**
     * priceDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceDate(String value) {
        this.priceDate = value;
    }

    /**
     * qtValidF 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtValidF() {
        return qtValidF;
    }

    /**
     * qtValidF 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtValidF(String value) {
        this.qtValidF = value;
    }

    /**
     * qtValidT 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtValidT() {
        return qtValidT;
    }

    /**
     * qtValidT 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtValidT(String value) {
        this.qtValidT = value;
    }

    /**
     * ctValidF 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtValidF() {
        return ctValidF;
    }

    /**
     * ctValidF 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtValidF(String value) {
        this.ctValidF = value;
    }

    /**
     * ctValidT 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtValidT() {
        return ctValidT;
    }

    /**
     * ctValidT 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtValidT(String value) {
        this.ctValidT = value;
    }

    /**
     * custGrp1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustGrp1() {
        return custGrp1;
    }

    /**
     * custGrp1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustGrp1(String value) {
        this.custGrp1 = value;
    }

    /**
     * custGrp2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustGrp2() {
        return custGrp2;
    }

    /**
     * custGrp2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustGrp2(String value) {
        this.custGrp2 = value;
    }

    /**
     * custGrp3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustGrp3() {
        return custGrp3;
    }

    /**
     * custGrp3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustGrp3(String value) {
        this.custGrp3 = value;
    }

    /**
     * custGrp4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustGrp4() {
        return custGrp4;
    }

    /**
     * custGrp4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustGrp4(String value) {
        this.custGrp4 = value;
    }

    /**
     * custGrp5 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustGrp5() {
        return custGrp5;
    }

    /**
     * custGrp5 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustGrp5(String value) {
        this.custGrp5 = value;
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
     * sdDocCat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSdDocCat() {
        return sdDocCat;
    }

    /**
     * sdDocCat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSdDocCat(String value) {
        this.sdDocCat = value;
    }

    /**
     * shipCond 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipCond() {
        return shipCond;
    }

    /**
     * shipCond 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipCond(String value) {
        this.shipCond = value;
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
     * currencyIso 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyIso() {
        return currencyIso;
    }

    /**
     * currencyIso 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyIso(String value) {
        this.currencyIso = value;
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
     * cdType1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdType1() {
        return cdType1;
    }

    /**
     * cdType1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdType1(String value) {
        this.cdType1 = value;
    }

    /**
     * cdValue1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCdValue1() {
        return cdValue1;
    }

    /**
     * cdValue1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCdValue1(BigDecimal value) {
        this.cdValue1 = value;
    }

    /**
     * cdPUnt1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdPUnt1() {
        return cdPUnt1;
    }

    /**
     * cdPUnt1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdPUnt1(String value) {
        this.cdPUnt1 = value;
    }

    /**
     * cdDUnt1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdDUnt1() {
        return cdDUnt1;
    }

    /**
     * cdDUnt1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdDUnt1(String value) {
        this.cdDUnt1 = value;
    }

    /**
     * cdDUiso1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdDUiso1() {
        return cdDUiso1;
    }

    /**
     * cdDUiso1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdDUiso1(String value) {
        this.cdDUiso1 = value;
    }

    /**
     * cdCurr1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdCurr1() {
        return cdCurr1;
    }

    /**
     * cdCurr1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdCurr1(String value) {
        this.cdCurr1 = value;
    }

    /**
     * cdCuIso1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdCuIso1() {
        return cdCuIso1;
    }

    /**
     * cdCuIso1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdCuIso1(String value) {
        this.cdCuIso1 = value;
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

}
