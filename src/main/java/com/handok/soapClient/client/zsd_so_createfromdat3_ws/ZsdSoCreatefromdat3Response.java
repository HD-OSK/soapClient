//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.06.02 시간 07:11:24 PM KST 
//


package com.handok.soapClient.client.zsd_so_createfromdat3_ws;

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
 *         &lt;element name="Extensionin" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapiparex" minOccurs="0"/&gt;
 *         &lt;element name="OrderCcard" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapiccard" minOccurs="0"/&gt;
 *         &lt;element name="OrderCfgsBlob" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapicublb" minOccurs="0"/&gt;
 *         &lt;element name="OrderCfgsInst" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapicuins" minOccurs="0"/&gt;
 *         &lt;element name="OrderCfgsPartOf" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapicuprt" minOccurs="0"/&gt;
 *         &lt;element name="OrderCfgsRef" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapicucfg" minOccurs="0"/&gt;
 *         &lt;element name="OrderCfgsRefinst" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapicuref" minOccurs="0"/&gt;
 *         &lt;element name="OrderCfgsValue" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapicuval" minOccurs="0"/&gt;
 *         &lt;element name="OrderCfgsVk" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapicuvk" minOccurs="0"/&gt;
 *         &lt;element name="OrderConditionsIn" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapicond" minOccurs="0"/&gt;
 *         &lt;element name="OrderConditionsInx" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapicondx" minOccurs="0"/&gt;
 *         &lt;element name="OrderItemsIn" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapisditm" minOccurs="0"/&gt;
 *         &lt;element name="OrderItemsInx" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapisditmx" minOccurs="0"/&gt;
 *         &lt;element name="OrderKeys" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapisdkey" minOccurs="0"/&gt;
 *         &lt;element name="OrderPartners" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapiparnr"/&gt;
 *         &lt;element name="OrderSchedulesIn" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapischdl" minOccurs="0"/&gt;
 *         &lt;element name="OrderSchedulesInx" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapischdlx" minOccurs="0"/&gt;
 *         &lt;element name="OrderText" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapisdtext" minOccurs="0"/&gt;
 *         &lt;element name="Partneraddresses" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapiaddr1" minOccurs="0"/&gt;
 *         &lt;element name="Return" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapiret2" minOccurs="0"/&gt;
 *         &lt;element name="Salesdocument" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
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
    "extensionin",
    "orderCcard",
    "orderCfgsBlob",
    "orderCfgsInst",
    "orderCfgsPartOf",
    "orderCfgsRef",
    "orderCfgsRefinst",
    "orderCfgsValue",
    "orderCfgsVk",
    "orderConditionsIn",
    "orderConditionsInx",
    "orderItemsIn",
    "orderItemsInx",
    "orderKeys",
    "orderPartners",
    "orderSchedulesIn",
    "orderSchedulesInx",
    "orderText",
    "partneraddresses",
    "_return",
    "salesdocument"
})
@XmlRootElement(name = "ZsdSoCreatefromdat3Response")
public class ZsdSoCreatefromdat3Response {

    @XmlElement(name = "Extensionin")
    protected TableOfBapiparex extensionin;
    @XmlElement(name = "OrderCcard")
    protected TableOfBapiccard orderCcard;
    @XmlElement(name = "OrderCfgsBlob")
    protected TableOfBapicublb orderCfgsBlob;
    @XmlElement(name = "OrderCfgsInst")
    protected TableOfBapicuins orderCfgsInst;
    @XmlElement(name = "OrderCfgsPartOf")
    protected TableOfBapicuprt orderCfgsPartOf;
    @XmlElement(name = "OrderCfgsRef")
    protected TableOfBapicucfg orderCfgsRef;
    @XmlElement(name = "OrderCfgsRefinst")
    protected TableOfBapicuref orderCfgsRefinst;
    @XmlElement(name = "OrderCfgsValue")
    protected TableOfBapicuval orderCfgsValue;
    @XmlElement(name = "OrderCfgsVk")
    protected TableOfBapicuvk orderCfgsVk;
    @XmlElement(name = "OrderConditionsIn")
    protected TableOfBapicond orderConditionsIn;
    @XmlElement(name = "OrderConditionsInx")
    protected TableOfBapicondx orderConditionsInx;
    @XmlElement(name = "OrderItemsIn")
    protected TableOfBapisditm orderItemsIn;
    @XmlElement(name = "OrderItemsInx")
    protected TableOfBapisditmx orderItemsInx;
    @XmlElement(name = "OrderKeys")
    protected TableOfBapisdkey orderKeys;
    @XmlElement(name = "OrderPartners", required = true)
    protected TableOfBapiparnr orderPartners;
    @XmlElement(name = "OrderSchedulesIn")
    protected TableOfBapischdl orderSchedulesIn;
    @XmlElement(name = "OrderSchedulesInx")
    protected TableOfBapischdlx orderSchedulesInx;
    @XmlElement(name = "OrderText")
    protected TableOfBapisdtext orderText;
    @XmlElement(name = "Partneraddresses")
    protected TableOfBapiaddr1 partneraddresses;
    @XmlElement(name = "Return")
    protected TableOfBapiret2 _return;
    @XmlElement(name = "Salesdocument", required = true)
    protected String salesdocument;

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
     * orderCfgsRefinst 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapicuref }
     *     
     */
    public TableOfBapicuref getOrderCfgsRefinst() {
        return orderCfgsRefinst;
    }

    /**
     * orderCfgsRefinst 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapicuref }
     *     
     */
    public void setOrderCfgsRefinst(TableOfBapicuref value) {
        this.orderCfgsRefinst = value;
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
     * orderCfgsVk 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapicuvk }
     *     
     */
    public TableOfBapicuvk getOrderCfgsVk() {
        return orderCfgsVk;
    }

    /**
     * orderCfgsVk 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapicuvk }
     *     
     */
    public void setOrderCfgsVk(TableOfBapicuvk value) {
        this.orderCfgsVk = value;
    }

    /**
     * orderConditionsIn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapicond }
     *     
     */
    public TableOfBapicond getOrderConditionsIn() {
        return orderConditionsIn;
    }

    /**
     * orderConditionsIn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapicond }
     *     
     */
    public void setOrderConditionsIn(TableOfBapicond value) {
        this.orderConditionsIn = value;
    }

    /**
     * orderConditionsInx 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapicondx }
     *     
     */
    public TableOfBapicondx getOrderConditionsInx() {
        return orderConditionsInx;
    }

    /**
     * orderConditionsInx 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapicondx }
     *     
     */
    public void setOrderConditionsInx(TableOfBapicondx value) {
        this.orderConditionsInx = value;
    }

    /**
     * orderItemsIn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapisditm }
     *     
     */
    public TableOfBapisditm getOrderItemsIn() {
        return orderItemsIn;
    }

    /**
     * orderItemsIn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapisditm }
     *     
     */
    public void setOrderItemsIn(TableOfBapisditm value) {
        this.orderItemsIn = value;
    }

    /**
     * orderItemsInx 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapisditmx }
     *     
     */
    public TableOfBapisditmx getOrderItemsInx() {
        return orderItemsInx;
    }

    /**
     * orderItemsInx 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapisditmx }
     *     
     */
    public void setOrderItemsInx(TableOfBapisditmx value) {
        this.orderItemsInx = value;
    }

    /**
     * orderKeys 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapisdkey }
     *     
     */
    public TableOfBapisdkey getOrderKeys() {
        return orderKeys;
    }

    /**
     * orderKeys 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapisdkey }
     *     
     */
    public void setOrderKeys(TableOfBapisdkey value) {
        this.orderKeys = value;
    }

    /**
     * orderPartners 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapiparnr }
     *     
     */
    public TableOfBapiparnr getOrderPartners() {
        return orderPartners;
    }

    /**
     * orderPartners 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapiparnr }
     *     
     */
    public void setOrderPartners(TableOfBapiparnr value) {
        this.orderPartners = value;
    }

    /**
     * orderSchedulesIn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapischdl }
     *     
     */
    public TableOfBapischdl getOrderSchedulesIn() {
        return orderSchedulesIn;
    }

    /**
     * orderSchedulesIn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapischdl }
     *     
     */
    public void setOrderSchedulesIn(TableOfBapischdl value) {
        this.orderSchedulesIn = value;
    }

    /**
     * orderSchedulesInx 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapischdlx }
     *     
     */
    public TableOfBapischdlx getOrderSchedulesInx() {
        return orderSchedulesInx;
    }

    /**
     * orderSchedulesInx 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapischdlx }
     *     
     */
    public void setOrderSchedulesInx(TableOfBapischdlx value) {
        this.orderSchedulesInx = value;
    }

    /**
     * orderText 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapisdtext }
     *     
     */
    public TableOfBapisdtext getOrderText() {
        return orderText;
    }

    /**
     * orderText 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapisdtext }
     *     
     */
    public void setOrderText(TableOfBapisdtext value) {
        this.orderText = value;
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

    /**
     * return 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapiret2 }
     *     
     */
    public TableOfBapiret2 getReturn() {
        return _return;
    }

    /**
     * return 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapiret2 }
     *     
     */
    public void setReturn(TableOfBapiret2 value) {
        this._return = value;
    }

    /**
     * salesdocument 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesdocument() {
        return salesdocument;
    }

    /**
     * salesdocument 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesdocument(String value) {
        this.salesdocument = value;
    }

}
