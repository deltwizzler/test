//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2017.12.02 時間 04:12:16 PM JST 
//


package blast;

import java.util.ArrayList;
import java.util.List;
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
    "iteration"
})
@XmlRootElement(name = "BlastOutput_iterations")
public class BlastOutputIterations {

    @XmlElement(name = "Iteration")
    protected List<Iteration> iteration;

    /**
     * Gets the value of the iteration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iteration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIteration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Iteration }
     * 
     * 
     */
    public List<Iteration> getIteration() {
        if (iteration == null) {
            iteration = new ArrayList<Iteration>();
        }
        return this.iteration;
    }

}
