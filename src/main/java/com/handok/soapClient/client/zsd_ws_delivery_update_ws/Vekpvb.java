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
 * <p>Vekpvb complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Vekpvb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mandt" type="{urn:sap-com:document:sap:rfc:functions}clnt3"/&gt;
 *         &lt;element name="Venum" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
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
 *         &lt;element name="Anzgl" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Ernam" type="{urn:sap-com:document:sap:rfc:functions}char12"/&gt;
 *         &lt;element name="Erdat" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Eruhr" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="Aenam" type="{urn:sap-com:document:sap:rfc:functions}char12"/&gt;
 *         &lt;element name="Aedat" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Aezet" type="{urn:sap-com:document:sap:rfc:functions}time"/&gt;
 *         &lt;element name="Sortl" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
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
 *         &lt;element name="Meins" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="VolehMax" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="GeweiMax" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="VbelnGen" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="PosnrGen" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="Inhalt" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="Vhart" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Kappl" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Kalsm" type="{urn:sap-com:document:sap:rfc:functions}char6"/&gt;
 *         &lt;element name="Kschl" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Magrv" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Werks" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Pstyv" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Vkorg" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Vtweg" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Ladlg" type="{urn:sap-com:document:sap:rfc:functions}quantum6.0"/&gt;
 *         &lt;element name="Ladeh" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="Farzt" type="{urn:sap-com:document:sap:rfc:functions}quantum3.0"/&gt;
 *         &lt;element name="Fareh" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="Entfe" type="{urn:sap-com:document:sap:rfc:functions}quantum6.0"/&gt;
 *         &lt;element name="Ehent" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="Lgort" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Gewfx" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Veltp" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Exidv2" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="Landt" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Landf" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Namef" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="Nambe" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="VhilmKu" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="Vpobj" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Vpobjkey" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="Handle" type="{urn:sap-com:document:sap:rfc:functions}char22"/&gt;
 *         &lt;element name="Wmsta" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Lgnum" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Saprl" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Kzgvh" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="AdgeDg" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="AdgeDgpr" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Uevel" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Packvorschr" type="{urn:sap-com:document:sap:rfc:functions}char22"/&gt;
 *         &lt;element name="PackvorschrSt" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Labeltyp" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ZulAufl" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/&gt;
 *         &lt;element name="Status" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="HuLgort" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="HuSystem" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeHdall" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeVlstk" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpeDeldec" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
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
 *         &lt;element name="Epc1" type="{urn:sap-com:document:sap:rfc:functions}char96"/&gt;
 *         &lt;element name="Epc2" type="{urn:sap-com:document:sap:rfc:functions}char96"/&gt;
 *         &lt;element name="PackageCat" type="{urn:sap-com:document:sap:rfc:functions}char15"/&gt;
 *         &lt;element name="TranspIndex" type="{urn:sap-com:document:sap:rfc:functions}decimal7.2"/&gt;
 *         &lt;element name="CritSafIndex" type="{urn:sap-com:document:sap:rfc:functions}decimal7.2"/&gt;
 *         &lt;element name="FlgDgPackage" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="DgPackageLevel" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Packcode" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="InstrEnclCat" type="{urn:sap-com:document:sap:rfc:functions}char15"/&gt;
 *         &lt;element name="MatDamagedCl7" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="DoseRateBulk" type="{urn:sap-com:document:sap:rfc:functions}quantum9.5"/&gt;
 *         &lt;element name="DoseRateBulkU" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="DoseRatePack" type="{urn:sap-com:document:sap:rfc:functions}quantum9.5"/&gt;
 *         &lt;element name="UDoseRatePack" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="LeadingLwdg" type="{urn:sap-com:document:sap:rfc:functions}char12"/&gt;
 *         &lt;element name="MaxGrossWeight" type="{urn:sap-com:document:sap:rfc:functions}quantum8.2"/&gt;
 *         &lt;element name="UMaxGrossWght" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="Lyard" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Ylccl" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Yloct" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Stats" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Prrty" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Fwagn" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Scacd" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Owner" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Trnpd" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="Sealn1" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Sealn2" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Sealn3" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Sealn4" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Sealn5" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Blind" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Rsncd" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Rftyp" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Refer" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Ptmst" type="{urn:sap-com:document:sap:rfc:functions}decimal15.0"/&gt;
 *         &lt;element name="Atmst" type="{urn:sap-com:document:sap:rfc:functions}decimal15.0"/&gt;
 *         &lt;element name="Ydoor" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Ystga" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Urgfl" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Prflg" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Slflg" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Signi" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="Ltext" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="Updkz" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Kztra" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Vebez" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="Sortf" type="{urn:sap-com:document:sap:rfc:functions}numeric4"/&gt;
 *         &lt;element name="Aendb" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="AendbWv" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="AendbQuan" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="AendbStatus" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Kzunt" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Kzobe" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Frgew" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/&gt;
 *         &lt;element name="GeweiFr" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="Frvol" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/&gt;
 *         &lt;element name="VolehFr" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="Kzpgn" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Werfd" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Selkz" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="LeLgpla" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="LeLgtyp" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="WmVerw" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Mtpos" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="DestLgnum" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="DestLgtyp" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="DestLgpla" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Objnr" type="{urn:sap-com:document:sap:rfc:functions}char22"/&gt;
 *         &lt;element name="Kunnr" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Liefnr" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Taravar" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Stsma" type="{urn:sap-com:document:sap:rfc:functions}char8"/&gt;
 *         &lt;element name="Histu" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Activity" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Object" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="HuStatusInit" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Logsys" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="HuLocked" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="LetypWm" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="TopHuDlvry" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Kzebu" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Vwpos" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="OldExidv" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vekpvb", propOrder = {
    "mandt",
    "venum",
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
    "anzgl",
    "ernam",
    "erdat",
    "eruhr",
    "aenam",
    "aedat",
    "aezet",
    "sortl",
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
    "meins",
    "volehMax",
    "geweiMax",
    "vbelnGen",
    "posnrGen",
    "inhalt",
    "vhart",
    "kappl",
    "kalsm",
    "kschl",
    "magrv",
    "werks",
    "pstyv",
    "vkorg",
    "vtweg",
    "ladlg",
    "ladeh",
    "farzt",
    "fareh",
    "entfe",
    "ehent",
    "lgort",
    "gewfx",
    "veltp",
    "exidv2",
    "landt",
    "landf",
    "namef",
    "nambe",
    "vhilmKu",
    "vpobj",
    "vpobjkey",
    "handle",
    "wmsta",
    "lgnum",
    "saprl",
    "kzgvh",
    "adgeDg",
    "adgeDgpr",
    "uevel",
    "packvorschr",
    "packvorschrSt",
    "labeltyp",
    "zulAufl",
    "status",
    "huLgort",
    "huSystem",
    "speHdall",
    "speVlstk",
    "speDeldec",
    "speIdart01",
    "speIdent01",
    "speIdart02",
    "speIdent02",
    "speIdart03",
    "speIdent03",
    "speIdart04",
    "speIdent04",
    "speLogpos",
    "speChkCounter",
    "epc1",
    "epc2",
    "packageCat",
    "transpIndex",
    "critSafIndex",
    "flgDgPackage",
    "dgPackageLevel",
    "packcode",
    "instrEnclCat",
    "matDamagedCl7",
    "doseRateBulk",
    "doseRateBulkU",
    "doseRatePack",
    "uDoseRatePack",
    "leadingLwdg",
    "maxGrossWeight",
    "uMaxGrossWght",
    "lyard",
    "ylccl",
    "yloct",
    "stats",
    "prrty",
    "fwagn",
    "scacd",
    "owner",
    "trnpd",
    "sealn1",
    "sealn2",
    "sealn3",
    "sealn4",
    "sealn5",
    "blind",
    "rsncd",
    "rftyp",
    "refer",
    "ptmst",
    "atmst",
    "ydoor",
    "ystga",
    "urgfl",
    "prflg",
    "slflg",
    "signi",
    "ltext",
    "updkz",
    "kztra",
    "vebez",
    "sortf",
    "aendb",
    "aendbWv",
    "aendbQuan",
    "aendbStatus",
    "kzunt",
    "kzobe",
    "frgew",
    "geweiFr",
    "frvol",
    "volehFr",
    "kzpgn",
    "werfd",
    "selkz",
    "leLgpla",
    "leLgtyp",
    "wmVerw",
    "mtpos",
    "destLgnum",
    "destLgtyp",
    "destLgpla",
    "objnr",
    "kunnr",
    "liefnr",
    "taravar",
    "stsma",
    "histu",
    "activity",
    "object",
    "huStatusInit",
    "logsys",
    "huLocked",
    "letypWm",
    "topHuDlvry",
    "kzebu",
    "vwpos",
    "oldExidv"
})
public class Vekpvb {

    @XmlElement(name = "Mandt", required = true)
    protected String mandt;
    @XmlElement(name = "Venum", required = true)
    protected String venum;
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
    @XmlElement(name = "Anzgl")
    protected int anzgl;
    @XmlElement(name = "Ernam", required = true)
    protected String ernam;
    @XmlElement(name = "Erdat", required = true)
    protected String erdat;
    @XmlElement(name = "Eruhr", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar eruhr;
    @XmlElement(name = "Aenam", required = true)
    protected String aenam;
    @XmlElement(name = "Aedat", required = true)
    protected String aedat;
    @XmlElement(name = "Aezet", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar aezet;
    @XmlElement(name = "Sortl", required = true)
    protected String sortl;
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
    @XmlElement(name = "Meins", required = true)
    protected String meins;
    @XmlElement(name = "VolehMax", required = true)
    protected String volehMax;
    @XmlElement(name = "GeweiMax", required = true)
    protected String geweiMax;
    @XmlElement(name = "VbelnGen", required = true)
    protected String vbelnGen;
    @XmlElement(name = "PosnrGen", required = true)
    protected String posnrGen;
    @XmlElement(name = "Inhalt", required = true)
    protected String inhalt;
    @XmlElement(name = "Vhart", required = true)
    protected String vhart;
    @XmlElement(name = "Kappl", required = true)
    protected String kappl;
    @XmlElement(name = "Kalsm", required = true)
    protected String kalsm;
    @XmlElement(name = "Kschl", required = true)
    protected String kschl;
    @XmlElement(name = "Magrv", required = true)
    protected String magrv;
    @XmlElement(name = "Werks", required = true)
    protected String werks;
    @XmlElement(name = "Pstyv", required = true)
    protected String pstyv;
    @XmlElement(name = "Vkorg", required = true)
    protected String vkorg;
    @XmlElement(name = "Vtweg", required = true)
    protected String vtweg;
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
    @XmlElement(name = "Lgort", required = true)
    protected String lgort;
    @XmlElement(name = "Gewfx", required = true)
    protected String gewfx;
    @XmlElement(name = "Veltp", required = true)
    protected String veltp;
    @XmlElement(name = "Exidv2", required = true)
    protected String exidv2;
    @XmlElement(name = "Landt", required = true)
    protected String landt;
    @XmlElement(name = "Landf", required = true)
    protected String landf;
    @XmlElement(name = "Namef", required = true)
    protected String namef;
    @XmlElement(name = "Nambe", required = true)
    protected String nambe;
    @XmlElement(name = "VhilmKu", required = true)
    protected String vhilmKu;
    @XmlElement(name = "Vpobj", required = true)
    protected String vpobj;
    @XmlElement(name = "Vpobjkey", required = true)
    protected String vpobjkey;
    @XmlElement(name = "Handle", required = true)
    protected String handle;
    @XmlElement(name = "Wmsta", required = true)
    protected String wmsta;
    @XmlElement(name = "Lgnum", required = true)
    protected String lgnum;
    @XmlElement(name = "Saprl", required = true)
    protected String saprl;
    @XmlElement(name = "Kzgvh", required = true)
    protected String kzgvh;
    @XmlElement(name = "AdgeDg", required = true)
    protected String adgeDg;
    @XmlElement(name = "AdgeDgpr", required = true)
    protected String adgeDgpr;
    @XmlElement(name = "Uevel", required = true)
    protected String uevel;
    @XmlElement(name = "Packvorschr", required = true)
    protected String packvorschr;
    @XmlElement(name = "PackvorschrSt", required = true)
    protected String packvorschrSt;
    @XmlElement(name = "Labeltyp", required = true)
    protected String labeltyp;
    @XmlElement(name = "ZulAufl", required = true)
    protected BigDecimal zulAufl;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "HuLgort", required = true)
    protected String huLgort;
    @XmlElement(name = "HuSystem", required = true)
    protected String huSystem;
    @XmlElement(name = "SpeHdall", required = true)
    protected String speHdall;
    @XmlElement(name = "SpeVlstk", required = true)
    protected String speVlstk;
    @XmlElement(name = "SpeDeldec", required = true)
    protected String speDeldec;
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
    @XmlElement(name = "Epc1", required = true)
    protected String epc1;
    @XmlElement(name = "Epc2", required = true)
    protected String epc2;
    @XmlElement(name = "PackageCat", required = true)
    protected String packageCat;
    @XmlElement(name = "TranspIndex", required = true)
    protected BigDecimal transpIndex;
    @XmlElement(name = "CritSafIndex", required = true)
    protected BigDecimal critSafIndex;
    @XmlElement(name = "FlgDgPackage", required = true)
    protected String flgDgPackage;
    @XmlElement(name = "DgPackageLevel", required = true)
    protected String dgPackageLevel;
    @XmlElement(name = "Packcode", required = true)
    protected String packcode;
    @XmlElement(name = "InstrEnclCat", required = true)
    protected String instrEnclCat;
    @XmlElement(name = "MatDamagedCl7", required = true)
    protected String matDamagedCl7;
    @XmlElement(name = "DoseRateBulk", required = true)
    protected BigDecimal doseRateBulk;
    @XmlElement(name = "DoseRateBulkU", required = true)
    protected String doseRateBulkU;
    @XmlElement(name = "DoseRatePack", required = true)
    protected BigDecimal doseRatePack;
    @XmlElement(name = "UDoseRatePack", required = true)
    protected String uDoseRatePack;
    @XmlElement(name = "LeadingLwdg", required = true)
    protected String leadingLwdg;
    @XmlElement(name = "MaxGrossWeight", required = true)
    protected BigDecimal maxGrossWeight;
    @XmlElement(name = "UMaxGrossWght", required = true)
    protected String uMaxGrossWght;
    @XmlElement(name = "Lyard", required = true)
    protected String lyard;
    @XmlElement(name = "Ylccl", required = true)
    protected String ylccl;
    @XmlElement(name = "Yloct", required = true)
    protected String yloct;
    @XmlElement(name = "Stats", required = true)
    protected String stats;
    @XmlElement(name = "Prrty", required = true)
    protected String prrty;
    @XmlElement(name = "Fwagn", required = true)
    protected String fwagn;
    @XmlElement(name = "Scacd", required = true)
    protected String scacd;
    @XmlElement(name = "Owner", required = true)
    protected String owner;
    @XmlElement(name = "Trnpd", required = true)
    protected String trnpd;
    @XmlElement(name = "Sealn1", required = true)
    protected String sealn1;
    @XmlElement(name = "Sealn2", required = true)
    protected String sealn2;
    @XmlElement(name = "Sealn3", required = true)
    protected String sealn3;
    @XmlElement(name = "Sealn4", required = true)
    protected String sealn4;
    @XmlElement(name = "Sealn5", required = true)
    protected String sealn5;
    @XmlElement(name = "Blind", required = true)
    protected String blind;
    @XmlElement(name = "Rsncd", required = true)
    protected String rsncd;
    @XmlElement(name = "Rftyp", required = true)
    protected String rftyp;
    @XmlElement(name = "Refer", required = true)
    protected String refer;
    @XmlElement(name = "Ptmst", required = true)
    protected BigDecimal ptmst;
    @XmlElement(name = "Atmst", required = true)
    protected BigDecimal atmst;
    @XmlElement(name = "Ydoor", required = true)
    protected String ydoor;
    @XmlElement(name = "Ystga", required = true)
    protected String ystga;
    @XmlElement(name = "Urgfl", required = true)
    protected String urgfl;
    @XmlElement(name = "Prflg", required = true)
    protected String prflg;
    @XmlElement(name = "Slflg", required = true)
    protected String slflg;
    @XmlElement(name = "Signi", required = true)
    protected String signi;
    @XmlElement(name = "Ltext", required = true)
    protected String ltext;
    @XmlElement(name = "Updkz", required = true)
    protected String updkz;
    @XmlElement(name = "Kztra", required = true)
    protected String kztra;
    @XmlElement(name = "Vebez", required = true)
    protected String vebez;
    @XmlElement(name = "Sortf", required = true)
    protected String sortf;
    @XmlElement(name = "Aendb", required = true)
    protected String aendb;
    @XmlElement(name = "AendbWv", required = true)
    protected String aendbWv;
    @XmlElement(name = "AendbQuan", required = true)
    protected String aendbQuan;
    @XmlElement(name = "AendbStatus", required = true)
    protected String aendbStatus;
    @XmlElement(name = "Kzunt", required = true)
    protected String kzunt;
    @XmlElement(name = "Kzobe", required = true)
    protected String kzobe;
    @XmlElement(name = "Frgew", required = true)
    protected BigDecimal frgew;
    @XmlElement(name = "GeweiFr", required = true)
    protected String geweiFr;
    @XmlElement(name = "Frvol", required = true)
    protected BigDecimal frvol;
    @XmlElement(name = "VolehFr", required = true)
    protected String volehFr;
    @XmlElement(name = "Kzpgn", required = true)
    protected String kzpgn;
    @XmlElement(name = "Werfd", required = true)
    protected String werfd;
    @XmlElement(name = "Selkz", required = true)
    protected String selkz;
    @XmlElement(name = "LeLgpla", required = true)
    protected String leLgpla;
    @XmlElement(name = "LeLgtyp", required = true)
    protected String leLgtyp;
    @XmlElement(name = "WmVerw", required = true)
    protected String wmVerw;
    @XmlElement(name = "Mtpos", required = true)
    protected String mtpos;
    @XmlElement(name = "DestLgnum", required = true)
    protected String destLgnum;
    @XmlElement(name = "DestLgtyp", required = true)
    protected String destLgtyp;
    @XmlElement(name = "DestLgpla", required = true)
    protected String destLgpla;
    @XmlElement(name = "Objnr", required = true)
    protected String objnr;
    @XmlElement(name = "Kunnr", required = true)
    protected String kunnr;
    @XmlElement(name = "Liefnr", required = true)
    protected String liefnr;
    @XmlElement(name = "Taravar", required = true)
    protected String taravar;
    @XmlElement(name = "Stsma", required = true)
    protected String stsma;
    @XmlElement(name = "Histu")
    protected int histu;
    @XmlElement(name = "Activity", required = true)
    protected String activity;
    @XmlElement(name = "Object", required = true)
    protected String object;
    @XmlElement(name = "HuStatusInit", required = true)
    protected String huStatusInit;
    @XmlElement(name = "Logsys", required = true)
    protected String logsys;
    @XmlElement(name = "HuLocked", required = true)
    protected String huLocked;
    @XmlElement(name = "LetypWm", required = true)
    protected String letypWm;
    @XmlElement(name = "TopHuDlvry", required = true)
    protected String topHuDlvry;
    @XmlElement(name = "Kzebu", required = true)
    protected String kzebu;
    @XmlElement(name = "Vwpos", required = true)
    protected String vwpos;
    @XmlElement(name = "OldExidv", required = true)
    protected String oldExidv;

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
     * anzgl 속성의 값을 가져옵니다.
     * 
     */
    public int getAnzgl() {
        return anzgl;
    }

    /**
     * anzgl 속성의 값을 설정합니다.
     * 
     */
    public void setAnzgl(int value) {
        this.anzgl = value;
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
     * erdat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErdat() {
        return erdat;
    }

    /**
     * erdat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErdat(String value) {
        this.erdat = value;
    }

    /**
     * eruhr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEruhr() {
        return eruhr;
    }

    /**
     * eruhr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEruhr(XMLGregorianCalendar value) {
        this.eruhr = value;
    }

    /**
     * aenam 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAenam() {
        return aenam;
    }

    /**
     * aenam 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAenam(String value) {
        this.aenam = value;
    }

    /**
     * aedat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAedat() {
        return aedat;
    }

    /**
     * aedat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAedat(String value) {
        this.aedat = value;
    }

    /**
     * aezet 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAezet() {
        return aezet;
    }

    /**
     * aezet 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAezet(XMLGregorianCalendar value) {
        this.aezet = value;
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
     * vbelnGen 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVbelnGen() {
        return vbelnGen;
    }

    /**
     * vbelnGen 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVbelnGen(String value) {
        this.vbelnGen = value;
    }

    /**
     * posnrGen 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosnrGen() {
        return posnrGen;
    }

    /**
     * posnrGen 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosnrGen(String value) {
        this.posnrGen = value;
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
     * kappl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKappl() {
        return kappl;
    }

    /**
     * kappl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKappl(String value) {
        this.kappl = value;
    }

    /**
     * kalsm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKalsm() {
        return kalsm;
    }

    /**
     * kalsm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKalsm(String value) {
        this.kalsm = value;
    }

    /**
     * kschl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKschl() {
        return kschl;
    }

    /**
     * kschl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKschl(String value) {
        this.kschl = value;
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
     * pstyv 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstyv() {
        return pstyv;
    }

    /**
     * pstyv 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstyv(String value) {
        this.pstyv = value;
    }

    /**
     * vkorg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVkorg() {
        return vkorg;
    }

    /**
     * vkorg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVkorg(String value) {
        this.vkorg = value;
    }

    /**
     * vtweg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVtweg() {
        return vtweg;
    }

    /**
     * vtweg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVtweg(String value) {
        this.vtweg = value;
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
     * veltp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeltp() {
        return veltp;
    }

    /**
     * veltp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeltp(String value) {
        this.veltp = value;
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
     * nambe 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNambe() {
        return nambe;
    }

    /**
     * nambe 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNambe(String value) {
        this.nambe = value;
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
     * vpobj 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVpobj() {
        return vpobj;
    }

    /**
     * vpobj 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVpobj(String value) {
        this.vpobj = value;
    }

    /**
     * vpobjkey 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVpobjkey() {
        return vpobjkey;
    }

    /**
     * vpobjkey 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVpobjkey(String value) {
        this.vpobjkey = value;
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
     * wmsta 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWmsta() {
        return wmsta;
    }

    /**
     * wmsta 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWmsta(String value) {
        this.wmsta = value;
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
     * saprl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaprl() {
        return saprl;
    }

    /**
     * saprl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaprl(String value) {
        this.saprl = value;
    }

    /**
     * kzgvh 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzgvh() {
        return kzgvh;
    }

    /**
     * kzgvh 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzgvh(String value) {
        this.kzgvh = value;
    }

    /**
     * adgeDg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdgeDg() {
        return adgeDg;
    }

    /**
     * adgeDg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdgeDg(String value) {
        this.adgeDg = value;
    }

    /**
     * adgeDgpr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdgeDgpr() {
        return adgeDgpr;
    }

    /**
     * adgeDgpr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdgeDgpr(String value) {
        this.adgeDgpr = value;
    }

    /**
     * uevel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUevel() {
        return uevel;
    }

    /**
     * uevel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUevel(String value) {
        this.uevel = value;
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
     * huLgort 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuLgort() {
        return huLgort;
    }

    /**
     * huLgort 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuLgort(String value) {
        this.huLgort = value;
    }

    /**
     * huSystem 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuSystem() {
        return huSystem;
    }

    /**
     * huSystem 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuSystem(String value) {
        this.huSystem = value;
    }

    /**
     * speHdall 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeHdall() {
        return speHdall;
    }

    /**
     * speHdall 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeHdall(String value) {
        this.speHdall = value;
    }

    /**
     * speVlstk 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeVlstk() {
        return speVlstk;
    }

    /**
     * speVlstk 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeVlstk(String value) {
        this.speVlstk = value;
    }

    /**
     * speDeldec 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeDeldec() {
        return speDeldec;
    }

    /**
     * speDeldec 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeDeldec(String value) {
        this.speDeldec = value;
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

    /**
     * epc1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEpc1() {
        return epc1;
    }

    /**
     * epc1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEpc1(String value) {
        this.epc1 = value;
    }

    /**
     * epc2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEpc2() {
        return epc2;
    }

    /**
     * epc2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEpc2(String value) {
        this.epc2 = value;
    }

    /**
     * packageCat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageCat() {
        return packageCat;
    }

    /**
     * packageCat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageCat(String value) {
        this.packageCat = value;
    }

    /**
     * transpIndex 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTranspIndex() {
        return transpIndex;
    }

    /**
     * transpIndex 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTranspIndex(BigDecimal value) {
        this.transpIndex = value;
    }

    /**
     * critSafIndex 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCritSafIndex() {
        return critSafIndex;
    }

    /**
     * critSafIndex 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCritSafIndex(BigDecimal value) {
        this.critSafIndex = value;
    }

    /**
     * flgDgPackage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlgDgPackage() {
        return flgDgPackage;
    }

    /**
     * flgDgPackage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlgDgPackage(String value) {
        this.flgDgPackage = value;
    }

    /**
     * dgPackageLevel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDgPackageLevel() {
        return dgPackageLevel;
    }

    /**
     * dgPackageLevel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDgPackageLevel(String value) {
        this.dgPackageLevel = value;
    }

    /**
     * packcode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackcode() {
        return packcode;
    }

    /**
     * packcode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackcode(String value) {
        this.packcode = value;
    }

    /**
     * instrEnclCat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrEnclCat() {
        return instrEnclCat;
    }

    /**
     * instrEnclCat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrEnclCat(String value) {
        this.instrEnclCat = value;
    }

    /**
     * matDamagedCl7 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatDamagedCl7() {
        return matDamagedCl7;
    }

    /**
     * matDamagedCl7 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatDamagedCl7(String value) {
        this.matDamagedCl7 = value;
    }

    /**
     * doseRateBulk 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDoseRateBulk() {
        return doseRateBulk;
    }

    /**
     * doseRateBulk 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDoseRateBulk(BigDecimal value) {
        this.doseRateBulk = value;
    }

    /**
     * doseRateBulkU 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoseRateBulkU() {
        return doseRateBulkU;
    }

    /**
     * doseRateBulkU 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoseRateBulkU(String value) {
        this.doseRateBulkU = value;
    }

    /**
     * doseRatePack 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDoseRatePack() {
        return doseRatePack;
    }

    /**
     * doseRatePack 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDoseRatePack(BigDecimal value) {
        this.doseRatePack = value;
    }

    /**
     * uDoseRatePack 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDoseRatePack() {
        return uDoseRatePack;
    }

    /**
     * uDoseRatePack 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDoseRatePack(String value) {
        this.uDoseRatePack = value;
    }

    /**
     * leadingLwdg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadingLwdg() {
        return leadingLwdg;
    }

    /**
     * leadingLwdg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadingLwdg(String value) {
        this.leadingLwdg = value;
    }

    /**
     * maxGrossWeight 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxGrossWeight() {
        return maxGrossWeight;
    }

    /**
     * maxGrossWeight 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxGrossWeight(BigDecimal value) {
        this.maxGrossWeight = value;
    }

    /**
     * uMaxGrossWght 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUMaxGrossWght() {
        return uMaxGrossWght;
    }

    /**
     * uMaxGrossWght 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUMaxGrossWght(String value) {
        this.uMaxGrossWght = value;
    }

    /**
     * lyard 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLyard() {
        return lyard;
    }

    /**
     * lyard 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLyard(String value) {
        this.lyard = value;
    }

    /**
     * ylccl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYlccl() {
        return ylccl;
    }

    /**
     * ylccl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYlccl(String value) {
        this.ylccl = value;
    }

    /**
     * yloct 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYloct() {
        return yloct;
    }

    /**
     * yloct 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYloct(String value) {
        this.yloct = value;
    }

    /**
     * stats 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStats() {
        return stats;
    }

    /**
     * stats 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStats(String value) {
        this.stats = value;
    }

    /**
     * prrty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrrty() {
        return prrty;
    }

    /**
     * prrty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrrty(String value) {
        this.prrty = value;
    }

    /**
     * fwagn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFwagn() {
        return fwagn;
    }

    /**
     * fwagn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFwagn(String value) {
        this.fwagn = value;
    }

    /**
     * scacd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScacd() {
        return scacd;
    }

    /**
     * scacd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScacd(String value) {
        this.scacd = value;
    }

    /**
     * owner 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * owner 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * trnpd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnpd() {
        return trnpd;
    }

    /**
     * trnpd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnpd(String value) {
        this.trnpd = value;
    }

    /**
     * sealn1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSealn1() {
        return sealn1;
    }

    /**
     * sealn1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSealn1(String value) {
        this.sealn1 = value;
    }

    /**
     * sealn2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSealn2() {
        return sealn2;
    }

    /**
     * sealn2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSealn2(String value) {
        this.sealn2 = value;
    }

    /**
     * sealn3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSealn3() {
        return sealn3;
    }

    /**
     * sealn3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSealn3(String value) {
        this.sealn3 = value;
    }

    /**
     * sealn4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSealn4() {
        return sealn4;
    }

    /**
     * sealn4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSealn4(String value) {
        this.sealn4 = value;
    }

    /**
     * sealn5 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSealn5() {
        return sealn5;
    }

    /**
     * sealn5 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSealn5(String value) {
        this.sealn5 = value;
    }

    /**
     * blind 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlind() {
        return blind;
    }

    /**
     * blind 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlind(String value) {
        this.blind = value;
    }

    /**
     * rsncd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsncd() {
        return rsncd;
    }

    /**
     * rsncd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsncd(String value) {
        this.rsncd = value;
    }

    /**
     * rftyp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRftyp() {
        return rftyp;
    }

    /**
     * rftyp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRftyp(String value) {
        this.rftyp = value;
    }

    /**
     * refer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefer() {
        return refer;
    }

    /**
     * refer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefer(String value) {
        this.refer = value;
    }

    /**
     * ptmst 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPtmst() {
        return ptmst;
    }

    /**
     * ptmst 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPtmst(BigDecimal value) {
        this.ptmst = value;
    }

    /**
     * atmst 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAtmst() {
        return atmst;
    }

    /**
     * atmst 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAtmst(BigDecimal value) {
        this.atmst = value;
    }

    /**
     * ydoor 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYdoor() {
        return ydoor;
    }

    /**
     * ydoor 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYdoor(String value) {
        this.ydoor = value;
    }

    /**
     * ystga 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYstga() {
        return ystga;
    }

    /**
     * ystga 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYstga(String value) {
        this.ystga = value;
    }

    /**
     * urgfl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrgfl() {
        return urgfl;
    }

    /**
     * urgfl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrgfl(String value) {
        this.urgfl = value;
    }

    /**
     * prflg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrflg() {
        return prflg;
    }

    /**
     * prflg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrflg(String value) {
        this.prflg = value;
    }

    /**
     * slflg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlflg() {
        return slflg;
    }

    /**
     * slflg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlflg(String value) {
        this.slflg = value;
    }

    /**
     * signi 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigni() {
        return signi;
    }

    /**
     * signi 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigni(String value) {
        this.signi = value;
    }

    /**
     * ltext 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLtext() {
        return ltext;
    }

    /**
     * ltext 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLtext(String value) {
        this.ltext = value;
    }

    /**
     * updkz 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdkz() {
        return updkz;
    }

    /**
     * updkz 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdkz(String value) {
        this.updkz = value;
    }

    /**
     * kztra 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKztra() {
        return kztra;
    }

    /**
     * kztra 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKztra(String value) {
        this.kztra = value;
    }

    /**
     * vebez 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVebez() {
        return vebez;
    }

    /**
     * vebez 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVebez(String value) {
        this.vebez = value;
    }

    /**
     * sortf 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortf() {
        return sortf;
    }

    /**
     * sortf 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortf(String value) {
        this.sortf = value;
    }

    /**
     * aendb 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAendb() {
        return aendb;
    }

    /**
     * aendb 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAendb(String value) {
        this.aendb = value;
    }

    /**
     * aendbWv 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAendbWv() {
        return aendbWv;
    }

    /**
     * aendbWv 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAendbWv(String value) {
        this.aendbWv = value;
    }

    /**
     * aendbQuan 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAendbQuan() {
        return aendbQuan;
    }

    /**
     * aendbQuan 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAendbQuan(String value) {
        this.aendbQuan = value;
    }

    /**
     * aendbStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAendbStatus() {
        return aendbStatus;
    }

    /**
     * aendbStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAendbStatus(String value) {
        this.aendbStatus = value;
    }

    /**
     * kzunt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzunt() {
        return kzunt;
    }

    /**
     * kzunt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzunt(String value) {
        this.kzunt = value;
    }

    /**
     * kzobe 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzobe() {
        return kzobe;
    }

    /**
     * kzobe 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzobe(String value) {
        this.kzobe = value;
    }

    /**
     * frgew 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFrgew() {
        return frgew;
    }

    /**
     * frgew 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFrgew(BigDecimal value) {
        this.frgew = value;
    }

    /**
     * geweiFr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeweiFr() {
        return geweiFr;
    }

    /**
     * geweiFr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeweiFr(String value) {
        this.geweiFr = value;
    }

    /**
     * frvol 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFrvol() {
        return frvol;
    }

    /**
     * frvol 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFrvol(BigDecimal value) {
        this.frvol = value;
    }

    /**
     * volehFr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolehFr() {
        return volehFr;
    }

    /**
     * volehFr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolehFr(String value) {
        this.volehFr = value;
    }

    /**
     * kzpgn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKzpgn() {
        return kzpgn;
    }

    /**
     * kzpgn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKzpgn(String value) {
        this.kzpgn = value;
    }

    /**
     * werfd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWerfd() {
        return werfd;
    }

    /**
     * werfd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWerfd(String value) {
        this.werfd = value;
    }

    /**
     * selkz 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelkz() {
        return selkz;
    }

    /**
     * selkz 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelkz(String value) {
        this.selkz = value;
    }

    /**
     * leLgpla 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeLgpla() {
        return leLgpla;
    }

    /**
     * leLgpla 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeLgpla(String value) {
        this.leLgpla = value;
    }

    /**
     * leLgtyp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeLgtyp() {
        return leLgtyp;
    }

    /**
     * leLgtyp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeLgtyp(String value) {
        this.leLgtyp = value;
    }

    /**
     * wmVerw 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWmVerw() {
        return wmVerw;
    }

    /**
     * wmVerw 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWmVerw(String value) {
        this.wmVerw = value;
    }

    /**
     * mtpos 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtpos() {
        return mtpos;
    }

    /**
     * mtpos 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtpos(String value) {
        this.mtpos = value;
    }

    /**
     * destLgnum 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestLgnum() {
        return destLgnum;
    }

    /**
     * destLgnum 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestLgnum(String value) {
        this.destLgnum = value;
    }

    /**
     * destLgtyp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestLgtyp() {
        return destLgtyp;
    }

    /**
     * destLgtyp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestLgtyp(String value) {
        this.destLgtyp = value;
    }

    /**
     * destLgpla 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestLgpla() {
        return destLgpla;
    }

    /**
     * destLgpla 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestLgpla(String value) {
        this.destLgpla = value;
    }

    /**
     * objnr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjnr() {
        return objnr;
    }

    /**
     * objnr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjnr(String value) {
        this.objnr = value;
    }

    /**
     * kunnr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKunnr() {
        return kunnr;
    }

    /**
     * kunnr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKunnr(String value) {
        this.kunnr = value;
    }

    /**
     * liefnr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiefnr() {
        return liefnr;
    }

    /**
     * liefnr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiefnr(String value) {
        this.liefnr = value;
    }

    /**
     * taravar 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaravar() {
        return taravar;
    }

    /**
     * taravar 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaravar(String value) {
        this.taravar = value;
    }

    /**
     * stsma 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStsma() {
        return stsma;
    }

    /**
     * stsma 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStsma(String value) {
        this.stsma = value;
    }

    /**
     * histu 속성의 값을 가져옵니다.
     * 
     */
    public int getHistu() {
        return histu;
    }

    /**
     * histu 속성의 값을 설정합니다.
     * 
     */
    public void setHistu(int value) {
        this.histu = value;
    }

    /**
     * activity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivity() {
        return activity;
    }

    /**
     * activity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivity(String value) {
        this.activity = value;
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
     * huStatusInit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuStatusInit() {
        return huStatusInit;
    }

    /**
     * huStatusInit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuStatusInit(String value) {
        this.huStatusInit = value;
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
     * huLocked 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuLocked() {
        return huLocked;
    }

    /**
     * huLocked 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuLocked(String value) {
        this.huLocked = value;
    }

    /**
     * letypWm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLetypWm() {
        return letypWm;
    }

    /**
     * letypWm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLetypWm(String value) {
        this.letypWm = value;
    }

    /**
     * topHuDlvry 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopHuDlvry() {
        return topHuDlvry;
    }

    /**
     * topHuDlvry 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopHuDlvry(String value) {
        this.topHuDlvry = value;
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
     * vwpos 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVwpos() {
        return vwpos;
    }

    /**
     * vwpos 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVwpos(String value) {
        this.vwpos = value;
    }

    /**
     * oldExidv 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldExidv() {
        return oldExidv;
    }

    /**
     * oldExidv 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldExidv(String value) {
        this.oldExidv = value;
    }

}
