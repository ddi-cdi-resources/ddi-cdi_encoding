/*
 * An XML document type.
 * Localname: InstanceKey
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKeyDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one InstanceKey(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface InstanceKeyDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKeyDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "instancekey58a6doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "InstanceKey" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey getInstanceKey();

    /**
     * Sets the "InstanceKey" element
     */
    void setInstanceKey(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey instanceKey);

    /**
     * Appends and returns a new empty "InstanceKey" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceKey addNewInstanceKey();
}
