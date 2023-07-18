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
 * <p>TextlGn complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TextlGn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rfbel" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Rfpos" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="Tdid" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Tdspras" type="{urn:sap-com:document:sap:rfc:functions}lang"/&gt;
 *         &lt;element name="LineNumb" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="Tdformat" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Tdline" type="{urn:sap-com:document:sap:rfc:functions}char132"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextlGn", propOrder = {
    "rfbel",
    "rfpos",
    "tdid",
    "tdspras",
    "lineNumb",
    "tdformat",
    "tdline"
})
public class TextlGn {

    @XmlElement(name = "Rfbel", required = true)
    protected String rfbel;
    @XmlElement(name = "Rfpos", required = true)
    protected String rfpos;
    @XmlElement(name = "Tdid", required = true)
    protected String tdid;
    @XmlElement(name = "Tdspras", required = true)
    protected String tdspras;
    @XmlElement(name = "LineNumb")
    protected short lineNumb;
    @XmlElement(name = "Tdformat", required = true)
    protected String tdformat;
    @XmlElement(name = "Tdline", required = true)
    protected String tdline;

    /**
     * rfbel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfbel() {
        return rfbel;
    }

    /**
     * rfbel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfbel(String value) {
        this.rfbel = value;
    }

    /**
     * rfpos 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfpos() {
        return rfpos;
    }

    /**
     * rfpos 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfpos(String value) {
        this.rfpos = value;
    }

    /**
     * tdid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdid() {
        return tdid;
    }

    /**
     * tdid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdid(String value) {
        this.tdid = value;
    }

    /**
     * tdspras 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdspras() {
        return tdspras;
    }

    /**
     * tdspras 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdspras(String value) {
        this.tdspras = value;
    }

    /**
     * lineNumb 속성의 값을 가져옵니다.
     * 
     */
    public short getLineNumb() {
        return lineNumb;
    }

    /**
     * lineNumb 속성의 값을 설정합니다.
     * 
     */
    public void setLineNumb(short value) {
        this.lineNumb = value;
    }

    /**
     * tdformat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdformat() {
        return tdformat;
    }

    /**
     * tdformat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdformat(String value) {
        this.tdformat = value;
    }

    /**
     * tdline 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdline() {
        return tdline;
    }

    /**
     * tdline 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdline(String value) {
        this.tdline = value;
    }

}
