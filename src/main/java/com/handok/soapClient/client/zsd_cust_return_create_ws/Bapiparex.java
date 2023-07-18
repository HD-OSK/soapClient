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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Bapiparex complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Bapiparex"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Structure" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="Valuepart1" type="{urn:sap-com:document:sap:rfc:functions}char240"/&gt;
 *         &lt;element name="Valuepart2" type="{urn:sap-com:document:sap:rfc:functions}char240"/&gt;
 *         &lt;element name="Valuepart3" type="{urn:sap-com:document:sap:rfc:functions}char240"/&gt;
 *         &lt;element name="Valuepart4" type="{urn:sap-com:document:sap:rfc:functions}char240"/&gt;
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
    "structure",
    "valuepart1",
    "valuepart2",
    "valuepart3",
    "valuepart4"
})
public class Bapiparex {

    @XmlElement(name = "Structure", required = true)
    protected String structure;
    @XmlElement(name = "Valuepart1", required = true)
    protected String valuepart1;
    @XmlElement(name = "Valuepart2", required = true)
    protected String valuepart2;
    @XmlElement(name = "Valuepart3", required = true)
    protected String valuepart3;
    @XmlElement(name = "Valuepart4", required = true)
    protected String valuepart4;

    /**
     * structure 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStructure() {
        return structure;
    }

    /**
     * structure 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStructure(String value) {
        this.structure = value;
    }

    /**
     * valuepart1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValuepart1() {
        return valuepart1;
    }

    /**
     * valuepart1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValuepart1(String value) {
        this.valuepart1 = value;
    }

    /**
     * valuepart2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValuepart2() {
        return valuepart2;
    }

    /**
     * valuepart2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValuepart2(String value) {
        this.valuepart2 = value;
    }

    /**
     * valuepart3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValuepart3() {
        return valuepart3;
    }

    /**
     * valuepart3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValuepart3(String value) {
        this.valuepart3 = value;
    }

    /**
     * valuepart4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValuepart4() {
        return valuepart4;
    }

    /**
     * valuepart4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValuepart4(String value) {
        this.valuepart4 = value;
    }

}
