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
 * <p>HumVerpoSernr complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="HumVerpoSernr"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExidvOb" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="Belnr" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Posnr" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="Sernr" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="Uii" type="{urn:sap-com:document:sap:rfc:functions}char72"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HumVerpoSernr", propOrder = {
    "exidvOb",
    "belnr",
    "posnr",
    "sernr",
    "uii"
})
public class HumVerpoSernr {

    @XmlElement(name = "ExidvOb", required = true)
    protected String exidvOb;
    @XmlElement(name = "Belnr", required = true)
    protected String belnr;
    @XmlElement(name = "Posnr", required = true)
    protected String posnr;
    @XmlElement(name = "Sernr", required = true)
    protected String sernr;
    @XmlElement(name = "Uii", required = true)
    protected String uii;

    /**
     * exidvOb 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExidvOb() {
        return exidvOb;
    }

    /**
     * exidvOb 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExidvOb(String value) {
        this.exidvOb = value;
    }

    /**
     * belnr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelnr() {
        return belnr;
    }

    /**
     * belnr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBelnr(String value) {
        this.belnr = value;
    }

    /**
     * posnr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosnr() {
        return posnr;
    }

    /**
     * posnr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosnr(String value) {
        this.posnr = value;
    }

    /**
     * sernr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSernr() {
        return sernr;
    }

    /**
     * sernr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSernr(String value) {
        this.sernr = value;
    }

    /**
     * uii 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUii() {
        return uii;
    }

    /**
     * uii 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUii(String value) {
        this.uii = value;
    }

}
