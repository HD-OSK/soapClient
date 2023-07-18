//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.06.02 시간 07:11:24 PM KST 
//


package com.handok.soapClient.client.zsd_so_createfromdat3_ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Bapicucfg complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Bapicucfg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Posex" type="{urn:sap-com:document:sap:rfc:functions}char6"/&gt;
 *         &lt;element name="ConfigId" type="{urn:sap-com:document:sap:rfc:functions}char6"/&gt;
 *         &lt;element name="RootId" type="{urn:sap-com:document:sap:rfc:functions}char8"/&gt;
 *         &lt;element name="Sce" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Kbname" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="Kbversion" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="Complete" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Consistent" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Cfginfo" type="{urn:sap-com:document:sap:rfc:functions}char250"/&gt;
 *         &lt;element name="Kbprofile" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="Kblanguage" type="{urn:sap-com:document:sap:rfc:functions}lang"/&gt;
 *         &lt;element name="CbaseId" type="{urn:sap-com:document:sap:rfc:functions}char32"/&gt;
 *         &lt;element name="CbaseIdType" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
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
    "posex",
    "configId",
    "rootId",
    "sce",
    "kbname",
    "kbversion",
    "complete",
    "consistent",
    "cfginfo",
    "kbprofile",
    "kblanguage",
    "cbaseId",
    "cbaseIdType"
})
public class Bapicucfg {

    @XmlElement(name = "Posex", required = true)
    protected String posex;
    @XmlElement(name = "ConfigId", required = true)
    protected String configId;
    @XmlElement(name = "RootId", required = true)
    protected String rootId;
    @XmlElement(name = "Sce", required = true)
    protected String sce;
    @XmlElement(name = "Kbname", required = true)
    protected String kbname;
    @XmlElement(name = "Kbversion", required = true)
    protected String kbversion;
    @XmlElement(name = "Complete", required = true)
    protected String complete;
    @XmlElement(name = "Consistent", required = true)
    protected String consistent;
    @XmlElement(name = "Cfginfo", required = true)
    protected String cfginfo;
    @XmlElement(name = "Kbprofile", required = true)
    protected String kbprofile;
    @XmlElement(name = "Kblanguage", required = true)
    protected String kblanguage;
    @XmlElement(name = "CbaseId", required = true)
    protected String cbaseId;
    @XmlElement(name = "CbaseIdType", required = true)
    protected String cbaseIdType;

    /**
     * posex 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosex() {
        return posex;
    }

    /**
     * posex 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosex(String value) {
        this.posex = value;
    }

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
     * rootId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootId() {
        return rootId;
    }

    /**
     * rootId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootId(String value) {
        this.rootId = value;
    }

    /**
     * sce 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSce() {
        return sce;
    }

    /**
     * sce 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSce(String value) {
        this.sce = value;
    }

    /**
     * kbname 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKbname() {
        return kbname;
    }

    /**
     * kbname 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKbname(String value) {
        this.kbname = value;
    }

    /**
     * kbversion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKbversion() {
        return kbversion;
    }

    /**
     * kbversion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKbversion(String value) {
        this.kbversion = value;
    }

    /**
     * complete 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplete() {
        return complete;
    }

    /**
     * complete 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplete(String value) {
        this.complete = value;
    }

    /**
     * consistent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsistent() {
        return consistent;
    }

    /**
     * consistent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsistent(String value) {
        this.consistent = value;
    }

    /**
     * cfginfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfginfo() {
        return cfginfo;
    }

    /**
     * cfginfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfginfo(String value) {
        this.cfginfo = value;
    }

    /**
     * kbprofile 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKbprofile() {
        return kbprofile;
    }

    /**
     * kbprofile 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKbprofile(String value) {
        this.kbprofile = value;
    }

    /**
     * kblanguage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKblanguage() {
        return kblanguage;
    }

    /**
     * kblanguage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKblanguage(String value) {
        this.kblanguage = value;
    }

    /**
     * cbaseId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbaseId() {
        return cbaseId;
    }

    /**
     * cbaseId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbaseId(String value) {
        this.cbaseId = value;
    }

    /**
     * cbaseIdType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbaseIdType() {
        return cbaseIdType;
    }

    /**
     * cbaseIdType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbaseIdType(String value) {
        this.cbaseIdType = value;
    }

}
