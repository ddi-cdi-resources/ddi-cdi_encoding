/*
 * XML Type:  DataStore
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML DataStore(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class DataStoreImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore {
    private static final long serialVersionUID = 1L;

    public DataStoreImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "aboutMissing"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "allowsDuplicates"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "catalogDetails"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "characterSet"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "dataStoreType"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "name"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "purpose"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "recordCount"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DataStore_isDefinedBy_Concept"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DataStore_has_LogicalRecordPosition"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DataStore_has_LogicalRecord"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DataStore_has_RecordRelation"),
    };


    /**
     * Gets the "aboutMissing" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getAboutMissing() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "aboutMissing" element
     */
    @Override
    public boolean isSetAboutMissing() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "aboutMissing" element
     */
    @Override
    public void setAboutMissing(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString aboutMissing) {
        generatedSetterHelperImpl(aboutMissing, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "aboutMissing" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewAboutMissing() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "aboutMissing" element
     */
    @Override
    public void unsetAboutMissing() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "allowsDuplicates" element
     */
    @Override
    public boolean getAllowsDuplicates() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[1], 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(allowsDuplicates);
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
     * Gets the "characterSet" element
     */
    @Override
    public java.lang.String getCharacterSet() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "characterSet" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetCharacterSet() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return target;
        }
    }

    /**
     * True if has "characterSet" element
     */
    @Override
    public boolean isSetCharacterSet() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "characterSet" element
     */
    @Override
    public void setCharacterSet(java.lang.String characterSet) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[3]);
            }
            target.setStringValue(characterSet);
        }
    }

    /**
     * Sets (as xml) the "characterSet" element
     */
    @Override
    public void xsetCharacterSet(org.apache.xmlbeans.XmlString characterSet) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[3]);
            }
            target.set(characterSet);
        }
    }

    /**
     * Unsets the "characterSet" element
     */
    @Override
    public void unsetCharacterSet() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "dataStoreType" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getDataStoreType() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "dataStoreType" element
     */
    @Override
    public boolean isSetDataStoreType() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "dataStoreType" element
     */
    @Override
    public void setDataStoreType(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry dataStoreType) {
        generatedSetterHelperImpl(dataStoreType, PROPERTY_QNAME[4], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "dataStoreType" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewDataStoreType() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Unsets the "dataStoreType" element
     */
    @Override
    public void unsetDataStoreType() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
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
     * Gets the "recordCount" element
     */
    @Override
    public java.math.BigInteger getRecordCount() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[8], 0);
            return (target == null) ? null : target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) the "recordCount" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger xgetRecordCount() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[8], 0);
            return target;
        }
    }

    /**
     * True if has "recordCount" element
     */
    @Override
    public boolean isSetRecordCount() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[8]) != 0;
        }
    }

    /**
     * Sets the "recordCount" element
     */
    @Override
    public void setRecordCount(java.math.BigInteger recordCount) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[8], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[8]);
            }
            target.setBigIntegerValue(recordCount);
        }
    }

    /**
     * Sets (as xml) the "recordCount" element
     */
    @Override
    public void xsetRecordCount(org.apache.xmlbeans.XmlInteger recordCount) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[8], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTY_QNAME[8]);
            }
            target.set(recordCount);
        }
    }

    /**
     * Unsets the "recordCount" element
     */
    @Override
    public void unsetRecordCount() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[8], 0);
        }
    }

    /**
     * Gets a List of "DataStore_isDefinedBy_Concept" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreIsDefinedByConcept> getDataStoreIsDefinedByConceptList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDataStoreIsDefinedByConceptArray,
                this::setDataStoreIsDefinedByConceptArray,
                this::insertNewDataStoreIsDefinedByConcept,
                this::removeDataStoreIsDefinedByConcept,
                this::sizeOfDataStoreIsDefinedByConceptArray
            );
        }
    }

    /**
     * Gets array of all "DataStore_isDefinedBy_Concept" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreIsDefinedByConcept[] getDataStoreIsDefinedByConceptArray() {
        return getXmlObjectArray(PROPERTY_QNAME[9], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreIsDefinedByConcept[0]);
    }

    /**
     * Gets ith "DataStore_isDefinedBy_Concept" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreIsDefinedByConcept getDataStoreIsDefinedByConceptArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreIsDefinedByConcept target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreIsDefinedByConcept)get_store().find_element_user(PROPERTY_QNAME[9], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DataStore_isDefinedBy_Concept" element
     */
    @Override
    public int sizeOfDataStoreIsDefinedByConceptArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[9]);
        }
    }

    /**
     * Sets array of all "DataStore_isDefinedBy_Concept" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDataStoreIsDefinedByConceptArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreIsDefinedByConcept[] dataStoreIsDefinedByConceptArray) {
        check_orphaned();
        arraySetterHelper(dataStoreIsDefinedByConceptArray, PROPERTY_QNAME[9]);
    }

    /**
     * Sets ith "DataStore_isDefinedBy_Concept" element
     */
    @Override
    public void setDataStoreIsDefinedByConceptArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreIsDefinedByConcept dataStoreIsDefinedByConcept) {
        generatedSetterHelperImpl(dataStoreIsDefinedByConcept, PROPERTY_QNAME[9], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataStore_isDefinedBy_Concept" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreIsDefinedByConcept insertNewDataStoreIsDefinedByConcept(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreIsDefinedByConcept target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreIsDefinedByConcept)get_store().insert_element_user(PROPERTY_QNAME[9], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DataStore_isDefinedBy_Concept" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreIsDefinedByConcept addNewDataStoreIsDefinedByConcept() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreIsDefinedByConcept target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreIsDefinedByConcept)get_store().add_element_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * Removes the ith "DataStore_isDefinedBy_Concept" element
     */
    @Override
    public void removeDataStoreIsDefinedByConcept(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[9], i);
        }
    }

    /**
     * Gets a List of "DataStore_has_LogicalRecordPosition" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecordPosition> getDataStoreHasLogicalRecordPositionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDataStoreHasLogicalRecordPositionArray,
                this::setDataStoreHasLogicalRecordPositionArray,
                this::insertNewDataStoreHasLogicalRecordPosition,
                this::removeDataStoreHasLogicalRecordPosition,
                this::sizeOfDataStoreHasLogicalRecordPositionArray
            );
        }
    }

    /**
     * Gets array of all "DataStore_has_LogicalRecordPosition" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecordPosition[] getDataStoreHasLogicalRecordPositionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[10], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecordPosition[0]);
    }

    /**
     * Gets ith "DataStore_has_LogicalRecordPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecordPosition getDataStoreHasLogicalRecordPositionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecordPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecordPosition)get_store().find_element_user(PROPERTY_QNAME[10], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DataStore_has_LogicalRecordPosition" element
     */
    @Override
    public int sizeOfDataStoreHasLogicalRecordPositionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[10]);
        }
    }

    /**
     * Sets array of all "DataStore_has_LogicalRecordPosition" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDataStoreHasLogicalRecordPositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecordPosition[] dataStoreHasLogicalRecordPositionArray) {
        check_orphaned();
        arraySetterHelper(dataStoreHasLogicalRecordPositionArray, PROPERTY_QNAME[10]);
    }

    /**
     * Sets ith "DataStore_has_LogicalRecordPosition" element
     */
    @Override
    public void setDataStoreHasLogicalRecordPositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecordPosition dataStoreHasLogicalRecordPosition) {
        generatedSetterHelperImpl(dataStoreHasLogicalRecordPosition, PROPERTY_QNAME[10], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataStore_has_LogicalRecordPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecordPosition insertNewDataStoreHasLogicalRecordPosition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecordPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecordPosition)get_store().insert_element_user(PROPERTY_QNAME[10], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DataStore_has_LogicalRecordPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecordPosition addNewDataStoreHasLogicalRecordPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecordPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecordPosition)get_store().add_element_user(PROPERTY_QNAME[10]);
            return target;
        }
    }

    /**
     * Removes the ith "DataStore_has_LogicalRecordPosition" element
     */
    @Override
    public void removeDataStoreHasLogicalRecordPosition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[10], i);
        }
    }

    /**
     * Gets a List of "DataStore_has_LogicalRecord" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecord> getDataStoreHasLogicalRecordList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDataStoreHasLogicalRecordArray,
                this::setDataStoreHasLogicalRecordArray,
                this::insertNewDataStoreHasLogicalRecord,
                this::removeDataStoreHasLogicalRecord,
                this::sizeOfDataStoreHasLogicalRecordArray
            );
        }
    }

    /**
     * Gets array of all "DataStore_has_LogicalRecord" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecord[] getDataStoreHasLogicalRecordArray() {
        return getXmlObjectArray(PROPERTY_QNAME[11], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecord[0]);
    }

    /**
     * Gets ith "DataStore_has_LogicalRecord" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecord getDataStoreHasLogicalRecordArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecord target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecord)get_store().find_element_user(PROPERTY_QNAME[11], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DataStore_has_LogicalRecord" element
     */
    @Override
    public int sizeOfDataStoreHasLogicalRecordArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[11]);
        }
    }

    /**
     * Sets array of all "DataStore_has_LogicalRecord" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDataStoreHasLogicalRecordArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecord[] dataStoreHasLogicalRecordArray) {
        check_orphaned();
        arraySetterHelper(dataStoreHasLogicalRecordArray, PROPERTY_QNAME[11]);
    }

    /**
     * Sets ith "DataStore_has_LogicalRecord" element
     */
    @Override
    public void setDataStoreHasLogicalRecordArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecord dataStoreHasLogicalRecord) {
        generatedSetterHelperImpl(dataStoreHasLogicalRecord, PROPERTY_QNAME[11], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataStore_has_LogicalRecord" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecord insertNewDataStoreHasLogicalRecord(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecord target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecord)get_store().insert_element_user(PROPERTY_QNAME[11], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DataStore_has_LogicalRecord" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecord addNewDataStoreHasLogicalRecord() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecord target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecord)get_store().add_element_user(PROPERTY_QNAME[11]);
            return target;
        }
    }

    /**
     * Removes the ith "DataStore_has_LogicalRecord" element
     */
    @Override
    public void removeDataStoreHasLogicalRecord(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[11], i);
        }
    }

    /**
     * Gets the "DataStore_has_RecordRelation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasRecordRelation getDataStoreHasRecordRelation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasRecordRelation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasRecordRelation)get_store().find_element_user(PROPERTY_QNAME[12], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "DataStore_has_RecordRelation" element
     */
    @Override
    public boolean isSetDataStoreHasRecordRelation() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[12]) != 0;
        }
    }

    /**
     * Sets the "DataStore_has_RecordRelation" element
     */
    @Override
    public void setDataStoreHasRecordRelation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasRecordRelation dataStoreHasRecordRelation) {
        generatedSetterHelperImpl(dataStoreHasRecordRelation, PROPERTY_QNAME[12], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "DataStore_has_RecordRelation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasRecordRelation addNewDataStoreHasRecordRelation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasRecordRelation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasRecordRelation)get_store().add_element_user(PROPERTY_QNAME[12]);
            return target;
        }
    }

    /**
     * Unsets the "DataStore_has_RecordRelation" element
     */
    @Override
    public void unsetDataStoreHasRecordRelation() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[12], 0);
        }
    }
    /**
     * An XML DataStore_isDefinedBy_Concept(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class DataStoreIsDefinedByConceptImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreIsDefinedByConcept {
        private static final long serialVersionUID = 1L;

        public DataStoreIsDefinedByConceptImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore$DataStoreIsDefinedByConcept$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreIsDefinedByConcept.ValidType {
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
     * An XML DataStore_has_LogicalRecordPosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class DataStoreHasLogicalRecordPositionImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecordPosition {
        private static final long serialVersionUID = 1L;

        public DataStoreHasLogicalRecordPositionImpl(org.apache.xmlbeans.SchemaType sType) {
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore$DataStoreHasLogicalRecordPosition$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecordPosition.ValidType {
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
     * An XML DataStore_has_LogicalRecord(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class DataStoreHasLogicalRecordImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecord {
        private static final long serialVersionUID = 1L;

        public DataStoreHasLogicalRecordImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore$DataStoreHasLogicalRecord$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasLogicalRecord.ValidType {
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
     * An XML DataStore_has_RecordRelation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class DataStoreHasRecordRelationImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasRecordRelation {
        private static final long serialVersionUID = 1L;

        public DataStoreHasRecordRelationImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore$DataStoreHasRecordRelation$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStore.DataStoreHasRecordRelation.ValidType {
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
