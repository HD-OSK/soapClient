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
 * <p>Verko complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Verko"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Exidv" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="Exida" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Vstel" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Lstel" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Brgew" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/&gt;
 *         &lt;element name="Ntgew" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/&gt;
 *         &lt;element name="Magew" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/&gt;
 *         &lt;element name="Tarag" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/&gt;
 *         &lt;element name="Gewei" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="Btvol" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/&gt;
 *         &lt;element name="Ntvol" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/&gt;
 *         &lt;element name="Mavol" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/&gt;
 *         &lt;element name="Tavol" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/&gt;
 *         &lt;element name="Voleh" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="Ernam" type="{urn:sap-com:document:sap:rfc:functions}char12"/&gt;
 *         &lt;element name="Sortl" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Magrv" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Vhart" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Meins" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="Vegr1" type="{urn:sap-com:document:sap:rfc:functions}char5"/&gt;
 *         &lt;element name="Vegr2" type="{urn:sap-com:document:sap:rfc:functions}char5"/&gt;
 *         &lt;element name="Vegr3" type="{urn:sap-com:document:sap:rfc:functions}char5"/&gt;
 *         &lt;element name="Vegr4" type="{urn:sap-com:document:sap:rfc:functions}char5"/&gt;
 *         &lt;element name="Vegr5" type="{urn:sap-com:document:sap:rfc:functions}char5"/&gt;
 *         &lt;element name="Vhilm" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="Laeng" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="Breit" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="Hoehe" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="Meabm" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="Erlkz" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Gewto" type="{urn:sap-com:document:sap:rfc:functions}decimal3.1"/&gt;
 *         &lt;element name="Volto" type="{urn:sap-com:document:sap:rfc:functions}decimal3.1"/&gt;
 *         &lt;element name="VolehMax" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="GeweiMax" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="Inhalt" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="Werks" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Ladlg" type="{urn:sap-com:document:sap:rfc:functions}quantum6.0"/&gt;
 *         &lt;element name="Ladeh" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="Farzt" type="{urn:sap-com:document:sap:rfc:functions}quantum3.0"/&gt;
 *         &lt;element name="Fareh" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="Entfe" type="{urn:sap-com:document:sap:rfc:functions}quantum6.0"/&gt;
 *         &lt;element name="Ehent" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="Namef" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="Nameb" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="Landt" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Landf" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Lgort" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Gewfx" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Exidv2" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="VhilmKu" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="Object" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Objkey" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="Venum" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Packvorschr" type="{urn:sap-com:document:sap:rfc:functions}char22"/&gt;
 *         &lt;element name="PackvorschrSt" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Status" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="ZulAufl" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/&gt;
 *         &lt;element name="Labeltyp" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Handle" type="{urn:sap-com:document:sap:rfc:functions}char22"/&gt;
 *         &lt;element name="Logsys" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="SpeUpdkz" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeIdart01" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeIdent01" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="SpeIdart02" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeIdent02" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="SpeIdart03" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeIdent03" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="SpeIdart04" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeIdent04" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="SpeLogpos" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="SpeChkCounter" type="{urn:sap-com:document:sap:rfc:functions}numeric5"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Verko", propOrder = {
    "exidv",
    "exida",
    "vstel",
    "lstel",
    "brgew",
    "ntgew",
    "magew",
    "tarag",
    "gewei",
    "btvol",
    "ntvol",
    "mavol",
    "tavol",
    "voleh",
    "ernam",
    "sortl",
    "magrv",
    "vhart",
    "meins",
    "vegr1",
    "vegr2",
    "vegr3",
    "vegr4",
    "vegr5",
    "vhilm",
    "laeng",
    "breit",
    "hoehe",
    "meabm",
    "erlkz",
    "gewto",
    "volto",
    "volehMax",
    "geweiMax",
    "inhalt",
    "werks",
    "ladlg",
    "ladeh",
    "farzt",
    "fareh",
    "entfe",
    "ehent",
    "namef",
    "nameb",
    "landt",
    "landf",
    "lgort",
    "gewfx",
    "exidv2",
    "vhilmKu",
    "object",
    "objkey",
    "venum",
    "packvorschr",
    "packvorschrSt",
    "status",
    "zulAufl",
    "labeltyp",
    "handle",
    "logsys",
    "speUpdkz",
    "speIdart01",
    "speIdent01",
    "speIdart02",
    "speIdent02",
    "speIdart03",
    "speIdent03",
    "speIdart04",
    "speIdent04",
    "speLogpos",
    "speChkCounter"
})
public class Verko {

    @XmlElement(name = "Exidv", required = true)
    protected String exidv;
    @XmlElement(name = "Exida", required = true)
    protected String exida;
    @XmlElement(name = "Vstel", required = true)
    protected String vstel;
    @XmlElement(name = "Lstel", required = true)
    protected String lstel;
    @XmlElement(name = "Brgew", required = true)
    protected BigDecimal brgew;
    @XmlElement(name = "Ntgew", required = true)
    protected BigDecimal ntgew;
    @XmlElement(name = "Magew", required = true)
    protected BigDecimal magew;
    @XmlElement(name = "Tarag", required = true)
    protected BigDecimal tarag;
    @XmlElement(name = "Gewei", required = true)
    protected String gewei;
    @XmlElement(name = "Btvol", required = true)
    protected BigDecimal btvol;
    @XmlElement(name = "Ntvol", required = true)
    protected BigDecimal ntvol;
    @XmlElement(name = "Mavol", required = true)
    protected BigDecimal mavol;
    @XmlElement(name = "Tavol", required = true)
    protected BigDecimal tavol;
    @XmlElement(name = "Voleh", required = true)
    protected String voleh;
    @XmlElement(name = "Ernam", required = true)
    protected String ernam;
    @XmlElement(name = "Sortl", required = true)
    protected String sortl;
    @XmlElement(name = "Magrv", required = true)
    protected String magrv;
    @XmlElement(name = "Vhart", required = true)
    protected String vhart;
    @XmlElement(name = "Meins", required = true)
    protected String meins;
    @XmlElement(name = "Vegr1", required = true)
    protected String vegr1;
    @XmlElement(name = "Vegr2", required = true)
    protected String vegr2;
    @XmlElement(name = "Vegr3", required = true)
    protected String vegr3;
    @XmlElement(name = "Vegr4", required = true)
    protected String vegr4;
    @XmlElement(name = "Vegr5", required = true)
    protected String vegr5;
    @XmlElement(name = "Vhilm", required = true)
    protected String vhilm;
    @XmlElement(name = "Laeng", required = true)
    protected BigDecimal laeng;
    @XmlElement(name = "Breit", required = true)
    protected BigDecimal breit;
    @XmlElement(name = "Hoehe", required = true)
    protected BigDecimal hoehe;
    @XmlElement(name = "Meabm", required = true)
    protected String meabm;
    @XmlElement(name = "Erlkz", required = true)
    protected String erlkz;
    @XmlElement(name = "Gewto", required = true)
    protected BigDecimal gewto;
    @XmlElement(name = "Volto", required = true)
    protected BigDecimal volto;
    @XmlElement(name = "VolehMax", required = true)
    protected String volehMax;
    @XmlElement(name = "GeweiMax", required = true)
    protected String geweiMax;
    @XmlElement(name = "Inhalt", required = true)
    protected String inhalt;
    @XmlElement(name = "Werks", required = true)
    protected String werks;
    @XmlElement(name = "Ladlg", required = true)
    protected BigDecimal ladlg;
    @XmlElement(name = "Ladeh", required = true)
    protected String ladeh;
    @XmlElement(name = "Farzt", required = true)
    protected BigDecimal farzt;
    @XmlElement(name = "Fareh", required = true)
    protected String fareh;
    @XmlElement(name = "Entfe", required = true)
    protected BigDecimal entfe;
    @XmlElement(name = "Ehent", required = true)
    protected String ehent;
    @XmlElement(name = "Namef", required = true)
    protected String namef;
    @XmlElement(name = "Nameb", required = true)
    protected String nameb;
    @XmlElement(name = "Landt", required = true)
    protected String landt;
    @XmlElement(name = "Landf", required = true)
    protected String landf;
    @XmlElement(name = "Lgort", required = true)
    protected String lgort;
    @XmlElement(name = "Gewfx", required = true)
    protected String gewfx;
    @XmlElement(name = "Exidv2", required = true)
    protected String exidv2;
    @XmlElement(name = "VhilmKu", required = true)
    protected String vhilmKu;
    @XmlElement(name = "Object", required = true)
    protected String object;
    @XmlElement(name = "Objkey", required = true)
    protected String objkey;
    @XmlElement(name = "Venum", required = true)
    protected String venum;
    @XmlElement(name = "Packvorschr", required = true)
    protected String packvorschr;
    @XmlElement(name = "PackvorschrSt", required = true)
    protected String packvorschrSt;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "ZulAufl", required = true)
    protected BigDecimal zulAufl;
    @XmlElement(name = "Labeltyp", required = true)
    protected String labeltyp;
    @XmlElement(name = "Handle", required = true)
    protected String handle;
    @XmlElement(name = "Logsys", required = true)
    protected String logsys;
    @XmlElement(name = "SpeUpdkz", required = true)
    protected String speUpdkz;
    @XmlElement(name = "SpeIdart01", required = true)
    protected String speIdart01;
    @XmlElement(name = "SpeIdent01", required = true)
    protected String speIdent01;
    @XmlElement(name = "SpeIdart02", required = true)
    protected String speIdart02;
    @XmlElement(name = "SpeIdent02", required = true)
    protected String speIdent02;
    @XmlElement(name = "SpeIdart03", required = true)
    protected String speIdart03;
    @XmlElement(name = "SpeIdent03", required = true)
    protected String speIdent03;
    @XmlElement(name = "SpeIdart04", required = true)
    protected String speIdart04;
    @XmlElement(name = "SpeIdent04", required = true)
    protected String speIdent04;
    @XmlElement(name = "SpeLogpos", required = true)
    protected String speLogpos;
    @XmlElement(name = "SpeChkCounter", required = true)
    protected String speChkCounter;

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
     * exida 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExida() {
        return exida;
    }

    /**
     * exida 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExida(String value) {
        this.exida = value;
    }

    /**
     * vstel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVstel() {
        return vstel;
    }

    /**
     * vstel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVstel(String value) {
        this.vstel = value;
    }

    /**
     * lstel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLstel() {
        return lstel;
    }

    /**
     * lstel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLstel(String value) {
        this.lstel = value;
    }

    /**
     * brgew 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBrgew() {
        return brgew;
    }

    /**
     * brgew 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBrgew(BigDecimal value) {
        this.brgew = value;
    }

    /**
     * ntgew 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNtgew() {
        return ntgew;
    }

    /**
     * ntgew 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNtgew(BigDecimal value) {
        this.ntgew = value;
    }

    /**
     * magew 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMagew() {
        return magew;
    }

    /**
     * magew 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMagew(BigDecimal value) {
        this.magew = value;
    }

    /**
     * tarag 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTarag() {
        return tarag;
    }

    /**
     * tarag 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTarag(BigDecimal value) {
        this.tarag = value;
    }

    /**
     * gewei 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGewei() {
        return gewei;
    }

    /**
     * gewei 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGewei(String value) {
        this.gewei = value;
    }

    /**
     * btvol 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBtvol() {
        return btvol;
    }

    /**
     * btvol 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBtvol(BigDecimal value) {
        this.btvol = value;
    }

    /**
     * ntvol 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNtvol() {
        return ntvol;
    }

    /**
     * ntvol 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNtvol(BigDecimal value) {
        this.ntvol = value;
    }

    /**
     * mavol 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMavol() {
        return mavol;
    }

    /**
     * mavol 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMavol(BigDecimal value) {
        this.mavol = value;
    }

    /**
     * tavol 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTavol() {
        return tavol;
    }

    /**
     * tavol 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTavol(BigDecimal value) {
        this.tavol = value;
    }

    /**
     * voleh 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoleh() {
        return voleh;
    }

    /**
     * voleh 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoleh(String value) {
        this.voleh = value;
    }

    /**
     * ernam 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErnam() {
        return ernam;
    }

    /**
     * ernam 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErnam(String value) {
        this.ernam = value;
    }

    /**
     * sortl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortl() {
        return sortl;
    }

    /**
     * sortl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortl(String value) {
        this.sortl = value;
    }

    /**
     * magrv 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMagrv() {
        return magrv;
    }

    /**
     * magrv 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMagrv(String value) {
        this.magrv = value;
    }

    /**
     * vhart 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVhart() {
        return vhart;
    }

    /**
     * vhart 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVhart(String value) {
        this.vhart = value;
    }

    /**
     * meins 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeins() {
        return meins;
    }

    /**
     * meins 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeins(String value) {
        this.meins = value;
    }

    /**
     * vegr1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVegr1() {
        return vegr1;
    }

    /**
     * vegr1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVegr1(String value) {
        this.vegr1 = value;
    }

    /**
     * vegr2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVegr2() {
        return vegr2;
    }

    /**
     * vegr2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVegr2(String value) {
        this.vegr2 = value;
    }

    /**
     * vegr3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVegr3() {
        return vegr3;
    }

    /**
     * vegr3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVegr3(String value) {
        this.vegr3 = value;
    }

    /**
     * vegr4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVegr4() {
        return vegr4;
    }

    /**
     * vegr4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVegr4(String value) {
        this.vegr4 = value;
    }

    /**
     * vegr5 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVegr5() {
        return vegr5;
    }

    /**
     * vegr5 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVegr5(String value) {
        this.vegr5 = value;
    }

    /**
     * vhilm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVhilm() {
        return vhilm;
    }

    /**
     * vhilm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVhilm(String value) {
        this.vhilm = value;
    }

    /**
     * laeng 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLaeng() {
        return laeng;
    }

    /**
     * laeng 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLaeng(BigDecimal value) {
        this.laeng = value;
    }

    /**
     * breit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBreit() {
        return breit;
    }

    /**
     * breit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBreit(BigDecimal value) {
        this.breit = value;
    }

    /**
     * hoehe 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHoehe() {
        return hoehe;
    }

    /**
     * hoehe 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHoehe(BigDecimal value) {
        this.hoehe = value;
    }

    /**
     * meabm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeabm() {
        return meabm;
    }

    /**
     * meabm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeabm(String value) {
        this.meabm = value;
    }

    /**
     * erlkz 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErlkz() {
        return erlkz;
    }

    /**
     * erlkz 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErlkz(String value) {
        this.erlkz = value;
    }

    /**
     * gewto 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGewto() {
        return gewto;
    }

    /**
     * gewto 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGewto(BigDecimal value) {
        this.gewto = value;
    }

    /**
     * volto 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolto() {
        return volto;
    }

    /**
     * volto 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolto(BigDecimal value) {
        this.volto = value;
    }

    /**
     * volehMax 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolehMax() {
        return volehMax;
    }

    /**
     * volehMax 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolehMax(String value) {
        this.volehMax = value;
    }

    /**
     * geweiMax 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeweiMax() {
        return geweiMax;
    }

    /**
     * geweiMax 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeweiMax(String value) {
        this.geweiMax = value;
    }

    /**
     * inhalt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInhalt() {
        return inhalt;
    }

    /**
     * inhalt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInhalt(String value) {
        this.inhalt = value;
    }

    /**
     * werks 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWerks() {
        return werks;
    }

    /**
     * werks 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWerks(String value) {
        this.werks = value;
    }

    /**
     * ladlg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLadlg() {
        return ladlg;
    }

    /**
     * ladlg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLadlg(BigDecimal value) {
        this.ladlg = value;
    }

    /**
     * ladeh 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLadeh() {
        return ladeh;
    }

    /**
     * ladeh 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLadeh(String value) {
        this.ladeh = value;
    }

    /**
     * farzt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFarzt() {
        return farzt;
    }

    /**
     * farzt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFarzt(BigDecimal value) {
        this.farzt = value;
    }

    /**
     * fareh 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareh() {
        return fareh;
    }

    /**
     * fareh 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareh(String value) {
        this.fareh = value;
    }

    /**
     * entfe 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEntfe() {
        return entfe;
    }

    /**
     * entfe 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEntfe(BigDecimal value) {
        this.entfe = value;
    }

    /**
     * ehent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEhent() {
        return ehent;
    }

    /**
     * ehent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEhent(String value) {
        this.ehent = value;
    }

    /**
     * namef 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamef() {
        return namef;
    }

    /**
     * namef 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamef(String value) {
        this.namef = value;
    }

    /**
     * nameb 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameb() {
        return nameb;
    }

    /**
     * nameb 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameb(String value) {
        this.nameb = value;
    }

    /**
     * landt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandt() {
        return landt;
    }

    /**
     * landt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandt(String value) {
        this.landt = value;
    }

    /**
     * landf 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandf() {
        return landf;
    }

    /**
     * landf 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandf(String value) {
        this.landf = value;
    }

    /**
     * lgort 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgort() {
        return lgort;
    }

    /**
     * lgort 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgort(String value) {
        this.lgort = value;
    }

    /**
     * gewfx 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGewfx() {
        return gewfx;
    }

    /**
     * gewfx 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGewfx(String value) {
        this.gewfx = value;
    }

    /**
     * exidv2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExidv2() {
        return exidv2;
    }

    /**
     * exidv2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExidv2(String value) {
        this.exidv2 = value;
    }

    /**
     * vhilmKu 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVhilmKu() {
        return vhilmKu;
    }

    /**
     * vhilmKu 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVhilmKu(String value) {
        this.vhilmKu = value;
    }

    /**
     * object 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObject() {
        return object;
    }

    /**
     * object 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObject(String value) {
        this.object = value;
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
     * packvorschr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackvorschr() {
        return packvorschr;
    }

    /**
     * packvorschr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackvorschr(String value) {
        this.packvorschr = value;
    }

    /**
     * packvorschrSt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackvorschrSt() {
        return packvorschrSt;
    }

    /**
     * packvorschrSt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackvorschrSt(String value) {
        this.packvorschrSt = value;
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
     * zulAufl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getZulAufl() {
        return zulAufl;
    }

    /**
     * zulAufl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setZulAufl(BigDecimal value) {
        this.zulAufl = value;
    }

    /**
     * labeltyp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabeltyp() {
        return labeltyp;
    }

    /**
     * labeltyp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabeltyp(String value) {
        this.labeltyp = value;
    }

    /**
     * handle 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandle() {
        return handle;
    }

    /**
     * handle 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandle(String value) {
        this.handle = value;
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

    /**
     * speIdart01 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeIdart01() {
        return speIdart01;
    }

    /**
     * speIdart01 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeIdart01(String value) {
        this.speIdart01 = value;
    }

    /**
     * speIdent01 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeIdent01() {
        return speIdent01;
    }

    /**
     * speIdent01 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeIdent01(String value) {
        this.speIdent01 = value;
    }

    /**
     * speIdart02 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeIdart02() {
        return speIdart02;
    }

    /**
     * speIdart02 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeIdart02(String value) {
        this.speIdart02 = value;
    }

    /**
     * speIdent02 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeIdent02() {
        return speIdent02;
    }

    /**
     * speIdent02 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeIdent02(String value) {
        this.speIdent02 = value;
    }

    /**
     * speIdart03 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeIdart03() {
        return speIdart03;
    }

    /**
     * speIdart03 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeIdart03(String value) {
        this.speIdart03 = value;
    }

    /**
     * speIdent03 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeIdent03() {
        return speIdent03;
    }

    /**
     * speIdent03 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeIdent03(String value) {
        this.speIdent03 = value;
    }

    /**
     * speIdart04 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeIdart04() {
        return speIdart04;
    }

    /**
     * speIdart04 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeIdart04(String value) {
        this.speIdart04 = value;
    }

    /**
     * speIdent04 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeIdent04() {
        return speIdent04;
    }

    /**
     * speIdent04 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeIdent04(String value) {
        this.speIdent04 = value;
    }

    /**
     * speLogpos 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeLogpos() {
        return speLogpos;
    }

    /**
     * speLogpos 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeLogpos(String value) {
        this.speLogpos = value;
    }

    /**
     * speChkCounter 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeChkCounter() {
        return speChkCounter;
    }

    /**
     * speChkCounter 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeChkCounter(String value) {
        this.speChkCounter = value;
    }

}
