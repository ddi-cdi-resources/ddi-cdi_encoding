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
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "foreignkey8119doctype");
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
