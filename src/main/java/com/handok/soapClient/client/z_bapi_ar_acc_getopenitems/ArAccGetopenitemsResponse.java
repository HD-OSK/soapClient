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
 *         &lt;element name="Lineitems" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapi30072"/&gt;
 *         &lt;element name="Return" type="{urn:sap-com:document:sap:soap:functions:mc-style}Bapireturn"/&gt;
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
    "lineitems",
    "_return"
})
@XmlRootElement(name = "ArAccGetopenitemsResponse")
public class ArAccGetopenitemsResponse {

    @XmlElement(name = "Lineitems", required = true)
    protected TableOfBapi30072 lineitems;
    @XmlElement(name = "Return", required = true)
    protected Bapireturn _return;

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
     * return 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Bapireturn }
     *     
     */
    public Bapireturn getReturn() {
        return _return;
    }

    /**
     * return 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Bapireturn }
     *     
     */
    public void setReturn(Bapireturn value) {
        this._return = value;
    }

}
