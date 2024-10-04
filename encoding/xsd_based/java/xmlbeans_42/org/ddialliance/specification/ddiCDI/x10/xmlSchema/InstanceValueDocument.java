/*
 * An XML document type.
 * Localname: InstanceValue
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValueDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one InstanceValue(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface InstanceValueDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValueDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "instancevalue6038doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "InstanceValue" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue getInstanceValue();

    /**
     * Sets the "InstanceValue" element
     */
    void setInstanceValue(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue instanceValue);

    /**
     * Appends and returns a new empty "InstanceValue" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceValue addNewInstanceValue();
}
