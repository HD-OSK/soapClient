//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.06.02 시간 07:11:22 PM KST 
//


package com.handok.soapClient.client.zsd_cust_return_create_ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Bapicuprt complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Bapicuprt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConfigId" type="{urn:sap-com:document:sap:rfc:functions}char6"/&gt;
 *         &lt;element name="ParentId" type="{urn:sap-com:document:sap:rfc:functions}char8"/&gt;
 *         &lt;element name="InstId" type="{urn:sap-com:document:sap:rfc:functions}char8"/&gt;
 *         &lt;element name="PartOfNo" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="ObjType" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="ClassType" type="{urn:sap-com:document:sap:rfc:functions}char3"/&gt;
 *         &lt;element name="ObjKey" type="{urn:sap-com:document:sap:rfc:functions}char50"/&gt;
 *         &lt;element name="Author" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="SalesRelevant" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="PartOfGuid" type="{urn:sap-com:document:sap:rfc:functions}char32"/&gt;
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
    "configId",
    "parentId",
    "instId",
    "partOfNo",
    "objType",
    "classType",
    "objKey",
    "author",
    "salesRelevant",
    "partOfGuid"
})
public class Bapicuprt {

    @XmlElement(name = "ConfigId", required = true)
    protected String configId;
    @XmlElement(name = "ParentId", required = true)
    protected String parentId;
    @XmlElement(name = "InstId", required = true)
    protected String instId;
    @XmlElement(name = "PartOfNo", required = true)
    protected String partOfNo;
    @XmlElement(name = "ObjType", required = true)
    protected String objType;
    @XmlElement(name = "ClassType", required = true)
    protected String classType;
    @XmlElement(name = "ObjKey", required = true)
    protected String objKey;
    @XmlElement(name = "Author", required = true)
    protected String author;
    @XmlElement(name = "SalesRelevant", required = true)
    protected String salesRelevant;
    @XmlElement(name = "PartOfGuid", required = true)
    protected String partOfGuid;

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
     * parentId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * parentId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentId(String value) {
        this.parentId = value;
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
     * partOfNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartOfNo() {
        return partOfNo;
    }

    /**
     * partOfNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartOfNo(String value) {
        this.partOfNo = value;
    }

    /**
     * objType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjType() {
        return objType;
    }

    /**
     * objType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjType(String value) {
        this.objType = value;
    }

    /**
     * classType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassType() {
        return classType;
    }

    /**
     * classType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassType(String value) {
        this.classType = value;
    }

    /**
     * objKey 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjKey() {
        return objKey;
    }

    /**
     * objKey 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjKey(String value) {
        this.objKey = value;
    }

    /**
     * author 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * author 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * salesRelevant 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesRelevant() {
        return salesRelevant;
    }

    /**
     * salesRelevant 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesRelevant(String value) {
        this.salesRelevant = value;
    }

    /**
     * partOfGuid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartOfGuid() {
        return partOfGuid;
    }

    /**
     * partOfGuid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartOfGuid(String value) {
        this.partOfGuid = value;
    }

}
