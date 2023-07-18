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
 * <p>HumRehangHu complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="HumRehangHu"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TopHuExternal" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="TopHuInternal" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Venum" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Vepos" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="Rfbel" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Rfpos" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HumRehangHu", propOrder = {
    "topHuExternal",
    "topHuInternal",
    "venum",
    "vepos",
    "rfbel",
    "rfpos"
})
public class HumRehangHu {

    @XmlElement(name = "TopHuExternal", required = true)
    protected String topHuExternal;
    @XmlElement(name = "TopHuInternal", required = true)
    protected String topHuInternal;
    @XmlElement(name = "Venum", required = true)
    protected String venum;
    @XmlElement(name = "Vepos", required = true)
    protected String vepos;
    @XmlElement(name = "Rfbel", required = true)
    protected String rfbel;
    @XmlElement(name = "Rfpos", required = true)
    protected String rfpos;

    /**
     * topHuExternal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopHuExternal() {
        return topHuExternal;
    }

    /**
     * topHuExternal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopHuExternal(String value) {
        this.topHuExternal = value;
    }

    /**
     * topHuInternal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopHuInternal() {
        return topHuInternal;
    }

    /**
     * topHuInternal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopHuInternal(String value) {
        this.topHuInternal = value;
    }

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
     * vepos 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVepos() {
        return vepos;
    }

    /**
     * vepos 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVepos(String value) {
        this.vepos = value;
    }

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

}
