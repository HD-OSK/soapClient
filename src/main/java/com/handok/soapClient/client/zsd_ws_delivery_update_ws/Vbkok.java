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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Vbkok complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Vbkok"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VbelnVl" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="VbtypVl" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Vbeln" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Lgnum" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Tanum" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Kodat" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Kouhr" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="Brgew" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/&gt;
 *         &lt;element name="Kzbrg" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Kzntg" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Ntgew" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/&gt;
 *         &lt;element name="Gewei" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="Volum" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/&gt;
 *         &lt;element name="Kzvol" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Voleh" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="Komue" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Wabuc" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="WadatIst" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Kzwad" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Wadat" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Wauhr" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="Kzlfd" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Lfdat" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Lfuhr" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="Kztor" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Lgtor" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Kzlsp" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Lifsk" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="LikpDel" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="PackingRefresh" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="PackingFinal" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Podat" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Potim" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="Kzpod" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Lifex" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="Bolnr" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="Prvbe" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Xwmpp" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Traty" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Traid" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="Kzkodat" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Kzebu" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Inco1" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Inco2" type="{urn:sap-com:document:sap:rfc:functions}char28"/&gt;
 *         &lt;element name="Route" type="{urn:sap-com:document:sap:rfc:functions}char6"/&gt;
 *         &lt;element name="Lprio" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/&gt;
 *         &lt;element name="Vsbed" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Lddat" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Lduhr" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="Tddat" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Tduhr" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="Ablad" type="{urn:sap-com:document:sap:rfc:functions}char25"/&gt;
 *         &lt;element name="Kzinco1" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Kzinco2" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Kzroute" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Kzlprio" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Kzvsbed" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Kzlddat" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Kztddat" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Kzablad" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Kzlifex" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Decspli" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Kzchgoff" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Imwrk" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Kzreg" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Kzlgbzo" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Lgbzo" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="SpeOrigSys" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeChngSys" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeTmpid" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeLoekz" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeNoHuConsCheck" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeLogsys" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="SpeRetHuUpdateRequest" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeGenProcess" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="SpeWauhrIst" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="SpeWazoneIst" type="{urn:sap-com:document:sap:rfc:functions}char6"/&gt;
 *         &lt;element name="SpeLocSeq" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="SpeAccAppSts" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeAccAppStsF" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeShpInfSts" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeShpInfStsF" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeRetCanc" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeRetCancF" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeQiStatus" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeQiStatusF" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeGeoroute" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="SpeGeorouteind" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeCarrierInd" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeGtsRel" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="SpeGtsRtCde" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="GtsCusrefNo" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="BopGuid" type="{urn:sap-com:document:sap:rfc:functions}char22"/&gt;
 *         &lt;element name="SpeDirectBilling" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeBillingWait" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpePrinterProf" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="SpeKzgeoroute" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeKzgeorouteind" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeKzcarrierInd" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeKzgtsRel" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeKzgtsRtCde" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeInitiatorProcess" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="SpeResetVlstk" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeKztraid" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeKztraty" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeInbDlv" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeDistProcCode" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="NoTextInit" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="NoMessageInit" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Bldat" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Kzbld" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Anzpk" type="{urn:sap-com:document:sap:rfc:functions}numeric5"/&gt;
 *         &lt;element name="Kzapk" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="BorgrKzwad" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="BorgrKzabl" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="MdiffBuch" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="MdiffStorno" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Kztxt" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TxtoldDelAllLang" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeMdnumEwm" type="{urn:sap-com:document:sap:rfc:functions}char16"/&gt;
 *         &lt;element name="SpeOmdnumEwm" type="{urn:sap-com:document:sap:rfc:functions}char16"/&gt;
 *         &lt;element name="SpeCdPlant" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="SpeCdPlantf" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeProNumber" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="SpeKzProNumber" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeRedInd" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeAutoGr" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeLeScenario" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Vornu" type="{urn:sap-com:document:sap:rfc:functions}char25"/&gt;
 *         &lt;element name="Vorpa" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Expvz" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="NoLfimgCheckMmli" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="StgeLocChange" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeKzVornu" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeKzVorpa" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vbkok", propOrder = {
    "vbelnVl",
    "vbtypVl",
    "vbeln",
    "lgnum",
    "tanum",
    "kodat",
    "kouhr",
    "brgew",
    "kzbrg",
    "kzntg",
    "ntgew",
    "gewei",
    "volum",
    "kzvol",
    "voleh",
    "komue",
    "wabuc",
    "wadatIst",
    "kzwad",
    "wadat",
    "wauhr",
    "kzlfd",
    "lfdat",
    "lfuhr",
    "kztor",
    "lgtor",
    "kzlsp",
    "lifsk",
    "likpDel",
    "packingRefresh",
    "packingFinal",
    "podat",
    "potim",
    "kzpod",
    "lifex",
    "bolnr",
    "prvbe",
    "xwmpp",
    "traty",
    "traid",
    "kzkodat",
    "kzebu",
    "inco1",
    "inco2",
    "route",
    "lprio",
    "vsbed",
    "lddat",
    "lduhr",
    "tddat",
    "tduhr",
    "ablad",
    "kzinco1",
    "kzinco2",
    "kzroute",
    "kzlprio",
    "kzvsbed",
    "kzlddat",
    "kztddat",
    "kzablad",
    "kzlifex",
    "decspli",
    "kzchgoff",
    "imwrk",
    "kzreg",
    "kzlgbzo",
    "lgbzo",
    "speOrigSys",
    "speChngSys",
    "speTmpid",
    "speLoekz",
    "speNoHuConsCheck",
    "speLogsys",
    "speRetHuUpdateRequest",
    "speGenProcess",
    "speWauhrIst",
    "speWazoneIst",
    "speLocSeq",
    "speAccAppSts",
    "speAccAppStsF",
    "speShpInfSts",
    "speShpInfStsF",
    "speRetCanc",
    "speRetCancF",
    "speQiStatus",
    "speQiStatusF",
    "speGeoroute",
    "speGeorouteind",
    "speCarrierInd",
    "speGtsRel",
    "speGtsRtCde",
    "gtsCusrefNo",
    "bopGuid",
    "speDirectBilling",
    "speBillingWait",
    "spePrinterProf",
    "speKzgeoroute",
    "speKzgeorouteind",
    "speKzcarrierInd",
    "speKzgtsRel",
    "speKzgtsRtCde",
    "speInitiatorProcess",
    "speResetVlstk",
    "speKztraid",
    "speKztraty",
    "speInbDlv",
    "speDistProcCode",
    "noTextInit",
    "noMessageInit",
    "bldat",
    "kzbld",
    "anzpk",
    "kzapk",
    "borgrKzwad",
    "borgrKzabl",
    "mdiffBuch",
    "mdiffStorno",
    "kztxt",
    "txtoldDelAllLang",
    "speMdnumEwm",
    "speOmdnumEwm",
    "speCdPlant",
    "speCdPlantf",
    "speProNumber",
    "speKzProNumber",
    "speRedInd",
    "speAutoGr",
    "speLeScenario",
    "vornu",
    "vorpa",
    "expvz",
    "noLfimgCheckMmli",
    "stgeLocChange",
    "speKzVornu",
    "speKzVorpa"
})
public class Vbkok {

    @XmlElement(name = "VbelnVl", required = true)
    protected String vbelnVl;
    @XmlElement(name = "VbtypVl", required = true)
    protected String vbtypVl;
    @XmlElement(name = "Vbeln", required = true)
    protected String vbeln;
    @XmlElement(name = "Lgnum", required = true)
    protected String lgnum;
    @XmlElement(name = "Tanum", required = true)
    protected String tanum;
    @XmlElement(name = "Kodat", required = true)
    protected String kodat;
    @XmlElement(name = "Kouhr", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar kouhr;
    @XmlElement(name = "Brgew", required = true)
    protected BigDecimal brgew;
    @XmlElement(name = "Kzbrg", required = true)
    protected String kzbrg;
    @XmlElement(name = "Kzntg", required = true)
    protected String kzntg;
    @XmlElement(name = "Ntgew", required = true)
    protected BigDecimal ntgew;
    @XmlElement(name = "Gewei", required = true)
    protected String gewei;
    @XmlElement(name = "Volum", required = true)
    protected BigDecimal volum;
    @XmlElement(name = "Kzvol", required = true)
    protected String kzvol;
    @XmlElement(name = "Voleh", required = true)
    protected String voleh;
    @XmlElement(name = "Komue", required = true)
    protected String komue;
    @XmlElement(name = "Wabuc", required = true)
    protected String wabuc;
    @XmlElement(name = "WadatIst", required = true)
    protected String wadatIst;
    @XmlElement(name = "Kzwad", required = true)
    protected String kzwad;
    @XmlElement(name = "Wadat", required = true)
    protected String wadat;
    @XmlElement(name = "Wauhr", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar wauhr;
    @XmlElement(name = "Kzlfd", required = true)
    protected String kzlfd;
    @XmlElement(name = "Lfdat", required = true)
    protected String lfdat;
    @XmlElement(name = "Lfuhr", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar lfuhr;
    @XmlElement(name = "Kztor", required = true)
    protected String kztor;
    @XmlElement(name = "Lgtor", required = true)
    protected String lgtor;
    @XmlElement(name = "Kzlsp", required = true)
    protected String kzlsp;
    @XmlElement(name = "Lifsk", required = true)
    protected String lifsk;
    @XmlElement(name = "LikpDel", required = true)
    protected String likpDel;
    @XmlElement(name = "PackingRefresh", required = true)
    protected String packingRefresh;
    @XmlElement(name = "PackingFinal", required = true)
    protected String packingFinal;
    @XmlElement(name = "Podat", required = true)
    protected String podat;
    @XmlElement(name = "Potim", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar potim;
    @XmlElement(name = "Kzpod", required = true)
    protected String kzpod;
    @XmlElement(name = "Lifex", required = true)
    protected String lifex;
    @XmlElement(name = "Bolnr", required = true)
    protected String bolnr;
    @XmlElement(name = "Prvbe", required = true)
    protected String prvbe;
    @XmlElement(name = "Xwmpp", required = true)
    protected String xwmpp;
    @XmlElement(name = "Traty", required = true)
    protected String traty;
    @XmlElement(name = "Traid", required = true)
    protected String traid;
    @XmlElement(name = "Kzkodat", required = true)
    protected String kzkodat;
    @XmlElement(name = "Kzebu", required = true)
    protected String kzebu;
    @XmlElement(name = "Inco1", required = true)
    protected String inco1;
    @XmlElement(name = "Inco2", required = true)
    protected String inco2;
    @XmlElement(name = "Route", required = true)
    protected String route;
    @XmlElement(name = "Lprio", required = true)
    protected String lprio;
    @XmlElement(name = "Vsbed", required = true)
    protected String vsbed;
    @XmlElement(name = "Lddat", required = true)
    protected String lddat;
    @XmlElement(name = "Lduhr", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar lduhr;
    @XmlElement(name = "Tddat", required = true)
    protected String tddat;
    @XmlElement(name = "Tduhr", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar tduhr;
    @XmlElement(name = "Ablad", required = true)
    protected String ablad;
    @XmlElement(name = "Kzinco1", required = true)
    protected String kzinco1;
    @XmlElement(name = "Kzinco2", required = true)
    protected String kzinco2;
    @XmlElement(name = "Kzroute", required = true)
    protected String kzroute;
    @XmlElement(name = "Kzlprio", required = true)
    protected String kzlprio;
    @XmlElement(name = "Kzvsbed", required = true)
    protected String kzvsbed;
    @XmlElement(name = "Kzlddat", required = true)
    protected String kzlddat;
    @XmlElement(name = "Kztddat", required = true)
    protected String kztddat;
    @XmlElement(name = "Kzablad", required = true)
    protected String kzablad;
    @XmlElement(name = "Kzlifex", required = true)
    protected String kzlifex;
    @XmlElement(name = "Decspli", required = true)
    protected String decspli;
    @XmlElement(name = "Kzchgoff", required = true)
    protected String kzchgoff;
    @XmlElement(name = "Imwrk", required = true)
    protected String imwrk;
    @XmlElement(name = "Kzreg", required = true)
    protected String kzreg;
    @XmlElement(name = "Kzlgbzo", required = true)
    protected String kzlgbzo;
    @XmlElement(name = "Lgbzo", required = true)
    protected String lgbzo;
    @XmlElement(name = "SpeOrigSys", required = true)
    protected String speOrigSys;
    @XmlElement(name = "SpeChngSys", required = true)
    protected String speChngSys;
    @XmlElement(name = "SpeTmpid", required = true)
    protected String speTmpid;
    @XmlElement(name = "SpeLoekz", required = true)
    protected String speLoekz;
    @XmlElement(name = "SpeNoHuConsCheck", required = true)
    protected String speNoHuConsCheck;
    @XmlElement(name = "SpeLogsys", required = true)
    protected String speLogsys;
    @XmlElement(name = "SpeRetHuUpdateRequest", required = true)
    protected String speRetHuUpdateRequest;
    @XmlElement(name = "SpeGenProcess", required = true)
    protected String speGenProcess;
    @XmlElement(name = "SpeWauhrIst", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar speWauhrIst;
    @XmlElement(name = "SpeWazoneIst", required = true)
    protected String speWazoneIst;
    @XmlElement(name = "SpeLocSeq", required = true)
    protected String speLocSeq;
    @XmlElement(name = "SpeAccAppSts", required = true)
    protected String speAccAppSts;
    @XmlElement(name = "SpeAccAppStsF", required = true)
    protected String speAccAppStsF;
    @XmlElement(name = "SpeShpInfSts", required = true)
    protected String speShpInfSts;
    @XmlElement(name = "SpeShpInfStsF", required = true)
    protected String speShpInfStsF;
    @XmlElement(name = "SpeRetCanc", required = true)
    protected String speRetCanc;
    @XmlElement(name = "SpeRetCancF", required = true)
    protected String speRetCancF;
    @XmlElement(name = "SpeQiStatus", required = true)
    protected String speQiStatus;
    @XmlElement(name = "SpeQiStatusF", required = true)
    protected String speQiStatusF;
    @XmlElement(name = "SpeGeoroute", required = true)
    protected String speGeoroute;
    @XmlElement(name = "SpeGeorouteind", required = true)
    protected String speGeorouteind;
    @XmlElement(name = "SpeCarrierInd", required = true)
    protected String speCarrierInd;
    @XmlElement(name = "SpeGtsRel", required = true)
    protected String speGtsRel;
    @XmlElement(name = "SpeGtsRtCde", required = true)
    protected String speGtsRtCde;
    @XmlElement(name = "GtsCusrefNo", required = true)
    protected String gtsCusrefNo;
    @XmlElement(name = "BopGuid", required = true)
    protected String bopGuid;
    @XmlElement(name = "SpeDirectBilling", required = true)
    protected String speDirectBilling;
    @XmlElement(name = "SpeBillingWait", required = true)
    protected String speBillingWait;
    @XmlElement(name = "SpePrinterProf", required = true)
    protected String spePrinterProf;
    @XmlElement(name = "SpeKzgeoroute", required = true)
    protected String speKzgeoroute;
    @XmlElement(name = "SpeKzgeorouteind", required = true)
    protected String speKzgeorouteind;
    @XmlElement(name = "SpeKzcarrierInd", required = true)
    protected String speKzcarrierInd;
    @XmlElement(name = "SpeKzgtsRel", required = true)
    protected String speKzgtsRel;
    @XmlElement(name = "SpeKzgtsRtCde", required = true)
    protected String speKzgtsRtCde;
    @XmlElement(name = "SpeInitiatorProcess", required = true)
    protected String speInitiatorProcess;
    @XmlElement(name = "SpeResetVlstk", required = true)
    protected String speResetVlstk;
    @XmlElement(name = "SpeKztraid", required = true)
    protected String speKztraid;
    @XmlElement(name = "SpeKztraty", required = true)
    protected String speKztraty;
    @XmlElement(name = "SpeInbDlv", required = true)
    protected String speInbDlv;
    @XmlElement(name = "SpeDistProcCode", required = true)
    protected String speDistProcCode;
    @XmlElement(name = "NoTextInit", required = true)
    protected String noTextInit;
    @XmlElement(name = "NoMessageInit", required = true)
    protected String noMessageInit;
    @XmlElement(name = "Bldat", required = true)
    protected String bldat;
    @XmlElement(name = "Kzbld", required = true)
    protected String kzbld;
    @XmlElement(name = "Anzpk", required = true)
    protected String anzpk;
    @XmlElement(name = "Kzapk", required = true)
    protected String kzapk;
    @XmlElement(name = "BorgrKzwad", required = true)
    protected String borgrKzwad;
    @XmlElement(name = "BorgrKzabl", required = true)
    protected String borgrKzabl;
    @XmlElement(name = "MdiffBuch", required = true)
    protected String mdiffBuch;
    @XmlElement(name = "MdiffStorno", required = true)
    protected String mdiffStorno;
    @XmlElement(name = "Kztxt", required = true)
    protected String kztxt;
    @XmlElement(name = "TxtoldDelAllLang", required = true)
    protected String txtoldDelAllLang;
    @XmlElement(name = "SpeMdnumEwm", required = true)
    protected String speMdnumEwm;
    @XmlElement(name = "SpeOmdnumEwm", required = true)
    protected String speOmdnumEwm;
    @XmlElement(name = "SpeCdPlant", required = true)
    protected String speCdPlant;
    @XmlElement(name = "SpeCdPlantf", required = true)
    protected String speCdPlantf;
    @XmlElement(name = "SpeProNumber", required = true)
    protected String speProNumber;
    @XmlElement(name = "SpeKzProNumber", required = true)
    protected String speKzProNumber;
    @XmlElement(name = "SpeRedInd", required = true)
    protected String speRedInd;
    @XmlElement(name = "SpeAutoGr", required = true)
    protected String speAutoGr;
    @XmlElement(name = "SpeLeScenario", required = true)
    protected String speLeScenario;
    @XmlElement(name = "Vornu", required = true)
    protected String vornu;
    @XmlElement(name = "Vorpa", required = true)
    protected String vorpa;
    @XmlElement(name = "Expvz", required = true)
    protected String expvz;
    @XmlElement(name = "NoLfimgCheckMmli", required = true)
    protected String noLfimgCheckMmli;
    @XmlElement(name = "StgeLocChange", required = true)
    protected String stgeLocChange;
    @XmlElement(name = "SpeKzVornu", required = true)
    protected String speKzVornu;
    @XmlElement(name = "SpeKzVorpa", required = true)
    protected String speKzVorpa;

    /**
     * vbelnVl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVbelnVl() {
        return vbelnVl;
    }

    /**
     * vbelnVl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVbelnVl(String value) {
        this.vbelnVl = value;
    }

    /**
     * vbtypVl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVbtypVl() {
        return vbtypVl;
    }

    /**
     * vbtypVl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVbtypVl(String value) {
        this.vbtypVl = value;
    }

    /**
     * vbeln 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVbeln() {
        return vbeln;
    }

    /**
     * vbeln 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVbeln(String value) {
        this.vbeln = value;
    }

    /**
     * lgnum 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgnum() {
        return lgnum;
    }

    /**
     * lgnum 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgnum(String value) {
        this.lgnum = value;
    }

    /**
     * tanum 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTanum() {
        return tanum;
    }

    /**
     * tanum 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTanum(String value) {
        this.tanum = value;
    }

    /**
     * kodat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodat() {
        return kodat;
    }

    /**
     * kodat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodat(String value) {
        this.kodat = value;
    }

    /**
     * kouhr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKouhr() {
        return kouhr;
    }

    /**
     * kouhr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKouhr(XMLGregorianCalendar value) {
        this.kouhr = value;
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
     * kzbrg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzbrg() {
        return kzbrg;
    }

    /**
     * kzbrg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzbrg(String value) {
        this.kzbrg = value;
    }

    /**
     * kzntg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzntg() {
        return kzntg;
    }

    /**
     * kzntg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzntg(String value) {
        this.kzntg = value;
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
     * volum 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolum() {
        return volum;
    }

    /**
     * volum 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolum(BigDecimal value) {
        this.volum = value;
    }

    /**
     * kzvol 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzvol() {
        return kzvol;
    }

    /**
     * kzvol 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzvol(String value) {
        this.kzvol = value;
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
     * komue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKomue() {
        return komue;
    }

    /**
     * komue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKomue(String value) {
        this.komue = value;
    }

    /**
     * wabuc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWabuc() {
        return wabuc;
    }

    /**
     * wabuc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWabuc(String value) {
        this.wabuc = value;
    }

    /**
     * wadatIst 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWadatIst() {
        return wadatIst;
    }

    /**
     * wadatIst 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWadatIst(String value) {
        this.wadatIst = value;
    }

    /**
     * kzwad 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzwad() {
        return kzwad;
    }

    /**
     * kzwad 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzwad(String value) {
        this.kzwad = value;
    }

    /**
     * wadat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWadat() {
        return wadat;
    }

    /**
     * wadat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWadat(String value) {
        this.wadat = value;
    }

    /**
     * wauhr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWauhr() {
        return wauhr;
    }

    /**
     * wauhr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWauhr(XMLGregorianCalendar value) {
        this.wauhr = value;
    }

    /**
     * kzlfd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzlfd() {
        return kzlfd;
    }

    /**
     * kzlfd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzlfd(String value) {
        this.kzlfd = value;
    }

    /**
     * lfdat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLfdat() {
        return lfdat;
    }

    /**
     * lfdat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLfdat(String value) {
        this.lfdat = value;
    }

    /**
     * lfuhr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLfuhr() {
        return lfuhr;
    }

    /**
     * lfuhr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLfuhr(XMLGregorianCalendar value) {
        this.lfuhr = value;
    }

    /**
     * kztor 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKztor() {
        return kztor;
    }

    /**
     * kztor 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKztor(String value) {
        this.kztor = value;
    }

    /**
     * lgtor 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgtor() {
        return lgtor;
    }

    /**
     * lgtor 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgtor(String value) {
        this.lgtor = value;
    }

    /**
     * kzlsp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzlsp() {
        return kzlsp;
    }

    /**
     * kzlsp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzlsp(String value) {
        this.kzlsp = value;
    }

    /**
     * lifsk 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifsk() {
        return lifsk;
    }

    /**
     * lifsk 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifsk(String value) {
        this.lifsk = value;
    }

    /**
     * likpDel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLikpDel() {
        return likpDel;
    }

    /**
     * likpDel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLikpDel(String value) {
        this.likpDel = value;
    }

    /**
     * packingRefresh 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackingRefresh() {
        return packingRefresh;
    }

    /**
     * packingRefresh 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackingRefresh(String value) {
        this.packingRefresh = value;
    }

    /**
     * packingFinal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackingFinal() {
        return packingFinal;
    }

    /**
     * packingFinal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackingFinal(String value) {
        this.packingFinal = value;
    }

    /**
     * podat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPodat() {
        return podat;
    }

    /**
     * podat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPodat(String value) {
        this.podat = value;
    }

    /**
     * potim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPotim() {
        return potim;
    }

    /**
     * potim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPotim(XMLGregorianCalendar value) {
        this.potim = value;
    }

    /**
     * kzpod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzpod() {
        return kzpod;
    }

    /**
     * kzpod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzpod(String value) {
        this.kzpod = value;
    }

    /**
     * lifex 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifex() {
        return lifex;
    }

    /**
     * lifex 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifex(String value) {
        this.lifex = value;
    }

    /**
     * bolnr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBolnr() {
        return bolnr;
    }

    /**
     * bolnr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBolnr(String value) {
        this.bolnr = value;
    }

    /**
     * prvbe 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvbe() {
        return prvbe;
    }

    /**
     * prvbe 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrvbe(String value) {
        this.prvbe = value;
    }

    /**
     * xwmpp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXwmpp() {
        return xwmpp;
    }

    /**
     * xwmpp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXwmpp(String value) {
        this.xwmpp = value;
    }

    /**
     * traty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraty() {
        return traty;
    }

    /**
     * traty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraty(String value) {
        this.traty = value;
    }

    /**
     * traid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraid() {
        return traid;
    }

    /**
     * traid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraid(String value) {
        this.traid = value;
    }

    /**
     * kzkodat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzkodat() {
        return kzkodat;
    }

    /**
     * kzkodat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzkodat(String value) {
        this.kzkodat = value;
    }

    /**
     * kzebu 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzebu() {
        return kzebu;
    }

    /**
     * kzebu 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzebu(String value) {
        this.kzebu = value;
    }

    /**
     * inco1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInco1() {
        return inco1;
    }

    /**
     * inco1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInco1(String value) {
        this.inco1 = value;
    }

    /**
     * inco2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInco2() {
        return inco2;
    }

    /**
     * inco2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInco2(String value) {
        this.inco2 = value;
    }

    /**
     * route 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoute() {
        return route;
    }

    /**
     * route 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoute(String value) {
        this.route = value;
    }

    /**
     * lprio 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLprio() {
        return lprio;
    }

    /**
     * lprio 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLprio(String value) {
        this.lprio = value;
    }

    /**
     * vsbed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVsbed() {
        return vsbed;
    }

    /**
     * vsbed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVsbed(String value) {
        this.vsbed = value;
    }

    /**
     * lddat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLddat() {
        return lddat;
    }

    /**
     * lddat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLddat(String value) {
        this.lddat = value;
    }

    /**
     * lduhr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLduhr() {
        return lduhr;
    }

    /**
     * lduhr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLduhr(XMLGregorianCalendar value) {
        this.lduhr = value;
    }

    /**
     * tddat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTddat() {
        return tddat;
    }

    /**
     * tddat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTddat(String value) {
        this.tddat = value;
    }

    /**
     * tduhr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTduhr() {
        return tduhr;
    }

    /**
     * tduhr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTduhr(XMLGregorianCalendar value) {
        this.tduhr = value;
    }

    /**
     * ablad 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAblad() {
        return ablad;
    }

    /**
     * ablad 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAblad(String value) {
        this.ablad = value;
    }

    /**
     * kzinco1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzinco1() {
        return kzinco1;
    }

    /**
     * kzinco1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzinco1(String value) {
        this.kzinco1 = value;
    }

    /**
     * kzinco2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzinco2() {
        return kzinco2;
    }

    /**
     * kzinco2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzinco2(String value) {
        this.kzinco2 = value;
    }

    /**
     * kzroute 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzroute() {
        return kzroute;
    }

    /**
     * kzroute 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzroute(String value) {
        this.kzroute = value;
    }

    /**
     * kzlprio 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzlprio() {
        return kzlprio;
    }

    /**
     * kzlprio 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzlprio(String value) {
        this.kzlprio = value;
    }

    /**
     * kzvsbed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzvsbed() {
        return kzvsbed;
    }

    /**
     * kzvsbed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzvsbed(String value) {
        this.kzvsbed = value;
    }

    /**
     * kzlddat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzlddat() {
        return kzlddat;
    }

    /**
     * kzlddat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzlddat(String value) {
        this.kzlddat = value;
    }

    /**
     * kztddat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKztddat() {
        return kztddat;
    }

    /**
     * kztddat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKztddat(String value) {
        this.kztddat = value;
    }

    /**
     * kzablad 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzablad() {
        return kzablad;
    }

    /**
     * kzablad 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzablad(String value) {
        this.kzablad = value;
    }

    /**
     * kzlifex 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzlifex() {
        return kzlifex;
    }

    /**
     * kzlifex 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzlifex(String value) {
        this.kzlifex = value;
    }

    /**
     * decspli 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecspli() {
        return decspli;
    }

    /**
     * decspli 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecspli(String value) {
        this.decspli = value;
    }

    /**
     * kzchgoff 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzchgoff() {
        return kzchgoff;
    }

    /**
     * kzchgoff 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzchgoff(String value) {
        this.kzchgoff = value;
    }

    /**
     * imwrk 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImwrk() {
        return imwrk;
    }

    /**
     * imwrk 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImwrk(String value) {
        this.imwrk = value;
    }

    /**
     * kzreg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzreg() {
        return kzreg;
    }

    /**
     * kzreg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzreg(String value) {
        this.kzreg = value;
    }

    /**
     * kzlgbzo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzlgbzo() {
        return kzlgbzo;
    }

    /**
     * kzlgbzo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzlgbzo(String value) {
        this.kzlgbzo = value;
    }

    /**
     * lgbzo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgbzo() {
        return lgbzo;
    }

    /**
     * lgbzo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgbzo(String value) {
        this.lgbzo = value;
    }

    /**
     * speOrigSys 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeOrigSys() {
        return speOrigSys;
    }

    /**
     * speOrigSys 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeOrigSys(String value) {
        this.speOrigSys = value;
    }

    /**
     * speChngSys 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeChngSys() {
        return speChngSys;
    }

    /**
     * speChngSys 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeChngSys(String value) {
        this.speChngSys = value;
    }

    /**
     * speTmpid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeTmpid() {
        return speTmpid;
    }

    /**
     * speTmpid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeTmpid(String value) {
        this.speTmpid = value;
    }

    /**
     * speLoekz 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeLoekz() {
        return speLoekz;
    }

    /**
     * speLoekz 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeLoekz(String value) {
        this.speLoekz = value;
    }

    /**
     * speNoHuConsCheck 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeNoHuConsCheck() {
        return speNoHuConsCheck;
    }

    /**
     * speNoHuConsCheck 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeNoHuConsCheck(String value) {
        this.speNoHuConsCheck = value;
    }

    /**
     * speLogsys 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeLogsys() {
        return speLogsys;
    }

    /**
     * speLogsys 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeLogsys(String value) {
        this.speLogsys = value;
    }

    /**
     * speRetHuUpdateRequest 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeRetHuUpdateRequest() {
        return speRetHuUpdateRequest;
    }

    /**
     * speRetHuUpdateRequest 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeRetHuUpdateRequest(String value) {
        this.speRetHuUpdateRequest = value;
    }

    /**
     * speGenProcess 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeGenProcess() {
        return speGenProcess;
    }

    /**
     * speGenProcess 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeGenProcess(String value) {
        this.speGenProcess = value;
    }

    /**
     * speWauhrIst 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSpeWauhrIst() {
        return speWauhrIst;
    }

    /**
     * speWauhrIst 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSpeWauhrIst(XMLGregorianCalendar value) {
        this.speWauhrIst = value;
    }

    /**
     * speWazoneIst 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeWazoneIst() {
        return speWazoneIst;
    }

    /**
     * speWazoneIst 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeWazoneIst(String value) {
        this.speWazoneIst = value;
    }

    /**
     * speLocSeq 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeLocSeq() {
        return speLocSeq;
    }

    /**
     * speLocSeq 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeLocSeq(String value) {
        this.speLocSeq = value;
    }

    /**
     * speAccAppSts 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeAccAppSts() {
        return speAccAppSts;
    }

    /**
     * speAccAppSts 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeAccAppSts(String value) {
        this.speAccAppSts = value;
    }

    /**
     * speAccAppStsF 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeAccAppStsF() {
        return speAccAppStsF;
    }

    /**
     * speAccAppStsF 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeAccAppStsF(String value) {
        this.speAccAppStsF = value;
    }

    /**
     * speShpInfSts 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeShpInfSts() {
        return speShpInfSts;
    }

    /**
     * speShpInfSts 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeShpInfSts(String value) {
        this.speShpInfSts = value;
    }

    /**
     * speShpInfStsF 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeShpInfStsF() {
        return speShpInfStsF;
    }

    /**
     * speShpInfStsF 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeShpInfStsF(String value) {
        this.speShpInfStsF = value;
    }

    /**
     * speRetCanc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeRetCanc() {
        return speRetCanc;
    }

    /**
     * speRetCanc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeRetCanc(String value) {
        this.speRetCanc = value;
    }

    /**
     * speRetCancF 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeRetCancF() {
        return speRetCancF;
    }

    /**
     * speRetCancF 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeRetCancF(String value) {
        this.speRetCancF = value;
    }

    /**
     * speQiStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeQiStatus() {
        return speQiStatus;
    }

    /**
     * speQiStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeQiStatus(String value) {
        this.speQiStatus = value;
    }

    /**
     * speQiStatusF 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeQiStatusF() {
        return speQiStatusF;
    }

    /**
     * speQiStatusF 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeQiStatusF(String value) {
        this.speQiStatusF = value;
    }

    /**
     * speGeoroute 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeGeoroute() {
        return speGeoroute;
    }

    /**
     * speGeoroute 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeGeoroute(String value) {
        this.speGeoroute = value;
    }

    /**
     * speGeorouteind 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeGeorouteind() {
        return speGeorouteind;
    }

    /**
     * speGeorouteind 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeGeorouteind(String value) {
        this.speGeorouteind = value;
    }

    /**
     * speCarrierInd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeCarrierInd() {
        return speCarrierInd;
    }

    /**
     * speCarrierInd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeCarrierInd(String value) {
        this.speCarrierInd = value;
    }

    /**
     * speGtsRel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeGtsRel() {
        return speGtsRel;
    }

    /**
     * speGtsRel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeGtsRel(String value) {
        this.speGtsRel = value;
    }

    /**
     * speGtsRtCde 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeGtsRtCde() {
        return speGtsRtCde;
    }

    /**
     * speGtsRtCde 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeGtsRtCde(String value) {
        this.speGtsRtCde = value;
    }

    /**
     * gtsCusrefNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGtsCusrefNo() {
        return gtsCusrefNo;
    }

    /**
     * gtsCusrefNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGtsCusrefNo(String value) {
        this.gtsCusrefNo = value;
    }

    /**
     * bopGuid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBopGuid() {
        return bopGuid;
    }

    /**
     * bopGuid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBopGuid(String value) {
        this.bopGuid = value;
    }

    /**
     * speDirectBilling 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeDirectBilling() {
        return speDirectBilling;
    }

    /**
     * speDirectBilling 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeDirectBilling(String value) {
        this.speDirectBilling = value;
    }

    /**
     * speBillingWait 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeBillingWait() {
        return speBillingWait;
    }

    /**
     * speBillingWait 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeBillingWait(String value) {
        this.speBillingWait = value;
    }

    /**
     * spePrinterProf 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpePrinterProf() {
        return spePrinterProf;
    }

    /**
     * spePrinterProf 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpePrinterProf(String value) {
        this.spePrinterProf = value;
    }

    /**
     * speKzgeoroute 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeKzgeoroute() {
        return speKzgeoroute;
    }

    /**
     * speKzgeoroute 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeKzgeoroute(String value) {
        this.speKzgeoroute = value;
    }

    /**
     * speKzgeorouteind 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeKzgeorouteind() {
        return speKzgeorouteind;
    }

    /**
     * speKzgeorouteind 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeKzgeorouteind(String value) {
        this.speKzgeorouteind = value;
    }

    /**
     * speKzcarrierInd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeKzcarrierInd() {
        return speKzcarrierInd;
    }

    /**
     * speKzcarrierInd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeKzcarrierInd(String value) {
        this.speKzcarrierInd = value;
    }

    /**
     * speKzgtsRel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeKzgtsRel() {
        return speKzgtsRel;
    }

    /**
     * speKzgtsRel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeKzgtsRel(String value) {
        this.speKzgtsRel = value;
    }

    /**
     * speKzgtsRtCde 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeKzgtsRtCde() {
        return speKzgtsRtCde;
    }

    /**
     * speKzgtsRtCde 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeKzgtsRtCde(String value) {
        this.speKzgtsRtCde = value;
    }

    /**
     * speInitiatorProcess 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeInitiatorProcess() {
        return speInitiatorProcess;
    }

    /**
     * speInitiatorProcess 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeInitiatorProcess(String value) {
        this.speInitiatorProcess = value;
    }

    /**
     * speResetVlstk 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeResetVlstk() {
        return speResetVlstk;
    }

    /**
     * speResetVlstk 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeResetVlstk(String value) {
        this.speResetVlstk = value;
    }

    /**
     * speKztraid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeKztraid() {
        return speKztraid;
    }

    /**
     * speKztraid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeKztraid(String value) {
        this.speKztraid = value;
    }

    /**
     * speKztraty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeKztraty() {
        return speKztraty;
    }

    /**
     * speKztraty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeKztraty(String value) {
        this.speKztraty = value;
    }

    /**
     * speInbDlv 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeInbDlv() {
        return speInbDlv;
    }

    /**
     * speInbDlv 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeInbDlv(String value) {
        this.speInbDlv = value;
    }

    /**
     * speDistProcCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeDistProcCode() {
        return speDistProcCode;
    }

    /**
     * speDistProcCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeDistProcCode(String value) {
        this.speDistProcCode = value;
    }

    /**
     * noTextInit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoTextInit() {
        return noTextInit;
    }

    /**
     * noTextInit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoTextInit(String value) {
        this.noTextInit = value;
    }

    /**
     * noMessageInit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoMessageInit() {
        return noMessageInit;
    }

    /**
     * noMessageInit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoMessageInit(String value) {
        this.noMessageInit = value;
    }

    /**
     * bldat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBldat() {
        return bldat;
    }

    /**
     * bldat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBldat(String value) {
        this.bldat = value;
    }

    /**
     * kzbld 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzbld() {
        return kzbld;
    }

    /**
     * kzbld 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzbld(String value) {
        this.kzbld = value;
    }

    /**
     * anzpk 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnzpk() {
        return anzpk;
    }

    /**
     * anzpk 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnzpk(String value) {
        this.anzpk = value;
    }

    /**
     * kzapk 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzapk() {
        return kzapk;
    }

    /**
     * kzapk 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzapk(String value) {
        this.kzapk = value;
    }

    /**
     * borgrKzwad 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorgrKzwad() {
        return borgrKzwad;
    }

    /**
     * borgrKzwad 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorgrKzwad(String value) {
        this.borgrKzwad = value;
    }

    /**
     * borgrKzabl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorgrKzabl() {
        return borgrKzabl;
    }

    /**
     * borgrKzabl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorgrKzabl(String value) {
        this.borgrKzabl = value;
    }

    /**
     * mdiffBuch 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdiffBuch() {
        return mdiffBuch;
    }

    /**
     * mdiffBuch 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdiffBuch(String value) {
        this.mdiffBuch = value;
    }

    /**
     * mdiffStorno 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdiffStorno() {
        return mdiffStorno;
    }

    /**
     * mdiffStorno 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdiffStorno(String value) {
        this.mdiffStorno = value;
    }

    /**
     * kztxt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKztxt() {
        return kztxt;
    }

    /**
     * kztxt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKztxt(String value) {
        this.kztxt = value;
    }

    /**
     * txtoldDelAllLang 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxtoldDelAllLang() {
        return txtoldDelAllLang;
    }

    /**
     * txtoldDelAllLang 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxtoldDelAllLang(String value) {
        this.txtoldDelAllLang = value;
    }

    /**
     * speMdnumEwm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeMdnumEwm() {
        return speMdnumEwm;
    }

    /**
     * speMdnumEwm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeMdnumEwm(String value) {
        this.speMdnumEwm = value;
    }

    /**
     * speOmdnumEwm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeOmdnumEwm() {
        return speOmdnumEwm;
    }

    /**
     * speOmdnumEwm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeOmdnumEwm(String value) {
        this.speOmdnumEwm = value;
    }

    /**
     * speCdPlant 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeCdPlant() {
        return speCdPlant;
    }

    /**
     * speCdPlant 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeCdPlant(String value) {
        this.speCdPlant = value;
    }

    /**
     * speCdPlantf 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeCdPlantf() {
        return speCdPlantf;
    }

    /**
     * speCdPlantf 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeCdPlantf(String value) {
        this.speCdPlantf = value;
    }

    /**
     * speProNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeProNumber() {
        return speProNumber;
    }

    /**
     * speProNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeProNumber(String value) {
        this.speProNumber = value;
    }

    /**
     * speKzProNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeKzProNumber() {
        return speKzProNumber;
    }

    /**
     * speKzProNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeKzProNumber(String value) {
        this.speKzProNumber = value;
    }

    /**
     * speRedInd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeRedInd() {
        return speRedInd;
    }

    /**
     * speRedInd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeRedInd(String value) {
        this.speRedInd = value;
    }

    /**
     * speAutoGr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeAutoGr() {
        return speAutoGr;
    }

    /**
     * speAutoGr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeAutoGr(String value) {
        this.speAutoGr = value;
    }

    /**
     * speLeScenario 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeLeScenario() {
        return speLeScenario;
    }

    /**
     * speLeScenario 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeLeScenario(String value) {
        this.speLeScenario = value;
    }

    /**
     * vornu 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVornu() {
        return vornu;
    }

    /**
     * vornu 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVornu(String value) {
        this.vornu = value;
    }

    /**
     * vorpa 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVorpa() {
        return vorpa;
    }

    /**
     * vorpa 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVorpa(String value) {
        this.vorpa = value;
    }

    /**
     * expvz 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpvz() {
        return expvz;
    }

    /**
     * expvz 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpvz(String value) {
        this.expvz = value;
    }

    /**
     * noLfimgCheckMmli 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoLfimgCheckMmli() {
        return noLfimgCheckMmli;
    }

    /**
     * noLfimgCheckMmli 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoLfimgCheckMmli(String value) {
        this.noLfimgCheckMmli = value;
    }

    /**
     * stgeLocChange 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStgeLocChange() {
        return stgeLocChange;
    }

    /**
     * stgeLocChange 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStgeLocChange(String value) {
        this.stgeLocChange = value;
    }

    /**
     * speKzVornu 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeKzVornu() {
        return speKzVornu;
    }

    /**
     * speKzVornu 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeKzVornu(String value) {
        this.speKzVornu = value;
    }

    /**
     * speKzVorpa 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeKzVorpa() {
        return speKzVorpa;
    }

    /**
     * speKzVorpa 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeKzVorpa(String value) {
        this.speKzVorpa = value;
    }

}
