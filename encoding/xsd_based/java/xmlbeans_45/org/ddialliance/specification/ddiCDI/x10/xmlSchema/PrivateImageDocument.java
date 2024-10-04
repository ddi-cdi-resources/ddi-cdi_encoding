/*
 * An XML document type.
 * Localname: PrivateImage
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrivateImageDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one PrivateImage(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface PrivateImageDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrivateImageDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "privateimage6e06doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "PrivateImage" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrivateImage getPrivateImage();

    /**
     * Sets the "PrivateImage" element
     */
    void setPrivateImage(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrivateImage privateImage);

    /**
     * Appends and returns a new empty "PrivateImage" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrivateImage addNewPrivateImage();
}
