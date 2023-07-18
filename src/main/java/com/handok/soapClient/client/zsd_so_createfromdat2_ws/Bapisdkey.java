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
 * <p>Bapisdkey complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Bapisdkey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Refobjtyp" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Refobject" type="{urn:sap-com:document:sap:rfc:functions}char32"/&gt;
 *         &lt;element name="Refobjkey" type="{urn:sap-com:document:sap:rfc:functions}char70"/&gt;
 *         &lt;element name="Reflogsys" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="DocNumber" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="ItmNumber" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="SchedLin" type="{urn:sap-com:document:sap:rfc:functions}numeric4"/&gt;
 *         &lt;element name="CondNo" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Conditemno" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="CondStNo" type="{urn:sap-com:document:sap:rfc:functions}numeric3"/&gt;
 *         &lt;element name="CondCount" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/&gt;
 *         &lt;element name="CondType" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Status" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Tindex" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="Address" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Abrli" type="{urn:sap-com:document:sap:rfc:functions}numeric4"/&gt;
 *         &lt;element name="Abart" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
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
    "refobjtyp",
    "refobject",
    "refobjkey",
    "reflogsys",
    "docNumber",
    "itmNumber",
    "schedLin",
    "condNo",
    "conditemno",
    "condStNo",
    "condCount",
    "condType",
    "status",
    "tindex",
    "address",
    "abrli",
    "abart"
})
public class Bapisdkey {

    @XmlElement(name = "Refobjtyp", required = true)
    protected String refobjtyp;
    @XmlElement(name = "Refobject", required = true)
    protected String refobject;
    @XmlElement(name = "Refobjkey", required = true)
    protected String refobjkey;
    @XmlElement(name = "Reflogsys", required = true)
    protected String reflogsys;
    @XmlElement(name = "DocNumber", required = true)
    protected String docNumber;
    @XmlElement(name = "ItmNumber", required = true)
    protected String itmNumber;
    @XmlElement(name = "SchedLin", required = true)
    protected String schedLin;
    @XmlElement(name = "CondNo", required = true)
    protected String condNo;
    @XmlElement(name = "Conditemno", required = true)
    protected String conditemno;
    @XmlElement(name = "CondStNo", required = true)
    protected String condStNo;
    @XmlElement(name = "CondCount", required = true)
    protected String condCount;
    @XmlElement(name = "CondType", required = true)
    protected String condType;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "Tindex", required = true)
    protected String tindex;
    @XmlElement(name = "Address", required = true)
    protected String address;
    @XmlElement(name = "Abrli", required = true)
    protected String abrli;
    @XmlElement(name = "Abart", required = true)
    protected String abart;

    /**
     * refobjtyp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefobjtyp() {
        return refobjtyp;
    }

    /**
     * refobjtyp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefobjtyp(String value) {
        this.refobjtyp = value;
    }

    /**
     * refobject 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefobject() {
        return refobject;
    }

    /**
     * refobject 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefobject(String value) {
        this.refobject = value;
    }

    /**
     * refobjkey 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefobjkey() {
        return refobjkey;
    }

    /**
     * refobjkey 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefobjkey(String value) {
        this.refobjkey = value;
    }

    /**
     * reflogsys 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReflogsys() {
        return reflogsys;
    }

    /**
     * reflogsys 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReflogsys(String value) {
        this.reflogsys = value;
    }

    /**
     * docNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * docNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNumber(String value) {
        this.docNumber = value;
    }

    /**
     * itmNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItmNumber() {
        return itmNumber;
    }

    /**
     * itmNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItmNumber(String value) {
        this.itmNumber = value;
    }

    /**
     * schedLin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchedLin() {
        return schedLin;
    }

    /**
     * schedLin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchedLin(String value) {
        this.schedLin = value;
    }

    /**
     * condNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondNo() {
        return condNo;
    }

    /**
     * condNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondNo(String value) {
        this.condNo = value;
    }

    /**
     * conditemno 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditemno() {
        return conditemno;
    }

    /**
     * conditemno 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditemno(String value) {
        this.conditemno = value;
    }

    /**
     * condStNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondStNo() {
        return condStNo;
    }

    /**
     * condStNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondStNo(String value) {
        this.condStNo = value;
    }

    /**
     * condCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondCount() {
        return condCount;
    }

    /**
     * condCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondCount(String value) {
        this.condCount = value;
    }

    /**
     * condType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondType() {
        return condType;
    }

    /**
     * condType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondType(String value) {
        this.condType = value;
    }

    /**
     * status 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * status 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * tindex 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTindex() {
        return tindex;
    }

    /**
     * tindex 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTindex(String value) {
        this.tindex = value;
    }

    /**
     * address 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * address 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * abrli 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbrli() {
        return abrli;
    }

    /**
     * abrli 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbrli(String value) {
        this.abrli = value;
    }

    /**
     * abart 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbart() {
        return abart;
    }

    /**
     * abart 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbart(String value) {
        this.abart = value;
    }

}
