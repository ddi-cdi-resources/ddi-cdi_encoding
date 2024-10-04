/*
 * XML Type:  EnumerationDomain
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML EnumerationDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class EnumerationDomainImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain {
    private static final long serialVersionUID = 1L;

    public EnumerationDomainImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "name"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "purpose"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "EnumerationDomain_uses_LevelStructure"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "EnumerationDomain_references_CategorySet"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "EnumerationDomain_isDefinedBy_Concept"),
    };


    /**
     * Gets the "identifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier getIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier)get_store().find_element_user(PROPERTY_QNAME[0], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "identifier" element
     */
    @Override
    public void setIdentifier(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier identifier) {
        generatedSetterHelperImpl(identifier, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "identifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier addNewIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier)get_store().add_element_user(PROPERTY_QNAME[0]);
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
            get_store().remove_element(PROPERTY_QNAME[0], 0);
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
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName[0]);
    }

    /**
     * Gets ith "name" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName getNameArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName)get_store().find_element_user(PROPERTY_QNAME[1], i);
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
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "name" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setNameArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName[] nameArray) {
        check_orphaned();
        arraySetterHelper(nameArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "name" element
     */
    @Override
    public void setNameArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName name) {
        generatedSetterHelperImpl(name, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "name" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName insertNewName(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName)get_store().insert_element_user(PROPERTY_QNAME[1], i);
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
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName)get_store().add_element_user(PROPERTY_QNAME[1]);
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
            get_store().remove_element(PROPERTY_QNAME[1], i);
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
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().find_element_user(PROPERTY_QNAME[2], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "purpose" element
     */
    @Override
    public void setPurpose(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString purpose) {
        generatedSetterHelperImpl(purpose, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "purpose" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewPurpose() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[2]);
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
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "EnumerationDomain_uses_LevelStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainUsesLevelStructure getEnumerationDomainUsesLevelStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainUsesLevelStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainUsesLevelStructure)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "EnumerationDomain_uses_LevelStructure" element
     */
    @Override
    public boolean isSetEnumerationDomainUsesLevelStructure() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "EnumerationDomain_uses_LevelStructure" element
     */
    @Override
    public void setEnumerationDomainUsesLevelStructure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainUsesLevelStructure enumerationDomainUsesLevelStructure) {
        generatedSetterHelperImpl(enumerationDomainUsesLevelStructure, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "EnumerationDomain_uses_LevelStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainUsesLevelStructure addNewEnumerationDomainUsesLevelStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainUsesLevelStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainUsesLevelStructure)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "EnumerationDomain_uses_LevelStructure" element
     */
    @Override
    public void unsetEnumerationDomainUsesLevelStructure() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "EnumerationDomain_references_CategorySet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainReferencesCategorySet getEnumerationDomainReferencesCategorySet() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainReferencesCategorySet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainReferencesCategorySet)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "EnumerationDomain_references_CategorySet" element
     */
    @Override
    public boolean isSetEnumerationDomainReferencesCategorySet() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "EnumerationDomain_references_CategorySet" element
     */
    @Override
    public void setEnumerationDomainReferencesCategorySet(org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainReferencesCategorySet enumerationDomainReferencesCategorySet) {
        generatedSetterHelperImpl(enumerationDomainReferencesCategorySet, PROPERTY_QNAME[4], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "EnumerationDomain_references_CategorySet" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainReferencesCategorySet addNewEnumerationDomainReferencesCategorySet() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainReferencesCategorySet target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainReferencesCategorySet)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Unsets the "EnumerationDomain_references_CategorySet" element
     */
    @Override
    public void unsetEnumerationDomainReferencesCategorySet() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }

    /**
     * Gets a List of "EnumerationDomain_isDefinedBy_Concept" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainIsDefinedByConcept> getEnumerationDomainIsDefinedByConceptList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getEnumerationDomainIsDefinedByConceptArray,
                this::setEnumerationDomainIsDefinedByConceptArray,
                this::insertNewEnumerationDomainIsDefinedByConcept,
                this::removeEnumerationDomainIsDefinedByConcept,
                this::sizeOfEnumerationDomainIsDefinedByConceptArray
            );
        }
    }

    /**
     * Gets array of all "EnumerationDomain_isDefinedBy_Concept" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainIsDefinedByConcept[] getEnumerationDomainIsDefinedByConceptArray() {
        return getXmlObjectArray(PROPERTY_QNAME[5], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainIsDefinedByConcept[0]);
    }

    /**
     * Gets ith "EnumerationDomain_isDefinedBy_Concept" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainIsDefinedByConcept getEnumerationDomainIsDefinedByConceptArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainIsDefinedByConcept target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainIsDefinedByConcept)get_store().find_element_user(PROPERTY_QNAME[5], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "EnumerationDomain_isDefinedBy_Concept" element
     */
    @Override
    public int sizeOfEnumerationDomainIsDefinedByConceptArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Sets array of all "EnumerationDomain_isDefinedBy_Concept" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setEnumerationDomainIsDefinedByConceptArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainIsDefinedByConcept[] enumerationDomainIsDefinedByConceptArray) {
        check_orphaned();
        arraySetterHelper(enumerationDomainIsDefinedByConceptArray, PROPERTY_QNAME[5]);
    }

    /**
     * Sets ith "EnumerationDomain_isDefinedBy_Concept" element
     */
    @Override
    public void setEnumerationDomainIsDefinedByConceptArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainIsDefinedByConcept enumerationDomainIsDefinedByConcept) {
        generatedSetterHelperImpl(enumerationDomainIsDefinedByConcept, PROPERTY_QNAME[5], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "EnumerationDomain_isDefinedBy_Concept" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainIsDefinedByConcept insertNewEnumerationDomainIsDefinedByConcept(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainIsDefinedByConcept target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainIsDefinedByConcept)get_store().insert_element_user(PROPERTY_QNAME[5], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "EnumerationDomain_isDefinedBy_Concept" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainIsDefinedByConcept addNewEnumerationDomainIsDefinedByConcept() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainIsDefinedByConcept target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainIsDefinedByConcept)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Removes the ith "EnumerationDomain_isDefinedBy_Concept" element
     */
    @Override
    public void removeEnumerationDomainIsDefinedByConcept(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], i);
        }
    }
    /**
     * An XML EnumerationDomain_uses_LevelStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class EnumerationDomainUsesLevelStructureImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainUsesLevelStructure {
        private static final long serialVersionUID = 1L;

        public EnumerationDomainUsesLevelStructureImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain$EnumerationDomainUsesLevelStructure$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainUsesLevelStructure.ValidType {
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
     * An XML EnumerationDomain_references_CategorySet(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class EnumerationDomainReferencesCategorySetImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainReferencesCategorySet {
        private static final long serialVersionUID = 1L;

        public EnumerationDomainReferencesCategorySetImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain$EnumerationDomainReferencesCategorySet$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainReferencesCategorySet.ValidType {
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
     * An XML EnumerationDomain_isDefinedBy_Concept(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class EnumerationDomainIsDefinedByConceptImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainIsDefinedByConcept {
        private static final long serialVersionUID = 1L;

        public EnumerationDomainIsDefinedByConceptImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain$EnumerationDomainIsDefinedByConcept$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.EnumerationDomain.EnumerationDomainIsDefinedByConcept.ValidType {
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
