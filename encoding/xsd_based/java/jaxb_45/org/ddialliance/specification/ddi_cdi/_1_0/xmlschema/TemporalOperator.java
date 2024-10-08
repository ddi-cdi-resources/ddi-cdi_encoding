//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.ddialliance.specification.ddi_cdi._1_0.xmlschema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TemporalOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TemporalOperator">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     <enumeration value="AndJoin"/>
 *     <enumeration value="AndSplit"/>
 *     <enumeration value="XorJoin"/>
 *     <enumeration value="XorSplit"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TemporalOperator")
@XmlEnum
public enum TemporalOperator {


    /**
     * Given three activities A, B and C, if ANDJoin(A, B) -> C, then C is executed after both A and B finish executing. ANDJoin is sometimes referred to as synchronization.
     * 
     */
    @XmlEnumValue("AndJoin")
    AND_JOIN("AndJoin"),

    /**
     * Given three activities A, B and C, if ANDSplit(A) -> (B, C), then both B and C are executed after A finishes executing.
     * 
     */
    @XmlEnumValue("AndSplit")
    AND_SPLIT("AndSplit"),

    /**
     * Given three activities A, B and C, if XORJoin(A, B) -> C, then C is executed after either A or B finishes executing. XORJoin is sometimes referred to as simple merge.
     * 
     */
    @XmlEnumValue("XorJoin")
    XOR_JOIN("XorJoin"),

    /**
     * Given three activities A, B and C, if XORSplit(A) -> (B, C), then either B or C is executed, not both, after A finishes executing. XORSplit is sometimes referred to as exclusive choice.
     * 
     */
    @XmlEnumValue("XorSplit")
    XOR_SPLIT("XorSplit");
    private final String value;

    TemporalOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TemporalOperator fromValue(String v) {
        for (TemporalOperator c: TemporalOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
