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
 *             Organized collection of key-value data. It is structured by a key value structure.
 *             
 *             Examples
 *             ==========
 *             A unit key-value datastore where each instance key corresponds to a data point capturing a different characteristic of a unit.
 *             
 *             Explanatory notes
 *             ===================
 *             A key-value datastore is just a collection of key-value pairs, i.e. instance keys and reference values. 
 *             Each instance key encodes all relevant information about the context, the unit of interest and the variable associated with the reference value of a given data point.
 * 
 * <p>Java class for KeyValueDataStore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="KeyValueDataStore">
 *   <complexContent>
 *     <extension base="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}DataSet">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyValueDataStore")
public class KeyValueDataStore
    extends DataSet
{


}
