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
    "blastOutputProgram",
    "blastOutputVersion",
    "blastOutputReference",
    "blastOutputDb",
    "blastOutputQueryID",
    "blastOutputQueryDef",
    "blastOutputQueryLen",
    "blastOutputQuerySeq",
    "blastOutputParam",
    "blastOutputIterations",
    "blastOutputMbstat"
})
@XmlRootElement(name = "BlastOutput")
public class BlastOutput {

    @XmlElement(name = "BlastOutput_program", required = true)
    protected String blastOutputProgram;
    @XmlElement(name = "BlastOutput_version", required = true)
    protected String blastOutputVersion;
    @XmlElement(name = "BlastOutput_reference", required = true)
    protected String blastOutputReference;
    @XmlElement(name = "BlastOutput_db", required = true)
    protected String blastOutputDb;
    @XmlElement(name = "BlastOutput_query-ID", required = true)
    protected String blastOutputQueryID;
    @XmlElement(name = "BlastOutput_query-def", required = true)
    protected String blastOutputQueryDef;
    @XmlElement(name = "BlastOutput_query-len", required = true)
    protected String blastOutputQueryLen;
    @XmlElement(name = "BlastOutput_query-seq")
    protected String blastOutputQuerySeq;
    @XmlElement(name = "BlastOutput_param", required = true)
    protected BlastOutputParam blastOutputParam;
    @XmlElement(name = "BlastOutput_iterations", required = true)
    protected BlastOutputIterations blastOutputIterations;
    @XmlElement(name = "BlastOutput_mbstat")
    protected BlastOutputMbstat blastOutputMbstat;

    /**
     * blastOutputProgramプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlastOutputProgram() {
        return blastOutputProgram;
    }

    /**
     * blastOutputProgramプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlastOutputProgram(String value) {
        this.blastOutputProgram = value;
    }

    /**
     * blastOutputVersionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlastOutputVersion() {
        return blastOutputVersion;
    }

    /**
     * blastOutputVersionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlastOutputVersion(String value) {
        this.blastOutputVersion = value;
    }

    /**
     * blastOutputReferenceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlastOutputReference() {
        return blastOutputReference;
    }

    /**
     * blastOutputReferenceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlastOutputReference(String value) {
        this.blastOutputReference = value;
    }

    /**
     * blastOutputDbプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlastOutputDb() {
        return blastOutputDb;
    }

    /**
     * blastOutputDbプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlastOutputDb(String value) {
        this.blastOutputDb = value;
    }

    /**
     * blastOutputQueryIDプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlastOutputQueryID() {
        return blastOutputQueryID;
    }

    /**
     * blastOutputQueryIDプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlastOutputQueryID(String value) {
        this.blastOutputQueryID = value;
    }

    /**
     * blastOutputQueryDefプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlastOutputQueryDef() {
        return blastOutputQueryDef;
    }

    /**
     * blastOutputQueryDefプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlastOutputQueryDef(String value) {
        this.blastOutputQueryDef = value;
    }

    /**
     * blastOutputQueryLenプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlastOutputQueryLen() {
        return blastOutputQueryLen;
    }

    /**
     * blastOutputQueryLenプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlastOutputQueryLen(String value) {
        this.blastOutputQueryLen = value;
    }

    /**
     * blastOutputQuerySeqプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlastOutputQuerySeq() {
        return blastOutputQuerySeq;
    }

    /**
     * blastOutputQuerySeqプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlastOutputQuerySeq(String value) {
        this.blastOutputQuerySeq = value;
    }

    /**
     * blastOutputParamプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BlastOutputParam }
     *     
     */
    public BlastOutputParam getBlastOutputParam() {
        return blastOutputParam;
    }

    /**
     * blastOutputParamプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BlastOutputParam }
     *     
     */
    public void setBlastOutputParam(BlastOutputParam value) {
        this.blastOutputParam = value;
    }

    /**
     * blastOutputIterationsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BlastOutputIterations }
     *     
     */
    public BlastOutputIterations getBlastOutputIterations() {
        return blastOutputIterations;
    }

    /**
     * blastOutputIterationsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BlastOutputIterations }
     *     
     */
    public void setBlastOutputIterations(BlastOutputIterations value) {
        this.blastOutputIterations = value;
    }

    /**
     * blastOutputMbstatプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BlastOutputMbstat }
     *     
     */
    public BlastOutputMbstat getBlastOutputMbstat() {
        return blastOutputMbstat;
    }

    /**
     * blastOutputMbstatプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BlastOutputMbstat }
     *     
     */
    public void setBlastOutputMbstat(BlastOutputMbstat value) {
        this.blastOutputMbstat = value;
    }

}
