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
 * <p>HumRepack complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="HumRepack"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Sourcehu" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="Desthu" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="Packhu" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="PackQty" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/&gt;
 *         &lt;element name="BaseUom" type="{urn:sap-com:document:sap:rfc:functions}unit3"/&gt;
 *         &lt;element name="Material" type="{urn:sap-com:document:sap:rfc:functions}char18"/&gt;
 *         &lt;element name="Batch" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Plant" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="StgeLoc" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="StockCat" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpecStock" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SpStckNo" type="{urn:sap-com:document:sap:rfc:functions}char16"/&gt;
 *         &lt;element name="DelivNumb" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="DelivItem" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HumRepack", propOrder = {
    "sourcehu",
    "desthu",
    "packhu",
    "packQty",
    "baseUom",
    "material",
    "batch",
    "plant",
    "stgeLoc",
    "stockCat",
    "specStock",
    "spStckNo",
    "delivNumb",
    "delivItem"
})
public class HumRepack {

    @XmlElement(name = "Sourcehu", required = true)
    protected String sourcehu;
    @XmlElement(name = "Desthu", required = true)
    protected String desthu;
    @XmlElement(name = "Packhu", required = true)
    protected String packhu;
    @XmlElement(name = "PackQty", required = true)
    protected BigDecimal packQty;
    @XmlElement(name = "BaseUom", required = true)
    protected String baseUom;
    @XmlElement(name = "Material", required = true)
    protected String material;
    @XmlElement(name = "Batch", required = true)
    protected String batch;
    @XmlElement(name = "Plant", required = true)
    protected String plant;
    @XmlElement(name = "StgeLoc", required = true)
    protected String stgeLoc;
    @XmlElement(name = "StockCat", required = true)
    protected String stockCat;
    @XmlElement(name = "SpecStock", required = true)
    protected String specStock;
    @XmlElement(name = "SpStckNo", required = true)
    protected String spStckNo;
    @XmlElement(name = "DelivNumb", required = true)
    protected String delivNumb;
    @XmlElement(name = "DelivItem", required = true)
    protected String delivItem;

    /**
     * sourcehu 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcehu() {
        return sourcehu;
    }

    /**
     * sourcehu 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcehu(String value) {
        this.sourcehu = value;
    }

    /**
     * desthu 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesthu() {
        return desthu;
    }

    /**
     * desthu 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesthu(String value) {
        this.desthu = value;
    }

    /**
     * packhu 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackhu() {
        return packhu;
    }

    /**
     * packhu 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackhu(String value) {
        this.packhu = value;
    }

    /**
     * packQty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPackQty() {
        return packQty;
    }

    /**
     * packQty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPackQty(BigDecimal value) {
        this.packQty = value;
    }

    /**
     * baseUom 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseUom() {
        return baseUom;
    }

    /**
     * baseUom 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseUom(String value) {
        this.baseUom = value;
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
     * stgeLoc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStgeLoc() {
        return stgeLoc;
    }

    /**
     * stgeLoc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStgeLoc(String value) {
        this.stgeLoc = value;
    }

    /**
     * stockCat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockCat() {
        return stockCat;
    }

    /**
     * stockCat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockCat(String value) {
        this.stockCat = value;
    }

    /**
     * specStock 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecStock() {
        return specStock;
    }

    /**
     * specStock 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecStock(String value) {
        this.specStock = value;
    }

    /**
     * spStckNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpStckNo() {
        return spStckNo;
    }

    /**
     * spStckNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpStckNo(String value) {
        this.spStckNo = value;
    }

    /**
     * delivNumb 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelivNumb() {
        return delivNumb;
    }

    /**
     * delivNumb 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelivNumb(String value) {
        this.delivNumb = value;
    }

    /**
     * delivItem 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelivItem() {
        return delivItem;
    }

    /**
     * delivItem 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelivItem(String value) {
        this.delivItem = value;
    }

}
