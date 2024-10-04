/*
 * XML Type:  CatalogDetails
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CatalogDetails(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class CatalogDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails {
    private static final long serialVersionUID = 1L;

    public CatalogDetailsImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "access"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "alternativeTitle"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "contributor"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "creator"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "date"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "informationSource"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "languageOfObject"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "provenance"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "publisher"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "relatedResource"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "subTitle"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "summary"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "title"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "typeOfResource"),
    };


    /**
     * Gets a List of "access" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation> getAccessList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getAccessArray,
                this::setAccessArray,
                this::insertNewAccess,
                this::removeAccess,
                this::sizeOfAccessArray
            );
        }
    }

    /**
     * Gets array of all "access" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation[] getAccessArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation[0]);
    }

    /**
     * Gets ith "access" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation getAccessArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "access" element
     */
    @Override
    public int sizeOfAccessArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "access" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setAccessArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation[] accessArray) {
        check_orphaned();
        arraySetterHelper(accessArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "access" element
     */
    @Override
    public void setAccessArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation access) {
        generatedSetterHelperImpl(access, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "access" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation insertNewAccess(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "access" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation addNewAccess() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "access" element
     */
    @Override
    public void removeAccess(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "alternativeTitle" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString> getAlternativeTitleList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getAlternativeTitleArray,
                this::setAlternativeTitleArray,
                this::insertNewAlternativeTitle,
                this::removeAlternativeTitle,
                this::sizeOfAlternativeTitleArray
            );
        }
    }

    /**
     * Gets array of all "alternativeTitle" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] getAlternativeTitleArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[0]);
    }

    /**
     * Gets ith "alternativeTitle" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getAlternativeTitleArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "alternativeTitle" element
     */
    @Override
    public int sizeOfAlternativeTitleArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "alternativeTitle" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setAlternativeTitleArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] alternativeTitleArray) {
        check_orphaned();
        arraySetterHelper(alternativeTitleArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "alternativeTitle" element
     */
    @Override
    public void setAlternativeTitleArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString alternativeTitle) {
        generatedSetterHelperImpl(alternativeTitle, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "alternativeTitle" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString insertNewAlternativeTitle(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "alternativeTitle" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewAlternativeTitle() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "alternativeTitle" element
     */
    @Override
    public void removeAlternativeTitle(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets a List of "contributor" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole> getContributorList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getContributorArray,
                this::setContributorArray,
                this::insertNewContributor,
                this::removeContributor,
                this::sizeOfContributorArray
            );
        }
    }

    /**
     * Gets array of all "contributor" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole[] getContributorArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole[0]);
    }

    /**
     * Gets ith "contributor" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole getContributorArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "contributor" element
     */
    @Override
    public int sizeOfContributorArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "contributor" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setContributorArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole[] contributorArray) {
        check_orphaned();
        arraySetterHelper(contributorArray, PROPERTY_QNAME[2]);
    }

    /**
     * Sets ith "contributor" element
     */
    @Override
    public void setContributorArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole contributor) {
        generatedSetterHelperImpl(contributor, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "contributor" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole insertNewContributor(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "contributor" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole addNewContributor() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "contributor" element
     */
    @Override
    public void removeContributor(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "creator" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole> getCreatorList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCreatorArray,
                this::setCreatorArray,
                this::insertNewCreator,
                this::removeCreator,
                this::sizeOfCreatorArray
            );
        }
    }

    /**
     * Gets array of all "creator" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole[] getCreatorArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole[0]);
    }

    /**
     * Gets ith "creator" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole getCreatorArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "creator" element
     */
    @Override
    public int sizeOfCreatorArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets array of all "creator" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCreatorArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole[] creatorArray) {
        check_orphaned();
        arraySetterHelper(creatorArray, PROPERTY_QNAME[3]);
    }

    /**
     * Sets ith "creator" element
     */
    @Override
    public void setCreatorArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole creator) {
        generatedSetterHelperImpl(creator, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "creator" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole insertNewCreator(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "creator" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole addNewCreator() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "creator" element
     */
    @Override
    public void removeCreator(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }

    /**
     * Gets a List of "date" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate> getDateList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDateArray,
                this::setDateArray,
                this::insertNewDate,
                this::removeDate,
                this::sizeOfDateArray
            );
        }
    }

    /**
     * Gets array of all "date" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate[] getDateArray() {
        return getXmlObjectArray(PROPERTY_QNAME[4], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate[0]);
    }

    /**
     * Gets ith "date" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate getDateArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "date" element
     */
    @Override
    public int sizeOfDateArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets array of all "date" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDateArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate[] dateArray) {
        check_orphaned();
        arraySetterHelper(dateArray, PROPERTY_QNAME[4]);
    }

    /**
     * Sets ith "date" element
     */
    @Override
    public void setDateArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate date) {
        generatedSetterHelperImpl(date, PROPERTY_QNAME[4], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "date" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate insertNewDate(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate)get_store().insert_element_user(PROPERTY_QNAME[4], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "date" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate addNewDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Removes the ith "date" element
     */
    @Override
    public void removeDate(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], i);
        }
    }

    /**
     * Gets the "identifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalIdentifier getIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalIdentifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalIdentifier)get_store().find_element_user(PROPERTY_QNAME[5], 0);
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
    public void setIdentifier(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalIdentifier identifier) {
        generatedSetterHelperImpl(identifier, PROPERTY_QNAME[5], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "identifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalIdentifier addNewIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalIdentifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalIdentifier)get_store().add_element_user(PROPERTY_QNAME[5]);
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
     * Gets a List of "informationSource" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString> getInformationSourceList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getInformationSourceArray,
                this::setInformationSourceArray,
                this::insertNewInformationSource,
                this::removeInformationSource,
                this::sizeOfInformationSourceArray
            );
        }
    }

    /**
     * Gets array of all "informationSource" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] getInformationSourceArray() {
        return getXmlObjectArray(PROPERTY_QNAME[6], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[0]);
    }

    /**
     * Gets ith "informationSource" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getInformationSourceArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "informationSource" element
     */
    @Override
    public int sizeOfInformationSourceArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Sets array of all "informationSource" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setInformationSourceArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] informationSourceArray) {
        check_orphaned();
        arraySetterHelper(informationSourceArray, PROPERTY_QNAME[6]);
    }

    /**
     * Sets ith "informationSource" element
     */
    @Override
    public void setInformationSourceArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString informationSource) {
        generatedSetterHelperImpl(informationSource, PROPERTY_QNAME[6], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "informationSource" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString insertNewInformationSource(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().insert_element_user(PROPERTY_QNAME[6], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "informationSource" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewInformationSource() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Removes the ith "informationSource" element
     */
    @Override
    public void removeInformationSource(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], i);
        }
    }

    /**
     * Gets a List of "languageOfObject" elements
     */
    @Override
    public java.util.List<java.lang.String> getLanguageOfObjectList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getLanguageOfObjectArray,
                this::setLanguageOfObjectArray,
                this::insertLanguageOfObject,
                this::removeLanguageOfObject,
                this::sizeOfLanguageOfObjectArray
            );
        }
    }

    /**
     * Gets array of all "languageOfObject" elements
     */
    @Override
    public java.lang.String[] getLanguageOfObjectArray() {
        return getObjectArray(PROPERTY_QNAME[7], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "languageOfObject" element
     */
    @Override
    public java.lang.String getLanguageOfObjectArray(int i) {
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
     * Gets (as xml) a List of "languageOfObject" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlLanguage> xgetLanguageOfObjectList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetLanguageOfObjectArray,
                this::xsetLanguageOfObjectArray,
                this::insertNewLanguageOfObject,
                this::removeLanguageOfObject,
                this::sizeOfLanguageOfObjectArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "languageOfObject" elements
     */
    @Override
    public org.apache.xmlbeans.XmlLanguage[] xgetLanguageOfObjectArray() {
        return xgetArray(PROPERTY_QNAME[7], org.apache.xmlbeans.XmlLanguage[]::new);
    }

    /**
     * Gets (as xml) ith "languageOfObject" element
     */
    @Override
    public org.apache.xmlbeans.XmlLanguage xgetLanguageOfObjectArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_element_user(PROPERTY_QNAME[7], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "languageOfObject" element
     */
    @Override
    public int sizeOfLanguageOfObjectArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Sets array of all "languageOfObject" element
     */
    @Override
    public void setLanguageOfObjectArray(java.lang.String[] languageOfObjectArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(languageOfObjectArray, PROPERTY_QNAME[7]);
        }
    }

    /**
     * Sets ith "languageOfObject" element
     */
    @Override
    public void setLanguageOfObjectArray(int i, java.lang.String languageOfObject) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[7], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(languageOfObject);
        }
    }

    /**
     * Sets (as xml) array of all "languageOfObject" element
     */
    @Override
    public void xsetLanguageOfObjectArray(org.apache.xmlbeans.XmlLanguage[]languageOfObjectArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(languageOfObjectArray, PROPERTY_QNAME[7]);
        }
    }

    /**
     * Sets (as xml) ith "languageOfObject" element
     */
    @Override
    public void xsetLanguageOfObjectArray(int i, org.apache.xmlbeans.XmlLanguage languageOfObject) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_element_user(PROPERTY_QNAME[7], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(languageOfObject);
        }
    }

    /**
     * Inserts the value as the ith "languageOfObject" element
     */
    @Override
    public void insertLanguageOfObject(int i, java.lang.String languageOfObject) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[7], i);
            target.setStringValue(languageOfObject);
        }
    }

    /**
     * Appends the value as the last "languageOfObject" element
     */
    @Override
    public void addLanguageOfObject(java.lang.String languageOfObject) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[7]);
            target.setStringValue(languageOfObject);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "languageOfObject" element
     */
    @Override
    public org.apache.xmlbeans.XmlLanguage insertNewLanguageOfObject(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().insert_element_user(PROPERTY_QNAME[7], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "languageOfObject" element
     */
    @Override
    public org.apache.xmlbeans.XmlLanguage addNewLanguageOfObject() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().add_element_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * Removes the ith "languageOfObject" element
     */
    @Override
    public void removeLanguageOfObject(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[7], i);
        }
    }

    /**
     * Gets the "provenance" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProvenanceInformation getProvenance() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProvenanceInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProvenanceInformation)get_store().find_element_user(PROPERTY_QNAME[8], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "provenance" element
     */
    @Override
    public boolean isSetProvenance() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[8]) != 0;
        }
    }

    /**
     * Sets the "provenance" element
     */
    @Override
    public void setProvenance(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProvenanceInformation provenance) {
        generatedSetterHelperImpl(provenance, PROPERTY_QNAME[8], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "provenance" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProvenanceInformation addNewProvenance() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProvenanceInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ProvenanceInformation)get_store().add_element_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * Unsets the "provenance" element
     */
    @Override
    public void unsetProvenance() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[8], 0);
        }
    }

    /**
     * Gets a List of "publisher" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole> getPublisherList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getPublisherArray,
                this::setPublisherArray,
                this::insertNewPublisher,
                this::removePublisher,
                this::sizeOfPublisherArray
            );
        }
    }

    /**
     * Gets array of all "publisher" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole[] getPublisherArray() {
        return getXmlObjectArray(PROPERTY_QNAME[9], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole[0]);
    }

    /**
     * Gets ith "publisher" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole getPublisherArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole)get_store().find_element_user(PROPERTY_QNAME[9], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "publisher" element
     */
    @Override
    public int sizeOfPublisherArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[9]);
        }
    }

    /**
     * Sets array of all "publisher" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setPublisherArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole[] publisherArray) {
        check_orphaned();
        arraySetterHelper(publisherArray, PROPERTY_QNAME[9]);
    }

    /**
     * Sets ith "publisher" element
     */
    @Override
    public void setPublisherArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole publisher) {
        generatedSetterHelperImpl(publisher, PROPERTY_QNAME[9], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "publisher" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole insertNewPublisher(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole)get_store().insert_element_user(PROPERTY_QNAME[9], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "publisher" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole addNewPublisher() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole)get_store().add_element_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * Removes the ith "publisher" element
     */
    @Override
    public void removePublisher(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[9], i);
        }
    }

    /**
     * Gets a List of "relatedResource" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails.RelatedResource> getRelatedResourceList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getRelatedResourceArray,
                this::setRelatedResourceArray,
                this::insertNewRelatedResource,
                this::removeRelatedResource,
                this::sizeOfRelatedResourceArray
            );
        }
    }

    /**
     * Gets array of all "relatedResource" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails.RelatedResource[] getRelatedResourceArray() {
        return getXmlObjectArray(PROPERTY_QNAME[10], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails.RelatedResource[0]);
    }

    /**
     * Gets ith "relatedResource" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails.RelatedResource getRelatedResourceArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails.RelatedResource target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails.RelatedResource)get_store().find_element_user(PROPERTY_QNAME[10], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "relatedResource" element
     */
    @Override
    public int sizeOfRelatedResourceArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[10]);
        }
    }

    /**
     * Sets array of all "relatedResource" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setRelatedResourceArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails.RelatedResource[] relatedResourceArray) {
        check_orphaned();
        arraySetterHelper(relatedResourceArray, PROPERTY_QNAME[10]);
    }

    /**
     * Sets ith "relatedResource" element
     */
    @Override
    public void setRelatedResourceArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails.RelatedResource relatedResource) {
        generatedSetterHelperImpl(relatedResource, PROPERTY_QNAME[10], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "relatedResource" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails.RelatedResource insertNewRelatedResource(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails.RelatedResource target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails.RelatedResource)get_store().insert_element_user(PROPERTY_QNAME[10], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "relatedResource" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails.RelatedResource addNewRelatedResource() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails.RelatedResource target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails.RelatedResource)get_store().add_element_user(PROPERTY_QNAME[10]);
            return target;
        }
    }

    /**
     * Removes the ith "relatedResource" element
     */
    @Override
    public void removeRelatedResource(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[10], i);
        }
    }

    /**
     * Gets a List of "subTitle" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString> getSubTitleList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getSubTitleArray,
                this::setSubTitleArray,
                this::insertNewSubTitle,
                this::removeSubTitle,
                this::sizeOfSubTitleArray
            );
        }
    }

    /**
     * Gets array of all "subTitle" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] getSubTitleArray() {
        return getXmlObjectArray(PROPERTY_QNAME[11], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[0]);
    }

    /**
     * Gets ith "subTitle" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getSubTitleArray(int i) {
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
     * Returns number of "subTitle" element
     */
    @Override
    public int sizeOfSubTitleArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[11]);
        }
    }

    /**
     * Sets array of all "subTitle" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setSubTitleArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString[] subTitleArray) {
        check_orphaned();
        arraySetterHelper(subTitleArray, PROPERTY_QNAME[11]);
    }

    /**
     * Sets ith "subTitle" element
     */
    @Override
    public void setSubTitleArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString subTitle) {
        generatedSetterHelperImpl(subTitle, PROPERTY_QNAME[11], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "subTitle" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString insertNewSubTitle(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().insert_element_user(PROPERTY_QNAME[11], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "subTitle" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewSubTitle() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[11]);
            return target;
        }
    }

    /**
     * Removes the ith "subTitle" element
     */
    @Override
    public void removeSubTitle(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[11], i);
        }
    }

    /**
     * Gets the "summary" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getSummary() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().find_element_user(PROPERTY_QNAME[12], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "summary" element
     */
    @Override
    public boolean isSetSummary() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[12]) != 0;
        }
    }

    /**
     * Sets the "summary" element
     */
    @Override
    public void setSummary(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString summary) {
        generatedSetterHelperImpl(summary, PROPERTY_QNAME[12], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "summary" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewSummary() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[12]);
            return target;
        }
    }

    /**
     * Unsets the "summary" element
     */
    @Override
    public void unsetSummary() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[12], 0);
        }
    }

    /**
     * Gets the "title" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getTitle() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().find_element_user(PROPERTY_QNAME[13], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "title" element
     */
    @Override
    public boolean isSetTitle() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[13]) != 0;
        }
    }

    /**
     * Sets the "title" element
     */
    @Override
    public void setTitle(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString title) {
        generatedSetterHelperImpl(title, PROPERTY_QNAME[13], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "title" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewTitle() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[13]);
            return target;
        }
    }

    /**
     * Unsets the "title" element
     */
    @Override
    public void unsetTitle() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[13], 0);
        }
    }

    /**
     * Gets a List of "typeOfResource" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry> getTypeOfResourceList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getTypeOfResourceArray,
                this::setTypeOfResourceArray,
                this::insertNewTypeOfResource,
                this::removeTypeOfResource,
                this::sizeOfTypeOfResourceArray
            );
        }
    }

    /**
     * Gets array of all "typeOfResource" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry[] getTypeOfResourceArray() {
        return getXmlObjectArray(PROPERTY_QNAME[14], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry[0]);
    }

    /**
     * Gets ith "typeOfResource" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getTypeOfResourceArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[14], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "typeOfResource" element
     */
    @Override
    public int sizeOfTypeOfResourceArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[14]);
        }
    }

    /**
     * Sets array of all "typeOfResource" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setTypeOfResourceArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry[] typeOfResourceArray) {
        check_orphaned();
        arraySetterHelper(typeOfResourceArray, PROPERTY_QNAME[14]);
    }

    /**
     * Sets ith "typeOfResource" element
     */
    @Override
    public void setTypeOfResourceArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry typeOfResource) {
        generatedSetterHelperImpl(typeOfResource, PROPERTY_QNAME[14], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "typeOfResource" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry insertNewTypeOfResource(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().insert_element_user(PROPERTY_QNAME[14], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "typeOfResource" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewTypeOfResource() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[14]);
            return target;
        }
    }

    /**
     * Removes the ith "typeOfResource" element
     */
    @Override
    public void removeTypeOfResource(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[14], i);
        }
    }
    /**
     * An XML relatedResource(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class RelatedResourceImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails.RelatedResource {
        private static final long serialVersionUID = 1L;

        public RelatedResourceImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("", "isAssociationReference"),
        };


        /**
         * Gets the "isAssociationReference" attribute
         */
        @Override
        public boolean getIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[0]);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[0]);
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
                return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
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
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[0]);
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
                get_store().remove_attribute(PROPERTY_QNAME[0]);
            }
        }
    }
}
