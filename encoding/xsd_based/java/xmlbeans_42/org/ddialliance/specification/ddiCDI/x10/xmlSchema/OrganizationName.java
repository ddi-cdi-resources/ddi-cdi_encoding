/*
 * XML Type:  OrganizationName
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationName
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML OrganizationName(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface OrganizationName extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.OrganizationName> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "organizationnameb33ctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "abbreviation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getAbbreviation();

    /**
     * True if has "abbreviation" element
     */
    boolean isSetAbbreviation();

    /**
     * Sets the "abbreviation" element
     */
    void setAbbreviation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString abbreviation);

    /**
     * Appends and returns a new empty "abbreviation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewAbbreviation();

    /**
     * Unsets the "abbreviation" element
     */
    void unsetAbbreviation();

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
     * Gets the "isFormal" element
     */
    boolean getIsFormal();

    /**
     * Gets (as xml) the "isFormal" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsFormal();

    /**
     * True if has "isFormal" element
     */
    boolean isSetIsFormal();

    /**
     * Sets the "isFormal" element
     */
    void setIsFormal(boolean isFormal);

    /**
     * Sets (as xml) the "isFormal" element
     */
    void xsetIsFormal(org.apache.xmlbeans.XmlBoolean isFormal);

    /**
     * Unsets the "isFormal" element
     */
    void unsetIsFormal();

    /**
     * Gets the "typeOfOrganizationName" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getTypeOfOrganizationName();

    /**
     * True if has "typeOfOrganizationName" element
     */
    boolean isSetTypeOfOrganizationName();

    /**
     * Sets the "typeOfOrganizationName" element
     */
    void setTypeOfOrganizationName(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry typeOfOrganizationName);

    /**
     * Appends and returns a new empty "typeOfOrganizationName" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewTypeOfOrganizationName();

    /**
     * Unsets the "typeOfOrganizationName" element
     */
    void unsetTypeOfOrganizationName();
}
