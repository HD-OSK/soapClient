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
 *         &lt;element name="Commit" type="{urn:sap-com:document:sap:rfc:functions}char1" minOccurs="0"/&gt;
 *         &lt;element name="Delivery" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="EtCreatedHus" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfVekpvb" minOccurs="0"/&gt;
 *         &lt;element name="IfConfirmCentral" type="{urn:sap-com:document:sap:rfc:functions}char1" minOccurs="0"/&gt;
 *         &lt;element name="IfDatabaseUpdate" type="{urn:sap-com:document:sap:rfc:functions}char1" minOccurs="0"/&gt;
 *         &lt;element name="IfErrorMessagesSend_0" type="{urn:sap-com:document:sap:rfc:functions}char1" minOccurs="0"/&gt;
 *         &lt;element name="IfGetDeliveryBuffered" type="{urn:sap-com:document:sap:rfc:functions}char1" minOccurs="0"/&gt;
 *         &lt;element name="IfLateDeliveryUpd" type="{urn:sap-com:document:sap:rfc:functions}char1" minOccurs="0"/&gt;
 *         &lt;element name="IfNoBufferRefresh" type="{urn:sap-com:document:sap:rfc:functions}char1" minOccurs="0"/&gt;
 *         &lt;element name="IfNoGenericSystemService" type="{urn:sap-com:document:sap:rfc:functions}char1" minOccurs="0"/&gt;
 *         &lt;element name="IfNoInit" type="{urn:sap-com:document:sap:rfc:functions}char1" minOccurs="0"/&gt;
 *         &lt;element name="IfNoMesUpdPack" type="{urn:sap-com:document:sap:rfc:functions}char1" minOccurs="0"/&gt;
 *         &lt;element name="IfNoRead" type="{urn:sap-com:document:sap:rfc:functions}char1" minOccurs="0"/&gt;
 *         &lt;element name="IfNoRemoteChg" type="{urn:sap-com:document:sap:rfc:functions}char1" minOccurs="0"/&gt;
 *         &lt;element name="IfWmpp" type="{urn:sap-com:document:sap:rfc:functions}char1" minOccurs="0"/&gt;
 *         &lt;element name="ItAacItemBlock" type="{urn:sap-com:document:sap:soap:functions:mc-style}_-spe_-bapidlvcoblitemT" minOccurs="0"/&gt;
 *         &lt;element name="ItBapiaddr1" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapiaddr1" minOccurs="0"/&gt;
 *         &lt;element name="ItHandlingUnits" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfHumRehangHu" minOccurs="0"/&gt;
 *         &lt;element name="ItHuHeaderEpc" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOf_-spe_-huHeaderEpc" minOccurs="0"/&gt;
 *         &lt;element name="ItHuItemsEpc" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOf_-spe_-huItemsEpc" minOccurs="0"/&gt;
 *         &lt;element name="ItObjects" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfPgrObjects" minOccurs="0"/&gt;
 *         &lt;element name="ItPacking" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfRepackHuWm" minOccurs="0"/&gt;
 *         &lt;element name="ItPackingSernr" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfHumRepSernr" minOccurs="0"/&gt;
 *         &lt;element name="ItPartnerUpdate" type="{urn:sap-com:document:sap:soap:functions:mc-style}ShpPartnerUpdateT" minOccurs="0"/&gt;
 *         &lt;element name="ItRepack" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfHumRepack" minOccurs="0"/&gt;
 *         &lt;element name="ItSernrUpdate" type="{urn:sap-com:document:sap:soap:functions:mc-style}ShpSernrUpdateT" minOccurs="0"/&gt;
 *         &lt;element name="ItTexth" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfTexthGn" minOccurs="0"/&gt;
 *         &lt;element name="ItTextl" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfTextlGn" minOccurs="0"/&gt;
 *         &lt;element name="ItTmstmp" type="{urn:sap-com:document:sap:soap:functions:mc-style}_-spe_-timestampT" minOccurs="0"/&gt;
 *         &lt;element name="ItVerpoSernr" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfHumVerpoSernr" minOccurs="0"/&gt;
 *         &lt;element name="NichtSperren" type="{urn:sap-com:document:sap:rfc:functions}char1" minOccurs="0"/&gt;
 *         &lt;element name="NoMessagesUpdate" type="{urn:sap-com:document:sap:rfc:functions}char1" minOccurs="0"/&gt;
 *         &lt;element name="Prot" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfPrott" minOccurs="0"/&gt;
 *         &lt;element name="Synchron" type="{urn:sap-com:document:sap:rfc:functions}char1" minOccurs="0"/&gt;
 *         &lt;element name="TvpodTab" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfTvpodvb" minOccurs="0"/&gt;
 *         &lt;element name="UpdatePicking" type="{urn:sap-com:document:sap:rfc:functions}char1" minOccurs="0"/&gt;
 *         &lt;element name="VbkokWa" type="{urn:sap-com:document:sap:soap:functions:mc-style}Vbkok"/&gt;
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
    "commit",
    "delivery",
    "etCreatedHus",
    "ifConfirmCentral",
    "ifDatabaseUpdate",
    "ifErrorMessagesSend0",
    "ifGetDeliveryBuffered",
    "ifLateDeliveryUpd",
    "ifNoBufferRefresh",
    "ifNoGenericSystemService",
    "ifNoInit",
    "ifNoMesUpdPack",
    "ifNoRead",
    "ifNoRemoteChg",
    "ifWmpp",
    "itAacItemBlock",
    "itBapiaddr1",
    "itHandlingUnits",
    "itHuHeaderEpc",
    "itHuItemsEpc",
    "itObjects",
    "itPacking",
    "itPackingSernr",
    "itPartnerUpdate",
    "itRepack",
    "itSernrUpdate",
    "itTexth",
    "itTextl",
    "itTmstmp",
    "itVerpoSernr",
    "nichtSperren",
    "noMessagesUpdate",
    "prot",
    "synchron",
    "tvpodTab",
    "updatePicking",
    "vbkokWa",
    "vbpokTab",
    "vbsupconTab",
    "verkoTab",
    "verpoTab"
})
@XmlRootElement(name = "WsDeliveryUpdate")
public class WsDeliveryUpdate {

    @XmlElement(name = "Commit")
    protected String commit;
    @XmlElement(name = "Delivery", required = true)
    protected String delivery;
    @XmlElement(name = "EtCreatedHus")
    protected TableOfVekpvb etCreatedHus;
    @XmlElement(name = "IfConfirmCentral")
    protected String ifConfirmCentral;
    @XmlElement(name = "IfDatabaseUpdate")
    protected String ifDatabaseUpdate;
    @XmlElement(name = "IfErrorMessagesSend_0")
    protected String ifErrorMessagesSend0;
    @XmlElement(name = "IfGetDeliveryBuffered")
    protected String ifGetDeliveryBuffered;
    @XmlElement(name = "IfLateDeliveryUpd")
    protected String ifLateDeliveryUpd;
    @XmlElement(name = "IfNoBufferRefresh")
    protected String ifNoBufferRefresh;
    @XmlElement(name = "IfNoGenericSystemService")
    protected String ifNoGenericSystemService;
    @XmlElement(name = "IfNoInit")
    protected String ifNoInit;
    @XmlElement(name = "IfNoMesUpdPack")
    protected String ifNoMesUpdPack;
    @XmlElement(name = "IfNoRead")
    protected String ifNoRead;
    @XmlElement(name = "IfNoRemoteChg")
    protected String ifNoRemoteChg;
    @XmlElement(name = "IfWmpp")
    protected String ifWmpp;
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
    @XmlElement(name = "ItPartnerUpdate")
    protected ShpPartnerUpdateT itPartnerUpdate;
    @XmlElement(name = "ItRepack")
    protected TableOfHumRepack itRepack;
    @XmlElement(name = "ItSernrUpdate")
    protected ShpSernrUpdateT itSernrUpdate;
    @XmlElement(name = "ItTexth")
    protected TableOfTexthGn itTexth;
    @XmlElement(name = "ItTextl")
    protected TableOfTextlGn itTextl;
    @XmlElement(name = "ItTmstmp")
    protected SpeTimestampT itTmstmp;
    @XmlElement(name = "ItVerpoSernr")
    protected TableOfHumVerpoSernr itVerpoSernr;
    @XmlElement(name = "NichtSperren")
    protected String nichtSperren;
    @XmlElement(name = "NoMessagesUpdate")
    protected String noMessagesUpdate;
    @XmlElement(name = "Prot")
    protected TableOfPrott prot;
    @XmlElement(name = "Synchron")
    protected String synchron;
    @XmlElement(name = "TvpodTab")
    protected TableOfTvpodvb tvpodTab;
    @XmlElement(name = "UpdatePicking")
    protected String updatePicking;
    @XmlElement(name = "VbkokWa", required = true)
    protected Vbkok vbkokWa;
    @XmlElement(name = "VbpokTab")
    protected TableOfVbpok vbpokTab;
    @XmlElement(name = "VbsupconTab")
    protected TableOfVbsupcon vbsupconTab;
    @XmlElement(name = "VerkoTab")
    protected TableOfVerko verkoTab;
    @XmlElement(name = "VerpoTab")
    protected TableOfVerpo verpoTab;

    /**
     * commit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommit() {
        return commit;
    }

    /**
     * commit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommit(String value) {
        this.commit = value;
    }

    /**
     * delivery 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelivery() {
        return delivery;
    }

    /**
     * delivery 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelivery(String value) {
        this.delivery = value;
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
     * ifConfirmCentral 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfConfirmCentral() {
        return ifConfirmCentral;
    }

    /**
     * ifConfirmCentral 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfConfirmCentral(String value) {
        this.ifConfirmCentral = value;
    }

    /**
     * ifDatabaseUpdate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfDatabaseUpdate() {
        return ifDatabaseUpdate;
    }

    /**
     * ifDatabaseUpdate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfDatabaseUpdate(String value) {
        this.ifDatabaseUpdate = value;
    }

    /**
     * ifErrorMessagesSend0 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfErrorMessagesSend0() {
        return ifErrorMessagesSend0;
    }

    /**
     * ifErrorMessagesSend0 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfErrorMessagesSend0(String value) {
        this.ifErrorMessagesSend0 = value;
    }

    /**
     * ifGetDeliveryBuffered 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfGetDeliveryBuffered() {
        return ifGetDeliveryBuffered;
    }

    /**
     * ifGetDeliveryBuffered 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfGetDeliveryBuffered(String value) {
        this.ifGetDeliveryBuffered = value;
    }

    /**
     * ifLateDeliveryUpd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfLateDeliveryUpd() {
        return ifLateDeliveryUpd;
    }

    /**
     * ifLateDeliveryUpd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfLateDeliveryUpd(String value) {
        this.ifLateDeliveryUpd = value;
    }

    /**
     * ifNoBufferRefresh 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfNoBufferRefresh() {
        return ifNoBufferRefresh;
    }

    /**
     * ifNoBufferRefresh 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfNoBufferRefresh(String value) {
        this.ifNoBufferRefresh = value;
    }

    /**
     * ifNoGenericSystemService 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfNoGenericSystemService() {
        return ifNoGenericSystemService;
    }

    /**
     * ifNoGenericSystemService 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfNoGenericSystemService(String value) {
        this.ifNoGenericSystemService = value;
    }

    /**
     * ifNoInit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfNoInit() {
        return ifNoInit;
    }

    /**
     * ifNoInit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfNoInit(String value) {
        this.ifNoInit = value;
    }

    /**
     * ifNoMesUpdPack 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfNoMesUpdPack() {
        return ifNoMesUpdPack;
    }

    /**
     * ifNoMesUpdPack 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfNoMesUpdPack(String value) {
        this.ifNoMesUpdPack = value;
    }

    /**
     * ifNoRead 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfNoRead() {
        return ifNoRead;
    }

    /**
     * ifNoRead 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfNoRead(String value) {
        this.ifNoRead = value;
    }

    /**
     * ifNoRemoteChg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfNoRemoteChg() {
        return ifNoRemoteChg;
    }

    /**
     * ifNoRemoteChg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfNoRemoteChg(String value) {
        this.ifNoRemoteChg = value;
    }

    /**
     * ifWmpp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfWmpp() {
        return ifWmpp;
    }

    /**
     * ifWmpp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfWmpp(String value) {
        this.ifWmpp = value;
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
     * itPartnerUpdate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ShpPartnerUpdateT }
     *     
     */
    public ShpPartnerUpdateT getItPartnerUpdate() {
        return itPartnerUpdate;
    }

    /**
     * itPartnerUpdate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ShpPartnerUpdateT }
     *     
     */
    public void setItPartnerUpdate(ShpPartnerUpdateT value) {
        this.itPartnerUpdate = value;
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
     * itSernrUpdate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ShpSernrUpdateT }
     *     
     */
    public ShpSernrUpdateT getItSernrUpdate() {
        return itSernrUpdate;
    }

    /**
     * itSernrUpdate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ShpSernrUpdateT }
     *     
     */
    public void setItSernrUpdate(ShpSernrUpdateT value) {
        this.itSernrUpdate = value;
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
     * nichtSperren 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNichtSperren() {
        return nichtSperren;
    }

    /**
     * nichtSperren 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNichtSperren(String value) {
        this.nichtSperren = value;
    }

    /**
     * noMessagesUpdate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoMessagesUpdate() {
        return noMessagesUpdate;
    }

    /**
     * noMessagesUpdate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoMessagesUpdate(String value) {
        this.noMessagesUpdate = value;
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
     * synchron 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSynchron() {
        return synchron;
    }

    /**
     * synchron 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSynchron(String value) {
        this.synchron = value;
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
     * updatePicking 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatePicking() {
        return updatePicking;
    }

    /**
     * updatePicking 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatePicking(String value) {
        this.updatePicking = value;
    }

    /**
     * vbkokWa 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Vbkok }
     *     
     */
    public Vbkok getVbkokWa() {
        return vbkokWa;
    }

    /**
     * vbkokWa 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Vbkok }
     *     
     */
    public void setVbkokWa(Vbkok value) {
        this.vbkokWa = value;
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
