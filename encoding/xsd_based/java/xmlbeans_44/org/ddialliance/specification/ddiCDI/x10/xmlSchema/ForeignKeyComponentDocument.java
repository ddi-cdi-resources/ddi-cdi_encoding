/*
 * An XML document type.
 * Localname: ForeignKeyComponent
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponentDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ForeignKeyComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ForeignKeyComponentDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponentDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "foreignkeycomponent486edoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ForeignKeyComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent getForeignKeyComponent();

    /**
     * Sets the "ForeignKeyComponent" element
     */
    void setForeignKeyComponent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent foreignKeyComponent);

    /**
     * Appends and returns a new empty "ForeignKeyComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ForeignKeyComponent addNewForeignKeyComponent();
}
