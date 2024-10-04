/*
 * An XML document type.
 * Localname: ValueDomain
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueDomainDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one ValueDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface ValueDomainDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueDomainDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "valuedomain2a31doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueDomain getValueDomain();

    /**
     * Sets the "ValueDomain" element
     */
    void setValueDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueDomain valueDomain);

    /**
     * Appends and returns a new empty "ValueDomain" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueDomain addNewValueDomain();
}
