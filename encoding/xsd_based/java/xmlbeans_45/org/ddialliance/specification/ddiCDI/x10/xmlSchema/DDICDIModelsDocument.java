/*
 * An XML document type.
 * Localname: DDICDIModels
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DDICDIModelsDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one DDICDIModels(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface DDICDIModelsDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DDICDIModelsDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "ddicdimodelsa3b7doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "DDICDIModels" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DDICDIModels getDDICDIModels();

    /**
     * Sets the "DDICDIModels" element
     */
    void setDDICDIModels(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DDICDIModels ddicdiModels);

    /**
     * Appends and returns a new empty "DDICDIModels" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DDICDIModels addNewDDICDIModels();
}
