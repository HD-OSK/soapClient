//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.06.02 시간 07:11:18 PM KST 
//


package com.handok.soapClient.client.z_bapi_salesorder_simulate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConvertParvwAuart" type="{urn:sap-com:document:sap:rfc:functions}char1" minOccurs="0"/&gt;
 *         &lt;element name="Extensionin" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapiparex" minOccurs="0"/&gt;
 *         &lt;element name="Messagetable" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapiret2" minOccurs="0"/&gt;
 *         &lt;element name="OrderCcard" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapiccard" minOccurs="0"/&gt;
 *         &lt;element name="OrderCcardEx" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapiccardEx" minOccurs="0"/&gt;
 *         &lt;element name="OrderCfgsBlob" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapicublb" minOccurs="0"/&gt;
 *         &lt;element name="OrderCfgsInst" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapicuins" minOccurs="0"/&gt;
 *         &lt;element name="OrderCfgsPartOf" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapicuprt" minOccurs="0"/&gt;
 *         &lt;element name="OrderCfgsRef" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapicucfg" minOccurs="0"/&gt;
 *         &lt;element name="OrderCfgsValue" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapicuval" minOccurs="0"/&gt;
 *         &lt;element name="OrderConditionEx" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapicond" minOccurs="0"/&gt;
 *         &lt;element name="OrderHeaderIn" type="{urn:sap-com:document:sap:soap:functions:mc-style}Bapisdhead"/&gt;
 *         &lt;element name="OrderIncomplete" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapiincomp" minOccurs="0"/&gt;
 *         &lt;element name="OrderItemsIn" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapiitemin"/&gt;
 *         &lt;element name="OrderItemsOut" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapiitemex" minOccurs="0"/&gt;
 *         &lt;element name="OrderPartners" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapipartnr"/&gt;
 *         &lt;element name="OrderScheduleEx" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapisdhedu" minOccurs="0"/&gt;
 *         &lt;element name="OrderScheduleIn" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapischdl" minOccurs="0"/&gt;
 *         &lt;element name="Partneraddresses" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapiaddr1" minOccurs="0"/&gt;
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
    "convertParvwAuart",
    "extensionin",
    "messagetable",
    "orderCcard",
    "orderCcardEx",
    "orderCfgsBlob",
    "orderCfgsInst",
    "orderCfgsPartOf",
    "orderCfgsRef",
    "orderCfgsValue",
    "orderConditionEx",
    "orderHeaderIn",
    "orderIncomplete",
    "orderItemsIn",
    "orderItemsOut",
    "orderPartners",
    "orderScheduleEx",
    "orderScheduleIn",
    "partneraddresses"
})
@XmlRootElement(name = "SalesorderSimulate")
public class SalesorderSimulate {

    @XmlElement(name = "ConvertParvwAuart")
    protected String convertParvwAuart;
    @XmlElement(name = "Extensionin")
    protected TableOfBapiparex extensionin;
    @XmlElement(name = "Messagetable")
    protected TableOfBapiret2 messagetable;
    @XmlElement(name = "OrderCcard")
    protected TableOfBapiccard orderCcard;
    @XmlElement(name = "OrderCcardEx")
    protected TableOfBapiccardEx orderCcardEx;
    @XmlElement(name = "OrderCfgsBlob")
    protected TableOfBapicublb orderCfgsBlob;
    @XmlElement(name = "OrderCfgsInst")
    protected TableOfBapicuins orderCfgsInst;
    @XmlElement(name = "OrderCfgsPartOf")
    protected TableOfBapicuprt orderCfgsPartOf;
    @XmlElement(name = "OrderCfgsRef")
    protected TableOfBapicucfg orderCfgsRef;
    @XmlElement(name = "OrderCfgsValue")
    protected TableOfBapicuval orderCfgsValue;
    @XmlElement(name = "OrderConditionEx")
    protected TableOfBapicond orderConditionEx;
    @XmlElement(name = "OrderHeaderIn", required = true)
    protected Bapisdhead orderHeaderIn;
    @XmlElement(name = "OrderIncomplete")
    protected TableOfBapiincomp orderIncomplete;
    @XmlElement(name = "OrderItemsIn", required = true)
    protected TableOfBapiitemin orderItemsIn;
    @XmlElement(name = "OrderItemsOut")
    protected TableOfBapiitemex orderItemsOut;
    @XmlElement(name = "OrderPartners", required = true)
    protected TableOfBapipartnr orderPartners;
    @XmlElement(name = "OrderScheduleEx")
    protected TableOfBapisdhedu orderScheduleEx;
    @XmlElement(name = "OrderScheduleIn")
    protected TableOfBapischdl orderScheduleIn;
    @XmlElement(name = "Partneraddresses")
    protected TableOfBapiaddr1 partneraddresses;

    /**
     * convertParvwAuart 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvertParvwAuart() {
        return convertParvwAuart;
    }

    /**
     * convertParvwAuart 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvertParvwAuart(String value) {
        this.convertParvwAuart = value;
    }

    /**
     * extensionin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapiparex }
     *     
     */
    public TableOfBapiparex getExtensionin() {
        return extensionin;
    }

    /**
     * extensionin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapiparex }
     *     
     */
    public void setExtensionin(TableOfBapiparex value) {
        this.extensionin = value;
    }

    /**
     * messagetable 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapiret2 }
     *     
     */
    public TableOfBapiret2 getMessagetable() {
        return messagetable;
    }

    /**
     * messagetable 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapiret2 }
     *     
     */
    public void setMessagetable(TableOfBapiret2 value) {
        this.messagetable = value;
    }

    /**
     * orderCcard 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapiccard }
     *     
     */
    public TableOfBapiccard getOrderCcard() {
        return orderCcard;
    }

    /**
     * orderCcard 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapiccard }
     *     
     */
    public void setOrderCcard(TableOfBapiccard value) {
        this.orderCcard = value;
    }

    /**
     * orderCcardEx 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapiccardEx }
     *     
     */
    public TableOfBapiccardEx getOrderCcardEx() {
        return orderCcardEx;
    }

    /**
     * orderCcardEx 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapiccardEx }
     *     
     */
    public void setOrderCcardEx(TableOfBapiccardEx value) {
        this.orderCcardEx = value;
    }

    /**
     * orderCfgsBlob 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapicublb }
     *     
     */
    public TableOfBapicublb getOrderCfgsBlob() {
        return orderCfgsBlob;
    }

    /**
     * orderCfgsBlob 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapicublb }
     *     
     */
    public void setOrderCfgsBlob(TableOfBapicublb value) {
        this.orderCfgsBlob = value;
    }

    /**
     * orderCfgsInst 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapicuins }
     *     
     */
    public TableOfBapicuins getOrderCfgsInst() {
        return orderCfgsInst;
    }

    /**
     * orderCfgsInst 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapicuins }
     *     
     */
    public void setOrderCfgsInst(TableOfBapicuins value) {
        this.orderCfgsInst = value;
    }

    /**
     * orderCfgsPartOf 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapicuprt }
     *     
     */
    public TableOfBapicuprt getOrderCfgsPartOf() {
        return orderCfgsPartOf;
    }

    /**
     * orderCfgsPartOf 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapicuprt }
     *     
     */
    public void setOrderCfgsPartOf(TableOfBapicuprt value) {
        this.orderCfgsPartOf = value;
    }

    /**
     * orderCfgsRef 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapicucfg }
     *     
     */
    public TableOfBapicucfg getOrderCfgsRef() {
        return orderCfgsRef;
    }

    /**
     * orderCfgsRef 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapicucfg }
     *     
     */
    public void setOrderCfgsRef(TableOfBapicucfg value) {
        this.orderCfgsRef = value;
    }

    /**
     * orderCfgsValue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapicuval }
     *     
     */
    public TableOfBapicuval getOrderCfgsValue() {
        return orderCfgsValue;
    }

    /**
     * orderCfgsValue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapicuval }
     *     
     */
    public void setOrderCfgsValue(TableOfBapicuval value) {
        this.orderCfgsValue = value;
    }

    /**
     * orderConditionEx 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapicond }
     *     
     */
    public TableOfBapicond getOrderConditionEx() {
        return orderConditionEx;
    }

    /**
     * orderConditionEx 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapicond }
     *     
     */
    public void setOrderConditionEx(TableOfBapicond value) {
        this.orderConditionEx = value;
    }

    /**
     * orderHeaderIn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Bapisdhead }
     *     
     */
    public Bapisdhead getOrderHeaderIn() {
        return orderHeaderIn;
    }

    /**
     * orderHeaderIn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Bapisdhead }
     *     
     */
    public void setOrderHeaderIn(Bapisdhead value) {
        this.orderHeaderIn = value;
    }

    /**
     * orderIncomplete 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapiincomp }
     *     
     */
    public TableOfBapiincomp getOrderIncomplete() {
        return orderIncomplete;
    }

    /**
     * orderIncomplete 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapiincomp }
     *     
     */
    public void setOrderIncomplete(TableOfBapiincomp value) {
        this.orderIncomplete = value;
    }

    /**
     * orderItemsIn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapiitemin }
     *     
     */
    public TableOfBapiitemin getOrderItemsIn() {
        return orderItemsIn;
    }

    /**
     * orderItemsIn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapiitemin }
     *     
     */
    public void setOrderItemsIn(TableOfBapiitemin value) {
        this.orderItemsIn = value;
    }

    /**
     * orderItemsOut 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapiitemex }
     *     
     */
    public TableOfBapiitemex getOrderItemsOut() {
        return orderItemsOut;
    }

    /**
     * orderItemsOut 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapiitemex }
     *     
     */
    public void setOrderItemsOut(TableOfBapiitemex value) {
        this.orderItemsOut = value;
    }

    /**
     * orderPartners 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapipartnr }
     *     
     */
    public TableOfBapipartnr getOrderPartners() {
        return orderPartners;
    }

    /**
     * orderPartners 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapipartnr }
     *     
     */
    public void setOrderPartners(TableOfBapipartnr value) {
        this.orderPartners = value;
    }

    /**
     * orderScheduleEx 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapisdhedu }
     *     
     */
    public TableOfBapisdhedu getOrderScheduleEx() {
        return orderScheduleEx;
    }

    /**
     * orderScheduleEx 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapisdhedu }
     *     
     */
    public void setOrderScheduleEx(TableOfBapisdhedu value) {
        this.orderScheduleEx = value;
    }

    /**
     * orderScheduleIn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapischdl }
     *     
     */
    public TableOfBapischdl getOrderScheduleIn() {
        return orderScheduleIn;
    }

    /**
     * orderScheduleIn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapischdl }
     *     
     */
    public void setOrderScheduleIn(TableOfBapischdl value) {
        this.orderScheduleIn = value;
    }

    /**
     * partneraddresses 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapiaddr1 }
     *     
     */
    public TableOfBapiaddr1 getPartneraddresses() {
        return partneraddresses;
    }

    /**
     * partneraddresses 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapiaddr1 }
     *     
     */
    public void setPartneraddresses(TableOfBapiaddr1 value) {
        this.partneraddresses = value;
    }

}
