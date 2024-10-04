/*
 * An XML document type.
 * Localname: LanguageString
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageStringDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one LanguageString(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface LanguageStringDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageStringDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "languagestringf437doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "LanguageString" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString getLanguageString();

    /**
     * Sets the "LanguageString" element
     */
    void setLanguageString(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString languageString);

    /**
     * Appends and returns a new empty "LanguageString" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString addNewLanguageString();
}
