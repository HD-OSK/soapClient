//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.06.02 시간 07:11:18 PM KST 
//


package com.handok.soapClient.client.z_bapi_salesorder_simulate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Bapishipto complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Bapishipto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShipTo" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Name" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="Street" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="PoBox" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="PostlCode" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="PobxPcd" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="City" type="{urn:sap-com:document:sap:rfc:functions}char25"/&gt;
 *         &lt;element name="Langu" type="{urn:sap-com:document:sap:rfc:functions}lang"/&gt;
 *         &lt;element name="DestCntry" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="TrnspZone" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="TrainStat" type="{urn:sap-com:document:sap:rfc:functions}char25"/&gt;
 *         &lt;element name="ExprStat" type="{urn:sap-com:document:sap:rfc:functions}char25"/&gt;
 *         &lt;element name="Telephone" type="{urn:sap-com:document:sap:rfc:functions}char16"/&gt;
 *         &lt;element name="UnloadPt" type="{urn:sap-com:document:sap:rfc:functions}char25"/&gt;
 *         &lt;element name="FacCalend" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="RecvHours" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="MoAmFrom" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="MoAmUntl" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="MoPmFrom" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="MoPmUntl" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="TuAmFrom" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="TuAmUntl" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="TuPmFrom" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="TuPmUntl" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="WeAmFrom" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="WrAmUntl" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="WePmFrom" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="WePmUntl" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="ThAmFrom" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="ThAmUntl" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="ThPmFrom" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="ThPmUntl" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="FrAmFrom" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="FrAmUntl" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="FrPmFrom" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="FrPmUntl" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="SaAmFrom" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="SaAmUntl" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="SaPmFrom" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="SaPmUntl" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="SuAmFrom" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="SuAmUntl" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="SuPmFrom" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="SuPmUntl" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="VatRegNo" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="TaxClass1" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TaxClass2" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TaxClass3" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TaxClass4" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TaxClass5" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TaxClass6" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TaxClass7" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TaxClass8" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TaxClass9" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Region" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="CountyCde" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="CityCode" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Taxjurcode" type="{urn:sap-com:document:sap:rfc:functions}char15"/&gt;
 *         &lt;element name="CtrdataOk" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="DlvPlant" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="DlvBlock" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="OrderBlck" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="ProdProp" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="ShipCond" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Acc1Time" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="AccntGrp" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="DescPartn" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="FyVariant" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="ProdAttr1" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ProdAttr2" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ProdAttr3" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ProdAttr4" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ProdAttr5" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ProdAttr6" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ProdAttr7" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ProdAttr8" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ProdAttr9" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ProdAttra" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bapishipto", propOrder = {
    "shipTo",
    "name",
    "street",
    "poBox",
    "postlCode",
    "pobxPcd",
    "city",
    "langu",
    "destCntry",
    "trnspZone",
    "trainStat",
    "exprStat",
    "telephone",
    "unloadPt",
    "facCalend",
    "recvHours",
    "moAmFrom",
    "moAmUntl",
    "moPmFrom",
    "moPmUntl",
    "tuAmFrom",
    "tuAmUntl",
    "tuPmFrom",
    "tuPmUntl",
    "weAmFrom",
    "wrAmUntl",
    "wePmFrom",
    "wePmUntl",
    "thAmFrom",
    "thAmUntl",
    "thPmFrom",
    "thPmUntl",
    "frAmFrom",
    "frAmUntl",
    "frPmFrom",
    "frPmUntl",
    "saAmFrom",
    "saAmUntl",
    "saPmFrom",
    "saPmUntl",
    "suAmFrom",
    "suAmUntl",
    "suPmFrom",
    "suPmUntl",
    "vatRegNo",
    "taxClass1",
    "taxClass2",
    "taxClass3",
    "taxClass4",
    "taxClass5",
    "taxClass6",
    "taxClass7",
    "taxClass8",
    "taxClass9",
    "region",
    "countyCde",
    "cityCode",
    "taxjurcode",
    "ctrdataOk",
    "dlvPlant",
    "dlvBlock",
    "orderBlck",
    "prodProp",
    "shipCond",
    "acc1Time",
    "accntGrp",
    "descPartn",
    "fyVariant",
    "prodAttr1",
    "prodAttr2",
    "prodAttr3",
    "prodAttr4",
    "prodAttr5",
    "prodAttr6",
    "prodAttr7",
    "prodAttr8",
    "prodAttr9",
    "prodAttra"
})
public class Bapishipto {

    @XmlElement(name = "ShipTo", required = true)
    protected String shipTo;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Street", required = true)
    protected String street;
    @XmlElement(name = "PoBox", required = true)
    protected String poBox;
    @XmlElement(name = "PostlCode", required = true)
    protected String postlCode;
    @XmlElement(name = "PobxPcd", required = true)
    protected String pobxPcd;
    @XmlElement(name = "City", required = true)
    protected String city;
    @XmlElement(name = "Langu", required = true)
    protected String langu;
    @XmlElement(name = "DestCntry", required = true)
    protected String destCntry;
    @XmlElement(name = "TrnspZone", required = true)
    protected String trnspZone;
    @XmlElement(name = "TrainStat", required = true)
    protected String trainStat;
    @XmlElement(name = "ExprStat", required = true)
    protected String exprStat;
    @XmlElement(name = "Telephone", required = true)
    protected String telephone;
    @XmlElement(name = "UnloadPt", required = true)
    protected String unloadPt;
    @XmlElement(name = "FacCalend", required = true)
    protected String facCalend;
    @XmlElement(name = "RecvHours", required = true)
    protected String recvHours;
    @XmlElement(name = "MoAmFrom", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar moAmFrom;
    @XmlElement(name = "MoAmUntl", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar moAmUntl;
    @XmlElement(name = "MoPmFrom", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar moPmFrom;
    @XmlElement(name = "MoPmUntl", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar moPmUntl;
    @XmlElement(name = "TuAmFrom", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar tuAmFrom;
    @XmlElement(name = "TuAmUntl", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar tuAmUntl;
    @XmlElement(name = "TuPmFrom", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar tuPmFrom;
    @XmlElement(name = "TuPmUntl", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar tuPmUntl;
    @XmlElement(name = "WeAmFrom", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar weAmFrom;
    @XmlElement(name = "WrAmUntl", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar wrAmUntl;
    @XmlElement(name = "WePmFrom", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar wePmFrom;
    @XmlElement(name = "WePmUntl", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar wePmUntl;
    @XmlElement(name = "ThAmFrom", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar thAmFrom;
    @XmlElement(name = "ThAmUntl", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar thAmUntl;
    @XmlElement(name = "ThPmFrom", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar thPmFrom;
    @XmlElement(name = "ThPmUntl", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar thPmUntl;
    @XmlElement(name = "FrAmFrom", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar frAmFrom;
    @XmlElement(name = "FrAmUntl", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar frAmUntl;
    @XmlElement(name = "FrPmFrom", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar frPmFrom;
    @XmlElement(name = "FrPmUntl", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar frPmUntl;
    @XmlElement(name = "SaAmFrom", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar saAmFrom;
    @XmlElement(name = "SaAmUntl", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar saAmUntl;
    @XmlElement(name = "SaPmFrom", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar saPmFrom;
    @XmlElement(name = "SaPmUntl", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar saPmUntl;
    @XmlElement(name = "SuAmFrom", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar suAmFrom;
    @XmlElement(name = "SuAmUntl", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar suAmUntl;
    @XmlElement(name = "SuPmFrom", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar suPmFrom;
    @XmlElement(name = "SuPmUntl", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar suPmUntl;
    @XmlElement(name = "VatRegNo", required = true)
    protected String vatRegNo;
    @XmlElement(name = "TaxClass1", required = true)
    protected String taxClass1;
    @XmlElement(name = "TaxClass2", required = true)
    protected String taxClass2;
    @XmlElement(name = "TaxClass3", required = true)
    protected String taxClass3;
    @XmlElement(name = "TaxClass4", required = true)
    protected String taxClass4;
    @XmlElement(name = "TaxClass5", required = true)
    protected String taxClass5;
    @XmlElement(name = "TaxClass6", required = true)
    protected String taxClass6;
    @XmlElement(name = "TaxClass7", required = true)
    protected String taxClass7;
    @XmlElement(name = "TaxClass8", required = true)
    protected String taxClass8;
    @XmlElement(name = "TaxClass9", required = true)
    protected String taxClass9;
    @XmlElement(name = "Region", required = true)
    protected String region;
    @XmlElement(name = "CountyCde", required = true)
    protected String countyCde;
    @XmlElement(name = "CityCode", required = true)
    protected String cityCode;
    @XmlElement(name = "Taxjurcode", required = true)
    protected String taxjurcode;
    @XmlElement(name = "CtrdataOk", required = true)
    protected String ctrdataOk;
    @XmlElement(name = "DlvPlant", required = true)
    protected String dlvPlant;
    @XmlElement(name = "DlvBlock", required = true)
    protected String dlvBlock;
    @XmlElement(name = "OrderBlck", required = true)
    protected String orderBlck;
    @XmlElement(name = "ProdProp", required = true)
    protected String prodProp;
    @XmlElement(name = "ShipCond", required = true)
    protected String shipCond;
    @XmlElement(name = "Acc1Time", required = true)
    protected String acc1Time;
    @XmlElement(name = "AccntGrp", required = true)
    protected String accntGrp;
    @XmlElement(name = "DescPartn", required = true)
    protected String descPartn;
    @XmlElement(name = "FyVariant", required = true)
    protected String fyVariant;
    @XmlElement(name = "ProdAttr1", required = true)
    protected String prodAttr1;
    @XmlElement(name = "ProdAttr2", required = true)
    protected String prodAttr2;
    @XmlElement(name = "ProdAttr3", required = true)
    protected String prodAttr3;
    @XmlElement(name = "ProdAttr4", required = true)
    protected String prodAttr4;
    @XmlElement(name = "ProdAttr5", required = true)
    protected String prodAttr5;
    @XmlElement(name = "ProdAttr6", required = true)
    protected String prodAttr6;
    @XmlElement(name = "ProdAttr7", required = true)
    protected String prodAttr7;
    @XmlElement(name = "ProdAttr8", required = true)
    protected String prodAttr8;
    @XmlElement(name = "ProdAttr9", required = true)
    protected String prodAttr9;
    @XmlElement(name = "ProdAttra", required = true)
    protected String prodAttra;

    /**
     * shipTo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipTo() {
        return shipTo;
    }

    /**
     * shipTo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipTo(String value) {
        this.shipTo = value;
    }

    /**
     * name 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * name 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * street 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * street 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * poBox 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoBox() {
        return poBox;
    }

    /**
     * poBox 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoBox(String value) {
        this.poBox = value;
    }

    /**
     * postlCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostlCode() {
        return postlCode;
    }

    /**
     * postlCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostlCode(String value) {
        this.postlCode = value;
    }

    /**
     * pobxPcd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPobxPcd() {
        return pobxPcd;
    }

    /**
     * pobxPcd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPobxPcd(String value) {
        this.pobxPcd = value;
    }

    /**
     * city 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * city 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * langu 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangu() {
        return langu;
    }

    /**
     * langu 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangu(String value) {
        this.langu = value;
    }

    /**
     * destCntry 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestCntry() {
        return destCntry;
    }

    /**
     * destCntry 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestCntry(String value) {
        this.destCntry = value;
    }

    /**
     * trnspZone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnspZone() {
        return trnspZone;
    }

    /**
     * trnspZone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnspZone(String value) {
        this.trnspZone = value;
    }

    /**
     * trainStat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainStat() {
        return trainStat;
    }

    /**
     * trainStat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainStat(String value) {
        this.trainStat = value;
    }

    /**
     * exprStat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExprStat() {
        return exprStat;
    }

    /**
     * exprStat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExprStat(String value) {
        this.exprStat = value;
    }

    /**
     * telephone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * telephone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
    }

    /**
     * unloadPt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnloadPt() {
        return unloadPt;
    }

    /**
     * unloadPt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnloadPt(String value) {
        this.unloadPt = value;
    }

    /**
     * facCalend 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacCalend() {
        return facCalend;
    }

    /**
     * facCalend 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacCalend(String value) {
        this.facCalend = value;
    }

    /**
     * recvHours 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecvHours() {
        return recvHours;
    }

    /**
     * recvHours 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecvHours(String value) {
        this.recvHours = value;
    }

    /**
     * moAmFrom 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMoAmFrom() {
        return moAmFrom;
    }

    /**
     * moAmFrom 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMoAmFrom(XMLGregorianCalendar value) {
        this.moAmFrom = value;
    }

    /**
     * moAmUntl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMoAmUntl() {
        return moAmUntl;
    }

    /**
     * moAmUntl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMoAmUntl(XMLGregorianCalendar value) {
        this.moAmUntl = value;
    }

    /**
     * moPmFrom 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMoPmFrom() {
        return moPmFrom;
    }

    /**
     * moPmFrom 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMoPmFrom(XMLGregorianCalendar value) {
        this.moPmFrom = value;
    }

    /**
     * moPmUntl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMoPmUntl() {
        return moPmUntl;
    }

    /**
     * moPmUntl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMoPmUntl(XMLGregorianCalendar value) {
        this.moPmUntl = value;
    }

    /**
     * tuAmFrom 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTuAmFrom() {
        return tuAmFrom;
    }

    /**
     * tuAmFrom 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTuAmFrom(XMLGregorianCalendar value) {
        this.tuAmFrom = value;
    }

    /**
     * tuAmUntl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTuAmUntl() {
        return tuAmUntl;
    }

    /**
     * tuAmUntl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTuAmUntl(XMLGregorianCalendar value) {
        this.tuAmUntl = value;
    }

    /**
     * tuPmFrom 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTuPmFrom() {
        return tuPmFrom;
    }

    /**
     * tuPmFrom 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTuPmFrom(XMLGregorianCalendar value) {
        this.tuPmFrom = value;
    }

    /**
     * tuPmUntl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTuPmUntl() {
        return tuPmUntl;
    }

    /**
     * tuPmUntl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTuPmUntl(XMLGregorianCalendar value) {
        this.tuPmUntl = value;
    }

    /**
     * weAmFrom 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWeAmFrom() {
        return weAmFrom;
    }

    /**
     * weAmFrom 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWeAmFrom(XMLGregorianCalendar value) {
        this.weAmFrom = value;
    }

    /**
     * wrAmUntl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWrAmUntl() {
        return wrAmUntl;
    }

    /**
     * wrAmUntl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWrAmUntl(XMLGregorianCalendar value) {
        this.wrAmUntl = value;
    }

    /**
     * wePmFrom 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWePmFrom() {
        return wePmFrom;
    }

    /**
     * wePmFrom 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWePmFrom(XMLGregorianCalendar value) {
        this.wePmFrom = value;
    }

    /**
     * wePmUntl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWePmUntl() {
        return wePmUntl;
    }

    /**
     * wePmUntl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWePmUntl(XMLGregorianCalendar value) {
        this.wePmUntl = value;
    }

    /**
     * thAmFrom 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getThAmFrom() {
        return thAmFrom;
    }

    /**
     * thAmFrom 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setThAmFrom(XMLGregorianCalendar value) {
        this.thAmFrom = value;
    }

    /**
     * thAmUntl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getThAmUntl() {
        return thAmUntl;
    }

    /**
     * thAmUntl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setThAmUntl(XMLGregorianCalendar value) {
        this.thAmUntl = value;
    }

    /**
     * thPmFrom 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getThPmFrom() {
        return thPmFrom;
    }

    /**
     * thPmFrom 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setThPmFrom(XMLGregorianCalendar value) {
        this.thPmFrom = value;
    }

    /**
     * thPmUntl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getThPmUntl() {
        return thPmUntl;
    }

    /**
     * thPmUntl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setThPmUntl(XMLGregorianCalendar value) {
        this.thPmUntl = value;
    }

    /**
     * frAmFrom 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrAmFrom() {
        return frAmFrom;
    }

    /**
     * frAmFrom 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFrAmFrom(XMLGregorianCalendar value) {
        this.frAmFrom = value;
    }

    /**
     * frAmUntl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrAmUntl() {
        return frAmUntl;
    }

    /**
     * frAmUntl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFrAmUntl(XMLGregorianCalendar value) {
        this.frAmUntl = value;
    }

    /**
     * frPmFrom 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrPmFrom() {
        return frPmFrom;
    }

    /**
     * frPmFrom 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFrPmFrom(XMLGregorianCalendar value) {
        this.frPmFrom = value;
    }

    /**
     * frPmUntl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrPmUntl() {
        return frPmUntl;
    }

    /**
     * frPmUntl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFrPmUntl(XMLGregorianCalendar value) {
        this.frPmUntl = value;
    }

    /**
     * saAmFrom 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaAmFrom() {
        return saAmFrom;
    }

    /**
     * saAmFrom 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaAmFrom(XMLGregorianCalendar value) {
        this.saAmFrom = value;
    }

    /**
     * saAmUntl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaAmUntl() {
        return saAmUntl;
    }

    /**
     * saAmUntl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaAmUntl(XMLGregorianCalendar value) {
        this.saAmUntl = value;
    }

    /**
     * saPmFrom 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaPmFrom() {
        return saPmFrom;
    }

    /**
     * saPmFrom 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaPmFrom(XMLGregorianCalendar value) {
        this.saPmFrom = value;
    }

    /**
     * saPmUntl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaPmUntl() {
        return saPmUntl;
    }

    /**
     * saPmUntl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaPmUntl(XMLGregorianCalendar value) {
        this.saPmUntl = value;
    }

    /**
     * suAmFrom 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSuAmFrom() {
        return suAmFrom;
    }

    /**
     * suAmFrom 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSuAmFrom(XMLGregorianCalendar value) {
        this.suAmFrom = value;
    }

    /**
     * suAmUntl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSuAmUntl() {
        return suAmUntl;
    }

    /**
     * suAmUntl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSuAmUntl(XMLGregorianCalendar value) {
        this.suAmUntl = value;
    }

    /**
     * suPmFrom 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSuPmFrom() {
        return suPmFrom;
    }

    /**
     * suPmFrom 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSuPmFrom(XMLGregorianCalendar value) {
        this.suPmFrom = value;
    }

    /**
     * suPmUntl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSuPmUntl() {
        return suPmUntl;
    }

    /**
     * suPmUntl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSuPmUntl(XMLGregorianCalendar value) {
        this.suPmUntl = value;
    }

    /**
     * vatRegNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatRegNo() {
        return vatRegNo;
    }

    /**
     * vatRegNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatRegNo(String value) {
        this.vatRegNo = value;
    }

    /**
     * taxClass1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxClass1() {
        return taxClass1;
    }

    /**
     * taxClass1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxClass1(String value) {
        this.taxClass1 = value;
    }

    /**
     * taxClass2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxClass2() {
        return taxClass2;
    }

    /**
     * taxClass2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxClass2(String value) {
        this.taxClass2 = value;
    }

    /**
     * taxClass3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxClass3() {
        return taxClass3;
    }

    /**
     * taxClass3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxClass3(String value) {
        this.taxClass3 = value;
    }

    /**
     * taxClass4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxClass4() {
        return taxClass4;
    }

    /**
     * taxClass4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxClass4(String value) {
        this.taxClass4 = value;
    }

    /**
     * taxClass5 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxClass5() {
        return taxClass5;
    }

    /**
     * taxClass5 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxClass5(String value) {
        this.taxClass5 = value;
    }

    /**
     * taxClass6 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxClass6() {
        return taxClass6;
    }

    /**
     * taxClass6 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxClass6(String value) {
        this.taxClass6 = value;
    }

    /**
     * taxClass7 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxClass7() {
        return taxClass7;
    }

    /**
     * taxClass7 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxClass7(String value) {
        this.taxClass7 = value;
    }

    /**
     * taxClass8 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxClass8() {
        return taxClass8;
    }

    /**
     * taxClass8 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxClass8(String value) {
        this.taxClass8 = value;
    }

    /**
     * taxClass9 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxClass9() {
        return taxClass9;
    }

    /**
     * taxClass9 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxClass9(String value) {
        this.taxClass9 = value;
    }

    /**
     * region 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * region 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * countyCde 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyCde() {
        return countyCde;
    }

    /**
     * countyCde 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyCde(String value) {
        this.countyCde = value;
    }

    /**
     * cityCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * cityCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCode(String value) {
        this.cityCode = value;
    }

    /**
     * taxjurcode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxjurcode() {
        return taxjurcode;
    }

    /**
     * taxjurcode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxjurcode(String value) {
        this.taxjurcode = value;
    }

    /**
     * ctrdataOk 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrdataOk() {
        return ctrdataOk;
    }

    /**
     * ctrdataOk 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrdataOk(String value) {
        this.ctrdataOk = value;
    }

    /**
     * dlvPlant 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvPlant() {
        return dlvPlant;
    }

    /**
     * dlvPlant 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlvPlant(String value) {
        this.dlvPlant = value;
    }

    /**
     * dlvBlock 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvBlock() {
        return dlvBlock;
    }

    /**
     * dlvBlock 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlvBlock(String value) {
        this.dlvBlock = value;
    }

    /**
     * orderBlck 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderBlck() {
        return orderBlck;
    }

    /**
     * orderBlck 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderBlck(String value) {
        this.orderBlck = value;
    }

    /**
     * prodProp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdProp() {
        return prodProp;
    }

    /**
     * prodProp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdProp(String value) {
        this.prodProp = value;
    }

    /**
     * shipCond 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipCond() {
        return shipCond;
    }

    /**
     * shipCond 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipCond(String value) {
        this.shipCond = value;
    }

    /**
     * acc1Time 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcc1Time() {
        return acc1Time;
    }

    /**
     * acc1Time 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcc1Time(String value) {
        this.acc1Time = value;
    }

    /**
     * accntGrp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccntGrp() {
        return accntGrp;
    }

    /**
     * accntGrp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccntGrp(String value) {
        this.accntGrp = value;
    }

    /**
     * descPartn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescPartn() {
        return descPartn;
    }

    /**
     * descPartn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescPartn(String value) {
        this.descPartn = value;
    }

    /**
     * fyVariant 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFyVariant() {
        return fyVariant;
    }

    /**
     * fyVariant 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFyVariant(String value) {
        this.fyVariant = value;
    }

    /**
     * prodAttr1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdAttr1() {
        return prodAttr1;
    }

    /**
     * prodAttr1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdAttr1(String value) {
        this.prodAttr1 = value;
    }

    /**
     * prodAttr2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdAttr2() {
        return prodAttr2;
    }

    /**
     * prodAttr2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdAttr2(String value) {
        this.prodAttr2 = value;
    }

    /**
     * prodAttr3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdAttr3() {
        return prodAttr3;
    }

    /**
     * prodAttr3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdAttr3(String value) {
        this.prodAttr3 = value;
    }

    /**
     * prodAttr4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdAttr4() {
        return prodAttr4;
    }

    /**
     * prodAttr4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdAttr4(String value) {
        this.prodAttr4 = value;
    }

    /**
     * prodAttr5 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdAttr5() {
        return prodAttr5;
    }

    /**
     * prodAttr5 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdAttr5(String value) {
        this.prodAttr5 = value;
    }

    /**
     * prodAttr6 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdAttr6() {
        return prodAttr6;
    }

    /**
     * prodAttr6 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdAttr6(String value) {
        this.prodAttr6 = value;
    }

    /**
     * prodAttr7 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdAttr7() {
        return prodAttr7;
    }

    /**
     * prodAttr7 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdAttr7(String value) {
        this.prodAttr7 = value;
    }

    /**
     * prodAttr8 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdAttr8() {
        return prodAttr8;
    }

    /**
     * prodAttr8 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdAttr8(String value) {
        this.prodAttr8 = value;
    }

    /**
     * prodAttr9 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdAttr9() {
        return prodAttr9;
    }

    /**
     * prodAttr9 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdAttr9(String value) {
        this.prodAttr9 = value;
    }

    /**
     * prodAttra 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdAttra() {
        return prodAttra;
    }

    /**
     * prodAttra 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdAttra(String value) {
        this.prodAttra = value;
    }

}
