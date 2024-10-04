/*
 * XML Type:  CombinedDate
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CombinedDate(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface CombinedDate extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "combineddateb431type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "isoDate" element
     */
    java.util.Calendar getIsoDate();

    /**
     * Gets (as xml) the "isoDate" element
     */
    org.apache.xmlbeans.XmlDate xgetIsoDate();

    /**
     * True if has "isoDate" element
     */
    boolean isSetIsoDate();

    /**
     * Sets the "isoDate" element
     */
    void setIsoDate(java.util.Calendar isoDate);

    /**
     * Sets (as xml) the "isoDate" element
     */
    void xsetIsoDate(org.apache.xmlbeans.XmlDate isoDate);

    /**
     * Unsets the "isoDate" element
     */
    void unsetIsoDate();

    /**
     * Gets a List of "nonIsoDate" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDate> getNonIsoDateList();

    /**
     * Gets array of all "nonIsoDate" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDate[] getNonIsoDateArray();

    /**
     * Gets ith "nonIsoDate" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDate getNonIsoDateArray(int i);

    /**
     * Returns number of "nonIsoDate" element
     */
    int sizeOfNonIsoDateArray();

    /**
     * Sets array of all "nonIsoDate" element
     */
    void setNonIsoDateArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDate[] nonIsoDateArray);

    /**
     * Sets ith "nonIsoDate" element
     */
    void setNonIsoDateArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDate nonIsoDate);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "nonIsoDate" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDate insertNewNonIsoDate(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "nonIsoDate" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDate addNewNonIsoDate();

    /**
     * Removes the ith "nonIsoDate" element
     */
    void removeNonIsoDate(int i);

    /**
     * Gets the "semantics" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getSemantics();

    /**
     * True if has "semantics" element
     */
    boolean isSetSemantics();

    /**
     * Sets the "semantics" element
     */
    void setSemantics(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry semantics);

    /**
     * Appends and returns a new empty "semantics" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewSemantics();

    /**
     * Unsets the "semantics" element
     */
    void unsetSemantics();
}
