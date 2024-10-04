/*
 * XML Type:  AssociationReference
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML AssociationReference(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class AssociationReferenceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.AssociationReference {
    private static final long serialVersionUID = 1L;

    public AssociationReferenceImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ddiReference"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "validType"),
        new QName("", "isAssociationReference"),
    };


    /**
     * Gets the "ddiReference" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier getDdiReference() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "ddiReference" element
     */
    @Override
    public boolean isSetDdiReference() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "ddiReference" element
     */
    @Override
    public void setDdiReference(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier ddiReference) {
        generatedSetterHelperImpl(ddiReference, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ddiReference" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier addNewDdiReference() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "ddiReference" element
     */
    @Override
    public void unsetDdiReference() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets a List of "validType" elements
     */
    @Override
    public java.util.List<java.lang.String> getValidTypeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getValidTypeArray,
                this::setValidTypeArray,
                this::insertValidType,
                this::removeValidType,
                this::sizeOfValidTypeArray
            );
        }
    }

    /**
     * Gets array of all "validType" elements
     */
    @Override
    public java.lang.String[] getValidTypeArray() {
        return getObjectArray(PROPERTY_QNAME[1], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "validType" element
     */
    @Override
    public java.lang.String getValidTypeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "validType" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlString> xgetValidTypeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetValidTypeArray,
                this::xsetValidTypeArray,
                this::insertNewValidType,
                this::removeValidType,
                this::sizeOfValidTypeArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "validType" elements
     */
    @Override
    public org.apache.xmlbeans.XmlString[] xgetValidTypeArray() {
        return xgetArray(PROPERTY_QNAME[1], org.apache.xmlbeans.XmlString[]::new);
    }

    /**
     * Gets (as xml) ith "validType" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetValidTypeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "validType" element
     */
    @Override
    public int sizeOfValidTypeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "validType" element
     */
    @Override
    public void setValidTypeArray(java.lang.String[] validTypeArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(validTypeArray, PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets ith "validType" element
     */
    @Override
    public void setValidTypeArray(int i, java.lang.String validType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(validType);
        }
    }

    /**
     * Sets (as xml) array of all "validType" element
     */
    @Override
    public void xsetValidTypeArray(org.apache.xmlbeans.XmlString[]validTypeArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(validTypeArray, PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets (as xml) ith "validType" element
     */
    @Override
    public void xsetValidTypeArray(int i, org.apache.xmlbeans.XmlString validType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(validType);
        }
    }

    /**
     * Inserts the value as the ith "validType" element
     */
    @Override
    public void insertValidType(int i, java.lang.String validType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            target.setStringValue(validType);
        }
    }

    /**
     * Appends the value as the last "validType" element
     */
    @Override
    public void addValidType(java.lang.String validType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            target.setStringValue(validType);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "validType" element
     */
    @Override
    public org.apache.xmlbeans.XmlString insertNewValidType(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "validType" element
     */
    @Override
    public org.apache.xmlbeans.XmlString addNewValidType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "validType" element
     */
    @Override
    public void removeValidType(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets the "isAssociationReference" attribute
     */
    @Override
    public boolean getIsAssociationReference() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[2]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "isAssociationReference" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetIsAssociationReference() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[2]);
            }
            return target;
        }
    }

    /**
     * True if has "isAssociationReference" attribute
     */
    @Override
    public boolean isSetIsAssociationReference() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "isAssociationReference" attribute
     */
    @Override
    public void setIsAssociationReference(boolean isAssociationReference) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setBooleanValue(isAssociationReference);
        }
    }

    /**
     * Sets (as xml) the "isAssociationReference" attribute
     */
    @Override
    public void xsetIsAssociationReference(org.apache.xmlbeans.XmlBoolean isAssociationReference) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(isAssociationReference);
        }
    }

    /**
     * Unsets the "isAssociationReference" attribute
     */
    @Override
    public void unsetIsAssociationReference() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }
}
