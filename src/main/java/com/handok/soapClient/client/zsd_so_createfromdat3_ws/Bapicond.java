//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.06.02 시간 07:11:24 PM KST 
//


package com.handok.soapClient.client.zsd_so_createfromdat3_ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Bapicond complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Bapicond"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItmNumber" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *         &lt;element name="CondStNo" type="{urn:sap-com:document:sap:rfc:functions}numeric3"/&gt;
 *         &lt;element name="CondCount" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/&gt;
 *         &lt;element name="CondType" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="CondValue" type="{urn:sap-com:document:sap:rfc:functions}decimal28.9"/&gt;
 *         &lt;element name="Currency" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/&gt;
 *         &lt;element name="CondUnit" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="CondPUnt" type="{urn:sap-com:document:sap:rfc:functions}decimal5.0"/&gt;
 *         &lt;element name="CurrIso" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="CdUntIso" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Refobjtype" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Refobjkey" type="{urn:sap-com:document:sap:rfc:functions}char70"/&gt;
 *         &lt;element name="Reflogsys" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Applicatio" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Conpricdat" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Calctypcon" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Conbaseval" type="{urn:sap-com:document:sap:rfc:functions}decimal28.9"/&gt;
 *         &lt;element name="Conexchrat" type="{urn:sap-com:document:sap:rfc:functions}decimal9.5"/&gt;
 *         &lt;element name="Numconvert" type="{urn:sap-com:document:sap:rfc:functions}decimal5.0"/&gt;
 *         &lt;element name="Denominato" type="{urn:sap-com:document:sap:rfc:functions}decimal5.0"/&gt;
 *         &lt;element name="Condtype" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="StatCon" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Scaletype" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Accruals" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Coninvolst" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Condorigin" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Groupcond" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="CondUpdat" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="AccessSeq" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/&gt;
 *         &lt;element name="Condcount" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/&gt;
 *         &lt;element name="Roundoffdi" type="{urn:sap-com:document:sap:rfc:functions}decimal28.9"/&gt;
 *         &lt;element name="Condvalue" type="{urn:sap-com:document:sap:rfc:functions}decimal28.9"/&gt;
 *         &lt;element name="Currency2" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/&gt;
 *         &lt;element name="CurrIso2" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Condcntrl" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Condisacti" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Condclass" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Factbasval" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Scalebasin" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Scalbasval" type="{urn:sap-com:document:sap:rfc:functions}decimal28.9"/&gt;
 *         &lt;element name="Unitmeasur" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="IsoUnit" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Currenckey" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/&gt;
 *         &lt;element name="Curreniso" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="Condincomp" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Condconfig" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Condchaman" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="CondNo" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="TaxCode" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Varcond" type="{urn:sap-com:document:sap:rfc:functions}char26"/&gt;
 *         &lt;element name="Accountkey" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="AccountKe" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="WtWithcd" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Structcond" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Factconbas" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Condcoinhd" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/&gt;
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
    "condStNo",
    "condCount",
    "condType",
    "condValue",
    "currency",
    "condUnit",
    "condPUnt",
    "currIso",
    "cdUntIso",
    "refobjtype",
    "refobjkey",
    "reflogsys",
    "applicatio",
    "conpricdat",
    "calctypcon",
    "conbaseval",
    "conexchrat",
    "numconvert",
    "denominato",
    "condtype",
    "statCon",
    "scaletype",
    "accruals",
    "coninvolst",
    "condorigin",
    "groupcond",
    "condUpdat",
    "accessSeq",
    "condcount",
    "roundoffdi",
    "condvalue",
    "currency2",
    "currIso2",
    "condcntrl",
    "condisacti",
    "condclass",
    "factbasval",
    "scalebasin",
    "scalbasval",
    "unitmeasur",
    "isoUnit",
    "currenckey",
    "curreniso",
    "condincomp",
    "condconfig",
    "condchaman",
    "condNo",
    "taxCode",
    "varcond",
    "accountkey",
    "accountKe",
    "wtWithcd",
    "structcond",
    "factconbas",
    "condcoinhd"
})
public class Bapicond {

    @XmlElement(name = "ItmNumber", required = true)
    protected String itmNumber;
    @XmlElement(name = "CondStNo", required = true)
    protected String condStNo;
    @XmlElement(name = "CondCount", required = true)
    protected String condCount;
    @XmlElement(name = "CondType", required = true)
    protected String condType;
    @XmlElement(name = "CondValue", required = true)
    protected BigDecimal condValue;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "CondUnit", required = true)
    protected String condUnit;
    @XmlElement(name = "CondPUnt", required = true)
    protected BigDecimal condPUnt;
    @XmlElement(name = "CurrIso", required = true)
    protected String currIso;
    @XmlElement(name = "CdUntIso", required = true)
    protected String cdUntIso;
    @XmlElement(name = "Refobjtype", required = true)
    protected String refobjtype;
    @XmlElement(name = "Refobjkey", required = true)
    protected String refobjkey;
    @XmlElement(name = "Reflogsys", required = true)
    protected String reflogsys;
    @XmlElement(name = "Applicatio", required = true)
    protected String applicatio;
    @XmlElement(name = "Conpricdat", required = true)
    protected String conpricdat;
    @XmlElement(name = "Calctypcon", required = true)
    protected String calctypcon;
    @XmlElement(name = "Conbaseval", required = true)
    protected BigDecimal conbaseval;
    @XmlElement(name = "Conexchrat", required = true)
    protected BigDecimal conexchrat;
    @XmlElement(name = "Numconvert", required = true)
    protected BigDecimal numconvert;
    @XmlElement(name = "Denominato", required = true)
    protected BigDecimal denominato;
    @XmlElement(name = "Condtype", required = true)
    protected String condtype;
    @XmlElement(name = "StatCon", required = true)
    protected String statCon;
    @XmlElement(name = "Scaletype", required = true)
    protected String scaletype;
    @XmlElement(name = "Accruals", required = true)
    protected String accruals;
    @XmlElement(name = "Coninvolst", required = true)
    protected String coninvolst;
    @XmlElement(name = "Condorigin", required = true)
    protected String condorigin;
    @XmlElement(name = "Groupcond", required = true)
    protected String groupcond;
    @XmlElement(name = "CondUpdat", required = true)
    protected String condUpdat;
    @XmlElement(name = "AccessSeq", required = true)
    protected String accessSeq;
    @XmlElement(name = "Condcount", required = true)
    protected String condcount;
    @XmlElement(name = "Roundoffdi", required = true)
    protected BigDecimal roundoffdi;
    @XmlElement(name = "Condvalue", required = true)
    protected BigDecimal condvalue;
    @XmlElement(name = "Currency2", required = true)
    protected String currency2;
    @XmlElement(name = "CurrIso2", required = true)
    protected String currIso2;
    @XmlElement(name = "Condcntrl", required = true)
    protected String condcntrl;
    @XmlElement(name = "Condisacti", required = true)
    protected String condisacti;
    @XmlElement(name = "Condclass", required = true)
    protected String condclass;
    @XmlElement(name = "Factbasval")
    protected float factbasval;
    @XmlElement(name = "Scalebasin", required = true)
    protected String scalebasin;
    @XmlElement(name = "Scalbasval", required = true)
    protected BigDecimal scalbasval;
    @XmlElement(name = "Unitmeasur", required = true)
    protected String unitmeasur;
    @XmlElement(name = "IsoUnit", required = true)
    protected String isoUnit;
    @XmlElement(name = "Currenckey", required = true)
    protected String currenckey;
    @XmlElement(name = "Curreniso", required = true)
    protected String curreniso;
    @XmlElement(name = "Condincomp", required = true)
    protected String condincomp;
    @XmlElement(name = "Condconfig", required = true)
    protected String condconfig;
    @XmlElement(name = "Condchaman", required = true)
    protected String condchaman;
    @XmlElement(name = "CondNo", required = true)
    protected String condNo;
    @XmlElement(name = "TaxCode", required = true)
    protected String taxCode;
    @XmlElement(name = "Varcond", required = true)
    protected String varcond;
    @XmlElement(name = "Accountkey", required = true)
    protected String accountkey;
    @XmlElement(name = "AccountKe", required = true)
    protected String accountKe;
    @XmlElement(name = "WtWithcd", required = true)
    protected String wtWithcd;
    @XmlElement(name = "Structcond", required = true)
    protected String structcond;
    @XmlElement(name = "Factconbas")
    protected float factconbas;
    @XmlElement(name = "Condcoinhd", required = true)
    protected String condcoinhd;

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
     * condStNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondStNo() {
        return condStNo;
    }

    /**
     * condStNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondStNo(String value) {
        this.condStNo = value;
    }

    /**
     * condCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondCount() {
        return condCount;
    }

    /**
     * condCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondCount(String value) {
        this.condCount = value;
    }

    /**
     * condType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondType() {
        return condType;
    }

    /**
     * condType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondType(String value) {
        this.condType = value;
    }

    /**
     * condValue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCondValue() {
        return condValue;
    }

    /**
     * condValue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCondValue(BigDecimal value) {
        this.condValue = value;
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
     * condUnit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondUnit() {
        return condUnit;
    }

    /**
     * condUnit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondUnit(String value) {
        this.condUnit = value;
    }

    /**
     * condPUnt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCondPUnt() {
        return condPUnt;
    }

    /**
     * condPUnt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCondPUnt(BigDecimal value) {
        this.condPUnt = value;
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
     * cdUntIso 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdUntIso() {
        return cdUntIso;
    }

    /**
     * cdUntIso 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdUntIso(String value) {
        this.cdUntIso = value;
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
     * applicatio 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicatio() {
        return applicatio;
    }

    /**
     * applicatio 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicatio(String value) {
        this.applicatio = value;
    }

    /**
     * conpricdat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConpricdat() {
        return conpricdat;
    }

    /**
     * conpricdat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConpricdat(String value) {
        this.conpricdat = value;
    }

    /**
     * calctypcon 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalctypcon() {
        return calctypcon;
    }

    /**
     * calctypcon 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalctypcon(String value) {
        this.calctypcon = value;
    }

    /**
     * conbaseval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConbaseval() {
        return conbaseval;
    }

    /**
     * conbaseval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConbaseval(BigDecimal value) {
        this.conbaseval = value;
    }

    /**
     * conexchrat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConexchrat() {
        return conexchrat;
    }

    /**
     * conexchrat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConexchrat(BigDecimal value) {
        this.conexchrat = value;
    }

    /**
     * numconvert 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumconvert() {
        return numconvert;
    }

    /**
     * numconvert 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumconvert(BigDecimal value) {
        this.numconvert = value;
    }

    /**
     * denominato 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDenominato() {
        return denominato;
    }

    /**
     * denominato 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDenominato(BigDecimal value) {
        this.denominato = value;
    }

    /**
     * condtype 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondtype() {
        return condtype;
    }

    /**
     * condtype 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondtype(String value) {
        this.condtype = value;
    }

    /**
     * statCon 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatCon() {
        return statCon;
    }

    /**
     * statCon 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatCon(String value) {
        this.statCon = value;
    }

    /**
     * scaletype 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScaletype() {
        return scaletype;
    }

    /**
     * scaletype 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScaletype(String value) {
        this.scaletype = value;
    }

    /**
     * accruals 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccruals() {
        return accruals;
    }

    /**
     * accruals 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccruals(String value) {
        this.accruals = value;
    }

    /**
     * coninvolst 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConinvolst() {
        return coninvolst;
    }

    /**
     * coninvolst 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConinvolst(String value) {
        this.coninvolst = value;
    }

    /**
     * condorigin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondorigin() {
        return condorigin;
    }

    /**
     * condorigin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondorigin(String value) {
        this.condorigin = value;
    }

    /**
     * groupcond 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupcond() {
        return groupcond;
    }

    /**
     * groupcond 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupcond(String value) {
        this.groupcond = value;
    }

    /**
     * condUpdat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondUpdat() {
        return condUpdat;
    }

    /**
     * condUpdat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondUpdat(String value) {
        this.condUpdat = value;
    }

    /**
     * accessSeq 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessSeq() {
        return accessSeq;
    }

    /**
     * accessSeq 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessSeq(String value) {
        this.accessSeq = value;
    }

    /**
     * condcount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondcount() {
        return condcount;
    }

    /**
     * condcount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondcount(String value) {
        this.condcount = value;
    }

    /**
     * roundoffdi 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRoundoffdi() {
        return roundoffdi;
    }

    /**
     * roundoffdi 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRoundoffdi(BigDecimal value) {
        this.roundoffdi = value;
    }

    /**
     * condvalue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCondvalue() {
        return condvalue;
    }

    /**
     * condvalue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCondvalue(BigDecimal value) {
        this.condvalue = value;
    }

    /**
     * currency2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency2() {
        return currency2;
    }

    /**
     * currency2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency2(String value) {
        this.currency2 = value;
    }

    /**
     * currIso2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrIso2() {
        return currIso2;
    }

    /**
     * currIso2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrIso2(String value) {
        this.currIso2 = value;
    }

    /**
     * condcntrl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondcntrl() {
        return condcntrl;
    }

    /**
     * condcntrl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondcntrl(String value) {
        this.condcntrl = value;
    }

    /**
     * condisacti 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondisacti() {
        return condisacti;
    }

    /**
     * condisacti 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondisacti(String value) {
        this.condisacti = value;
    }

    /**
     * condclass 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondclass() {
        return condclass;
    }

    /**
     * condclass 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondclass(String value) {
        this.condclass = value;
    }

    /**
     * factbasval 속성의 값을 가져옵니다.
     * 
     */
    public float getFactbasval() {
        return factbasval;
    }

    /**
     * factbasval 속성의 값을 설정합니다.
     * 
     */
    public void setFactbasval(float value) {
        this.factbasval = value;
    }

    /**
     * scalebasin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScalebasin() {
        return scalebasin;
    }

    /**
     * scalebasin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScalebasin(String value) {
        this.scalebasin = value;
    }

    /**
     * scalbasval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScalbasval() {
        return scalbasval;
    }

    /**
     * scalbasval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScalbasval(BigDecimal value) {
        this.scalbasval = value;
    }

    /**
     * unitmeasur 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitmeasur() {
        return unitmeasur;
    }

    /**
     * unitmeasur 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitmeasur(String value) {
        this.unitmeasur = value;
    }

    /**
     * isoUnit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoUnit() {
        return isoUnit;
    }

    /**
     * isoUnit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoUnit(String value) {
        this.isoUnit = value;
    }

    /**
     * currenckey 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrenckey() {
        return currenckey;
    }

    /**
     * currenckey 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrenckey(String value) {
        this.currenckey = value;
    }

    /**
     * curreniso 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurreniso() {
        return curreniso;
    }

    /**
     * curreniso 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurreniso(String value) {
        this.curreniso = value;
    }

    /**
     * condincomp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondincomp() {
        return condincomp;
    }

    /**
     * condincomp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondincomp(String value) {
        this.condincomp = value;
    }

    /**
     * condconfig 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondconfig() {
        return condconfig;
    }

    /**
     * condconfig 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondconfig(String value) {
        this.condconfig = value;
    }

    /**
     * condchaman 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondchaman() {
        return condchaman;
    }

    /**
     * condchaman 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondchaman(String value) {
        this.condchaman = value;
    }

    /**
     * condNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondNo() {
        return condNo;
    }

    /**
     * condNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondNo(String value) {
        this.condNo = value;
    }

    /**
     * taxCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * taxCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }

    /**
     * varcond 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVarcond() {
        return varcond;
    }

    /**
     * varcond 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVarcond(String value) {
        this.varcond = value;
    }

    /**
     * accountkey 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountkey() {
        return accountkey;
    }

    /**
     * accountkey 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountkey(String value) {
        this.accountkey = value;
    }

    /**
     * accountKe 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountKe() {
        return accountKe;
    }

    /**
     * accountKe 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountKe(String value) {
        this.accountKe = value;
    }

    /**
     * wtWithcd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWtWithcd() {
        return wtWithcd;
    }

    /**
     * wtWithcd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWtWithcd(String value) {
        this.wtWithcd = value;
    }

    /**
     * structcond 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStructcond() {
        return structcond;
    }

    /**
     * structcond 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStructcond(String value) {
        this.structcond = value;
    }

    /**
     * factconbas 속성의 값을 가져옵니다.
     * 
     */
    public float getFactconbas() {
        return factconbas;
    }

    /**
     * factconbas 속성의 값을 설정합니다.
     * 
     */
    public void setFactconbas(float value) {
        this.factconbas = value;
    }

    /**
     * condcoinhd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondcoinhd() {
        return condcoinhd;
    }

    /**
     * condcoinhd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondcoinhd(String value) {
        this.condcoinhd = value;
    }

}
