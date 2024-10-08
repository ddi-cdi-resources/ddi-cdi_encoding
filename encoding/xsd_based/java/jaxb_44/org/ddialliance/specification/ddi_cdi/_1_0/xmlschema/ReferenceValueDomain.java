//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.ddialliance.specification.ddi_cdi._1_0.xmlschema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Definition
 *             ============
 *             Set of permissible values for a variable playing the role of a variable value component.
 *             
 *             Examples
 *             ==========
 *             Consider two variables, i.e. income and age, with values appearing in the same column. A reference variable in this case would be a type of represented variable that can take on values from both income and age. A long data structure might have a column that takes on values from this reference variable. A descriptor variable would then have values paired with the values from the reference variable, pointing to either the income or age variable.
 * 
 * <p>Java class for ReferenceValueDomain complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReferenceValueDomain">
 *   <complexContent>
 *     <extension base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ValueDomain">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceValueDomain")
public class ReferenceValueDomain
    extends ValueDomain
{


}
