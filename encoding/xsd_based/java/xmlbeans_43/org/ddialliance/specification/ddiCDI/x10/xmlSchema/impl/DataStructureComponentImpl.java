/*
 * XML Type:  DataStructureComponent
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML DataStructureComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class DataStructureComponentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent {
    private static final long serialVersionUID = 1L;

    public DataStructureComponentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "semantic"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "specialization"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DataStructureComponent_isDefinedBy_RepresentedVariable"),
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
     * Gets a List of "semantic" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry> getSemanticList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getSemanticArray,
                this::setSemanticArray,
                this::insertNewSemantic,
                this::removeSemantic,
                this::sizeOfSemanticArray
            );
        }
    }

    /**
     * Gets array of all "semantic" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry[] getSemanticArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry[0]);
    }

    /**
     * Gets ith "semantic" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry getSemanticArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "semantic" element
     */
    @Override
    public int sizeOfSemanticArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "semantic" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setSemanticArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry[] semanticArray) {
        check_orphaned();
        arraySetterHelper(semanticArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "semantic" element
     */
    @Override
    public void setSemanticArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry semantic) {
        generatedSetterHelperImpl(semantic, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "semantic" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry insertNewSemantic(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "semantic" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry addNewSemantic() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PairedControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "semantic" element
     */
    @Override
    public void removeSemantic(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets the "specialization" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpecializationRole getSpecialization() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpecializationRole target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpecializationRole)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "specialization" element
     */
    @Override
    public boolean isSetSpecialization() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "specialization" element
     */
    @Override
    public void setSpecialization(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpecializationRole specialization) {
        generatedSetterHelperImpl(specialization, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "specialization" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpecializationRole addNewSpecialization() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpecializationRole target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpecializationRole)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "specialization" element
     */
    @Override
    public void unsetSpecialization() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "DataStructureComponent_isDefinedBy_RepresentedVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent.DataStructureComponentIsDefinedByRepresentedVariable getDataStructureComponentIsDefinedByRepresentedVariable() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent.DataStructureComponentIsDefinedByRepresentedVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent.DataStructureComponentIsDefinedByRepresentedVariable)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "DataStructureComponent_isDefinedBy_RepresentedVariable" element
     */
    @Override
    public boolean isSetDataStructureComponentIsDefinedByRepresentedVariable() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "DataStructureComponent_isDefinedBy_RepresentedVariable" element
     */
    @Override
    public void setDataStructureComponentIsDefinedByRepresentedVariable(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent.DataStructureComponentIsDefinedByRepresentedVariable dataStructureComponentIsDefinedByRepresentedVariable) {
        generatedSetterHelperImpl(dataStructureComponentIsDefinedByRepresentedVariable, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "DataStructureComponent_isDefinedBy_RepresentedVariable" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent.DataStructureComponentIsDefinedByRepresentedVariable addNewDataStructureComponentIsDefinedByRepresentedVariable() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent.DataStructureComponentIsDefinedByRepresentedVariable target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent.DataStructureComponentIsDefinedByRepresentedVariable)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "DataStructureComponent_isDefinedBy_RepresentedVariable" element
     */
    @Override
    public void unsetDataStructureComponentIsDefinedByRepresentedVariable() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }
    /**
     * An XML DataStructureComponent_isDefinedBy_RepresentedVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class DataStructureComponentIsDefinedByRepresentedVariableImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent.DataStructureComponentIsDefinedByRepresentedVariable {
        private static final long serialVersionUID = 1L;

        public DataStructureComponentIsDefinedByRepresentedVariableImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent$DataStructureComponentIsDefinedByRepresentedVariable$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DataStructureComponent.DataStructureComponentIsDefinedByRepresentedVariable.ValidType {
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
