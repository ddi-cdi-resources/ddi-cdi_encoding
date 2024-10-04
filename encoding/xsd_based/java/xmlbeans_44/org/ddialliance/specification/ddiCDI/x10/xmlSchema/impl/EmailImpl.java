/*
 * XML Type:  Email
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Email
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML Email(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class EmailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Email {
    private static final long serialVersionUID = 1L;

    public EmailImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "effectiveDates"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "internetEmail"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "isPreferred"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "privacy"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "typeOfEmail"),
    };


    /**
     * Gets the "effectiveDates" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange getEffectiveDates() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange)get_store().find_element_user(PROPERTY_QNAME[0], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "effectiveDates" element
     */
    @Override
    public void setEffectiveDates(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange effectiveDates) {
        generatedSetterHelperImpl(effectiveDates, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "effectiveDates" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange addNewEffectiveDates() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange)get_store().add_element_user(PROPERTY_QNAME[0]);
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
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "internetEmail" element
     */
    @Override
    public java.lang.String getInternetEmail() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "internetEmail" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetInternetEmail() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * True if has "internetEmail" element
     */
    @Override
    public boolean isSetInternetEmail() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "internetEmail" element
     */
    @Override
    public void setInternetEmail(java.lang.String internetEmail) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(internetEmail);
        }
    }

    /**
     * Sets (as xml) the "internetEmail" element
     */
    @Override
    public void xsetInternetEmail(org.apache.xmlbeans.XmlString internetEmail) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(internetEmail);
        }
    }

    /**
     * Unsets the "internetEmail" element
     */
    @Override
    public void unsetInternetEmail() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[2], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[2]);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PROPERTY_QNAME[2]);
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
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "privacy" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getPrivacy() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "privacy" element
     */
    @Override
    public boolean isSetPrivacy() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "privacy" element
     */
    @Override
    public void setPrivacy(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry privacy) {
        generatedSetterHelperImpl(privacy, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "privacy" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewPrivacy() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "privacy" element
     */
    @Override
    public void unsetPrivacy() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "typeOfEmail" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getTypeOfEmail() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "typeOfEmail" element
     */
    @Override
    public boolean isSetTypeOfEmail() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "typeOfEmail" element
     */
    @Override
    public void setTypeOfEmail(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry typeOfEmail) {
        generatedSetterHelperImpl(typeOfEmail, PROPERTY_QNAME[4], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "typeOfEmail" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewTypeOfEmail() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Unsets the "typeOfEmail" element
     */
    @Override
    public void unsetTypeOfEmail() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }
}
