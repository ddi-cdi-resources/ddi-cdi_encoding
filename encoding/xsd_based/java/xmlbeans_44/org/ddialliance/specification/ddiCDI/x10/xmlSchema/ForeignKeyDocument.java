/*
 * An XML document type.
 * Localname: ForeignKey
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ForeignKey(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ForeignKeyDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "foreignkey8119doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ForeignKey" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKey getForeignKey();

    /**
     * Sets the "ForeignKey" element
     */
    void setForeignKey(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKey foreignKey);

    /**
     * Appends and returns a new empty "ForeignKey" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKey addNewForeignKey();
}
