/*
 * An XML document type.
 * Localname: InformationFlowDefinition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one InformationFlowDefinition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface InformationFlowDefinitionDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinitionDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "informationflowdefinitionc9c9doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "InformationFlowDefinition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition getInformationFlowDefinition();

    /**
     * Sets the "InformationFlowDefinition" element
     */
    void setInformationFlowDefinition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition informationFlowDefinition);

    /**
     * Appends and returns a new empty "InformationFlowDefinition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InformationFlowDefinition addNewInformationFlowDefinition();
}
