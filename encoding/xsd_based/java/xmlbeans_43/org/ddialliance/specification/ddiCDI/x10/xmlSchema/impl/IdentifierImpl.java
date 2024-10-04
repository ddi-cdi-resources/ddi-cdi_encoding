/*
 * XML Type:  Identifier
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML Identifier(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class IdentifierImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier {
    private static final long serialVersionUID = 1L;

    public IdentifierImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ddiIdentifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "isDdiIdentifierPersistent"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "isDdiIdentifierUniversallyUnique"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "nonDdiIdentifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "uri"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "versionDate"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "versionRationale"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "versionResponsibility"),
    };


    /**
     * Gets the "ddiIdentifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier getDdiIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "ddiIdentifier" element
     */
    @Override
    public boolean isSetDdiIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "ddiIdentifier" element
     */
    @Override
    public void setDdiIdentifier(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier ddiIdentifier) {
        generatedSetterHelperImpl(ddiIdentifier, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ddiIdentifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier addNewDdiIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "ddiIdentifier" element
     */
    @Override
    public void unsetDdiIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "isDdiIdentifierPersistent" element
     */
    @Override
    public boolean getIsDdiIdentifierPersistent() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "isDdiIdentifierPersistent" element
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetIsDdiIdentifierPersistent() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * True if has "isDdiIdentifierPersistent" element
     */
    @Override
    public boolean isSetIsDdiIdentifierPersistent() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "isDdiIdentifierPersistent" element
     */
    @Override
    public void setIsDdiIdentifierPersistent(boolean isDdiIdentifierPersistent) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setBooleanValue(isDdiIdentifierPersistent);
        }
    }

    /**
     * Sets (as xml) the "isDdiIdentifierPersistent" element
     */
    @Override
    public void xsetIsDdiIdentifierPersistent(org.apache.xmlbeans.XmlBoolean isDdiIdentifierPersistent) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(isDdiIdentifierPersistent);
        }
    }

    /**
     * Unsets the "isDdiIdentifierPersistent" element
     */
    @Override
    public void unsetIsDdiIdentifierPersistent() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "isDdiIdentifierUniversallyUnique" element
     */
    @Override
    public boolean getIsDdiIdentifierUniversallyUnique() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "isDdiIdentifierUniversallyUnique" element
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetIsDdiIdentifierUniversallyUnique() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return target;
        }
    }

    /**
     * True if has "isDdiIdentifierUniversallyUnique" element
     */
    @Override
    public boolean isSetIsDdiIdentifierUniversallyUnique() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "isDdiIdentifierUniversallyUnique" element
     */
    @Override
    public void setIsDdiIdentifierUniversallyUnique(boolean isDdiIdentifierUniversallyUnique) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.setBooleanValue(isDdiIdentifierUniversallyUnique);
        }
    }

    /**
     * Sets (as xml) the "isDdiIdentifierUniversallyUnique" element
     */
    @Override
    public void xsetIsDdiIdentifierUniversallyUnique(org.apache.xmlbeans.XmlBoolean isDdiIdentifierUniversallyUnique) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.set(isDdiIdentifierUniversallyUnique);
        }
    }

    /**
     * Unsets the "isDdiIdentifierUniversallyUnique" element
     */
    @Override
    public void unsetIsDdiIdentifierUniversallyUnique() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets a List of "nonDdiIdentifier" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier> getNonDdiIdentifierList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getNonDdiIdentifierArray,
                this::setNonDdiIdentifierArray,
                this::insertNewNonDdiIdentifier,
                this::removeNonDdiIdentifier,
                this::sizeOfNonDdiIdentifierArray
            );
        }
    }

    /**
     * Gets array of all "nonDdiIdentifier" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier[] getNonDdiIdentifierArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier[0]);
    }

    /**
     * Gets ith "nonDdiIdentifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier getNonDdiIdentifierArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "nonDdiIdentifier" element
     */
    @Override
    public int sizeOfNonDdiIdentifierArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets array of all "nonDdiIdentifier" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setNonDdiIdentifierArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier[] nonDdiIdentifierArray) {
        check_orphaned();
        arraySetterHelper(nonDdiIdentifierArray, PROPERTY_QNAME[3]);
    }

    /**
     * Sets ith "nonDdiIdentifier" element
     */
    @Override
    public void setNonDdiIdentifierArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier nonDdiIdentifier) {
        generatedSetterHelperImpl(nonDdiIdentifier, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "nonDdiIdentifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier insertNewNonDdiIdentifier(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "nonDdiIdentifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier addNewNonDdiIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "nonDdiIdentifier" element
     */
    @Override
    public void removeNonDdiIdentifier(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], 0);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROPERTY_QNAME[4], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[4]);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(PROPERTY_QNAME[4]);
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
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }

    /**
     * Gets the "versionDate" element
     */
    @Override
    public java.util.Calendar getVersionDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return (target == null) ? null : target.getCalendarValue();
        }
    }

    /**
     * Gets (as xml) the "versionDate" element
     */
    @Override
    public org.apache.xmlbeans.XmlDate xgetVersionDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return target;
        }
    }

    /**
     * True if has "versionDate" element
     */
    @Override
    public boolean isSetVersionDate() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]) != 0;
        }
    }

    /**
     * Sets the "versionDate" element
     */
    @Override
    public void setVersionDate(java.util.Calendar versionDate) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[5]);
            }
            target.setCalendarValue(versionDate);
        }
    }

    /**
     * Sets (as xml) the "versionDate" element
     */
    @Override
    public void xsetVersionDate(org.apache.xmlbeans.XmlDate versionDate) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(PROPERTY_QNAME[5]);
            }
            target.set(versionDate);
        }
    }

    /**
     * Unsets the "versionDate" element
     */
    @Override
    public void unsetVersionDate() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], 0);
        }
    }

    /**
     * Gets the "versionRationale" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RationaleDefinition getVersionRationale() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.RationaleDefinition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.RationaleDefinition)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "versionRationale" element
     */
    @Override
    public boolean isSetVersionRationale() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]) != 0;
        }
    }

    /**
     * Sets the "versionRationale" element
     */
    @Override
    public void setVersionRationale(org.ddialliance.specification.ddiCDI.x10.xmlSchema.RationaleDefinition versionRationale) {
        generatedSetterHelperImpl(versionRationale, PROPERTY_QNAME[6], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "versionRationale" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RationaleDefinition addNewVersionRationale() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.RationaleDefinition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.RationaleDefinition)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Unsets the "versionRationale" element
     */
    @Override
    public void unsetVersionRationale() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], 0);
        }
    }

    /**
     * Gets the "versionResponsibility" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole getVersionResponsibility() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "versionResponsibility" element
     */
    @Override
    public boolean isSetVersionResponsibility() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[7]) != 0;
        }
    }

    /**
     * Sets the "versionResponsibility" element
     */
    @Override
    public void setVersionResponsibility(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole versionResponsibility) {
        generatedSetterHelperImpl(versionResponsibility, PROPERTY_QNAME[7], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "versionResponsibility" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole addNewVersionResponsibility() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole)get_store().add_element_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * Unsets the "versionResponsibility" element
     */
    @Override
    public void unsetVersionResponsibility() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[7], 0);
        }
    }
}
