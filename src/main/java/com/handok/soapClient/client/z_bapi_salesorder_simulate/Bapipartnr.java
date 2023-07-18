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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Bapipartnr complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Bapipartnr"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PartnRole" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="PartnNumb" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="ItmNumber" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="Title" type="{urn:sap-com:document:sap:rfc:functions}char15"/&gt;
 *         &lt;element name="Name" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="Name2" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="Name3" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="Name4" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="Street" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="Country" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="CountryIso" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="PostlCode" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="PobxPcd" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="PobxCty" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="City" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="District" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="Region" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="PoBox" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Telephone" type="{urn:sap-com:document:sap:rfc:functions}char16"/&gt;
 *         &lt;element name="Telephone2" type="{urn:sap-com:document:sap:rfc:functions}char16"/&gt;
 *         &lt;element name="Telebox" type="{urn:sap-com:document:sap:rfc:functions}char15"/&gt;
 *         &lt;element name="FaxNumber" type="{urn:sap-com:document:sap:rfc:functions}char31"/&gt;
 *         &lt;element name="TeletexNo" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="TelexNo" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="Langu" type="{urn:sap-com:document:sap:rfc:functions}lang"/&gt;
 *         &lt;element name="LanguIso" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="UnloadPt" type="{urn:sap-com:document:sap:rfc:functions}char25"/&gt;
 *         &lt;element name="Transpzone" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Taxjurcode" type="{urn:sap-com:document:sap:rfc:functions}char15"/&gt;
 *         &lt;element name="Address" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="PrivAddr" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="AddrType" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="AddrOrig" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="AddrLink" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="VatRegNo" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bapipartnr", propOrder = {
    "partnRole",
    "partnNumb",
    "itmNumber",
    "title",
    "name",
    "name2",
    "name3",
    "name4",
    "street",
    "country",
    "countryIso",
    "postlCode",
    "pobxPcd",
    "pobxCty",
    "city",
    "district",
    "region",
    "poBox",
    "telephone",
    "telephone2",
    "telebox",
    "faxNumber",
    "teletexNo",
    "telexNo",
    "langu",
    "languIso",
    "unloadPt",
    "transpzone",
    "taxjurcode",
    "address",
    "privAddr",
    "addrType",
    "addrOrig",
    "addrLink",
    "vatRegNo"
})
public class Bapipartnr {

    @XmlElement(name = "PartnRole", required = true)
    protected String partnRole;
    @XmlElement(name = "PartnNumb", required = true)
    protected String partnNumb;
    @XmlElement(name = "ItmNumber", required = true)
    protected String itmNumber;
    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Name2", required = true)
    protected String name2;
    @XmlElement(name = "Name3", required = true)
    protected String name3;
    @XmlElement(name = "Name4", required = true)
    protected String name4;
    @XmlElement(name = "Street", required = true)
    protected String street;
    @XmlElement(name = "Country", required = true)
    protected String country;
    @XmlElement(name = "CountryIso", required = true)
    protected String countryIso;
    @XmlElement(name = "PostlCode", required = true)
    protected String postlCode;
    @XmlElement(name = "PobxPcd", required = true)
    protected String pobxPcd;
    @XmlElement(name = "PobxCty", required = true)
    protected String pobxCty;
    @XmlElement(name = "City", required = true)
    protected String city;
    @XmlElement(name = "District", required = true)
    protected String district;
    @XmlElement(name = "Region", required = true)
    protected String region;
    @XmlElement(name = "PoBox", required = true)
    protected String poBox;
    @XmlElement(name = "Telephone", required = true)
    protected String telephone;
    @XmlElement(name = "Telephone2", required = true)
    protected String telephone2;
    @XmlElement(name = "Telebox", required = true)
    protected String telebox;
    @XmlElement(name = "FaxNumber", required = true)
    protected String faxNumber;
    @XmlElement(name = "TeletexNo", required = true)
    protected String teletexNo;
    @XmlElement(name = "TelexNo", required = true)
    protected String telexNo;
    @XmlElement(name = "Langu", required = true)
    protected String langu;
    @XmlElement(name = "LanguIso", required = true)
    protected String languIso;
    @XmlElement(name = "UnloadPt", required = true)
    protected String unloadPt;
    @XmlElement(name = "Transpzone", required = true)
    protected String transpzone;
    @XmlElement(name = "Taxjurcode", required = true)
    protected String taxjurcode;
    @XmlElement(name = "Address", required = true)
    protected String address;
    @XmlElement(name = "PrivAddr", required = true)
    protected String privAddr;
    @XmlElement(name = "AddrType", required = true)
    protected String addrType;
    @XmlElement(name = "AddrOrig", required = true)
    protected String addrOrig;
    @XmlElement(name = "AddrLink", required = true)
    protected String addrLink;
    @XmlElement(name = "VatRegNo", required = true)
    protected String vatRegNo;

    /**
     * partnRole 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnRole() {
        return partnRole;
    }

    /**
     * partnRole 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnRole(String value) {
        this.partnRole = value;
    }

    /**
     * partnNumb 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnNumb() {
        return partnNumb;
    }

    /**
     * partnNumb 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnNumb(String value) {
        this.partnNumb = value;
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
     * title 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * title 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
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
     * name2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName2() {
        return name2;
    }

    /**
     * name2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName2(String value) {
        this.name2 = value;
    }

    /**
     * name3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName3() {
        return name3;
    }

    /**
     * name3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName3(String value) {
        this.name3 = value;
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
     * countryIso 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryIso() {
        return countryIso;
    }

    /**
     * countryIso 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryIso(String value) {
        this.countryIso = value;
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
     * pobxCty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPobxCty() {
        return pobxCty;
    }

    /**
     * pobxCty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPobxCty(String value) {
        this.pobxCty = value;
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
     * district 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * district 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
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
     * telephone2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone2() {
        return telephone2;
    }

    /**
     * telephone2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone2(String value) {
        this.telephone2 = value;
    }

    /**
     * telebox 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelebox() {
        return telebox;
    }

    /**
     * telebox 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelebox(String value) {
        this.telebox = value;
    }

    /**
     * faxNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * faxNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNumber(String value) {
        this.faxNumber = value;
    }

    /**
     * teletexNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeletexNo() {
        return teletexNo;
    }

    /**
     * teletexNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeletexNo(String value) {
        this.teletexNo = value;
    }

    /**
     * telexNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelexNo() {
        return telexNo;
    }

    /**
     * telexNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelexNo(String value) {
        this.telexNo = value;
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
     * languIso 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguIso() {
        return languIso;
    }

    /**
     * languIso 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguIso(String value) {
        this.languIso = value;
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
     * transpzone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranspzone() {
        return transpzone;
    }

    /**
     * transpzone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranspzone(String value) {
        this.transpzone = value;
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
     * privAddr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivAddr() {
        return privAddr;
    }

    /**
     * privAddr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivAddr(String value) {
        this.privAddr = value;
    }

    /**
     * addrType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrType() {
        return addrType;
    }

    /**
     * addrType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrType(String value) {
        this.addrType = value;
    }

    /**
     * addrOrig 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrOrig() {
        return addrOrig;
    }

    /**
     * addrOrig 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrOrig(String value) {
        this.addrOrig = value;
    }

    /**
     * addrLink 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrLink() {
        return addrLink;
    }

    /**
     * addrLink 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrLink(String value) {
        this.addrLink = value;
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

}
