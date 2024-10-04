/*
 * An XML document type.
 * Localname: ObjectName
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectNameDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ObjectName(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ObjectNameDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectNameDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "objectname7618doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ObjectName" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName getObjectName();

    /**
     * Sets the "ObjectName" element
     */
    void setObjectName(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName objectName);

    /**
     * Appends and returns a new empty "ObjectName" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName addNewObjectName();
}
