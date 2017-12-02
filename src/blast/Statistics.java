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
    "statisticsDbNum",
    "statisticsDbLen",
    "statisticsHspLen",
    "statisticsEffSpace",
    "statisticsKappa",
    "statisticsLambda",
    "statisticsEntropy"
})
@XmlRootElement(name = "Statistics")
public class Statistics {

    @XmlElement(name = "Statistics_db-num", required = true)
    protected String statisticsDbNum;
    @XmlElement(name = "Statistics_db-len", required = true)
    protected String statisticsDbLen;
    @XmlElement(name = "Statistics_hsp-len", required = true)
    protected String statisticsHspLen;
    @XmlElement(name = "Statistics_eff-space", required = true)
    protected String statisticsEffSpace;
    @XmlElement(name = "Statistics_kappa", required = true)
    protected String statisticsKappa;
    @XmlElement(name = "Statistics_lambda", required = true)
    protected String statisticsLambda;
    @XmlElement(name = "Statistics_entropy", required = true)
    protected String statisticsEntropy;

    /**
     * statisticsDbNumプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticsDbNum() {
        return statisticsDbNum;
    }

    /**
     * statisticsDbNumプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatisticsDbNum(String value) {
        this.statisticsDbNum = value;
    }

    /**
     * statisticsDbLenプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticsDbLen() {
        return statisticsDbLen;
    }

    /**
     * statisticsDbLenプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatisticsDbLen(String value) {
        this.statisticsDbLen = value;
    }

    /**
     * statisticsHspLenプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticsHspLen() {
        return statisticsHspLen;
    }

    /**
     * statisticsHspLenプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatisticsHspLen(String value) {
        this.statisticsHspLen = value;
    }

    /**
     * statisticsEffSpaceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticsEffSpace() {
        return statisticsEffSpace;
    }

    /**
     * statisticsEffSpaceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatisticsEffSpace(String value) {
        this.statisticsEffSpace = value;
    }

    /**
     * statisticsKappaプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticsKappa() {
        return statisticsKappa;
    }

    /**
     * statisticsKappaプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatisticsKappa(String value) {
        this.statisticsKappa = value;
    }

    /**
     * statisticsLambdaプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticsLambda() {
        return statisticsLambda;
    }

    /**
     * statisticsLambdaプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatisticsLambda(String value) {
        this.statisticsLambda = value;
    }

    /**
     * statisticsEntropyプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticsEntropy() {
        return statisticsEntropy;
    }

    /**
     * statisticsEntropyプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatisticsEntropy(String value) {
        this.statisticsEntropy = value;
    }

}
