/*
 * XML Type:  LabelForDisplay
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML LabelForDisplay(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface LabelForDisplay extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "labelfordisplay92f9type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "locationVariant" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getLocationVariant();

    /**
     * True if has "locationVariant" element
     */
    boolean isSetLocationVariant();

    /**
     * Sets the "locationVariant" element
     */
    void setLocationVariant(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry locationVariant);

    /**
     * Appends and returns a new empty "locationVariant" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewLocationVariant();

    /**
     * Unsets the "locationVariant" element
     */
    void unsetLocationVariant();

    /**
     * Gets the "maxLength" element
     */
    java.math.BigInteger getMaxLength();

    /**
     * Gets (as xml) the "maxLength" element
     */
    org.apache.xmlbeans.XmlInteger xgetMaxLength();

    /**
     * True if has "maxLength" element
     */
    boolean isSetMaxLength();

    /**
     * Sets the "maxLength" element
     */
    void setMaxLength(java.math.BigInteger maxLength);

    /**
     * Sets (as xml) the "maxLength" element
     */
    void xsetMaxLength(org.apache.xmlbeans.XmlInteger maxLength);

    /**
     * Unsets the "maxLength" element
     */
    void unsetMaxLength();

    /**
     * Gets the "validDates" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange getValidDates();

    /**
     * True if has "validDates" element
     */
    boolean isSetValidDates();

    /**
     * Sets the "validDates" element
     */
    void setValidDates(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange validDates);

    /**
     * Appends and returns a new empty "validDates" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange addNewValidDates();

    /**
     * Unsets the "validDates" element
     */
    void unsetValidDates();
}
