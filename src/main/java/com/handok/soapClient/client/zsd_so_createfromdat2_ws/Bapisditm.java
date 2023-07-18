//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.06.02 시간 07:11:23 PM KST 
//


package com.handok.soapClient.client.zsd_so_createfromdat2_ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Bapisditm complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Bapisditm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItmNumber" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="HgLvItem" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="PoItmNo" type="{urn:sap-com:document:sap:rfc:functions}char6"/&gt;
 *         &lt;element name="Material" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="AltToItm" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="CustMat22" type="{urn:sap-com:document:sap:rfc:functions}char22"/&gt;
 *         &lt;element name="Batch" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="DlvGroup" type="{urn:sap-com:document:sap:rfc:functions}numeric3"/&gt;
 *         &lt;element name="PartDlv" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ReasonRej" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="BillBlock" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="BillDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Plant" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="StoreLoc" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="TargetQty" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="TargetQu" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="TUnitIso" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="ItemCateg" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="ShortText" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="PrcGroup1" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="PrcGroup2" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="PrcGroup3" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="PrcGroup4" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="PrcGroup5" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="ProdHiera" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="MatlGroup" type="{urn:sap-com:document:sap:rfc:functions}char9"/&gt;
 *         &lt;element name="PurchNoC" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="PurchDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="PoMethod" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Ref1" type="{urn:sap-com:document:sap:rfc:functions}char12"/&gt;
 *         &lt;element name="PurchNoS" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="PoDatS" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="PoMethS" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Ref1S" type="{urn:sap-com:document:sap:rfc:functions}char12"/&gt;
 *         &lt;element name="PoitmNoS" type="{urn:sap-com:document:sap:rfc:functions}char6"/&gt;
 *         &lt;element name="PriceGrp" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="CustGroup" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="SalesDist" type="{urn:sap-com:document:sap:rfc:functions}char6"/&gt;
 *         &lt;element name="PriceList" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Incoterms1" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Incoterms2" type="{urn:sap-com:document:sap:rfc:functions}char28"/&gt;
 *         &lt;element name="OrdcompIn" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="BillSched" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="InvoSched" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="MnInvoice" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="ExRateFi" type="{urn:sap-com:document:sap:rfc:functions}decimal9.5"/&gt;
 *         &lt;element name="AddValDy" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/&gt;
 *         &lt;element name="FixValDy" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Pmnttrms" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="PymtMeth" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="AccntAsgn" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="ExchgRate" type="{urn:sap-com:document:sap:rfc:functions}decimal9.5"/&gt;
 *         &lt;element name="PriceDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="ServDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="DunnKey" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="DunnBlock" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Promotion" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="PmtgarPro" type="{urn:sap-com:document:sap:rfc:functions}char6"/&gt;
 *         &lt;element name="DocNumFi" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="DepartmNo" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="RecPoint" type="{urn:sap-com:document:sap:rfc:functions}char25"/&gt;
 *         &lt;element name="Cstcndgrp1" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Cstcndgrp2" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Cstcndgrp3" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Cstcndgrp4" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Cstcndgrp5" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="DlvTime" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="SalesUnit" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="SUnitIso" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="TrgQtyNo" type="{urn:sap-com:document:sap:rfc:functions}decimal5.0"/&gt;
 *         &lt;element name="TrgqtyDen" type="{urn:sap-com:document:sap:rfc:functions}decimal5.0"/&gt;
 *         &lt;element name="RnddlvQty" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="Maxdevamnt" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="Maxdevper" type="{urn:sap-com:document:sap:rfc:functions}decimal3.0"/&gt;
 *         &lt;element name="MaxdevDay" type="{urn:sap-com:document:sap:rfc:functions}decimal3.0"/&gt;
 *         &lt;element name="UsageInd" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="FixedQuan" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="UnlmtDlv" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Overdlvtol" type="{urn:sap-com:document:sap:rfc:functions}decimal3.1"/&gt;
 *         &lt;element name="UnddlvTol" type="{urn:sap-com:document:sap:rfc:functions}decimal3.1"/&gt;
 *         &lt;element name="Division" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Salqtynum" type="{urn:sap-com:document:sap:rfc:functions}decimal5.0"/&gt;
 *         &lt;element name="Salqtyden" type="{urn:sap-com:document:sap:rfc:functions}decimal5.0"/&gt;
 *         &lt;element name="GrossWght" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/&gt;
 *         &lt;element name="NetWeight" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/&gt;
 *         &lt;element name="UntofWght" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="UnofWtiso" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Volume" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/&gt;
 *         &lt;element name="Volunit" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="Volunitiso" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="DlvPrio" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/&gt;
 *         &lt;element name="ShipPoint" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Route" type="{urn:sap-com:document:sap:rfc:functions}char6"/&gt;
 *         &lt;element name="CreatedBy" type="{urn:sap-com:document:sap:rfc:functions}char12"/&gt;
 *         &lt;element name="TaxClass1" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TaxClass2" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TaxClass3" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TaxClass4" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TaxClass5" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TaxClass6" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TaxClass7" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TaxClass8" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="TaxClass9" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="MatPrGrp" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="ValType" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="FixdatQty" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="BomexplNo" type="{urn:sap-com:document:sap:rfc:functions}char8"/&gt;
 *         &lt;element name="Resanalkey" type="{urn:sap-com:document:sap:rfc:functions}char6"/&gt;
 *         &lt;element name="ReqmtsTyp" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="NoGrPost" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="BusTranst" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="OverhdKey" type="{urn:sap-com:document:sap:rfc:functions}char6"/&gt;
 *         &lt;element name="CstgSheet" type="{urn:sap-com:document:sap:rfc:functions}char6"/&gt;
 *         &lt;element name="Matfrgtgrp" type="{urn:sap-com:document:sap:rfc:functions}char8"/&gt;
 *         &lt;element name="Pldlvshdin" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="SeqNo" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="BilForm" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="DliProfil" type="{urn:sap-com:document:sap:rfc:functions}char8"/&gt;
 *         &lt;element name="RevType" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="BegdemPer" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="PrRefMat" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="Refobjtype" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Refobjkey" type="{urn:sap-com:document:sap:rfc:functions}char70"/&gt;
 *         &lt;element name="Reflogsys" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="OrderProb" type="{urn:sap-com:document:sap:rfc:functions}numeric3"/&gt;
 *         &lt;element name="MaxPlDlv" type="{urn:sap-com:document:sap:rfc:functions}decimal1.0"/&gt;
 *         &lt;element name="CfopCode" type="{urn:sap-com:document:sap:rfc:functions}char5"/&gt;
 *         &lt;element name="Taxlawicms" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Taxlawipi" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="SdTaxcode" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="AssortMod" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="CompQuant" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/&gt;
 *         &lt;element name="TargetVal" type="{urn:sap-com:document:sap:rfc:functions}decimal28.9"/&gt;
 *         &lt;element name="Currency" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/&gt;
 *         &lt;element name="CurrIso" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="ProfitCtr" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Orderid" type="{urn:sap-com:document:sap:rfc:functions}char12"/&gt;
 *         &lt;element name="WbsElem" type="{urn:sap-com:document:sap:rfc:functions}char24"/&gt;
 *         &lt;element name="DeprecPer" type="{urn:sap-com:document:sap:rfc:functions}decimal5.2"/&gt;
 *         &lt;element name="RefDoc" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="RefDocIt" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="RefDocCa" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="CustMat35" type="{urn:sap-com:document:sap:rfc:functions}char35"/&gt;
 *         &lt;element name="ExchRateFiV" type="{urn:sap-com:document:sap:rfc:functions}decimal9.5"/&gt;
 *         &lt;element name="ExchgRateV" type="{urn:sap-com:document:sap:rfc:functions}decimal9.5"/&gt;
 *         &lt;element name="ItemguidAtp" type="{urn:sap-com:document:sap:rfc:functions}char22"/&gt;
 *         &lt;element name="ValContr" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="ValConI" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="ConfigId" type="{urn:sap-com:document:sap:rfc:functions}char6"/&gt;
 *         &lt;element name="InstId" type="{urn:sap-com:document:sap:rfc:functions}char8"/&gt;
 *         &lt;element name="MatExt" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="MatGuid" type="{urn:sap-com:document:sap:rfc:functions}char32"/&gt;
 *         &lt;element name="MatVers" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="PMatExt" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="PMatGuid" type="{urn:sap-com:document:sap:rfc:functions}char32"/&gt;
 *         &lt;element name="PMatVers" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="FuncArea" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="AlternBom" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="FkkConacct" type="{urn:sap-com:document:sap:rfc:functions}char12"/&gt;
 *         &lt;element name="EanUpc" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="Prodcat" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="ShipType" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="SProcInd" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="FuncAreaLong" type="{urn:sap-com:document:sap:rfc:functions}char16"/&gt;
 *         &lt;element name="BillRel" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="VwUepos" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Campaign" type="{urn:sap-com:document:sap:rfc:functions}byte16"/&gt;
 *         &lt;element name="Dlvschduse" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="CfopLong" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Selection" type="{urn:sap-com:document:sap:rfc:functions}char32"/&gt;
 *         &lt;element name="MatEntrd" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="LogSystemOwn" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="ItmTypeUsage" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Taxlawiss" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="MatEntrdExternal" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="MatEntrdGuid" type="{urn:sap-com:document:sap:rfc:functions}char32"/&gt;
 *         &lt;element name="MatEntrdVersion" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="LocTaxcat" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="LocZerovat" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="LocActcode" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="LocDisttype" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="LocTxrelclas" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="CalcMotive" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Compreas" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Fund" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="FundsCtr" type="{urn:sap-com:document:sap:rfc:functions}char16"/&gt;
 *         &lt;element name="CmmtItem" type="{urn:sap-com:document:sap:rfc:functions}char24"/&gt;
 *         &lt;element name="GrantNbr" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="BudgetPeriod" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Taxlawcofins" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Taxlawpis" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="TreasuryAccSymbol" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="BusinessEventTcode" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="ModificationAllowed" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="CancellationAllowed" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="PaymentMethods" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="BusinessPartnerNo" type="{urn:sap-com:document:sap:rfc:functions}char6"/&gt;
 *         &lt;element name="ReportingFreq" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
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
    "itmNumber",
    "hgLvItem",
    "poItmNo",
    "material",
    "altToItm",
    "custMat22",
    "batch",
    "dlvGroup",
    "partDlv",
    "reasonRej",
    "billBlock",
    "billDate",
    "plant",
    "storeLoc",
    "targetQty",
    "targetQu",
    "tUnitIso",
    "itemCateg",
    "shortText",
    "prcGroup1",
    "prcGroup2",
    "prcGroup3",
    "prcGroup4",
    "prcGroup5",
    "prodHiera",
    "matlGroup",
    "purchNoC",
    "purchDate",
    "poMethod",
    "ref1",
    "purchNoS",
    "poDatS",
    "poMethS",
    "ref1S",
    "poitmNoS",
    "priceGrp",
    "custGroup",
    "salesDist",
    "priceList",
    "incoterms1",
    "incoterms2",
    "ordcompIn",
    "billSched",
    "invoSched",
    "mnInvoice",
    "exRateFi",
    "addValDy",
    "fixValDy",
    "pmnttrms",
    "pymtMeth",
    "accntAsgn",
    "exchgRate",
    "priceDate",
    "servDate",
    "dunnKey",
    "dunnBlock",
    "promotion",
    "pmtgarPro",
    "docNumFi",
    "departmNo",
    "recPoint",
    "cstcndgrp1",
    "cstcndgrp2",
    "cstcndgrp3",
    "cstcndgrp4",
    "cstcndgrp5",
    "dlvTime",
    "salesUnit",
    "sUnitIso",
    "trgQtyNo",
    "trgqtyDen",
    "rnddlvQty",
    "maxdevamnt",
    "maxdevper",
    "maxdevDay",
    "usageInd",
    "fixedQuan",
    "unlmtDlv",
    "overdlvtol",
    "unddlvTol",
    "division",
    "salqtynum",
    "salqtyden",
    "grossWght",
    "netWeight",
    "untofWght",
    "unofWtiso",
    "volume",
    "volunit",
    "volunitiso",
    "dlvPrio",
    "shipPoint",
    "route",
    "createdBy",
    "taxClass1",
    "taxClass2",
    "taxClass3",
    "taxClass4",
    "taxClass5",
    "taxClass6",
    "taxClass7",
    "taxClass8",
    "taxClass9",
    "matPrGrp",
    "valType",
    "fixdatQty",
    "bomexplNo",
    "resanalkey",
    "reqmtsTyp",
    "noGrPost",
    "busTranst",
    "overhdKey",
    "cstgSheet",
    "matfrgtgrp",
    "pldlvshdin",
    "seqNo",
    "bilForm",
    "dliProfil",
    "revType",
    "begdemPer",
    "prRefMat",
    "refobjtype",
    "refobjkey",
    "reflogsys",
    "orderProb",
    "maxPlDlv",
    "cfopCode",
    "taxlawicms",
    "taxlawipi",
    "sdTaxcode",
    "assortMod",
    "compQuant",
    "targetVal",
    "currency",
    "currIso",
    "profitCtr",
    "orderid",
    "wbsElem",
    "deprecPer",
    "refDoc",
    "refDocIt",
    "refDocCa",
    "custMat35",
    "exchRateFiV",
    "exchgRateV",
    "itemguidAtp",
    "valContr",
    "valConI",
    "configId",
    "instId",
    "matExt",
    "matGuid",
    "matVers",
    "pMatExt",
    "pMatGuid",
    "pMatVers",
    "funcArea",
    "alternBom",
    "fkkConacct",
    "eanUpc",
    "prodcat",
    "shipType",
    "sProcInd",
    "funcAreaLong",
    "billRel",
    "vwUepos",
    "campaign",
    "dlvschduse",
    "cfopLong",
    "selection",
    "matEntrd",
    "logSystemOwn",
    "itmTypeUsage",
    "taxlawiss",
    "matEntrdExternal",
    "matEntrdGuid",
    "matEntrdVersion",
    "locTaxcat",
    "locZerovat",
    "locActcode",
    "locDisttype",
    "locTxrelclas",
    "calcMotive",
    "compreas",
    "fund",
    "fundsCtr",
    "cmmtItem",
    "grantNbr",
    "budgetPeriod",
    "taxlawcofins",
    "taxlawpis",
    "treasuryAccSymbol",
    "businessEventTcode",
    "modificationAllowed",
    "cancellationAllowed",
    "paymentMethods",
    "businessPartnerNo",
    "reportingFreq"
})
public class Bapisditm {

    @XmlElement(name = "ItmNumber", required = true)
    protected String itmNumber;
    @XmlElement(name = "HgLvItem", required = true)
    protected String hgLvItem;
    @XmlElement(name = "PoItmNo", required = true)
    protected String poItmNo;
    @XmlElement(name = "Material", required = true)
    protected String material;
    @XmlElement(name = "AltToItm", required = true)
    protected String altToItm;
    @XmlElement(name = "CustMat22", required = true)
    protected String custMat22;
    @XmlElement(name = "Batch", required = true)
    protected String batch;
    @XmlElement(name = "DlvGroup", required = true)
    protected String dlvGroup;
    @XmlElement(name = "PartDlv", required = true)
    protected String partDlv;
    @XmlElement(name = "ReasonRej", required = true)
    protected String reasonRej;
    @XmlElement(name = "BillBlock", required = true)
    protected String billBlock;
    @XmlElement(name = "BillDate", required = true)
    protected String billDate;
    @XmlElement(name = "Plant", required = true)
    protected String plant;
    @XmlElement(name = "StoreLoc", required = true)
    protected String storeLoc;
    @XmlElement(name = "TargetQty", required = true)
    protected BigDecimal targetQty;
    @XmlElement(name = "TargetQu", required = true)
    protected String targetQu;
    @XmlElement(name = "TUnitIso", required = true)
    protected String tUnitIso;
    @XmlElement(name = "ItemCateg", required = true)
    protected String itemCateg;
    @XmlElement(name = "ShortText", required = true)
    protected String shortText;
    @XmlElement(name = "PrcGroup1", required = true)
    protected String prcGroup1;
    @XmlElement(name = "PrcGroup2", required = true)
    protected String prcGroup2;
    @XmlElement(name = "PrcGroup3", required = true)
    protected String prcGroup3;
    @XmlElement(name = "PrcGroup4", required = true)
    protected String prcGroup4;
    @XmlElement(name = "PrcGroup5", required = true)
    protected String prcGroup5;
    @XmlElement(name = "ProdHiera", required = true)
    protected String prodHiera;
    @XmlElement(name = "MatlGroup", required = true)
    protected String matlGroup;
    @XmlElement(name = "PurchNoC", required = true)
    protected String purchNoC;
    @XmlElement(name = "PurchDate", required = true)
    protected String purchDate;
    @XmlElement(name = "PoMethod", required = true)
    protected String poMethod;
    @XmlElement(name = "Ref1", required = true)
    protected String ref1;
    @XmlElement(name = "PurchNoS", required = true)
    protected String purchNoS;
    @XmlElement(name = "PoDatS", required = true)
    protected String poDatS;
    @XmlElement(name = "PoMethS", required = true)
    protected String poMethS;
    @XmlElement(name = "Ref1S", required = true)
    protected String ref1S;
    @XmlElement(name = "PoitmNoS", required = true)
    protected String poitmNoS;
    @XmlElement(name = "PriceGrp", required = true)
    protected String priceGrp;
    @XmlElement(name = "CustGroup", required = true)
    protected String custGroup;
    @XmlElement(name = "SalesDist", required = true)
    protected String salesDist;
    @XmlElement(name = "PriceList", required = true)
    protected String priceList;
    @XmlElement(name = "Incoterms1", required = true)
    protected String incoterms1;
    @XmlElement(name = "Incoterms2", required = true)
    protected String incoterms2;
    @XmlElement(name = "OrdcompIn", required = true)
    protected String ordcompIn;
    @XmlElement(name = "BillSched", required = true)
    protected String billSched;
    @XmlElement(name = "InvoSched", required = true)
    protected String invoSched;
    @XmlElement(name = "MnInvoice", required = true)
    protected String mnInvoice;
    @XmlElement(name = "ExRateFi", required = true)
    protected BigDecimal exRateFi;
    @XmlElement(name = "AddValDy", required = true)
    protected String addValDy;
    @XmlElement(name = "FixValDy", required = true)
    protected String fixValDy;
    @XmlElement(name = "Pmnttrms", required = true)
    protected String pmnttrms;
    @XmlElement(name = "PymtMeth", required = true)
    protected String pymtMeth;
    @XmlElement(name = "AccntAsgn", required = true)
    protected String accntAsgn;
    @XmlElement(name = "ExchgRate", required = true)
    protected BigDecimal exchgRate;
    @XmlElement(name = "PriceDate", required = true)
    protected String priceDate;
    @XmlElement(name = "ServDate", required = true)
    protected String servDate;
    @XmlElement(name = "DunnKey", required = true)
    protected String dunnKey;
    @XmlElement(name = "DunnBlock", required = true)
    protected String dunnBlock;
    @XmlElement(name = "Promotion", required = true)
    protected String promotion;
    @XmlElement(name = "PmtgarPro", required = true)
    protected String pmtgarPro;
    @XmlElement(name = "DocNumFi", required = true)
    protected String docNumFi;
    @XmlElement(name = "DepartmNo", required = true)
    protected String departmNo;
    @XmlElement(name = "RecPoint", required = true)
    protected String recPoint;
    @XmlElement(name = "Cstcndgrp1", required = true)
    protected String cstcndgrp1;
    @XmlElement(name = "Cstcndgrp2", required = true)
    protected String cstcndgrp2;
    @XmlElement(name = "Cstcndgrp3", required = true)
    protected String cstcndgrp3;
    @XmlElement(name = "Cstcndgrp4", required = true)
    protected String cstcndgrp4;
    @XmlElement(name = "Cstcndgrp5", required = true)
    protected String cstcndgrp5;
    @XmlElement(name = "DlvTime", required = true)
    protected String dlvTime;
    @XmlElement(name = "SalesUnit", required = true)
    protected String salesUnit;
    @XmlElement(name = "SUnitIso", required = true)
    protected String sUnitIso;
    @XmlElement(name = "TrgQtyNo", required = true)
    protected BigDecimal trgQtyNo;
    @XmlElement(name = "TrgqtyDen", required = true)
    protected BigDecimal trgqtyDen;
    @XmlElement(name = "RnddlvQty", required = true)
    protected BigDecimal rnddlvQty;
    @XmlElement(name = "Maxdevamnt", required = true)
    protected BigDecimal maxdevamnt;
    @XmlElement(name = "Maxdevper", required = true)
    protected BigDecimal maxdevper;
    @XmlElement(name = "MaxdevDay", required = true)
    protected BigDecimal maxdevDay;
    @XmlElement(name = "UsageInd", required = true)
    protected String usageInd;
    @XmlElement(name = "FixedQuan", required = true)
    protected String fixedQuan;
    @XmlElement(name = "UnlmtDlv", required = true)
    protected String unlmtDlv;
    @XmlElement(name = "Overdlvtol", required = true)
    protected BigDecimal overdlvtol;
    @XmlElement(name = "UnddlvTol", required = true)
    protected BigDecimal unddlvTol;
    @XmlElement(name = "Division", required = true)
    protected String division;
    @XmlElement(name = "Salqtynum", required = true)
    protected BigDecimal salqtynum;
    @XmlElement(name = "Salqtyden", required = true)
    protected BigDecimal salqtyden;
    @XmlElement(name = "GrossWght", required = true)
    protected BigDecimal grossWght;
    @XmlElement(name = "NetWeight", required = true)
    protected BigDecimal netWeight;
    @XmlElement(name = "UntofWght", required = true)
    protected String untofWght;
    @XmlElement(name = "UnofWtiso", required = true)
    protected String unofWtiso;
    @XmlElement(name = "Volume", required = true)
    protected BigDecimal volume;
    @XmlElement(name = "Volunit", required = true)
    protected String volunit;
    @XmlElement(name = "Volunitiso", required = true)
    protected String volunitiso;
    @XmlElement(name = "DlvPrio", required = true)
    protected String dlvPrio;
    @XmlElement(name = "ShipPoint", required = true)
    protected String shipPoint;
    @XmlElement(name = "Route", required = true)
    protected String route;
    @XmlElement(name = "CreatedBy", required = true)
    protected String createdBy;
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
    @XmlElement(name = "MatPrGrp", required = true)
    protected String matPrGrp;
    @XmlElement(name = "ValType", required = true)
    protected String valType;
    @XmlElement(name = "FixdatQty", required = true)
    protected String fixdatQty;
    @XmlElement(name = "BomexplNo", required = true)
    protected String bomexplNo;
    @XmlElement(name = "Resanalkey", required = true)
    protected String resanalkey;
    @XmlElement(name = "ReqmtsTyp", required = true)
    protected String reqmtsTyp;
    @XmlElement(name = "NoGrPost", required = true)
    protected String noGrPost;
    @XmlElement(name = "BusTranst", required = true)
    protected String busTranst;
    @XmlElement(name = "OverhdKey", required = true)
    protected String overhdKey;
    @XmlElement(name = "CstgSheet", required = true)
    protected String cstgSheet;
    @XmlElement(name = "Matfrgtgrp", required = true)
    protected String matfrgtgrp;
    @XmlElement(name = "Pldlvshdin", required = true)
    protected String pldlvshdin;
    @XmlElement(name = "SeqNo", required = true)
    protected String seqNo;
    @XmlElement(name = "BilForm", required = true)
    protected String bilForm;
    @XmlElement(name = "DliProfil", required = true)
    protected String dliProfil;
    @XmlElement(name = "RevType", required = true)
    protected String revType;
    @XmlElement(name = "BegdemPer", required = true)
    protected String begdemPer;
    @XmlElement(name = "PrRefMat", required = true)
    protected String prRefMat;
    @XmlElement(name = "Refobjtype", required = true)
    protected String refobjtype;
    @XmlElement(name = "Refobjkey", required = true)
    protected String refobjkey;
    @XmlElement(name = "Reflogsys", required = true)
    protected String reflogsys;
    @XmlElement(name = "OrderProb", required = true)
    protected String orderProb;
    @XmlElement(name = "MaxPlDlv", required = true)
    protected BigDecimal maxPlDlv;
    @XmlElement(name = "CfopCode", required = true)
    protected String cfopCode;
    @XmlElement(name = "Taxlawicms", required = true)
    protected String taxlawicms;
    @XmlElement(name = "Taxlawipi", required = true)
    protected String taxlawipi;
    @XmlElement(name = "SdTaxcode", required = true)
    protected String sdTaxcode;
    @XmlElement(name = "AssortMod", required = true)
    protected String assortMod;
    @XmlElement(name = "CompQuant", required = true)
    protected BigDecimal compQuant;
    @XmlElement(name = "TargetVal", required = true)
    protected BigDecimal targetVal;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "CurrIso", required = true)
    protected String currIso;
    @XmlElement(name = "ProfitCtr", required = true)
    protected String profitCtr;
    @XmlElement(name = "Orderid", required = true)
    protected String orderid;
    @XmlElement(name = "WbsElem", required = true)
    protected String wbsElem;
    @XmlElement(name = "DeprecPer", required = true)
    protected BigDecimal deprecPer;
    @XmlElement(name = "RefDoc", required = true)
    protected String refDoc;
    @XmlElement(name = "RefDocIt", required = true)
    protected String refDocIt;
    @XmlElement(name = "RefDocCa", required = true)
    protected String refDocCa;
    @XmlElement(name = "CustMat35", required = true)
    protected String custMat35;
    @XmlElement(name = "ExchRateFiV", required = true)
    protected BigDecimal exchRateFiV;
    @XmlElement(name = "ExchgRateV", required = true)
    protected BigDecimal exchgRateV;
    @XmlElement(name = "ItemguidAtp", required = true)
    protected String itemguidAtp;
    @XmlElement(name = "ValContr", required = true)
    protected String valContr;
    @XmlElement(name = "ValConI", required = true)
    protected String valConI;
    @XmlElement(name = "ConfigId", required = true)
    protected String configId;
    @XmlElement(name = "InstId", required = true)
    protected String instId;
    @XmlElement(name = "MatExt", required = true)
    protected String matExt;
    @XmlElement(name = "MatGuid", required = true)
    protected String matGuid;
    @XmlElement(name = "MatVers", required = true)
    protected String matVers;
    @XmlElement(name = "PMatExt", required = true)
    protected String pMatExt;
    @XmlElement(name = "PMatGuid", required = true)
    protected String pMatGuid;
    @XmlElement(name = "PMatVers", required = true)
    protected String pMatVers;
    @XmlElement(name = "FuncArea", required = true)
    protected String funcArea;
    @XmlElement(name = "AlternBom", required = true)
    protected String alternBom;
    @XmlElement(name = "FkkConacct", required = true)
    protected String fkkConacct;
    @XmlElement(name = "EanUpc", required = true)
    protected String eanUpc;
    @XmlElement(name = "Prodcat", required = true)
    protected String prodcat;
    @XmlElement(name = "ShipType", required = true)
    protected String shipType;
    @XmlElement(name = "SProcInd", required = true)
    protected String sProcInd;
    @XmlElement(name = "FuncAreaLong", required = true)
    protected String funcAreaLong;
    @XmlElement(name = "BillRel", required = true)
    protected String billRel;
    @XmlElement(name = "VwUepos", required = true)
    protected String vwUepos;
    @XmlElement(name = "Campaign", required = true)
    protected byte[] campaign;
    @XmlElement(name = "Dlvschduse", required = true)
    protected String dlvschduse;
    @XmlElement(name = "CfopLong", required = true)
    protected String cfopLong;
    @XmlElement(name = "Selection", required = true)
    protected String selection;
    @XmlElement(name = "MatEntrd", required = true)
    protected String matEntrd;
    @XmlElement(name = "LogSystemOwn", required = true)
    protected String logSystemOwn;
    @XmlElement(name = "ItmTypeUsage", required = true)
    protected String itmTypeUsage;
    @XmlElement(name = "Taxlawiss", required = true)
    protected String taxlawiss;
    @XmlElement(name = "MatEntrdExternal", required = true)
    protected String matEntrdExternal;
    @XmlElement(name = "MatEntrdGuid", required = true)
    protected String matEntrdGuid;
    @XmlElement(name = "MatEntrdVersion", required = true)
    protected String matEntrdVersion;
    @XmlElement(name = "LocTaxcat", required = true)
    protected String locTaxcat;
    @XmlElement(name = "LocZerovat", required = true)
    protected String locZerovat;
    @XmlElement(name = "LocActcode", required = true)
    protected String locActcode;
    @XmlElement(name = "LocDisttype", required = true)
    protected String locDisttype;
    @XmlElement(name = "LocTxrelclas", required = true)
    protected String locTxrelclas;
    @XmlElement(name = "CalcMotive", required = true)
    protected String calcMotive;
    @XmlElement(name = "Compreas", required = true)
    protected String compreas;
    @XmlElement(name = "Fund", required = true)
    protected String fund;
    @XmlElement(name = "FundsCtr", required = true)
    protected String fundsCtr;
    @XmlElement(name = "CmmtItem", required = true)
    protected String cmmtItem;
    @XmlElement(name = "GrantNbr", required = true)
    protected String grantNbr;
    @XmlElement(name = "BudgetPeriod", required = true)
    protected String budgetPeriod;
    @XmlElement(name = "Taxlawcofins", required = true)
    protected String taxlawcofins;
    @XmlElement(name = "Taxlawpis", required = true)
    protected String taxlawpis;
    @XmlElement(name = "TreasuryAccSymbol", required = true)
    protected String treasuryAccSymbol;
    @XmlElement(name = "BusinessEventTcode", required = true)
    protected String businessEventTcode;
    @XmlElement(name = "ModificationAllowed", required = true)
    protected String modificationAllowed;
    @XmlElement(name = "CancellationAllowed", required = true)
    protected String cancellationAllowed;
    @XmlElement(name = "PaymentMethods", required = true)
    protected String paymentMethods;
    @XmlElement(name = "BusinessPartnerNo", required = true)
    protected String businessPartnerNo;
    @XmlElement(name = "ReportingFreq", required = true)
    protected String reportingFreq;

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
     * hgLvItem 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHgLvItem() {
        return hgLvItem;
    }

    /**
     * hgLvItem 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHgLvItem(String value) {
        this.hgLvItem = value;
    }

    /**
     * poItmNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoItmNo() {
        return poItmNo;
    }

    /**
     * poItmNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoItmNo(String value) {
        this.poItmNo = value;
    }

    /**
     * material 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterial() {
        return material;
    }

    /**
     * material 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterial(String value) {
        this.material = value;
    }

    /**
     * altToItm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltToItm() {
        return altToItm;
    }

    /**
     * altToItm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltToItm(String value) {
        this.altToItm = value;
    }

    /**
     * custMat22 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustMat22() {
        return custMat22;
    }

    /**
     * custMat22 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustMat22(String value) {
        this.custMat22 = value;
    }

    /**
     * batch 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatch() {
        return batch;
    }

    /**
     * batch 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatch(String value) {
        this.batch = value;
    }

    /**
     * dlvGroup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvGroup() {
        return dlvGroup;
    }

    /**
     * dlvGroup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlvGroup(String value) {
        this.dlvGroup = value;
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
     * reasonRej 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonRej() {
        return reasonRej;
    }

    /**
     * reasonRej 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonRej(String value) {
        this.reasonRej = value;
    }

    /**
     * billBlock 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillBlock() {
        return billBlock;
    }

    /**
     * billBlock 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillBlock(String value) {
        this.billBlock = value;
    }

    /**
     * billDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillDate() {
        return billDate;
    }

    /**
     * billDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillDate(String value) {
        this.billDate = value;
    }

    /**
     * plant 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlant() {
        return plant;
    }

    /**
     * plant 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlant(String value) {
        this.plant = value;
    }

    /**
     * storeLoc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreLoc() {
        return storeLoc;
    }

    /**
     * storeLoc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreLoc(String value) {
        this.storeLoc = value;
    }

    /**
     * targetQty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTargetQty() {
        return targetQty;
    }

    /**
     * targetQty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTargetQty(BigDecimal value) {
        this.targetQty = value;
    }

    /**
     * targetQu 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetQu() {
        return targetQu;
    }

    /**
     * targetQu 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetQu(String value) {
        this.targetQu = value;
    }

    /**
     * tUnitIso 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTUnitIso() {
        return tUnitIso;
    }

    /**
     * tUnitIso 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTUnitIso(String value) {
        this.tUnitIso = value;
    }

    /**
     * itemCateg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCateg() {
        return itemCateg;
    }

    /**
     * itemCateg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCateg(String value) {
        this.itemCateg = value;
    }

    /**
     * shortText 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortText() {
        return shortText;
    }

    /**
     * shortText 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortText(String value) {
        this.shortText = value;
    }

    /**
     * prcGroup1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcGroup1() {
        return prcGroup1;
    }

    /**
     * prcGroup1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcGroup1(String value) {
        this.prcGroup1 = value;
    }

    /**
     * prcGroup2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcGroup2() {
        return prcGroup2;
    }

    /**
     * prcGroup2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcGroup2(String value) {
        this.prcGroup2 = value;
    }

    /**
     * prcGroup3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcGroup3() {
        return prcGroup3;
    }

    /**
     * prcGroup3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcGroup3(String value) {
        this.prcGroup3 = value;
    }

    /**
     * prcGroup4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcGroup4() {
        return prcGroup4;
    }

    /**
     * prcGroup4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcGroup4(String value) {
        this.prcGroup4 = value;
    }

    /**
     * prcGroup5 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcGroup5() {
        return prcGroup5;
    }

    /**
     * prcGroup5 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcGroup5(String value) {
        this.prcGroup5 = value;
    }

    /**
     * prodHiera 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdHiera() {
        return prodHiera;
    }

    /**
     * prodHiera 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdHiera(String value) {
        this.prodHiera = value;
    }

    /**
     * matlGroup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatlGroup() {
        return matlGroup;
    }

    /**
     * matlGroup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatlGroup(String value) {
        this.matlGroup = value;
    }

    /**
     * purchNoC 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchNoC() {
        return purchNoC;
    }

    /**
     * purchNoC 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchNoC(String value) {
        this.purchNoC = value;
    }

    /**
     * purchDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchDate() {
        return purchDate;
    }

    /**
     * purchDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchDate(String value) {
        this.purchDate = value;
    }

    /**
     * poMethod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoMethod() {
        return poMethod;
    }

    /**
     * poMethod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoMethod(String value) {
        this.poMethod = value;
    }

    /**
     * ref1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef1() {
        return ref1;
    }

    /**
     * ref1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef1(String value) {
        this.ref1 = value;
    }

    /**
     * purchNoS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchNoS() {
        return purchNoS;
    }

    /**
     * purchNoS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchNoS(String value) {
        this.purchNoS = value;
    }

    /**
     * poDatS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoDatS() {
        return poDatS;
    }

    /**
     * poDatS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoDatS(String value) {
        this.poDatS = value;
    }

    /**
     * poMethS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoMethS() {
        return poMethS;
    }

    /**
     * poMethS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoMethS(String value) {
        this.poMethS = value;
    }

    /**
     * ref1S 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef1S() {
        return ref1S;
    }

    /**
     * ref1S 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef1S(String value) {
        this.ref1S = value;
    }

    /**
     * poitmNoS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoitmNoS() {
        return poitmNoS;
    }

    /**
     * poitmNoS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoitmNoS(String value) {
        this.poitmNoS = value;
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
     * ordcompIn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdcompIn() {
        return ordcompIn;
    }

    /**
     * ordcompIn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdcompIn(String value) {
        this.ordcompIn = value;
    }

    /**
     * billSched 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillSched() {
        return billSched;
    }

    /**
     * billSched 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillSched(String value) {
        this.billSched = value;
    }

    /**
     * invoSched 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoSched() {
        return invoSched;
    }

    /**
     * invoSched 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoSched(String value) {
        this.invoSched = value;
    }

    /**
     * mnInvoice 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMnInvoice() {
        return mnInvoice;
    }

    /**
     * mnInvoice 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMnInvoice(String value) {
        this.mnInvoice = value;
    }

    /**
     * exRateFi 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExRateFi() {
        return exRateFi;
    }

    /**
     * exRateFi 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExRateFi(BigDecimal value) {
        this.exRateFi = value;
    }

    /**
     * addValDy 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddValDy() {
        return addValDy;
    }

    /**
     * addValDy 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddValDy(String value) {
        this.addValDy = value;
    }

    /**
     * fixValDy 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixValDy() {
        return fixValDy;
    }

    /**
     * fixValDy 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixValDy(String value) {
        this.fixValDy = value;
    }

    /**
     * pmnttrms 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmnttrms() {
        return pmnttrms;
    }

    /**
     * pmnttrms 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmnttrms(String value) {
        this.pmnttrms = value;
    }

    /**
     * pymtMeth 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPymtMeth() {
        return pymtMeth;
    }

    /**
     * pymtMeth 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPymtMeth(String value) {
        this.pymtMeth = value;
    }

    /**
     * accntAsgn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccntAsgn() {
        return accntAsgn;
    }

    /**
     * accntAsgn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccntAsgn(String value) {
        this.accntAsgn = value;
    }

    /**
     * exchgRate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchgRate() {
        return exchgRate;
    }

    /**
     * exchgRate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchgRate(BigDecimal value) {
        this.exchgRate = value;
    }

    /**
     * priceDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceDate() {
        return priceDate;
    }

    /**
     * priceDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceDate(String value) {
        this.priceDate = value;
    }

    /**
     * servDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServDate() {
        return servDate;
    }

    /**
     * servDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServDate(String value) {
        this.servDate = value;
    }

    /**
     * dunnKey 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDunnKey() {
        return dunnKey;
    }

    /**
     * dunnKey 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDunnKey(String value) {
        this.dunnKey = value;
    }

    /**
     * dunnBlock 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDunnBlock() {
        return dunnBlock;
    }

    /**
     * dunnBlock 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDunnBlock(String value) {
        this.dunnBlock = value;
    }

    /**
     * promotion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotion() {
        return promotion;
    }

    /**
     * promotion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotion(String value) {
        this.promotion = value;
    }

    /**
     * pmtgarPro 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtgarPro() {
        return pmtgarPro;
    }

    /**
     * pmtgarPro 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtgarPro(String value) {
        this.pmtgarPro = value;
    }

    /**
     * docNumFi 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumFi() {
        return docNumFi;
    }

    /**
     * docNumFi 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNumFi(String value) {
        this.docNumFi = value;
    }

    /**
     * departmNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmNo() {
        return departmNo;
    }

    /**
     * departmNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmNo(String value) {
        this.departmNo = value;
    }

    /**
     * recPoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecPoint() {
        return recPoint;
    }

    /**
     * recPoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecPoint(String value) {
        this.recPoint = value;
    }

    /**
     * cstcndgrp1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstcndgrp1() {
        return cstcndgrp1;
    }

    /**
     * cstcndgrp1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstcndgrp1(String value) {
        this.cstcndgrp1 = value;
    }

    /**
     * cstcndgrp2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstcndgrp2() {
        return cstcndgrp2;
    }

    /**
     * cstcndgrp2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstcndgrp2(String value) {
        this.cstcndgrp2 = value;
    }

    /**
     * cstcndgrp3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstcndgrp3() {
        return cstcndgrp3;
    }

    /**
     * cstcndgrp3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstcndgrp3(String value) {
        this.cstcndgrp3 = value;
    }

    /**
     * cstcndgrp4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstcndgrp4() {
        return cstcndgrp4;
    }

    /**
     * cstcndgrp4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstcndgrp4(String value) {
        this.cstcndgrp4 = value;
    }

    /**
     * cstcndgrp5 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstcndgrp5() {
        return cstcndgrp5;
    }

    /**
     * cstcndgrp5 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstcndgrp5(String value) {
        this.cstcndgrp5 = value;
    }

    /**
     * dlvTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvTime() {
        return dlvTime;
    }

    /**
     * dlvTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlvTime(String value) {
        this.dlvTime = value;
    }

    /**
     * salesUnit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesUnit() {
        return salesUnit;
    }

    /**
     * salesUnit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesUnit(String value) {
        this.salesUnit = value;
    }

    /**
     * sUnitIso 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUnitIso() {
        return sUnitIso;
    }

    /**
     * sUnitIso 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUnitIso(String value) {
        this.sUnitIso = value;
    }

    /**
     * trgQtyNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrgQtyNo() {
        return trgQtyNo;
    }

    /**
     * trgQtyNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTrgQtyNo(BigDecimal value) {
        this.trgQtyNo = value;
    }

    /**
     * trgqtyDen 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrgqtyDen() {
        return trgqtyDen;
    }

    /**
     * trgqtyDen 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTrgqtyDen(BigDecimal value) {
        this.trgqtyDen = value;
    }

    /**
     * rnddlvQty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRnddlvQty() {
        return rnddlvQty;
    }

    /**
     * rnddlvQty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRnddlvQty(BigDecimal value) {
        this.rnddlvQty = value;
    }

    /**
     * maxdevamnt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxdevamnt() {
        return maxdevamnt;
    }

    /**
     * maxdevamnt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxdevamnt(BigDecimal value) {
        this.maxdevamnt = value;
    }

    /**
     * maxdevper 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxdevper() {
        return maxdevper;
    }

    /**
     * maxdevper 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxdevper(BigDecimal value) {
        this.maxdevper = value;
    }

    /**
     * maxdevDay 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxdevDay() {
        return maxdevDay;
    }

    /**
     * maxdevDay 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxdevDay(BigDecimal value) {
        this.maxdevDay = value;
    }

    /**
     * usageInd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageInd() {
        return usageInd;
    }

    /**
     * usageInd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageInd(String value) {
        this.usageInd = value;
    }

    /**
     * fixedQuan 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixedQuan() {
        return fixedQuan;
    }

    /**
     * fixedQuan 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixedQuan(String value) {
        this.fixedQuan = value;
    }

    /**
     * unlmtDlv 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnlmtDlv() {
        return unlmtDlv;
    }

    /**
     * unlmtDlv 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnlmtDlv(String value) {
        this.unlmtDlv = value;
    }

    /**
     * overdlvtol 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverdlvtol() {
        return overdlvtol;
    }

    /**
     * overdlvtol 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverdlvtol(BigDecimal value) {
        this.overdlvtol = value;
    }

    /**
     * unddlvTol 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnddlvTol() {
        return unddlvTol;
    }

    /**
     * unddlvTol 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnddlvTol(BigDecimal value) {
        this.unddlvTol = value;
    }

    /**
     * division 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision() {
        return division;
    }

    /**
     * division 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision(String value) {
        this.division = value;
    }

    /**
     * salqtynum 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalqtynum() {
        return salqtynum;
    }

    /**
     * salqtynum 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalqtynum(BigDecimal value) {
        this.salqtynum = value;
    }

    /**
     * salqtyden 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalqtyden() {
        return salqtyden;
    }

    /**
     * salqtyden 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalqtyden(BigDecimal value) {
        this.salqtyden = value;
    }

    /**
     * grossWght 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossWght() {
        return grossWght;
    }

    /**
     * grossWght 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossWght(BigDecimal value) {
        this.grossWght = value;
    }

    /**
     * netWeight 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetWeight() {
        return netWeight;
    }

    /**
     * netWeight 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetWeight(BigDecimal value) {
        this.netWeight = value;
    }

    /**
     * untofWght 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUntofWght() {
        return untofWght;
    }

    /**
     * untofWght 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUntofWght(String value) {
        this.untofWght = value;
    }

    /**
     * unofWtiso 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnofWtiso() {
        return unofWtiso;
    }

    /**
     * unofWtiso 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnofWtiso(String value) {
        this.unofWtiso = value;
    }

    /**
     * volume 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolume() {
        return volume;
    }

    /**
     * volume 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolume(BigDecimal value) {
        this.volume = value;
    }

    /**
     * volunit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolunit() {
        return volunit;
    }

    /**
     * volunit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolunit(String value) {
        this.volunit = value;
    }

    /**
     * volunitiso 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolunitiso() {
        return volunitiso;
    }

    /**
     * volunitiso 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolunitiso(String value) {
        this.volunitiso = value;
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
     * shipPoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipPoint() {
        return shipPoint;
    }

    /**
     * shipPoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipPoint(String value) {
        this.shipPoint = value;
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
     * createdBy 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * createdBy 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
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
     * matPrGrp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatPrGrp() {
        return matPrGrp;
    }

    /**
     * matPrGrp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatPrGrp(String value) {
        this.matPrGrp = value;
    }

    /**
     * valType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValType() {
        return valType;
    }

    /**
     * valType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValType(String value) {
        this.valType = value;
    }

    /**
     * fixdatQty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixdatQty() {
        return fixdatQty;
    }

    /**
     * fixdatQty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixdatQty(String value) {
        this.fixdatQty = value;
    }

    /**
     * bomexplNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBomexplNo() {
        return bomexplNo;
    }

    /**
     * bomexplNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBomexplNo(String value) {
        this.bomexplNo = value;
    }

    /**
     * resanalkey 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResanalkey() {
        return resanalkey;
    }

    /**
     * resanalkey 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResanalkey(String value) {
        this.resanalkey = value;
    }

    /**
     * reqmtsTyp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqmtsTyp() {
        return reqmtsTyp;
    }

    /**
     * reqmtsTyp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqmtsTyp(String value) {
        this.reqmtsTyp = value;
    }

    /**
     * noGrPost 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoGrPost() {
        return noGrPost;
    }

    /**
     * noGrPost 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoGrPost(String value) {
        this.noGrPost = value;
    }

    /**
     * busTranst 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusTranst() {
        return busTranst;
    }

    /**
     * busTranst 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusTranst(String value) {
        this.busTranst = value;
    }

    /**
     * overhdKey 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverhdKey() {
        return overhdKey;
    }

    /**
     * overhdKey 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverhdKey(String value) {
        this.overhdKey = value;
    }

    /**
     * cstgSheet 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstgSheet() {
        return cstgSheet;
    }

    /**
     * cstgSheet 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstgSheet(String value) {
        this.cstgSheet = value;
    }

    /**
     * matfrgtgrp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatfrgtgrp() {
        return matfrgtgrp;
    }

    /**
     * matfrgtgrp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatfrgtgrp(String value) {
        this.matfrgtgrp = value;
    }

    /**
     * pldlvshdin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPldlvshdin() {
        return pldlvshdin;
    }

    /**
     * pldlvshdin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPldlvshdin(String value) {
        this.pldlvshdin = value;
    }

    /**
     * seqNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqNo() {
        return seqNo;
    }

    /**
     * seqNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqNo(String value) {
        this.seqNo = value;
    }

    /**
     * bilForm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilForm() {
        return bilForm;
    }

    /**
     * bilForm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilForm(String value) {
        this.bilForm = value;
    }

    /**
     * dliProfil 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDliProfil() {
        return dliProfil;
    }

    /**
     * dliProfil 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDliProfil(String value) {
        this.dliProfil = value;
    }

    /**
     * revType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevType() {
        return revType;
    }

    /**
     * revType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevType(String value) {
        this.revType = value;
    }

    /**
     * begdemPer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBegdemPer() {
        return begdemPer;
    }

    /**
     * begdemPer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBegdemPer(String value) {
        this.begdemPer = value;
    }

    /**
     * prRefMat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrRefMat() {
        return prRefMat;
    }

    /**
     * prRefMat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrRefMat(String value) {
        this.prRefMat = value;
    }

    /**
     * refobjtype 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefobjtype() {
        return refobjtype;
    }

    /**
     * refobjtype 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefobjtype(String value) {
        this.refobjtype = value;
    }

    /**
     * refobjkey 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefobjkey() {
        return refobjkey;
    }

    /**
     * refobjkey 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefobjkey(String value) {
        this.refobjkey = value;
    }

    /**
     * reflogsys 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReflogsys() {
        return reflogsys;
    }

    /**
     * reflogsys 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReflogsys(String value) {
        this.reflogsys = value;
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
     * cfopCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfopCode() {
        return cfopCode;
    }

    /**
     * cfopCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfopCode(String value) {
        this.cfopCode = value;
    }

    /**
     * taxlawicms 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxlawicms() {
        return taxlawicms;
    }

    /**
     * taxlawicms 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxlawicms(String value) {
        this.taxlawicms = value;
    }

    /**
     * taxlawipi 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxlawipi() {
        return taxlawipi;
    }

    /**
     * taxlawipi 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxlawipi(String value) {
        this.taxlawipi = value;
    }

    /**
     * sdTaxcode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSdTaxcode() {
        return sdTaxcode;
    }

    /**
     * sdTaxcode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSdTaxcode(String value) {
        this.sdTaxcode = value;
    }

    /**
     * assortMod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssortMod() {
        return assortMod;
    }

    /**
     * assortMod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssortMod(String value) {
        this.assortMod = value;
    }

    /**
     * compQuant 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCompQuant() {
        return compQuant;
    }

    /**
     * compQuant 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCompQuant(BigDecimal value) {
        this.compQuant = value;
    }

    /**
     * targetVal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTargetVal() {
        return targetVal;
    }

    /**
     * targetVal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTargetVal(BigDecimal value) {
        this.targetVal = value;
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
     * currIso 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrIso() {
        return currIso;
    }

    /**
     * currIso 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrIso(String value) {
        this.currIso = value;
    }

    /**
     * profitCtr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfitCtr() {
        return profitCtr;
    }

    /**
     * profitCtr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfitCtr(String value) {
        this.profitCtr = value;
    }

    /**
     * orderid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * orderid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderid(String value) {
        this.orderid = value;
    }

    /**
     * wbsElem 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWbsElem() {
        return wbsElem;
    }

    /**
     * wbsElem 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWbsElem(String value) {
        this.wbsElem = value;
    }

    /**
     * deprecPer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeprecPer() {
        return deprecPer;
    }

    /**
     * deprecPer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeprecPer(BigDecimal value) {
        this.deprecPer = value;
    }

    /**
     * refDoc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefDoc() {
        return refDoc;
    }

    /**
     * refDoc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefDoc(String value) {
        this.refDoc = value;
    }

    /**
     * refDocIt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefDocIt() {
        return refDocIt;
    }

    /**
     * refDocIt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefDocIt(String value) {
        this.refDocIt = value;
    }

    /**
     * refDocCa 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefDocCa() {
        return refDocCa;
    }

    /**
     * refDocCa 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefDocCa(String value) {
        this.refDocCa = value;
    }

    /**
     * custMat35 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustMat35() {
        return custMat35;
    }

    /**
     * custMat35 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustMat35(String value) {
        this.custMat35 = value;
    }

    /**
     * exchRateFiV 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchRateFiV() {
        return exchRateFiV;
    }

    /**
     * exchRateFiV 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchRateFiV(BigDecimal value) {
        this.exchRateFiV = value;
    }

    /**
     * exchgRateV 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchgRateV() {
        return exchgRateV;
    }

    /**
     * exchgRateV 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchgRateV(BigDecimal value) {
        this.exchgRateV = value;
    }

    /**
     * itemguidAtp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemguidAtp() {
        return itemguidAtp;
    }

    /**
     * itemguidAtp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemguidAtp(String value) {
        this.itemguidAtp = value;
    }

    /**
     * valContr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValContr() {
        return valContr;
    }

    /**
     * valContr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValContr(String value) {
        this.valContr = value;
    }

    /**
     * valConI 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValConI() {
        return valConI;
    }

    /**
     * valConI 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValConI(String value) {
        this.valConI = value;
    }

    /**
     * configId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigId() {
        return configId;
    }

    /**
     * configId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigId(String value) {
        this.configId = value;
    }

    /**
     * instId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstId() {
        return instId;
    }

    /**
     * instId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstId(String value) {
        this.instId = value;
    }

    /**
     * matExt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatExt() {
        return matExt;
    }

    /**
     * matExt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatExt(String value) {
        this.matExt = value;
    }

    /**
     * matGuid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatGuid() {
        return matGuid;
    }

    /**
     * matGuid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatGuid(String value) {
        this.matGuid = value;
    }

    /**
     * matVers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatVers() {
        return matVers;
    }

    /**
     * matVers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatVers(String value) {
        this.matVers = value;
    }

    /**
     * pMatExt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMatExt() {
        return pMatExt;
    }

    /**
     * pMatExt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMatExt(String value) {
        this.pMatExt = value;
    }

    /**
     * pMatGuid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMatGuid() {
        return pMatGuid;
    }

    /**
     * pMatGuid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMatGuid(String value) {
        this.pMatGuid = value;
    }

    /**
     * pMatVers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMatVers() {
        return pMatVers;
    }

    /**
     * pMatVers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMatVers(String value) {
        this.pMatVers = value;
    }

    /**
     * funcArea 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuncArea() {
        return funcArea;
    }

    /**
     * funcArea 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuncArea(String value) {
        this.funcArea = value;
    }

    /**
     * alternBom 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternBom() {
        return alternBom;
    }

    /**
     * alternBom 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternBom(String value) {
        this.alternBom = value;
    }

    /**
     * fkkConacct 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFkkConacct() {
        return fkkConacct;
    }

    /**
     * fkkConacct 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFkkConacct(String value) {
        this.fkkConacct = value;
    }

    /**
     * eanUpc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEanUpc() {
        return eanUpc;
    }

    /**
     * eanUpc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEanUpc(String value) {
        this.eanUpc = value;
    }

    /**
     * prodcat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdcat() {
        return prodcat;
    }

    /**
     * prodcat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdcat(String value) {
        this.prodcat = value;
    }

    /**
     * shipType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipType() {
        return shipType;
    }

    /**
     * shipType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipType(String value) {
        this.shipType = value;
    }

    /**
     * sProcInd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSProcInd() {
        return sProcInd;
    }

    /**
     * sProcInd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSProcInd(String value) {
        this.sProcInd = value;
    }

    /**
     * funcAreaLong 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuncAreaLong() {
        return funcAreaLong;
    }

    /**
     * funcAreaLong 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuncAreaLong(String value) {
        this.funcAreaLong = value;
    }

    /**
     * billRel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillRel() {
        return billRel;
    }

    /**
     * billRel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillRel(String value) {
        this.billRel = value;
    }

    /**
     * vwUepos 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVwUepos() {
        return vwUepos;
    }

    /**
     * vwUepos 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVwUepos(String value) {
        this.vwUepos = value;
    }

    /**
     * campaign 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCampaign() {
        return campaign;
    }

    /**
     * campaign 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCampaign(byte[] value) {
        this.campaign = value;
    }

    /**
     * dlvschduse 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvschduse() {
        return dlvschduse;
    }

    /**
     * dlvschduse 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlvschduse(String value) {
        this.dlvschduse = value;
    }

    /**
     * cfopLong 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfopLong() {
        return cfopLong;
    }

    /**
     * cfopLong 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfopLong(String value) {
        this.cfopLong = value;
    }

    /**
     * selection 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelection() {
        return selection;
    }

    /**
     * selection 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelection(String value) {
        this.selection = value;
    }

    /**
     * matEntrd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatEntrd() {
        return matEntrd;
    }

    /**
     * matEntrd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatEntrd(String value) {
        this.matEntrd = value;
    }

    /**
     * logSystemOwn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogSystemOwn() {
        return logSystemOwn;
    }

    /**
     * logSystemOwn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogSystemOwn(String value) {
        this.logSystemOwn = value;
    }

    /**
     * itmTypeUsage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItmTypeUsage() {
        return itmTypeUsage;
    }

    /**
     * itmTypeUsage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItmTypeUsage(String value) {
        this.itmTypeUsage = value;
    }

    /**
     * taxlawiss 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxlawiss() {
        return taxlawiss;
    }

    /**
     * taxlawiss 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxlawiss(String value) {
        this.taxlawiss = value;
    }

    /**
     * matEntrdExternal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatEntrdExternal() {
        return matEntrdExternal;
    }

    /**
     * matEntrdExternal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatEntrdExternal(String value) {
        this.matEntrdExternal = value;
    }

    /**
     * matEntrdGuid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatEntrdGuid() {
        return matEntrdGuid;
    }

    /**
     * matEntrdGuid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatEntrdGuid(String value) {
        this.matEntrdGuid = value;
    }

    /**
     * matEntrdVersion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatEntrdVersion() {
        return matEntrdVersion;
    }

    /**
     * matEntrdVersion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatEntrdVersion(String value) {
        this.matEntrdVersion = value;
    }

    /**
     * locTaxcat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocTaxcat() {
        return locTaxcat;
    }

    /**
     * locTaxcat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocTaxcat(String value) {
        this.locTaxcat = value;
    }

    /**
     * locZerovat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocZerovat() {
        return locZerovat;
    }

    /**
     * locZerovat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocZerovat(String value) {
        this.locZerovat = value;
    }

    /**
     * locActcode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocActcode() {
        return locActcode;
    }

    /**
     * locActcode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocActcode(String value) {
        this.locActcode = value;
    }

    /**
     * locDisttype 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocDisttype() {
        return locDisttype;
    }

    /**
     * locDisttype 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocDisttype(String value) {
        this.locDisttype = value;
    }

    /**
     * locTxrelclas 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocTxrelclas() {
        return locTxrelclas;
    }

    /**
     * locTxrelclas 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocTxrelclas(String value) {
        this.locTxrelclas = value;
    }

    /**
     * calcMotive 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalcMotive() {
        return calcMotive;
    }

    /**
     * calcMotive 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalcMotive(String value) {
        this.calcMotive = value;
    }

    /**
     * compreas 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompreas() {
        return compreas;
    }

    /**
     * compreas 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompreas(String value) {
        this.compreas = value;
    }

    /**
     * fund 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFund() {
        return fund;
    }

    /**
     * fund 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFund(String value) {
        this.fund = value;
    }

    /**
     * fundsCtr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundsCtr() {
        return fundsCtr;
    }

    /**
     * fundsCtr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundsCtr(String value) {
        this.fundsCtr = value;
    }

    /**
     * cmmtItem 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmmtItem() {
        return cmmtItem;
    }

    /**
     * cmmtItem 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmmtItem(String value) {
        this.cmmtItem = value;
    }

    /**
     * grantNbr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrantNbr() {
        return grantNbr;
    }

    /**
     * grantNbr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrantNbr(String value) {
        this.grantNbr = value;
    }

    /**
     * budgetPeriod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBudgetPeriod() {
        return budgetPeriod;
    }

    /**
     * budgetPeriod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBudgetPeriod(String value) {
        this.budgetPeriod = value;
    }

    /**
     * taxlawcofins 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxlawcofins() {
        return taxlawcofins;
    }

    /**
     * taxlawcofins 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxlawcofins(String value) {
        this.taxlawcofins = value;
    }

    /**
     * taxlawpis 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxlawpis() {
        return taxlawpis;
    }

    /**
     * taxlawpis 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxlawpis(String value) {
        this.taxlawpis = value;
    }

    /**
     * treasuryAccSymbol 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreasuryAccSymbol() {
        return treasuryAccSymbol;
    }

    /**
     * treasuryAccSymbol 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreasuryAccSymbol(String value) {
        this.treasuryAccSymbol = value;
    }

    /**
     * businessEventTcode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessEventTcode() {
        return businessEventTcode;
    }

    /**
     * businessEventTcode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessEventTcode(String value) {
        this.businessEventTcode = value;
    }

    /**
     * modificationAllowed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationAllowed() {
        return modificationAllowed;
    }

    /**
     * modificationAllowed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationAllowed(String value) {
        this.modificationAllowed = value;
    }

    /**
     * cancellationAllowed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellationAllowed() {
        return cancellationAllowed;
    }

    /**
     * cancellationAllowed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationAllowed(String value) {
        this.cancellationAllowed = value;
    }

    /**
     * paymentMethods 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethods() {
        return paymentMethods;
    }

    /**
     * paymentMethods 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethods(String value) {
        this.paymentMethods = value;
    }

    /**
     * businessPartnerNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPartnerNo() {
        return businessPartnerNo;
    }

    /**
     * businessPartnerNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPartnerNo(String value) {
        this.businessPartnerNo = value;
    }

    /**
     * reportingFreq 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingFreq() {
        return reportingFreq;
    }

    /**
     * reportingFreq 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingFreq(String value) {
        this.reportingFreq = value;
    }

}
