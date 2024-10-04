/*
 * XML Type:  ValueMappingRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ValueMappingRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class ValueMappingRelationshipImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship {
    private static final long serialVersionUID = 1L;

    public ValueMappingRelationshipImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "semantics"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ValueMappingRelationship_hasTarget_ValueMapping"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ValueMappingRelationship_hasSource_ValueMapping"),
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
     * Gets the "semantics" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getSemantics() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "semantics" element
     */
    @Override
    public boolean isSetSemantics() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "semantics" element
     */
    @Override
    public void setSemantics(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry semantics) {
        generatedSetterHelperImpl(semantics, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "semantics" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewSemantics() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "semantics" element
     */
    @Override
    public void unsetSemantics() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets a List of "ValueMappingRelationship_hasTarget_ValueMapping" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasTargetValueMapping> getValueMappingRelationshipHasTargetValueMappingList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getValueMappingRelationshipHasTargetValueMappingArray,
                this::setValueMappingRelationshipHasTargetValueMappingArray,
                this::insertNewValueMappingRelationshipHasTargetValueMapping,
                this::removeValueMappingRelationshipHasTargetValueMapping,
                this::sizeOfValueMappingRelationshipHasTargetValueMappingArray
            );
        }
    }

    /**
     * Gets array of all "ValueMappingRelationship_hasTarget_ValueMapping" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasTargetValueMapping[] getValueMappingRelationshipHasTargetValueMappingArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasTargetValueMapping[0]);
    }

    /**
     * Gets ith "ValueMappingRelationship_hasTarget_ValueMapping" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasTargetValueMapping getValueMappingRelationshipHasTargetValueMappingArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasTargetValueMapping target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasTargetValueMapping)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ValueMappingRelationship_hasTarget_ValueMapping" element
     */
    @Override
    public int sizeOfValueMappingRelationshipHasTargetValueMappingArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "ValueMappingRelationship_hasTarget_ValueMapping" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setValueMappingRelationshipHasTargetValueMappingArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasTargetValueMapping[] valueMappingRelationshipHasTargetValueMappingArray) {
        check_orphaned();
        arraySetterHelper(valueMappingRelationshipHasTargetValueMappingArray, PROPERTY_QNAME[2]);
    }

    /**
     * Sets ith "ValueMappingRelationship_hasTarget_ValueMapping" element
     */
    @Override
    public void setValueMappingRelationshipHasTargetValueMappingArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasTargetValueMapping valueMappingRelationshipHasTargetValueMapping) {
        generatedSetterHelperImpl(valueMappingRelationshipHasTargetValueMapping, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ValueMappingRelationship_hasTarget_ValueMapping" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasTargetValueMapping insertNewValueMappingRelationshipHasTargetValueMapping(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasTargetValueMapping target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasTargetValueMapping)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ValueMappingRelationship_hasTarget_ValueMapping" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasTargetValueMapping addNewValueMappingRelationshipHasTargetValueMapping() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasTargetValueMapping target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasTargetValueMapping)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "ValueMappingRelationship_hasTarget_ValueMapping" element
     */
    @Override
    public void removeValueMappingRelationshipHasTargetValueMapping(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "ValueMappingRelationship_hasSource_ValueMapping" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasSourceValueMapping> getValueMappingRelationshipHasSourceValueMappingList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getValueMappingRelationshipHasSourceValueMappingArray,
                this::setValueMappingRelationshipHasSourceValueMappingArray,
                this::insertNewValueMappingRelationshipHasSourceValueMapping,
                this::removeValueMappingRelationshipHasSourceValueMapping,
                this::sizeOfValueMappingRelationshipHasSourceValueMappingArray
            );
        }
    }

    /**
     * Gets array of all "ValueMappingRelationship_hasSource_ValueMapping" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasSourceValueMapping[] getValueMappingRelationshipHasSourceValueMappingArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasSourceValueMapping[0]);
    }

    /**
     * Gets ith "ValueMappingRelationship_hasSource_ValueMapping" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasSourceValueMapping getValueMappingRelationshipHasSourceValueMappingArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasSourceValueMapping target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasSourceValueMapping)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ValueMappingRelationship_hasSource_ValueMapping" element
     */
    @Override
    public int sizeOfValueMappingRelationshipHasSourceValueMappingArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets array of all "ValueMappingRelationship_hasSource_ValueMapping" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setValueMappingRelationshipHasSourceValueMappingArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasSourceValueMapping[] valueMappingRelationshipHasSourceValueMappingArray) {
        check_orphaned();
        arraySetterHelper(valueMappingRelationshipHasSourceValueMappingArray, PROPERTY_QNAME[3]);
    }

    /**
     * Sets ith "ValueMappingRelationship_hasSource_ValueMapping" element
     */
    @Override
    public void setValueMappingRelationshipHasSourceValueMappingArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasSourceValueMapping valueMappingRelationshipHasSourceValueMapping) {
        generatedSetterHelperImpl(valueMappingRelationshipHasSourceValueMapping, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ValueMappingRelationship_hasSource_ValueMapping" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasSourceValueMapping insertNewValueMappingRelationshipHasSourceValueMapping(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasSourceValueMapping target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasSourceValueMapping)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ValueMappingRelationship_hasSource_ValueMapping" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasSourceValueMapping addNewValueMappingRelationshipHasSourceValueMapping() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasSourceValueMapping target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasSourceValueMapping)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "ValueMappingRelationship_hasSource_ValueMapping" element
     */
    @Override
    public void removeValueMappingRelationshipHasSourceValueMapping(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }
    /**
     * An XML ValueMappingRelationship_hasTarget_ValueMapping(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ValueMappingRelationshipHasTargetValueMappingImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasTargetValueMapping {
        private static final long serialVersionUID = 1L;

        public ValueMappingRelationshipHasTargetValueMappingImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship$ValueMappingRelationshipHasTargetValueMapping$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasTargetValueMapping.ValidType {
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
     * An XML ValueMappingRelationship_hasSource_ValueMapping(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ValueMappingRelationshipHasSourceValueMappingImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasSourceValueMapping {
        private static final long serialVersionUID = 1L;

        public ValueMappingRelationshipHasSourceValueMappingImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship$ValueMappingRelationshipHasSourceValueMapping$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueMappingRelationship.ValueMappingRelationshipHasSourceValueMapping.ValidType {
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
