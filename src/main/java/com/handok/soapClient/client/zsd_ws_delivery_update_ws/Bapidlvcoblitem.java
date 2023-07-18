//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.06.02 시간 07:11:25 PM KST 
//


package com.handok.soapClient.client.zsd_ws_delivery_update_ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Bapidlvcoblitem complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Bapidlvcoblitem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DelivNumb" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="ItmNumber" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="Costcenter" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="ProfitCtr" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="ProfitSegmNo" type="{urn:sap-com:document:sap:rfc:functions}numeric10"/&gt;
 *         &lt;element name="CmmtItem" type="{urn:sap-com:document:sap:rfc:functions}char14"/&gt;
 *         &lt;element name="FundsCtr" type="{urn:sap-com:document:sap:rfc:functions}char16"/&gt;
 *         &lt;element name="Fund" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Orderid" type="{urn:sap-com:document:sap:rfc:functions}char12"/&gt;
 *         &lt;element name="SalesOrd" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="SOrdItem" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="Acctasscat" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Consumpt" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="OrderItno" type="{urn:sap-com:document:sap:rfc:functions}numeric4"/&gt;
 *         &lt;element name="GrantNbr" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="CmmtItemLong" type="{urn:sap-com:document:sap:rfc:functions}char24"/&gt;
 *         &lt;element name="FuncAreaLong" type="{urn:sap-com:document:sap:rfc:functions}char16"/&gt;
 *         &lt;element name="FundLong" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="WbsElem" type="{urn:sap-com:document:sap:rfc:functions}char24"/&gt;
 *         &lt;element name="BudgetPd" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bapidlvcoblitem", propOrder = {
    "delivNumb",
    "itmNumber",
    "costcenter",
    "profitCtr",
    "profitSegmNo",
    "cmmtItem",
    "fundsCtr",
    "fund",
    "orderid",
    "salesOrd",
    "sOrdItem",
    "acctasscat",
    "consumpt",
    "orderItno",
    "grantNbr",
    "cmmtItemLong",
    "funcAreaLong",
    "fundLong",
    "wbsElem",
    "budgetPd"
})
public class Bapidlvcoblitem {

    @XmlElement(name = "DelivNumb", required = true)
    protected String delivNumb;
    @XmlElement(name = "ItmNumber", required = true)
    protected String itmNumber;
    @XmlElement(name = "Costcenter", required = true)
    protected String costcenter;
    @XmlElement(name = "ProfitCtr", required = true)
    protected String profitCtr;
    @XmlElement(name = "ProfitSegmNo", required = true)
    protected String profitSegmNo;
    @XmlElement(name = "CmmtItem", required = true)
    protected String cmmtItem;
    @XmlElement(name = "FundsCtr", required = true)
    protected String fundsCtr;
    @XmlElement(name = "Fund", required = true)
    protected String fund;
    @XmlElement(name = "Orderid", required = true)
    protected String orderid;
    @XmlElement(name = "SalesOrd", required = true)
    protected String salesOrd;
    @XmlElement(name = "SOrdItem", required = true)
    protected String sOrdItem;
    @XmlElement(name = "Acctasscat", required = true)
    protected String acctasscat;
    @XmlElement(name = "Consumpt", required = true)
    protected String consumpt;
    @XmlElement(name = "OrderItno", required = true)
    protected String orderItno;
    @XmlElement(name = "GrantNbr", required = true)
    protected String grantNbr;
    @XmlElement(name = "CmmtItemLong", required = true)
    protected String cmmtItemLong;
    @XmlElement(name = "FuncAreaLong", required = true)
    protected String funcAreaLong;
    @XmlElement(name = "FundLong", required = true)
    protected String fundLong;
    @XmlElement(name = "WbsElem", required = true)
    protected String wbsElem;
    @XmlElement(name = "BudgetPd", required = true)
    protected String budgetPd;

    /**
     * delivNumb 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelivNumb() {
        return delivNumb;
    }

    /**
     * delivNumb 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelivNumb(String value) {
        this.delivNumb = value;
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
     * costcenter 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostcenter() {
        return costcenter;
    }

    /**
     * costcenter 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostcenter(String value) {
        this.costcenter = value;
    }

    /**
     * profitCtr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfitCtr() {
        return profitCtr;
    }

    /**
     * profitCtr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfitCtr(String value) {
        this.profitCtr = value;
    }

    /**
     * profitSegmNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfitSegmNo() {
        return profitSegmNo;
    }

    /**
     * profitSegmNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfitSegmNo(String value) {
        this.profitSegmNo = value;
    }

    /**
     * cmmtItem 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmmtItem() {
        return cmmtItem;
    }

    /**
     * cmmtItem 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmmtItem(String value) {
        this.cmmtItem = value;
    }

    /**
     * fundsCtr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundsCtr() {
        return fundsCtr;
    }

    /**
     * fundsCtr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundsCtr(String value) {
        this.fundsCtr = value;
    }

    /**
     * fund 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFund() {
        return fund;
    }

    /**
     * fund 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFund(String value) {
        this.fund = value;
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
     * salesOrd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOrd() {
        return salesOrd;
    }

    /**
     * salesOrd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOrd(String value) {
        this.salesOrd = value;
    }

    /**
     * sOrdItem 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOrdItem() {
        return sOrdItem;
    }

    /**
     * sOrdItem 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOrdItem(String value) {
        this.sOrdItem = value;
    }

    /**
     * acctasscat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctasscat() {
        return acctasscat;
    }

    /**
     * acctasscat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctasscat(String value) {
        this.acctasscat = value;
    }

    /**
     * consumpt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumpt() {
        return consumpt;
    }

    /**
     * consumpt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumpt(String value) {
        this.consumpt = value;
    }

    /**
     * orderItno 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderItno() {
        return orderItno;
    }

    /**
     * orderItno 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderItno(String value) {
        this.orderItno = value;
    }

    /**
     * grantNbr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrantNbr() {
        return grantNbr;
    }

    /**
     * grantNbr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrantNbr(String value) {
        this.grantNbr = value;
    }

    /**
     * cmmtItemLong 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmmtItemLong() {
        return cmmtItemLong;
    }

    /**
     * cmmtItemLong 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmmtItemLong(String value) {
        this.cmmtItemLong = value;
    }

    /**
     * funcAreaLong 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuncAreaLong() {
        return funcAreaLong;
    }

    /**
     * funcAreaLong 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuncAreaLong(String value) {
        this.funcAreaLong = value;
    }

    /**
     * fundLong 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundLong() {
        return fundLong;
    }

    /**
     * fundLong 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundLong(String value) {
        this.fundLong = value;
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
     * budgetPd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBudgetPd() {
        return budgetPd;
    }

    /**
     * budgetPd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBudgetPd(String value) {
        this.budgetPd = value;
    }

}
