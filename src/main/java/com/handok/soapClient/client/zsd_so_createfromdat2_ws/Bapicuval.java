//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.06.02 시간 07:11:23 PM KST 
//


package com.handok.soapClient.client.zsd_so_createfromdat2_ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Bapicuval complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Bapicuval"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConfigId" type="{urn:sap-com:document:sap:rfc:functions}char6"/&gt;
 *         &lt;element name="InstId" type="{urn:sap-com:document:sap:rfc:functions}char8"/&gt;
 *         &lt;element name="Charc" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="CharcTxt" type="{urn:sap-com:document:sap:rfc:functions}char70"/&gt;
 *         &lt;element name="Value" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="ValueTxt" type="{urn:sap-com:document:sap:rfc:functions}char70"/&gt;
 *         &lt;element name="Author" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ValueTo" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="Valcode" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
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
    "configId",
    "instId",
    "charc",
    "charcTxt",
    "value",
    "valueTxt",
    "author",
    "valueTo",
    "valcode"
})
public class Bapicuval {

    @XmlElement(name = "ConfigId", required = true)
    protected String configId;
    @XmlElement(name = "InstId", required = true)
    protected String instId;
    @XmlElement(name = "Charc", required = true)
    protected String charc;
    @XmlElement(name = "CharcTxt", required = true)
    protected String charcTxt;
    @XmlElement(name = "Value", required = true)
    protected String value;
    @XmlElement(name = "ValueTxt", required = true)
    protected String valueTxt;
    @XmlElement(name = "Author", required = true)
    protected String author;
    @XmlElement(name = "ValueTo", required = true)
    protected String valueTo;
    @XmlElement(name = "Valcode", required = true)
    protected String valcode;

    /**
     * configId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigId() {
        return configId;
    }

    /**
     * configId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigId(String value) {
        this.configId = value;
    }

    /**
     * instId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstId() {
        return instId;
    }

    /**
     * instId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstId(String value) {
        this.instId = value;
    }

    /**
     * charc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharc() {
        return charc;
    }

    /**
     * charc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharc(String value) {
        this.charc = value;
    }

    /**
     * charcTxt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharcTxt() {
        return charcTxt;
    }

    /**
     * charcTxt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharcTxt(String value) {
        this.charcTxt = value;
    }

    /**
     * value 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * value 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * valueTxt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueTxt() {
        return valueTxt;
    }

    /**
     * valueTxt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueTxt(String value) {
        this.valueTxt = value;
    }

    /**
     * author 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * author 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * valueTo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueTo() {
        return valueTo;
    }

    /**
     * valueTo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueTo(String value) {
        this.valueTo = value;
    }

    /**
     * valcode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValcode() {
        return valcode;
    }

    /**
     * valcode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValcode(String value) {
        this.valcode = value;
    }

}
