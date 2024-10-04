/*
 * An XML document type.
 * Localname: NonIsoDate
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDateDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one NonIsoDate(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface NonIsoDateDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDateDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "nonisodated7f4doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "NonIsoDate" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDate getNonIsoDate();

    /**
     * Sets the "NonIsoDate" element
     */
    void setNonIsoDate(org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDate nonIsoDate);

    /**
     * Appends and returns a new empty "NonIsoDate" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDate addNewNonIsoDate();
}
