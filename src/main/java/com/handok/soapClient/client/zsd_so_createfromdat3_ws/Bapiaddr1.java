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
 * <p>Bapiaddr1 complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Bapiaddr1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddrNo" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Formofaddr" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="Name" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="Name2" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="Name3" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="Name4" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="COName" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="City" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="District" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="CityNo" type="{urn:sap-com:document:sap:rfc:functions}char12"/&gt;
 *         &lt;element name="PostlCod1" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="PostlCod2" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="PostlCod3" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="PoBox" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="PoBoxCit" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="DelivDis" type="{urn:sap-com:document:sap:rfc:functions}char15"/&gt;
 *         &lt;element name="Street" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="StreetNo" type="{urn:sap-com:document:sap:rfc:functions}char12"/&gt;
 *         &lt;element name="StrAbbr" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="HouseNo" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="StrSuppl1" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="StrSuppl2" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="Location" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="Building" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Floor" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="RoomNo" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Country" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Langu" type="{urn:sap-com:document:sap:rfc:functions}lang"/&gt;
 *         &lt;element name="Region" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Sort1" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="Sort2" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="TimeZone" type="{urn:sap-com:document:sap:rfc:functions}char6"/&gt;
 *         &lt;element name="Taxjurcode" type="{urn:sap-com:document:sap:rfc:functions}char15"/&gt;
 *         &lt;element name="AdrNotes" type="{urn:sap-com:document:sap:rfc:functions}char50"/&gt;
 *         &lt;element name="CommType" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Tel1Numbr" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="Tel1Ext" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="FaxNumber" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="FaxExtens" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="StreetLng" type="{urn:sap-com:document:sap:rfc:functions}char60"/&gt;
 *         &lt;element name="DistrctNo" type="{urn:sap-com:document:sap:rfc:functions}char8"/&gt;
 *         &lt;element name="Chckstatus" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="PboxcitNo" type="{urn:sap-com:document:sap:rfc:functions}char12"/&gt;
 *         &lt;element name="Transpzone" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="HouseNo2" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="EMail" type="{urn:sap-com:document:sap:rfc:functions}char241"/&gt;
 *         &lt;element name="StrSuppl3" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="Title" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="Countryiso" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="LanguIso" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="BuildLong" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="Regiogroup" type="{urn:sap-com:document:sap:rfc:functions}char8"/&gt;
 *         &lt;element name="HomeCity" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="Homecityno" type="{urn:sap-com:document:sap:rfc:functions}char12"/&gt;
 *         &lt;element name="Pcode1Ext" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Pcode2Ext" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Pcode3Ext" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="PoWONo" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="PoBoxReg" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="PoboxCtry" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="PoCtryiso" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Homepage" type="{urn:sap-com:document:sap:rfc:functions}char132"/&gt;
 *         &lt;element name="DontUseS" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="DontUseP" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="HouseNo3" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="LanguCr" type="{urn:sap-com:document:sap:rfc:functions}lang"/&gt;
 *         &lt;element name="Langucriso" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="PoBoxLobby" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="DeliServType" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="DeliServNumber" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="UriType" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="CountyCode" type="{urn:sap-com:document:sap:rfc:functions}char8"/&gt;
 *         &lt;element name="County" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="TownshipCode" type="{urn:sap-com:document:sap:rfc:functions}char8"/&gt;
 *         &lt;element name="Township" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
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
    "addrNo",
    "formofaddr",
    "name",
    "name2",
    "name3",
    "name4",
    "coName",
    "city",
    "district",
    "cityNo",
    "postlCod1",
    "postlCod2",
    "postlCod3",
    "poBox",
    "poBoxCit",
    "delivDis",
    "street",
    "streetNo",
    "strAbbr",
    "houseNo",
    "strSuppl1",
    "strSuppl2",
    "location",
    "building",
    "floor",
    "roomNo",
    "country",
    "langu",
    "region",
    "sort1",
    "sort2",
    "timeZone",
    "taxjurcode",
    "adrNotes",
    "commType",
    "tel1Numbr",
    "tel1Ext",
    "faxNumber",
    "faxExtens",
    "streetLng",
    "distrctNo",
    "chckstatus",
    "pboxcitNo",
    "transpzone",
    "houseNo2",
    "eMail",
    "strSuppl3",
    "title",
    "countryiso",
    "languIso",
    "buildLong",
    "regiogroup",
    "homeCity",
    "homecityno",
    "pcode1Ext",
    "pcode2Ext",
    "pcode3Ext",
    "poWONo",
    "poBoxReg",
    "poboxCtry",
    "poCtryiso",
    "homepage",
    "dontUseS",
    "dontUseP",
    "houseNo3",
    "languCr",
    "langucriso",
    "poBoxLobby",
    "deliServType",
    "deliServNumber",
    "uriType",
    "countyCode",
    "county",
    "townshipCode",
    "township"
})
public class Bapiaddr1 {

    @XmlElement(name = "AddrNo", required = true)
    protected String addrNo;
    @XmlElement(name = "Formofaddr", required = true)
    protected String formofaddr;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Name2", required = true)
    protected String name2;
    @XmlElement(name = "Name3", required = true)
    protected String name3;
    @XmlElement(name = "Name4", required = true)
    protected String name4;
    @XmlElement(name = "COName", required = true)
    protected String coName;
    @XmlElement(name = "City", required = true)
    protected String city;
    @XmlElement(name = "District", required = true)
    protected String district;
    @XmlElement(name = "CityNo", required = true)
    protected String cityNo;
    @XmlElement(name = "PostlCod1", required = true)
    protected String postlCod1;
    @XmlElement(name = "PostlCod2", required = true)
    protected String postlCod2;
    @XmlElement(name = "PostlCod3", required = true)
    protected String postlCod3;
    @XmlElement(name = "PoBox", required = true)
    protected String poBox;
    @XmlElement(name = "PoBoxCit", required = true)
    protected String poBoxCit;
    @XmlElement(name = "DelivDis", required = true)
    protected String delivDis;
    @XmlElement(name = "Street", required = true)
    protected String street;
    @XmlElement(name = "StreetNo", required = true)
    protected String streetNo;
    @XmlElement(name = "StrAbbr", required = true)
    protected String strAbbr;
    @XmlElement(name = "HouseNo", required = true)
    protected String houseNo;
    @XmlElement(name = "StrSuppl1", required = true)
    protected String strSuppl1;
    @XmlElement(name = "StrSuppl2", required = true)
    protected String strSuppl2;
    @XmlElement(name = "Location", required = true)
    protected String location;
    @XmlElement(name = "Building", required = true)
    protected String building;
    @XmlElement(name = "Floor", required = true)
    protected String floor;
    @XmlElement(name = "RoomNo", required = true)
    protected String roomNo;
    @XmlElement(name = "Country", required = true)
    protected String country;
    @XmlElement(name = "Langu", required = true)
    protected String langu;
    @XmlElement(name = "Region", required = true)
    protected String region;
    @XmlElement(name = "Sort1", required = true)
    protected String sort1;
    @XmlElement(name = "Sort2", required = true)
    protected String sort2;
    @XmlElement(name = "TimeZone", required = true)
    protected String timeZone;
    @XmlElement(name = "Taxjurcode", required = true)
    protected String taxjurcode;
    @XmlElement(name = "AdrNotes", required = true)
    protected String adrNotes;
    @XmlElement(name = "CommType", required = true)
    protected String commType;
    @XmlElement(name = "Tel1Numbr", required = true)
    protected String tel1Numbr;
    @XmlElement(name = "Tel1Ext", required = true)
    protected String tel1Ext;
    @XmlElement(name = "FaxNumber", required = true)
    protected String faxNumber;
    @XmlElement(name = "FaxExtens", required = true)
    protected String faxExtens;
    @XmlElement(name = "StreetLng", required = true)
    protected String streetLng;
    @XmlElement(name = "DistrctNo", required = true)
    protected String distrctNo;
    @XmlElement(name = "Chckstatus", required = true)
    protected String chckstatus;
    @XmlElement(name = "PboxcitNo", required = true)
    protected String pboxcitNo;
    @XmlElement(name = "Transpzone", required = true)
    protected String transpzone;
    @XmlElement(name = "HouseNo2", required = true)
    protected String houseNo2;
    @XmlElement(name = "EMail", required = true)
    protected String eMail;
    @XmlElement(name = "StrSuppl3", required = true)
    protected String strSuppl3;
    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "Countryiso", required = true)
    protected String countryiso;
    @XmlElement(name = "LanguIso", required = true)
    protected String languIso;
    @XmlElement(name = "BuildLong", required = true)
    protected String buildLong;
    @XmlElement(name = "Regiogroup", required = true)
    protected String regiogroup;
    @XmlElement(name = "HomeCity", required = true)
    protected String homeCity;
    @XmlElement(name = "Homecityno", required = true)
    protected String homecityno;
    @XmlElement(name = "Pcode1Ext", required = true)
    protected String pcode1Ext;
    @XmlElement(name = "Pcode2Ext", required = true)
    protected String pcode2Ext;
    @XmlElement(name = "Pcode3Ext", required = true)
    protected String pcode3Ext;
    @XmlElement(name = "PoWONo", required = true)
    protected String poWONo;
    @XmlElement(name = "PoBoxReg", required = true)
    protected String poBoxReg;
    @XmlElement(name = "PoboxCtry", required = true)
    protected String poboxCtry;
    @XmlElement(name = "PoCtryiso", required = true)
    protected String poCtryiso;
    @XmlElement(name = "Homepage", required = true)
    protected String homepage;
    @XmlElement(name = "DontUseS", required = true)
    protected String dontUseS;
    @XmlElement(name = "DontUseP", required = true)
    protected String dontUseP;
    @XmlElement(name = "HouseNo3", required = true)
    protected String houseNo3;
    @XmlElement(name = "LanguCr", required = true)
    protected String languCr;
    @XmlElement(name = "Langucriso", required = true)
    protected String langucriso;
    @XmlElement(name = "PoBoxLobby", required = true)
    protected String poBoxLobby;
    @XmlElement(name = "DeliServType", required = true)
    protected String deliServType;
    @XmlElement(name = "DeliServNumber", required = true)
    protected String deliServNumber;
    @XmlElement(name = "UriType", required = true)
    protected String uriType;
    @XmlElement(name = "CountyCode", required = true)
    protected String countyCode;
    @XmlElement(name = "County", required = true)
    protected String county;
    @XmlElement(name = "TownshipCode", required = true)
    protected String townshipCode;
    @XmlElement(name = "Township", required = true)
    protected String township;

    /**
     * addrNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrNo() {
        return addrNo;
    }

    /**
     * addrNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrNo(String value) {
        this.addrNo = value;
    }

    /**
     * formofaddr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormofaddr() {
        return formofaddr;
    }

    /**
     * formofaddr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormofaddr(String value) {
        this.formofaddr = value;
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
     * coName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOName() {
        return coName;
    }

    /**
     * coName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOName(String value) {
        this.coName = value;
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
     * cityNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityNo() {
        return cityNo;
    }

    /**
     * cityNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityNo(String value) {
        this.cityNo = value;
    }

    /**
     * postlCod1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostlCod1() {
        return postlCod1;
    }

    /**
     * postlCod1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostlCod1(String value) {
        this.postlCod1 = value;
    }

    /**
     * postlCod2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostlCod2() {
        return postlCod2;
    }

    /**
     * postlCod2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostlCod2(String value) {
        this.postlCod2 = value;
    }

    /**
     * postlCod3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostlCod3() {
        return postlCod3;
    }

    /**
     * postlCod3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostlCod3(String value) {
        this.postlCod3 = value;
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
     * poBoxCit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoBoxCit() {
        return poBoxCit;
    }

    /**
     * poBoxCit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoBoxCit(String value) {
        this.poBoxCit = value;
    }

    /**
     * delivDis 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelivDis() {
        return delivDis;
    }

    /**
     * delivDis 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelivDis(String value) {
        this.delivDis = value;
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
     * streetNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNo() {
        return streetNo;
    }

    /**
     * streetNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNo(String value) {
        this.streetNo = value;
    }

    /**
     * strAbbr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrAbbr() {
        return strAbbr;
    }

    /**
     * strAbbr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrAbbr(String value) {
        this.strAbbr = value;
    }

    /**
     * houseNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNo() {
        return houseNo;
    }

    /**
     * houseNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNo(String value) {
        this.houseNo = value;
    }

    /**
     * strSuppl1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrSuppl1() {
        return strSuppl1;
    }

    /**
     * strSuppl1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrSuppl1(String value) {
        this.strSuppl1 = value;
    }

    /**
     * strSuppl2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrSuppl2() {
        return strSuppl2;
    }

    /**
     * strSuppl2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrSuppl2(String value) {
        this.strSuppl2 = value;
    }

    /**
     * location 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * location 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * building 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuilding() {
        return building;
    }

    /**
     * building 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuilding(String value) {
        this.building = value;
    }

    /**
     * floor 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloor() {
        return floor;
    }

    /**
     * floor 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloor(String value) {
        this.floor = value;
    }

    /**
     * roomNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomNo() {
        return roomNo;
    }

    /**
     * roomNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomNo(String value) {
        this.roomNo = value;
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
     * sort1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSort1() {
        return sort1;
    }

    /**
     * sort1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSort1(String value) {
        this.sort1 = value;
    }

    /**
     * sort2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSort2() {
        return sort2;
    }

    /**
     * sort2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSort2(String value) {
        this.sort2 = value;
    }

    /**
     * timeZone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * timeZone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
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
     * adrNotes 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrNotes() {
        return adrNotes;
    }

    /**
     * adrNotes 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrNotes(String value) {
        this.adrNotes = value;
    }

    /**
     * commType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommType() {
        return commType;
    }

    /**
     * commType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommType(String value) {
        this.commType = value;
    }

    /**
     * tel1Numbr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel1Numbr() {
        return tel1Numbr;
    }

    /**
     * tel1Numbr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel1Numbr(String value) {
        this.tel1Numbr = value;
    }

    /**
     * tel1Ext 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel1Ext() {
        return tel1Ext;
    }

    /**
     * tel1Ext 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel1Ext(String value) {
        this.tel1Ext = value;
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
     * faxExtens 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxExtens() {
        return faxExtens;
    }

    /**
     * faxExtens 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxExtens(String value) {
        this.faxExtens = value;
    }

    /**
     * streetLng 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetLng() {
        return streetLng;
    }

    /**
     * streetLng 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetLng(String value) {
        this.streetLng = value;
    }

    /**
     * distrctNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrctNo() {
        return distrctNo;
    }

    /**
     * distrctNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrctNo(String value) {
        this.distrctNo = value;
    }

    /**
     * chckstatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChckstatus() {
        return chckstatus;
    }

    /**
     * chckstatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChckstatus(String value) {
        this.chckstatus = value;
    }

    /**
     * pboxcitNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPboxcitNo() {
        return pboxcitNo;
    }

    /**
     * pboxcitNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPboxcitNo(String value) {
        this.pboxcitNo = value;
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
     * houseNo2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNo2() {
        return houseNo2;
    }

    /**
     * houseNo2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNo2(String value) {
        this.houseNo2 = value;
    }

    /**
     * eMail 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * eMail 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMail(String value) {
        this.eMail = value;
    }

    /**
     * strSuppl3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrSuppl3() {
        return strSuppl3;
    }

    /**
     * strSuppl3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrSuppl3(String value) {
        this.strSuppl3 = value;
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
     * countryiso 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryiso() {
        return countryiso;
    }

    /**
     * countryiso 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryiso(String value) {
        this.countryiso = value;
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
     * buildLong 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildLong() {
        return buildLong;
    }

    /**
     * buildLong 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildLong(String value) {
        this.buildLong = value;
    }

    /**
     * regiogroup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegiogroup() {
        return regiogroup;
    }

    /**
     * regiogroup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegiogroup(String value) {
        this.regiogroup = value;
    }

    /**
     * homeCity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeCity() {
        return homeCity;
    }

    /**
     * homeCity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeCity(String value) {
        this.homeCity = value;
    }

    /**
     * homecityno 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomecityno() {
        return homecityno;
    }

    /**
     * homecityno 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomecityno(String value) {
        this.homecityno = value;
    }

    /**
     * pcode1Ext 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcode1Ext() {
        return pcode1Ext;
    }

    /**
     * pcode1Ext 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcode1Ext(String value) {
        this.pcode1Ext = value;
    }

    /**
     * pcode2Ext 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcode2Ext() {
        return pcode2Ext;
    }

    /**
     * pcode2Ext 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcode2Ext(String value) {
        this.pcode2Ext = value;
    }

    /**
     * pcode3Ext 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcode3Ext() {
        return pcode3Ext;
    }

    /**
     * pcode3Ext 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcode3Ext(String value) {
        this.pcode3Ext = value;
    }

    /**
     * poWONo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoWONo() {
        return poWONo;
    }

    /**
     * poWONo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoWONo(String value) {
        this.poWONo = value;
    }

    /**
     * poBoxReg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoBoxReg() {
        return poBoxReg;
    }

    /**
     * poBoxReg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoBoxReg(String value) {
        this.poBoxReg = value;
    }

    /**
     * poboxCtry 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoboxCtry() {
        return poboxCtry;
    }

    /**
     * poboxCtry 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoboxCtry(String value) {
        this.poboxCtry = value;
    }

    /**
     * poCtryiso 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoCtryiso() {
        return poCtryiso;
    }

    /**
     * poCtryiso 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoCtryiso(String value) {
        this.poCtryiso = value;
    }

    /**
     * homepage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomepage() {
        return homepage;
    }

    /**
     * homepage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomepage(String value) {
        this.homepage = value;
    }

    /**
     * dontUseS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDontUseS() {
        return dontUseS;
    }

    /**
     * dontUseS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDontUseS(String value) {
        this.dontUseS = value;
    }

    /**
     * dontUseP 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDontUseP() {
        return dontUseP;
    }

    /**
     * dontUseP 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDontUseP(String value) {
        this.dontUseP = value;
    }

    /**
     * houseNo3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNo3() {
        return houseNo3;
    }

    /**
     * houseNo3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNo3(String value) {
        this.houseNo3 = value;
    }

    /**
     * languCr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguCr() {
        return languCr;
    }

    /**
     * languCr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguCr(String value) {
        this.languCr = value;
    }

    /**
     * langucriso 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangucriso() {
        return langucriso;
    }

    /**
     * langucriso 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangucriso(String value) {
        this.langucriso = value;
    }

    /**
     * poBoxLobby 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoBoxLobby() {
        return poBoxLobby;
    }

    /**
     * poBoxLobby 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoBoxLobby(String value) {
        this.poBoxLobby = value;
    }

    /**
     * deliServType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliServType() {
        return deliServType;
    }

    /**
     * deliServType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliServType(String value) {
        this.deliServType = value;
    }

    /**
     * deliServNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliServNumber() {
        return deliServNumber;
    }

    /**
     * deliServNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliServNumber(String value) {
        this.deliServNumber = value;
    }

    /**
     * uriType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUriType() {
        return uriType;
    }

    /**
     * uriType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUriType(String value) {
        this.uriType = value;
    }

    /**
     * countyCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyCode() {
        return countyCode;
    }

    /**
     * countyCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyCode(String value) {
        this.countyCode = value;
    }

    /**
     * county 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * county 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * townshipCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTownshipCode() {
        return townshipCode;
    }

    /**
     * townshipCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTownshipCode(String value) {
        this.townshipCode = value;
    }

    /**
     * township 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTownship() {
        return township;
    }

    /**
     * township 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTownship(String value) {
        this.township = value;
    }

}
