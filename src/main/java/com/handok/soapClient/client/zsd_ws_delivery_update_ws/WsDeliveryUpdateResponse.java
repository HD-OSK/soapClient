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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EfErrorAny_0" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="EfErrorInFinalCheck_0" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="EfErrorInGoodsIssue_0" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="EfErrorInInterface_0" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="EfErrorInItemDeletion_0" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="EfErrorInPodUpdate_0" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="EfErrorPartnerUpdate" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="EfErrorSernrUpdate" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="EtCreatedHus" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfVekpvb" minOccurs="0"/&gt;
 *         &lt;element name="ItAacItemBlock" type="{urn:sap-com:document:sap:soap:functions:mc-style}_-spe_-bapidlvcoblitemT" minOccurs="0"/&gt;
 *         &lt;element name="ItBapiaddr1" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapiaddr1" minOccurs="0"/&gt;
 *         &lt;element name="ItHandlingUnits" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfHumRehangHu" minOccurs="0"/&gt;
 *         &lt;element name="ItHuHeaderEpc" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOf_-spe_-huHeaderEpc" minOccurs="0"/&gt;
 *         &lt;element name="ItHuItemsEpc" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOf_-spe_-huItemsEpc" minOccurs="0"/&gt;
 *         &lt;element name="ItObjects" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfPgrObjects" minOccurs="0"/&gt;
 *         &lt;element name="ItPacking" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfRepackHuWm" minOccurs="0"/&gt;
 *         &lt;element name="ItPackingSernr" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfHumRepSernr" minOccurs="0"/&gt;
 *         &lt;element name="ItRepack" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfHumRepack" minOccurs="0"/&gt;
 *         &lt;element name="ItTexth" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfTexthGn" minOccurs="0"/&gt;
 *         &lt;element name="ItTextl" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfTextlGn" minOccurs="0"/&gt;
 *         &lt;element name="ItTmstmp" type="{urn:sap-com:document:sap:soap:functions:mc-style}_-spe_-timestampT" minOccurs="0"/&gt;
 *         &lt;element name="ItVerpoSernr" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfHumVerpoSernr" minOccurs="0"/&gt;
 *         &lt;element name="Prot" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfPrott" minOccurs="0"/&gt;
 *         &lt;element name="TvpodTab" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfTvpodvb" minOccurs="0"/&gt;
 *         &lt;element name="VbpokTab" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfVbpok" minOccurs="0"/&gt;
 *         &lt;element name="VbsupconTab" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfVbsupcon" minOccurs="0"/&gt;
 *         &lt;element name="VerkoTab" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfVerko" minOccurs="0"/&gt;
 *         &lt;element name="VerpoTab" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfVerpo" minOccurs="0"/&gt;
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
    "efErrorAny0",
    "efErrorInFinalCheck0",
    "efErrorInGoodsIssue0",
    "efErrorInInterface0",
    "efErrorInItemDeletion0",
    "efErrorInPodUpdate0",
    "efErrorPartnerUpdate",
    "efErrorSernrUpdate",
    "etCreatedHus",
    "itAacItemBlock",
    "itBapiaddr1",
    "itHandlingUnits",
    "itHuHeaderEpc",
    "itHuItemsEpc",
    "itObjects",
    "itPacking",
    "itPackingSernr",
    "itRepack",
    "itTexth",
    "itTextl",
    "itTmstmp",
    "itVerpoSernr",
    "prot",
    "tvpodTab",
    "vbpokTab",
    "vbsupconTab",
    "verkoTab",
    "verpoTab"
})
@XmlRootElement(name = "WsDeliveryUpdateResponse")
public class WsDeliveryUpdateResponse {

    @XmlElement(name = "EfErrorAny_0", required = true)
    protected String efErrorAny0;
    @XmlElement(name = "EfErrorInFinalCheck_0", required = true)
    protected String efErrorInFinalCheck0;
    @XmlElement(name = "EfErrorInGoodsIssue_0", required = true)
    protected String efErrorInGoodsIssue0;
    @XmlElement(name = "EfErrorInInterface_0", required = true)
    protected String efErrorInInterface0;
    @XmlElement(name = "EfErrorInItemDeletion_0", required = true)
    protected String efErrorInItemDeletion0;
    @XmlElement(name = "EfErrorInPodUpdate_0", required = true)
    protected String efErrorInPodUpdate0;
    @XmlElement(name = "EfErrorPartnerUpdate", required = true)
    protected String efErrorPartnerUpdate;
    @XmlElement(name = "EfErrorSernrUpdate", required = true)
    protected String efErrorSernrUpdate;
    @XmlElement(name = "EtCreatedHus")
    protected TableOfVekpvb etCreatedHus;
    @XmlElement(name = "ItAacItemBlock")
    protected SpeBapidlvcoblitemT itAacItemBlock;
    @XmlElement(name = "ItBapiaddr1")
    protected TableOfBapiaddr1 itBapiaddr1;
    @XmlElement(name = "ItHandlingUnits")
    protected TableOfHumRehangHu itHandlingUnits;
    @XmlElement(name = "ItHuHeaderEpc")
    protected TableOfSpeHuHeaderEpc itHuHeaderEpc;
    @XmlElement(name = "ItHuItemsEpc")
    protected TableOfSpeHuItemsEpc itHuItemsEpc;
    @XmlElement(name = "ItObjects")
    protected TableOfPgrObjects itObjects;
    @XmlElement(name = "ItPacking")
    protected TableOfRepackHuWm itPacking;
    @XmlElement(name = "ItPackingSernr")
    protected TableOfHumRepSernr itPackingSernr;
    @XmlElement(name = "ItRepack")
    protected TableOfHumRepack itRepack;
    @XmlElement(name = "ItTexth")
    protected TableOfTexthGn itTexth;
    @XmlElement(name = "ItTextl")
    protected TableOfTextlGn itTextl;
    @XmlElement(name = "ItTmstmp")
    protected SpeTimestampT itTmstmp;
    @XmlElement(name = "ItVerpoSernr")
    protected TableOfHumVerpoSernr itVerpoSernr;
    @XmlElement(name = "Prot")
    protected TableOfPrott prot;
    @XmlElement(name = "TvpodTab")
    protected TableOfTvpodvb tvpodTab;
    @XmlElement(name = "VbpokTab")
    protected TableOfVbpok vbpokTab;
    @XmlElement(name = "VbsupconTab")
    protected TableOfVbsupcon vbsupconTab;
    @XmlElement(name = "VerkoTab")
    protected TableOfVerko verkoTab;
    @XmlElement(name = "VerpoTab")
    protected TableOfVerpo verpoTab;

    /**
     * efErrorAny0 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEfErrorAny0() {
        return efErrorAny0;
    }

    /**
     * efErrorAny0 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEfErrorAny0(String value) {
        this.efErrorAny0 = value;
    }

    /**
     * efErrorInFinalCheck0 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEfErrorInFinalCheck0() {
        return efErrorInFinalCheck0;
    }

    /**
     * efErrorInFinalCheck0 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEfErrorInFinalCheck0(String value) {
        this.efErrorInFinalCheck0 = value;
    }

    /**
     * efErrorInGoodsIssue0 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEfErrorInGoodsIssue0() {
        return efErrorInGoodsIssue0;
    }

    /**
     * efErrorInGoodsIssue0 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEfErrorInGoodsIssue0(String value) {
        this.efErrorInGoodsIssue0 = value;
    }

    /**
     * efErrorInInterface0 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEfErrorInInterface0() {
        return efErrorInInterface0;
    }

    /**
     * efErrorInInterface0 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEfErrorInInterface0(String value) {
        this.efErrorInInterface0 = value;
    }

    /**
     * efErrorInItemDeletion0 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEfErrorInItemDeletion0() {
        return efErrorInItemDeletion0;
    }

    /**
     * efErrorInItemDeletion0 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEfErrorInItemDeletion0(String value) {
        this.efErrorInItemDeletion0 = value;
    }

    /**
     * efErrorInPodUpdate0 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEfErrorInPodUpdate0() {
        return efErrorInPodUpdate0;
    }

    /**
     * efErrorInPodUpdate0 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEfErrorInPodUpdate0(String value) {
        this.efErrorInPodUpdate0 = value;
    }

    /**
     * efErrorPartnerUpdate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEfErrorPartnerUpdate() {
        return efErrorPartnerUpdate;
    }

    /**
     * efErrorPartnerUpdate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEfErrorPartnerUpdate(String value) {
        this.efErrorPartnerUpdate = value;
    }

    /**
     * efErrorSernrUpdate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEfErrorSernrUpdate() {
        return efErrorSernrUpdate;
    }

    /**
     * efErrorSernrUpdate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEfErrorSernrUpdate(String value) {
        this.efErrorSernrUpdate = value;
    }

    /**
     * etCreatedHus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfVekpvb }
     *     
     */
    public TableOfVekpvb getEtCreatedHus() {
        return etCreatedHus;
    }

    /**
     * etCreatedHus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfVekpvb }
     *     
     */
    public void setEtCreatedHus(TableOfVekpvb value) {
        this.etCreatedHus = value;
    }

    /**
     * itAacItemBlock 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SpeBapidlvcoblitemT }
     *     
     */
    public SpeBapidlvcoblitemT getItAacItemBlock() {
        return itAacItemBlock;
    }

    /**
     * itAacItemBlock 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeBapidlvcoblitemT }
     *     
     */
    public void setItAacItemBlock(SpeBapidlvcoblitemT value) {
        this.itAacItemBlock = value;
    }

    /**
     * itBapiaddr1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapiaddr1 }
     *     
     */
    public TableOfBapiaddr1 getItBapiaddr1() {
        return itBapiaddr1;
    }

    /**
     * itBapiaddr1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapiaddr1 }
     *     
     */
    public void setItBapiaddr1(TableOfBapiaddr1 value) {
        this.itBapiaddr1 = value;
    }

    /**
     * itHandlingUnits 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfHumRehangHu }
     *     
     */
    public TableOfHumRehangHu getItHandlingUnits() {
        return itHandlingUnits;
    }

    /**
     * itHandlingUnits 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfHumRehangHu }
     *     
     */
    public void setItHandlingUnits(TableOfHumRehangHu value) {
        this.itHandlingUnits = value;
    }

    /**
     * itHuHeaderEpc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfSpeHuHeaderEpc }
     *     
     */
    public TableOfSpeHuHeaderEpc getItHuHeaderEpc() {
        return itHuHeaderEpc;
    }

    /**
     * itHuHeaderEpc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfSpeHuHeaderEpc }
     *     
     */
    public void setItHuHeaderEpc(TableOfSpeHuHeaderEpc value) {
        this.itHuHeaderEpc = value;
    }

    /**
     * itHuItemsEpc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfSpeHuItemsEpc }
     *     
     */
    public TableOfSpeHuItemsEpc getItHuItemsEpc() {
        return itHuItemsEpc;
    }

    /**
     * itHuItemsEpc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfSpeHuItemsEpc }
     *     
     */
    public void setItHuItemsEpc(TableOfSpeHuItemsEpc value) {
        this.itHuItemsEpc = value;
    }

    /**
     * itObjects 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfPgrObjects }
     *     
     */
    public TableOfPgrObjects getItObjects() {
        return itObjects;
    }

    /**
     * itObjects 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfPgrObjects }
     *     
     */
    public void setItObjects(TableOfPgrObjects value) {
        this.itObjects = value;
    }

    /**
     * itPacking 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfRepackHuWm }
     *     
     */
    public TableOfRepackHuWm getItPacking() {
        return itPacking;
    }

    /**
     * itPacking 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfRepackHuWm }
     *     
     */
    public void setItPacking(TableOfRepackHuWm value) {
        this.itPacking = value;
    }

    /**
     * itPackingSernr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfHumRepSernr }
     *     
     */
    public TableOfHumRepSernr getItPackingSernr() {
        return itPackingSernr;
    }

    /**
     * itPackingSernr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfHumRepSernr }
     *     
     */
    public void setItPackingSernr(TableOfHumRepSernr value) {
        this.itPackingSernr = value;
    }

    /**
     * itRepack 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfHumRepack }
     *     
     */
    public TableOfHumRepack getItRepack() {
        return itRepack;
    }

    /**
     * itRepack 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfHumRepack }
     *     
     */
    public void setItRepack(TableOfHumRepack value) {
        this.itRepack = value;
    }

    /**
     * itTexth 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfTexthGn }
     *     
     */
    public TableOfTexthGn getItTexth() {
        return itTexth;
    }

    /**
     * itTexth 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfTexthGn }
     *     
     */
    public void setItTexth(TableOfTexthGn value) {
        this.itTexth = value;
    }

    /**
     * itTextl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfTextlGn }
     *     
     */
    public TableOfTextlGn getItTextl() {
        return itTextl;
    }

    /**
     * itTextl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfTextlGn }
     *     
     */
    public void setItTextl(TableOfTextlGn value) {
        this.itTextl = value;
    }

    /**
     * itTmstmp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SpeTimestampT }
     *     
     */
    public SpeTimestampT getItTmstmp() {
        return itTmstmp;
    }

    /**
     * itTmstmp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeTimestampT }
     *     
     */
    public void setItTmstmp(SpeTimestampT value) {
        this.itTmstmp = value;
    }

    /**
     * itVerpoSernr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfHumVerpoSernr }
     *     
     */
    public TableOfHumVerpoSernr getItVerpoSernr() {
        return itVerpoSernr;
    }

    /**
     * itVerpoSernr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfHumVerpoSernr }
     *     
     */
    public void setItVerpoSernr(TableOfHumVerpoSernr value) {
        this.itVerpoSernr = value;
    }

    /**
     * prot 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfPrott }
     *     
     */
    public TableOfPrott getProt() {
        return prot;
    }

    /**
     * prot 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfPrott }
     *     
     */
    public void setProt(TableOfPrott value) {
        this.prot = value;
    }

    /**
     * tvpodTab 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfTvpodvb }
     *     
     */
    public TableOfTvpodvb getTvpodTab() {
        return tvpodTab;
    }

    /**
     * tvpodTab 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfTvpodvb }
     *     
     */
    public void setTvpodTab(TableOfTvpodvb value) {
        this.tvpodTab = value;
    }

    /**
     * vbpokTab 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfVbpok }
     *     
     */
    public TableOfVbpok getVbpokTab() {
        return vbpokTab;
    }

    /**
     * vbpokTab 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfVbpok }
     *     
     */
    public void setVbpokTab(TableOfVbpok value) {
        this.vbpokTab = value;
    }

    /**
     * vbsupconTab 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfVbsupcon }
     *     
     */
    public TableOfVbsupcon getVbsupconTab() {
        return vbsupconTab;
    }

    /**
     * vbsupconTab 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfVbsupcon }
     *     
     */
    public void setVbsupconTab(TableOfVbsupcon value) {
        this.vbsupconTab = value;
    }

    /**
     * verkoTab 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfVerko }
     *     
     */
    public TableOfVerko getVerkoTab() {
        return verkoTab;
    }

    /**
     * verkoTab 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfVerko }
     *     
     */
    public void setVerkoTab(TableOfVerko value) {
        this.verkoTab = value;
    }

    /**
     * verpoTab 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfVerpo }
     *     
     */
    public TableOfVerpo getVerpoTab() {
        return verpoTab;
    }

    /**
     * verpoTab 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfVerpo }
     *     
     */
    public void setVerpoTab(TableOfVerpo value) {
        this.verpoTab = value;
    }

}
