/*
 * XML Type:  InternationalString
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML InternationalString(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface InternationalString extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "internationalstring46ebtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "languageSpecificString" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString> getLanguageSpecificStringList();

    /**
     * Gets array of all "languageSpecificString" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString[] getLanguageSpecificStringArray();

    /**
     * Gets ith "languageSpecificString" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString getLanguageSpecificStringArray(int i);

    /**
     * Returns number of "languageSpecificString" element
     */
    int sizeOfLanguageSpecificStringArray();

    /**
     * Sets array of all "languageSpecificString" element
     */
    void setLanguageSpecificStringArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString[] languageSpecificStringArray);

    /**
     * Sets ith "languageSpecificString" element
     */
    void setLanguageSpecificStringArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString languageSpecificString);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "languageSpecificString" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString insertNewLanguageSpecificString(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "languageSpecificString" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString addNewLanguageSpecificString();

    /**
     * Removes the ith "languageSpecificString" element
     */
    void removeLanguageSpecificString(int i);
}
