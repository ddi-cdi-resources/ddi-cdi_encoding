//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.ddialliance.specification.ddi_cdi._1_0.xmlschema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Definition 
 *             ==========
 *             Declarative control flow operator where the continuation of the execution flow depends on the finalization of one or more preceding activities/steps.
 *             
 *             - XORJoin: Given three activities A, B and C, if XORJoin(A, B) -> C, then C is executed after either A or B finishes executing. XORJoin is sometimes referred to as simple merge.
 *             - ANDJoin: Given three activities A, B and C, if ANDJoin(A, B) -> C, then C is executed after both A and B finish executing. ANDJoin is sometimes referred to as synchronization.
 *             - XORSplit: Given three activities A, B and C, if XORSplit(A) -> (B, C), then either B or C is executed, not both, after A finishes executing. XORSplit is sometimes referred to as exclusive choice.
 *             - ANDSplit: Given three activities A, B and C, if ANDSplit(A) -> (B, C), then both B and C are executed after A finishes executing.
 * 
 * <p>Java class for TemporalControlConstruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TemporalControlConstruct">
 *   <complexContent>
 *     <extension base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}TemporalConstraints">
 *       <sequence>
 *         <element name="temporalControl" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}TemporalOperator"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemporalControlConstruct", propOrder = {
    "temporalControl"
})
public class TemporalControlConstruct
    extends TemporalConstraints
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected TemporalOperator temporalControl;

    /**
     * Gets the value of the temporalControl property.
     * 
     * @return
     *     possible object is
     *     {@link TemporalOperator }
     *     
     */
    public TemporalOperator getTemporalControl() {
        return temporalControl;
    }

    /**
     * Sets the value of the temporalControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporalOperator }
     *     
     */
    public void setTemporalControl(TemporalOperator value) {
        this.temporalControl = value;
    }

}
