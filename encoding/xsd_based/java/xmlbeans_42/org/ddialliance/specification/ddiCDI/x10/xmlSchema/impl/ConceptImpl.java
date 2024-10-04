/*
 * XML Type:  Concept
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML Concept(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class ConceptImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept {
    private static final long serialVersionUID = 1L;

    public ConceptImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "catalogDetails"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "definition"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "displayLabel"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "externalDefinition"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "name"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Concept_uses_Concept"),
    };


    /**
     * Gets the "catalogDetails" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails getCatalogDetails() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails)get_store().find_element_user(PROPERTY_QNAME[0], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "catalogDetails" element
     */
    @Override
    public void setCatalogDetails(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails catalogDetails) {
        generatedSetterHelperImpl(catalogDetails, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "catalogDetails" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails addNewCatalogDetails() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails)get_store().add_element_user(PROPERTY_QNAME[0]);
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
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "definition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getDefinition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "definition" element
     */
    @Override
    public boolean isSetDefinition() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "definition" element
     */
    @Override
    public void setDefinition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString definition) {
        generatedSetterHelperImpl(definition, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "definition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewDefinition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "definition" element
     */
    @Override
    public void unsetDefinition() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
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
        return getXmlObjectArray(PROPERTY_QNAME[2], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay[0]);
    }

    /**
     * Gets ith "displayLabel" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay getDisplayLabelArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay)get_store().find_element_user(PROPERTY_QNAME[2], i);
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
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "displayLabel" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDisplayLabelArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay[] displayLabelArray) {
        check_orphaned();
        arraySetterHelper(displayLabelArray, PROPERTY_QNAME[2]);
    }

    /**
     * Sets ith "displayLabel" element
     */
    @Override
    public void setDisplayLabelArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay displayLabel) {
        generatedSetterHelperImpl(displayLabel, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "displayLabel" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay insertNewDisplayLabel(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay)get_store().insert_element_user(PROPERTY_QNAME[2], i);
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
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay)get_store().add_element_user(PROPERTY_QNAME[2]);
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
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets the "externalDefinition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept.ExternalDefinition getExternalDefinition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept.ExternalDefinition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept.ExternalDefinition)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "externalDefinition" element
     */
    @Override
    public boolean isSetExternalDefinition() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "externalDefinition" element
     */
    @Override
    public void setExternalDefinition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept.ExternalDefinition externalDefinition) {
        generatedSetterHelperImpl(externalDefinition, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "externalDefinition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept.ExternalDefinition addNewExternalDefinition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept.ExternalDefinition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept.ExternalDefinition)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "externalDefinition" element
     */
    @Override
    public void unsetExternalDefinition() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
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
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier)get_store().find_element_user(PROPERTY_QNAME[4], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "identifier" element
     */
    @Override
    public void setIdentifier(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier identifier) {
        generatedSetterHelperImpl(identifier, PROPERTY_QNAME[4], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "identifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier addNewIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier)get_store().add_element_user(PROPERTY_QNAME[4]);
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
            get_store().remove_element(PROPERTY_QNAME[4], 0);
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
        return getXmlObjectArray(PROPERTY_QNAME[5], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName[0]);
    }

    /**
     * Gets ith "name" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName getNameArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName)get_store().find_element_user(PROPERTY_QNAME[5], i);
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
            return get_store().count_elements(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Sets array of all "name" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setNameArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName[] nameArray) {
        check_orphaned();
        arraySetterHelper(nameArray, PROPERTY_QNAME[5]);
    }

    /**
     * Sets ith "name" element
     */
    @Override
    public void setNameArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName name) {
        generatedSetterHelperImpl(name, PROPERTY_QNAME[5], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "name" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName insertNewName(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName)get_store().insert_element_user(PROPERTY_QNAME[5], i);
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
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName)get_store().add_element_user(PROPERTY_QNAME[5]);
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
            get_store().remove_element(PROPERTY_QNAME[5], i);
        }
    }

    /**
     * Gets a List of "Concept_uses_Concept" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept.ConceptUsesConcept> getConceptUsesConceptList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getConceptUsesConceptArray,
                this::setConceptUsesConceptArray,
                this::insertNewConceptUsesConcept,
                this::removeConceptUsesConcept,
                this::sizeOfConceptUsesConceptArray
            );
        }
    }

    /**
     * Gets array of all "Concept_uses_Concept" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept.ConceptUsesConcept[] getConceptUsesConceptArray() {
        return getXmlObjectArray(PROPERTY_QNAME[6], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept.ConceptUsesConcept[0]);
    }

    /**
     * Gets ith "Concept_uses_Concept" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept.ConceptUsesConcept getConceptUsesConceptArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept.ConceptUsesConcept target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept.ConceptUsesConcept)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Concept_uses_Concept" element
     */
    @Override
    public int sizeOfConceptUsesConceptArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Sets array of all "Concept_uses_Concept" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setConceptUsesConceptArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept.ConceptUsesConcept[] conceptUsesConceptArray) {
        check_orphaned();
        arraySetterHelper(conceptUsesConceptArray, PROPERTY_QNAME[6]);
    }

    /**
     * Sets ith "Concept_uses_Concept" element
     */
    @Override
    public void setConceptUsesConceptArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept.ConceptUsesConcept conceptUsesConcept) {
        generatedSetterHelperImpl(conceptUsesConcept, PROPERTY_QNAME[6], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Concept_uses_Concept" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept.ConceptUsesConcept insertNewConceptUsesConcept(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept.ConceptUsesConcept target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept.ConceptUsesConcept)get_store().insert_element_user(PROPERTY_QNAME[6], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Concept_uses_Concept" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept.ConceptUsesConcept addNewConceptUsesConcept() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept.ConceptUsesConcept target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept.ConceptUsesConcept)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Removes the ith "Concept_uses_Concept" element
     */
    @Override
    public void removeConceptUsesConcept(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], i);
        }
    }
    /**
     * An XML externalDefinition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ExternalDefinitionImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept.ExternalDefinition {
        private static final long serialVersionUID = 1L;

        public ExternalDefinitionImpl(org.apache.xmlbeans.SchemaType sType) {
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
    /**
     * An XML Concept_uses_Concept(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ConceptUsesConceptImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept.ConceptUsesConcept {
        private static final long serialVersionUID = 1L;

        public ConceptUsesConceptImpl(org.apache.xmlbeans.SchemaType sType) {
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
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept$ConceptUsesConcept$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept.ConceptUsesConcept.ValidType {
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
