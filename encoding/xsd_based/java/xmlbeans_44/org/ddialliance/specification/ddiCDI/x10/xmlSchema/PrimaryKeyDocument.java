/*
 * An XML document type.
 * Localname: PrimaryKey
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one PrimaryKey(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface PrimaryKeyDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKeyDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "primarykey062bdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "PrimaryKey" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey getPrimaryKey();

    /**
     * Sets the "PrimaryKey" element
     */
    void setPrimaryKey(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey primaryKey);

    /**
     * Appends and returns a new empty "PrimaryKey" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PrimaryKey addNewPrimaryKey();
}
