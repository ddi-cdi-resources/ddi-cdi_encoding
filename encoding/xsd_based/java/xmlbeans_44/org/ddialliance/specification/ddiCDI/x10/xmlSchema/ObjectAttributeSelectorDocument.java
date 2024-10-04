/*
 * An XML document type.
 * Localname: ObjectAttributeSelector
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectAttributeSelectorDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ObjectAttributeSelector(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ObjectAttributeSelectorDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectAttributeSelectorDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "objectattributeselector2ab8doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ObjectAttributeSelector" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectAttributeSelector getObjectAttributeSelector();

    /**
     * Sets the "ObjectAttributeSelector" element
     */
    void setObjectAttributeSelector(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectAttributeSelector objectAttributeSelector);

    /**
     * Appends and returns a new empty "ObjectAttributeSelector" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectAttributeSelector addNewObjectAttributeSelector();
}
