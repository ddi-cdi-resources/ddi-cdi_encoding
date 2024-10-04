/*
 * An XML document type.
 * Localname: PairedControlledVocabularyEntry
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntryDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one PairedControlledVocabularyEntry(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface PairedControlledVocabularyEntryDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntryDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "pairedcontrolledvocabularyentry25e1doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "PairedControlledVocabularyEntry" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry getPairedControlledVocabularyEntry();

    /**
     * Sets the "PairedControlledVocabularyEntry" element
     */
    void setPairedControlledVocabularyEntry(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry pairedControlledVocabularyEntry);

    /**
     * Appends and returns a new empty "PairedControlledVocabularyEntry" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry addNewPairedControlledVocabularyEntry();
}
