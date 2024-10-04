/*
 * An XML document type.
 * Localname: InternationalString
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalStringDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one InternationalString(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface InternationalStringDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalStringDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "internationalstringe6dbdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "InternationalString" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getInternationalString();

    /**
     * Sets the "InternationalString" element
     */
    void setInternationalString(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString internationalString);

    /**
     * Appends and returns a new empty "InternationalString" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewInternationalString();
}
