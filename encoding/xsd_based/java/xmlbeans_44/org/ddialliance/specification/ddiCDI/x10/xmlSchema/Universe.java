/*
 * XML Type:  Universe
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Universe
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Universe(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface Universe extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitType {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Universe> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "universe5fa3type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "isInclusive" element
     */
    boolean getIsInclusive();

    /**
     * Gets (as xml) the "isInclusive" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsInclusive();

    /**
     * True if has "isInclusive" element
     */
    boolean isSetIsInclusive();

    /**
     * Sets the "isInclusive" element
     */
    void setIsInclusive(boolean isInclusive);

    /**
     * Sets (as xml) the "isInclusive" element
     */
    void xsetIsInclusive(org.apache.xmlbeans.XmlBoolean isInclusive);

    /**
     * Unsets the "isInclusive" element
     */
    void unsetIsInclusive();
}
