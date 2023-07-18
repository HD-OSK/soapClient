//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.06.02 시간 07:11:24 PM KST 
//


package com.handok.soapClient.client.zsd_so_createfromdat3_ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Bapiccard complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Bapiccard"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CcType" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="CcNumber" type="{urn:sap-com:document:sap:rfc:functions}char25"/&gt;
 *         &lt;element name="CcValidT" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="CcName" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="Billamount" type="{urn:sap-com:document:sap:rfc:functions}decimal23.4"/&gt;
 *         &lt;element name="AuthFlag" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Authamount" type="{urn:sap-com:document:sap:rfc:functions}decimal23.4"/&gt;
 *         &lt;element name="Currency" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/&gt;
 *         &lt;element name="CurrIso" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="AuthDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="AuthTime" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="AuthCcNo" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="AuthRefno" type="{urn:sap-com:document:sap:rfc:functions}char15"/&gt;
 *         &lt;element name="CcReact" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="CcReAmount" type="{urn:sap-com:document:sap:rfc:functions}decimal23.4"/&gt;
 *         &lt;element name="GlAccount" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="CcStatEx" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="CcReactT" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="VirtCard" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Merchidcl" type="{urn:sap-com:document:sap:rfc:functions}char15"/&gt;
 *         &lt;element name="PreAuth" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="CcSeqNo" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Amountchan" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Authortype" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Dataorigin" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Radrcheck1" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Radrcheck2" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Radrcheck3" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Rcardcheck" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="CcLimited" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="CcVerifValue" type="{urn:sap-com:document:sap:rfc:functions}char6"/&gt;
 *         &lt;element name="CcCtrlField" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="CcInUseSt" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
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
    "ccType",
    "ccNumber",
    "ccValidT",
    "ccName",
    "billamount",
    "authFlag",
    "authamount",
    "currency",
    "currIso",
    "authDate",
    "authTime",
    "authCcNo",
    "authRefno",
    "ccReact",
    "ccReAmount",
    "glAccount",
    "ccStatEx",
    "ccReactT",
    "virtCard",
    "merchidcl",
    "preAuth",
    "ccSeqNo",
    "amountchan",
    "authortype",
    "dataorigin",
    "radrcheck1",
    "radrcheck2",
    "radrcheck3",
    "rcardcheck",
    "ccLimited",
    "ccVerifValue",
    "ccCtrlField",
    "ccInUseSt"
})
public class Bapiccard {

    @XmlElement(name = "CcType", required = true)
    protected String ccType;
    @XmlElement(name = "CcNumber", required = true)
    protected String ccNumber;
    @XmlElement(name = "CcValidT", required = true)
    protected String ccValidT;
    @XmlElement(name = "CcName", required = true)
    protected String ccName;
    @XmlElement(name = "Billamount", required = true)
    protected BigDecimal billamount;
    @XmlElement(name = "AuthFlag", required = true)
    protected String authFlag;
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
    @XmlElement(name = "AuthCcNo", required = true)
    protected String authCcNo;
    @XmlElement(name = "AuthRefno", required = true)
    protected String authRefno;
    @XmlElement(name = "CcReact", required = true)
    protected String ccReact;
    @XmlElement(name = "CcReAmount", required = true)
    protected BigDecimal ccReAmount;
    @XmlElement(name = "GlAccount", required = true)
    protected String glAccount;
    @XmlElement(name = "CcStatEx", required = true)
    protected String ccStatEx;
    @XmlElement(name = "CcReactT", required = true)
    protected String ccReactT;
    @XmlElement(name = "VirtCard", required = true)
    protected String virtCard;
    @XmlElement(name = "Merchidcl", required = true)
    protected String merchidcl;
    @XmlElement(name = "PreAuth", required = true)
    protected String preAuth;
    @XmlElement(name = "CcSeqNo", required = true)
    protected String ccSeqNo;
    @XmlElement(name = "Amountchan", required = true)
    protected String amountchan;
    @XmlElement(name = "Authortype", required = true)
    protected String authortype;
    @XmlElement(name = "Dataorigin", required = true)
    protected String dataorigin;
    @XmlElement(name = "Radrcheck1", required = true)
    protected String radrcheck1;
    @XmlElement(name = "Radrcheck2", required = true)
    protected String radrcheck2;
    @XmlElement(name = "Radrcheck3", required = true)
    protected String radrcheck3;
    @XmlElement(name = "Rcardcheck", required = true)
    protected String rcardcheck;
    @XmlElement(name = "CcLimited", required = true)
    protected String ccLimited;
    @XmlElement(name = "CcVerifValue", required = true)
    protected String ccVerifValue;
    @XmlElement(name = "CcCtrlField", required = true)
    protected String ccCtrlField;
    @XmlElement(name = "CcInUseSt", required = true)
    protected String ccInUseSt;

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
     * authCcNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCcNo() {
        return authCcNo;
    }

    /**
     * authCcNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCcNo(String value) {
        this.authCcNo = value;
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
     * virtCard 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtCard() {
        return virtCard;
    }

    /**
     * virtCard 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtCard(String value) {
        this.virtCard = value;
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
     * amountchan 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountchan() {
        return amountchan;
    }

    /**
     * amountchan 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountchan(String value) {
        this.amountchan = value;
    }

    /**
     * authortype 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthortype() {
        return authortype;
    }

    /**
     * authortype 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthortype(String value) {
        this.authortype = value;
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
     * radrcheck1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadrcheck1() {
        return radrcheck1;
    }

    /**
     * radrcheck1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadrcheck1(String value) {
        this.radrcheck1 = value;
    }

    /**
     * radrcheck2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadrcheck2() {
        return radrcheck2;
    }

    /**
     * radrcheck2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadrcheck2(String value) {
        this.radrcheck2 = value;
    }

    /**
     * radrcheck3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadrcheck3() {
        return radrcheck3;
    }

    /**
     * radrcheck3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadrcheck3(String value) {
        this.radrcheck3 = value;
    }

    /**
     * rcardcheck 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcardcheck() {
        return rcardcheck;
    }

    /**
     * rcardcheck 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcardcheck(String value) {
        this.rcardcheck = value;
    }

    /**
     * ccLimited 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcLimited() {
        return ccLimited;
    }

    /**
     * ccLimited 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcLimited(String value) {
        this.ccLimited = value;
    }

    /**
     * ccVerifValue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcVerifValue() {
        return ccVerifValue;
    }

    /**
     * ccVerifValue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcVerifValue(String value) {
        this.ccVerifValue = value;
    }

    /**
     * ccCtrlField 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcCtrlField() {
        return ccCtrlField;
    }

    /**
     * ccCtrlField 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcCtrlField(String value) {
        this.ccCtrlField = value;
    }

    /**
     * ccInUseSt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcInUseSt() {
        return ccInUseSt;
    }

    /**
     * ccInUseSt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcInUseSt(String value) {
        this.ccInUseSt = value;
    }

}
