/*
 * XML Type:  ObjectAttributeSelector
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectAttributeSelector
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ObjectAttributeSelector(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface ObjectAttributeSelector extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Selector {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectAttributeSelector> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "objectattributeselector02c8type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "refinedBy" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectAttributeSelector getRefinedBy();

    /**
     * True if has "refinedBy" element
     */
    boolean isSetRefinedBy();

    /**
     * Sets the "refinedBy" element
     */
    void setRefinedBy(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectAttributeSelector refinedBy);

    /**
     * Appends and returns a new empty "refinedBy" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectAttributeSelector addNewRefinedBy();

    /**
     * Unsets the "refinedBy" element
     */
    void unsetRefinedBy();

    /**
     * Gets the "refinedByOrderNumber" element
     */
    java.math.BigInteger getRefinedByOrderNumber();

    /**
     * Gets (as xml) the "refinedByOrderNumber" element
     */
    org.apache.xmlbeans.XmlInteger xgetRefinedByOrderNumber();

    /**
     * True if has "refinedByOrderNumber" element
     */
    boolean isSetRefinedByOrderNumber();

    /**
     * Sets the "refinedByOrderNumber" element
     */
    void setRefinedByOrderNumber(java.math.BigInteger refinedByOrderNumber);

    /**
     * Sets (as xml) the "refinedByOrderNumber" element
     */
    void xsetRefinedByOrderNumber(org.apache.xmlbeans.XmlInteger refinedByOrderNumber);

    /**
     * Unsets the "refinedByOrderNumber" element
     */
    void unsetRefinedByOrderNumber();

    /**
     * Gets the "value" element
     */
    java.lang.String getValue();

    /**
     * Gets (as xml) the "value" element
     */
    org.apache.xmlbeans.XmlString xgetValue();

    /**
     * True if has "value" element
     */
    boolean isSetValue();

    /**
     * Sets the "value" element
     */
    void setValue(java.lang.String value);

    /**
     * Sets (as xml) the "value" element
     */
    void xsetValue(org.apache.xmlbeans.XmlString value);

    /**
     * Unsets the "value" element
     */
    void unsetValue();
}
