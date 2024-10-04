/*
 * XML Type:  VariableRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML VariableRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class VariableRelationshipImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship {
    private static final long serialVersionUID = 1L;

    public VariableRelationshipImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "semantics"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "VariableRelationship_hasTarget_ConceptualVariable"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "VariableRelationship_hasSource_ConceptualVariable"),
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
     * Gets a List of "VariableRelationship_hasTarget_ConceptualVariable" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasTargetConceptualVariable> getVariableRelationshipHasTargetConceptualVariableList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getVariableRelationshipHasTargetConceptualVariableArray,
                this::setVariableRelationshipHasTargetConceptualVariableArray,
                this::insertNewVariableRelationshipHasTargetConceptualVariable,
                this::removeVariableRelationshipHasTargetConceptualVariable,
                this::sizeOfVariableRelationshipHasTargetConceptualVariableArray
            );
        }
    }

    /**
     * Gets array of all "VariableRelationship_hasTarget_ConceptualVariable" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasTargetConceptualVariable[] getVariableRelationshipHasTargetConceptualVariableArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasTargetConceptualVariable[0]);
    }

    /**
     * Gets ith "VariableRelationship_hasTarget_ConceptualVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasTargetConceptualVariable getVariableRelationshipHasTargetConceptualVariableArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasTargetConceptualVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasTargetConceptualVariable)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "VariableRelationship_hasTarget_ConceptualVariable" element
     */
    @Override
    public int sizeOfVariableRelationshipHasTargetConceptualVariableArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "VariableRelationship_hasTarget_ConceptualVariable" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setVariableRelationshipHasTargetConceptualVariableArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasTargetConceptualVariable[] variableRelationshipHasTargetConceptualVariableArray) {
        check_orphaned();
        arraySetterHelper(variableRelationshipHasTargetConceptualVariableArray, PROPERTY_QNAME[2]);
    }

    /**
     * Sets ith "VariableRelationship_hasTarget_ConceptualVariable" element
     */
    @Override
    public void setVariableRelationshipHasTargetConceptualVariableArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasTargetConceptualVariable variableRelationshipHasTargetConceptualVariable) {
        generatedSetterHelperImpl(variableRelationshipHasTargetConceptualVariable, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "VariableRelationship_hasTarget_ConceptualVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasTargetConceptualVariable insertNewVariableRelationshipHasTargetConceptualVariable(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasTargetConceptualVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasTargetConceptualVariable)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "VariableRelationship_hasTarget_ConceptualVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasTargetConceptualVariable addNewVariableRelationshipHasTargetConceptualVariable() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasTargetConceptualVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasTargetConceptualVariable)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "VariableRelationship_hasTarget_ConceptualVariable" element
     */
    @Override
    public void removeVariableRelationshipHasTargetConceptualVariable(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "VariableRelationship_hasSource_ConceptualVariable" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasSourceConceptualVariable> getVariableRelationshipHasSourceConceptualVariableList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getVariableRelationshipHasSourceConceptualVariableArray,
                this::setVariableRelationshipHasSourceConceptualVariableArray,
                this::insertNewVariableRelationshipHasSourceConceptualVariable,
                this::removeVariableRelationshipHasSourceConceptualVariable,
                this::sizeOfVariableRelationshipHasSourceConceptualVariableArray
            );
        }
    }

    /**
     * Gets array of all "VariableRelationship_hasSource_ConceptualVariable" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasSourceConceptualVariable[] getVariableRelationshipHasSourceConceptualVariableArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasSourceConceptualVariable[0]);
    }

    /**
     * Gets ith "VariableRelationship_hasSource_ConceptualVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasSourceConceptualVariable getVariableRelationshipHasSourceConceptualVariableArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasSourceConceptualVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasSourceConceptualVariable)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "VariableRelationship_hasSource_ConceptualVariable" element
     */
    @Override
    public int sizeOfVariableRelationshipHasSourceConceptualVariableArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets array of all "VariableRelationship_hasSource_ConceptualVariable" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setVariableRelationshipHasSourceConceptualVariableArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasSourceConceptualVariable[] variableRelationshipHasSourceConceptualVariableArray) {
        check_orphaned();
        arraySetterHelper(variableRelationshipHasSourceConceptualVariableArray, PROPERTY_QNAME[3]);
    }

    /**
     * Sets ith "VariableRelationship_hasSource_ConceptualVariable" element
     */
    @Override
    public void setVariableRelationshipHasSourceConceptualVariableArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasSourceConceptualVariable variableRelationshipHasSourceConceptualVariable) {
        generatedSetterHelperImpl(variableRelationshipHasSourceConceptualVariable, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "VariableRelationship_hasSource_ConceptualVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasSourceConceptualVariable insertNewVariableRelationshipHasSourceConceptualVariable(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasSourceConceptualVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasSourceConceptualVariable)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "VariableRelationship_hasSource_ConceptualVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasSourceConceptualVariable addNewVariableRelationshipHasSourceConceptualVariable() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasSourceConceptualVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasSourceConceptualVariable)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "VariableRelationship_hasSource_ConceptualVariable" element
     */
    @Override
    public void removeVariableRelationshipHasSourceConceptualVariable(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }
    /**
     * An XML VariableRelationship_hasTarget_ConceptualVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class VariableRelationshipHasTargetConceptualVariableImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasTargetConceptualVariable {
        private static final long serialVersionUID = 1L;

        public VariableRelationshipHasTargetConceptualVariableImpl(org.apache.xmlbeans.SchemaType sType) {
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship$VariableRelationshipHasTargetConceptualVariable$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasTargetConceptualVariable.ValidType {
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
     * An XML VariableRelationship_hasSource_ConceptualVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class VariableRelationshipHasSourceConceptualVariableImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasSourceConceptualVariable {
        private static final long serialVersionUID = 1L;

        public VariableRelationshipHasSourceConceptualVariableImpl(org.apache.xmlbeans.SchemaType sType) {
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship$VariableRelationshipHasSourceConceptualVariable$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship.VariableRelationshipHasSourceConceptualVariable.ValidType {
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
