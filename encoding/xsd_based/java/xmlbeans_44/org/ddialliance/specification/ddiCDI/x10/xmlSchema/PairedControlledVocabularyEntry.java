/*
 * XML Type:  PairedControlledVocabularyEntry
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML PairedControlledVocabularyEntry(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface PairedControlledVocabularyEntry extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "pairedcontrolledvocabularyentryedf1type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "extent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getExtent();

    /**
     * True if has "extent" element
     */
    boolean isSetExtent();

    /**
     * Sets the "extent" element
     */
    void setExtent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry extent);

    /**
     * Appends and returns a new empty "extent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewExtent();

    /**
     * Unsets the "extent" element
     */
    void unsetExtent();

    /**
     * Gets the "term" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getTerm();

    /**
     * Sets the "term" element
     */
    void setTerm(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry term);

    /**
     * Appends and returns a new empty "term" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewTerm();
}
