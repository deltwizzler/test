//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2017.12.02 時間 04:12:16 PM JST 
//


package blast;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hitNum",
    "hitId",
    "hitDef",
    "hitAccession",
    "hitLen",
    "hitHsps"
})
@XmlRootElement(name = "Hit")
public class Hit {

    @XmlElement(name = "Hit_num", required = true)
    protected String hitNum;
    @XmlElement(name = "Hit_id", required = true)
    protected String hitId;
    @XmlElement(name = "Hit_def", required = true)
    protected String hitDef;
    @XmlElement(name = "Hit_accession", required = true)
    protected String hitAccession;
    @XmlElement(name = "Hit_len", required = true)
    protected String hitLen;
    @XmlElement(name = "Hit_hsps")
    protected HitHsps hitHsps;

    /**
     * hitNumプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHitNum() {
        return hitNum;
    }

    /**
     * hitNumプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHitNum(String value) {
        this.hitNum = value;
    }

    /**
     * hitIdプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHitId() {
        return hitId;
    }

    /**
     * hitIdプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHitId(String value) {
        this.hitId = value;
    }

    /**
     * hitDefプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHitDef() {
        return hitDef;
    }

    /**
     * hitDefプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHitDef(String value) {
        this.hitDef = value;
    }

    /**
     * hitAccessionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHitAccession() {
        return hitAccession;
    }

    /**
     * hitAccessionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHitAccession(String value) {
        this.hitAccession = value;
    }

    /**
     * hitLenプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHitLen() {
        return hitLen;
    }

    /**
     * hitLenプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHitLen(String value) {
        this.hitLen = value;
    }

    /**
     * hitHspsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link HitHsps }
     *     
     */
    public HitHsps getHitHsps() {
        return hitHsps;
    }

    /**
     * hitHspsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link HitHsps }
     *     
     */
    public void setHitHsps(HitHsps value) {
        this.hitHsps = value;
    }

}
