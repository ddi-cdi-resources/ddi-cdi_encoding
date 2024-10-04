/*
 * An XML document type.
 * Localname: ValueAndConceptDescription
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ValueAndConceptDescription(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ValueAndConceptDescriptionDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescriptionDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "valueandconceptdescriptiondf68doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ValueAndConceptDescription" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription getValueAndConceptDescription();

    /**
     * Sets the "ValueAndConceptDescription" element
     */
    void setValueAndConceptDescription(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription valueAndConceptDescription);

    /**
     * Appends and returns a new empty "ValueAndConceptDescription" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription addNewValueAndConceptDescription();
}
