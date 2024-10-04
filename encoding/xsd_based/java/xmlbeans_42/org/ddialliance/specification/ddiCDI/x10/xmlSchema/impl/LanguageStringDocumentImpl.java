/*
 * An XML document type.
 * Localname: LanguageString
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageStringDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one LanguageString(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class LanguageStringDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageStringDocument {
    private static final long serialVersionUID = 1L;

    public LanguageStringDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "LanguageString"),
    };


    /**
     * Gets the "LanguageString" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString getLanguageString() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "LanguageString" element
     */
    @Override
    public void setLanguageString(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString languageString) {
        generatedSetterHelperImpl(languageString, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "LanguageString" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString addNewLanguageString() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
