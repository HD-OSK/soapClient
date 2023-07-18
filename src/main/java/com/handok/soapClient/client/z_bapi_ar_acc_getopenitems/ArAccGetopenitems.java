//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.06.02 시간 07:11:17 PM KST 
//


package com.handok.soapClient.client.z_bapi_ar_acc_getopenitems;

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
 *         &lt;element name="Companycode" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Customer" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Keydate" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Lineitems" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapi30072"/&gt;
 *         &lt;element name="Noteditems" type="{urn:sap-com:document:sap:rfc:functions}char1" minOccurs="0"/&gt;
 *         &lt;element name="Secindex" type="{urn:sap-com:document:sap:rfc:functions}char1" minOccurs="0"/&gt;
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
    "companycode",
    "customer",
    "keydate",
    "lineitems",
    "noteditems",
    "secindex"
})
@XmlRootElement(name = "ArAccGetopenitems")
public class ArAccGetopenitems {

    @XmlElement(name = "Companycode", required = true)
    protected String companycode;
    @XmlElement(name = "Customer", required = true)
    protected String customer;
    @XmlElement(name = "Keydate", required = true)
    protected String keydate;
    @XmlElement(name = "Lineitems", required = true)
    protected TableOfBapi30072 lineitems;
    @XmlElement(name = "Noteditems")
    protected String noteditems;
    @XmlElement(name = "Secindex")
    protected String secindex;

    /**
     * companycode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanycode() {
        return companycode;
    }

    /**
     * companycode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanycode(String value) {
        this.companycode = value;
    }

    /**
     * customer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * customer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer(String value) {
        this.customer = value;
    }

    /**
     * keydate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeydate() {
        return keydate;
    }

    /**
     * keydate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeydate(String value) {
        this.keydate = value;
    }

    /**
     * lineitems 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapi30072 }
     *     
     */
    public TableOfBapi30072 getLineitems() {
        return lineitems;
    }

    /**
     * lineitems 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapi30072 }
     *     
     */
    public void setLineitems(TableOfBapi30072 value) {
        this.lineitems = value;
    }

    /**
     * noteditems 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteditems() {
        return noteditems;
    }

    /**
     * noteditems 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteditems(String value) {
        this.noteditems = value;
    }

    /**
     * secindex 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecindex() {
        return secindex;
    }

    /**
     * secindex 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecindex(String value) {
        this.secindex = value;
    }

}
