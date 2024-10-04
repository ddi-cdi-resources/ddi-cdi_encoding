/*
 * XML Type:  ObjectAttributeSelector
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectAttributeSelector
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ObjectAttributeSelector(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class ObjectAttributeSelectorImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.SelectorImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectAttributeSelector {
    private static final long serialVersionUID = 1L;

    public ObjectAttributeSelectorImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "refinedBy"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "refinedByOrderNumber"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "value"),
    };


    /**
     * Gets the "refinedBy" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectAttributeSelector getRefinedBy() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectAttributeSelector target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectAttributeSelector)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "refinedBy" element
     */
    @Override
    public boolean isSetRefinedBy() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "refinedBy" element
     */
    @Override
    public void setRefinedBy(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectAttributeSelector refinedBy) {
        generatedSetterHelperImpl(refinedBy, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "refinedBy" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectAttributeSelector addNewRefinedBy() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectAttributeSelector target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectAttributeSelector)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "refinedBy" element
     */
    @Override
    public void unsetRefinedBy() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "refinedByOrderNumber" element
     */
    @Override
    public java.math.BigInteger getRefinedByOrderNumber() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) the "refinedByOrderNumber" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger xgetRefinedByOrderNumber() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * True if has "refinedByOrderNumber" element
     */
    @Override
    public boolean isSetRefinedByOrderNumber() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "refinedByOrderNumber" element
     */
    @Override
    public void setRefinedByOrderNumber(java.math.BigInteger refinedByOrderNumber) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setBigIntegerValue(refinedByOrderNumber);
        }
    }

    /**
     * Sets (as xml) the "refinedByOrderNumber" element
     */
    @Override
    public void xsetRefinedByOrderNumber(org.apache.xmlbeans.XmlInteger refinedByOrderNumber) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(refinedByOrderNumber);
        }
    }

    /**
     * Unsets the "refinedByOrderNumber" element
     */
    @Override
    public void unsetRefinedByOrderNumber() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "value" element
     */
    @Override
    public java.lang.String getValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "value" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return target;
        }
    }

    /**
     * True if has "value" element
     */
    @Override
    public boolean isSetValue() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "value" element
     */
    @Override
    public void setValue(java.lang.String value) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.setStringValue(value);
        }
    }

    /**
     * Sets (as xml) the "value" element
     */
    @Override
    public void xsetValue(org.apache.xmlbeans.XmlString value) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.set(value);
        }
    }

    /**
     * Unsets the "value" element
     */
    @Override
    public void unsetValue() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }
}
