//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.06.02 시간 07:11:22 PM KST 
//


package com.handok.soapClient.client.zsd_cust_return_create_ws;

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
 *         &lt;element name="BehaveWhenError" type="{urn:sap-com:document:sap:rfc:functions}char1" minOccurs="0"/&gt;
 *         &lt;element name="BinaryRelationshiptype" type="{urn:sap-com:document:sap:rfc:functions}char4" minOccurs="0"/&gt;
 *         &lt;element name="Convert" type="{urn:sap-com:document:sap:rfc:functions}char1" minOccurs="0"/&gt;
 *         &lt;element name="Extensionin" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapiparex" minOccurs="0"/&gt;
 *         &lt;element name="IntNumberAssignment" type="{urn:sap-com:document:sap:rfc:functions}char1" minOccurs="0"/&gt;
 *         &lt;element name="LogicSwitch" type="{urn:sap-com:document:sap:soap:functions:mc-style}Bapisdls" minOccurs="0"/&gt;
 *         &lt;element name="Partneraddresses" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapiaddr1" minOccurs="0"/&gt;
 *         &lt;element name="Return" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapiret2" minOccurs="0"/&gt;
 *         &lt;element name="ReturnCfgsBlob" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapicublb" minOccurs="0"/&gt;
 *         &lt;element name="ReturnCfgsInst" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapicuins" minOccurs="0"/&gt;
 *         &lt;element name="ReturnCfgsPartOf" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapicuprt" minOccurs="0"/&gt;
 *         &lt;element name="ReturnCfgsRef" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapicucfg" minOccurs="0"/&gt;
 *         &lt;element name="ReturnCfgsRefinst" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapicuref" minOccurs="0"/&gt;
 *         &lt;element name="ReturnCfgsValue" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapicuval" minOccurs="0"/&gt;
 *         &lt;element name="ReturnCfgsVk" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapicuvk" minOccurs="0"/&gt;
 *         &lt;element name="ReturnConditionsIn" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapicond" minOccurs="0"/&gt;
 *         &lt;element name="ReturnHeaderIn" type="{urn:sap-com:document:sap:soap:functions:mc-style}Bapisdhd1"/&gt;
 *         &lt;element name="ReturnHeaderInx" type="{urn:sap-com:document:sap:soap:functions:mc-style}Bapisdhd1x" minOccurs="0"/&gt;
 *         &lt;element name="ReturnItemsIn" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapisditm" minOccurs="0"/&gt;
 *         &lt;element name="ReturnItemsInx" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapisditmx" minOccurs="0"/&gt;
 *         &lt;element name="ReturnKeys" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapisdkey" minOccurs="0"/&gt;
 *         &lt;element name="ReturnPartners" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapiparnr"/&gt;
 *         &lt;element name="ReturnSchedulesIn" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapischdl" minOccurs="0"/&gt;
 *         &lt;element name="ReturnSchedulesInx" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapischdlx" minOccurs="0"/&gt;
 *         &lt;element name="ReturnText" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapisdtext" minOccurs="0"/&gt;
 *         &lt;element name="Salesdocumentin" type="{urn:sap-com:document:sap:rfc:functions}char10" minOccurs="0"/&gt;
 *         &lt;element name="Sender" type="{urn:sap-com:document:sap:soap:functions:mc-style}Sender" minOccurs="0"/&gt;
 *         &lt;element name="Testrun" type="{urn:sap-com:document:sap:rfc:functions}char1" minOccurs="0"/&gt;
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
    "behaveWhenError",
    "binaryRelationshiptype",
    "convert",
    "extensionin",
    "intNumberAssignment",
    "logicSwitch",
    "partneraddresses",
    "_return",
    "returnCfgsBlob",
    "returnCfgsInst",
    "returnCfgsPartOf",
    "returnCfgsRef",
    "returnCfgsRefinst",
    "returnCfgsValue",
    "returnCfgsVk",
    "returnConditionsIn",
    "returnHeaderIn",
    "returnHeaderInx",
    "returnItemsIn",
    "returnItemsInx",
    "returnKeys",
    "returnPartners",
    "returnSchedulesIn",
    "returnSchedulesInx",
    "returnText",
    "salesdocumentin",
    "sender",
    "testrun"
})
@XmlRootElement(name = "ZsdCustReturnCreate")
public class ZsdCustReturnCreate {

    @XmlElement(name = "BehaveWhenError")
    protected String behaveWhenError;
    @XmlElement(name = "BinaryRelationshiptype")
    protected String binaryRelationshiptype;
    @XmlElement(name = "Convert")
    protected String convert;
    @XmlElement(name = "Extensionin")
    protected TableOfBapiparex extensionin;
    @XmlElement(name = "IntNumberAssignment")
    protected String intNumberAssignment;
    @XmlElement(name = "LogicSwitch")
    protected Bapisdls logicSwitch;
    @XmlElement(name = "Partneraddresses")
    protected TableOfBapiaddr1 partneraddresses;
    @XmlElement(name = "Return")
    protected TableOfBapiret2 _return;
    @XmlElement(name = "ReturnCfgsBlob")
    protected TableOfBapicublb returnCfgsBlob;
    @XmlElement(name = "ReturnCfgsInst")
    protected TableOfBapicuins returnCfgsInst;
    @XmlElement(name = "ReturnCfgsPartOf")
    protected TableOfBapicuprt returnCfgsPartOf;
    @XmlElement(name = "ReturnCfgsRef")
    protected TableOfBapicucfg returnCfgsRef;
    @XmlElement(name = "ReturnCfgsRefinst")
    protected TableOfBapicuref returnCfgsRefinst;
    @XmlElement(name = "ReturnCfgsValue")
    protected TableOfBapicuval returnCfgsValue;
    @XmlElement(name = "ReturnCfgsVk")
    protected TableOfBapicuvk returnCfgsVk;
    @XmlElement(name = "ReturnConditionsIn")
    protected TableOfBapicond returnConditionsIn;
    @XmlElement(name = "ReturnHeaderIn", required = true)
    protected Bapisdhd1 returnHeaderIn;
    @XmlElement(name = "ReturnHeaderInx")
    protected Bapisdhd1X returnHeaderInx;
    @XmlElement(name = "ReturnItemsIn")
    protected TableOfBapisditm returnItemsIn;
    @XmlElement(name = "ReturnItemsInx")
    protected TableOfBapisditmx returnItemsInx;
    @XmlElement(name = "ReturnKeys")
    protected TableOfBapisdkey returnKeys;
    @XmlElement(name = "ReturnPartners", required = true)
    protected TableOfBapiparnr returnPartners;
    @XmlElement(name = "ReturnSchedulesIn")
    protected TableOfBapischdl returnSchedulesIn;
    @XmlElement(name = "ReturnSchedulesInx")
    protected TableOfBapischdlx returnSchedulesInx;
    @XmlElement(name = "ReturnText")
    protected TableOfBapisdtext returnText;
    @XmlElement(name = "Salesdocumentin")
    protected String salesdocumentin;
    @XmlElement(name = "Sender")
    protected Sender sender;
    @XmlElement(name = "Testrun")
    protected String testrun;

    /**
     * behaveWhenError 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBehaveWhenError() {
        return behaveWhenError;
    }

    /**
     * behaveWhenError 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBehaveWhenError(String value) {
        this.behaveWhenError = value;
    }

    /**
     * binaryRelationshiptype 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinaryRelationshiptype() {
        return binaryRelationshiptype;
    }

    /**
     * binaryRelationshiptype 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinaryRelationshiptype(String value) {
        this.binaryRelationshiptype = value;
    }

    /**
     * convert 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvert() {
        return convert;
    }

    /**
     * convert 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvert(String value) {
        this.convert = value;
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
     * intNumberAssignment 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntNumberAssignment() {
        return intNumberAssignment;
    }

    /**
     * intNumberAssignment 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntNumberAssignment(String value) {
        this.intNumberAssignment = value;
    }

    /**
     * logicSwitch 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Bapisdls }
     *     
     */
    public Bapisdls getLogicSwitch() {
        return logicSwitch;
    }

    /**
     * logicSwitch 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Bapisdls }
     *     
     */
    public void setLogicSwitch(Bapisdls value) {
        this.logicSwitch = value;
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
     * returnCfgsBlob 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapicublb }
     *     
     */
    public TableOfBapicublb getReturnCfgsBlob() {
        return returnCfgsBlob;
    }

    /**
     * returnCfgsBlob 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapicublb }
     *     
     */
    public void setReturnCfgsBlob(TableOfBapicublb value) {
        this.returnCfgsBlob = value;
    }

    /**
     * returnCfgsInst 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapicuins }
     *     
     */
    public TableOfBapicuins getReturnCfgsInst() {
        return returnCfgsInst;
    }

    /**
     * returnCfgsInst 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapicuins }
     *     
     */
    public void setReturnCfgsInst(TableOfBapicuins value) {
        this.returnCfgsInst = value;
    }

    /**
     * returnCfgsPartOf 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapicuprt }
     *     
     */
    public TableOfBapicuprt getReturnCfgsPartOf() {
        return returnCfgsPartOf;
    }

    /**
     * returnCfgsPartOf 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapicuprt }
     *     
     */
    public void setReturnCfgsPartOf(TableOfBapicuprt value) {
        this.returnCfgsPartOf = value;
    }

    /**
     * returnCfgsRef 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapicucfg }
     *     
     */
    public TableOfBapicucfg getReturnCfgsRef() {
        return returnCfgsRef;
    }

    /**
     * returnCfgsRef 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapicucfg }
     *     
     */
    public void setReturnCfgsRef(TableOfBapicucfg value) {
        this.returnCfgsRef = value;
    }

    /**
     * returnCfgsRefinst 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapicuref }
     *     
     */
    public TableOfBapicuref getReturnCfgsRefinst() {
        return returnCfgsRefinst;
    }

    /**
     * returnCfgsRefinst 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapicuref }
     *     
     */
    public void setReturnCfgsRefinst(TableOfBapicuref value) {
        this.returnCfgsRefinst = value;
    }

    /**
     * returnCfgsValue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapicuval }
     *     
     */
    public TableOfBapicuval getReturnCfgsValue() {
        return returnCfgsValue;
    }

    /**
     * returnCfgsValue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapicuval }
     *     
     */
    public void setReturnCfgsValue(TableOfBapicuval value) {
        this.returnCfgsValue = value;
    }

    /**
     * returnCfgsVk 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapicuvk }
     *     
     */
    public TableOfBapicuvk getReturnCfgsVk() {
        return returnCfgsVk;
    }

    /**
     * returnCfgsVk 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapicuvk }
     *     
     */
    public void setReturnCfgsVk(TableOfBapicuvk value) {
        this.returnCfgsVk = value;
    }

    /**
     * returnConditionsIn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapicond }
     *     
     */
    public TableOfBapicond getReturnConditionsIn() {
        return returnConditionsIn;
    }

    /**
     * returnConditionsIn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapicond }
     *     
     */
    public void setReturnConditionsIn(TableOfBapicond value) {
        this.returnConditionsIn = value;
    }

    /**
     * returnHeaderIn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Bapisdhd1 }
     *     
     */
    public Bapisdhd1 getReturnHeaderIn() {
        return returnHeaderIn;
    }

    /**
     * returnHeaderIn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Bapisdhd1 }
     *     
     */
    public void setReturnHeaderIn(Bapisdhd1 value) {
        this.returnHeaderIn = value;
    }

    /**
     * returnHeaderInx 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Bapisdhd1X }
     *     
     */
    public Bapisdhd1X getReturnHeaderInx() {
        return returnHeaderInx;
    }

    /**
     * returnHeaderInx 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Bapisdhd1X }
     *     
     */
    public void setReturnHeaderInx(Bapisdhd1X value) {
        this.returnHeaderInx = value;
    }

    /**
     * returnItemsIn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapisditm }
     *     
     */
    public TableOfBapisditm getReturnItemsIn() {
        return returnItemsIn;
    }

    /**
     * returnItemsIn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapisditm }
     *     
     */
    public void setReturnItemsIn(TableOfBapisditm value) {
        this.returnItemsIn = value;
    }

    /**
     * returnItemsInx 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapisditmx }
     *     
     */
    public TableOfBapisditmx getReturnItemsInx() {
        return returnItemsInx;
    }

    /**
     * returnItemsInx 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapisditmx }
     *     
     */
    public void setReturnItemsInx(TableOfBapisditmx value) {
        this.returnItemsInx = value;
    }

    /**
     * returnKeys 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapisdkey }
     *     
     */
    public TableOfBapisdkey getReturnKeys() {
        return returnKeys;
    }

    /**
     * returnKeys 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapisdkey }
     *     
     */
    public void setReturnKeys(TableOfBapisdkey value) {
        this.returnKeys = value;
    }

    /**
     * returnPartners 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapiparnr }
     *     
     */
    public TableOfBapiparnr getReturnPartners() {
        return returnPartners;
    }

    /**
     * returnPartners 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapiparnr }
     *     
     */
    public void setReturnPartners(TableOfBapiparnr value) {
        this.returnPartners = value;
    }

    /**
     * returnSchedulesIn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapischdl }
     *     
     */
    public TableOfBapischdl getReturnSchedulesIn() {
        return returnSchedulesIn;
    }

    /**
     * returnSchedulesIn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapischdl }
     *     
     */
    public void setReturnSchedulesIn(TableOfBapischdl value) {
        this.returnSchedulesIn = value;
    }

    /**
     * returnSchedulesInx 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapischdlx }
     *     
     */
    public TableOfBapischdlx getReturnSchedulesInx() {
        return returnSchedulesInx;
    }

    /**
     * returnSchedulesInx 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapischdlx }
     *     
     */
    public void setReturnSchedulesInx(TableOfBapischdlx value) {
        this.returnSchedulesInx = value;
    }

    /**
     * returnText 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapisdtext }
     *     
     */
    public TableOfBapisdtext getReturnText() {
        return returnText;
    }

    /**
     * returnText 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapisdtext }
     *     
     */
    public void setReturnText(TableOfBapisdtext value) {
        this.returnText = value;
    }

    /**
     * salesdocumentin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesdocumentin() {
        return salesdocumentin;
    }

    /**
     * salesdocumentin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesdocumentin(String value) {
        this.salesdocumentin = value;
    }

    /**
     * sender 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Sender }
     *     
     */
    public Sender getSender() {
        return sender;
    }

    /**
     * sender 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Sender }
     *     
     */
    public void setSender(Sender value) {
        this.sender = value;
    }

    /**
     * testrun 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestrun() {
        return testrun;
    }

    /**
     * testrun 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestrun(String value) {
        this.testrun = value;
    }

}
