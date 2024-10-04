/*
 * An XML document type.
 * Localname: ReferenceVariable
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariableDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ReferenceVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ReferenceVariableDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariableDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "referencevariable0343doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ReferenceVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable getReferenceVariable();

    /**
     * Sets the "ReferenceVariable" element
     */
    void setReferenceVariable(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable referenceVariable);

    /**
     * Appends and returns a new empty "ReferenceVariable" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ReferenceVariable addNewReferenceVariable();
}
