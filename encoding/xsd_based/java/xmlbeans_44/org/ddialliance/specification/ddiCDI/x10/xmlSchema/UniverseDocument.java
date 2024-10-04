/*
 * An XML document type.
 * Localname: Universe
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.UniverseDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Universe(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface UniverseDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.UniverseDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "universe55b3doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Universe" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Universe getUniverse();

    /**
     * Sets the "Universe" element
     */
    void setUniverse(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Universe universe);

    /**
     * Appends and returns a new empty "Universe" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Universe addNewUniverse();
}
