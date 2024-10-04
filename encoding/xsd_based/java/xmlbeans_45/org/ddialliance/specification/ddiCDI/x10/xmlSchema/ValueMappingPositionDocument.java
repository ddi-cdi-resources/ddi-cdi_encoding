/*
 * An XML document type.
 * Localname: ValueMappingPosition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPositionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ValueMappingPosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ValueMappingPositionDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPositionDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "valuemappingpositionbcd4doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ValueMappingPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPosition getValueMappingPosition();

    /**
     * Sets the "ValueMappingPosition" element
     */
    void setValueMappingPosition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPosition valueMappingPosition);

    /**
     * Appends and returns a new empty "ValueMappingPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingPosition addNewValueMappingPosition();
}
