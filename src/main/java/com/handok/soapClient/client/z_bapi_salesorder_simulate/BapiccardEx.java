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
 * <p>BapiccardEx complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="BapiccardEx"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PayType" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="CcType" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="CcNumber" type="{urn:sap-com:document:sap:rfc:functions}char25"/&gt;
 *         &lt;element name="CcSeqNo" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="CcValidF" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="CcValidT" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="CcName" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="Authamount" type="{urn:sap-com:document:sap:rfc:functions}decimal23.4"/&gt;
 *         &lt;element name="Currency" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/&gt;
 *         &lt;element name="CurrIso" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="AuthDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="AuthTime" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="Merchidcl" type="{urn:sap-com:document:sap:rfc:functions}char15"/&gt;
 *         &lt;element name="Terminal" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Billamount" type="{urn:sap-com:document:sap:rfc:functions}decimal23.4"/&gt;
 *         &lt;element name="CcLiAmount" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="CcAutthNo" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Billstatus" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Dataorigin" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="CcSettled" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="AuthRefno" type="{urn:sap-com:document:sap:rfc:functions}char15"/&gt;
 *         &lt;element name="Ptofrcpt" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="CcReact" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="AuthFlag" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="BillPlan" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="BillPlani" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="CcReAmount" type="{urn:sap-com:document:sap:rfc:functions}decimal23.4"/&gt;
 *         &lt;element name="GlAccount" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="CcStatEx" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="CcReactT" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="Rfcaut" type="{urn:sap-com:document:sap:rfc:functions}char32"/&gt;
 *         &lt;element name="AutSetinit" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="AutSetinfo" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="PreAuth" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BapiccardEx", propOrder = {
    "payType",
    "ccType",
    "ccNumber",
    "ccSeqNo",
    "ccValidF",
    "ccValidT",
    "ccName",
    "authamount",
    "currency",
    "currIso",
    "authDate",
    "authTime",
    "merchidcl",
    "terminal",
    "billamount",
    "ccLiAmount",
    "ccAutthNo",
    "billstatus",
    "dataorigin",
    "ccSettled",
    "authRefno",
    "ptofrcpt",
    "ccReact",
    "authFlag",
    "billPlan",
    "billPlani",
    "ccReAmount",
    "glAccount",
    "ccStatEx",
    "ccReactT",
    "rfcaut",
    "autSetinit",
    "autSetinfo",
    "preAuth"
})
public class BapiccardEx {

    @XmlElement(name = "PayType", required = true)
    protected String payType;
    @XmlElement(name = "CcType", required = true)
    protected String ccType;
    @XmlElement(name = "CcNumber", required = true)
    protected String ccNumber;
    @XmlElement(name = "CcSeqNo", required = true)
    protected String ccSeqNo;
    @XmlElement(name = "CcValidF", required = true)
    protected String ccValidF;
    @XmlElement(name = "CcValidT", required = true)
    protected String ccValidT;
    @XmlElement(name = "CcName", required = true)
    protected String ccName;
    @XmlElement(name = "Authamount", required = true)
    protected BigDecimal authamount;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "CurrIso", required = true)
    protected String currIso;
    @XmlElement(name = "AuthDate", required = true)
    protected String authDate;
    @XmlElement(name = "AuthTime", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar authTime;
    @XmlElement(name = "Merchidcl", required = true)
    protected String merchidcl;
    @XmlElement(name = "Terminal", required = true)
    protected String terminal;
    @XmlElement(name = "Billamount", required = true)
    protected BigDecimal billamount;
    @XmlElement(name = "CcLiAmount", required = true)
    protected String ccLiAmount;
    @XmlElement(name = "CcAutthNo", required = true)
    protected String ccAutthNo;
    @XmlElement(name = "Billstatus", required = true)
    protected String billstatus;
    @XmlElement(name = "Dataorigin", required = true)
    protected String dataorigin;
    @XmlElement(name = "CcSettled", required = true)
    protected String ccSettled;
    @XmlElement(name = "AuthRefno", required = true)
    protected String authRefno;
    @XmlElement(name = "Ptofrcpt", required = true)
    protected String ptofrcpt;
    @XmlElement(name = "CcReact", required = true)
    protected String ccReact;
    @XmlElement(name = "AuthFlag", required = true)
    protected String authFlag;
    @XmlElement(name = "BillPlan", required = true)
    protected String billPlan;
    @XmlElement(name = "BillPlani", required = true)
    protected String billPlani;
    @XmlElement(name = "CcReAmount", required = true)
    protected BigDecimal ccReAmount;
    @XmlElement(name = "GlAccount", required = true)
    protected String glAccount;
    @XmlElement(name = "CcStatEx", required = true)
    protected String ccStatEx;
    @XmlElement(name = "CcReactT", required = true)
    protected String ccReactT;
    @XmlElement(name = "Rfcaut", required = true)
    protected String rfcaut;
    @XmlElement(name = "AutSetinit", required = true)
    protected String autSetinit;
    @XmlElement(name = "AutSetinfo", required = true)
    protected String autSetinfo;
    @XmlElement(name = "PreAuth", required = true)
    protected String preAuth;

    /**
     * payType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayType() {
        return payType;
    }

    /**
     * payType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayType(String value) {
        this.payType = value;
    }

    /**
     * ccType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcType() {
        return ccType;
    }

    /**
     * ccType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcType(String value) {
        this.ccType = value;
    }

    /**
     * ccNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcNumber() {
        return ccNumber;
    }

    /**
     * ccNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcNumber(String value) {
        this.ccNumber = value;
    }

    /**
     * ccSeqNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcSeqNo() {
        return ccSeqNo;
    }

    /**
     * ccSeqNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcSeqNo(String value) {
        this.ccSeqNo = value;
    }

    /**
     * ccValidF 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcValidF() {
        return ccValidF;
    }

    /**
     * ccValidF 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcValidF(String value) {
        this.ccValidF = value;
    }

    /**
     * ccValidT 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcValidT() {
        return ccValidT;
    }

    /**
     * ccValidT 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcValidT(String value) {
        this.ccValidT = value;
    }

    /**
     * ccName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcName() {
        return ccName;
    }

    /**
     * ccName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcName(String value) {
        this.ccName = value;
    }

    /**
     * authamount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAuthamount() {
        return authamount;
    }

    /**
     * authamount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAuthamount(BigDecimal value) {
        this.authamount = value;
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
     * authDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthDate() {
        return authDate;
    }

    /**
     * authDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthDate(String value) {
        this.authDate = value;
    }

    /**
     * authTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuthTime() {
        return authTime;
    }

    /**
     * authTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuthTime(XMLGregorianCalendar value) {
        this.authTime = value;
    }

    /**
     * merchidcl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchidcl() {
        return merchidcl;
    }

    /**
     * merchidcl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchidcl(String value) {
        this.merchidcl = value;
    }

    /**
     * terminal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminal() {
        return terminal;
    }

    /**
     * terminal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminal(String value) {
        this.terminal = value;
    }

    /**
     * billamount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBillamount() {
        return billamount;
    }

    /**
     * billamount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBillamount(BigDecimal value) {
        this.billamount = value;
    }

    /**
     * ccLiAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcLiAmount() {
        return ccLiAmount;
    }

    /**
     * ccLiAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcLiAmount(String value) {
        this.ccLiAmount = value;
    }

    /**
     * ccAutthNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcAutthNo() {
        return ccAutthNo;
    }

    /**
     * ccAutthNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcAutthNo(String value) {
        this.ccAutthNo = value;
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
     * dataorigin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataorigin() {
        return dataorigin;
    }

    /**
     * dataorigin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataorigin(String value) {
        this.dataorigin = value;
    }

    /**
     * ccSettled 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcSettled() {
        return ccSettled;
    }

    /**
     * ccSettled 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcSettled(String value) {
        this.ccSettled = value;
    }

    /**
     * authRefno 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthRefno() {
        return authRefno;
    }

    /**
     * authRefno 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthRefno(String value) {
        this.authRefno = value;
    }

    /**
     * ptofrcpt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtofrcpt() {
        return ptofrcpt;
    }

    /**
     * ptofrcpt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtofrcpt(String value) {
        this.ptofrcpt = value;
    }

    /**
     * ccReact 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcReact() {
        return ccReact;
    }

    /**
     * ccReact 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcReact(String value) {
        this.ccReact = value;
    }

    /**
     * authFlag 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthFlag() {
        return authFlag;
    }

    /**
     * authFlag 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthFlag(String value) {
        this.authFlag = value;
    }

    /**
     * billPlan 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillPlan() {
        return billPlan;
    }

    /**
     * billPlan 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillPlan(String value) {
        this.billPlan = value;
    }

    /**
     * billPlani 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillPlani() {
        return billPlani;
    }

    /**
     * billPlani 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillPlani(String value) {
        this.billPlani = value;
    }

    /**
     * ccReAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCcReAmount() {
        return ccReAmount;
    }

    /**
     * ccReAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCcReAmount(BigDecimal value) {
        this.ccReAmount = value;
    }

    /**
     * glAccount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlAccount() {
        return glAccount;
    }

    /**
     * glAccount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlAccount(String value) {
        this.glAccount = value;
    }

    /**
     * ccStatEx 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcStatEx() {
        return ccStatEx;
    }

    /**
     * ccStatEx 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcStatEx(String value) {
        this.ccStatEx = value;
    }

    /**
     * ccReactT 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcReactT() {
        return ccReactT;
    }

    /**
     * ccReactT 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcReactT(String value) {
        this.ccReactT = value;
    }

    /**
     * rfcaut 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcaut() {
        return rfcaut;
    }

    /**
     * rfcaut 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcaut(String value) {
        this.rfcaut = value;
    }

    /**
     * autSetinit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutSetinit() {
        return autSetinit;
    }

    /**
     * autSetinit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutSetinit(String value) {
        this.autSetinit = value;
    }

    /**
     * autSetinfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutSetinfo() {
        return autSetinfo;
    }

    /**
     * autSetinfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutSetinfo(String value) {
        this.autSetinfo = value;
    }

    /**
     * preAuth 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreAuth() {
        return preAuth;
    }

    /**
     * preAuth 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreAuth(String value) {
        this.preAuth = value;
    }

}
