/*
 * XML Type:  StatisticalClassification
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML StatisticalClassification(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class StatisticalClassificationImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.EnumerationDomainImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification {
    private static final long serialVersionUID = 1L;

    public StatisticalClassificationImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "allowsDuplicates"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "availableLanguage"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "catalogDetails"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "changeFromBase"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "copyright"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "displayLabel"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "isCurrent"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "isFloating"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "purposeOfVariant"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "rationale"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "releaseDate"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "updateChanges"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "usage"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "validDates"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "StatisticalClassification_isMaintainedBy_Organization"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "StatisticalClassification_isIndexedBy_ClassificationIndex"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "StatisticalClassification_isVariantOf_StatisticalClassification"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "StatisticalClassification_isSuccessorOf_StatisticalClassification"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "StatisticalClassification_isPredecessorOf_StatisticalClassification"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "StatisticalClassification_has_ClassificationItemPosition"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "StatisticalClassification_has_ClassificationItem"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "StatisticalClassification_has_LevelStructure"),
    };


    /**
     * Gets the "allowsDuplicates" element
     */
    @Override
    public boolean getAllowsDuplicates() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "allowsDuplicates" element
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetAllowsDuplicates() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * Sets the "allowsDuplicates" element
     */
    @Override
    public void setAllowsDuplicates(boolean allowsDuplicates) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setBooleanValue(allowsDuplicates);
        }
    }

    /**
     * Sets (as xml) the "allowsDuplicates" element
     */
    @Override
    public void xsetAllowsDuplicates(org.apache.xmlbeans.XmlBoolean allowsDuplicates) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(allowsDuplicates);
        }
    }

    /**
     * Gets a List of "availableLanguage" elements
     */
    @Override
    public java.util.List<java.lang.String> getAvailableLanguageList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getAvailableLanguageArray,
                this::setAvailableLanguageArray,
                this::insertAvailableLanguage,
                this::removeAvailableLanguage,
                this::sizeOfAvailableLanguageArray
            );
        }
    }

    /**
     * Gets array of all "availableLanguage" elements
     */
    @Override
    public java.lang.String[] getAvailableLanguageArray() {
        return getObjectArray(PROPERTY_QNAME[1], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "availableLanguage" element
     */
    @Override
    public java.lang.String getAvailableLanguageArray(int i) {
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
     * Gets (as xml) a List of "availableLanguage" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlLanguage> xgetAvailableLanguageList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetAvailableLanguageArray,
                this::xsetAvailableLanguageArray,
                this::insertNewAvailableLanguage,
                this::removeAvailableLanguage,
                this::sizeOfAvailableLanguageArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "availableLanguage" elements
     */
    @Override
    public org.apache.xmlbeans.XmlLanguage[] xgetAvailableLanguageArray() {
        return xgetArray(PROPERTY_QNAME[1], org.apache.xmlbeans.XmlLanguage[]::new);
    }

    /**
     * Gets (as xml) ith "availableLanguage" element
     */
    @Override
    public org.apache.xmlbeans.XmlLanguage xgetAvailableLanguageArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "availableLanguage" element
     */
    @Override
    public int sizeOfAvailableLanguageArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "availableLanguage" element
     */
    @Override
    public void setAvailableLanguageArray(java.lang.String[] availableLanguageArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(availableLanguageArray, PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets ith "availableLanguage" element
     */
    @Override
    public void setAvailableLanguageArray(int i, java.lang.String availableLanguage) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(availableLanguage);
        }
    }

    /**
     * Sets (as xml) array of all "availableLanguage" element
     */
    @Override
    public void xsetAvailableLanguageArray(org.apache.xmlbeans.XmlLanguage[]availableLanguageArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(availableLanguageArray, PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets (as xml) ith "availableLanguage" element
     */
    @Override
    public void xsetAvailableLanguageArray(int i, org.apache.xmlbeans.XmlLanguage availableLanguage) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(availableLanguage);
        }
    }

    /**
     * Inserts the value as the ith "availableLanguage" element
     */
    @Override
    public void insertAvailableLanguage(int i, java.lang.String availableLanguage) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            target.setStringValue(availableLanguage);
        }
    }

    /**
     * Appends the value as the last "availableLanguage" element
     */
    @Override
    public void addAvailableLanguage(java.lang.String availableLanguage) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            target.setStringValue(availableLanguage);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "availableLanguage" element
     */
    @Override
    public org.apache.xmlbeans.XmlLanguage insertNewAvailableLanguage(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "availableLanguage" element
     */
    @Override
    public org.apache.xmlbeans.XmlLanguage addNewAvailableLanguage() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "availableLanguage" element
     */
    @Override
    public void removeAvailableLanguage(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets the "catalogDetails" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails getCatalogDetails() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "catalogDetails" element
     */
    @Override
    public boolean isSetCatalogDetails() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "catalogDetails" element
     */
    @Override
    public void setCatalogDetails(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails catalogDetails) {
        generatedSetterHelperImpl(catalogDetails, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "catalogDetails" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails addNewCatalogDetails() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "catalogDetails" element
     */
    @Override
    public void unsetCatalogDetails() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "changeFromBase" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getChangeFromBase() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "changeFromBase" element
     */
    @Override
    public boolean isSetChangeFromBase() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "changeFromBase" element
     */
    @Override
    public void setChangeFromBase(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString changeFromBase) {
        generatedSetterHelperImpl(changeFromBase, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "changeFromBase" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewChangeFromBase() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "changeFromBase" element
     */
    @Override
    public void unsetChangeFromBase() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets a List of "copyright" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString> getCopyrightList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCopyrightArray,
                this::setCopyrightArray,
                this::insertNewCopyright,
                this::removeCopyright,
                this::sizeOfCopyrightArray
            );
        }
    }

    /**
     * Gets array of all "copyright" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] getCopyrightArray() {
        return getXmlObjectArray(PROPERTY_QNAME[4], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[0]);
    }

    /**
     * Gets ith "copyright" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getCopyrightArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "copyright" element
     */
    @Override
    public int sizeOfCopyrightArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets array of all "copyright" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCopyrightArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] copyrightArray) {
        check_orphaned();
        arraySetterHelper(copyrightArray, PROPERTY_QNAME[4]);
    }

    /**
     * Sets ith "copyright" element
     */
    @Override
    public void setCopyrightArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString copyright) {
        generatedSetterHelperImpl(copyright, PROPERTY_QNAME[4], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "copyright" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString insertNewCopyright(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().insert_element_user(PROPERTY_QNAME[4], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "copyright" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewCopyright() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Removes the ith "copyright" element
     */
    @Override
    public void removeCopyright(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], i);
        }
    }

    /**
     * Gets a List of "displayLabel" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay> getDisplayLabelList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDisplayLabelArray,
                this::setDisplayLabelArray,
                this::insertNewDisplayLabel,
                this::removeDisplayLabel,
                this::sizeOfDisplayLabelArray
            );
        }
    }

    /**
     * Gets array of all "displayLabel" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay[] getDisplayLabelArray() {
        return getXmlObjectArray(PROPERTY_QNAME[5], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay[0]);
    }

    /**
     * Gets ith "displayLabel" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay getDisplayLabelArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay)get_store().find_element_user(PROPERTY_QNAME[5], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "displayLabel" element
     */
    @Override
    public int sizeOfDisplayLabelArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Sets array of all "displayLabel" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDisplayLabelArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay[] displayLabelArray) {
        check_orphaned();
        arraySetterHelper(displayLabelArray, PROPERTY_QNAME[5]);
    }

    /**
     * Sets ith "displayLabel" element
     */
    @Override
    public void setDisplayLabelArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay displayLabel) {
        generatedSetterHelperImpl(displayLabel, PROPERTY_QNAME[5], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "displayLabel" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay insertNewDisplayLabel(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay)get_store().insert_element_user(PROPERTY_QNAME[5], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "displayLabel" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay addNewDisplayLabel() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Removes the ith "displayLabel" element
     */
    @Override
    public void removeDisplayLabel(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], i);
        }
    }

    /**
     * Gets the "isCurrent" element
     */
    @Override
    public boolean getIsCurrent() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "isCurrent" element
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetIsCurrent() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            return target;
        }
    }

    /**
     * True if has "isCurrent" element
     */
    @Override
    public boolean isSetIsCurrent() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]) != 0;
        }
    }

    /**
     * Sets the "isCurrent" element
     */
    @Override
    public void setIsCurrent(boolean isCurrent) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[6]);
            }
            target.setBooleanValue(isCurrent);
        }
    }

    /**
     * Sets (as xml) the "isCurrent" element
     */
    @Override
    public void xsetIsCurrent(org.apache.xmlbeans.XmlBoolean isCurrent) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PROPERTY_QNAME[6]);
            }
            target.set(isCurrent);
        }
    }

    /**
     * Unsets the "isCurrent" element
     */
    @Override
    public void unsetIsCurrent() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], 0);
        }
    }

    /**
     * Gets the "isFloating" element
     */
    @Override
    public boolean getIsFloating() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "isFloating" element
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetIsFloating() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            return target;
        }
    }

    /**
     * True if has "isFloating" element
     */
    @Override
    public boolean isSetIsFloating() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[7]) != 0;
        }
    }

    /**
     * Sets the "isFloating" element
     */
    @Override
    public void setIsFloating(boolean isFloating) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[7]);
            }
            target.setBooleanValue(isFloating);
        }
    }

    /**
     * Sets (as xml) the "isFloating" element
     */
    @Override
    public void xsetIsFloating(org.apache.xmlbeans.XmlBoolean isFloating) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PROPERTY_QNAME[7]);
            }
            target.set(isFloating);
        }
    }

    /**
     * Unsets the "isFloating" element
     */
    @Override
    public void unsetIsFloating() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[7], 0);
        }
    }

    /**
     * Gets the "purposeOfVariant" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getPurposeOfVariant() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().find_element_user(PROPERTY_QNAME[8], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "purposeOfVariant" element
     */
    @Override
    public boolean isSetPurposeOfVariant() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[8]) != 0;
        }
    }

    /**
     * Sets the "purposeOfVariant" element
     */
    @Override
    public void setPurposeOfVariant(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString purposeOfVariant) {
        generatedSetterHelperImpl(purposeOfVariant, PROPERTY_QNAME[8], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "purposeOfVariant" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewPurposeOfVariant() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * Unsets the "purposeOfVariant" element
     */
    @Override
    public void unsetPurposeOfVariant() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[8], 0);
        }
    }

    /**
     * Gets the "rationale" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getRationale() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().find_element_user(PROPERTY_QNAME[9], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "rationale" element
     */
    @Override
    public boolean isSetRationale() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[9]) != 0;
        }
    }

    /**
     * Sets the "rationale" element
     */
    @Override
    public void setRationale(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString rationale) {
        generatedSetterHelperImpl(rationale, PROPERTY_QNAME[9], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "rationale" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewRationale() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * Unsets the "rationale" element
     */
    @Override
    public void unsetRationale() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[9], 0);
        }
    }

    /**
     * Gets the "releaseDate" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate getReleaseDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate)get_store().find_element_user(PROPERTY_QNAME[10], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "releaseDate" element
     */
    @Override
    public boolean isSetReleaseDate() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[10]) != 0;
        }
    }

    /**
     * Sets the "releaseDate" element
     */
    @Override
    public void setReleaseDate(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate releaseDate) {
        generatedSetterHelperImpl(releaseDate, PROPERTY_QNAME[10], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "releaseDate" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate addNewReleaseDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate)get_store().add_element_user(PROPERTY_QNAME[10]);
            return target;
        }
    }

    /**
     * Unsets the "releaseDate" element
     */
    @Override
    public void unsetReleaseDate() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[10], 0);
        }
    }

    /**
     * Gets a List of "updateChanges" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString> getUpdateChangesList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getUpdateChangesArray,
                this::setUpdateChangesArray,
                this::insertNewUpdateChanges,
                this::removeUpdateChanges,
                this::sizeOfUpdateChangesArray
            );
        }
    }

    /**
     * Gets array of all "updateChanges" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] getUpdateChangesArray() {
        return getXmlObjectArray(PROPERTY_QNAME[11], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[0]);
    }

    /**
     * Gets ith "updateChanges" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getUpdateChangesArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().find_element_user(PROPERTY_QNAME[11], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "updateChanges" element
     */
    @Override
    public int sizeOfUpdateChangesArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[11]);
        }
    }

    /**
     * Sets array of all "updateChanges" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setUpdateChangesArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] updateChangesArray) {
        check_orphaned();
        arraySetterHelper(updateChangesArray, PROPERTY_QNAME[11]);
    }

    /**
     * Sets ith "updateChanges" element
     */
    @Override
    public void setUpdateChangesArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString updateChanges) {
        generatedSetterHelperImpl(updateChanges, PROPERTY_QNAME[11], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "updateChanges" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString insertNewUpdateChanges(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().insert_element_user(PROPERTY_QNAME[11], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "updateChanges" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewUpdateChanges() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[11]);
            return target;
        }
    }

    /**
     * Removes the ith "updateChanges" element
     */
    @Override
    public void removeUpdateChanges(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[11], i);
        }
    }

    /**
     * Gets the "usage" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getUsage() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().find_element_user(PROPERTY_QNAME[12], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "usage" element
     */
    @Override
    public boolean isSetUsage() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[12]) != 0;
        }
    }

    /**
     * Sets the "usage" element
     */
    @Override
    public void setUsage(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString usage) {
        generatedSetterHelperImpl(usage, PROPERTY_QNAME[12], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "usage" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewUsage() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[12]);
            return target;
        }
    }

    /**
     * Unsets the "usage" element
     */
    @Override
    public void unsetUsage() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[12], 0);
        }
    }

    /**
     * Gets the "validDates" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange getValidDates() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange)get_store().find_element_user(PROPERTY_QNAME[13], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "validDates" element
     */
    @Override
    public boolean isSetValidDates() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[13]) != 0;
        }
    }

    /**
     * Sets the "validDates" element
     */
    @Override
    public void setValidDates(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange validDates) {
        generatedSetterHelperImpl(validDates, PROPERTY_QNAME[13], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "validDates" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange addNewValidDates() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange)get_store().add_element_user(PROPERTY_QNAME[13]);
            return target;
        }
    }

    /**
     * Unsets the "validDates" element
     */
    @Override
    public void unsetValidDates() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[13], 0);
        }
    }

    /**
     * Gets a List of "StatisticalClassification_isMaintainedBy_Organization" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsMaintainedByOrganization> getStatisticalClassificationIsMaintainedByOrganizationList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getStatisticalClassificationIsMaintainedByOrganizationArray,
                this::setStatisticalClassificationIsMaintainedByOrganizationArray,
                this::insertNewStatisticalClassificationIsMaintainedByOrganization,
                this::removeStatisticalClassificationIsMaintainedByOrganization,
                this::sizeOfStatisticalClassificationIsMaintainedByOrganizationArray
            );
        }
    }

    /**
     * Gets array of all "StatisticalClassification_isMaintainedBy_Organization" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsMaintainedByOrganization[] getStatisticalClassificationIsMaintainedByOrganizationArray() {
        return getXmlObjectArray(PROPERTY_QNAME[14], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsMaintainedByOrganization[0]);
    }

    /**
     * Gets ith "StatisticalClassification_isMaintainedBy_Organization" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsMaintainedByOrganization getStatisticalClassificationIsMaintainedByOrganizationArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsMaintainedByOrganization target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsMaintainedByOrganization)get_store().find_element_user(PROPERTY_QNAME[14], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "StatisticalClassification_isMaintainedBy_Organization" element
     */
    @Override
    public int sizeOfStatisticalClassificationIsMaintainedByOrganizationArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[14]);
        }
    }

    /**
     * Sets array of all "StatisticalClassification_isMaintainedBy_Organization" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setStatisticalClassificationIsMaintainedByOrganizationArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsMaintainedByOrganization[] statisticalClassificationIsMaintainedByOrganizationArray) {
        check_orphaned();
        arraySetterHelper(statisticalClassificationIsMaintainedByOrganizationArray, PROPERTY_QNAME[14]);
    }

    /**
     * Sets ith "StatisticalClassification_isMaintainedBy_Organization" element
     */
    @Override
    public void setStatisticalClassificationIsMaintainedByOrganizationArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsMaintainedByOrganization statisticalClassificationIsMaintainedByOrganization) {
        generatedSetterHelperImpl(statisticalClassificationIsMaintainedByOrganization, PROPERTY_QNAME[14], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "StatisticalClassification_isMaintainedBy_Organization" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsMaintainedByOrganization insertNewStatisticalClassificationIsMaintainedByOrganization(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsMaintainedByOrganization target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsMaintainedByOrganization)get_store().insert_element_user(PROPERTY_QNAME[14], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "StatisticalClassification_isMaintainedBy_Organization" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsMaintainedByOrganization addNewStatisticalClassificationIsMaintainedByOrganization() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsMaintainedByOrganization target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsMaintainedByOrganization)get_store().add_element_user(PROPERTY_QNAME[14]);
            return target;
        }
    }

    /**
     * Removes the ith "StatisticalClassification_isMaintainedBy_Organization" element
     */
    @Override
    public void removeStatisticalClassificationIsMaintainedByOrganization(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[14], i);
        }
    }

    /**
     * Gets a List of "StatisticalClassification_isIndexedBy_ClassificationIndex" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsIndexedByClassificationIndex> getStatisticalClassificationIsIndexedByClassificationIndexList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getStatisticalClassificationIsIndexedByClassificationIndexArray,
                this::setStatisticalClassificationIsIndexedByClassificationIndexArray,
                this::insertNewStatisticalClassificationIsIndexedByClassificationIndex,
                this::removeStatisticalClassificationIsIndexedByClassificationIndex,
                this::sizeOfStatisticalClassificationIsIndexedByClassificationIndexArray
            );
        }
    }

    /**
     * Gets array of all "StatisticalClassification_isIndexedBy_ClassificationIndex" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsIndexedByClassificationIndex[] getStatisticalClassificationIsIndexedByClassificationIndexArray() {
        return getXmlObjectArray(PROPERTY_QNAME[15], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsIndexedByClassificationIndex[0]);
    }

    /**
     * Gets ith "StatisticalClassification_isIndexedBy_ClassificationIndex" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsIndexedByClassificationIndex getStatisticalClassificationIsIndexedByClassificationIndexArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsIndexedByClassificationIndex target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsIndexedByClassificationIndex)get_store().find_element_user(PROPERTY_QNAME[15], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "StatisticalClassification_isIndexedBy_ClassificationIndex" element
     */
    @Override
    public int sizeOfStatisticalClassificationIsIndexedByClassificationIndexArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[15]);
        }
    }

    /**
     * Sets array of all "StatisticalClassification_isIndexedBy_ClassificationIndex" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setStatisticalClassificationIsIndexedByClassificationIndexArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsIndexedByClassificationIndex[] statisticalClassificationIsIndexedByClassificationIndexArray) {
        check_orphaned();
        arraySetterHelper(statisticalClassificationIsIndexedByClassificationIndexArray, PROPERTY_QNAME[15]);
    }

    /**
     * Sets ith "StatisticalClassification_isIndexedBy_ClassificationIndex" element
     */
    @Override
    public void setStatisticalClassificationIsIndexedByClassificationIndexArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsIndexedByClassificationIndex statisticalClassificationIsIndexedByClassificationIndex) {
        generatedSetterHelperImpl(statisticalClassificationIsIndexedByClassificationIndex, PROPERTY_QNAME[15], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "StatisticalClassification_isIndexedBy_ClassificationIndex" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsIndexedByClassificationIndex insertNewStatisticalClassificationIsIndexedByClassificationIndex(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsIndexedByClassificationIndex target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsIndexedByClassificationIndex)get_store().insert_element_user(PROPERTY_QNAME[15], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "StatisticalClassification_isIndexedBy_ClassificationIndex" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsIndexedByClassificationIndex addNewStatisticalClassificationIsIndexedByClassificationIndex() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsIndexedByClassificationIndex target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsIndexedByClassificationIndex)get_store().add_element_user(PROPERTY_QNAME[15]);
            return target;
        }
    }

    /**
     * Removes the ith "StatisticalClassification_isIndexedBy_ClassificationIndex" element
     */
    @Override
    public void removeStatisticalClassificationIsIndexedByClassificationIndex(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[15], i);
        }
    }

    /**
     * Gets the "StatisticalClassification_isVariantOf_StatisticalClassification" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsVariantOfStatisticalClassification getStatisticalClassificationIsVariantOfStatisticalClassification() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsVariantOfStatisticalClassification target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsVariantOfStatisticalClassification)get_store().find_element_user(PROPERTY_QNAME[16], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "StatisticalClassification_isVariantOf_StatisticalClassification" element
     */
    @Override
    public boolean isSetStatisticalClassificationIsVariantOfStatisticalClassification() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[16]) != 0;
        }
    }

    /**
     * Sets the "StatisticalClassification_isVariantOf_StatisticalClassification" element
     */
    @Override
    public void setStatisticalClassificationIsVariantOfStatisticalClassification(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsVariantOfStatisticalClassification statisticalClassificationIsVariantOfStatisticalClassification) {
        generatedSetterHelperImpl(statisticalClassificationIsVariantOfStatisticalClassification, PROPERTY_QNAME[16], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "StatisticalClassification_isVariantOf_StatisticalClassification" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsVariantOfStatisticalClassification addNewStatisticalClassificationIsVariantOfStatisticalClassification() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsVariantOfStatisticalClassification target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsVariantOfStatisticalClassification)get_store().add_element_user(PROPERTY_QNAME[16]);
            return target;
        }
    }

    /**
     * Unsets the "StatisticalClassification_isVariantOf_StatisticalClassification" element
     */
    @Override
    public void unsetStatisticalClassificationIsVariantOfStatisticalClassification() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[16], 0);
        }
    }

    /**
     * Gets a List of "StatisticalClassification_isSuccessorOf_StatisticalClassification" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsSuccessorOfStatisticalClassification> getStatisticalClassificationIsSuccessorOfStatisticalClassificationList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getStatisticalClassificationIsSuccessorOfStatisticalClassificationArray,
                this::setStatisticalClassificationIsSuccessorOfStatisticalClassificationArray,
                this::insertNewStatisticalClassificationIsSuccessorOfStatisticalClassification,
                this::removeStatisticalClassificationIsSuccessorOfStatisticalClassification,
                this::sizeOfStatisticalClassificationIsSuccessorOfStatisticalClassificationArray
            );
        }
    }

    /**
     * Gets array of all "StatisticalClassification_isSuccessorOf_StatisticalClassification" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsSuccessorOfStatisticalClassification[] getStatisticalClassificationIsSuccessorOfStatisticalClassificationArray() {
        return getXmlObjectArray(PROPERTY_QNAME[17], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsSuccessorOfStatisticalClassification[0]);
    }

    /**
     * Gets ith "StatisticalClassification_isSuccessorOf_StatisticalClassification" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsSuccessorOfStatisticalClassification getStatisticalClassificationIsSuccessorOfStatisticalClassificationArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsSuccessorOfStatisticalClassification target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsSuccessorOfStatisticalClassification)get_store().find_element_user(PROPERTY_QNAME[17], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "StatisticalClassification_isSuccessorOf_StatisticalClassification" element
     */
    @Override
    public int sizeOfStatisticalClassificationIsSuccessorOfStatisticalClassificationArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[17]);
        }
    }

    /**
     * Sets array of all "StatisticalClassification_isSuccessorOf_StatisticalClassification" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setStatisticalClassificationIsSuccessorOfStatisticalClassificationArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsSuccessorOfStatisticalClassification[] statisticalClassificationIsSuccessorOfStatisticalClassificationArray) {
        check_orphaned();
        arraySetterHelper(statisticalClassificationIsSuccessorOfStatisticalClassificationArray, PROPERTY_QNAME[17]);
    }

    /**
     * Sets ith "StatisticalClassification_isSuccessorOf_StatisticalClassification" element
     */
    @Override
    public void setStatisticalClassificationIsSuccessorOfStatisticalClassificationArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsSuccessorOfStatisticalClassification statisticalClassificationIsSuccessorOfStatisticalClassification) {
        generatedSetterHelperImpl(statisticalClassificationIsSuccessorOfStatisticalClassification, PROPERTY_QNAME[17], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "StatisticalClassification_isSuccessorOf_StatisticalClassification" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsSuccessorOfStatisticalClassification insertNewStatisticalClassificationIsSuccessorOfStatisticalClassification(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsSuccessorOfStatisticalClassification target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsSuccessorOfStatisticalClassification)get_store().insert_element_user(PROPERTY_QNAME[17], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "StatisticalClassification_isSuccessorOf_StatisticalClassification" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsSuccessorOfStatisticalClassification addNewStatisticalClassificationIsSuccessorOfStatisticalClassification() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsSuccessorOfStatisticalClassification target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsSuccessorOfStatisticalClassification)get_store().add_element_user(PROPERTY_QNAME[17]);
            return target;
        }
    }

    /**
     * Removes the ith "StatisticalClassification_isSuccessorOf_StatisticalClassification" element
     */
    @Override
    public void removeStatisticalClassificationIsSuccessorOfStatisticalClassification(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[17], i);
        }
    }

    /**
     * Gets a List of "StatisticalClassification_isPredecessorOf_StatisticalClassification" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsPredecessorOfStatisticalClassification> getStatisticalClassificationIsPredecessorOfStatisticalClassificationList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getStatisticalClassificationIsPredecessorOfStatisticalClassificationArray,
                this::setStatisticalClassificationIsPredecessorOfStatisticalClassificationArray,
                this::insertNewStatisticalClassificationIsPredecessorOfStatisticalClassification,
                this::removeStatisticalClassificationIsPredecessorOfStatisticalClassification,
                this::sizeOfStatisticalClassificationIsPredecessorOfStatisticalClassificationArray
            );
        }
    }

    /**
     * Gets array of all "StatisticalClassification_isPredecessorOf_StatisticalClassification" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsPredecessorOfStatisticalClassification[] getStatisticalClassificationIsPredecessorOfStatisticalClassificationArray() {
        return getXmlObjectArray(PROPERTY_QNAME[18], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsPredecessorOfStatisticalClassification[0]);
    }

    /**
     * Gets ith "StatisticalClassification_isPredecessorOf_StatisticalClassification" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsPredecessorOfStatisticalClassification getStatisticalClassificationIsPredecessorOfStatisticalClassificationArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsPredecessorOfStatisticalClassification target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsPredecessorOfStatisticalClassification)get_store().find_element_user(PROPERTY_QNAME[18], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "StatisticalClassification_isPredecessorOf_StatisticalClassification" element
     */
    @Override
    public int sizeOfStatisticalClassificationIsPredecessorOfStatisticalClassificationArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[18]);
        }
    }

    /**
     * Sets array of all "StatisticalClassification_isPredecessorOf_StatisticalClassification" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setStatisticalClassificationIsPredecessorOfStatisticalClassificationArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsPredecessorOfStatisticalClassification[] statisticalClassificationIsPredecessorOfStatisticalClassificationArray) {
        check_orphaned();
        arraySetterHelper(statisticalClassificationIsPredecessorOfStatisticalClassificationArray, PROPERTY_QNAME[18]);
    }

    /**
     * Sets ith "StatisticalClassification_isPredecessorOf_StatisticalClassification" element
     */
    @Override
    public void setStatisticalClassificationIsPredecessorOfStatisticalClassificationArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsPredecessorOfStatisticalClassification statisticalClassificationIsPredecessorOfStatisticalClassification) {
        generatedSetterHelperImpl(statisticalClassificationIsPredecessorOfStatisticalClassification, PROPERTY_QNAME[18], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "StatisticalClassification_isPredecessorOf_StatisticalClassification" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsPredecessorOfStatisticalClassification insertNewStatisticalClassificationIsPredecessorOfStatisticalClassification(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsPredecessorOfStatisticalClassification target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsPredecessorOfStatisticalClassification)get_store().insert_element_user(PROPERTY_QNAME[18], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "StatisticalClassification_isPredecessorOf_StatisticalClassification" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsPredecessorOfStatisticalClassification addNewStatisticalClassificationIsPredecessorOfStatisticalClassification() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsPredecessorOfStatisticalClassification target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsPredecessorOfStatisticalClassification)get_store().add_element_user(PROPERTY_QNAME[18]);
            return target;
        }
    }

    /**
     * Removes the ith "StatisticalClassification_isPredecessorOf_StatisticalClassification" element
     */
    @Override
    public void removeStatisticalClassificationIsPredecessorOfStatisticalClassification(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[18], i);
        }
    }

    /**
     * Gets a List of "StatisticalClassification_has_ClassificationItemPosition" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItemPosition> getStatisticalClassificationHasClassificationItemPositionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getStatisticalClassificationHasClassificationItemPositionArray,
                this::setStatisticalClassificationHasClassificationItemPositionArray,
                this::insertNewStatisticalClassificationHasClassificationItemPosition,
                this::removeStatisticalClassificationHasClassificationItemPosition,
                this::sizeOfStatisticalClassificationHasClassificationItemPositionArray
            );
        }
    }

    /**
     * Gets array of all "StatisticalClassification_has_ClassificationItemPosition" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItemPosition[] getStatisticalClassificationHasClassificationItemPositionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[19], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItemPosition[0]);
    }

    /**
     * Gets ith "StatisticalClassification_has_ClassificationItemPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItemPosition getStatisticalClassificationHasClassificationItemPositionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItemPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItemPosition)get_store().find_element_user(PROPERTY_QNAME[19], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "StatisticalClassification_has_ClassificationItemPosition" element
     */
    @Override
    public int sizeOfStatisticalClassificationHasClassificationItemPositionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[19]);
        }
    }

    /**
     * Sets array of all "StatisticalClassification_has_ClassificationItemPosition" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setStatisticalClassificationHasClassificationItemPositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItemPosition[] statisticalClassificationHasClassificationItemPositionArray) {
        check_orphaned();
        arraySetterHelper(statisticalClassificationHasClassificationItemPositionArray, PROPERTY_QNAME[19]);
    }

    /**
     * Sets ith "StatisticalClassification_has_ClassificationItemPosition" element
     */
    @Override
    public void setStatisticalClassificationHasClassificationItemPositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItemPosition statisticalClassificationHasClassificationItemPosition) {
        generatedSetterHelperImpl(statisticalClassificationHasClassificationItemPosition, PROPERTY_QNAME[19], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "StatisticalClassification_has_ClassificationItemPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItemPosition insertNewStatisticalClassificationHasClassificationItemPosition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItemPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItemPosition)get_store().insert_element_user(PROPERTY_QNAME[19], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "StatisticalClassification_has_ClassificationItemPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItemPosition addNewStatisticalClassificationHasClassificationItemPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItemPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItemPosition)get_store().add_element_user(PROPERTY_QNAME[19]);
            return target;
        }
    }

    /**
     * Removes the ith "StatisticalClassification_has_ClassificationItemPosition" element
     */
    @Override
    public void removeStatisticalClassificationHasClassificationItemPosition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[19], i);
        }
    }

    /**
     * Gets a List of "StatisticalClassification_has_ClassificationItem" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItem> getStatisticalClassificationHasClassificationItemList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getStatisticalClassificationHasClassificationItemArray,
                this::setStatisticalClassificationHasClassificationItemArray,
                this::insertNewStatisticalClassificationHasClassificationItem,
                this::removeStatisticalClassificationHasClassificationItem,
                this::sizeOfStatisticalClassificationHasClassificationItemArray
            );
        }
    }

    /**
     * Gets array of all "StatisticalClassification_has_ClassificationItem" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItem[] getStatisticalClassificationHasClassificationItemArray() {
        return getXmlObjectArray(PROPERTY_QNAME[20], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItem[0]);
    }

    /**
     * Gets ith "StatisticalClassification_has_ClassificationItem" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItem getStatisticalClassificationHasClassificationItemArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItem target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItem)get_store().find_element_user(PROPERTY_QNAME[20], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "StatisticalClassification_has_ClassificationItem" element
     */
    @Override
    public int sizeOfStatisticalClassificationHasClassificationItemArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[20]);
        }
    }

    /**
     * Sets array of all "StatisticalClassification_has_ClassificationItem" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setStatisticalClassificationHasClassificationItemArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItem[] statisticalClassificationHasClassificationItemArray) {
        check_orphaned();
        arraySetterHelper(statisticalClassificationHasClassificationItemArray, PROPERTY_QNAME[20]);
    }

    /**
     * Sets ith "StatisticalClassification_has_ClassificationItem" element
     */
    @Override
    public void setStatisticalClassificationHasClassificationItemArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItem statisticalClassificationHasClassificationItem) {
        generatedSetterHelperImpl(statisticalClassificationHasClassificationItem, PROPERTY_QNAME[20], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "StatisticalClassification_has_ClassificationItem" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItem insertNewStatisticalClassificationHasClassificationItem(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItem target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItem)get_store().insert_element_user(PROPERTY_QNAME[20], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "StatisticalClassification_has_ClassificationItem" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItem addNewStatisticalClassificationHasClassificationItem() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItem target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItem)get_store().add_element_user(PROPERTY_QNAME[20]);
            return target;
        }
    }

    /**
     * Removes the ith "StatisticalClassification_has_ClassificationItem" element
     */
    @Override
    public void removeStatisticalClassificationHasClassificationItem(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[20], i);
        }
    }

    /**
     * Gets the "StatisticalClassification_has_LevelStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasLevelStructure getStatisticalClassificationHasLevelStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasLevelStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasLevelStructure)get_store().find_element_user(PROPERTY_QNAME[21], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "StatisticalClassification_has_LevelStructure" element
     */
    @Override
    public boolean isSetStatisticalClassificationHasLevelStructure() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[21]) != 0;
        }
    }

    /**
     * Sets the "StatisticalClassification_has_LevelStructure" element
     */
    @Override
    public void setStatisticalClassificationHasLevelStructure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasLevelStructure statisticalClassificationHasLevelStructure) {
        generatedSetterHelperImpl(statisticalClassificationHasLevelStructure, PROPERTY_QNAME[21], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "StatisticalClassification_has_LevelStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasLevelStructure addNewStatisticalClassificationHasLevelStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasLevelStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasLevelStructure)get_store().add_element_user(PROPERTY_QNAME[21]);
            return target;
        }
    }

    /**
     * Unsets the "StatisticalClassification_has_LevelStructure" element
     */
    @Override
    public void unsetStatisticalClassificationHasLevelStructure() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[21], 0);
        }
    }
    /**
     * An XML StatisticalClassification_isMaintainedBy_Organization(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class StatisticalClassificationIsMaintainedByOrganizationImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsMaintainedByOrganization {
        private static final long serialVersionUID = 1L;

        public StatisticalClassificationIsMaintainedByOrganizationImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification$StatisticalClassificationIsMaintainedByOrganization$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsMaintainedByOrganization.ValidType {
            private static final long serialVersionUID = 1L;

            public ValidTypeImpl(org.apache.xmlbeans.SchemaType sType) {
                super(sType, false);
            }

            protected ValidTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
                super(sType, b);
            }
        }
    }
    /**
     * An XML StatisticalClassification_isIndexedBy_ClassificationIndex(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class StatisticalClassificationIsIndexedByClassificationIndexImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsIndexedByClassificationIndex {
        private static final long serialVersionUID = 1L;

        public StatisticalClassificationIsIndexedByClassificationIndexImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification$StatisticalClassificationIsIndexedByClassificationIndex$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsIndexedByClassificationIndex.ValidType {
            private static final long serialVersionUID = 1L;

            public ValidTypeImpl(org.apache.xmlbeans.SchemaType sType) {
                super(sType, false);
            }

            protected ValidTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
                super(sType, b);
            }
        }
    }
    /**
     * An XML StatisticalClassification_isVariantOf_StatisticalClassification(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class StatisticalClassificationIsVariantOfStatisticalClassificationImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsVariantOfStatisticalClassification {
        private static final long serialVersionUID = 1L;

        public StatisticalClassificationIsVariantOfStatisticalClassificationImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification$StatisticalClassificationIsVariantOfStatisticalClassification$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsVariantOfStatisticalClassification.ValidType {
            private static final long serialVersionUID = 1L;

            public ValidTypeImpl(org.apache.xmlbeans.SchemaType sType) {
                super(sType, false);
            }

            protected ValidTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
                super(sType, b);
            }
        }
    }
    /**
     * An XML StatisticalClassification_isSuccessorOf_StatisticalClassification(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class StatisticalClassificationIsSuccessorOfStatisticalClassificationImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsSuccessorOfStatisticalClassification {
        private static final long serialVersionUID = 1L;

        public StatisticalClassificationIsSuccessorOfStatisticalClassificationImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification$StatisticalClassificationIsSuccessorOfStatisticalClassification$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsSuccessorOfStatisticalClassification.ValidType {
            private static final long serialVersionUID = 1L;

            public ValidTypeImpl(org.apache.xmlbeans.SchemaType sType) {
                super(sType, false);
            }

            protected ValidTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
                super(sType, b);
            }
        }
    }
    /**
     * An XML StatisticalClassification_isPredecessorOf_StatisticalClassification(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class StatisticalClassificationIsPredecessorOfStatisticalClassificationImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsPredecessorOfStatisticalClassification {
        private static final long serialVersionUID = 1L;

        public StatisticalClassificationIsPredecessorOfStatisticalClassificationImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification$StatisticalClassificationIsPredecessorOfStatisticalClassification$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationIsPredecessorOfStatisticalClassification.ValidType {
            private static final long serialVersionUID = 1L;

            public ValidTypeImpl(org.apache.xmlbeans.SchemaType sType) {
                super(sType, false);
            }

            protected ValidTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
                super(sType, b);
            }
        }
    }
    /**
     * An XML StatisticalClassification_has_ClassificationItemPosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class StatisticalClassificationHasClassificationItemPositionImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItemPosition {
        private static final long serialVersionUID = 1L;

        public StatisticalClassificationHasClassificationItemPositionImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "validType"),
        };


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
            return getObjectArray(PROPERTY_QNAME[0], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
        }

        /**
         * Gets ith "validType" element
         */
        @Override
        public java.lang.String getValidTypeArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
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
            return xgetArray(PROPERTY_QNAME[0], org.apache.xmlbeans.XmlString[]::new);
        }

        /**
         * Gets (as xml) ith "validType" element
         */
        @Override
        public org.apache.xmlbeans.XmlString xgetValidTypeArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], i);
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
                return get_store().count_elements(PROPERTY_QNAME[0]);
            }
        }

        /**
         * Sets array of all "validType" element
         */
        @Override
        public void setValidTypeArray(java.lang.String[] validTypeArray) {
            synchronized (monitor()) {
                check_orphaned();
                arraySetterHelper(validTypeArray, PROPERTY_QNAME[0]);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
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
                arraySetterHelper(validTypeArray, PROPERTY_QNAME[0]);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], i);
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
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[0], i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
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
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[0], i);
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
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[0]);
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
                get_store().remove_element(PROPERTY_QNAME[0], i);
            }
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification$StatisticalClassificationHasClassificationItemPosition$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItemPosition.ValidType {
            private static final long serialVersionUID = 1L;

            public ValidTypeImpl(org.apache.xmlbeans.SchemaType sType) {
                super(sType, false);
            }

            protected ValidTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
                super(sType, b);
            }
        }
    }
    /**
     * An XML StatisticalClassification_has_ClassificationItem(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class StatisticalClassificationHasClassificationItemImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItem {
        private static final long serialVersionUID = 1L;

        public StatisticalClassificationHasClassificationItemImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification$StatisticalClassificationHasClassificationItem$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasClassificationItem.ValidType {
            private static final long serialVersionUID = 1L;

            public ValidTypeImpl(org.apache.xmlbeans.SchemaType sType) {
                super(sType, false);
            }

            protected ValidTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
                super(sType, b);
            }
        }
    }
    /**
     * An XML StatisticalClassification_has_LevelStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class StatisticalClassificationHasLevelStructureImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasLevelStructure {
        private static final long serialVersionUID = 1L;

        public StatisticalClassificationHasLevelStructureImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification$StatisticalClassificationHasLevelStructure$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassification.StatisticalClassificationHasLevelStructure.ValidType {
            private static final long serialVersionUID = 1L;

            public ValidTypeImpl(org.apache.xmlbeans.SchemaType sType) {
                super(sType, false);
            }

            protected ValidTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
                super(sType, b);
            }
        }
    }
}
