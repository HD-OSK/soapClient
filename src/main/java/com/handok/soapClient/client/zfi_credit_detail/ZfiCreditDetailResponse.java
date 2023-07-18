//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.06.02 시간 07:11:20 PM KST 
//


package com.handok.soapClient.client.zfi_credit_detail;

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
 *         &lt;element name="Return" type="{urn:sap-com:document:sap:soap:functions:mc-style}Bapireturn1"/&gt;
 *         &lt;element name="Zsfi013" type="{urn:sap-com:document:sap:soap:functions:mc-style}Zsfi013"/&gt;
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
    "_return",
    "zsfi013"
})
@XmlRootElement(name = "ZfiCreditDetailResponse")
public class ZfiCreditDetailResponse {

    @XmlElement(name = "Return", required = true)
    protected Bapireturn1 _return;
    @XmlElement(name = "Zsfi013", required = true)
    protected Zsfi013 zsfi013;

    /**
     * return 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Bapireturn1 }
     *     
     */
    public Bapireturn1 getReturn() {
        return _return;
    }

    /**
     * return 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Bapireturn1 }
     *     
     */
    public void setReturn(Bapireturn1 value) {
        this._return = value;
    }

    /**
     * zsfi013 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Zsfi013 }
     *     
     */
    public Zsfi013 getZsfi013() {
        return zsfi013;
    }

    /**
     * zsfi013 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Zsfi013 }
     *     
     */
    public void setZsfi013(Zsfi013 value) {
        this.zsfi013 = value;
    }

}
