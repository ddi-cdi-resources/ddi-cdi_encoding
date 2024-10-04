/*
 * An XML document type.
 * Localname: PairedControlledVocabularyEntry
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntryDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one PairedControlledVocabularyEntry(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class PairedControlledVocabularyEntryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntryDocument {
    private static final long serialVersionUID = 1L;

    public PairedControlledVocabularyEntryDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "PairedControlledVocabularyEntry"),
    };


    /**
     * Gets the "PairedControlledVocabularyEntry" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry getPairedControlledVocabularyEntry() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "PairedControlledVocabularyEntry" element
     */
    @Override
    public void setPairedControlledVocabularyEntry(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry pairedControlledVocabularyEntry) {
        generatedSetterHelperImpl(pairedControlledVocabularyEntry, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "PairedControlledVocabularyEntry" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry addNewPairedControlledVocabularyEntry() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
