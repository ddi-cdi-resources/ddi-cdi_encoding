/*
 * XML Type:  ClassificationIndex
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ClassificationIndex(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class ClassificationIndexImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex {
    private static final long serialVersionUID = 1L;

    public ClassificationIndexImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "allowsDuplicates"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "availableLanguage"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "catalogDetails"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "codingInstruction"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "corrections"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "name"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "purpose"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "releaseDate"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ClassificationIndex_isMaintainedBy_Agent"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ClassificationIndex_hasContact_Agent"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ClassificationIndex_isDefinedBy_Concept"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ClassificationIndex_has_ClassificationIndexEntryPosition"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ClassificationIndex_has_ClassificationIndexEntry"),
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
     * Gets a List of "codingInstruction" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode> getCodingInstructionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCodingInstructionArray,
                this::setCodingInstructionArray,
                this::insertNewCodingInstruction,
                this::removeCodingInstruction,
                this::sizeOfCodingInstructionArray
            );
        }
    }

    /**
     * Gets array of all "codingInstruction" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode[] getCodingInstructionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode[0]);
    }

    /**
     * Gets ith "codingInstruction" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode getCodingInstructionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "codingInstruction" element
     */
    @Override
    public int sizeOfCodingInstructionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets array of all "codingInstruction" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCodingInstructionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode[] codingInstructionArray) {
        check_orphaned();
        arraySetterHelper(codingInstructionArray, PROPERTY_QNAME[3]);
    }

    /**
     * Sets ith "codingInstruction" element
     */
    @Override
    public void setCodingInstructionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode codingInstruction) {
        generatedSetterHelperImpl(codingInstruction, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "codingInstruction" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode insertNewCodingInstruction(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "codingInstruction" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode addNewCodingInstruction() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CommandCode)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "codingInstruction" element
     */
    @Override
    public void removeCodingInstruction(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }

    /**
     * Gets a List of "corrections" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString> getCorrectionsList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCorrectionsArray,
                this::setCorrectionsArray,
                this::insertNewCorrections,
                this::removeCorrections,
                this::sizeOfCorrectionsArray
            );
        }
    }

    /**
     * Gets array of all "corrections" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] getCorrectionsArray() {
        return getXmlObjectArray(PROPERTY_QNAME[4], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[0]);
    }

    /**
     * Gets ith "corrections" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getCorrectionsArray(int i) {
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
     * Returns number of "corrections" element
     */
    @Override
    public int sizeOfCorrectionsArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets array of all "corrections" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCorrectionsArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] correctionsArray) {
        check_orphaned();
        arraySetterHelper(correctionsArray, PROPERTY_QNAME[4]);
    }

    /**
     * Sets ith "corrections" element
     */
    @Override
    public void setCorrectionsArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString corrections) {
        generatedSetterHelperImpl(corrections, PROPERTY_QNAME[4], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "corrections" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString insertNewCorrections(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().insert_element_user(PROPERTY_QNAME[4], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "corrections" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewCorrections() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Removes the ith "corrections" element
     */
    @Override
    public void removeCorrections(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], i);
        }
    }

    /**
     * Gets the "identifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier getIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "identifier" element
     */
    @Override
    public boolean isSetIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]) != 0;
        }
    }

    /**
     * Sets the "identifier" element
     */
    @Override
    public void setIdentifier(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier identifier) {
        generatedSetterHelperImpl(identifier, PROPERTY_QNAME[5], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "identifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier addNewIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Unsets the "identifier" element
     */
    @Override
    public void unsetIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], 0);
        }
    }

    /**
     * Gets a List of "name" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName> getNameList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getNameArray,
                this::setNameArray,
                this::insertNewName,
                this::removeName,
                this::sizeOfNameArray
            );
        }
    }

    /**
     * Gets array of all "name" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName[] getNameArray() {
        return getXmlObjectArray(PROPERTY_QNAME[6], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName[0]);
    }

    /**
     * Gets ith "name" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName getNameArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "name" element
     */
    @Override
    public int sizeOfNameArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Sets array of all "name" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setNameArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName[] nameArray) {
        check_orphaned();
        arraySetterHelper(nameArray, PROPERTY_QNAME[6]);
    }

    /**
     * Sets ith "name" element
     */
    @Override
    public void setNameArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName name) {
        generatedSetterHelperImpl(name, PROPERTY_QNAME[6], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "name" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName insertNewName(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName)get_store().insert_element_user(PROPERTY_QNAME[6], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "name" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName addNewName() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Removes the ith "name" element
     */
    @Override
    public void removeName(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], i);
        }
    }

    /**
     * Gets the "purpose" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getPurpose() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "purpose" element
     */
    @Override
    public boolean isSetPurpose() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[7]) != 0;
        }
    }

    /**
     * Sets the "purpose" element
     */
    @Override
    public void setPurpose(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString purpose) {
        generatedSetterHelperImpl(purpose, PROPERTY_QNAME[7], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "purpose" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewPurpose() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * Unsets the "purpose" element
     */
    @Override
    public void unsetPurpose() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[7], 0);
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
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate)get_store().find_element_user(PROPERTY_QNAME[8], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[8]) != 0;
        }
    }

    /**
     * Sets the "releaseDate" element
     */
    @Override
    public void setReleaseDate(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate releaseDate) {
        generatedSetterHelperImpl(releaseDate, PROPERTY_QNAME[8], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "releaseDate" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate addNewReleaseDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate)get_store().add_element_user(PROPERTY_QNAME[8]);
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
            get_store().remove_element(PROPERTY_QNAME[8], 0);
        }
    }

    /**
     * Gets the "ClassificationIndex_isMaintainedBy_Agent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsMaintainedByAgent getClassificationIndexIsMaintainedByAgent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsMaintainedByAgent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsMaintainedByAgent)get_store().find_element_user(PROPERTY_QNAME[9], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "ClassificationIndex_isMaintainedBy_Agent" element
     */
    @Override
    public boolean isSetClassificationIndexIsMaintainedByAgent() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[9]) != 0;
        }
    }

    /**
     * Sets the "ClassificationIndex_isMaintainedBy_Agent" element
     */
    @Override
    public void setClassificationIndexIsMaintainedByAgent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsMaintainedByAgent classificationIndexIsMaintainedByAgent) {
        generatedSetterHelperImpl(classificationIndexIsMaintainedByAgent, PROPERTY_QNAME[9], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ClassificationIndex_isMaintainedBy_Agent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsMaintainedByAgent addNewClassificationIndexIsMaintainedByAgent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsMaintainedByAgent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsMaintainedByAgent)get_store().add_element_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * Unsets the "ClassificationIndex_isMaintainedBy_Agent" element
     */
    @Override
    public void unsetClassificationIndexIsMaintainedByAgent() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[9], 0);
        }
    }

    /**
     * Gets a List of "ClassificationIndex_hasContact_Agent" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasContactAgent> getClassificationIndexHasContactAgentList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getClassificationIndexHasContactAgentArray,
                this::setClassificationIndexHasContactAgentArray,
                this::insertNewClassificationIndexHasContactAgent,
                this::removeClassificationIndexHasContactAgent,
                this::sizeOfClassificationIndexHasContactAgentArray
            );
        }
    }

    /**
     * Gets array of all "ClassificationIndex_hasContact_Agent" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasContactAgent[] getClassificationIndexHasContactAgentArray() {
        return getXmlObjectArray(PROPERTY_QNAME[10], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasContactAgent[0]);
    }

    /**
     * Gets ith "ClassificationIndex_hasContact_Agent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasContactAgent getClassificationIndexHasContactAgentArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasContactAgent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasContactAgent)get_store().find_element_user(PROPERTY_QNAME[10], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ClassificationIndex_hasContact_Agent" element
     */
    @Override
    public int sizeOfClassificationIndexHasContactAgentArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[10]);
        }
    }

    /**
     * Sets array of all "ClassificationIndex_hasContact_Agent" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setClassificationIndexHasContactAgentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasContactAgent[] classificationIndexHasContactAgentArray) {
        check_orphaned();
        arraySetterHelper(classificationIndexHasContactAgentArray, PROPERTY_QNAME[10]);
    }

    /**
     * Sets ith "ClassificationIndex_hasContact_Agent" element
     */
    @Override
    public void setClassificationIndexHasContactAgentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasContactAgent classificationIndexHasContactAgent) {
        generatedSetterHelperImpl(classificationIndexHasContactAgent, PROPERTY_QNAME[10], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationIndex_hasContact_Agent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasContactAgent insertNewClassificationIndexHasContactAgent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasContactAgent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasContactAgent)get_store().insert_element_user(PROPERTY_QNAME[10], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationIndex_hasContact_Agent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasContactAgent addNewClassificationIndexHasContactAgent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasContactAgent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasContactAgent)get_store().add_element_user(PROPERTY_QNAME[10]);
            return target;
        }
    }

    /**
     * Removes the ith "ClassificationIndex_hasContact_Agent" element
     */
    @Override
    public void removeClassificationIndexHasContactAgent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[10], i);
        }
    }

    /**
     * Gets a List of "ClassificationIndex_isDefinedBy_Concept" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsDefinedByConcept> getClassificationIndexIsDefinedByConceptList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getClassificationIndexIsDefinedByConceptArray,
                this::setClassificationIndexIsDefinedByConceptArray,
                this::insertNewClassificationIndexIsDefinedByConcept,
                this::removeClassificationIndexIsDefinedByConcept,
                this::sizeOfClassificationIndexIsDefinedByConceptArray
            );
        }
    }

    /**
     * Gets array of all "ClassificationIndex_isDefinedBy_Concept" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsDefinedByConcept[] getClassificationIndexIsDefinedByConceptArray() {
        return getXmlObjectArray(PROPERTY_QNAME[11], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsDefinedByConcept[0]);
    }

    /**
     * Gets ith "ClassificationIndex_isDefinedBy_Concept" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsDefinedByConcept getClassificationIndexIsDefinedByConceptArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsDefinedByConcept target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsDefinedByConcept)get_store().find_element_user(PROPERTY_QNAME[11], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ClassificationIndex_isDefinedBy_Concept" element
     */
    @Override
    public int sizeOfClassificationIndexIsDefinedByConceptArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[11]);
        }
    }

    /**
     * Sets array of all "ClassificationIndex_isDefinedBy_Concept" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setClassificationIndexIsDefinedByConceptArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsDefinedByConcept[] classificationIndexIsDefinedByConceptArray) {
        check_orphaned();
        arraySetterHelper(classificationIndexIsDefinedByConceptArray, PROPERTY_QNAME[11]);
    }

    /**
     * Sets ith "ClassificationIndex_isDefinedBy_Concept" element
     */
    @Override
    public void setClassificationIndexIsDefinedByConceptArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsDefinedByConcept classificationIndexIsDefinedByConcept) {
        generatedSetterHelperImpl(classificationIndexIsDefinedByConcept, PROPERTY_QNAME[11], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationIndex_isDefinedBy_Concept" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsDefinedByConcept insertNewClassificationIndexIsDefinedByConcept(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsDefinedByConcept target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsDefinedByConcept)get_store().insert_element_user(PROPERTY_QNAME[11], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationIndex_isDefinedBy_Concept" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsDefinedByConcept addNewClassificationIndexIsDefinedByConcept() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsDefinedByConcept target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsDefinedByConcept)get_store().add_element_user(PROPERTY_QNAME[11]);
            return target;
        }
    }

    /**
     * Removes the ith "ClassificationIndex_isDefinedBy_Concept" element
     */
    @Override
    public void removeClassificationIndexIsDefinedByConcept(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[11], i);
        }
    }

    /**
     * Gets a List of "ClassificationIndex_has_ClassificationIndexEntryPosition" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntryPosition> getClassificationIndexHasClassificationIndexEntryPositionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getClassificationIndexHasClassificationIndexEntryPositionArray,
                this::setClassificationIndexHasClassificationIndexEntryPositionArray,
                this::insertNewClassificationIndexHasClassificationIndexEntryPosition,
                this::removeClassificationIndexHasClassificationIndexEntryPosition,
                this::sizeOfClassificationIndexHasClassificationIndexEntryPositionArray
            );
        }
    }

    /**
     * Gets array of all "ClassificationIndex_has_ClassificationIndexEntryPosition" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntryPosition[] getClassificationIndexHasClassificationIndexEntryPositionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[12], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntryPosition[0]);
    }

    /**
     * Gets ith "ClassificationIndex_has_ClassificationIndexEntryPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntryPosition getClassificationIndexHasClassificationIndexEntryPositionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntryPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntryPosition)get_store().find_element_user(PROPERTY_QNAME[12], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ClassificationIndex_has_ClassificationIndexEntryPosition" element
     */
    @Override
    public int sizeOfClassificationIndexHasClassificationIndexEntryPositionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[12]);
        }
    }

    /**
     * Sets array of all "ClassificationIndex_has_ClassificationIndexEntryPosition" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setClassificationIndexHasClassificationIndexEntryPositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntryPosition[] classificationIndexHasClassificationIndexEntryPositionArray) {
        check_orphaned();
        arraySetterHelper(classificationIndexHasClassificationIndexEntryPositionArray, PROPERTY_QNAME[12]);
    }

    /**
     * Sets ith "ClassificationIndex_has_ClassificationIndexEntryPosition" element
     */
    @Override
    public void setClassificationIndexHasClassificationIndexEntryPositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntryPosition classificationIndexHasClassificationIndexEntryPosition) {
        generatedSetterHelperImpl(classificationIndexHasClassificationIndexEntryPosition, PROPERTY_QNAME[12], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationIndex_has_ClassificationIndexEntryPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntryPosition insertNewClassificationIndexHasClassificationIndexEntryPosition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntryPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntryPosition)get_store().insert_element_user(PROPERTY_QNAME[12], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationIndex_has_ClassificationIndexEntryPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntryPosition addNewClassificationIndexHasClassificationIndexEntryPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntryPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntryPosition)get_store().add_element_user(PROPERTY_QNAME[12]);
            return target;
        }
    }

    /**
     * Removes the ith "ClassificationIndex_has_ClassificationIndexEntryPosition" element
     */
    @Override
    public void removeClassificationIndexHasClassificationIndexEntryPosition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[12], i);
        }
    }

    /**
     * Gets a List of "ClassificationIndex_has_ClassificationIndexEntry" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntry> getClassificationIndexHasClassificationIndexEntryList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getClassificationIndexHasClassificationIndexEntryArray,
                this::setClassificationIndexHasClassificationIndexEntryArray,
                this::insertNewClassificationIndexHasClassificationIndexEntry,
                this::removeClassificationIndexHasClassificationIndexEntry,
                this::sizeOfClassificationIndexHasClassificationIndexEntryArray
            );
        }
    }

    /**
     * Gets array of all "ClassificationIndex_has_ClassificationIndexEntry" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntry[] getClassificationIndexHasClassificationIndexEntryArray() {
        return getXmlObjectArray(PROPERTY_QNAME[13], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntry[0]);
    }

    /**
     * Gets ith "ClassificationIndex_has_ClassificationIndexEntry" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntry getClassificationIndexHasClassificationIndexEntryArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntry)get_store().find_element_user(PROPERTY_QNAME[13], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ClassificationIndex_has_ClassificationIndexEntry" element
     */
    @Override
    public int sizeOfClassificationIndexHasClassificationIndexEntryArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[13]);
        }
    }

    /**
     * Sets array of all "ClassificationIndex_has_ClassificationIndexEntry" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setClassificationIndexHasClassificationIndexEntryArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntry[] classificationIndexHasClassificationIndexEntryArray) {
        check_orphaned();
        arraySetterHelper(classificationIndexHasClassificationIndexEntryArray, PROPERTY_QNAME[13]);
    }

    /**
     * Sets ith "ClassificationIndex_has_ClassificationIndexEntry" element
     */
    @Override
    public void setClassificationIndexHasClassificationIndexEntryArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntry classificationIndexHasClassificationIndexEntry) {
        generatedSetterHelperImpl(classificationIndexHasClassificationIndexEntry, PROPERTY_QNAME[13], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClassificationIndex_has_ClassificationIndexEntry" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntry insertNewClassificationIndexHasClassificationIndexEntry(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntry)get_store().insert_element_user(PROPERTY_QNAME[13], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ClassificationIndex_has_ClassificationIndexEntry" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntry addNewClassificationIndexHasClassificationIndexEntry() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntry)get_store().add_element_user(PROPERTY_QNAME[13]);
            return target;
        }
    }

    /**
     * Removes the ith "ClassificationIndex_has_ClassificationIndexEntry" element
     */
    @Override
    public void removeClassificationIndexHasClassificationIndexEntry(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[13], i);
        }
    }
    /**
     * An XML ClassificationIndex_isMaintainedBy_Agent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ClassificationIndexIsMaintainedByAgentImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsMaintainedByAgent {
        private static final long serialVersionUID = 1L;

        public ClassificationIndexIsMaintainedByAgentImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex$ClassificationIndexIsMaintainedByAgent$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsMaintainedByAgent.ValidType {
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
     * An XML ClassificationIndex_hasContact_Agent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ClassificationIndexHasContactAgentImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasContactAgent {
        private static final long serialVersionUID = 1L;

        public ClassificationIndexHasContactAgentImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex$ClassificationIndexHasContactAgent$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasContactAgent.ValidType {
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
     * An XML ClassificationIndex_isDefinedBy_Concept(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ClassificationIndexIsDefinedByConceptImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsDefinedByConcept {
        private static final long serialVersionUID = 1L;

        public ClassificationIndexIsDefinedByConceptImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex$ClassificationIndexIsDefinedByConcept$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexIsDefinedByConcept.ValidType {
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
     * An XML ClassificationIndex_has_ClassificationIndexEntryPosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ClassificationIndexHasClassificationIndexEntryPositionImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntryPosition {
        private static final long serialVersionUID = 1L;

        public ClassificationIndexHasClassificationIndexEntryPositionImpl(org.apache.xmlbeans.SchemaType sType) {
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex$ClassificationIndexHasClassificationIndexEntryPosition$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntryPosition.ValidType {
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
     * An XML ClassificationIndex_has_ClassificationIndexEntry(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ClassificationIndexHasClassificationIndexEntryImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntry {
        private static final long serialVersionUID = 1L;

        public ClassificationIndexHasClassificationIndexEntryImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex$ClassificationIndexHasClassificationIndexEntry$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndex.ClassificationIndexHasClassificationIndexEntry.ValidType {
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
