/*
 * XML Type:  GeoRole
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.GeoRole
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML GeoRole(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface GeoRole extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpecializationRole {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.GeoRole> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "georolec093type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "geography" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getGeography();

    /**
     * True if has "geography" element
     */
    boolean isSetGeography();

    /**
     * Sets the "geography" element
     */
    void setGeography(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry geography);

    /**
     * Appends and returns a new empty "geography" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewGeography();

    /**
     * Unsets the "geography" element
     */
    void unsetGeography();
}
