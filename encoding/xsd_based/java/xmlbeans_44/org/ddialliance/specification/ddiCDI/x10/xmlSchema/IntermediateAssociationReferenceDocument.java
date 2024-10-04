/*
 * An XML document type.
 * Localname: IntermediateAssociationReference
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.IntermediateAssociationReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one IntermediateAssociationReference(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface IntermediateAssociationReferenceDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.IntermediateAssociationReferenceDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "intermediateassociationreference21d1doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "IntermediateAssociationReference" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.IntermediateAssociationReference getIntermediateAssociationReference();

    /**
     * Sets the "IntermediateAssociationReference" element
     */
    void setIntermediateAssociationReference(org.ddialliance.specification.ddiCDI.x10.xmlSchema.IntermediateAssociationReference intermediateAssociationReference);

    /**
     * Appends and returns a new empty "IntermediateAssociationReference" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.IntermediateAssociationReference addNewIntermediateAssociationReference();
}
