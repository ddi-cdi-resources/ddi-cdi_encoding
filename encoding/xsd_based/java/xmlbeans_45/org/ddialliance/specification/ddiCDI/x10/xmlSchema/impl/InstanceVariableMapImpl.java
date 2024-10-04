/*
 * XML Type:  InstanceVariableMap
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML InstanceVariableMap(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class InstanceVariableMapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap {
    private static final long serialVersionUID = 1L;

    public InstanceVariableMapImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "comparison"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "correspondence"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "setValue"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "InstanceVariableMap_hasTarget_InstanceVariable"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "InstanceVariableMap_hasSource_InstanceVariable"),
    };


    /**
     * Gets the "comparison" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComparisonOperator.Enum getComparison() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComparisonOperator.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "comparison" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComparisonOperator xgetComparison() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComparisonOperator target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComparisonOperator)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * Sets the "comparison" element
     */
    @Override
    public void setComparison(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComparisonOperator.Enum comparison) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setEnumValue(comparison);
        }
    }

    /**
     * Sets (as xml) the "comparison" element
     */
    @Override
    public void xsetComparison(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComparisonOperator comparison) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComparisonOperator target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComparisonOperator)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ComparisonOperator)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(comparison);
        }
    }

    /**
     * Gets the "correspondence" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceDefinition getCorrespondence() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceDefinition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceDefinition)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "correspondence" element
     */
    @Override
    public void setCorrespondence(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceDefinition correspondence) {
        generatedSetterHelperImpl(correspondence, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "correspondence" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceDefinition addNewCorrespondence() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceDefinition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceDefinition)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
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
     * Gets the "setValue" element
     */
    @Override
    public java.lang.String getSetValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "setValue" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetSetValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return target;
        }
    }

    /**
     * Sets the "setValue" element
     */
    @Override
    public void setSetValue(java.lang.String setValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[3]);
            }
            target.setStringValue(setValue);
        }
    }

    /**
     * Sets (as xml) the "setValue" element
     */
    @Override
    public void xsetSetValue(org.apache.xmlbeans.XmlString setValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[3]);
            }
            target.set(setValue);
        }
    }

    /**
     * Gets a List of "InstanceVariableMap_hasTarget_InstanceVariable" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasTargetInstanceVariable> getInstanceVariableMapHasTargetInstanceVariableList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getInstanceVariableMapHasTargetInstanceVariableArray,
                this::setInstanceVariableMapHasTargetInstanceVariableArray,
                this::insertNewInstanceVariableMapHasTargetInstanceVariable,
                this::removeInstanceVariableMapHasTargetInstanceVariable,
                this::sizeOfInstanceVariableMapHasTargetInstanceVariableArray
            );
        }
    }

    /**
     * Gets array of all "InstanceVariableMap_hasTarget_InstanceVariable" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasTargetInstanceVariable[] getInstanceVariableMapHasTargetInstanceVariableArray() {
        return getXmlObjectArray(PROPERTY_QNAME[4], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasTargetInstanceVariable[0]);
    }

    /**
     * Gets ith "InstanceVariableMap_hasTarget_InstanceVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasTargetInstanceVariable getInstanceVariableMapHasTargetInstanceVariableArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasTargetInstanceVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasTargetInstanceVariable)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "InstanceVariableMap_hasTarget_InstanceVariable" element
     */
    @Override
    public int sizeOfInstanceVariableMapHasTargetInstanceVariableArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets array of all "InstanceVariableMap_hasTarget_InstanceVariable" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setInstanceVariableMapHasTargetInstanceVariableArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasTargetInstanceVariable[] instanceVariableMapHasTargetInstanceVariableArray) {
        check_orphaned();
        arraySetterHelper(instanceVariableMapHasTargetInstanceVariableArray, PROPERTY_QNAME[4]);
    }

    /**
     * Sets ith "InstanceVariableMap_hasTarget_InstanceVariable" element
     */
    @Override
    public void setInstanceVariableMapHasTargetInstanceVariableArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasTargetInstanceVariable instanceVariableMapHasTargetInstanceVariable) {
        generatedSetterHelperImpl(instanceVariableMapHasTargetInstanceVariable, PROPERTY_QNAME[4], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "InstanceVariableMap_hasTarget_InstanceVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasTargetInstanceVariable insertNewInstanceVariableMapHasTargetInstanceVariable(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasTargetInstanceVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasTargetInstanceVariable)get_store().insert_element_user(PROPERTY_QNAME[4], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "InstanceVariableMap_hasTarget_InstanceVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasTargetInstanceVariable addNewInstanceVariableMapHasTargetInstanceVariable() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasTargetInstanceVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasTargetInstanceVariable)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Removes the ith "InstanceVariableMap_hasTarget_InstanceVariable" element
     */
    @Override
    public void removeInstanceVariableMapHasTargetInstanceVariable(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], i);
        }
    }

    /**
     * Gets a List of "InstanceVariableMap_hasSource_InstanceVariable" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasSourceInstanceVariable> getInstanceVariableMapHasSourceInstanceVariableList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getInstanceVariableMapHasSourceInstanceVariableArray,
                this::setInstanceVariableMapHasSourceInstanceVariableArray,
                this::insertNewInstanceVariableMapHasSourceInstanceVariable,
                this::removeInstanceVariableMapHasSourceInstanceVariable,
                this::sizeOfInstanceVariableMapHasSourceInstanceVariableArray
            );
        }
    }

    /**
     * Gets array of all "InstanceVariableMap_hasSource_InstanceVariable" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasSourceInstanceVariable[] getInstanceVariableMapHasSourceInstanceVariableArray() {
        return getXmlObjectArray(PROPERTY_QNAME[5], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasSourceInstanceVariable[0]);
    }

    /**
     * Gets ith "InstanceVariableMap_hasSource_InstanceVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasSourceInstanceVariable getInstanceVariableMapHasSourceInstanceVariableArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasSourceInstanceVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasSourceInstanceVariable)get_store().find_element_user(PROPERTY_QNAME[5], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "InstanceVariableMap_hasSource_InstanceVariable" element
     */
    @Override
    public int sizeOfInstanceVariableMapHasSourceInstanceVariableArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Sets array of all "InstanceVariableMap_hasSource_InstanceVariable" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setInstanceVariableMapHasSourceInstanceVariableArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasSourceInstanceVariable[] instanceVariableMapHasSourceInstanceVariableArray) {
        check_orphaned();
        arraySetterHelper(instanceVariableMapHasSourceInstanceVariableArray, PROPERTY_QNAME[5]);
    }

    /**
     * Sets ith "InstanceVariableMap_hasSource_InstanceVariable" element
     */
    @Override
    public void setInstanceVariableMapHasSourceInstanceVariableArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasSourceInstanceVariable instanceVariableMapHasSourceInstanceVariable) {
        generatedSetterHelperImpl(instanceVariableMapHasSourceInstanceVariable, PROPERTY_QNAME[5], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "InstanceVariableMap_hasSource_InstanceVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasSourceInstanceVariable insertNewInstanceVariableMapHasSourceInstanceVariable(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasSourceInstanceVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasSourceInstanceVariable)get_store().insert_element_user(PROPERTY_QNAME[5], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "InstanceVariableMap_hasSource_InstanceVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasSourceInstanceVariable addNewInstanceVariableMapHasSourceInstanceVariable() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasSourceInstanceVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasSourceInstanceVariable)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Removes the ith "InstanceVariableMap_hasSource_InstanceVariable" element
     */
    @Override
    public void removeInstanceVariableMapHasSourceInstanceVariable(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], i);
        }
    }
    /**
     * An XML InstanceVariableMap_hasTarget_InstanceVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class InstanceVariableMapHasTargetInstanceVariableImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasTargetInstanceVariable {
        private static final long serialVersionUID = 1L;

        public InstanceVariableMapHasTargetInstanceVariableImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap$InstanceVariableMapHasTargetInstanceVariable$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasTargetInstanceVariable.ValidType {
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
     * An XML InstanceVariableMap_hasSource_InstanceVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class InstanceVariableMapHasSourceInstanceVariableImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasSourceInstanceVariable {
        private static final long serialVersionUID = 1L;

        public InstanceVariableMapHasSourceInstanceVariableImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap$InstanceVariableMapHasSourceInstanceVariable$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.InstanceVariableMap.InstanceVariableMapHasSourceInstanceVariable.ValidType {
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
