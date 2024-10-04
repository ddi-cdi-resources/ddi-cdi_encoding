/*
 * XML Type:  InternationalString
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML InternationalString(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class InternationalStringImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString {
    private static final long serialVersionUID = 1L;

    public InternationalStringImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "languageSpecificString"),
    };


    /**
     * Gets a List of "languageSpecificString" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString> getLanguageSpecificStringList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getLanguageSpecificStringArray,
                this::setLanguageSpecificStringArray,
                this::insertNewLanguageSpecificString,
                this::removeLanguageSpecificString,
                this::sizeOfLanguageSpecificStringArray
            );
        }
    }

    /**
     * Gets array of all "languageSpecificString" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString[] getLanguageSpecificStringArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString[0]);
    }

    /**
     * Gets ith "languageSpecificString" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString getLanguageSpecificStringArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "languageSpecificString" element
     */
    @Override
    public int sizeOfLanguageSpecificStringArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "languageSpecificString" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setLanguageSpecificStringArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString[] languageSpecificStringArray) {
        check_orphaned();
        arraySetterHelper(languageSpecificStringArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "languageSpecificString" element
     */
    @Override
    public void setLanguageSpecificStringArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString languageSpecificString) {
        generatedSetterHelperImpl(languageSpecificString, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "languageSpecificString" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString insertNewLanguageSpecificString(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "languageSpecificString" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString addNewLanguageSpecificString() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "languageSpecificString" element
     */
    @Override
    public void removeLanguageSpecificString(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
