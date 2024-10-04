/*
 * XML Type:  Email
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Email
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Email(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface Email extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Email> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "email1d08type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "effectiveDates" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange getEffectiveDates();

    /**
     * True if has "effectiveDates" element
     */
    boolean isSetEffectiveDates();

    /**
     * Sets the "effectiveDates" element
     */
    void setEffectiveDates(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange effectiveDates);

    /**
     * Appends and returns a new empty "effectiveDates" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange addNewEffectiveDates();

    /**
     * Unsets the "effectiveDates" element
     */
    void unsetEffectiveDates();

    /**
     * Gets the "internetEmail" element
     */
    java.lang.String getInternetEmail();

    /**
     * Gets (as xml) the "internetEmail" element
     */
    org.apache.xmlbeans.XmlString xgetInternetEmail();

    /**
     * True if has "internetEmail" element
     */
    boolean isSetInternetEmail();

    /**
     * Sets the "internetEmail" element
     */
    void setInternetEmail(java.lang.String internetEmail);

    /**
     * Sets (as xml) the "internetEmail" element
     */
    void xsetInternetEmail(org.apache.xmlbeans.XmlString internetEmail);

    /**
     * Unsets the "internetEmail" element
     */
    void unsetInternetEmail();

    /**
     * Gets the "isPreferred" element
     */
    boolean getIsPreferred();

    /**
     * Gets (as xml) the "isPreferred" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsPreferred();

    /**
     * True if has "isPreferred" element
     */
    boolean isSetIsPreferred();

    /**
     * Sets the "isPreferred" element
     */
    void setIsPreferred(boolean isPreferred);

    /**
     * Sets (as xml) the "isPreferred" element
     */
    void xsetIsPreferred(org.apache.xmlbeans.XmlBoolean isPreferred);

    /**
     * Unsets the "isPreferred" element
     */
    void unsetIsPreferred();

    /**
     * Gets the "privacy" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getPrivacy();

    /**
     * True if has "privacy" element
     */
    boolean isSetPrivacy();

    /**
     * Sets the "privacy" element
     */
    void setPrivacy(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry privacy);

    /**
     * Appends and returns a new empty "privacy" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewPrivacy();

    /**
     * Unsets the "privacy" element
     */
    void unsetPrivacy();

    /**
     * Gets the "typeOfEmail" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getTypeOfEmail();

    /**
     * True if has "typeOfEmail" element
     */
    boolean isSetTypeOfEmail();

    /**
     * Sets the "typeOfEmail" element
     */
    void setTypeOfEmail(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry typeOfEmail);

    /**
     * Appends and returns a new empty "typeOfEmail" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewTypeOfEmail();

    /**
     * Unsets the "typeOfEmail" element
     */
    void unsetTypeOfEmail();
}
