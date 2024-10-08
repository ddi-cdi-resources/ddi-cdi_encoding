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
 *             Role given to a represented variable in the context of a data structure to record values of multiple variables.   
 *             
 *             Examples 
 *             ========== 
 *             Consider two variables, i.e. income and age, with their values living together in different entries in the same column.  The values of those two variables are now in the value domain of a single variable (the one working as a variable value component).  Another column, based on a variable descriptor component, use codes for "income" and "age" to distinguish income values from age values.   
 *             
 *             Explanatory notes 
 *             =================== 
 *             A variable value component captures the values of multiple variables that have been transposed into a single column.  The variable descriptor component provides a mechanism to identify which of those values correspond to which variable.   This structure provides a flexible mechanism avoiding the need for a formal pointer.
 * 
 * <p>Java class for VariableValueComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="VariableValueComponent">
 *   <complexContent>
 *     <extension base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}DataStructureComponent">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariableValueComponent")
public class VariableValueComponent
    extends DataStructureComponent
{


}
