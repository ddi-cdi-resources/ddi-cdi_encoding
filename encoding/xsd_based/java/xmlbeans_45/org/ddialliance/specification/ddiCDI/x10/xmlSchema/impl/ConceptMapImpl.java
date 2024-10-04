/*
 * XML Type:  ConceptMap
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ConceptMap(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class ConceptMapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap {
    private static final long serialVersionUID = 1L;

    public ConceptMapImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "correspondence"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "displayLabel"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "usage"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "validDates"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ConceptMap_hasSource_Concept"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ConceptMap_hasTarget_Concept"),
    };


    /**
     * Gets the "correspondence" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceDefinition getCorrespondence() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceDefinition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceDefinition)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "correspondence" element
     */
    @Override
    public boolean isSetCorrespondence() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "correspondence" element
     */
    @Override
    public void setCorrespondence(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceDefinition correspondence) {
        generatedSetterHelperImpl(correspondence, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "correspondence" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceDefinition addNewCorrespondence() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceDefinition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceDefinition)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "correspondence" element
     */
    @Override
    public void unsetCorrespondence() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "displayLabel" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay getDisplayLabel() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "displayLabel" element
     */
    @Override
    public boolean isSetDisplayLabel() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "displayLabel" element
     */
    @Override
    public void setDisplayLabel(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay displayLabel) {
        generatedSetterHelperImpl(displayLabel, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "displayLabel" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay addNewDisplayLabel() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LabelForDisplay)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "displayLabel" element
     */
    @Override
    public void unsetDisplayLabel() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
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
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier)get_store().find_element_user(PROPERTY_QNAME[2], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "identifier" element
     */
    @Override
    public void setIdentifier(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier identifier) {
        generatedSetterHelperImpl(identifier, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "identifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier addNewIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier)get_store().add_element_user(PROPERTY_QNAME[2]);
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
            get_store().remove_element(PROPERTY_QNAME[2], 0);
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
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().find_element_user(PROPERTY_QNAME[3], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "usage" element
     */
    @Override
    public void setUsage(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString usage) {
        generatedSetterHelperImpl(usage, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "usage" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewUsage() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[3]);
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
            get_store().remove_element(PROPERTY_QNAME[3], 0);
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
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange)get_store().find_element_user(PROPERTY_QNAME[4], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "validDates" element
     */
    @Override
    public void setValidDates(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange validDates) {
        generatedSetterHelperImpl(validDates, PROPERTY_QNAME[4], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "validDates" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange addNewValidDates() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DateRange)get_store().add_element_user(PROPERTY_QNAME[4]);
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
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }

    /**
     * Gets a List of "ConceptMap_hasSource_Concept" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap.ConceptMapHasSourceConcept> getConceptMapHasSourceConceptList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getConceptMapHasSourceConceptArray,
                this::setConceptMapHasSourceConceptArray,
                this::insertNewConceptMapHasSourceConcept,
                this::removeConceptMapHasSourceConcept,
                this::sizeOfConceptMapHasSourceConceptArray
            );
        }
    }

    /**
     * Gets array of all "ConceptMap_hasSource_Concept" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap.ConceptMapHasSourceConcept[] getConceptMapHasSourceConceptArray() {
        return getXmlObjectArray(PROPERTY_QNAME[5], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap.ConceptMapHasSourceConcept[0]);
    }

    /**
     * Gets ith "ConceptMap_hasSource_Concept" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap.ConceptMapHasSourceConcept getConceptMapHasSourceConceptArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap.ConceptMapHasSourceConcept target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap.ConceptMapHasSourceConcept)get_store().find_element_user(PROPERTY_QNAME[5], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ConceptMap_hasSource_Concept" element
     */
    @Override
    public int sizeOfConceptMapHasSourceConceptArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Sets array of all "ConceptMap_hasSource_Concept" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setConceptMapHasSourceConceptArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap.ConceptMapHasSourceConcept[] conceptMapHasSourceConceptArray) {
        check_orphaned();
        arraySetterHelper(conceptMapHasSourceConceptArray, PROPERTY_QNAME[5]);
    }

    /**
     * Sets ith "ConceptMap_hasSource_Concept" element
     */
    @Override
    public void setConceptMapHasSourceConceptArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap.ConceptMapHasSourceConcept conceptMapHasSourceConcept) {
        generatedSetterHelperImpl(conceptMapHasSourceConcept, PROPERTY_QNAME[5], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptMap_hasSource_Concept" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap.ConceptMapHasSourceConcept insertNewConceptMapHasSourceConcept(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap.ConceptMapHasSourceConcept target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap.ConceptMapHasSourceConcept)get_store().insert_element_user(PROPERTY_QNAME[5], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptMap_hasSource_Concept" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap.ConceptMapHasSourceConcept addNewConceptMapHasSourceConcept() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap.ConceptMapHasSourceConcept target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap.ConceptMapHasSourceConcept)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Removes the ith "ConceptMap_hasSource_Concept" element
     */
    @Override
    public void removeConceptMapHasSourceConcept(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], i);
        }
    }

    /**
     * Gets a List of "ConceptMap_hasTarget_Concept" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap.ConceptMapHasTargetConcept> getConceptMapHasTargetConceptList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getConceptMapHasTargetConceptArray,
                this::setConceptMapHasTargetConceptArray,
                this::insertNewConceptMapHasTargetConcept,
                this::removeConceptMapHasTargetConcept,
                this::sizeOfConceptMapHasTargetConceptArray
            );
        }
    }

    /**
     * Gets array of all "ConceptMap_hasTarget_Concept" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap.ConceptMapHasTargetConcept[] getConceptMapHasTargetConceptArray() {
        return getXmlObjectArray(PROPERTY_QNAME[6], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap.ConceptMapHasTargetConcept[0]);
    }

    /**
     * Gets ith "ConceptMap_hasTarget_Concept" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap.ConceptMapHasTargetConcept getConceptMapHasTargetConceptArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap.ConceptMapHasTargetConcept target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap.ConceptMapHasTargetConcept)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ConceptMap_hasTarget_Concept" element
     */
    @Override
    public int sizeOfConceptMapHasTargetConceptArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Sets array of all "ConceptMap_hasTarget_Concept" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setConceptMapHasTargetConceptArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap.ConceptMapHasTargetConcept[] conceptMapHasTargetConceptArray) {
        check_orphaned();
        arraySetterHelper(conceptMapHasTargetConceptArray, PROPERTY_QNAME[6]);
    }

    /**
     * Sets ith "ConceptMap_hasTarget_Concept" element
     */
    @Override
    public void setConceptMapHasTargetConceptArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap.ConceptMapHasTargetConcept conceptMapHasTargetConcept) {
        generatedSetterHelperImpl(conceptMapHasTargetConcept, PROPERTY_QNAME[6], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptMap_hasTarget_Concept" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap.ConceptMapHasTargetConcept insertNewConceptMapHasTargetConcept(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap.ConceptMapHasTargetConcept target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap.ConceptMapHasTargetConcept)get_store().insert_element_user(PROPERTY_QNAME[6], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptMap_hasTarget_Concept" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap.ConceptMapHasTargetConcept addNewConceptMapHasTargetConcept() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap.ConceptMapHasTargetConcept target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap.ConceptMapHasTargetConcept)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Removes the ith "ConceptMap_hasTarget_Concept" element
     */
    @Override
    public void removeConceptMapHasTargetConcept(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], i);
        }
    }
    /**
     * An XML ConceptMap_hasSource_Concept(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ConceptMapHasSourceConceptImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap.ConceptMapHasSourceConcept {
        private static final long serialVersionUID = 1L;

        public ConceptMapHasSourceConceptImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap$ConceptMapHasSourceConcept$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap.ConceptMapHasSourceConcept.ValidType {
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
     * An XML ConceptMap_hasTarget_Concept(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ConceptMapHasTargetConceptImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap.ConceptMapHasTargetConcept {
        private static final long serialVersionUID = 1L;

        public ConceptMapHasTargetConceptImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap$ConceptMapHasTargetConcept$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptMap.ConceptMapHasTargetConcept.ValidType {
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
