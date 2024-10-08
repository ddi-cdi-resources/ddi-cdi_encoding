//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.ddialliance.specification.ddi_cdi._1_0.xmlschema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Definition
 *             ============
 *             Specialized unit type, with the specialization based upon characteristics other than time and geography.
 *             
 *             Examples
 *             ==========
 *             1. Canadian adults (not limited to those residing in Canada)
 *             2. Computer companies 
 *             3. Universities
 *             
 *             Explanatory notes
 *             ===================
 *             Universe sits in a hierarchy between unit type and population, with unit type being most general and Population most specific. A universe is a set of entities defined by a more narrow specification than that of an underlying unit type. A population further narrows the specification to a specific time and geography.
 *             
 *             If the Universe consists of people, a number of factors may be used in defining membership in the Universe, such as age, sex, residence, income, veteran status, criminal convictions, etc. The universe may consist of elements other than persons, such as housing units, court cases, deaths, countries, etc. A universe may be described as "inclusive" or "exclusive". 
 *             
 *             Not to be confused with Population, which includes the specification of time and geography.
 * 
 * <p>Java class for Universe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Universe">
 *   <complexContent>
 *     <extension base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}UnitType">
 *       <sequence>
 *         <element name="isInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Universe", propOrder = {
    "isInclusive"
})
@XmlSeeAlso({
    Population.class
})
public class Universe
    extends UnitType
{

    protected Boolean isInclusive;

    /**
     * Gets the value of the isInclusive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInclusive() {
        return isInclusive;
    }

    /**
     * Sets the value of the isInclusive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInclusive(Boolean value) {
        this.isInclusive = value;
    }

}
