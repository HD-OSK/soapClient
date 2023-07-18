//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.07.06 시간 02:56:53 PM KST 
//


package com.handok.soapClient.client.zfi_search_customer_ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Zsfi027 complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Zsfi027"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Kunnr" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Name1" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="Stcd2" type="{urn:sap-com:document:sap:soap:functions:mc-style}char11"/&gt;
 *         &lt;element name="Ktokd" type="{urn:sap-com:document:sap:soap:functions:mc-style}char4"/&gt;
 *         &lt;element name="Mcod1" type="{urn:sap-com:document:sap:soap:functions:mc-style}char25"/&gt;
 *         &lt;element name="Name4" type="{urn:sap-com:document:sap:soap:functions:mc-style}char30"/&gt;
 *         &lt;element name="Pfach" type="{urn:sap-com:document:sap:soap:functions:mc-style}char10"/&gt;
 *         &lt;element name="Pstl2" type="{urn:sap-com:document:sap:soap:functions:mc-style}char10"/&gt;
 *         &lt;element name="Xblocked" type="{urn:sap-com:document:sap:soap:functions:mc-style}char1"/&gt;
 *         &lt;element name="Vtweg" type="{urn:sap-com:document:sap:soap:functions:mc-style}char2"/&gt;
 *         &lt;element name="Spart" type="{urn:sap-com:document:sap:soap:functions:mc-style}char2"/&gt;
 *         &lt;element name="Ort01" type="{urn:sap-com:document:sap:soap:functions:mc-style}char35"/&gt;
 *         &lt;element name="Stras" type="{urn:sap-com:document:sap:soap:functions:mc-style}char35"/&gt;
 *         &lt;element name="Pstlz" type="{urn:sap-com:document:sap:soap:functions:mc-style}char10"/&gt;
 *         &lt;element name="Telf1" type="{urn:sap-com:document:sap:soap:functions:mc-style}char16"/&gt;
 *         &lt;element name="SmtpAddr" type="{urn:sap-com:document:sap:soap:functions:mc-style}char241"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Zsfi027", propOrder = {
    "kunnr",
    "name1",
    "stcd2",
    "ktokd",
    "mcod1",
    "name4",
    "pfach",
    "pstl2",
    "xblocked",
    "vtweg",
    "spart",
    "ort01",
    "stras",
    "pstlz",
    "telf1",
    "smtpAddr"
})
public class Zsfi027 {

    @XmlElement(name = "Kunnr", required = true)
    protected String kunnr;
    @XmlElement(name = "Name1", required = true)
    protected String name1;
    @XmlElement(name = "Stcd2", required = true)
    protected String stcd2;
    @XmlElement(name = "Ktokd", required = true)
    protected String ktokd;
    @XmlElement(name = "Mcod1", required = true)
    protected String mcod1;
    @XmlElement(name = "Name4", required = true)
    protected String name4;
    @XmlElement(name = "Pfach", required = true)
    protected String pfach;
    @XmlElement(name = "Pstl2", required = true)
    protected String pstl2;
    @XmlElement(name = "Xblocked", required = true)
    protected String xblocked;
    @XmlElement(name = "Vtweg", required = true)
    protected String vtweg;
    @XmlElement(name = "Spart", required = true)
    protected String spart;
    @XmlElement(name = "Ort01", required = true)
    protected String ort01;
    @XmlElement(name = "Stras", required = true)
    protected String stras;
    @XmlElement(name = "Pstlz", required = true)
    protected String pstlz;
    @XmlElement(name = "Telf1", required = true)
    protected String telf1;
    @XmlElement(name = "SmtpAddr", required = true)
    protected String smtpAddr;

    /**
     * kunnr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKunnr() {
        return kunnr;
    }

    /**
     * kunnr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKunnr(String value) {
        this.kunnr = value;
    }

    /**
     * name1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName1() {
        return name1;
    }

    /**
     * name1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName1(String value) {
        this.name1 = value;
    }

    /**
     * stcd2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStcd2() {
        return stcd2;
    }

    /**
     * stcd2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStcd2(String value) {
        this.stcd2 = value;
    }

    /**
     * ktokd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKtokd() {
        return ktokd;
    }

    /**
     * ktokd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKtokd(String value) {
        this.ktokd = value;
    }

    /**
     * mcod1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMcod1() {
        return mcod1;
    }

    /**
     * mcod1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMcod1(String value) {
        this.mcod1 = value;
    }

    /**
     * name4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName4() {
        return name4;
    }

    /**
     * name4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName4(String value) {
        this.name4 = value;
    }

    /**
     * pfach 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfach() {
        return pfach;
    }

    /**
     * pfach 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfach(String value) {
        this.pfach = value;
    }

    /**
     * pstl2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstl2() {
        return pstl2;
    }

    /**
     * pstl2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstl2(String value) {
        this.pstl2 = value;
    }

    /**
     * xblocked 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXblocked() {
        return xblocked;
    }

    /**
     * xblocked 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXblocked(String value) {
        this.xblocked = value;
    }

    /**
     * vtweg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVtweg() {
        return vtweg;
    }

    /**
     * vtweg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVtweg(String value) {
        this.vtweg = value;
    }

    /**
     * spart 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpart() {
        return spart;
    }

    /**
     * spart 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpart(String value) {
        this.spart = value;
    }

    /**
     * ort01 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrt01() {
        return ort01;
    }

    /**
     * ort01 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrt01(String value) {
        this.ort01 = value;
    }

    /**
     * stras 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStras() {
        return stras;
    }

    /**
     * stras 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStras(String value) {
        this.stras = value;
    }

    /**
     * pstlz 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstlz() {
        return pstlz;
    }

    /**
     * pstlz 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstlz(String value) {
        this.pstlz = value;
    }

    /**
     * telf1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelf1() {
        return telf1;
    }

    /**
     * telf1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelf1(String value) {
        this.telf1 = value;
    }

    /**
     * smtpAddr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmtpAddr() {
        return smtpAddr;
    }

    /**
     * smtpAddr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmtpAddr(String value) {
        this.smtpAddr = value;
    }

}
