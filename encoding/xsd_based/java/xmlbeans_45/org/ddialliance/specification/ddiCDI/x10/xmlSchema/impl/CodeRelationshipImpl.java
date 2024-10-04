/*
 * XML Type:  CodeRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CodeRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class CodeRelationshipImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship {
    private static final long serialVersionUID = 1L;

    public CodeRelationshipImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "semantics"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "CodeRelationship_hasTarget_Code"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "CodeRelationship_hasSource_Code"),
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
     * Gets a List of "CodeRelationship_hasTarget_Code" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasTargetCode> getCodeRelationshipHasTargetCodeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCodeRelationshipHasTargetCodeArray,
                this::setCodeRelationshipHasTargetCodeArray,
                this::insertNewCodeRelationshipHasTargetCode,
                this::removeCodeRelationshipHasTargetCode,
                this::sizeOfCodeRelationshipHasTargetCodeArray
            );
        }
    }

    /**
     * Gets array of all "CodeRelationship_hasTarget_Code" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasTargetCode[] getCodeRelationshipHasTargetCodeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasTargetCode[0]);
    }

    /**
     * Gets ith "CodeRelationship_hasTarget_Code" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasTargetCode getCodeRelationshipHasTargetCodeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasTargetCode target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasTargetCode)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "CodeRelationship_hasTarget_Code" element
     */
    @Override
    public int sizeOfCodeRelationshipHasTargetCodeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "CodeRelationship_hasTarget_Code" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCodeRelationshipHasTargetCodeArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasTargetCode[] codeRelationshipHasTargetCodeArray) {
        check_orphaned();
        arraySetterHelper(codeRelationshipHasTargetCodeArray, PROPERTY_QNAME[2]);
    }

    /**
     * Sets ith "CodeRelationship_hasTarget_Code" element
     */
    @Override
    public void setCodeRelationshipHasTargetCodeArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasTargetCode codeRelationshipHasTargetCode) {
        generatedSetterHelperImpl(codeRelationshipHasTargetCode, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CodeRelationship_hasTarget_Code" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasTargetCode insertNewCodeRelationshipHasTargetCode(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasTargetCode target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasTargetCode)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "CodeRelationship_hasTarget_Code" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasTargetCode addNewCodeRelationshipHasTargetCode() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasTargetCode target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasTargetCode)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "CodeRelationship_hasTarget_Code" element
     */
    @Override
    public void removeCodeRelationshipHasTargetCode(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "CodeRelationship_hasSource_Code" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasSourceCode> getCodeRelationshipHasSourceCodeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCodeRelationshipHasSourceCodeArray,
                this::setCodeRelationshipHasSourceCodeArray,
                this::insertNewCodeRelationshipHasSourceCode,
                this::removeCodeRelationshipHasSourceCode,
                this::sizeOfCodeRelationshipHasSourceCodeArray
            );
        }
    }

    /**
     * Gets array of all "CodeRelationship_hasSource_Code" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasSourceCode[] getCodeRelationshipHasSourceCodeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasSourceCode[0]);
    }

    /**
     * Gets ith "CodeRelationship_hasSource_Code" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasSourceCode getCodeRelationshipHasSourceCodeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasSourceCode target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasSourceCode)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "CodeRelationship_hasSource_Code" element
     */
    @Override
    public int sizeOfCodeRelationshipHasSourceCodeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets array of all "CodeRelationship_hasSource_Code" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCodeRelationshipHasSourceCodeArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasSourceCode[] codeRelationshipHasSourceCodeArray) {
        check_orphaned();
        arraySetterHelper(codeRelationshipHasSourceCodeArray, PROPERTY_QNAME[3]);
    }

    /**
     * Sets ith "CodeRelationship_hasSource_Code" element
     */
    @Override
    public void setCodeRelationshipHasSourceCodeArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasSourceCode codeRelationshipHasSourceCode) {
        generatedSetterHelperImpl(codeRelationshipHasSourceCode, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CodeRelationship_hasSource_Code" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasSourceCode insertNewCodeRelationshipHasSourceCode(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasSourceCode target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasSourceCode)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "CodeRelationship_hasSource_Code" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasSourceCode addNewCodeRelationshipHasSourceCode() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasSourceCode target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasSourceCode)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "CodeRelationship_hasSource_Code" element
     */
    @Override
    public void removeCodeRelationshipHasSourceCode(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }
    /**
     * An XML CodeRelationship_hasTarget_Code(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class CodeRelationshipHasTargetCodeImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasTargetCode {
        private static final long serialVersionUID = 1L;

        public CodeRelationshipHasTargetCodeImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship$CodeRelationshipHasTargetCode$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasTargetCode.ValidType {
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
     * An XML CodeRelationship_hasSource_Code(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class CodeRelationshipHasSourceCodeImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasSourceCode {
        private static final long serialVersionUID = 1L;

        public CodeRelationshipHasSourceCodeImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship$CodeRelationshipHasSourceCode$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.CodeRelationship.CodeRelationshipHasSourceCode.ValidType {
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
