/*
 * An XML document type.
 * Localname: ProcessingAgent
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgentDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ProcessingAgent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ProcessingAgentDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgentDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "processingagent3b4edoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ProcessingAgent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent getProcessingAgent();

    /**
     * Sets the "ProcessingAgent" element
     */
    void setProcessingAgent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent processingAgent);

    /**
     * Appends and returns a new empty "ProcessingAgent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProcessingAgent addNewProcessingAgent();
}
