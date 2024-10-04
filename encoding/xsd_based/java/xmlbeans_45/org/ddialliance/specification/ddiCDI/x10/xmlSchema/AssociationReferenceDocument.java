/*
 * An XML document type.
 * Localname: AssociationReference
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one AssociationReference(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface AssociationReferenceDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReferenceDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "associationreference9438doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "AssociationReference" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference getAssociationReference();

    /**
     * Sets the "AssociationReference" element
     */
    void setAssociationReference(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference associationReference);

    /**
     * Appends and returns a new empty "AssociationReference" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference addNewAssociationReference();
}
