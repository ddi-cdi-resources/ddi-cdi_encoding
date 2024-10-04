/*
 * XML Type:  IntermediateAssociationReference
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.IntermediateAssociationReference
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML IntermediateAssociationReference(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface IntermediateAssociationReference extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.IntermediateAssociationReference> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "intermediateassociationreference5bc1type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "isAssociationReference" attribute
     */
    boolean getIsAssociationReference();

    /**
     * Gets (as xml) the "isAssociationReference" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsAssociationReference();

    /**
     * True if has "isAssociationReference" attribute
     */
    boolean isSetIsAssociationReference();

    /**
     * Sets the "isAssociationReference" attribute
     */
    void setIsAssociationReference(boolean isAssociationReference);

    /**
     * Sets (as xml) the "isAssociationReference" attribute
     */
    void xsetIsAssociationReference(org.apache.xmlbeans.XmlBoolean isAssociationReference);

    /**
     * Unsets the "isAssociationReference" attribute
     */
    void unsetIsAssociationReference();
}
