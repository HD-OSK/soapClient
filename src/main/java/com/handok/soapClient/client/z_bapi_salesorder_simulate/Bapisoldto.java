//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.06.02 시간 07:11:18 PM KST 
//


package com.handok.soapClient.client.z_bapi_salesorder_simulate;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Bapisoldto complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Bapisoldto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SoldTo" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Name" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="Street" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="PoBox" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="PostlCode" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="PobxPcd" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="City" type="{urn:sap-com:document:sap:rfc:functions}char25"/&gt;
 *         &lt;element name="Langu" type="{urn:sap-com:document:sap:rfc:functions}lang"/&gt;
 *         &lt;element name="Country" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Telephone" type="{urn:sap-com:document:sap:rfc:functions}char16"/&gt;
 *         &lt;element name="StatGroup" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="OrderBlck" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="PrcProced" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="CustGroup" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="SalesDist" type="{urn:sap-com:document:sap:rfc:functions}char6"/&gt;
 *         &lt;element name="PriceGrp" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="PriceList" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Incoterms1" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Incoterms2" type="{urn:sap-com:document:sap:rfc:functions}char28"/&gt;
 *         &lt;element name="ComplDlv" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="MaxPlDlv" type="{urn:sap-com:document:sap:rfc:functions}decimal1.0"/&gt;
 *         &lt;element name="OrderComb" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="BtchSplit" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="DlvPrio" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/&gt;
 *         &lt;element name="Currency" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/&gt;
 *         &lt;element name="ExchgRate" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="ShipCond" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="PartDlv" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="OrderProb" type="{urn:sap-com:document:sap:rfc:functions}numeric3"/&gt;
 *         &lt;element name="DlvBlock" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="ProdProp" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Acc1Time" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SalesOff" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="SalesGrp" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
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
 *         &lt;element name="CompanyId" type="{urn:sap-com:document:sap:rfc:functions}char6"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bapisoldto", propOrder = {
    "soldTo",
    "name",
    "street",
    "poBox",
    "postlCode",
    "pobxPcd",
    "city",
    "langu",
    "country",
    "telephone",
    "statGroup",
    "orderBlck",
    "prcProced",
    "custGroup",
    "salesDist",
    "priceGrp",
    "priceList",
    "incoterms1",
    "incoterms2",
    "complDlv",
    "maxPlDlv",
    "orderComb",
    "btchSplit",
    "dlvPrio",
    "currency",
    "exchgRate",
    "shipCond",
    "partDlv",
    "orderProb",
    "dlvBlock",
    "prodProp",
    "acc1Time",
    "salesOff",
    "salesGrp",
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
    "companyId"
})
public class Bapisoldto {

    @XmlElement(name = "SoldTo", required = true)
    protected String soldTo;
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
    @XmlElement(name = "Country", required = true)
    protected String country;
    @XmlElement(name = "Telephone", required = true)
    protected String telephone;
    @XmlElement(name = "StatGroup", required = true)
    protected String statGroup;
    @XmlElement(name = "OrderBlck", required = true)
    protected String orderBlck;
    @XmlElement(name = "PrcProced", required = true)
    protected String prcProced;
    @XmlElement(name = "CustGroup", required = true)
    protected String custGroup;
    @XmlElement(name = "SalesDist", required = true)
    protected String salesDist;
    @XmlElement(name = "PriceGrp", required = true)
    protected String priceGrp;
    @XmlElement(name = "PriceList", required = true)
    protected String priceList;
    @XmlElement(name = "Incoterms1", required = true)
    protected String incoterms1;
    @XmlElement(name = "Incoterms2", required = true)
    protected String incoterms2;
    @XmlElement(name = "ComplDlv", required = true)
    protected String complDlv;
    @XmlElement(name = "MaxPlDlv", required = true)
    protected BigDecimal maxPlDlv;
    @XmlElement(name = "OrderComb", required = true)
    protected String orderComb;
    @XmlElement(name = "BtchSplit", required = true)
    protected String btchSplit;
    @XmlElement(name = "DlvPrio", required = true)
    protected String dlvPrio;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "ExchgRate", required = true)
    protected String exchgRate;
    @XmlElement(name = "ShipCond", required = true)
    protected String shipCond;
    @XmlElement(name = "PartDlv", required = true)
    protected String partDlv;
    @XmlElement(name = "OrderProb", required = true)
    protected String orderProb;
    @XmlElement(name = "DlvBlock", required = true)
    protected String dlvBlock;
    @XmlElement(name = "ProdProp", required = true)
    protected String prodProp;
    @XmlElement(name = "Acc1Time", required = true)
    protected String acc1Time;
    @XmlElement(name = "SalesOff", required = true)
    protected String salesOff;
    @XmlElement(name = "SalesGrp", required = true)
    protected String salesGrp;
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
    @XmlElement(name = "CompanyId", required = true)
    protected String companyId;

    /**
     * soldTo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoldTo() {
        return soldTo;
    }

    /**
     * soldTo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoldTo(String value) {
        this.soldTo = value;
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
     * country 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * country 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
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
     * statGroup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatGroup() {
        return statGroup;
    }

    /**
     * statGroup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatGroup(String value) {
        this.statGroup = value;
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
     * prcProced 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcProced() {
        return prcProced;
    }

    /**
     * prcProced 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcProced(String value) {
        this.prcProced = value;
    }

    /**
     * custGroup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustGroup() {
        return custGroup;
    }

    /**
     * custGroup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustGroup(String value) {
        this.custGroup = value;
    }

    /**
     * salesDist 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesDist() {
        return salesDist;
    }

    /**
     * salesDist 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesDist(String value) {
        this.salesDist = value;
    }

    /**
     * priceGrp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceGrp() {
        return priceGrp;
    }

    /**
     * priceGrp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceGrp(String value) {
        this.priceGrp = value;
    }

    /**
     * priceList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceList() {
        return priceList;
    }

    /**
     * priceList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceList(String value) {
        this.priceList = value;
    }

    /**
     * incoterms1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncoterms1() {
        return incoterms1;
    }

    /**
     * incoterms1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncoterms1(String value) {
        this.incoterms1 = value;
    }

    /**
     * incoterms2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncoterms2() {
        return incoterms2;
    }

    /**
     * incoterms2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncoterms2(String value) {
        this.incoterms2 = value;
    }

    /**
     * complDlv 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplDlv() {
        return complDlv;
    }

    /**
     * complDlv 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplDlv(String value) {
        this.complDlv = value;
    }

    /**
     * maxPlDlv 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxPlDlv() {
        return maxPlDlv;
    }

    /**
     * maxPlDlv 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxPlDlv(BigDecimal value) {
        this.maxPlDlv = value;
    }

    /**
     * orderComb 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderComb() {
        return orderComb;
    }

    /**
     * orderComb 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderComb(String value) {
        this.orderComb = value;
    }

    /**
     * btchSplit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBtchSplit() {
        return btchSplit;
    }

    /**
     * btchSplit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBtchSplit(String value) {
        this.btchSplit = value;
    }

    /**
     * dlvPrio 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvPrio() {
        return dlvPrio;
    }

    /**
     * dlvPrio 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlvPrio(String value) {
        this.dlvPrio = value;
    }

    /**
     * currency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * currency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * exchgRate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchgRate() {
        return exchgRate;
    }

    /**
     * exchgRate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchgRate(String value) {
        this.exchgRate = value;
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
     * partDlv 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartDlv() {
        return partDlv;
    }

    /**
     * partDlv 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartDlv(String value) {
        this.partDlv = value;
    }

    /**
     * orderProb 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderProb() {
        return orderProb;
    }

    /**
     * orderProb 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderProb(String value) {
        this.orderProb = value;
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
     * salesOff 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOff() {
        return salesOff;
    }

    /**
     * salesOff 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOff(String value) {
        this.salesOff = value;
    }

    /**
     * salesGrp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesGrp() {
        return salesGrp;
    }

    /**
     * salesGrp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesGrp(String value) {
        this.salesGrp = value;
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
     * companyId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * companyId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyId(String value) {
        this.companyId = value;
    }

}
