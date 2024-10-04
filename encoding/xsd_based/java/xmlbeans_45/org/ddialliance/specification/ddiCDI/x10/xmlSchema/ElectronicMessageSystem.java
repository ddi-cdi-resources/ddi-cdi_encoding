/*
 * XML Type:  ElectronicMessageSystem
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystem
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ElectronicMessageSystem(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface ElectronicMessageSystem extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystem> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "electronicmessagesystem2ca6type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "contactAddress" element
     */
    java.lang.String getContactAddress();

    /**
     * Gets (as xml) the "contactAddress" element
     */
    org.apache.xmlbeans.XmlString xgetContactAddress();

    /**
     * True if has "contactAddress" element
     */
    boolean isSetContactAddress();

    /**
     * Sets the "contactAddress" element
     */
    void setContactAddress(java.lang.String contactAddress);

    /**
     * Sets (as xml) the "contactAddress" element
     */
    void xsetContactAddress(org.apache.xmlbeans.XmlString contactAddress);

    /**
     * Unsets the "contactAddress" element
     */
    void unsetContactAddress();

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
     * Gets the "typeOfService" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getTypeOfService();

    /**
     * True if has "typeOfService" element
     */
    boolean isSetTypeOfService();

    /**
     * Sets the "typeOfService" element
     */
    void setTypeOfService(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry typeOfService);

    /**
     * Appends and returns a new empty "typeOfService" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewTypeOfService();

    /**
     * Unsets the "typeOfService" element
     */
    void unsetTypeOfService();
}
