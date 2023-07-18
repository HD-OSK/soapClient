//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.06.02 시간 07:11:17 PM KST 
//


package com.handok.soapClient.client.z_bapi_ar_acc_getopenitems;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Bapi30072 complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Bapi30072"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompCode" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Customer" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="SpGlInd" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ClearDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="ClrDocNo" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="AllocNmbr" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="FiscYear" type="{urn:sap-com:document:sap:rfc:functions}numeric4"/&gt;
 *         &lt;element name="DocNo" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="ItemNum" type="{urn:sap-com:document:sap:rfc:functions}numeric3"/&gt;
 *         &lt;element name="PstngDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="DocDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="EntryDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Currency" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/&gt;
 *         &lt;element name="LocCurrcy" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/&gt;
 *         &lt;element name="RefDocNo" type="{urn:sap-com:document:sap:rfc:functions}char16"/&gt;
 *         &lt;element name="DocType" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="FisPeriod" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/&gt;
 *         &lt;element name="PostKey" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="DbCrInd" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="BusArea" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="TaxCode" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="LcAmount" type="{urn:sap-com:document:sap:rfc:functions}decimal23.4"/&gt;
 *         &lt;element name="AmtDoccur" type="{urn:sap-com:document:sap:rfc:functions}decimal23.4"/&gt;
 *         &lt;element name="LcTax" type="{urn:sap-com:document:sap:rfc:functions}decimal23.4"/&gt;
 *         &lt;element name="TxDocCur" type="{urn:sap-com:document:sap:rfc:functions}decimal23.4"/&gt;
 *         &lt;element name="ItemText" type="{urn:sap-com:document:sap:rfc:functions}char50"/&gt;
 *         &lt;element name="Branch" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="BlineDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Pmnttrms" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="DsctDays1" type="{urn:sap-com:document:sap:rfc:functions}decimal3.0"/&gt;
 *         &lt;element name="DsctDays2" type="{urn:sap-com:document:sap:rfc:functions}decimal3.0"/&gt;
 *         &lt;element name="Netterms" type="{urn:sap-com:document:sap:rfc:functions}decimal3.0"/&gt;
 *         &lt;element name="DsctPct1" type="{urn:sap-com:document:sap:rfc:functions}decimal5.3"/&gt;
 *         &lt;element name="DsctPct2" type="{urn:sap-com:document:sap:rfc:functions}decimal5.3"/&gt;
 *         &lt;element name="DiscBase" type="{urn:sap-com:document:sap:rfc:functions}decimal23.4"/&gt;
 *         &lt;element name="DscAmtLc" type="{urn:sap-com:document:sap:rfc:functions}decimal23.4"/&gt;
 *         &lt;element name="DscAmtDc" type="{urn:sap-com:document:sap:rfc:functions}decimal23.4"/&gt;
 *         &lt;element name="PymtMeth" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="PmntBlock" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Fixedterms" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="InvRef" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="InvYear" type="{urn:sap-com:document:sap:rfc:functions}numeric4"/&gt;
 *         &lt;element name="InvItem" type="{urn:sap-com:document:sap:rfc:functions}numeric3"/&gt;
 *         &lt;element name="DunnBlock" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="DunnKey" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="LastDunn" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="DunnLevel" type="{urn:sap-com:document:sap:rfc:functions}numeric1"/&gt;
 *         &lt;element name="DunnArea" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="DocStatus" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="NxtDoctyp" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="VatRegNo" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="ReasonCde" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Pmtmthsupl" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="RefKey1" type="{urn:sap-com:document:sap:rfc:functions}char12"/&gt;
 *         &lt;element name="RefKey2" type="{urn:sap-com:document:sap:rfc:functions}char12"/&gt;
 *         &lt;element name="TCurrency" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/&gt;
 *         &lt;element name="Amount" type="{urn:sap-com:document:sap:rfc:functions}decimal23.4"/&gt;
 *         &lt;element name="NetAmount" type="{urn:sap-com:document:sap:rfc:functions}decimal23.4"/&gt;
 *         &lt;element name="Name" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="Name2" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="Name3" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="Name4" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="PostlCode" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="City" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="Country" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Street" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="PoBox" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="PobxPcd" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="PobkCurac" type="{urn:sap-com:document:sap:rfc:functions}char16"/&gt;
 *         &lt;element name="BankAcct" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="BankKey" type="{urn:sap-com:document:sap:rfc:functions}char15"/&gt;
 *         &lt;element name="BankCtry" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="TaxNo1" type="{urn:sap-com:document:sap:rfc:functions}char16"/&gt;
 *         &lt;element name="TaxNo2" type="{urn:sap-com:document:sap:rfc:functions}char11"/&gt;
 *         &lt;element name="Tax" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="EqualTax" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Region" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="CtrlKey" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="InstrKey" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="PayeeCode" type="{urn:sap-com:document:sap:rfc:functions}char16"/&gt;
 *         &lt;element name="Langu" type="{urn:sap-com:document:sap:rfc:functions}lang"/&gt;
 *         &lt;element name="BillLife" type="{urn:sap-com:document:sap:rfc:functions}decimal3.0"/&gt;
 *         &lt;element name="BeTaxcode" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="BilltaxLc" type="{urn:sap-com:document:sap:rfc:functions}decimal23.4"/&gt;
 *         &lt;element name="BilltaxFc" type="{urn:sap-com:document:sap:rfc:functions}decimal23.4"/&gt;
 *         &lt;element name="LcColChg" type="{urn:sap-com:document:sap:rfc:functions}decimal23.4"/&gt;
 *         &lt;element name="CollCharg" type="{urn:sap-com:document:sap:rfc:functions}decimal23.4"/&gt;
 *         &lt;element name="ChgsTxCd" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="IssueDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Usagedate" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="BillUsage" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Domicile" type="{urn:sap-com:document:sap:rfc:functions}char60"/&gt;
 *         &lt;element name="Drawer" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="CtrbnkLoc" type="{urn:sap-com:document:sap:rfc:functions}char60"/&gt;
 *         &lt;element name="DrawCity1" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="Drawee" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="DrawCity2" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="DisctDays" type="{urn:sap-com:document:sap:rfc:functions}decimal3.0"/&gt;
 *         &lt;element name="DisctRate" type="{urn:sap-com:document:sap:rfc:functions}decimal7.5"/&gt;
 *         &lt;element name="Accepted" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Billstatus" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="PrtestInd" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="BeDemand" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ObjType" type="{urn:sap-com:document:sap:rfc:functions}char5"/&gt;
 *         &lt;element name="RefDoc" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="RefOrgUn" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="ReversalDoc" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="SpGlType" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="NegPostng" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="RefDocNoLong" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="BillDoc" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bapi30072", propOrder = {
    "compCode",
    "customer",
    "spGlInd",
    "clearDate",
    "clrDocNo",
    "allocNmbr",
    "fiscYear",
    "docNo",
    "itemNum",
    "pstngDate",
    "docDate",
    "entryDate",
    "currency",
    "locCurrcy",
    "refDocNo",
    "docType",
    "fisPeriod",
    "postKey",
    "dbCrInd",
    "busArea",
    "taxCode",
    "lcAmount",
    "amtDoccur",
    "lcTax",
    "txDocCur",
    "itemText",
    "branch",
    "blineDate",
    "pmnttrms",
    "dsctDays1",
    "dsctDays2",
    "netterms",
    "dsctPct1",
    "dsctPct2",
    "discBase",
    "dscAmtLc",
    "dscAmtDc",
    "pymtMeth",
    "pmntBlock",
    "fixedterms",
    "invRef",
    "invYear",
    "invItem",
    "dunnBlock",
    "dunnKey",
    "lastDunn",
    "dunnLevel",
    "dunnArea",
    "docStatus",
    "nxtDoctyp",
    "vatRegNo",
    "reasonCde",
    "pmtmthsupl",
    "refKey1",
    "refKey2",
    "tCurrency",
    "amount",
    "netAmount",
    "name",
    "name2",
    "name3",
    "name4",
    "postlCode",
    "city",
    "country",
    "street",
    "poBox",
    "pobxPcd",
    "pobkCurac",
    "bankAcct",
    "bankKey",
    "bankCtry",
    "taxNo1",
    "taxNo2",
    "tax",
    "equalTax",
    "region",
    "ctrlKey",
    "instrKey",
    "payeeCode",
    "langu",
    "billLife",
    "beTaxcode",
    "billtaxLc",
    "billtaxFc",
    "lcColChg",
    "collCharg",
    "chgsTxCd",
    "issueDate",
    "usagedate",
    "billUsage",
    "domicile",
    "drawer",
    "ctrbnkLoc",
    "drawCity1",
    "drawee",
    "drawCity2",
    "disctDays",
    "disctRate",
    "accepted",
    "billstatus",
    "prtestInd",
    "beDemand",
    "objType",
    "refDoc",
    "refOrgUn",
    "reversalDoc",
    "spGlType",
    "negPostng",
    "refDocNoLong",
    "billDoc"
})
public class Bapi30072 {

    @XmlElement(name = "CompCode", required = true)
    protected String compCode;
    @XmlElement(name = "Customer", required = true)
    protected String customer;
    @XmlElement(name = "SpGlInd", required = true)
    protected String spGlInd;
    @XmlElement(name = "ClearDate", required = true)
    protected String clearDate;
    @XmlElement(name = "ClrDocNo", required = true)
    protected String clrDocNo;
    @XmlElement(name = "AllocNmbr", required = true)
    protected String allocNmbr;
    @XmlElement(name = "FiscYear", required = true)
    protected String fiscYear;
    @XmlElement(name = "DocNo", required = true)
    protected String docNo;
    @XmlElement(name = "ItemNum", required = true)
    protected String itemNum;
    @XmlElement(name = "PstngDate", required = true)
    protected String pstngDate;
    @XmlElement(name = "DocDate", required = true)
    protected String docDate;
    @XmlElement(name = "EntryDate", required = true)
    protected String entryDate;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "LocCurrcy", required = true)
    protected String locCurrcy;
    @XmlElement(name = "RefDocNo", required = true)
    protected String refDocNo;
    @XmlElement(name = "DocType", required = true)
    protected String docType;
    @XmlElement(name = "FisPeriod", required = true)
    protected String fisPeriod;
    @XmlElement(name = "PostKey", required = true)
    protected String postKey;
    @XmlElement(name = "DbCrInd", required = true)
    protected String dbCrInd;
    @XmlElement(name = "BusArea", required = true)
    protected String busArea;
    @XmlElement(name = "TaxCode", required = true)
    protected String taxCode;
    @XmlElement(name = "LcAmount", required = true)
    protected BigDecimal lcAmount;
    @XmlElement(name = "AmtDoccur", required = true)
    protected BigDecimal amtDoccur;
    @XmlElement(name = "LcTax", required = true)
    protected BigDecimal lcTax;
    @XmlElement(name = "TxDocCur", required = true)
    protected BigDecimal txDocCur;
    @XmlElement(name = "ItemText", required = true)
    protected String itemText;
    @XmlElement(name = "Branch", required = true)
    protected String branch;
    @XmlElement(name = "BlineDate", required = true)
    protected String blineDate;
    @XmlElement(name = "Pmnttrms", required = true)
    protected String pmnttrms;
    @XmlElement(name = "DsctDays1", required = true)
    protected BigDecimal dsctDays1;
    @XmlElement(name = "DsctDays2", required = true)
    protected BigDecimal dsctDays2;
    @XmlElement(name = "Netterms", required = true)
    protected BigDecimal netterms;
    @XmlElement(name = "DsctPct1", required = true)
    protected BigDecimal dsctPct1;
    @XmlElement(name = "DsctPct2", required = true)
    protected BigDecimal dsctPct2;
    @XmlElement(name = "DiscBase", required = true)
    protected BigDecimal discBase;
    @XmlElement(name = "DscAmtLc", required = true)
    protected BigDecimal dscAmtLc;
    @XmlElement(name = "DscAmtDc", required = true)
    protected BigDecimal dscAmtDc;
    @XmlElement(name = "PymtMeth", required = true)
    protected String pymtMeth;
    @XmlElement(name = "PmntBlock", required = true)
    protected String pmntBlock;
    @XmlElement(name = "Fixedterms", required = true)
    protected String fixedterms;
    @XmlElement(name = "InvRef", required = true)
    protected String invRef;
    @XmlElement(name = "InvYear", required = true)
    protected String invYear;
    @XmlElement(name = "InvItem", required = true)
    protected String invItem;
    @XmlElement(name = "DunnBlock", required = true)
    protected String dunnBlock;
    @XmlElement(name = "DunnKey", required = true)
    protected String dunnKey;
    @XmlElement(name = "LastDunn", required = true)
    protected String lastDunn;
    @XmlElement(name = "DunnLevel", required = true)
    protected String dunnLevel;
    @XmlElement(name = "DunnArea", required = true)
    protected String dunnArea;
    @XmlElement(name = "DocStatus", required = true)
    protected String docStatus;
    @XmlElement(name = "NxtDoctyp", required = true)
    protected String nxtDoctyp;
    @XmlElement(name = "VatRegNo", required = true)
    protected String vatRegNo;
    @XmlElement(name = "ReasonCde", required = true)
    protected String reasonCde;
    @XmlElement(name = "Pmtmthsupl", required = true)
    protected String pmtmthsupl;
    @XmlElement(name = "RefKey1", required = true)
    protected String refKey1;
    @XmlElement(name = "RefKey2", required = true)
    protected String refKey2;
    @XmlElement(name = "TCurrency", required = true)
    protected String tCurrency;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "NetAmount", required = true)
    protected BigDecimal netAmount;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Name2", required = true)
    protected String name2;
    @XmlElement(name = "Name3", required = true)
    protected String name3;
    @XmlElement(name = "Name4", required = true)
    protected String name4;
    @XmlElement(name = "PostlCode", required = true)
    protected String postlCode;
    @XmlElement(name = "City", required = true)
    protected String city;
    @XmlElement(name = "Country", required = true)
    protected String country;
    @XmlElement(name = "Street", required = true)
    protected String street;
    @XmlElement(name = "PoBox", required = true)
    protected String poBox;
    @XmlElement(name = "PobxPcd", required = true)
    protected String pobxPcd;
    @XmlElement(name = "PobkCurac", required = true)
    protected String pobkCurac;
    @XmlElement(name = "BankAcct", required = true)
    protected String bankAcct;
    @XmlElement(name = "BankKey", required = true)
    protected String bankKey;
    @XmlElement(name = "BankCtry", required = true)
    protected String bankCtry;
    @XmlElement(name = "TaxNo1", required = true)
    protected String taxNo1;
    @XmlElement(name = "TaxNo2", required = true)
    protected String taxNo2;
    @XmlElement(name = "Tax", required = true)
    protected String tax;
    @XmlElement(name = "EqualTax", required = true)
    protected String equalTax;
    @XmlElement(name = "Region", required = true)
    protected String region;
    @XmlElement(name = "CtrlKey", required = true)
    protected String ctrlKey;
    @XmlElement(name = "InstrKey", required = true)
    protected String instrKey;
    @XmlElement(name = "PayeeCode", required = true)
    protected String payeeCode;
    @XmlElement(name = "Langu", required = true)
    protected String langu;
    @XmlElement(name = "BillLife", required = true)
    protected BigDecimal billLife;
    @XmlElement(name = "BeTaxcode", required = true)
    protected String beTaxcode;
    @XmlElement(name = "BilltaxLc", required = true)
    protected BigDecimal billtaxLc;
    @XmlElement(name = "BilltaxFc", required = true)
    protected BigDecimal billtaxFc;
    @XmlElement(name = "LcColChg", required = true)
    protected BigDecimal lcColChg;
    @XmlElement(name = "CollCharg", required = true)
    protected BigDecimal collCharg;
    @XmlElement(name = "ChgsTxCd", required = true)
    protected String chgsTxCd;
    @XmlElement(name = "IssueDate", required = true)
    protected String issueDate;
    @XmlElement(name = "Usagedate", required = true)
    protected String usagedate;
    @XmlElement(name = "BillUsage", required = true)
    protected String billUsage;
    @XmlElement(name = "Domicile", required = true)
    protected String domicile;
    @XmlElement(name = "Drawer", required = true)
    protected String drawer;
    @XmlElement(name = "CtrbnkLoc", required = true)
    protected String ctrbnkLoc;
    @XmlElement(name = "DrawCity1", required = true)
    protected String drawCity1;
    @XmlElement(name = "Drawee", required = true)
    protected String drawee;
    @XmlElement(name = "DrawCity2", required = true)
    protected String drawCity2;
    @XmlElement(name = "DisctDays", required = true)
    protected BigDecimal disctDays;
    @XmlElement(name = "DisctRate", required = true)
    protected BigDecimal disctRate;
    @XmlElement(name = "Accepted", required = true)
    protected String accepted;
    @XmlElement(name = "Billstatus", required = true)
    protected String billstatus;
    @XmlElement(name = "PrtestInd", required = true)
    protected String prtestInd;
    @XmlElement(name = "BeDemand", required = true)
    protected String beDemand;
    @XmlElement(name = "ObjType", required = true)
    protected String objType;
    @XmlElement(name = "RefDoc", required = true)
    protected String refDoc;
    @XmlElement(name = "RefOrgUn", required = true)
    protected String refOrgUn;
    @XmlElement(name = "ReversalDoc", required = true)
    protected String reversalDoc;
    @XmlElement(name = "SpGlType", required = true)
    protected String spGlType;
    @XmlElement(name = "NegPostng", required = true)
    protected String negPostng;
    @XmlElement(name = "RefDocNoLong", required = true)
    protected String refDocNoLong;
    @XmlElement(name = "BillDoc", required = true)
    protected String billDoc;

    /**
     * compCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompCode() {
        return compCode;
    }

    /**
     * compCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompCode(String value) {
        this.compCode = value;
    }

    /**
     * customer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * customer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer(String value) {
        this.customer = value;
    }

    /**
     * spGlInd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpGlInd() {
        return spGlInd;
    }

    /**
     * spGlInd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpGlInd(String value) {
        this.spGlInd = value;
    }

    /**
     * clearDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearDate() {
        return clearDate;
    }

    /**
     * clearDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearDate(String value) {
        this.clearDate = value;
    }

    /**
     * clrDocNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrDocNo() {
        return clrDocNo;
    }

    /**
     * clrDocNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClrDocNo(String value) {
        this.clrDocNo = value;
    }

    /**
     * allocNmbr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllocNmbr() {
        return allocNmbr;
    }

    /**
     * allocNmbr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllocNmbr(String value) {
        this.allocNmbr = value;
    }

    /**
     * fiscYear 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiscYear() {
        return fiscYear;
    }

    /**
     * fiscYear 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiscYear(String value) {
        this.fiscYear = value;
    }

    /**
     * docNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNo() {
        return docNo;
    }

    /**
     * docNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNo(String value) {
        this.docNo = value;
    }

    /**
     * itemNum 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemNum() {
        return itemNum;
    }

    /**
     * itemNum 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemNum(String value) {
        this.itemNum = value;
    }

    /**
     * pstngDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstngDate() {
        return pstngDate;
    }

    /**
     * pstngDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstngDate(String value) {
        this.pstngDate = value;
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
     * entryDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryDate() {
        return entryDate;
    }

    /**
     * entryDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryDate(String value) {
        this.entryDate = value;
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
     * locCurrcy 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocCurrcy() {
        return locCurrcy;
    }

    /**
     * locCurrcy 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocCurrcy(String value) {
        this.locCurrcy = value;
    }

    /**
     * refDocNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefDocNo() {
        return refDocNo;
    }

    /**
     * refDocNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefDocNo(String value) {
        this.refDocNo = value;
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
     * fisPeriod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFisPeriod() {
        return fisPeriod;
    }

    /**
     * fisPeriod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFisPeriod(String value) {
        this.fisPeriod = value;
    }

    /**
     * postKey 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostKey() {
        return postKey;
    }

    /**
     * postKey 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostKey(String value) {
        this.postKey = value;
    }

    /**
     * dbCrInd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbCrInd() {
        return dbCrInd;
    }

    /**
     * dbCrInd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbCrInd(String value) {
        this.dbCrInd = value;
    }

    /**
     * busArea 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusArea() {
        return busArea;
    }

    /**
     * busArea 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusArea(String value) {
        this.busArea = value;
    }

    /**
     * taxCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * taxCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }

    /**
     * lcAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLcAmount() {
        return lcAmount;
    }

    /**
     * lcAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLcAmount(BigDecimal value) {
        this.lcAmount = value;
    }

    /**
     * amtDoccur 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmtDoccur() {
        return amtDoccur;
    }

    /**
     * amtDoccur 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmtDoccur(BigDecimal value) {
        this.amtDoccur = value;
    }

    /**
     * lcTax 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLcTax() {
        return lcTax;
    }

    /**
     * lcTax 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLcTax(BigDecimal value) {
        this.lcTax = value;
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
     * itemText 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemText() {
        return itemText;
    }

    /**
     * itemText 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemText(String value) {
        this.itemText = value;
    }

    /**
     * branch 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranch() {
        return branch;
    }

    /**
     * branch 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranch(String value) {
        this.branch = value;
    }

    /**
     * blineDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlineDate() {
        return blineDate;
    }

    /**
     * blineDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlineDate(String value) {
        this.blineDate = value;
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
     * dsctDays1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDsctDays1() {
        return dsctDays1;
    }

    /**
     * dsctDays1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDsctDays1(BigDecimal value) {
        this.dsctDays1 = value;
    }

    /**
     * dsctDays2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDsctDays2() {
        return dsctDays2;
    }

    /**
     * dsctDays2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDsctDays2(BigDecimal value) {
        this.dsctDays2 = value;
    }

    /**
     * netterms 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetterms() {
        return netterms;
    }

    /**
     * netterms 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetterms(BigDecimal value) {
        this.netterms = value;
    }

    /**
     * dsctPct1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDsctPct1() {
        return dsctPct1;
    }

    /**
     * dsctPct1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDsctPct1(BigDecimal value) {
        this.dsctPct1 = value;
    }

    /**
     * dsctPct2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDsctPct2() {
        return dsctPct2;
    }

    /**
     * dsctPct2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDsctPct2(BigDecimal value) {
        this.dsctPct2 = value;
    }

    /**
     * discBase 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscBase() {
        return discBase;
    }

    /**
     * discBase 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscBase(BigDecimal value) {
        this.discBase = value;
    }

    /**
     * dscAmtLc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDscAmtLc() {
        return dscAmtLc;
    }

    /**
     * dscAmtLc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDscAmtLc(BigDecimal value) {
        this.dscAmtLc = value;
    }

    /**
     * dscAmtDc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDscAmtDc() {
        return dscAmtDc;
    }

    /**
     * dscAmtDc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDscAmtDc(BigDecimal value) {
        this.dscAmtDc = value;
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
     * pmntBlock 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmntBlock() {
        return pmntBlock;
    }

    /**
     * pmntBlock 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmntBlock(String value) {
        this.pmntBlock = value;
    }

    /**
     * fixedterms 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixedterms() {
        return fixedterms;
    }

    /**
     * fixedterms 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixedterms(String value) {
        this.fixedterms = value;
    }

    /**
     * invRef 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvRef() {
        return invRef;
    }

    /**
     * invRef 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvRef(String value) {
        this.invRef = value;
    }

    /**
     * invYear 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvYear() {
        return invYear;
    }

    /**
     * invYear 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvYear(String value) {
        this.invYear = value;
    }

    /**
     * invItem 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvItem() {
        return invItem;
    }

    /**
     * invItem 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvItem(String value) {
        this.invItem = value;
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
     * lastDunn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastDunn() {
        return lastDunn;
    }

    /**
     * lastDunn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastDunn(String value) {
        this.lastDunn = value;
    }

    /**
     * dunnLevel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDunnLevel() {
        return dunnLevel;
    }

    /**
     * dunnLevel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDunnLevel(String value) {
        this.dunnLevel = value;
    }

    /**
     * dunnArea 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDunnArea() {
        return dunnArea;
    }

    /**
     * dunnArea 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDunnArea(String value) {
        this.dunnArea = value;
    }

    /**
     * docStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocStatus() {
        return docStatus;
    }

    /**
     * docStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocStatus(String value) {
        this.docStatus = value;
    }

    /**
     * nxtDoctyp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNxtDoctyp() {
        return nxtDoctyp;
    }

    /**
     * nxtDoctyp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNxtDoctyp(String value) {
        this.nxtDoctyp = value;
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
     * reasonCde 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCde() {
        return reasonCde;
    }

    /**
     * reasonCde 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCde(String value) {
        this.reasonCde = value;
    }

    /**
     * pmtmthsupl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtmthsupl() {
        return pmtmthsupl;
    }

    /**
     * pmtmthsupl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtmthsupl(String value) {
        this.pmtmthsupl = value;
    }

    /**
     * refKey1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefKey1() {
        return refKey1;
    }

    /**
     * refKey1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefKey1(String value) {
        this.refKey1 = value;
    }

    /**
     * refKey2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefKey2() {
        return refKey2;
    }

    /**
     * refKey2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefKey2(String value) {
        this.refKey2 = value;
    }

    /**
     * tCurrency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTCurrency() {
        return tCurrency;
    }

    /**
     * tCurrency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTCurrency(String value) {
        this.tCurrency = value;
    }

    /**
     * amount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * amount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * netAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetAmount() {
        return netAmount;
    }

    /**
     * netAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetAmount(BigDecimal value) {
        this.netAmount = value;
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
     * pobkCurac 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPobkCurac() {
        return pobkCurac;
    }

    /**
     * pobkCurac 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPobkCurac(String value) {
        this.pobkCurac = value;
    }

    /**
     * bankAcct 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAcct() {
        return bankAcct;
    }

    /**
     * bankAcct 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAcct(String value) {
        this.bankAcct = value;
    }

    /**
     * bankKey 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankKey() {
        return bankKey;
    }

    /**
     * bankKey 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankKey(String value) {
        this.bankKey = value;
    }

    /**
     * bankCtry 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCtry() {
        return bankCtry;
    }

    /**
     * bankCtry 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCtry(String value) {
        this.bankCtry = value;
    }

    /**
     * taxNo1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxNo1() {
        return taxNo1;
    }

    /**
     * taxNo1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxNo1(String value) {
        this.taxNo1 = value;
    }

    /**
     * taxNo2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxNo2() {
        return taxNo2;
    }

    /**
     * taxNo2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxNo2(String value) {
        this.taxNo2 = value;
    }

    /**
     * tax 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTax() {
        return tax;
    }

    /**
     * tax 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTax(String value) {
        this.tax = value;
    }

    /**
     * equalTax 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEqualTax() {
        return equalTax;
    }

    /**
     * equalTax 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEqualTax(String value) {
        this.equalTax = value;
    }

    /**
     * region 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * region 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * ctrlKey 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrlKey() {
        return ctrlKey;
    }

    /**
     * ctrlKey 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrlKey(String value) {
        this.ctrlKey = value;
    }

    /**
     * instrKey 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrKey() {
        return instrKey;
    }

    /**
     * instrKey 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrKey(String value) {
        this.instrKey = value;
    }

    /**
     * payeeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeCode() {
        return payeeCode;
    }

    /**
     * payeeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeCode(String value) {
        this.payeeCode = value;
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
     * billLife 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBillLife() {
        return billLife;
    }

    /**
     * billLife 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBillLife(BigDecimal value) {
        this.billLife = value;
    }

    /**
     * beTaxcode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeTaxcode() {
        return beTaxcode;
    }

    /**
     * beTaxcode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeTaxcode(String value) {
        this.beTaxcode = value;
    }

    /**
     * billtaxLc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBilltaxLc() {
        return billtaxLc;
    }

    /**
     * billtaxLc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBilltaxLc(BigDecimal value) {
        this.billtaxLc = value;
    }

    /**
     * billtaxFc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBilltaxFc() {
        return billtaxFc;
    }

    /**
     * billtaxFc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBilltaxFc(BigDecimal value) {
        this.billtaxFc = value;
    }

    /**
     * lcColChg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLcColChg() {
        return lcColChg;
    }

    /**
     * lcColChg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLcColChg(BigDecimal value) {
        this.lcColChg = value;
    }

    /**
     * collCharg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCollCharg() {
        return collCharg;
    }

    /**
     * collCharg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCollCharg(BigDecimal value) {
        this.collCharg = value;
    }

    /**
     * chgsTxCd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChgsTxCd() {
        return chgsTxCd;
    }

    /**
     * chgsTxCd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChgsTxCd(String value) {
        this.chgsTxCd = value;
    }

    /**
     * issueDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * issueDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueDate(String value) {
        this.issueDate = value;
    }

    /**
     * usagedate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsagedate() {
        return usagedate;
    }

    /**
     * usagedate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsagedate(String value) {
        this.usagedate = value;
    }

    /**
     * billUsage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillUsage() {
        return billUsage;
    }

    /**
     * billUsage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillUsage(String value) {
        this.billUsage = value;
    }

    /**
     * domicile 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomicile() {
        return domicile;
    }

    /**
     * domicile 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomicile(String value) {
        this.domicile = value;
    }

    /**
     * drawer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrawer() {
        return drawer;
    }

    /**
     * drawer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrawer(String value) {
        this.drawer = value;
    }

    /**
     * ctrbnkLoc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrbnkLoc() {
        return ctrbnkLoc;
    }

    /**
     * ctrbnkLoc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrbnkLoc(String value) {
        this.ctrbnkLoc = value;
    }

    /**
     * drawCity1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrawCity1() {
        return drawCity1;
    }

    /**
     * drawCity1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrawCity1(String value) {
        this.drawCity1 = value;
    }

    /**
     * drawee 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrawee() {
        return drawee;
    }

    /**
     * drawee 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrawee(String value) {
        this.drawee = value;
    }

    /**
     * drawCity2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrawCity2() {
        return drawCity2;
    }

    /**
     * drawCity2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrawCity2(String value) {
        this.drawCity2 = value;
    }

    /**
     * disctDays 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisctDays() {
        return disctDays;
    }

    /**
     * disctDays 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisctDays(BigDecimal value) {
        this.disctDays = value;
    }

    /**
     * disctRate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisctRate() {
        return disctRate;
    }

    /**
     * disctRate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisctRate(BigDecimal value) {
        this.disctRate = value;
    }

    /**
     * accepted 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccepted() {
        return accepted;
    }

    /**
     * accepted 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccepted(String value) {
        this.accepted = value;
    }

    /**
     * billstatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillstatus() {
        return billstatus;
    }

    /**
     * billstatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillstatus(String value) {
        this.billstatus = value;
    }

    /**
     * prtestInd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtestInd() {
        return prtestInd;
    }

    /**
     * prtestInd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtestInd(String value) {
        this.prtestInd = value;
    }

    /**
     * beDemand 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeDemand() {
        return beDemand;
    }

    /**
     * beDemand 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeDemand(String value) {
        this.beDemand = value;
    }

    /**
     * objType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjType() {
        return objType;
    }

    /**
     * objType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjType(String value) {
        this.objType = value;
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
     * refOrgUn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefOrgUn() {
        return refOrgUn;
    }

    /**
     * refOrgUn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefOrgUn(String value) {
        this.refOrgUn = value;
    }

    /**
     * reversalDoc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReversalDoc() {
        return reversalDoc;
    }

    /**
     * reversalDoc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReversalDoc(String value) {
        this.reversalDoc = value;
    }

    /**
     * spGlType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpGlType() {
        return spGlType;
    }

    /**
     * spGlType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpGlType(String value) {
        this.spGlType = value;
    }

    /**
     * negPostng 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegPostng() {
        return negPostng;
    }

    /**
     * negPostng 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegPostng(String value) {
        this.negPostng = value;
    }

    /**
     * refDocNoLong 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefDocNoLong() {
        return refDocNoLong;
    }

    /**
     * refDocNoLong 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefDocNoLong(String value) {
        this.refDocNoLong = value;
    }

    /**
     * billDoc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillDoc() {
        return billDoc;
    }

    /**
     * billDoc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillDoc(String value) {
        this.billDoc = value;
    }

}
