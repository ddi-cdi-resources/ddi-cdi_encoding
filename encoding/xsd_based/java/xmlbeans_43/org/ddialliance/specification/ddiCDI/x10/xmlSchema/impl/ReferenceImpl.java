/*
 * XML Type:  Reference
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML Reference(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class ReferenceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Reference {
    private static final long serialVersionUID = 1L;

    public ReferenceImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ddiReference"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "deepLink"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "description"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "location"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "nonDdiReference"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "semantic"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "uri"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "validType"),
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
     * Gets the "deepLink" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Selector getDeepLink() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Selector target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Selector)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "deepLink" element
     */
    @Override
    public boolean isSetDeepLink() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "deepLink" element
     */
    @Override
    public void setDeepLink(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Selector deepLink) {
        generatedSetterHelperImpl(deepLink, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "deepLink" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Selector addNewDeepLink() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Selector target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Selector)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "deepLink" element
     */
    @Override
    public void unsetDeepLink() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "description" element
     */
    @Override
    public java.lang.String getDescription() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "description" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetDescription() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return target;
        }
    }

    /**
     * True if has "description" element
     */
    @Override
    public boolean isSetDescription() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "description" element
     */
    @Override
    public void setDescription(java.lang.String description) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.setStringValue(description);
        }
    }

    /**
     * Sets (as xml) the "description" element
     */
    @Override
    public void xsetDescription(org.apache.xmlbeans.XmlString description) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.set(description);
        }
    }

    /**
     * Unsets the "description" element
     */
    @Override
    public void unsetDescription() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "location" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getLocation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "location" element
     */
    @Override
    public boolean isSetLocation() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "location" element
     */
    @Override
    public void setLocation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString location) {
        generatedSetterHelperImpl(location, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "location" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewLocation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "location" element
     */
    @Override
    public void unsetLocation() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets a List of "nonDdiReference" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier> getNonDdiReferenceList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getNonDdiReferenceArray,
                this::setNonDdiReferenceArray,
                this::insertNewNonDdiReference,
                this::removeNonDdiReference,
                this::sizeOfNonDdiReferenceArray
            );
        }
    }

    /**
     * Gets array of all "nonDdiReference" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier[] getNonDdiReferenceArray() {
        return getXmlObjectArray(PROPERTY_QNAME[4], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier[0]);
    }

    /**
     * Gets ith "nonDdiReference" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier getNonDdiReferenceArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "nonDdiReference" element
     */
    @Override
    public int sizeOfNonDdiReferenceArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets array of all "nonDdiReference" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setNonDdiReferenceArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier[] nonDdiReferenceArray) {
        check_orphaned();
        arraySetterHelper(nonDdiReferenceArray, PROPERTY_QNAME[4]);
    }

    /**
     * Sets ith "nonDdiReference" element
     */
    @Override
    public void setNonDdiReferenceArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier nonDdiReference) {
        generatedSetterHelperImpl(nonDdiReference, PROPERTY_QNAME[4], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "nonDdiReference" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier insertNewNonDdiReference(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier)get_store().insert_element_user(PROPERTY_QNAME[4], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "nonDdiReference" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier addNewNonDdiReference() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Removes the ith "nonDdiReference" element
     */
    @Override
    public void removeNonDdiReference(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], i);
        }
    }

    /**
     * Gets the "semantic" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getSemantic() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "semantic" element
     */
    @Override
    public boolean isSetSemantic() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]) != 0;
        }
    }

    /**
     * Sets the "semantic" element
     */
    @Override
    public void setSemantic(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry semantic) {
        generatedSetterHelperImpl(semantic, PROPERTY_QNAME[5], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "semantic" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewSemantic() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Unsets the "semantic" element
     */
    @Override
    public void unsetSemantic() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], 0);
        }
    }

    /**
     * Gets the "uri" element
     */
    @Override
    public java.lang.String getUri() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "uri" element
     */
    @Override
    public org.apache.xmlbeans.XmlAnyURI xgetUri() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            return target;
        }
    }

    /**
     * True if has "uri" element
     */
    @Override
    public boolean isSetUri() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]) != 0;
        }
    }

    /**
     * Sets the "uri" element
     */
    @Override
    public void setUri(java.lang.String uri) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[6]);
            }
            target.setStringValue(uri);
        }
    }

    /**
     * Sets (as xml) the "uri" element
     */
    @Override
    public void xsetUri(org.apache.xmlbeans.XmlAnyURI uri) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(PROPERTY_QNAME[6]);
            }
            target.set(uri);
        }
    }

    /**
     * Unsets the "uri" element
     */
    @Override
    public void unsetUri() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], 0);
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
        return getObjectArray(PROPERTY_QNAME[7], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "validType" element
     */
    @Override
    public java.lang.String getValidTypeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[7], i);
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
        return xgetArray(PROPERTY_QNAME[7], org.apache.xmlbeans.XmlString[]::new);
    }

    /**
     * Gets (as xml) ith "validType" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetValidTypeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[7], i);
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
            return get_store().count_elements(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Sets array of all "validType" element
     */
    @Override
    public void setValidTypeArray(java.lang.String[] validTypeArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(validTypeArray, PROPERTY_QNAME[7]);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[7], i);
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
            arraySetterHelper(validTypeArray, PROPERTY_QNAME[7]);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[7], i);
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
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[7], i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[7]);
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
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[7], i);
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
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[7]);
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
            get_store().remove_element(PROPERTY_QNAME[7], i);
        }
    }
}
