/*
 * XML Type:  Datum
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML Datum(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class DatumImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum {
    private static final long serialVersionUID = 1L;

    public DatumImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "catalogDetails"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Datum_uses_Notation"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Datum_denotes_ConceptualValue"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Datum_uses_InstanceValue"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Datum_isBoundedBy_InstanceVariable"),
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
     * Gets the "identifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier getIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier)get_store().find_element_user(PROPERTY_QNAME[1], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "identifier" element
     */
    @Override
    public void setIdentifier(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier identifier) {
        generatedSetterHelperImpl(identifier, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "identifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier addNewIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier)get_store().add_element_user(PROPERTY_QNAME[1]);
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
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "Datum_uses_Notation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesNotation getDatumUsesNotation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesNotation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesNotation)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "Datum_uses_Notation" element
     */
    @Override
    public boolean isSetDatumUsesNotation() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "Datum_uses_Notation" element
     */
    @Override
    public void setDatumUsesNotation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesNotation datumUsesNotation) {
        generatedSetterHelperImpl(datumUsesNotation, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Datum_uses_Notation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesNotation addNewDatumUsesNotation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesNotation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesNotation)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "Datum_uses_Notation" element
     */
    @Override
    public void unsetDatumUsesNotation() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "Datum_denotes_ConceptualValue" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumDenotesConceptualValue getDatumDenotesConceptualValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumDenotesConceptualValue target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumDenotesConceptualValue)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Datum_denotes_ConceptualValue" element
     */
    @Override
    public void setDatumDenotesConceptualValue(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumDenotesConceptualValue datumDenotesConceptualValue) {
        generatedSetterHelperImpl(datumDenotesConceptualValue, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Datum_denotes_ConceptualValue" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumDenotesConceptualValue addNewDatumDenotesConceptualValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumDenotesConceptualValue target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumDenotesConceptualValue)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Gets a List of "Datum_uses_InstanceValue" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesInstanceValue> getDatumUsesInstanceValueList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDatumUsesInstanceValueArray,
                this::setDatumUsesInstanceValueArray,
                this::insertNewDatumUsesInstanceValue,
                this::removeDatumUsesInstanceValue,
                this::sizeOfDatumUsesInstanceValueArray
            );
        }
    }

    /**
     * Gets array of all "Datum_uses_InstanceValue" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesInstanceValue[] getDatumUsesInstanceValueArray() {
        return getXmlObjectArray(PROPERTY_QNAME[4], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesInstanceValue[0]);
    }

    /**
     * Gets ith "Datum_uses_InstanceValue" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesInstanceValue getDatumUsesInstanceValueArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesInstanceValue target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesInstanceValue)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Datum_uses_InstanceValue" element
     */
    @Override
    public int sizeOfDatumUsesInstanceValueArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets array of all "Datum_uses_InstanceValue" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDatumUsesInstanceValueArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesInstanceValue[] datumUsesInstanceValueArray) {
        check_orphaned();
        arraySetterHelper(datumUsesInstanceValueArray, PROPERTY_QNAME[4]);
    }

    /**
     * Sets ith "Datum_uses_InstanceValue" element
     */
    @Override
    public void setDatumUsesInstanceValueArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesInstanceValue datumUsesInstanceValue) {
        generatedSetterHelperImpl(datumUsesInstanceValue, PROPERTY_QNAME[4], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Datum_uses_InstanceValue" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesInstanceValue insertNewDatumUsesInstanceValue(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesInstanceValue target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesInstanceValue)get_store().insert_element_user(PROPERTY_QNAME[4], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Datum_uses_InstanceValue" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesInstanceValue addNewDatumUsesInstanceValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesInstanceValue target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesInstanceValue)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Removes the ith "Datum_uses_InstanceValue" element
     */
    @Override
    public void removeDatumUsesInstanceValue(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], i);
        }
    }

    /**
     * Gets a List of "Datum_isBoundedBy_InstanceVariable" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumIsBoundedByInstanceVariable> getDatumIsBoundedByInstanceVariableList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getDatumIsBoundedByInstanceVariableArray,
                this::setDatumIsBoundedByInstanceVariableArray,
                this::insertNewDatumIsBoundedByInstanceVariable,
                this::removeDatumIsBoundedByInstanceVariable,
                this::sizeOfDatumIsBoundedByInstanceVariableArray
            );
        }
    }

    /**
     * Gets array of all "Datum_isBoundedBy_InstanceVariable" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumIsBoundedByInstanceVariable[] getDatumIsBoundedByInstanceVariableArray() {
        return getXmlObjectArray(PROPERTY_QNAME[5], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumIsBoundedByInstanceVariable[0]);
    }

    /**
     * Gets ith "Datum_isBoundedBy_InstanceVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumIsBoundedByInstanceVariable getDatumIsBoundedByInstanceVariableArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumIsBoundedByInstanceVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumIsBoundedByInstanceVariable)get_store().find_element_user(PROPERTY_QNAME[5], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Datum_isBoundedBy_InstanceVariable" element
     */
    @Override
    public int sizeOfDatumIsBoundedByInstanceVariableArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Sets array of all "Datum_isBoundedBy_InstanceVariable" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setDatumIsBoundedByInstanceVariableArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumIsBoundedByInstanceVariable[] datumIsBoundedByInstanceVariableArray) {
        check_orphaned();
        arraySetterHelper(datumIsBoundedByInstanceVariableArray, PROPERTY_QNAME[5]);
    }

    /**
     * Sets ith "Datum_isBoundedBy_InstanceVariable" element
     */
    @Override
    public void setDatumIsBoundedByInstanceVariableArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumIsBoundedByInstanceVariable datumIsBoundedByInstanceVariable) {
        generatedSetterHelperImpl(datumIsBoundedByInstanceVariable, PROPERTY_QNAME[5], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Datum_isBoundedBy_InstanceVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumIsBoundedByInstanceVariable insertNewDatumIsBoundedByInstanceVariable(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumIsBoundedByInstanceVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumIsBoundedByInstanceVariable)get_store().insert_element_user(PROPERTY_QNAME[5], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Datum_isBoundedBy_InstanceVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumIsBoundedByInstanceVariable addNewDatumIsBoundedByInstanceVariable() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumIsBoundedByInstanceVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumIsBoundedByInstanceVariable)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Removes the ith "Datum_isBoundedBy_InstanceVariable" element
     */
    @Override
    public void removeDatumIsBoundedByInstanceVariable(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], i);
        }
    }
    /**
     * An XML Datum_uses_Notation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class DatumUsesNotationImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesNotation {
        private static final long serialVersionUID = 1L;

        public DatumUsesNotationImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum$DatumUsesNotation$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesNotation.ValidType {
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
     * An XML Datum_denotes_ConceptualValue(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class DatumDenotesConceptualValueImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumDenotesConceptualValue {
        private static final long serialVersionUID = 1L;

        public DatumDenotesConceptualValueImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum$DatumDenotesConceptualValue$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumDenotesConceptualValue.ValidType {
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
     * An XML Datum_uses_InstanceValue(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class DatumUsesInstanceValueImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesInstanceValue {
        private static final long serialVersionUID = 1L;

        public DatumUsesInstanceValueImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum$DatumUsesInstanceValue$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumUsesInstanceValue.ValidType {
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
     * An XML Datum_isBoundedBy_InstanceVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class DatumIsBoundedByInstanceVariableImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumIsBoundedByInstanceVariable {
        private static final long serialVersionUID = 1L;

        public DatumIsBoundedByInstanceVariableImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum$DatumIsBoundedByInstanceVariable$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.Datum.DatumIsBoundedByInstanceVariable.ValidType {
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
