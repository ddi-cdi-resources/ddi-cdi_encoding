/*
 * An XML document type.
 * Localname: ModelIdentification
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ModelIdentificationDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ModelIdentification(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ModelIdentificationDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ModelIdentificationDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "modelidentification7893doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ModelIdentification" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ModelIdentification getModelIdentification();

    /**
     * Sets the "ModelIdentification" element
     */
    void setModelIdentification(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ModelIdentification modelIdentification);

    /**
     * Appends and returns a new empty "ModelIdentification" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ModelIdentification addNewModelIdentification();
}
