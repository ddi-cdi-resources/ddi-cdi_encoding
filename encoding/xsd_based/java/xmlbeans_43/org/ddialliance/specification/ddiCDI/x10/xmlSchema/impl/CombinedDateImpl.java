/*
 * XML Type:  CombinedDate
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CombinedDate(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class CombinedDateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate {
    private static final long serialVersionUID = 1L;

    public CombinedDateImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "isoDate"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "nonIsoDate"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "semantics"),
    };


    /**
     * Gets the "isoDate" element
     */
    @Override
    public java.util.Calendar getIsoDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getCalendarValue();
        }
    }

    /**
     * Gets (as xml) the "isoDate" element
     */
    @Override
    public org.apache.xmlbeans.XmlDate xgetIsoDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * True if has "isoDate" element
     */
    @Override
    public boolean isSetIsoDate() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "isoDate" element
     */
    @Override
    public void setIsoDate(java.util.Calendar isoDate) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setCalendarValue(isoDate);
        }
    }

    /**
     * Sets (as xml) the "isoDate" element
     */
    @Override
    public void xsetIsoDate(org.apache.xmlbeans.XmlDate isoDate) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(isoDate);
        }
    }

    /**
     * Unsets the "isoDate" element
     */
    @Override
    public void unsetIsoDate() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets a List of "nonIsoDate" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDate> getNonIsoDateList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getNonIsoDateArray,
                this::setNonIsoDateArray,
                this::insertNewNonIsoDate,
                this::removeNonIsoDate,
                this::sizeOfNonIsoDateArray
            );
        }
    }

    /**
     * Gets array of all "nonIsoDate" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDate[] getNonIsoDateArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDate[0]);
    }

    /**
     * Gets ith "nonIsoDate" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDate getNonIsoDateArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDate target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDate)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "nonIsoDate" element
     */
    @Override
    public int sizeOfNonIsoDateArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "nonIsoDate" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setNonIsoDateArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDate[] nonIsoDateArray) {
        check_orphaned();
        arraySetterHelper(nonIsoDateArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "nonIsoDate" element
     */
    @Override
    public void setNonIsoDateArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDate nonIsoDate) {
        generatedSetterHelperImpl(nonIsoDate, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "nonIsoDate" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDate insertNewNonIsoDate(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDate target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDate)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "nonIsoDate" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDate addNewNonIsoDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDate target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDate)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "nonIsoDate" element
     */
    @Override
    public void removeNonIsoDate(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets the "semantics" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getSemantics() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "semantics" element
     */
    @Override
    public boolean isSetSemantics() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "semantics" element
     */
    @Override
    public void setSemantics(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry semantics) {
        generatedSetterHelperImpl(semantics, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "semantics" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewSemantics() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "semantics" element
     */
    @Override
    public void unsetSemantics() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }
}
