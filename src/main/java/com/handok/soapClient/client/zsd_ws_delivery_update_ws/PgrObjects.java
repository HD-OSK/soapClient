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
 * <p>PgrObjects complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PgrObjects"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Objtyp" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Objkey" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="Objkey2" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="Objpos" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="Vbeln" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Posnr" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="Matnr" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="SplitNr" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PgrObjects", propOrder = {
    "objtyp",
    "objkey",
    "objkey2",
    "objpos",
    "vbeln",
    "posnr",
    "matnr",
    "splitNr"
})
public class PgrObjects {

    @XmlElement(name = "Objtyp", required = true)
    protected String objtyp;
    @XmlElement(name = "Objkey", required = true)
    protected String objkey;
    @XmlElement(name = "Objkey2", required = true)
    protected String objkey2;
    @XmlElement(name = "Objpos", required = true)
    protected String objpos;
    @XmlElement(name = "Vbeln", required = true)
    protected String vbeln;
    @XmlElement(name = "Posnr", required = true)
    protected String posnr;
    @XmlElement(name = "Matnr", required = true)
    protected String matnr;
    @XmlElement(name = "SplitNr", required = true)
    protected String splitNr;

    /**
     * objtyp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjtyp() {
        return objtyp;
    }

    /**
     * objtyp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjtyp(String value) {
        this.objtyp = value;
    }

    /**
     * objkey 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjkey() {
        return objkey;
    }

    /**
     * objkey 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjkey(String value) {
        this.objkey = value;
    }

    /**
     * objkey2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjkey2() {
        return objkey2;
    }

    /**
     * objkey2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjkey2(String value) {
        this.objkey2 = value;
    }

    /**
     * objpos 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjpos() {
        return objpos;
    }

    /**
     * objpos 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjpos(String value) {
        this.objpos = value;
    }

    /**
     * vbeln 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVbeln() {
        return vbeln;
    }

    /**
     * vbeln 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVbeln(String value) {
        this.vbeln = value;
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
     * matnr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatnr() {
        return matnr;
    }

    /**
     * matnr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatnr(String value) {
        this.matnr = value;
    }

    /**
     * splitNr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplitNr() {
        return splitNr;
    }

    /**
     * splitNr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSplitNr(String value) {
        this.splitNr = value;
    }

}
