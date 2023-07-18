//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.06.02 시간 07:11:23 PM KST 
//


package com.handok.soapClient.client.zsd_so_createfromdat2_ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Bapisdhd1x complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Bapisdhd1x"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Updateflag" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="DocType" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="CollectNo" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SalesOrg" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="DistrChan" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Division" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SalesGrp" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SalesOff" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ReqDateH" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="DateType" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="PurchDate" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="PoMethod" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="PoSupplem" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Ref1" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Name" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Telephone" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="PriceGrp" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="CustGroup" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SalesDist" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="PriceList" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Incoterms1" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Incoterms2" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Pmnttrms" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="DlvBlock" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="BillBlock" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="OrdReason" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ComplDlv" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="PriceDate" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="QtValidF" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="QtValidT" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="CtValidF" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="CtValidT" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="CustGrp1" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="CustGrp2" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="CustGrp3" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="CustGrp4" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="CustGrp5" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="PurchNoC" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="PurchNoS" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="PoDatS" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="PoMethS" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Ref1S" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SdDocCat" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="DocDate" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="WarDate" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ShipCond" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="PpSearch" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="DunCount" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="DunDate" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Dlvschduse" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Pldlvstyp" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="RefDoc" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="CompCdeB" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="AlttaxCls" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TaxClass2" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TaxClass3" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TaxClass4" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TaxClass5" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TaxClass6" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TaxClass7" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TaxClass8" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TaxClass9" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="RefDocL" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="AssNumber" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="RefdocCat" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="OrdcombIn" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="BillSched" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="InvoSched" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="MnInvoice" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ExrateFi" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="AddValDy" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="FixValDy" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="PymtMeth" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="AccntAsgn" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ExchgRate" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="BillDate" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ServDate" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="DunnKey" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="DunnBlock" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Promotion" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="PmtgarPro" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="DepartmNo" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="RecPoint" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="PoitmNoS" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="DocNumFi" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Cstcndgrp1" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Cstcndgrp2" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Cstcndgrp3" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Cstcndgrp4" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Cstcndgrp5" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="DlvTime" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Currency" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TaxdepCty" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TaxdstCty" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="EutriDeal" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="MastContr" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="RefProc" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Chkprtauth" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="CmlqtyDat" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Version" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="NotifNo" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="WbsElem" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ExchRateFiV" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ExchgRateV" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="FkkConacct" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Campaign" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="DocClass" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="HCurr" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ShipType" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SProcInd" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="LineTime" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="CalcMotive" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="PsmPstngDate" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TreasuryAccSymbol" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="BusinessEventTcode" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ModificationAllowed" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="CancellationAllowed" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="PaymentMethods" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="BusinessPartnerNo" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ReportingFreq" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "updateflag",
    "docType",
    "collectNo",
    "salesOrg",
    "distrChan",
    "division",
    "salesGrp",
    "salesOff",
    "reqDateH",
    "dateType",
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
    "docDate",
    "warDate",
    "shipCond",
    "ppSearch",
    "dunCount",
    "dunDate",
    "dlvschduse",
    "pldlvstyp",
    "refDoc",
    "compCdeB",
    "alttaxCls",
    "taxClass2",
    "taxClass3",
    "taxClass4",
    "taxClass5",
    "taxClass6",
    "taxClass7",
    "taxClass8",
    "taxClass9",
    "refDocL",
    "assNumber",
    "refdocCat",
    "ordcombIn",
    "billSched",
    "invoSched",
    "mnInvoice",
    "exrateFi",
    "addValDy",
    "fixValDy",
    "pymtMeth",
    "accntAsgn",
    "exchgRate",
    "billDate",
    "servDate",
    "dunnKey",
    "dunnBlock",
    "promotion",
    "pmtgarPro",
    "departmNo",
    "recPoint",
    "poitmNoS",
    "docNumFi",
    "cstcndgrp1",
    "cstcndgrp2",
    "cstcndgrp3",
    "cstcndgrp4",
    "cstcndgrp5",
    "dlvTime",
    "currency",
    "taxdepCty",
    "taxdstCty",
    "eutriDeal",
    "mastContr",
    "refProc",
    "chkprtauth",
    "cmlqtyDat",
    "version",
    "notifNo",
    "wbsElem",
    "exchRateFiV",
    "exchgRateV",
    "fkkConacct",
    "campaign",
    "docClass",
    "hCurr",
    "shipType",
    "sProcInd",
    "lineTime",
    "calcMotive",
    "psmPstngDate",
    "treasuryAccSymbol",
    "businessEventTcode",
    "modificationAllowed",
    "cancellationAllowed",
    "paymentMethods",
    "businessPartnerNo",
    "reportingFreq"
})
public class Bapisdhd1X {

    @XmlElement(name = "Updateflag", required = true)
    protected String updateflag;
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
    @XmlElement(name = "DocDate", required = true)
    protected String docDate;
    @XmlElement(name = "WarDate", required = true)
    protected String warDate;
    @XmlElement(name = "ShipCond", required = true)
    protected String shipCond;
    @XmlElement(name = "PpSearch", required = true)
    protected String ppSearch;
    @XmlElement(name = "DunCount", required = true)
    protected String dunCount;
    @XmlElement(name = "DunDate", required = true)
    protected String dunDate;
    @XmlElement(name = "Dlvschduse", required = true)
    protected String dlvschduse;
    @XmlElement(name = "Pldlvstyp", required = true)
    protected String pldlvstyp;
    @XmlElement(name = "RefDoc", required = true)
    protected String refDoc;
    @XmlElement(name = "CompCdeB", required = true)
    protected String compCdeB;
    @XmlElement(name = "AlttaxCls", required = true)
    protected String alttaxCls;
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
    @XmlElement(name = "RefDocL", required = true)
    protected String refDocL;
    @XmlElement(name = "AssNumber", required = true)
    protected String assNumber;
    @XmlElement(name = "RefdocCat", required = true)
    protected String refdocCat;
    @XmlElement(name = "OrdcombIn", required = true)
    protected String ordcombIn;
    @XmlElement(name = "BillSched", required = true)
    protected String billSched;
    @XmlElement(name = "InvoSched", required = true)
    protected String invoSched;
    @XmlElement(name = "MnInvoice", required = true)
    protected String mnInvoice;
    @XmlElement(name = "ExrateFi", required = true)
    protected String exrateFi;
    @XmlElement(name = "AddValDy", required = true)
    protected String addValDy;
    @XmlElement(name = "FixValDy", required = true)
    protected String fixValDy;
    @XmlElement(name = "PymtMeth", required = true)
    protected String pymtMeth;
    @XmlElement(name = "AccntAsgn", required = true)
    protected String accntAsgn;
    @XmlElement(name = "ExchgRate", required = true)
    protected String exchgRate;
    @XmlElement(name = "BillDate", required = true)
    protected String billDate;
    @XmlElement(name = "ServDate", required = true)
    protected String servDate;
    @XmlElement(name = "DunnKey", required = true)
    protected String dunnKey;
    @XmlElement(name = "DunnBlock", required = true)
    protected String dunnBlock;
    @XmlElement(name = "Promotion", required = true)
    protected String promotion;
    @XmlElement(name = "PmtgarPro", required = true)
    protected String pmtgarPro;
    @XmlElement(name = "DepartmNo", required = true)
    protected String departmNo;
    @XmlElement(name = "RecPoint", required = true)
    protected String recPoint;
    @XmlElement(name = "PoitmNoS", required = true)
    protected String poitmNoS;
    @XmlElement(name = "DocNumFi", required = true)
    protected String docNumFi;
    @XmlElement(name = "Cstcndgrp1", required = true)
    protected String cstcndgrp1;
    @XmlElement(name = "Cstcndgrp2", required = true)
    protected String cstcndgrp2;
    @XmlElement(name = "Cstcndgrp3", required = true)
    protected String cstcndgrp3;
    @XmlElement(name = "Cstcndgrp4", required = true)
    protected String cstcndgrp4;
    @XmlElement(name = "Cstcndgrp5", required = true)
    protected String cstcndgrp5;
    @XmlElement(name = "DlvTime", required = true)
    protected String dlvTime;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "TaxdepCty", required = true)
    protected String taxdepCty;
    @XmlElement(name = "TaxdstCty", required = true)
    protected String taxdstCty;
    @XmlElement(name = "EutriDeal", required = true)
    protected String eutriDeal;
    @XmlElement(name = "MastContr", required = true)
    protected String mastContr;
    @XmlElement(name = "RefProc", required = true)
    protected String refProc;
    @XmlElement(name = "Chkprtauth", required = true)
    protected String chkprtauth;
    @XmlElement(name = "CmlqtyDat", required = true)
    protected String cmlqtyDat;
    @XmlElement(name = "Version", required = true)
    protected String version;
    @XmlElement(name = "NotifNo", required = true)
    protected String notifNo;
    @XmlElement(name = "WbsElem", required = true)
    protected String wbsElem;
    @XmlElement(name = "ExchRateFiV", required = true)
    protected String exchRateFiV;
    @XmlElement(name = "ExchgRateV", required = true)
    protected String exchgRateV;
    @XmlElement(name = "FkkConacct", required = true)
    protected String fkkConacct;
    @XmlElement(name = "Campaign", required = true)
    protected String campaign;
    @XmlElement(name = "DocClass", required = true)
    protected String docClass;
    @XmlElement(name = "HCurr", required = true)
    protected String hCurr;
    @XmlElement(name = "ShipType", required = true)
    protected String shipType;
    @XmlElement(name = "SProcInd", required = true)
    protected String sProcInd;
    @XmlElement(name = "LineTime", required = true)
    protected String lineTime;
    @XmlElement(name = "CalcMotive", required = true)
    protected String calcMotive;
    @XmlElement(name = "PsmPstngDate", required = true)
    protected String psmPstngDate;
    @XmlElement(name = "TreasuryAccSymbol", required = true)
    protected String treasuryAccSymbol;
    @XmlElement(name = "BusinessEventTcode", required = true)
    protected String businessEventTcode;
    @XmlElement(name = "ModificationAllowed", required = true)
    protected String modificationAllowed;
    @XmlElement(name = "CancellationAllowed", required = true)
    protected String cancellationAllowed;
    @XmlElement(name = "PaymentMethods", required = true)
    protected String paymentMethods;
    @XmlElement(name = "BusinessPartnerNo", required = true)
    protected String businessPartnerNo;
    @XmlElement(name = "ReportingFreq", required = true)
    protected String reportingFreq;

    /**
     * updateflag 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateflag() {
        return updateflag;
    }

    /**
     * updateflag 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateflag(String value) {
        this.updateflag = value;
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
     * docDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocDate() {
        return docDate;
    }

    /**
     * docDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocDate(String value) {
        this.docDate = value;
    }

    /**
     * warDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarDate() {
        return warDate;
    }

    /**
     * warDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarDate(String value) {
        this.warDate = value;
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
     * ppSearch 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPpSearch() {
        return ppSearch;
    }

    /**
     * ppSearch 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPpSearch(String value) {
        this.ppSearch = value;
    }

    /**
     * dunCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDunCount() {
        return dunCount;
    }

    /**
     * dunCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDunCount(String value) {
        this.dunCount = value;
    }

    /**
     * dunDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDunDate() {
        return dunDate;
    }

    /**
     * dunDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDunDate(String value) {
        this.dunDate = value;
    }

    /**
     * dlvschduse 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvschduse() {
        return dlvschduse;
    }

    /**
     * dlvschduse 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlvschduse(String value) {
        this.dlvschduse = value;
    }

    /**
     * pldlvstyp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPldlvstyp() {
        return pldlvstyp;
    }

    /**
     * pldlvstyp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPldlvstyp(String value) {
        this.pldlvstyp = value;
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
     * compCdeB 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompCdeB() {
        return compCdeB;
    }

    /**
     * compCdeB 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompCdeB(String value) {
        this.compCdeB = value;
    }

    /**
     * alttaxCls 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlttaxCls() {
        return alttaxCls;
    }

    /**
     * alttaxCls 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlttaxCls(String value) {
        this.alttaxCls = value;
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
     * refDocL 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefDocL() {
        return refDocL;
    }

    /**
     * refDocL 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefDocL(String value) {
        this.refDocL = value;
    }

    /**
     * assNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssNumber() {
        return assNumber;
    }

    /**
     * assNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssNumber(String value) {
        this.assNumber = value;
    }

    /**
     * refdocCat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefdocCat() {
        return refdocCat;
    }

    /**
     * refdocCat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefdocCat(String value) {
        this.refdocCat = value;
    }

    /**
     * ordcombIn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdcombIn() {
        return ordcombIn;
    }

    /**
     * ordcombIn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdcombIn(String value) {
        this.ordcombIn = value;
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
     * invoSched 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoSched() {
        return invoSched;
    }

    /**
     * invoSched 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoSched(String value) {
        this.invoSched = value;
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
     * exrateFi 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExrateFi() {
        return exrateFi;
    }

    /**
     * exrateFi 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExrateFi(String value) {
        this.exrateFi = value;
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
     * pymtMeth 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPymtMeth() {
        return pymtMeth;
    }

    /**
     * pymtMeth 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPymtMeth(String value) {
        this.pymtMeth = value;
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
     * exchgRate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchgRate() {
        return exchgRate;
    }

    /**
     * exchgRate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchgRate(String value) {
        this.exchgRate = value;
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
     * servDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServDate() {
        return servDate;
    }

    /**
     * servDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServDate(String value) {
        this.servDate = value;
    }

    /**
     * dunnKey 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDunnKey() {
        return dunnKey;
    }

    /**
     * dunnKey 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDunnKey(String value) {
        this.dunnKey = value;
    }

    /**
     * dunnBlock 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDunnBlock() {
        return dunnBlock;
    }

    /**
     * dunnBlock 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDunnBlock(String value) {
        this.dunnBlock = value;
    }

    /**
     * promotion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotion() {
        return promotion;
    }

    /**
     * promotion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotion(String value) {
        this.promotion = value;
    }

    /**
     * pmtgarPro 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtgarPro() {
        return pmtgarPro;
    }

    /**
     * pmtgarPro 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtgarPro(String value) {
        this.pmtgarPro = value;
    }

    /**
     * departmNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmNo() {
        return departmNo;
    }

    /**
     * departmNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmNo(String value) {
        this.departmNo = value;
    }

    /**
     * recPoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecPoint() {
        return recPoint;
    }

    /**
     * recPoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecPoint(String value) {
        this.recPoint = value;
    }

    /**
     * poitmNoS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoitmNoS() {
        return poitmNoS;
    }

    /**
     * poitmNoS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoitmNoS(String value) {
        this.poitmNoS = value;
    }

    /**
     * docNumFi 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumFi() {
        return docNumFi;
    }

    /**
     * docNumFi 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNumFi(String value) {
        this.docNumFi = value;
    }

    /**
     * cstcndgrp1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstcndgrp1() {
        return cstcndgrp1;
    }

    /**
     * cstcndgrp1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstcndgrp1(String value) {
        this.cstcndgrp1 = value;
    }

    /**
     * cstcndgrp2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstcndgrp2() {
        return cstcndgrp2;
    }

    /**
     * cstcndgrp2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstcndgrp2(String value) {
        this.cstcndgrp2 = value;
    }

    /**
     * cstcndgrp3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstcndgrp3() {
        return cstcndgrp3;
    }

    /**
     * cstcndgrp3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstcndgrp3(String value) {
        this.cstcndgrp3 = value;
    }

    /**
     * cstcndgrp4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstcndgrp4() {
        return cstcndgrp4;
    }

    /**
     * cstcndgrp4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstcndgrp4(String value) {
        this.cstcndgrp4 = value;
    }

    /**
     * cstcndgrp5 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstcndgrp5() {
        return cstcndgrp5;
    }

    /**
     * cstcndgrp5 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstcndgrp5(String value) {
        this.cstcndgrp5 = value;
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
     * taxdepCty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxdepCty() {
        return taxdepCty;
    }

    /**
     * taxdepCty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxdepCty(String value) {
        this.taxdepCty = value;
    }

    /**
     * taxdstCty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxdstCty() {
        return taxdstCty;
    }

    /**
     * taxdstCty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxdstCty(String value) {
        this.taxdstCty = value;
    }

    /**
     * eutriDeal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEutriDeal() {
        return eutriDeal;
    }

    /**
     * eutriDeal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEutriDeal(String value) {
        this.eutriDeal = value;
    }

    /**
     * mastContr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMastContr() {
        return mastContr;
    }

    /**
     * mastContr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMastContr(String value) {
        this.mastContr = value;
    }

    /**
     * refProc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefProc() {
        return refProc;
    }

    /**
     * refProc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefProc(String value) {
        this.refProc = value;
    }

    /**
     * chkprtauth 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChkprtauth() {
        return chkprtauth;
    }

    /**
     * chkprtauth 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChkprtauth(String value) {
        this.chkprtauth = value;
    }

    /**
     * cmlqtyDat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmlqtyDat() {
        return cmlqtyDat;
    }

    /**
     * cmlqtyDat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmlqtyDat(String value) {
        this.cmlqtyDat = value;
    }

    /**
     * version 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * version 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * notifNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifNo() {
        return notifNo;
    }

    /**
     * notifNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifNo(String value) {
        this.notifNo = value;
    }

    /**
     * wbsElem 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWbsElem() {
        return wbsElem;
    }

    /**
     * wbsElem 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWbsElem(String value) {
        this.wbsElem = value;
    }

    /**
     * exchRateFiV 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchRateFiV() {
        return exchRateFiV;
    }

    /**
     * exchRateFiV 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchRateFiV(String value) {
        this.exchRateFiV = value;
    }

    /**
     * exchgRateV 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchgRateV() {
        return exchgRateV;
    }

    /**
     * exchgRateV 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchgRateV(String value) {
        this.exchgRateV = value;
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
     * campaign 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaign() {
        return campaign;
    }

    /**
     * campaign 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaign(String value) {
        this.campaign = value;
    }

    /**
     * docClass 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocClass() {
        return docClass;
    }

    /**
     * docClass 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocClass(String value) {
        this.docClass = value;
    }

    /**
     * hCurr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHCurr() {
        return hCurr;
    }

    /**
     * hCurr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHCurr(String value) {
        this.hCurr = value;
    }

    /**
     * shipType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipType() {
        return shipType;
    }

    /**
     * shipType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipType(String value) {
        this.shipType = value;
    }

    /**
     * sProcInd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSProcInd() {
        return sProcInd;
    }

    /**
     * sProcInd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSProcInd(String value) {
        this.sProcInd = value;
    }

    /**
     * lineTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineTime() {
        return lineTime;
    }

    /**
     * lineTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineTime(String value) {
        this.lineTime = value;
    }

    /**
     * calcMotive 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalcMotive() {
        return calcMotive;
    }

    /**
     * calcMotive 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalcMotive(String value) {
        this.calcMotive = value;
    }

    /**
     * psmPstngDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsmPstngDate() {
        return psmPstngDate;
    }

    /**
     * psmPstngDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsmPstngDate(String value) {
        this.psmPstngDate = value;
    }

    /**
     * treasuryAccSymbol 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreasuryAccSymbol() {
        return treasuryAccSymbol;
    }

    /**
     * treasuryAccSymbol 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreasuryAccSymbol(String value) {
        this.treasuryAccSymbol = value;
    }

    /**
     * businessEventTcode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessEventTcode() {
        return businessEventTcode;
    }

    /**
     * businessEventTcode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessEventTcode(String value) {
        this.businessEventTcode = value;
    }

    /**
     * modificationAllowed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationAllowed() {
        return modificationAllowed;
    }

    /**
     * modificationAllowed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationAllowed(String value) {
        this.modificationAllowed = value;
    }

    /**
     * cancellationAllowed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellationAllowed() {
        return cancellationAllowed;
    }

    /**
     * cancellationAllowed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationAllowed(String value) {
        this.cancellationAllowed = value;
    }

    /**
     * paymentMethods 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethods() {
        return paymentMethods;
    }

    /**
     * paymentMethods 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethods(String value) {
        this.paymentMethods = value;
    }

    /**
     * businessPartnerNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPartnerNo() {
        return businessPartnerNo;
    }

    /**
     * businessPartnerNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPartnerNo(String value) {
        this.businessPartnerNo = value;
    }

    /**
     * reportingFreq 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingFreq() {
        return reportingFreq;
    }

    /**
     * reportingFreq 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingFreq(String value) {
        this.reportingFreq = value;
    }

}
