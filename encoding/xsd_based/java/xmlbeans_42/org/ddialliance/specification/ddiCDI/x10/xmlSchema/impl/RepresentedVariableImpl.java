/*
 * XML Type:  RepresentedVariable
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML RepresentedVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class RepresentedVariableImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ConceptualVariableImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable {
    private static final long serialVersionUID = 1L;

    public RepresentedVariableImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "describedUnitOfMeasure"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "hasIntendedDataType"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "simpleUnitOfMeasure"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "RepresentedVariable_takesSentinelValuesFrom_SentinelValueDomain"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "RepresentedVariable_takesSubstantiveValuesFrom_SubstantiveValueDomain"),
    };


    /**
     * Gets the "describedUnitOfMeasure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getDescribedUnitOfMeasure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "describedUnitOfMeasure" element
     */
    @Override
    public boolean isSetDescribedUnitOfMeasure() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "describedUnitOfMeasure" element
     */
    @Override
    public void setDescribedUnitOfMeasure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry describedUnitOfMeasure) {
        generatedSetterHelperImpl(describedUnitOfMeasure, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "describedUnitOfMeasure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewDescribedUnitOfMeasure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "describedUnitOfMeasure" element
     */
    @Override
    public void unsetDescribedUnitOfMeasure() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "hasIntendedDataType" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getHasIntendedDataType() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "hasIntendedDataType" element
     */
    @Override
    public boolean isSetHasIntendedDataType() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "hasIntendedDataType" element
     */
    @Override
    public void setHasIntendedDataType(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry hasIntendedDataType) {
        generatedSetterHelperImpl(hasIntendedDataType, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "hasIntendedDataType" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewHasIntendedDataType() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "hasIntendedDataType" element
     */
    @Override
    public void unsetHasIntendedDataType() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "simpleUnitOfMeasure" element
     */
    @Override
    public java.lang.String getSimpleUnitOfMeasure() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "simpleUnitOfMeasure" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetSimpleUnitOfMeasure() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return target;
        }
    }

    /**
     * True if has "simpleUnitOfMeasure" element
     */
    @Override
    public boolean isSetSimpleUnitOfMeasure() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "simpleUnitOfMeasure" element
     */
    @Override
    public void setSimpleUnitOfMeasure(java.lang.String simpleUnitOfMeasure) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.setStringValue(simpleUnitOfMeasure);
        }
    }

    /**
     * Sets (as xml) the "simpleUnitOfMeasure" element
     */
    @Override
    public void xsetSimpleUnitOfMeasure(org.apache.xmlbeans.XmlString simpleUnitOfMeasure) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.set(simpleUnitOfMeasure);
        }
    }

    /**
     * Unsets the "simpleUnitOfMeasure" element
     */
    @Override
    public void unsetSimpleUnitOfMeasure() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets a List of "RepresentedVariable_takesSentinelValuesFrom_SentinelValueDomain" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSentinelValuesFromSentinelValueDomain> getRepresentedVariableTakesSentinelValuesFromSentinelValueDomainList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getRepresentedVariableTakesSentinelValuesFromSentinelValueDomainArray,
                this::setRepresentedVariableTakesSentinelValuesFromSentinelValueDomainArray,
                this::insertNewRepresentedVariableTakesSentinelValuesFromSentinelValueDomain,
                this::removeRepresentedVariableTakesSentinelValuesFromSentinelValueDomain,
                this::sizeOfRepresentedVariableTakesSentinelValuesFromSentinelValueDomainArray
            );
        }
    }

    /**
     * Gets array of all "RepresentedVariable_takesSentinelValuesFrom_SentinelValueDomain" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSentinelValuesFromSentinelValueDomain[] getRepresentedVariableTakesSentinelValuesFromSentinelValueDomainArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSentinelValuesFromSentinelValueDomain[0]);
    }

    /**
     * Gets ith "RepresentedVariable_takesSentinelValuesFrom_SentinelValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSentinelValuesFromSentinelValueDomain getRepresentedVariableTakesSentinelValuesFromSentinelValueDomainArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSentinelValuesFromSentinelValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSentinelValuesFromSentinelValueDomain)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "RepresentedVariable_takesSentinelValuesFrom_SentinelValueDomain" element
     */
    @Override
    public int sizeOfRepresentedVariableTakesSentinelValuesFromSentinelValueDomainArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets array of all "RepresentedVariable_takesSentinelValuesFrom_SentinelValueDomain" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setRepresentedVariableTakesSentinelValuesFromSentinelValueDomainArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSentinelValuesFromSentinelValueDomain[] representedVariableTakesSentinelValuesFromSentinelValueDomainArray) {
        check_orphaned();
        arraySetterHelper(representedVariableTakesSentinelValuesFromSentinelValueDomainArray, PROPERTY_QNAME[3]);
    }

    /**
     * Sets ith "RepresentedVariable_takesSentinelValuesFrom_SentinelValueDomain" element
     */
    @Override
    public void setRepresentedVariableTakesSentinelValuesFromSentinelValueDomainArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSentinelValuesFromSentinelValueDomain representedVariableTakesSentinelValuesFromSentinelValueDomain) {
        generatedSetterHelperImpl(representedVariableTakesSentinelValuesFromSentinelValueDomain, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RepresentedVariable_takesSentinelValuesFrom_SentinelValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSentinelValuesFromSentinelValueDomain insertNewRepresentedVariableTakesSentinelValuesFromSentinelValueDomain(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSentinelValuesFromSentinelValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSentinelValuesFromSentinelValueDomain)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "RepresentedVariable_takesSentinelValuesFrom_SentinelValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSentinelValuesFromSentinelValueDomain addNewRepresentedVariableTakesSentinelValuesFromSentinelValueDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSentinelValuesFromSentinelValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSentinelValuesFromSentinelValueDomain)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "RepresentedVariable_takesSentinelValuesFrom_SentinelValueDomain" element
     */
    @Override
    public void removeRepresentedVariableTakesSentinelValuesFromSentinelValueDomain(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }

    /**
     * Gets the "RepresentedVariable_takesSubstantiveValuesFrom_SubstantiveValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSubstantiveValuesFromSubstantiveValueDomain getRepresentedVariableTakesSubstantiveValuesFromSubstantiveValueDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSubstantiveValuesFromSubstantiveValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSubstantiveValuesFromSubstantiveValueDomain)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "RepresentedVariable_takesSubstantiveValuesFrom_SubstantiveValueDomain" element
     */
    @Override
    public boolean isSetRepresentedVariableTakesSubstantiveValuesFromSubstantiveValueDomain() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "RepresentedVariable_takesSubstantiveValuesFrom_SubstantiveValueDomain" element
     */
    @Override
    public void setRepresentedVariableTakesSubstantiveValuesFromSubstantiveValueDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSubstantiveValuesFromSubstantiveValueDomain representedVariableTakesSubstantiveValuesFromSubstantiveValueDomain) {
        generatedSetterHelperImpl(representedVariableTakesSubstantiveValuesFromSubstantiveValueDomain, PROPERTY_QNAME[4], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "RepresentedVariable_takesSubstantiveValuesFrom_SubstantiveValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSubstantiveValuesFromSubstantiveValueDomain addNewRepresentedVariableTakesSubstantiveValuesFromSubstantiveValueDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSubstantiveValuesFromSubstantiveValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSubstantiveValuesFromSubstantiveValueDomain)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Unsets the "RepresentedVariable_takesSubstantiveValuesFrom_SubstantiveValueDomain" element
     */
    @Override
    public void unsetRepresentedVariableTakesSubstantiveValuesFromSubstantiveValueDomain() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }
    /**
     * An XML RepresentedVariable_takesSentinelValuesFrom_SentinelValueDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class RepresentedVariableTakesSentinelValuesFromSentinelValueDomainImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSentinelValuesFromSentinelValueDomain {
        private static final long serialVersionUID = 1L;

        public RepresentedVariableTakesSentinelValuesFromSentinelValueDomainImpl(org.apache.xmlbeans.SchemaType sType) {
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable$RepresentedVariableTakesSentinelValuesFromSentinelValueDomain$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSentinelValuesFromSentinelValueDomain.ValidType {
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
     * An XML RepresentedVariable_takesSubstantiveValuesFrom_SubstantiveValueDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class RepresentedVariableTakesSubstantiveValuesFromSubstantiveValueDomainImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSubstantiveValuesFromSubstantiveValueDomain {
        private static final long serialVersionUID = 1L;

        public RepresentedVariableTakesSubstantiveValuesFromSubstantiveValueDomainImpl(org.apache.xmlbeans.SchemaType sType) {
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable$RepresentedVariableTakesSubstantiveValuesFromSubstantiveValueDomain$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.RepresentedVariable.RepresentedVariableTakesSubstantiveValuesFromSubstantiveValueDomain.ValidType {
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
