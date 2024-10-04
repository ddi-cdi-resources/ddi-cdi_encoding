/*
 * XML Type:  LanguageString
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML LanguageString(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class LanguageStringImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.LanguageString {
    private static final long serialVersionUID = 1L;

    public LanguageStringImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "content"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "isTranslatable"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "isTranslated"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "scope"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "structureUsed"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "translationDate"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "translationSourceLanguage"),
    };


    /**
     * Gets the "content" element
     */
    @Override
    public java.lang.String getContent() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "content" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetContent() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * Sets the "content" element
     */
    @Override
    public void setContent(java.lang.String content) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(content);
        }
    }

    /**
     * Sets (as xml) the "content" element
     */
    @Override
    public void xsetContent(org.apache.xmlbeans.XmlString content) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(content);
        }
    }

    /**
     * Gets the "isTranslatable" element
     */
    @Override
    public boolean getIsTranslatable() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "isTranslatable" element
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetIsTranslatable() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * True if has "isTranslatable" element
     */
    @Override
    public boolean isSetIsTranslatable() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "isTranslatable" element
     */
    @Override
    public void setIsTranslatable(boolean isTranslatable) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setBooleanValue(isTranslatable);
        }
    }

    /**
     * Sets (as xml) the "isTranslatable" element
     */
    @Override
    public void xsetIsTranslatable(org.apache.xmlbeans.XmlBoolean isTranslatable) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(isTranslatable);
        }
    }

    /**
     * Unsets the "isTranslatable" element
     */
    @Override
    public void unsetIsTranslatable() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "isTranslated" element
     */
    @Override
    public boolean getIsTranslated() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "isTranslated" element
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetIsTranslated() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return target;
        }
    }

    /**
     * True if has "isTranslated" element
     */
    @Override
    public boolean isSetIsTranslated() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "isTranslated" element
     */
    @Override
    public void setIsTranslated(boolean isTranslated) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.setBooleanValue(isTranslated);
        }
    }

    /**
     * Sets (as xml) the "isTranslated" element
     */
    @Override
    public void xsetIsTranslated(org.apache.xmlbeans.XmlBoolean isTranslated) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.set(isTranslated);
        }
    }

    /**
     * Unsets the "isTranslated" element
     */
    @Override
    public void unsetIsTranslated() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "scope" element
     */
    @Override
    public java.lang.String getScope() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "scope" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetScope() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return target;
        }
    }

    /**
     * True if has "scope" element
     */
    @Override
    public boolean isSetScope() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "scope" element
     */
    @Override
    public void setScope(java.lang.String scope) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[3]);
            }
            target.setStringValue(scope);
        }
    }

    /**
     * Sets (as xml) the "scope" element
     */
    @Override
    public void xsetScope(org.apache.xmlbeans.XmlString scope) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[3]);
            }
            target.set(scope);
        }
    }

    /**
     * Unsets the "scope" element
     */
    @Override
    public void unsetScope() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "structureUsed" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getStructureUsed() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "structureUsed" element
     */
    @Override
    public boolean isSetStructureUsed() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "structureUsed" element
     */
    @Override
    public void setStructureUsed(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry structureUsed) {
        generatedSetterHelperImpl(structureUsed, PROPERTY_QNAME[4], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "structureUsed" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewStructureUsed() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Unsets the "structureUsed" element
     */
    @Override
    public void unsetStructureUsed() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }

    /**
     * Gets the "translationDate" element
     */
    @Override
    public java.util.Calendar getTranslationDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return (target == null) ? null : target.getCalendarValue();
        }
    }

    /**
     * Gets (as xml) the "translationDate" element
     */
    @Override
    public org.apache.xmlbeans.XmlDate xgetTranslationDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return target;
        }
    }

    /**
     * True if has "translationDate" element
     */
    @Override
    public boolean isSetTranslationDate() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]) != 0;
        }
    }

    /**
     * Sets the "translationDate" element
     */
    @Override
    public void setTranslationDate(java.util.Calendar translationDate) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[5]);
            }
            target.setCalendarValue(translationDate);
        }
    }

    /**
     * Sets (as xml) the "translationDate" element
     */
    @Override
    public void xsetTranslationDate(org.apache.xmlbeans.XmlDate translationDate) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(PROPERTY_QNAME[5]);
            }
            target.set(translationDate);
        }
    }

    /**
     * Unsets the "translationDate" element
     */
    @Override
    public void unsetTranslationDate() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], 0);
        }
    }

    /**
     * Gets a List of "translationSourceLanguage" elements
     */
    @Override
    public java.util.List<java.lang.String> getTranslationSourceLanguageList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getTranslationSourceLanguageArray,
                this::setTranslationSourceLanguageArray,
                this::insertTranslationSourceLanguage,
                this::removeTranslationSourceLanguage,
                this::sizeOfTranslationSourceLanguageArray
            );
        }
    }

    /**
     * Gets array of all "translationSourceLanguage" elements
     */
    @Override
    public java.lang.String[] getTranslationSourceLanguageArray() {
        return getObjectArray(PROPERTY_QNAME[6], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "translationSourceLanguage" element
     */
    @Override
    public java.lang.String getTranslationSourceLanguageArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "translationSourceLanguage" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlLanguage> xgetTranslationSourceLanguageList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetTranslationSourceLanguageArray,
                this::xsetTranslationSourceLanguageArray,
                this::insertNewTranslationSourceLanguage,
                this::removeTranslationSourceLanguage,
                this::sizeOfTranslationSourceLanguageArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "translationSourceLanguage" elements
     */
    @Override
    public org.apache.xmlbeans.XmlLanguage[] xgetTranslationSourceLanguageArray() {
        return xgetArray(PROPERTY_QNAME[6], org.apache.xmlbeans.XmlLanguage[]::new);
    }

    /**
     * Gets (as xml) ith "translationSourceLanguage" element
     */
    @Override
    public org.apache.xmlbeans.XmlLanguage xgetTranslationSourceLanguageArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "translationSourceLanguage" element
     */
    @Override
    public int sizeOfTranslationSourceLanguageArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Sets array of all "translationSourceLanguage" element
     */
    @Override
    public void setTranslationSourceLanguageArray(java.lang.String[] translationSourceLanguageArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(translationSourceLanguageArray, PROPERTY_QNAME[6]);
        }
    }

    /**
     * Sets ith "translationSourceLanguage" element
     */
    @Override
    public void setTranslationSourceLanguageArray(int i, java.lang.String translationSourceLanguage) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(translationSourceLanguage);
        }
    }

    /**
     * Sets (as xml) array of all "translationSourceLanguage" element
     */
    @Override
    public void xsetTranslationSourceLanguageArray(org.apache.xmlbeans.XmlLanguage[]translationSourceLanguageArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(translationSourceLanguageArray, PROPERTY_QNAME[6]);
        }
    }

    /**
     * Sets (as xml) ith "translationSourceLanguage" element
     */
    @Override
    public void xsetTranslationSourceLanguageArray(int i, org.apache.xmlbeans.XmlLanguage translationSourceLanguage) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(translationSourceLanguage);
        }
    }

    /**
     * Inserts the value as the ith "translationSourceLanguage" element
     */
    @Override
    public void insertTranslationSourceLanguage(int i, java.lang.String translationSourceLanguage) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[6], i);
            target.setStringValue(translationSourceLanguage);
        }
    }

    /**
     * Appends the value as the last "translationSourceLanguage" element
     */
    @Override
    public void addTranslationSourceLanguage(java.lang.String translationSourceLanguage) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[6]);
            target.setStringValue(translationSourceLanguage);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "translationSourceLanguage" element
     */
    @Override
    public org.apache.xmlbeans.XmlLanguage insertNewTranslationSourceLanguage(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().insert_element_user(PROPERTY_QNAME[6], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "translationSourceLanguage" element
     */
    @Override
    public org.apache.xmlbeans.XmlLanguage addNewTranslationSourceLanguage() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Removes the ith "translationSourceLanguage" element
     */
    @Override
    public void removeTranslationSourceLanguage(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], i);
        }
    }
}
