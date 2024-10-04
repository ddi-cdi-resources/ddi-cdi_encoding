/*
 * XML Type:  Telephone
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Telephone
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Telephone(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface Telephone extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Telephone> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "telephone95f0type");
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
     * Gets the "telephoneNumber" element
     */
    java.lang.String getTelephoneNumber();

    /**
     * Gets (as xml) the "telephoneNumber" element
     */
    org.apache.xmlbeans.XmlString xgetTelephoneNumber();

    /**
     * True if has "telephoneNumber" element
     */
    boolean isSetTelephoneNumber();

    /**
     * Sets the "telephoneNumber" element
     */
    void setTelephoneNumber(java.lang.String telephoneNumber);

    /**
     * Sets (as xml) the "telephoneNumber" element
     */
    void xsetTelephoneNumber(org.apache.xmlbeans.XmlString telephoneNumber);

    /**
     * Unsets the "telephoneNumber" element
     */
    void unsetTelephoneNumber();

    /**
     * Gets the "typeOfTelephone" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getTypeOfTelephone();

    /**
     * True if has "typeOfTelephone" element
     */
    boolean isSetTypeOfTelephone();

    /**
     * Sets the "typeOfTelephone" element
     */
    void setTypeOfTelephone(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry typeOfTelephone);

    /**
     * Appends and returns a new empty "typeOfTelephone" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewTypeOfTelephone();

    /**
     * Unsets the "typeOfTelephone" element
     */
    void unsetTypeOfTelephone();
}
