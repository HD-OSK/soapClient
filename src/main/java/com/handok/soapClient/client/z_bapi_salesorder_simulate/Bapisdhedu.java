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
 * <p>Bapisdhedu complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Bapisdhedu"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Operation" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="DocNumber" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="ItmNumber" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="SchedLine" type="{urn:sap-com:document:sap:rfc:functions}numeric4"/&gt;
 *         &lt;element name="SchedType" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Relfordel" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ReqDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="ReqTime" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="ReqQty" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="ConfirQty" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="SalesUnit" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="Isocodunit" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="ReqQty1" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="BaseUom" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="Isobasunit" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="ReqDate1" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="ReqType" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Pltype" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Busidocnr" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Busiitnr" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="SchedLin1" type="{urn:sap-com:document:sap:rfc:functions}numeric4"/&gt;
 *         &lt;element name="EarlDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="MaintReq" type="{urn:sap-com:document:sap:rfc:functions}numeric10"/&gt;
 *         &lt;element name="PreqNo" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="PoType" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="DocCat" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ConfStat" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="IrInd" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Returndate" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="DateType" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TpDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="MsDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="LoadDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="GiDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="CorrQty" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="ReqDlvBl" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="GrpDefin" type="{urn:sap-com:document:sap:rfc:functions}numeric3"/&gt;
 *         &lt;element name="Releastyp" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ForcastNr" type="{urn:sap-com:document:sap:rfc:functions}numeric10"/&gt;
 *         &lt;element name="CommitQty" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="Size2" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="Size3" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="UnitMeas" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="IsoRomei" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Formulakey" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Salesqtynr" type="{urn:sap-com:document:sap:rfc:functions}decimal5.0"/&gt;
 *         &lt;element name="Salesqtyde" type="{urn:sap-com:document:sap:rfc:functions}decimal5.0"/&gt;
 *         &lt;element name="AvailCon" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="MoveType" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="PreqItem" type="{urn:sap-com:document:sap:rfc:functions}numeric5"/&gt;
 *         &lt;element name="LintypEdi" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Orderid" type="{urn:sap-com:document:sap:rfc:functions}char12"/&gt;
 *         &lt;element name="Planordnr" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="BomexplNo" type="{urn:sap-com:document:sap:rfc:functions}char8"/&gt;
 *         &lt;element name="Custchstat" type="{urn:sap-com:document:sap:rfc:functions}char17"/&gt;
 *         &lt;element name="Guranteed" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="MsTime" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="TpTime" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="LoadTime" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="GiTime" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="Routesched" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bapisdhedu", propOrder = {
    "operation",
    "docNumber",
    "itmNumber",
    "schedLine",
    "schedType",
    "relfordel",
    "reqDate",
    "reqTime",
    "reqQty",
    "confirQty",
    "salesUnit",
    "isocodunit",
    "reqQty1",
    "baseUom",
    "isobasunit",
    "reqDate1",
    "reqType",
    "pltype",
    "busidocnr",
    "busiitnr",
    "schedLin1",
    "earlDate",
    "maintReq",
    "preqNo",
    "poType",
    "docCat",
    "confStat",
    "irInd",
    "returndate",
    "dateType",
    "tpDate",
    "msDate",
    "loadDate",
    "giDate",
    "corrQty",
    "reqDlvBl",
    "grpDefin",
    "releastyp",
    "forcastNr",
    "commitQty",
    "size2",
    "size3",
    "unitMeas",
    "isoRomei",
    "formulakey",
    "salesqtynr",
    "salesqtyde",
    "availCon",
    "moveType",
    "preqItem",
    "lintypEdi",
    "orderid",
    "planordnr",
    "bomexplNo",
    "custchstat",
    "guranteed",
    "msTime",
    "tpTime",
    "loadTime",
    "giTime",
    "routesched"
})
public class Bapisdhedu {

    @XmlElement(name = "Operation", required = true)
    protected String operation;
    @XmlElement(name = "DocNumber", required = true)
    protected String docNumber;
    @XmlElement(name = "ItmNumber", required = true)
    protected String itmNumber;
    @XmlElement(name = "SchedLine", required = true)
    protected String schedLine;
    @XmlElement(name = "SchedType", required = true)
    protected String schedType;
    @XmlElement(name = "Relfordel", required = true)
    protected String relfordel;
    @XmlElement(name = "ReqDate", required = true)
    protected String reqDate;
    @XmlElement(name = "ReqTime", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar reqTime;
    @XmlElement(name = "ReqQty", required = true)
    protected BigDecimal reqQty;
    @XmlElement(name = "ConfirQty", required = true)
    protected BigDecimal confirQty;
    @XmlElement(name = "SalesUnit", required = true)
    protected String salesUnit;
    @XmlElement(name = "Isocodunit", required = true)
    protected String isocodunit;
    @XmlElement(name = "ReqQty1", required = true)
    protected BigDecimal reqQty1;
    @XmlElement(name = "BaseUom", required = true)
    protected String baseUom;
    @XmlElement(name = "Isobasunit", required = true)
    protected String isobasunit;
    @XmlElement(name = "ReqDate1", required = true)
    protected String reqDate1;
    @XmlElement(name = "ReqType", required = true)
    protected String reqType;
    @XmlElement(name = "Pltype", required = true)
    protected String pltype;
    @XmlElement(name = "Busidocnr", required = true)
    protected String busidocnr;
    @XmlElement(name = "Busiitnr", required = true)
    protected String busiitnr;
    @XmlElement(name = "SchedLin1", required = true)
    protected String schedLin1;
    @XmlElement(name = "EarlDate", required = true)
    protected String earlDate;
    @XmlElement(name = "MaintReq", required = true)
    protected String maintReq;
    @XmlElement(name = "PreqNo", required = true)
    protected String preqNo;
    @XmlElement(name = "PoType", required = true)
    protected String poType;
    @XmlElement(name = "DocCat", required = true)
    protected String docCat;
    @XmlElement(name = "ConfStat", required = true)
    protected String confStat;
    @XmlElement(name = "IrInd", required = true)
    protected String irInd;
    @XmlElement(name = "Returndate", required = true)
    protected String returndate;
    @XmlElement(name = "DateType", required = true)
    protected String dateType;
    @XmlElement(name = "TpDate", required = true)
    protected String tpDate;
    @XmlElement(name = "MsDate", required = true)
    protected String msDate;
    @XmlElement(name = "LoadDate", required = true)
    protected String loadDate;
    @XmlElement(name = "GiDate", required = true)
    protected String giDate;
    @XmlElement(name = "CorrQty", required = true)
    protected BigDecimal corrQty;
    @XmlElement(name = "ReqDlvBl", required = true)
    protected String reqDlvBl;
    @XmlElement(name = "GrpDefin", required = true)
    protected String grpDefin;
    @XmlElement(name = "Releastyp", required = true)
    protected String releastyp;
    @XmlElement(name = "ForcastNr", required = true)
    protected String forcastNr;
    @XmlElement(name = "CommitQty", required = true)
    protected BigDecimal commitQty;
    @XmlElement(name = "Size2", required = true)
    protected BigDecimal size2;
    @XmlElement(name = "Size3", required = true)
    protected BigDecimal size3;
    @XmlElement(name = "UnitMeas", required = true)
    protected String unitMeas;
    @XmlElement(name = "IsoRomei", required = true)
    protected String isoRomei;
    @XmlElement(name = "Formulakey", required = true)
    protected String formulakey;
    @XmlElement(name = "Salesqtynr", required = true)
    protected BigDecimal salesqtynr;
    @XmlElement(name = "Salesqtyde", required = true)
    protected BigDecimal salesqtyde;
    @XmlElement(name = "AvailCon", required = true)
    protected String availCon;
    @XmlElement(name = "MoveType", required = true)
    protected String moveType;
    @XmlElement(name = "PreqItem", required = true)
    protected String preqItem;
    @XmlElement(name = "LintypEdi", required = true)
    protected String lintypEdi;
    @XmlElement(name = "Orderid", required = true)
    protected String orderid;
    @XmlElement(name = "Planordnr", required = true)
    protected String planordnr;
    @XmlElement(name = "BomexplNo", required = true)
    protected String bomexplNo;
    @XmlElement(name = "Custchstat", required = true)
    protected String custchstat;
    @XmlElement(name = "Guranteed")
    protected float guranteed;
    @XmlElement(name = "MsTime", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar msTime;
    @XmlElement(name = "TpTime", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar tpTime;
    @XmlElement(name = "LoadTime", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar loadTime;
    @XmlElement(name = "GiTime", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar giTime;
    @XmlElement(name = "Routesched", required = true)
    protected String routesched;

    /**
     * operation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * operation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

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
     * schedLine 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchedLine() {
        return schedLine;
    }

    /**
     * schedLine 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchedLine(String value) {
        this.schedLine = value;
    }

    /**
     * schedType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchedType() {
        return schedType;
    }

    /**
     * schedType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchedType(String value) {
        this.schedType = value;
    }

    /**
     * relfordel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelfordel() {
        return relfordel;
    }

    /**
     * relfordel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelfordel(String value) {
        this.relfordel = value;
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
     * confirQty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConfirQty() {
        return confirQty;
    }

    /**
     * confirQty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConfirQty(BigDecimal value) {
        this.confirQty = value;
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
     * isocodunit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsocodunit() {
        return isocodunit;
    }

    /**
     * isocodunit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsocodunit(String value) {
        this.isocodunit = value;
    }

    /**
     * reqQty1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReqQty1() {
        return reqQty1;
    }

    /**
     * reqQty1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReqQty1(BigDecimal value) {
        this.reqQty1 = value;
    }

    /**
     * baseUom 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseUom() {
        return baseUom;
    }

    /**
     * baseUom 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseUom(String value) {
        this.baseUom = value;
    }

    /**
     * isobasunit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsobasunit() {
        return isobasunit;
    }

    /**
     * isobasunit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsobasunit(String value) {
        this.isobasunit = value;
    }

    /**
     * reqDate1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqDate1() {
        return reqDate1;
    }

    /**
     * reqDate1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqDate1(String value) {
        this.reqDate1 = value;
    }

    /**
     * reqType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqType() {
        return reqType;
    }

    /**
     * reqType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqType(String value) {
        this.reqType = value;
    }

    /**
     * pltype 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPltype() {
        return pltype;
    }

    /**
     * pltype 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPltype(String value) {
        this.pltype = value;
    }

    /**
     * busidocnr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusidocnr() {
        return busidocnr;
    }

    /**
     * busidocnr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusidocnr(String value) {
        this.busidocnr = value;
    }

    /**
     * busiitnr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusiitnr() {
        return busiitnr;
    }

    /**
     * busiitnr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusiitnr(String value) {
        this.busiitnr = value;
    }

    /**
     * schedLin1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchedLin1() {
        return schedLin1;
    }

    /**
     * schedLin1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchedLin1(String value) {
        this.schedLin1 = value;
    }

    /**
     * earlDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarlDate() {
        return earlDate;
    }

    /**
     * earlDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarlDate(String value) {
        this.earlDate = value;
    }

    /**
     * maintReq 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaintReq() {
        return maintReq;
    }

    /**
     * maintReq 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaintReq(String value) {
        this.maintReq = value;
    }

    /**
     * preqNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreqNo() {
        return preqNo;
    }

    /**
     * preqNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreqNo(String value) {
        this.preqNo = value;
    }

    /**
     * poType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoType() {
        return poType;
    }

    /**
     * poType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoType(String value) {
        this.poType = value;
    }

    /**
     * docCat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocCat() {
        return docCat;
    }

    /**
     * docCat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocCat(String value) {
        this.docCat = value;
    }

    /**
     * confStat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfStat() {
        return confStat;
    }

    /**
     * confStat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfStat(String value) {
        this.confStat = value;
    }

    /**
     * irInd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIrInd() {
        return irInd;
    }

    /**
     * irInd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIrInd(String value) {
        this.irInd = value;
    }

    /**
     * returndate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturndate() {
        return returndate;
    }

    /**
     * returndate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturndate(String value) {
        this.returndate = value;
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
     * tpDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpDate() {
        return tpDate;
    }

    /**
     * tpDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpDate(String value) {
        this.tpDate = value;
    }

    /**
     * msDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsDate() {
        return msDate;
    }

    /**
     * msDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsDate(String value) {
        this.msDate = value;
    }

    /**
     * loadDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadDate() {
        return loadDate;
    }

    /**
     * loadDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadDate(String value) {
        this.loadDate = value;
    }

    /**
     * giDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiDate() {
        return giDate;
    }

    /**
     * giDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiDate(String value) {
        this.giDate = value;
    }

    /**
     * corrQty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCorrQty() {
        return corrQty;
    }

    /**
     * corrQty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCorrQty(BigDecimal value) {
        this.corrQty = value;
    }

    /**
     * reqDlvBl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqDlvBl() {
        return reqDlvBl;
    }

    /**
     * reqDlvBl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqDlvBl(String value) {
        this.reqDlvBl = value;
    }

    /**
     * grpDefin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpDefin() {
        return grpDefin;
    }

    /**
     * grpDefin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrpDefin(String value) {
        this.grpDefin = value;
    }

    /**
     * releastyp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleastyp() {
        return releastyp;
    }

    /**
     * releastyp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleastyp(String value) {
        this.releastyp = value;
    }

    /**
     * forcastNr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForcastNr() {
        return forcastNr;
    }

    /**
     * forcastNr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForcastNr(String value) {
        this.forcastNr = value;
    }

    /**
     * commitQty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommitQty() {
        return commitQty;
    }

    /**
     * commitQty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommitQty(BigDecimal value) {
        this.commitQty = value;
    }

    /**
     * size2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSize2() {
        return size2;
    }

    /**
     * size2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSize2(BigDecimal value) {
        this.size2 = value;
    }

    /**
     * size3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSize3() {
        return size3;
    }

    /**
     * size3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSize3(BigDecimal value) {
        this.size3 = value;
    }

    /**
     * unitMeas 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitMeas() {
        return unitMeas;
    }

    /**
     * unitMeas 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitMeas(String value) {
        this.unitMeas = value;
    }

    /**
     * isoRomei 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoRomei() {
        return isoRomei;
    }

    /**
     * isoRomei 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoRomei(String value) {
        this.isoRomei = value;
    }

    /**
     * formulakey 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormulakey() {
        return formulakey;
    }

    /**
     * formulakey 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormulakey(String value) {
        this.formulakey = value;
    }

    /**
     * salesqtynr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalesqtynr() {
        return salesqtynr;
    }

    /**
     * salesqtynr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalesqtynr(BigDecimal value) {
        this.salesqtynr = value;
    }

    /**
     * salesqtyde 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalesqtyde() {
        return salesqtyde;
    }

    /**
     * salesqtyde 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalesqtyde(BigDecimal value) {
        this.salesqtyde = value;
    }

    /**
     * availCon 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailCon() {
        return availCon;
    }

    /**
     * availCon 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailCon(String value) {
        this.availCon = value;
    }

    /**
     * moveType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoveType() {
        return moveType;
    }

    /**
     * moveType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoveType(String value) {
        this.moveType = value;
    }

    /**
     * preqItem 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreqItem() {
        return preqItem;
    }

    /**
     * preqItem 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreqItem(String value) {
        this.preqItem = value;
    }

    /**
     * lintypEdi 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLintypEdi() {
        return lintypEdi;
    }

    /**
     * lintypEdi 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLintypEdi(String value) {
        this.lintypEdi = value;
    }

    /**
     * orderid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * orderid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderid(String value) {
        this.orderid = value;
    }

    /**
     * planordnr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanordnr() {
        return planordnr;
    }

    /**
     * planordnr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanordnr(String value) {
        this.planordnr = value;
    }

    /**
     * bomexplNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBomexplNo() {
        return bomexplNo;
    }

    /**
     * bomexplNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBomexplNo(String value) {
        this.bomexplNo = value;
    }

    /**
     * custchstat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustchstat() {
        return custchstat;
    }

    /**
     * custchstat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustchstat(String value) {
        this.custchstat = value;
    }

    /**
     * guranteed 속성의 값을 가져옵니다.
     * 
     */
    public float getGuranteed() {
        return guranteed;
    }

    /**
     * guranteed 속성의 값을 설정합니다.
     * 
     */
    public void setGuranteed(float value) {
        this.guranteed = value;
    }

    /**
     * msTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMsTime() {
        return msTime;
    }

    /**
     * msTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMsTime(XMLGregorianCalendar value) {
        this.msTime = value;
    }

    /**
     * tpTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTpTime() {
        return tpTime;
    }

    /**
     * tpTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTpTime(XMLGregorianCalendar value) {
        this.tpTime = value;
    }

    /**
     * loadTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLoadTime() {
        return loadTime;
    }

    /**
     * loadTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLoadTime(XMLGregorianCalendar value) {
        this.loadTime = value;
    }

    /**
     * giTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGiTime() {
        return giTime;
    }

    /**
     * giTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGiTime(XMLGregorianCalendar value) {
        this.giTime = value;
    }

    /**
     * routesched 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutesched() {
        return routesched;
    }

    /**
     * routesched 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutesched(String value) {
        this.routesched = value;
    }

}
