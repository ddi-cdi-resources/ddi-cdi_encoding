/*
 * XML Type:  IndividualName
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML IndividualName(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class IndividualNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.IndividualName {
    private static final long serialVersionUID = 1L;

    public IndividualNameImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "abbreviation"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "context"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "effectiveDates"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "firstGiven"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "fullName"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "isFormal"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "isPreferred"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "lastFamily"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "middle"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "prefix"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "sex"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "suffix"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "typeOfIndividualName"),
    };


    /**
     * Gets the "abbreviation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getAbbreviation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "abbreviation" element
     */
    @Override
    public boolean isSetAbbreviation() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "abbreviation" element
     */
    @Override
    public void setAbbreviation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString abbreviation) {
        generatedSetterHelperImpl(abbreviation, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "abbreviation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewAbbreviation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "abbreviation" element
     */
    @Override
    public void unsetAbbreviation() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "context" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getContext() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "context" element
     */
    @Override
    public boolean isSetContext() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "context" element
     */
    @Override
    public void setContext(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry context) {
        generatedSetterHelperImpl(context, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "context" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewContext() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "context" element
     */
    @Override
    public void unsetContext() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "effectiveDates" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange getEffectiveDates() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "effectiveDates" element
     */
    @Override
    public boolean isSetEffectiveDates() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "effectiveDates" element
     */
    @Override
    public void setEffectiveDates(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange effectiveDates) {
        generatedSetterHelperImpl(effectiveDates, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "effectiveDates" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange addNewEffectiveDates() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "effectiveDates" element
     */
    @Override
    public void unsetEffectiveDates() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "firstGiven" element
     */
    @Override
    public java.lang.String getFirstGiven() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "firstGiven" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetFirstGiven() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return target;
        }
    }

    /**
     * True if has "firstGiven" element
     */
    @Override
    public boolean isSetFirstGiven() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "firstGiven" element
     */
    @Override
    public void setFirstGiven(java.lang.String firstGiven) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[3]);
            }
            target.setStringValue(firstGiven);
        }
    }

    /**
     * Sets (as xml) the "firstGiven" element
     */
    @Override
    public void xsetFirstGiven(org.apache.xmlbeans.XmlString firstGiven) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[3]);
            }
            target.set(firstGiven);
        }
    }

    /**
     * Unsets the "firstGiven" element
     */
    @Override
    public void unsetFirstGiven() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "fullName" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getFullName() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "fullName" element
     */
    @Override
    public boolean isSetFullName() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "fullName" element
     */
    @Override
    public void setFullName(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString fullName) {
        generatedSetterHelperImpl(fullName, PROPERTY_QNAME[4], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "fullName" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewFullName() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Unsets the "fullName" element
     */
    @Override
    public void unsetFullName() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }

    /**
     * Gets the "isFormal" element
     */
    @Override
    public boolean getIsFormal() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "isFormal" element
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetIsFormal() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return target;
        }
    }

    /**
     * True if has "isFormal" element
     */
    @Override
    public boolean isSetIsFormal() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]) != 0;
        }
    }

    /**
     * Sets the "isFormal" element
     */
    @Override
    public void setIsFormal(boolean isFormal) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[5]);
            }
            target.setBooleanValue(isFormal);
        }
    }

    /**
     * Sets (as xml) the "isFormal" element
     */
    @Override
    public void xsetIsFormal(org.apache.xmlbeans.XmlBoolean isFormal) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PROPERTY_QNAME[5]);
            }
            target.set(isFormal);
        }
    }

    /**
     * Unsets the "isFormal" element
     */
    @Override
    public void unsetIsFormal() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], 0);
        }
    }

    /**
     * Gets the "isPreferred" element
     */
    @Override
    public boolean getIsPreferred() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "isPreferred" element
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetIsPreferred() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            return target;
        }
    }

    /**
     * True if has "isPreferred" element
     */
    @Override
    public boolean isSetIsPreferred() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]) != 0;
        }
    }

    /**
     * Sets the "isPreferred" element
     */
    @Override
    public void setIsPreferred(boolean isPreferred) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[6]);
            }
            target.setBooleanValue(isPreferred);
        }
    }

    /**
     * Sets (as xml) the "isPreferred" element
     */
    @Override
    public void xsetIsPreferred(org.apache.xmlbeans.XmlBoolean isPreferred) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PROPERTY_QNAME[6]);
            }
            target.set(isPreferred);
        }
    }

    /**
     * Unsets the "isPreferred" element
     */
    @Override
    public void unsetIsPreferred() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], 0);
        }
    }

    /**
     * Gets the "lastFamily" element
     */
    @Override
    public java.lang.String getLastFamily() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "lastFamily" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetLastFamily() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            return target;
        }
    }

    /**
     * True if has "lastFamily" element
     */
    @Override
    public boolean isSetLastFamily() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[7]) != 0;
        }
    }

    /**
     * Sets the "lastFamily" element
     */
    @Override
    public void setLastFamily(java.lang.String lastFamily) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[7]);
            }
            target.setStringValue(lastFamily);
        }
    }

    /**
     * Sets (as xml) the "lastFamily" element
     */
    @Override
    public void xsetLastFamily(org.apache.xmlbeans.XmlString lastFamily) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[7]);
            }
            target.set(lastFamily);
        }
    }

    /**
     * Unsets the "lastFamily" element
     */
    @Override
    public void unsetLastFamily() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[7], 0);
        }
    }

    /**
     * Gets a List of "middle" elements
     */
    @Override
    public java.util.List<java.lang.String> getMiddleList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getMiddleArray,
                this::setMiddleArray,
                this::insertMiddle,
                this::removeMiddle,
                this::sizeOfMiddleArray
            );
        }
    }

    /**
     * Gets array of all "middle" elements
     */
    @Override
    public java.lang.String[] getMiddleArray() {
        return getObjectArray(PROPERTY_QNAME[8], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "middle" element
     */
    @Override
    public java.lang.String getMiddleArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[8], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "middle" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlString> xgetMiddleList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetMiddleArray,
                this::xsetMiddleArray,
                this::insertNewMiddle,
                this::removeMiddle,
                this::sizeOfMiddleArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "middle" elements
     */
    @Override
    public org.apache.xmlbeans.XmlString[] xgetMiddleArray() {
        return xgetArray(PROPERTY_QNAME[8], org.apache.xmlbeans.XmlString[]::new);
    }

    /**
     * Gets (as xml) ith "middle" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetMiddleArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[8], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "middle" element
     */
    @Override
    public int sizeOfMiddleArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[8]);
        }
    }

    /**
     * Sets array of all "middle" element
     */
    @Override
    public void setMiddleArray(java.lang.String[] middleArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(middleArray, PROPERTY_QNAME[8]);
        }
    }

    /**
     * Sets ith "middle" element
     */
    @Override
    public void setMiddleArray(int i, java.lang.String middle) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[8], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(middle);
        }
    }

    /**
     * Sets (as xml) array of all "middle" element
     */
    @Override
    public void xsetMiddleArray(org.apache.xmlbeans.XmlString[]middleArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(middleArray, PROPERTY_QNAME[8]);
        }
    }

    /**
     * Sets (as xml) ith "middle" element
     */
    @Override
    public void xsetMiddleArray(int i, org.apache.xmlbeans.XmlString middle) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[8], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(middle);
        }
    }

    /**
     * Inserts the value as the ith "middle" element
     */
    @Override
    public void insertMiddle(int i, java.lang.String middle) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[8], i);
            target.setStringValue(middle);
        }
    }

    /**
     * Appends the value as the last "middle" element
     */
    @Override
    public void addMiddle(java.lang.String middle) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[8]);
            target.setStringValue(middle);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "middle" element
     */
    @Override
    public org.apache.xmlbeans.XmlString insertNewMiddle(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[8], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "middle" element
     */
    @Override
    public org.apache.xmlbeans.XmlString addNewMiddle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * Removes the ith "middle" element
     */
    @Override
    public void removeMiddle(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[8], i);
        }
    }

    /**
     * Gets the "prefix" element
     */
    @Override
    public java.lang.String getPrefix() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[9], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "prefix" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetPrefix() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[9], 0);
            return target;
        }
    }

    /**
     * True if has "prefix" element
     */
    @Override
    public boolean isSetPrefix() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[9]) != 0;
        }
    }

    /**
     * Sets the "prefix" element
     */
    @Override
    public void setPrefix(java.lang.String prefix) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[9], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[9]);
            }
            target.setStringValue(prefix);
        }
    }

    /**
     * Sets (as xml) the "prefix" element
     */
    @Override
    public void xsetPrefix(org.apache.xmlbeans.XmlString prefix) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[9], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[9]);
            }
            target.set(prefix);
        }
    }

    /**
     * Unsets the "prefix" element
     */
    @Override
    public void unsetPrefix() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[9], 0);
        }
    }

    /**
     * Gets the "sex" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SexSpecification.Enum getSex() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[10], 0);
            return (target == null) ? null : (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SexSpecification.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "sex" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SexSpecification xgetSex() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SexSpecification target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SexSpecification)get_store().find_element_user(PROPERTY_QNAME[10], 0);
            return target;
        }
    }

    /**
     * True if has "sex" element
     */
    @Override
    public boolean isSetSex() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[10]) != 0;
        }
    }

    /**
     * Sets the "sex" element
     */
    @Override
    public void setSex(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SexSpecification.Enum sex) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[10], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[10]);
            }
            target.setEnumValue(sex);
        }
    }

    /**
     * Sets (as xml) the "sex" element
     */
    @Override
    public void xsetSex(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SexSpecification sex) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SexSpecification target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SexSpecification)get_store().find_element_user(PROPERTY_QNAME[10], 0);
            if (target == null) {
                target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SexSpecification)get_store().add_element_user(PROPERTY_QNAME[10]);
            }
            target.set(sex);
        }
    }

    /**
     * Unsets the "sex" element
     */
    @Override
    public void unsetSex() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[10], 0);
        }
    }

    /**
     * Gets the "suffix" element
     */
    @Override
    public java.lang.String getSuffix() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[11], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "suffix" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetSuffix() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[11], 0);
            return target;
        }
    }

    /**
     * True if has "suffix" element
     */
    @Override
    public boolean isSetSuffix() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[11]) != 0;
        }
    }

    /**
     * Sets the "suffix" element
     */
    @Override
    public void setSuffix(java.lang.String suffix) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[11], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[11]);
            }
            target.setStringValue(suffix);
        }
    }

    /**
     * Sets (as xml) the "suffix" element
     */
    @Override
    public void xsetSuffix(org.apache.xmlbeans.XmlString suffix) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[11], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[11]);
            }
            target.set(suffix);
        }
    }

    /**
     * Unsets the "suffix" element
     */
    @Override
    public void unsetSuffix() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[11], 0);
        }
    }

    /**
     * Gets the "typeOfIndividualName" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getTypeOfIndividualName() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[12], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "typeOfIndividualName" element
     */
    @Override
    public boolean isSetTypeOfIndividualName() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[12]) != 0;
        }
    }

    /**
     * Sets the "typeOfIndividualName" element
     */
    @Override
    public void setTypeOfIndividualName(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry typeOfIndividualName) {
        generatedSetterHelperImpl(typeOfIndividualName, PROPERTY_QNAME[12], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "typeOfIndividualName" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewTypeOfIndividualName() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[12]);
            return target;
        }
    }

    /**
     * Unsets the "typeOfIndividualName" element
     */
    @Override
    public void unsetTypeOfIndividualName() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[12], 0);
        }
    }
}
