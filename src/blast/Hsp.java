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
    "hspNum",
    "hspBitScore",
    "hspScore",
    "hspEvalue",
    "hspQueryFrom",
    "hspQueryTo",
    "hspHitFrom",
    "hspHitTo",
    "hspPatternFrom",
    "hspPatternTo",
    "hspQueryFrame",
    "hspHitFrame",
    "hspIdentity",
    "hspPositive",
    "hspGaps",
    "hspAlignLen",
    "hspDensity",
    "hspQseq",
    "hspHseq",
    "hspMidline"
})
@XmlRootElement(name = "Hsp")
public class Hsp {

    @XmlElement(name = "Hsp_num", required = true)
    protected String hspNum;
    @XmlElement(name = "Hsp_bit-score", required = true)
    protected String hspBitScore;
    @XmlElement(name = "Hsp_score", required = true)
    protected String hspScore;
    @XmlElement(name = "Hsp_evalue", required = true)
    protected String hspEvalue;
    @XmlElement(name = "Hsp_query-from", required = true)
    protected String hspQueryFrom;
    @XmlElement(name = "Hsp_query-to", required = true)
    protected String hspQueryTo;
    @XmlElement(name = "Hsp_hit-from", required = true)
    protected String hspHitFrom;
    @XmlElement(name = "Hsp_hit-to", required = true)
    protected String hspHitTo;
    @XmlElement(name = "Hsp_pattern-from")
    protected String hspPatternFrom;
    @XmlElement(name = "Hsp_pattern-to")
    protected String hspPatternTo;
    @XmlElement(name = "Hsp_query-frame")
    protected String hspQueryFrame;
    @XmlElement(name = "Hsp_hit-frame")
    protected String hspHitFrame;
    @XmlElement(name = "Hsp_identity")
    protected String hspIdentity;
    @XmlElement(name = "Hsp_positive")
    protected String hspPositive;
    @XmlElement(name = "Hsp_gaps")
    protected String hspGaps;
    @XmlElement(name = "Hsp_align-len")
    protected String hspAlignLen;
    @XmlElement(name = "Hsp_density")
    protected String hspDensity;
    @XmlElement(name = "Hsp_qseq", required = true)
    protected String hspQseq;
    @XmlElement(name = "Hsp_hseq", required = true)
    protected String hspHseq;
    @XmlElement(name = "Hsp_midline")
    protected String hspMidline;

    /**
     * hspNumプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspNum() {
        return hspNum;
    }

    /**
     * hspNumプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspNum(String value) {
        this.hspNum = value;
    }

    /**
     * hspBitScoreプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspBitScore() {
        return hspBitScore;
    }

    /**
     * hspBitScoreプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspBitScore(String value) {
        this.hspBitScore = value;
    }

    /**
     * hspScoreプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspScore() {
        return hspScore;
    }

    /**
     * hspScoreプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspScore(String value) {
        this.hspScore = value;
    }

    /**
     * hspEvalueプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspEvalue() {
        return hspEvalue;
    }

    /**
     * hspEvalueプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspEvalue(String value) {
        this.hspEvalue = value;
    }

    /**
     * hspQueryFromプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspQueryFrom() {
        return hspQueryFrom;
    }

    /**
     * hspQueryFromプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspQueryFrom(String value) {
        this.hspQueryFrom = value;
    }

    /**
     * hspQueryToプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspQueryTo() {
        return hspQueryTo;
    }

    /**
     * hspQueryToプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspQueryTo(String value) {
        this.hspQueryTo = value;
    }

    /**
     * hspHitFromプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspHitFrom() {
        return hspHitFrom;
    }

    /**
     * hspHitFromプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspHitFrom(String value) {
        this.hspHitFrom = value;
    }

    /**
     * hspHitToプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspHitTo() {
        return hspHitTo;
    }

    /**
     * hspHitToプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspHitTo(String value) {
        this.hspHitTo = value;
    }

    /**
     * hspPatternFromプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspPatternFrom() {
        return hspPatternFrom;
    }

    /**
     * hspPatternFromプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspPatternFrom(String value) {
        this.hspPatternFrom = value;
    }

    /**
     * hspPatternToプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspPatternTo() {
        return hspPatternTo;
    }

    /**
     * hspPatternToプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspPatternTo(String value) {
        this.hspPatternTo = value;
    }

    /**
     * hspQueryFrameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspQueryFrame() {
        return hspQueryFrame;
    }

    /**
     * hspQueryFrameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspQueryFrame(String value) {
        this.hspQueryFrame = value;
    }

    /**
     * hspHitFrameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspHitFrame() {
        return hspHitFrame;
    }

    /**
     * hspHitFrameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspHitFrame(String value) {
        this.hspHitFrame = value;
    }

    /**
     * hspIdentityプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspIdentity() {
        return hspIdentity;
    }

    /**
     * hspIdentityプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspIdentity(String value) {
        this.hspIdentity = value;
    }

    /**
     * hspPositiveプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspPositive() {
        return hspPositive;
    }

    /**
     * hspPositiveプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspPositive(String value) {
        this.hspPositive = value;
    }

    /**
     * hspGapsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspGaps() {
        return hspGaps;
    }

    /**
     * hspGapsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspGaps(String value) {
        this.hspGaps = value;
    }

    /**
     * hspAlignLenプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspAlignLen() {
        return hspAlignLen;
    }

    /**
     * hspAlignLenプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspAlignLen(String value) {
        this.hspAlignLen = value;
    }

    /**
     * hspDensityプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspDensity() {
        return hspDensity;
    }

    /**
     * hspDensityプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspDensity(String value) {
        this.hspDensity = value;
    }

    /**
     * hspQseqプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspQseq() {
        return hspQseq;
    }

    /**
     * hspQseqプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspQseq(String value) {
        this.hspQseq = value;
    }

    /**
     * hspHseqプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspHseq() {
        return hspHseq;
    }

    /**
     * hspHseqプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspHseq(String value) {
        this.hspHseq = value;
    }

    /**
     * hspMidlineプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspMidline() {
        return hspMidline;
    }

    /**
     * hspMidlineプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspMidline(String value) {
        this.hspMidline = value;
    }

}
