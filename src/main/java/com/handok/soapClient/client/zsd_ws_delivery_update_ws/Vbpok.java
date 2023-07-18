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
 * <p>Vbpok complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Vbpok"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VbelnVl" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="PosnrVl" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="Vbeln" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Posnn" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="VbtypN" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Matnr" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="Charg" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Werks" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Taqui" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Kzntg" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Kzbrg" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Kzvol" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Lianp" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="LipsDel" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Insmk" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Bestq" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Kzpod" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Ndifm" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="Orpos" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="Pikmg" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/&gt;
 *         &lt;element name="Sobkz" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Sonum" type="{urn:sap-com:document:sap:rfc:functions}char16"/&gt;
 *         &lt;element name="Kzbef" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Plmin" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ForceOrposReduction" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Lfimg" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="Lgmng" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="LfimgFlo" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="LgmngFlo" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Umvkz" type="{urn:sap-com:document:sap:rfc:functions}decimal5.0"/&gt;
 *         &lt;element name="Umvkn" type="{urn:sap-com:document:sap:rfc:functions}decimal5.0"/&gt;
 *         &lt;element name="Umrev" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Akmng" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Vrkme" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="Meins" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="Kzfme" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Brgew" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/&gt;
 *         &lt;element name="Ntgew" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/&gt;
 *         &lt;element name="Gewei" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="Volum" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/&gt;
 *         &lt;element name="Voleh" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="Lgpla" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Lgtyp" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Bwlvs" type="{urn:sap-com:document:sap:rfc:functions}numeric3"/&gt;
 *         &lt;element name="Xwmpp" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Vfdat" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Kzvfdat" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="EbumgBme" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="WmsRfbel" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="WmsRfpos" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="Hsdat" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Kzhsdat" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeDiffPostIndicator" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeExceptCode" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="SpeAuthNumber" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="SpeRetQtyPost" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="SpeBaseUom" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="SpeAuthComplet" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeAuthCompletF" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeRetClosingIndicator" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeExpDateExtB" type="{urn:sap-com:document:sap:rfc:functions}decimal15.0"/&gt;
 *         &lt;element name="SpeExpDateExt" type="{urn:sap-com:document:sap:rfc:functions}decimal15.0"/&gt;
 *         &lt;element name="SpeMdiffInsmk" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeImwrkItm" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeImwrkItmF" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeOrigSys" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeCumVend" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/&gt;
 *         &lt;element name="SpeCumItqs" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/&gt;
 *         &lt;element name="SpeCumSa" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/&gt;
 *         &lt;element name="SpeLifexpos2" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="SpeVersion" type="{urn:sap-com:document:sap:rfc:functions}numeric4"/&gt;
 *         &lt;element name="SpeDlvQtyFrom" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="SpeInmskF" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeLifexpos2F" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeInbItmUpd" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Arktx" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="Lgbzo" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Lgort" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Kzlgo" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Lifexpos" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="Kzlxp" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Bwtar" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Kzbwt" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Mfrgr" type="{urn:sap-com:document:sap:rfc:functions}char8"/&gt;
 *         &lt;element name="Ean11" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="Idnlf" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="Lichn" type="{urn:sap-com:document:sap:rfc:functions}char15"/&gt;
 *         &lt;element name="Abrvw" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Kztxt" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TxtoldDelAllLang" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="MdiffBwart" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="MdiffGrund" type="{urn:sap-com:document:sap:rfc:functions}numeric4"/&gt;
 *         &lt;element name="MdiffLgort" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="MdiffAutoSplit" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeMdnumEwm" type="{urn:sap-com:document:sap:rfc:functions}char16"/&gt;
 *         &lt;element name="SpeMditmEwm" type="{urn:sap-com:document:sap:rfc:functions}numeric4"/&gt;
 *         &lt;element name="SpeOmdnumEwm" type="{urn:sap-com:document:sap:rfc:functions}char16"/&gt;
 *         &lt;element name="SpeOmditmEwm" type="{urn:sap-com:document:sap:rfc:functions}numeric4"/&gt;
 *         &lt;element name="Ormng" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="SpeGtsStockType" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeLieffz" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/&gt;
 *         &lt;element name="SpeApoQntyfac" type="{urn:sap-com:document:sap:rfc:functions}decimal5.0"/&gt;
 *         &lt;element name="SpeApoQntydiv" type="{urn:sap-com:document:sap:rfc:functions}decimal5.0"/&gt;
 *         &lt;element name="SpePickDenial" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SernrDel" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="FlagDocub" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeXnocon" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeEbumg" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="Bwart" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="SpeForceOrmngUpdate" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="InspDocGuid" type="{urn:sap-com:document:sap:rfc:functions}byte16"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vbpok", propOrder = {
    "vbelnVl",
    "posnrVl",
    "vbeln",
    "posnn",
    "vbtypN",
    "matnr",
    "charg",
    "werks",
    "taqui",
    "kzntg",
    "kzbrg",
    "kzvol",
    "lianp",
    "lipsDel",
    "insmk",
    "bestq",
    "kzpod",
    "ndifm",
    "orpos",
    "pikmg",
    "sobkz",
    "sonum",
    "kzbef",
    "plmin",
    "forceOrposReduction",
    "lfimg",
    "lgmng",
    "lfimgFlo",
    "lgmngFlo",
    "umvkz",
    "umvkn",
    "umrev",
    "akmng",
    "vrkme",
    "meins",
    "kzfme",
    "brgew",
    "ntgew",
    "gewei",
    "volum",
    "voleh",
    "lgpla",
    "lgtyp",
    "bwlvs",
    "xwmpp",
    "vfdat",
    "kzvfdat",
    "ebumgBme",
    "wmsRfbel",
    "wmsRfpos",
    "hsdat",
    "kzhsdat",
    "speDiffPostIndicator",
    "speExceptCode",
    "speAuthNumber",
    "speRetQtyPost",
    "speBaseUom",
    "speAuthComplet",
    "speAuthCompletF",
    "speRetClosingIndicator",
    "speExpDateExtB",
    "speExpDateExt",
    "speMdiffInsmk",
    "speImwrkItm",
    "speImwrkItmF",
    "speOrigSys",
    "speCumVend",
    "speCumItqs",
    "speCumSa",
    "speLifexpos2",
    "speVersion",
    "speDlvQtyFrom",
    "speInmskF",
    "speLifexpos2F",
    "speInbItmUpd",
    "arktx",
    "lgbzo",
    "lgort",
    "kzlgo",
    "lifexpos",
    "kzlxp",
    "bwtar",
    "kzbwt",
    "mfrgr",
    "ean11",
    "idnlf",
    "lichn",
    "abrvw",
    "kztxt",
    "txtoldDelAllLang",
    "mdiffBwart",
    "mdiffGrund",
    "mdiffLgort",
    "mdiffAutoSplit",
    "speMdnumEwm",
    "speMditmEwm",
    "speOmdnumEwm",
    "speOmditmEwm",
    "ormng",
    "speGtsStockType",
    "speLieffz",
    "speApoQntyfac",
    "speApoQntydiv",
    "spePickDenial",
    "sernrDel",
    "flagDocub",
    "speXnocon",
    "speEbumg",
    "bwart",
    "speForceOrmngUpdate",
    "inspDocGuid"
})
public class Vbpok {

    @XmlElement(name = "VbelnVl", required = true)
    protected String vbelnVl;
    @XmlElement(name = "PosnrVl", required = true)
    protected String posnrVl;
    @XmlElement(name = "Vbeln", required = true)
    protected String vbeln;
    @XmlElement(name = "Posnn", required = true)
    protected String posnn;
    @XmlElement(name = "VbtypN", required = true)
    protected String vbtypN;
    @XmlElement(name = "Matnr", required = true)
    protected String matnr;
    @XmlElement(name = "Charg", required = true)
    protected String charg;
    @XmlElement(name = "Werks", required = true)
    protected String werks;
    @XmlElement(name = "Taqui", required = true)
    protected String taqui;
    @XmlElement(name = "Kzntg", required = true)
    protected String kzntg;
    @XmlElement(name = "Kzbrg", required = true)
    protected String kzbrg;
    @XmlElement(name = "Kzvol", required = true)
    protected String kzvol;
    @XmlElement(name = "Lianp", required = true)
    protected String lianp;
    @XmlElement(name = "LipsDel", required = true)
    protected String lipsDel;
    @XmlElement(name = "Insmk", required = true)
    protected String insmk;
    @XmlElement(name = "Bestq", required = true)
    protected String bestq;
    @XmlElement(name = "Kzpod", required = true)
    protected String kzpod;
    @XmlElement(name = "Ndifm", required = true)
    protected BigDecimal ndifm;
    @XmlElement(name = "Orpos", required = true)
    protected String orpos;
    @XmlElement(name = "Pikmg", required = true)
    protected BigDecimal pikmg;
    @XmlElement(name = "Sobkz", required = true)
    protected String sobkz;
    @XmlElement(name = "Sonum", required = true)
    protected String sonum;
    @XmlElement(name = "Kzbef", required = true)
    protected String kzbef;
    @XmlElement(name = "Plmin", required = true)
    protected String plmin;
    @XmlElement(name = "ForceOrposReduction", required = true)
    protected String forceOrposReduction;
    @XmlElement(name = "Lfimg", required = true)
    protected BigDecimal lfimg;
    @XmlElement(name = "Lgmng", required = true)
    protected BigDecimal lgmng;
    @XmlElement(name = "LfimgFlo")
    protected float lfimgFlo;
    @XmlElement(name = "LgmngFlo")
    protected float lgmngFlo;
    @XmlElement(name = "Umvkz", required = true)
    protected BigDecimal umvkz;
    @XmlElement(name = "Umvkn", required = true)
    protected BigDecimal umvkn;
    @XmlElement(name = "Umrev")
    protected float umrev;
    @XmlElement(name = "Akmng", required = true)
    protected String akmng;
    @XmlElement(name = "Vrkme", required = true)
    protected String vrkme;
    @XmlElement(name = "Meins", required = true)
    protected String meins;
    @XmlElement(name = "Kzfme", required = true)
    protected String kzfme;
    @XmlElement(name = "Brgew", required = true)
    protected BigDecimal brgew;
    @XmlElement(name = "Ntgew", required = true)
    protected BigDecimal ntgew;
    @XmlElement(name = "Gewei", required = true)
    protected String gewei;
    @XmlElement(name = "Volum", required = true)
    protected BigDecimal volum;
    @XmlElement(name = "Voleh", required = true)
    protected String voleh;
    @XmlElement(name = "Lgpla", required = true)
    protected String lgpla;
    @XmlElement(name = "Lgtyp", required = true)
    protected String lgtyp;
    @XmlElement(name = "Bwlvs", required = true)
    protected String bwlvs;
    @XmlElement(name = "Xwmpp", required = true)
    protected String xwmpp;
    @XmlElement(name = "Vfdat", required = true)
    protected String vfdat;
    @XmlElement(name = "Kzvfdat", required = true)
    protected String kzvfdat;
    @XmlElement(name = "EbumgBme", required = true)
    protected BigDecimal ebumgBme;
    @XmlElement(name = "WmsRfbel", required = true)
    protected String wmsRfbel;
    @XmlElement(name = "WmsRfpos", required = true)
    protected String wmsRfpos;
    @XmlElement(name = "Hsdat", required = true)
    protected String hsdat;
    @XmlElement(name = "Kzhsdat", required = true)
    protected String kzhsdat;
    @XmlElement(name = "SpeDiffPostIndicator", required = true)
    protected String speDiffPostIndicator;
    @XmlElement(name = "SpeExceptCode", required = true)
    protected String speExceptCode;
    @XmlElement(name = "SpeAuthNumber", required = true)
    protected String speAuthNumber;
    @XmlElement(name = "SpeRetQtyPost", required = true)
    protected BigDecimal speRetQtyPost;
    @XmlElement(name = "SpeBaseUom", required = true)
    protected String speBaseUom;
    @XmlElement(name = "SpeAuthComplet", required = true)
    protected String speAuthComplet;
    @XmlElement(name = "SpeAuthCompletF", required = true)
    protected String speAuthCompletF;
    @XmlElement(name = "SpeRetClosingIndicator", required = true)
    protected String speRetClosingIndicator;
    @XmlElement(name = "SpeExpDateExtB", required = true)
    protected BigDecimal speExpDateExtB;
    @XmlElement(name = "SpeExpDateExt", required = true)
    protected BigDecimal speExpDateExt;
    @XmlElement(name = "SpeMdiffInsmk", required = true)
    protected String speMdiffInsmk;
    @XmlElement(name = "SpeImwrkItm", required = true)
    protected String speImwrkItm;
    @XmlElement(name = "SpeImwrkItmF", required = true)
    protected String speImwrkItmF;
    @XmlElement(name = "SpeOrigSys", required = true)
    protected String speOrigSys;
    @XmlElement(name = "SpeCumVend", required = true)
    protected BigDecimal speCumVend;
    @XmlElement(name = "SpeCumItqs", required = true)
    protected BigDecimal speCumItqs;
    @XmlElement(name = "SpeCumSa", required = true)
    protected BigDecimal speCumSa;
    @XmlElement(name = "SpeLifexpos2", required = true)
    protected String speLifexpos2;
    @XmlElement(name = "SpeVersion", required = true)
    protected String speVersion;
    @XmlElement(name = "SpeDlvQtyFrom", required = true)
    protected BigDecimal speDlvQtyFrom;
    @XmlElement(name = "SpeInmskF", required = true)
    protected String speInmskF;
    @XmlElement(name = "SpeLifexpos2F", required = true)
    protected String speLifexpos2F;
    @XmlElement(name = "SpeInbItmUpd", required = true)
    protected String speInbItmUpd;
    @XmlElement(name = "Arktx", required = true)
    protected String arktx;
    @XmlElement(name = "Lgbzo", required = true)
    protected String lgbzo;
    @XmlElement(name = "Lgort", required = true)
    protected String lgort;
    @XmlElement(name = "Kzlgo", required = true)
    protected String kzlgo;
    @XmlElement(name = "Lifexpos", required = true)
    protected String lifexpos;
    @XmlElement(name = "Kzlxp", required = true)
    protected String kzlxp;
    @XmlElement(name = "Bwtar", required = true)
    protected String bwtar;
    @XmlElement(name = "Kzbwt", required = true)
    protected String kzbwt;
    @XmlElement(name = "Mfrgr", required = true)
    protected String mfrgr;
    @XmlElement(name = "Ean11", required = true)
    protected String ean11;
    @XmlElement(name = "Idnlf", required = true)
    protected String idnlf;
    @XmlElement(name = "Lichn", required = true)
    protected String lichn;
    @XmlElement(name = "Abrvw", required = true)
    protected String abrvw;
    @XmlElement(name = "Kztxt", required = true)
    protected String kztxt;
    @XmlElement(name = "TxtoldDelAllLang", required = true)
    protected String txtoldDelAllLang;
    @XmlElement(name = "MdiffBwart", required = true)
    protected String mdiffBwart;
    @XmlElement(name = "MdiffGrund", required = true)
    protected String mdiffGrund;
    @XmlElement(name = "MdiffLgort", required = true)
    protected String mdiffLgort;
    @XmlElement(name = "MdiffAutoSplit", required = true)
    protected String mdiffAutoSplit;
    @XmlElement(name = "SpeMdnumEwm", required = true)
    protected String speMdnumEwm;
    @XmlElement(name = "SpeMditmEwm", required = true)
    protected String speMditmEwm;
    @XmlElement(name = "SpeOmdnumEwm", required = true)
    protected String speOmdnumEwm;
    @XmlElement(name = "SpeOmditmEwm", required = true)
    protected String speOmditmEwm;
    @XmlElement(name = "Ormng", required = true)
    protected BigDecimal ormng;
    @XmlElement(name = "SpeGtsStockType", required = true)
    protected String speGtsStockType;
    @XmlElement(name = "SpeLieffz", required = true)
    protected BigDecimal speLieffz;
    @XmlElement(name = "SpeApoQntyfac", required = true)
    protected BigDecimal speApoQntyfac;
    @XmlElement(name = "SpeApoQntydiv", required = true)
    protected BigDecimal speApoQntydiv;
    @XmlElement(name = "SpePickDenial", required = true)
    protected String spePickDenial;
    @XmlElement(name = "SernrDel", required = true)
    protected String sernrDel;
    @XmlElement(name = "FlagDocub", required = true)
    protected String flagDocub;
    @XmlElement(name = "SpeXnocon", required = true)
    protected String speXnocon;
    @XmlElement(name = "SpeEbumg", required = true)
    protected BigDecimal speEbumg;
    @XmlElement(name = "Bwart", required = true)
    protected String bwart;
    @XmlElement(name = "SpeForceOrmngUpdate", required = true)
    protected String speForceOrmngUpdate;
    @XmlElement(name = "InspDocGuid", required = true)
    protected byte[] inspDocGuid;

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
     * posnrVl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosnrVl() {
        return posnrVl;
    }

    /**
     * posnrVl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosnrVl(String value) {
        this.posnrVl = value;
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
     * posnn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosnn() {
        return posnn;
    }

    /**
     * posnn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosnn(String value) {
        this.posnn = value;
    }

    /**
     * vbtypN 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVbtypN() {
        return vbtypN;
    }

    /**
     * vbtypN 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVbtypN(String value) {
        this.vbtypN = value;
    }

    /**
     * matnr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatnr() {
        return matnr;
    }

    /**
     * matnr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatnr(String value) {
        this.matnr = value;
    }

    /**
     * charg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharg() {
        return charg;
    }

    /**
     * charg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharg(String value) {
        this.charg = value;
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
     * taqui 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaqui() {
        return taqui;
    }

    /**
     * taqui 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaqui(String value) {
        this.taqui = value;
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
     * lianp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLianp() {
        return lianp;
    }

    /**
     * lianp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLianp(String value) {
        this.lianp = value;
    }

    /**
     * lipsDel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLipsDel() {
        return lipsDel;
    }

    /**
     * lipsDel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLipsDel(String value) {
        this.lipsDel = value;
    }

    /**
     * insmk 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsmk() {
        return insmk;
    }

    /**
     * insmk 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsmk(String value) {
        this.insmk = value;
    }

    /**
     * bestq 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBestq() {
        return bestq;
    }

    /**
     * bestq 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBestq(String value) {
        this.bestq = value;
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
     * ndifm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNdifm() {
        return ndifm;
    }

    /**
     * ndifm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNdifm(BigDecimal value) {
        this.ndifm = value;
    }

    /**
     * orpos 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrpos() {
        return orpos;
    }

    /**
     * orpos 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrpos(String value) {
        this.orpos = value;
    }

    /**
     * pikmg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPikmg() {
        return pikmg;
    }

    /**
     * pikmg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPikmg(BigDecimal value) {
        this.pikmg = value;
    }

    /**
     * sobkz 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSobkz() {
        return sobkz;
    }

    /**
     * sobkz 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSobkz(String value) {
        this.sobkz = value;
    }

    /**
     * sonum 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSonum() {
        return sonum;
    }

    /**
     * sonum 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonum(String value) {
        this.sonum = value;
    }

    /**
     * kzbef 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzbef() {
        return kzbef;
    }

    /**
     * kzbef 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzbef(String value) {
        this.kzbef = value;
    }

    /**
     * plmin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlmin() {
        return plmin;
    }

    /**
     * plmin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlmin(String value) {
        this.plmin = value;
    }

    /**
     * forceOrposReduction 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForceOrposReduction() {
        return forceOrposReduction;
    }

    /**
     * forceOrposReduction 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForceOrposReduction(String value) {
        this.forceOrposReduction = value;
    }

    /**
     * lfimg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLfimg() {
        return lfimg;
    }

    /**
     * lfimg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLfimg(BigDecimal value) {
        this.lfimg = value;
    }

    /**
     * lgmng 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLgmng() {
        return lgmng;
    }

    /**
     * lgmng 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLgmng(BigDecimal value) {
        this.lgmng = value;
    }

    /**
     * lfimgFlo 속성의 값을 가져옵니다.
     * 
     */
    public float getLfimgFlo() {
        return lfimgFlo;
    }

    /**
     * lfimgFlo 속성의 값을 설정합니다.
     * 
     */
    public void setLfimgFlo(float value) {
        this.lfimgFlo = value;
    }

    /**
     * lgmngFlo 속성의 값을 가져옵니다.
     * 
     */
    public float getLgmngFlo() {
        return lgmngFlo;
    }

    /**
     * lgmngFlo 속성의 값을 설정합니다.
     * 
     */
    public void setLgmngFlo(float value) {
        this.lgmngFlo = value;
    }

    /**
     * umvkz 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUmvkz() {
        return umvkz;
    }

    /**
     * umvkz 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUmvkz(BigDecimal value) {
        this.umvkz = value;
    }

    /**
     * umvkn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUmvkn() {
        return umvkn;
    }

    /**
     * umvkn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUmvkn(BigDecimal value) {
        this.umvkn = value;
    }

    /**
     * umrev 속성의 값을 가져옵니다.
     * 
     */
    public float getUmrev() {
        return umrev;
    }

    /**
     * umrev 속성의 값을 설정합니다.
     * 
     */
    public void setUmrev(float value) {
        this.umrev = value;
    }

    /**
     * akmng 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAkmng() {
        return akmng;
    }

    /**
     * akmng 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAkmng(String value) {
        this.akmng = value;
    }

    /**
     * vrkme 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrkme() {
        return vrkme;
    }

    /**
     * vrkme 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrkme(String value) {
        this.vrkme = value;
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
     * kzfme 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzfme() {
        return kzfme;
    }

    /**
     * kzfme 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzfme(String value) {
        this.kzfme = value;
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
     * lgpla 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgpla() {
        return lgpla;
    }

    /**
     * lgpla 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgpla(String value) {
        this.lgpla = value;
    }

    /**
     * lgtyp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgtyp() {
        return lgtyp;
    }

    /**
     * lgtyp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgtyp(String value) {
        this.lgtyp = value;
    }

    /**
     * bwlvs 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBwlvs() {
        return bwlvs;
    }

    /**
     * bwlvs 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBwlvs(String value) {
        this.bwlvs = value;
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
     * vfdat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVfdat() {
        return vfdat;
    }

    /**
     * vfdat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVfdat(String value) {
        this.vfdat = value;
    }

    /**
     * kzvfdat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzvfdat() {
        return kzvfdat;
    }

    /**
     * kzvfdat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzvfdat(String value) {
        this.kzvfdat = value;
    }

    /**
     * ebumgBme 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEbumgBme() {
        return ebumgBme;
    }

    /**
     * ebumgBme 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEbumgBme(BigDecimal value) {
        this.ebumgBme = value;
    }

    /**
     * wmsRfbel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWmsRfbel() {
        return wmsRfbel;
    }

    /**
     * wmsRfbel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWmsRfbel(String value) {
        this.wmsRfbel = value;
    }

    /**
     * wmsRfpos 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWmsRfpos() {
        return wmsRfpos;
    }

    /**
     * wmsRfpos 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWmsRfpos(String value) {
        this.wmsRfpos = value;
    }

    /**
     * hsdat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHsdat() {
        return hsdat;
    }

    /**
     * hsdat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHsdat(String value) {
        this.hsdat = value;
    }

    /**
     * kzhsdat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzhsdat() {
        return kzhsdat;
    }

    /**
     * kzhsdat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzhsdat(String value) {
        this.kzhsdat = value;
    }

    /**
     * speDiffPostIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeDiffPostIndicator() {
        return speDiffPostIndicator;
    }

    /**
     * speDiffPostIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeDiffPostIndicator(String value) {
        this.speDiffPostIndicator = value;
    }

    /**
     * speExceptCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeExceptCode() {
        return speExceptCode;
    }

    /**
     * speExceptCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeExceptCode(String value) {
        this.speExceptCode = value;
    }

    /**
     * speAuthNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeAuthNumber() {
        return speAuthNumber;
    }

    /**
     * speAuthNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeAuthNumber(String value) {
        this.speAuthNumber = value;
    }

    /**
     * speRetQtyPost 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpeRetQtyPost() {
        return speRetQtyPost;
    }

    /**
     * speRetQtyPost 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpeRetQtyPost(BigDecimal value) {
        this.speRetQtyPost = value;
    }

    /**
     * speBaseUom 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeBaseUom() {
        return speBaseUom;
    }

    /**
     * speBaseUom 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeBaseUom(String value) {
        this.speBaseUom = value;
    }

    /**
     * speAuthComplet 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeAuthComplet() {
        return speAuthComplet;
    }

    /**
     * speAuthComplet 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeAuthComplet(String value) {
        this.speAuthComplet = value;
    }

    /**
     * speAuthCompletF 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeAuthCompletF() {
        return speAuthCompletF;
    }

    /**
     * speAuthCompletF 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeAuthCompletF(String value) {
        this.speAuthCompletF = value;
    }

    /**
     * speRetClosingIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeRetClosingIndicator() {
        return speRetClosingIndicator;
    }

    /**
     * speRetClosingIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeRetClosingIndicator(String value) {
        this.speRetClosingIndicator = value;
    }

    /**
     * speExpDateExtB 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpeExpDateExtB() {
        return speExpDateExtB;
    }

    /**
     * speExpDateExtB 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpeExpDateExtB(BigDecimal value) {
        this.speExpDateExtB = value;
    }

    /**
     * speExpDateExt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpeExpDateExt() {
        return speExpDateExt;
    }

    /**
     * speExpDateExt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpeExpDateExt(BigDecimal value) {
        this.speExpDateExt = value;
    }

    /**
     * speMdiffInsmk 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeMdiffInsmk() {
        return speMdiffInsmk;
    }

    /**
     * speMdiffInsmk 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeMdiffInsmk(String value) {
        this.speMdiffInsmk = value;
    }

    /**
     * speImwrkItm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeImwrkItm() {
        return speImwrkItm;
    }

    /**
     * speImwrkItm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeImwrkItm(String value) {
        this.speImwrkItm = value;
    }

    /**
     * speImwrkItmF 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeImwrkItmF() {
        return speImwrkItmF;
    }

    /**
     * speImwrkItmF 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeImwrkItmF(String value) {
        this.speImwrkItmF = value;
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
     * speCumVend 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpeCumVend() {
        return speCumVend;
    }

    /**
     * speCumVend 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpeCumVend(BigDecimal value) {
        this.speCumVend = value;
    }

    /**
     * speCumItqs 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpeCumItqs() {
        return speCumItqs;
    }

    /**
     * speCumItqs 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpeCumItqs(BigDecimal value) {
        this.speCumItqs = value;
    }

    /**
     * speCumSa 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpeCumSa() {
        return speCumSa;
    }

    /**
     * speCumSa 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpeCumSa(BigDecimal value) {
        this.speCumSa = value;
    }

    /**
     * speLifexpos2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeLifexpos2() {
        return speLifexpos2;
    }

    /**
     * speLifexpos2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeLifexpos2(String value) {
        this.speLifexpos2 = value;
    }

    /**
     * speVersion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeVersion() {
        return speVersion;
    }

    /**
     * speVersion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeVersion(String value) {
        this.speVersion = value;
    }

    /**
     * speDlvQtyFrom 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpeDlvQtyFrom() {
        return speDlvQtyFrom;
    }

    /**
     * speDlvQtyFrom 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpeDlvQtyFrom(BigDecimal value) {
        this.speDlvQtyFrom = value;
    }

    /**
     * speInmskF 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeInmskF() {
        return speInmskF;
    }

    /**
     * speInmskF 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeInmskF(String value) {
        this.speInmskF = value;
    }

    /**
     * speLifexpos2F 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeLifexpos2F() {
        return speLifexpos2F;
    }

    /**
     * speLifexpos2F 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeLifexpos2F(String value) {
        this.speLifexpos2F = value;
    }

    /**
     * speInbItmUpd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeInbItmUpd() {
        return speInbItmUpd;
    }

    /**
     * speInbItmUpd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeInbItmUpd(String value) {
        this.speInbItmUpd = value;
    }

    /**
     * arktx 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArktx() {
        return arktx;
    }

    /**
     * arktx 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArktx(String value) {
        this.arktx = value;
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
     * kzlgo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzlgo() {
        return kzlgo;
    }

    /**
     * kzlgo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzlgo(String value) {
        this.kzlgo = value;
    }

    /**
     * lifexpos 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifexpos() {
        return lifexpos;
    }

    /**
     * lifexpos 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifexpos(String value) {
        this.lifexpos = value;
    }

    /**
     * kzlxp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzlxp() {
        return kzlxp;
    }

    /**
     * kzlxp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzlxp(String value) {
        this.kzlxp = value;
    }

    /**
     * bwtar 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBwtar() {
        return bwtar;
    }

    /**
     * bwtar 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBwtar(String value) {
        this.bwtar = value;
    }

    /**
     * kzbwt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzbwt() {
        return kzbwt;
    }

    /**
     * kzbwt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzbwt(String value) {
        this.kzbwt = value;
    }

    /**
     * mfrgr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfrgr() {
        return mfrgr;
    }

    /**
     * mfrgr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfrgr(String value) {
        this.mfrgr = value;
    }

    /**
     * ean11 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEan11() {
        return ean11;
    }

    /**
     * ean11 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEan11(String value) {
        this.ean11 = value;
    }

    /**
     * idnlf 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdnlf() {
        return idnlf;
    }

    /**
     * idnlf 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdnlf(String value) {
        this.idnlf = value;
    }

    /**
     * lichn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLichn() {
        return lichn;
    }

    /**
     * lichn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLichn(String value) {
        this.lichn = value;
    }

    /**
     * abrvw 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbrvw() {
        return abrvw;
    }

    /**
     * abrvw 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbrvw(String value) {
        this.abrvw = value;
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
     * mdiffBwart 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdiffBwart() {
        return mdiffBwart;
    }

    /**
     * mdiffBwart 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdiffBwart(String value) {
        this.mdiffBwart = value;
    }

    /**
     * mdiffGrund 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdiffGrund() {
        return mdiffGrund;
    }

    /**
     * mdiffGrund 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdiffGrund(String value) {
        this.mdiffGrund = value;
    }

    /**
     * mdiffLgort 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdiffLgort() {
        return mdiffLgort;
    }

    /**
     * mdiffLgort 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdiffLgort(String value) {
        this.mdiffLgort = value;
    }

    /**
     * mdiffAutoSplit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdiffAutoSplit() {
        return mdiffAutoSplit;
    }

    /**
     * mdiffAutoSplit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdiffAutoSplit(String value) {
        this.mdiffAutoSplit = value;
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
     * speMditmEwm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeMditmEwm() {
        return speMditmEwm;
    }

    /**
     * speMditmEwm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeMditmEwm(String value) {
        this.speMditmEwm = value;
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
     * speOmditmEwm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeOmditmEwm() {
        return speOmditmEwm;
    }

    /**
     * speOmditmEwm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeOmditmEwm(String value) {
        this.speOmditmEwm = value;
    }

    /**
     * ormng 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrmng() {
        return ormng;
    }

    /**
     * ormng 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrmng(BigDecimal value) {
        this.ormng = value;
    }

    /**
     * speGtsStockType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeGtsStockType() {
        return speGtsStockType;
    }

    /**
     * speGtsStockType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeGtsStockType(String value) {
        this.speGtsStockType = value;
    }

    /**
     * speLieffz 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpeLieffz() {
        return speLieffz;
    }

    /**
     * speLieffz 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpeLieffz(BigDecimal value) {
        this.speLieffz = value;
    }

    /**
     * speApoQntyfac 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpeApoQntyfac() {
        return speApoQntyfac;
    }

    /**
     * speApoQntyfac 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpeApoQntyfac(BigDecimal value) {
        this.speApoQntyfac = value;
    }

    /**
     * speApoQntydiv 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpeApoQntydiv() {
        return speApoQntydiv;
    }

    /**
     * speApoQntydiv 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpeApoQntydiv(BigDecimal value) {
        this.speApoQntydiv = value;
    }

    /**
     * spePickDenial 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpePickDenial() {
        return spePickDenial;
    }

    /**
     * spePickDenial 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpePickDenial(String value) {
        this.spePickDenial = value;
    }

    /**
     * sernrDel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSernrDel() {
        return sernrDel;
    }

    /**
     * sernrDel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSernrDel(String value) {
        this.sernrDel = value;
    }

    /**
     * flagDocub 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagDocub() {
        return flagDocub;
    }

    /**
     * flagDocub 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagDocub(String value) {
        this.flagDocub = value;
    }

    /**
     * speXnocon 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeXnocon() {
        return speXnocon;
    }

    /**
     * speXnocon 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeXnocon(String value) {
        this.speXnocon = value;
    }

    /**
     * speEbumg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpeEbumg() {
        return speEbumg;
    }

    /**
     * speEbumg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpeEbumg(BigDecimal value) {
        this.speEbumg = value;
    }

    /**
     * bwart 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBwart() {
        return bwart;
    }

    /**
     * bwart 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBwart(String value) {
        this.bwart = value;
    }

    /**
     * speForceOrmngUpdate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeForceOrmngUpdate() {
        return speForceOrmngUpdate;
    }

    /**
     * speForceOrmngUpdate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeForceOrmngUpdate(String value) {
        this.speForceOrmngUpdate = value;
    }

    /**
     * inspDocGuid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getInspDocGuid() {
        return inspDocGuid;
    }

    /**
     * inspDocGuid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setInspDocGuid(byte[] value) {
        this.inspDocGuid = value;
    }

}
