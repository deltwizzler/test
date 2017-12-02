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
    "iterationIterNum",
    "iterationQueryID",
    "iterationQueryDef",
    "iterationQueryLen",
    "iterationHits",
    "iterationStat",
    "iterationMessage"
})
@XmlRootElement(name = "Iteration")
public class Iteration {

    @XmlElement(name = "Iteration_iter-num", required = true)
    protected String iterationIterNum;
    @XmlElement(name = "Iteration_query-ID")
    protected String iterationQueryID;
    @XmlElement(name = "Iteration_query-def")
    protected String iterationQueryDef;
    @XmlElement(name = "Iteration_query-len")
    protected String iterationQueryLen;
    @XmlElement(name = "Iteration_hits")
    protected IterationHits iterationHits;
    @XmlElement(name = "Iteration_stat")
    protected IterationStat iterationStat;
    @XmlElement(name = "Iteration_message")
    protected String iterationMessage;

    /**
     * iterationIterNumプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIterationIterNum() {
        return iterationIterNum;
    }

    /**
     * iterationIterNumプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIterationIterNum(String value) {
        this.iterationIterNum = value;
    }

    /**
     * iterationQueryIDプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIterationQueryID() {
        return iterationQueryID;
    }

    /**
     * iterationQueryIDプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIterationQueryID(String value) {
        this.iterationQueryID = value;
    }

    /**
     * iterationQueryDefプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIterationQueryDef() {
        return iterationQueryDef;
    }

    /**
     * iterationQueryDefプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIterationQueryDef(String value) {
        this.iterationQueryDef = value;
    }

    /**
     * iterationQueryLenプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIterationQueryLen() {
        return iterationQueryLen;
    }

    /**
     * iterationQueryLenプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIterationQueryLen(String value) {
        this.iterationQueryLen = value;
    }

    /**
     * iterationHitsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link IterationHits }
     *     
     */
    public IterationHits getIterationHits() {
        return iterationHits;
    }

    /**
     * iterationHitsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link IterationHits }
     *     
     */
    public void setIterationHits(IterationHits value) {
        this.iterationHits = value;
    }

    /**
     * iterationStatプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link IterationStat }
     *     
     */
    public IterationStat getIterationStat() {
        return iterationStat;
    }

    /**
     * iterationStatプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link IterationStat }
     *     
     */
    public void setIterationStat(IterationStat value) {
        this.iterationStat = value;
    }

    /**
     * iterationMessageプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIterationMessage() {
        return iterationMessage;
    }

    /**
     * iterationMessageプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIterationMessage(String value) {
        this.iterationMessage = value;
    }

}
