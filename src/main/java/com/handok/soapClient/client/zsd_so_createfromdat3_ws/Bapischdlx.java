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
 * <p>Bapischdlx complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Bapischdlx"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItmNumber" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="SchedLine" type="{urn:sap-com:document:sap:rfc:functions}numeric4"/&gt;
 *         &lt;element name="Updateflag" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ReqDate" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="DateType" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ReqTime" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ReqQty" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ReqDlvBl" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SchedType" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TpDate" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="MsDate" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="LoadDate" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="GiDate" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TpTime" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="MsTime" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="LoadTime" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="GiTime" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Refobjtype" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Refobjkey" type="{urn:sap-com:document:sap:rfc:functions}char70"/&gt;
 *         &lt;element name="DlvDate" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="DlvTime" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="RelType" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="PlanSchedType" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
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
    "itmNumber",
    "schedLine",
    "updateflag",
    "reqDate",
    "dateType",
    "reqTime",
    "reqQty",
    "reqDlvBl",
    "schedType",
    "tpDate",
    "msDate",
    "loadDate",
    "giDate",
    "tpTime",
    "msTime",
    "loadTime",
    "giTime",
    "refobjtype",
    "refobjkey",
    "dlvDate",
    "dlvTime",
    "relType",
    "planSchedType"
})
public class Bapischdlx {

    @XmlElement(name = "ItmNumber", required = true)
    protected String itmNumber;
    @XmlElement(name = "SchedLine", required = true)
    protected String schedLine;
    @XmlElement(name = "Updateflag", required = true)
    protected String updateflag;
    @XmlElement(name = "ReqDate", required = true)
    protected String reqDate;
    @XmlElement(name = "DateType", required = true)
    protected String dateType;
    @XmlElement(name = "ReqTime", required = true)
    protected String reqTime;
    @XmlElement(name = "ReqQty", required = true)
    protected String reqQty;
    @XmlElement(name = "ReqDlvBl", required = true)
    protected String reqDlvBl;
    @XmlElement(name = "SchedType", required = true)
    protected String schedType;
    @XmlElement(name = "TpDate", required = true)
    protected String tpDate;
    @XmlElement(name = "MsDate", required = true)
    protected String msDate;
    @XmlElement(name = "LoadDate", required = true)
    protected String loadDate;
    @XmlElement(name = "GiDate", required = true)
    protected String giDate;
    @XmlElement(name = "TpTime", required = true)
    protected String tpTime;
    @XmlElement(name = "MsTime", required = true)
    protected String msTime;
    @XmlElement(name = "LoadTime", required = true)
    protected String loadTime;
    @XmlElement(name = "GiTime", required = true)
    protected String giTime;
    @XmlElement(name = "Refobjtype", required = true)
    protected String refobjtype;
    @XmlElement(name = "Refobjkey", required = true)
    protected String refobjkey;
    @XmlElement(name = "DlvDate", required = true)
    protected String dlvDate;
    @XmlElement(name = "DlvTime", required = true)
    protected String dlvTime;
    @XmlElement(name = "RelType", required = true)
    protected String relType;
    @XmlElement(name = "PlanSchedType", required = true)
    protected String planSchedType;

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
     * schedLine 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchedLine() {
        return schedLine;
    }

    /**
     * schedLine 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchedLine(String value) {
        this.schedLine = value;
    }

    /**
     * updateflag 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateflag() {
        return updateflag;
    }

    /**
     * updateflag 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateflag(String value) {
        this.updateflag = value;
    }

    /**
     * reqDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqDate() {
        return reqDate;
    }

    /**
     * reqDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqDate(String value) {
        this.reqDate = value;
    }

    /**
     * dateType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateType() {
        return dateType;
    }

    /**
     * dateType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateType(String value) {
        this.dateType = value;
    }

    /**
     * reqTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqTime() {
        return reqTime;
    }

    /**
     * reqTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqTime(String value) {
        this.reqTime = value;
    }

    /**
     * reqQty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqQty() {
        return reqQty;
    }

    /**
     * reqQty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqQty(String value) {
        this.reqQty = value;
    }

    /**
     * reqDlvBl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqDlvBl() {
        return reqDlvBl;
    }

    /**
     * reqDlvBl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqDlvBl(String value) {
        this.reqDlvBl = value;
    }

    /**
     * schedType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchedType() {
        return schedType;
    }

    /**
     * schedType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchedType(String value) {
        this.schedType = value;
    }

    /**
     * tpDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpDate() {
        return tpDate;
    }

    /**
     * tpDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpDate(String value) {
        this.tpDate = value;
    }

    /**
     * msDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsDate() {
        return msDate;
    }

    /**
     * msDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsDate(String value) {
        this.msDate = value;
    }

    /**
     * loadDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadDate() {
        return loadDate;
    }

    /**
     * loadDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadDate(String value) {
        this.loadDate = value;
    }

    /**
     * giDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiDate() {
        return giDate;
    }

    /**
     * giDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiDate(String value) {
        this.giDate = value;
    }

    /**
     * tpTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpTime() {
        return tpTime;
    }

    /**
     * tpTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpTime(String value) {
        this.tpTime = value;
    }

    /**
     * msTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsTime() {
        return msTime;
    }

    /**
     * msTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsTime(String value) {
        this.msTime = value;
    }

    /**
     * loadTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadTime() {
        return loadTime;
    }

    /**
     * loadTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadTime(String value) {
        this.loadTime = value;
    }

    /**
     * giTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiTime() {
        return giTime;
    }

    /**
     * giTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiTime(String value) {
        this.giTime = value;
    }

    /**
     * refobjtype 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefobjtype() {
        return refobjtype;
    }

    /**
     * refobjtype 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefobjtype(String value) {
        this.refobjtype = value;
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
     * dlvDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvDate() {
        return dlvDate;
    }

    /**
     * dlvDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlvDate(String value) {
        this.dlvDate = value;
    }

    /**
     * dlvTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvTime() {
        return dlvTime;
    }

    /**
     * dlvTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlvTime(String value) {
        this.dlvTime = value;
    }

    /**
     * relType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelType() {
        return relType;
    }

    /**
     * relType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelType(String value) {
        this.relType = value;
    }

    /**
     * planSchedType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanSchedType() {
        return planSchedType;
    }

    /**
     * planSchedType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanSchedType(String value) {
        this.planSchedType = value;
    }

}
