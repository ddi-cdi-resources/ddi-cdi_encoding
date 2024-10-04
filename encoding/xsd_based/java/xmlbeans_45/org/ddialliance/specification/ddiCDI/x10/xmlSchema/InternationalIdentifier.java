/*
 * XML Type:  InternationalIdentifier
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalIdentifier
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML InternationalIdentifier(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface InternationalIdentifier extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalIdentifier> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "internationalidentifier9503type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "identifierContent" element
     */
    java.lang.String getIdentifierContent();

    /**
     * Gets (as xml) the "identifierContent" element
     */
    org.apache.xmlbeans.XmlString xgetIdentifierContent();

    /**
     * True if has "identifierContent" element
     */
    boolean isSetIdentifierContent();

    /**
     * Sets the "identifierContent" element
     */
    void setIdentifierContent(java.lang.String identifierContent);

    /**
     * Sets (as xml) the "identifierContent" element
     */
    void xsetIdentifierContent(org.apache.xmlbeans.XmlString identifierContent);

    /**
     * Unsets the "identifierContent" element
     */
    void unsetIdentifierContent();

    /**
     * Gets the "isURI" element
     */
    boolean getIsURI();

    /**
     * Gets (as xml) the "isURI" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsURI();

    /**
     * True if has "isURI" element
     */
    boolean isSetIsURI();

    /**
     * Sets the "isURI" element
     */
    void setIsURI(boolean isURI);

    /**
     * Sets (as xml) the "isURI" element
     */
    void xsetIsURI(org.apache.xmlbeans.XmlBoolean isURI);

    /**
     * Unsets the "isURI" element
     */
    void unsetIsURI();

    /**
     * Gets the "managingAgency" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getManagingAgency();

    /**
     * True if has "managingAgency" element
     */
    boolean isSetManagingAgency();

    /**
     * Sets the "managingAgency" element
     */
    void setManagingAgency(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry managingAgency);

    /**
     * Appends and returns a new empty "managingAgency" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewManagingAgency();

    /**
     * Unsets the "managingAgency" element
     */
    void unsetManagingAgency();
}
