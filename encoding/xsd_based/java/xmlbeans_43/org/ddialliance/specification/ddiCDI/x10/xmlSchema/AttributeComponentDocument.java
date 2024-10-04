/*
 * An XML document type.
 * Localname: AttributeComponent
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponentDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one AttributeComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface AttributeComponentDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponentDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "attributecomponent7fefdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "AttributeComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent getAttributeComponent();

    /**
     * Sets the "AttributeComponent" element
     */
    void setAttributeComponent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent attributeComponent);

    /**
     * Appends and returns a new empty "AttributeComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AttributeComponent addNewAttributeComponent();
}
