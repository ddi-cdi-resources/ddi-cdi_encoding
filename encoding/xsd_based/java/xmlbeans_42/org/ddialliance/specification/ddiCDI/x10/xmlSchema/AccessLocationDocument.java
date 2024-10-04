/*
 * An XML document type.
 * Localname: AccessLocation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessLocationDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one AccessLocation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface AccessLocationDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessLocationDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "accesslocatione3e7doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "AccessLocation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessLocation getAccessLocation();

    /**
     * Sets the "AccessLocation" element
     */
    void setAccessLocation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessLocation accessLocation);

    /**
     * Appends and returns a new empty "AccessLocation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessLocation addNewAccessLocation();
}
