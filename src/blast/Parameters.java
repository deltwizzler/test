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
    "parametersMatrix",
    "parametersExpect",
    "parametersInclude",
    "parametersScMatch",
    "parametersScMismatch",
    "parametersGapOpen",
    "parametersGapExtend",
    "parametersFilter",
    "parametersPattern",
    "parametersEntrezQuery"
})
@XmlRootElement(name = "Parameters")
public class Parameters {

    @XmlElement(name = "Parameters_matrix")
    protected String parametersMatrix;
    @XmlElement(name = "Parameters_expect", required = true)
    protected String parametersExpect;
    @XmlElement(name = "Parameters_include")
    protected String parametersInclude;
    @XmlElement(name = "Parameters_sc-match")
    protected String parametersScMatch;
    @XmlElement(name = "Parameters_sc-mismatch")
    protected String parametersScMismatch;
    @XmlElement(name = "Parameters_gap-open", required = true)
    protected String parametersGapOpen;
    @XmlElement(name = "Parameters_gap-extend", required = true)
    protected String parametersGapExtend;
    @XmlElement(name = "Parameters_filter")
    protected String parametersFilter;
    @XmlElement(name = "Parameters_pattern")
    protected String parametersPattern;
    @XmlElement(name = "Parameters_entrez-query")
    protected String parametersEntrezQuery;

    /**
     * parametersMatrixプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametersMatrix() {
        return parametersMatrix;
    }

    /**
     * parametersMatrixプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametersMatrix(String value) {
        this.parametersMatrix = value;
    }

    /**
     * parametersExpectプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametersExpect() {
        return parametersExpect;
    }

    /**
     * parametersExpectプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametersExpect(String value) {
        this.parametersExpect = value;
    }

    /**
     * parametersIncludeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametersInclude() {
        return parametersInclude;
    }

    /**
     * parametersIncludeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametersInclude(String value) {
        this.parametersInclude = value;
    }

    /**
     * parametersScMatchプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametersScMatch() {
        return parametersScMatch;
    }

    /**
     * parametersScMatchプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametersScMatch(String value) {
        this.parametersScMatch = value;
    }

    /**
     * parametersScMismatchプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametersScMismatch() {
        return parametersScMismatch;
    }

    /**
     * parametersScMismatchプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametersScMismatch(String value) {
        this.parametersScMismatch = value;
    }

    /**
     * parametersGapOpenプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametersGapOpen() {
        return parametersGapOpen;
    }

    /**
     * parametersGapOpenプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametersGapOpen(String value) {
        this.parametersGapOpen = value;
    }

    /**
     * parametersGapExtendプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametersGapExtend() {
        return parametersGapExtend;
    }

    /**
     * parametersGapExtendプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametersGapExtend(String value) {
        this.parametersGapExtend = value;
    }

    /**
     * parametersFilterプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametersFilter() {
        return parametersFilter;
    }

    /**
     * parametersFilterプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametersFilter(String value) {
        this.parametersFilter = value;
    }

    /**
     * parametersPatternプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametersPattern() {
        return parametersPattern;
    }

    /**
     * parametersPatternプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametersPattern(String value) {
        this.parametersPattern = value;
    }

    /**
     * parametersEntrezQueryプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametersEntrezQuery() {
        return parametersEntrezQuery;
    }

    /**
     * parametersEntrezQueryプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametersEntrezQuery(String value) {
        this.parametersEntrezQuery = value;
    }

}
