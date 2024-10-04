/*
 * An XML document type.
 * Localname: CorrespondenceDefinition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one CorrespondenceDefinition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface CorrespondenceDefinitionDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceDefinitionDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "correspondencedefinition65fbdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "CorrespondenceDefinition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceDefinition getCorrespondenceDefinition();

    /**
     * Sets the "CorrespondenceDefinition" element
     */
    void setCorrespondenceDefinition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceDefinition correspondenceDefinition);

    /**
     * Appends and returns a new empty "CorrespondenceDefinition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceDefinition addNewCorrespondenceDefinition();
}
