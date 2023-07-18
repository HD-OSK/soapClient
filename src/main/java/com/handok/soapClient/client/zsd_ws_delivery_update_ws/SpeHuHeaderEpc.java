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
 * <p>_-spe_-huHeaderEpc complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="_-spe_-huHeaderEpc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Venum" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Urn" type="{urn:sap-com:document:sap:rfc:functions}char128"/&gt;
 *         &lt;element name="Exidv" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="SpeUpdkz" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_-spe_-huHeaderEpc", propOrder = {
    "venum",
    "urn",
    "exidv",
    "speUpdkz"
})
public class SpeHuHeaderEpc {

    @XmlElement(name = "Venum", required = true)
    protected String venum;
    @XmlElement(name = "Urn", required = true)
    protected String urn;
    @XmlElement(name = "Exidv", required = true)
    protected String exidv;
    @XmlElement(name = "SpeUpdkz", required = true)
    protected String speUpdkz;

    /**
     * venum 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVenum() {
        return venum;
    }

    /**
     * venum 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVenum(String value) {
        this.venum = value;
    }

    /**
     * urn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrn() {
        return urn;
    }

    /**
     * urn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrn(String value) {
        this.urn = value;
    }

    /**
     * exidv 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExidv() {
        return exidv;
    }

    /**
     * exidv 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExidv(String value) {
        this.exidv = value;
    }

    /**
     * speUpdkz 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeUpdkz() {
        return speUpdkz;
    }

    /**
     * speUpdkz 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeUpdkz(String value) {
        this.speUpdkz = value;
    }

}
