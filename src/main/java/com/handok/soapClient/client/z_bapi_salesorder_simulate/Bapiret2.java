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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Bapiret2 complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Bapiret2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Id" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="Number" type="{urn:sap-com:document:sap:rfc:functions}numeric3"/&gt;
 *         &lt;element name="Message" type="{urn:sap-com:document:sap:rfc:functions}char220"/&gt;
 *         &lt;element name="LogNo" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="LogMsgNo" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="MessageV1" type="{urn:sap-com:document:sap:rfc:functions}char50"/&gt;
 *         &lt;element name="MessageV2" type="{urn:sap-com:document:sap:rfc:functions}char50"/&gt;
 *         &lt;element name="MessageV3" type="{urn:sap-com:document:sap:rfc:functions}char50"/&gt;
 *         &lt;element name="MessageV4" type="{urn:sap-com:document:sap:rfc:functions}char50"/&gt;
 *         &lt;element name="Parameter" type="{urn:sap-com:document:sap:rfc:functions}char32"/&gt;
 *         &lt;element name="Row" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Field" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="System" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
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
    "type",
    "id",
    "number",
    "message",
    "logNo",
    "logMsgNo",
    "messageV1",
    "messageV2",
    "messageV3",
    "messageV4",
    "parameter",
    "row",
    "field",
    "system"
})
public class Bapiret2 {

    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Number", required = true)
    protected String number;
    @XmlElement(name = "Message", required = true)
    protected String message;
    @XmlElement(name = "LogNo", required = true)
    protected String logNo;
    @XmlElement(name = "LogMsgNo", required = true)
    protected String logMsgNo;
    @XmlElement(name = "MessageV1", required = true)
    protected String messageV1;
    @XmlElement(name = "MessageV2", required = true)
    protected String messageV2;
    @XmlElement(name = "MessageV3", required = true)
    protected String messageV3;
    @XmlElement(name = "MessageV4", required = true)
    protected String messageV4;
    @XmlElement(name = "Parameter", required = true)
    protected String parameter;
    @XmlElement(name = "Row")
    protected int row;
    @XmlElement(name = "Field", required = true)
    protected String field;
    @XmlElement(name = "System", required = true)
    protected String system;

    /**
     * type 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * type 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * id 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * id 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * number 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * number 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * message 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * message 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * logNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogNo() {
        return logNo;
    }

    /**
     * logNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogNo(String value) {
        this.logNo = value;
    }

    /**
     * logMsgNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogMsgNo() {
        return logMsgNo;
    }

    /**
     * logMsgNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogMsgNo(String value) {
        this.logMsgNo = value;
    }

    /**
     * messageV1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageV1() {
        return messageV1;
    }

    /**
     * messageV1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageV1(String value) {
        this.messageV1 = value;
    }

    /**
     * messageV2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageV2() {
        return messageV2;
    }

    /**
     * messageV2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageV2(String value) {
        this.messageV2 = value;
    }

    /**
     * messageV3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageV3() {
        return messageV3;
    }

    /**
     * messageV3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageV3(String value) {
        this.messageV3 = value;
    }

    /**
     * messageV4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageV4() {
        return messageV4;
    }

    /**
     * messageV4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageV4(String value) {
        this.messageV4 = value;
    }

    /**
     * parameter 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameter() {
        return parameter;
    }

    /**
     * parameter 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameter(String value) {
        this.parameter = value;
    }

    /**
     * row 속성의 값을 가져옵니다.
     * 
     */
    public int getRow() {
        return row;
    }

    /**
     * row 속성의 값을 설정합니다.
     * 
     */
    public void setRow(int value) {
        this.row = value;
    }

    /**
     * field 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * field 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * system 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystem() {
        return system;
    }

    /**
     * system 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystem(String value) {
        this.system = value;
    }

}
