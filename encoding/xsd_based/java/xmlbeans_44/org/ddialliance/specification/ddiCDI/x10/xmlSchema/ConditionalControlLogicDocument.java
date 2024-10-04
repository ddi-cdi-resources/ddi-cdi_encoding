/*
 * An XML document type.
 * Localname: ConditionalControlLogic
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogicDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ConditionalControlLogic(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ConditionalControlLogicDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogicDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "conditionalcontrollogicccc3doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ConditionalControlLogic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic getConditionalControlLogic();

    /**
     * Sets the "ConditionalControlLogic" element
     */
    void setConditionalControlLogic(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic conditionalControlLogic);

    /**
     * Appends and returns a new empty "ConditionalControlLogic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConditionalControlLogic addNewConditionalControlLogic();
}
