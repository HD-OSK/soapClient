//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.06.02 시간 07:11:25 PM KST 
//


package com.handok.soapClient.client.zsd_ws_delivery_update_ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Prott complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Prott"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Vbeln" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Posnr" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="Matnr" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="Arktx" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="Lfimg" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="Vrkme" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="Charg" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Msgno" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Msgty" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Msgid" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="Msgv1" type="{urn:sap-com:document:sap:rfc:functions}char50"/&gt;
 *         &lt;element name="Msgv2" type="{urn:sap-com:document:sap:rfc:functions}char50"/&gt;
 *         &lt;element name="Msgv3" type="{urn:sap-com:document:sap:rfc:functions}char50"/&gt;
 *         &lt;element name="Msgv4" type="{urn:sap-com:document:sap:rfc:functions}char50"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Prott", propOrder = {
    "vbeln",
    "posnr",
    "matnr",
    "arktx",
    "lfimg",
    "vrkme",
    "charg",
    "msgno",
    "msgty",
    "msgid",
    "msgv1",
    "msgv2",
    "msgv3",
    "msgv4"
})
public class Prott {

    @XmlElement(name = "Vbeln", required = true)
    protected String vbeln;
    @XmlElement(name = "Posnr", required = true)
    protected String posnr;
    @XmlElement(name = "Matnr", required = true)
    protected String matnr;
    @XmlElement(name = "Arktx", required = true)
    protected String arktx;
    @XmlElement(name = "Lfimg", required = true)
    protected BigDecimal lfimg;
    @XmlElement(name = "Vrkme", required = true)
    protected String vrkme;
    @XmlElement(name = "Charg", required = true)
    protected String charg;
    @XmlElement(name = "Msgno", required = true)
    protected String msgno;
    @XmlElement(name = "Msgty", required = true)
    protected String msgty;
    @XmlElement(name = "Msgid", required = true)
    protected String msgid;
    @XmlElement(name = "Msgv1", required = true)
    protected String msgv1;
    @XmlElement(name = "Msgv2", required = true)
    protected String msgv2;
    @XmlElement(name = "Msgv3", required = true)
    protected String msgv3;
    @XmlElement(name = "Msgv4", required = true)
    protected String msgv4;

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
     * arktx 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArktx() {
        return arktx;
    }

    /**
     * arktx 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArktx(String value) {
        this.arktx = value;
    }

    /**
     * lfimg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLfimg() {
        return lfimg;
    }

    /**
     * lfimg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLfimg(BigDecimal value) {
        this.lfimg = value;
    }

    /**
     * vrkme 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrkme() {
        return vrkme;
    }

    /**
     * vrkme 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrkme(String value) {
        this.vrkme = value;
    }

    /**
     * charg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharg() {
        return charg;
    }

    /**
     * charg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharg(String value) {
        this.charg = value;
    }

    /**
     * msgno 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgno() {
        return msgno;
    }

    /**
     * msgno 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgno(String value) {
        this.msgno = value;
    }

    /**
     * msgty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgty() {
        return msgty;
    }

    /**
     * msgty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgty(String value) {
        this.msgty = value;
    }

    /**
     * msgid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgid() {
        return msgid;
    }

    /**
     * msgid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgid(String value) {
        this.msgid = value;
    }

    /**
     * msgv1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgv1() {
        return msgv1;
    }

    /**
     * msgv1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgv1(String value) {
        this.msgv1 = value;
    }

    /**
     * msgv2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgv2() {
        return msgv2;
    }

    /**
     * msgv2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgv2(String value) {
        this.msgv2 = value;
    }

    /**
     * msgv3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgv3() {
        return msgv3;
    }

    /**
     * msgv3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgv3(String value) {
        this.msgv3 = value;
    }

    /**
     * msgv4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgv4() {
        return msgv4;
    }

    /**
     * msgv4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgv4(String value) {
        this.msgv4 = value;
    }

}
