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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>TexthGn complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TexthGn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rfbel" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Rfpos" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="Tdobject" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Tdname" type="{urn:sap-com:document:sap:rfc:functions}char70"/&gt;
 *         &lt;element name="Tdid" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Tdspras" type="{urn:sap-com:document:sap:rfc:functions}lang"/&gt;
 *         &lt;element name="Tdtitle" type="{urn:sap-com:document:sap:rfc:functions}char50"/&gt;
 *         &lt;element name="Tdform" type="{urn:sap-com:document:sap:rfc:functions}char16"/&gt;
 *         &lt;element name="Tdstyle" type="{urn:sap-com:document:sap:rfc:functions}char8"/&gt;
 *         &lt;element name="Tdversion" type="{urn:sap-com:document:sap:rfc:functions}numeric5"/&gt;
 *         &lt;element name="Tdfuser" type="{urn:sap-com:document:sap:rfc:functions}char12"/&gt;
 *         &lt;element name="Tdfreles" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Tdfdate" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Tdftime" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="Tdluser" type="{urn:sap-com:document:sap:rfc:functions}char12"/&gt;
 *         &lt;element name="Tdlreles" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Tdldate" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Tdltime" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="Tdlinesize" type="{urn:sap-com:document:sap:rfc:functions}numeric3"/&gt;
 *         &lt;element name="Tdtxtlines" type="{urn:sap-com:document:sap:rfc:functions}numeric5"/&gt;
 *         &lt;element name="Tdhyphenat" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Tdospras" type="{urn:sap-com:document:sap:rfc:functions}lang"/&gt;
 *         &lt;element name="Tdtranstat" type="{urn:sap-com:document:sap:rfc:functions}numeric1"/&gt;
 *         &lt;element name="Tdmacode1" type="{urn:sap-com:document:sap:rfc:functions}char16"/&gt;
 *         &lt;element name="Tdmacode2" type="{urn:sap-com:document:sap:rfc:functions}char16"/&gt;
 *         &lt;element name="Tdrefobj" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Tdrefname" type="{urn:sap-com:document:sap:rfc:functions}char70"/&gt;
 *         &lt;element name="Tdrefid" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Tdtexttype" type="{urn:sap-com:document:sap:rfc:functions}char6"/&gt;
 *         &lt;element name="Tdcompress" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Mandt" type="{urn:sap-com:document:sap:rfc:functions}clnt3"/&gt;
 *         &lt;element name="Tdoclass" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Logsys" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TexthGn", propOrder = {
    "rfbel",
    "rfpos",
    "tdobject",
    "tdname",
    "tdid",
    "tdspras",
    "tdtitle",
    "tdform",
    "tdstyle",
    "tdversion",
    "tdfuser",
    "tdfreles",
    "tdfdate",
    "tdftime",
    "tdluser",
    "tdlreles",
    "tdldate",
    "tdltime",
    "tdlinesize",
    "tdtxtlines",
    "tdhyphenat",
    "tdospras",
    "tdtranstat",
    "tdmacode1",
    "tdmacode2",
    "tdrefobj",
    "tdrefname",
    "tdrefid",
    "tdtexttype",
    "tdcompress",
    "mandt",
    "tdoclass",
    "logsys"
})
public class TexthGn {

    @XmlElement(name = "Rfbel", required = true)
    protected String rfbel;
    @XmlElement(name = "Rfpos", required = true)
    protected String rfpos;
    @XmlElement(name = "Tdobject", required = true)
    protected String tdobject;
    @XmlElement(name = "Tdname", required = true)
    protected String tdname;
    @XmlElement(name = "Tdid", required = true)
    protected String tdid;
    @XmlElement(name = "Tdspras", required = true)
    protected String tdspras;
    @XmlElement(name = "Tdtitle", required = true)
    protected String tdtitle;
    @XmlElement(name = "Tdform", required = true)
    protected String tdform;
    @XmlElement(name = "Tdstyle", required = true)
    protected String tdstyle;
    @XmlElement(name = "Tdversion", required = true)
    protected String tdversion;
    @XmlElement(name = "Tdfuser", required = true)
    protected String tdfuser;
    @XmlElement(name = "Tdfreles", required = true)
    protected String tdfreles;
    @XmlElement(name = "Tdfdate", required = true)
    protected String tdfdate;
    @XmlElement(name = "Tdftime", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar tdftime;
    @XmlElement(name = "Tdluser", required = true)
    protected String tdluser;
    @XmlElement(name = "Tdlreles", required = true)
    protected String tdlreles;
    @XmlElement(name = "Tdldate", required = true)
    protected String tdldate;
    @XmlElement(name = "Tdltime", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar tdltime;
    @XmlElement(name = "Tdlinesize", required = true)
    protected String tdlinesize;
    @XmlElement(name = "Tdtxtlines", required = true)
    protected String tdtxtlines;
    @XmlElement(name = "Tdhyphenat", required = true)
    protected String tdhyphenat;
    @XmlElement(name = "Tdospras", required = true)
    protected String tdospras;
    @XmlElement(name = "Tdtranstat", required = true)
    protected String tdtranstat;
    @XmlElement(name = "Tdmacode1", required = true)
    protected String tdmacode1;
    @XmlElement(name = "Tdmacode2", required = true)
    protected String tdmacode2;
    @XmlElement(name = "Tdrefobj", required = true)
    protected String tdrefobj;
    @XmlElement(name = "Tdrefname", required = true)
    protected String tdrefname;
    @XmlElement(name = "Tdrefid", required = true)
    protected String tdrefid;
    @XmlElement(name = "Tdtexttype", required = true)
    protected String tdtexttype;
    @XmlElement(name = "Tdcompress", required = true)
    protected String tdcompress;
    @XmlElement(name = "Mandt", required = true)
    protected String mandt;
    @XmlElement(name = "Tdoclass", required = true)
    protected String tdoclass;
    @XmlElement(name = "Logsys", required = true)
    protected String logsys;

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

    /**
     * tdobject 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdobject() {
        return tdobject;
    }

    /**
     * tdobject 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdobject(String value) {
        this.tdobject = value;
    }

    /**
     * tdname 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdname() {
        return tdname;
    }

    /**
     * tdname 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdname(String value) {
        this.tdname = value;
    }

    /**
     * tdid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdid() {
        return tdid;
    }

    /**
     * tdid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdid(String value) {
        this.tdid = value;
    }

    /**
     * tdspras 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdspras() {
        return tdspras;
    }

    /**
     * tdspras 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdspras(String value) {
        this.tdspras = value;
    }

    /**
     * tdtitle 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdtitle() {
        return tdtitle;
    }

    /**
     * tdtitle 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdtitle(String value) {
        this.tdtitle = value;
    }

    /**
     * tdform 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdform() {
        return tdform;
    }

    /**
     * tdform 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdform(String value) {
        this.tdform = value;
    }

    /**
     * tdstyle 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdstyle() {
        return tdstyle;
    }

    /**
     * tdstyle 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdstyle(String value) {
        this.tdstyle = value;
    }

    /**
     * tdversion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdversion() {
        return tdversion;
    }

    /**
     * tdversion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdversion(String value) {
        this.tdversion = value;
    }

    /**
     * tdfuser 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdfuser() {
        return tdfuser;
    }

    /**
     * tdfuser 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdfuser(String value) {
        this.tdfuser = value;
    }

    /**
     * tdfreles 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdfreles() {
        return tdfreles;
    }

    /**
     * tdfreles 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdfreles(String value) {
        this.tdfreles = value;
    }

    /**
     * tdfdate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdfdate() {
        return tdfdate;
    }

    /**
     * tdfdate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdfdate(String value) {
        this.tdfdate = value;
    }

    /**
     * tdftime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTdftime() {
        return tdftime;
    }

    /**
     * tdftime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTdftime(XMLGregorianCalendar value) {
        this.tdftime = value;
    }

    /**
     * tdluser 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdluser() {
        return tdluser;
    }

    /**
     * tdluser 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdluser(String value) {
        this.tdluser = value;
    }

    /**
     * tdlreles 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdlreles() {
        return tdlreles;
    }

    /**
     * tdlreles 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdlreles(String value) {
        this.tdlreles = value;
    }

    /**
     * tdldate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdldate() {
        return tdldate;
    }

    /**
     * tdldate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdldate(String value) {
        this.tdldate = value;
    }

    /**
     * tdltime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTdltime() {
        return tdltime;
    }

    /**
     * tdltime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTdltime(XMLGregorianCalendar value) {
        this.tdltime = value;
    }

    /**
     * tdlinesize 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdlinesize() {
        return tdlinesize;
    }

    /**
     * tdlinesize 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdlinesize(String value) {
        this.tdlinesize = value;
    }

    /**
     * tdtxtlines 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdtxtlines() {
        return tdtxtlines;
    }

    /**
     * tdtxtlines 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdtxtlines(String value) {
        this.tdtxtlines = value;
    }

    /**
     * tdhyphenat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdhyphenat() {
        return tdhyphenat;
    }

    /**
     * tdhyphenat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdhyphenat(String value) {
        this.tdhyphenat = value;
    }

    /**
     * tdospras 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdospras() {
        return tdospras;
    }

    /**
     * tdospras 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdospras(String value) {
        this.tdospras = value;
    }

    /**
     * tdtranstat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdtranstat() {
        return tdtranstat;
    }

    /**
     * tdtranstat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdtranstat(String value) {
        this.tdtranstat = value;
    }

    /**
     * tdmacode1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdmacode1() {
        return tdmacode1;
    }

    /**
     * tdmacode1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdmacode1(String value) {
        this.tdmacode1 = value;
    }

    /**
     * tdmacode2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdmacode2() {
        return tdmacode2;
    }

    /**
     * tdmacode2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdmacode2(String value) {
        this.tdmacode2 = value;
    }

    /**
     * tdrefobj 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdrefobj() {
        return tdrefobj;
    }

    /**
     * tdrefobj 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdrefobj(String value) {
        this.tdrefobj = value;
    }

    /**
     * tdrefname 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdrefname() {
        return tdrefname;
    }

    /**
     * tdrefname 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdrefname(String value) {
        this.tdrefname = value;
    }

    /**
     * tdrefid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdrefid() {
        return tdrefid;
    }

    /**
     * tdrefid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdrefid(String value) {
        this.tdrefid = value;
    }

    /**
     * tdtexttype 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdtexttype() {
        return tdtexttype;
    }

    /**
     * tdtexttype 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdtexttype(String value) {
        this.tdtexttype = value;
    }

    /**
     * tdcompress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdcompress() {
        return tdcompress;
    }

    /**
     * tdcompress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdcompress(String value) {
        this.tdcompress = value;
    }

    /**
     * mandt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandt() {
        return mandt;
    }

    /**
     * mandt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandt(String value) {
        this.mandt = value;
    }

    /**
     * tdoclass 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdoclass() {
        return tdoclass;
    }

    /**
     * tdoclass 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdoclass(String value) {
        this.tdoclass = value;
    }

    /**
     * logsys 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogsys() {
        return logsys;
    }

    /**
     * logsys 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogsys(String value) {
        this.logsys = value;
    }

}
