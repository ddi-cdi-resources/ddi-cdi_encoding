/*
 * XML Type:  ConceptualVariable
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ConceptualVariable(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class ConceptualVariableImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ConceptImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable {
    private static final long serialVersionUID = 1L;

    public ConceptualVariableImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "descriptiveText"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "unitOfMeasureKind"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ConceptualVariable_takesSentinelConceptsFrom_SentinelConceptualDomain"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ConceptualVariable_takesSubstantiveConceptsFrom_SubstantiveConceptualDomain"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ConceptualVariable_measures_UnitType"),
    };


    /**
     * Gets the "descriptiveText" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getDescriptiveText() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "descriptiveText" element
     */
    @Override
    public boolean isSetDescriptiveText() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "descriptiveText" element
     */
    @Override
    public void setDescriptiveText(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString descriptiveText) {
        generatedSetterHelperImpl(descriptiveText, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "descriptiveText" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewDescriptiveText() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "descriptiveText" element
     */
    @Override
    public void unsetDescriptiveText() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "unitOfMeasureKind" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getUnitOfMeasureKind() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "unitOfMeasureKind" element
     */
    @Override
    public boolean isSetUnitOfMeasureKind() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "unitOfMeasureKind" element
     */
    @Override
    public void setUnitOfMeasureKind(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry unitOfMeasureKind) {
        generatedSetterHelperImpl(unitOfMeasureKind, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "unitOfMeasureKind" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewUnitOfMeasureKind() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "unitOfMeasureKind" element
     */
    @Override
    public void unsetUnitOfMeasureKind() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "ConceptualVariable_takesSentinelConceptsFrom_SentinelConceptualDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableTakesSentinelConceptsFromSentinelConceptualDomain getConceptualVariableTakesSentinelConceptsFromSentinelConceptualDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableTakesSentinelConceptsFromSentinelConceptualDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableTakesSentinelConceptsFromSentinelConceptualDomain)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "ConceptualVariable_takesSentinelConceptsFrom_SentinelConceptualDomain" element
     */
    @Override
    public boolean isSetConceptualVariableTakesSentinelConceptsFromSentinelConceptualDomain() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "ConceptualVariable_takesSentinelConceptsFrom_SentinelConceptualDomain" element
     */
    @Override
    public void setConceptualVariableTakesSentinelConceptsFromSentinelConceptualDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableTakesSentinelConceptsFromSentinelConceptualDomain conceptualVariableTakesSentinelConceptsFromSentinelConceptualDomain) {
        generatedSetterHelperImpl(conceptualVariableTakesSentinelConceptsFromSentinelConceptualDomain, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ConceptualVariable_takesSentinelConceptsFrom_SentinelConceptualDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableTakesSentinelConceptsFromSentinelConceptualDomain addNewConceptualVariableTakesSentinelConceptsFromSentinelConceptualDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableTakesSentinelConceptsFromSentinelConceptualDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableTakesSentinelConceptsFromSentinelConceptualDomain)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "ConceptualVariable_takesSentinelConceptsFrom_SentinelConceptualDomain" element
     */
    @Override
    public void unsetConceptualVariableTakesSentinelConceptsFromSentinelConceptualDomain() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "ConceptualVariable_takesSubstantiveConceptsFrom_SubstantiveConceptualDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableTakesSubstantiveConceptsFromSubstantiveConceptualDomain getConceptualVariableTakesSubstantiveConceptsFromSubstantiveConceptualDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableTakesSubstantiveConceptsFromSubstantiveConceptualDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableTakesSubstantiveConceptsFromSubstantiveConceptualDomain)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "ConceptualVariable_takesSubstantiveConceptsFrom_SubstantiveConceptualDomain" element
     */
    @Override
    public boolean isSetConceptualVariableTakesSubstantiveConceptsFromSubstantiveConceptualDomain() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "ConceptualVariable_takesSubstantiveConceptsFrom_SubstantiveConceptualDomain" element
     */
    @Override
    public void setConceptualVariableTakesSubstantiveConceptsFromSubstantiveConceptualDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableTakesSubstantiveConceptsFromSubstantiveConceptualDomain conceptualVariableTakesSubstantiveConceptsFromSubstantiveConceptualDomain) {
        generatedSetterHelperImpl(conceptualVariableTakesSubstantiveConceptsFromSubstantiveConceptualDomain, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ConceptualVariable_takesSubstantiveConceptsFrom_SubstantiveConceptualDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableTakesSubstantiveConceptsFromSubstantiveConceptualDomain addNewConceptualVariableTakesSubstantiveConceptsFromSubstantiveConceptualDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableTakesSubstantiveConceptsFromSubstantiveConceptualDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableTakesSubstantiveConceptsFromSubstantiveConceptualDomain)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "ConceptualVariable_takesSubstantiveConceptsFrom_SubstantiveConceptualDomain" element
     */
    @Override
    public void unsetConceptualVariableTakesSubstantiveConceptsFromSubstantiveConceptualDomain() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "ConceptualVariable_measures_UnitType" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableMeasuresUnitType getConceptualVariableMeasuresUnitType() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableMeasuresUnitType target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableMeasuresUnitType)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "ConceptualVariable_measures_UnitType" element
     */
    @Override
    public boolean isSetConceptualVariableMeasuresUnitType() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "ConceptualVariable_measures_UnitType" element
     */
    @Override
    public void setConceptualVariableMeasuresUnitType(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableMeasuresUnitType conceptualVariableMeasuresUnitType) {
        generatedSetterHelperImpl(conceptualVariableMeasuresUnitType, PROPERTY_QNAME[4], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ConceptualVariable_measures_UnitType" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableMeasuresUnitType addNewConceptualVariableMeasuresUnitType() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableMeasuresUnitType target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableMeasuresUnitType)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Unsets the "ConceptualVariable_measures_UnitType" element
     */
    @Override
    public void unsetConceptualVariableMeasuresUnitType() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }
    /**
     * An XML ConceptualVariable_takesSentinelConceptsFrom_SentinelConceptualDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ConceptualVariableTakesSentinelConceptsFromSentinelConceptualDomainImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableTakesSentinelConceptsFromSentinelConceptualDomain {
        private static final long serialVersionUID = 1L;

        public ConceptualVariableTakesSentinelConceptsFromSentinelConceptualDomainImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable$ConceptualVariableTakesSentinelConceptsFromSentinelConceptualDomain$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableTakesSentinelConceptsFromSentinelConceptualDomain.ValidType {
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
     * An XML ConceptualVariable_takesSubstantiveConceptsFrom_SubstantiveConceptualDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ConceptualVariableTakesSubstantiveConceptsFromSubstantiveConceptualDomainImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableTakesSubstantiveConceptsFromSubstantiveConceptualDomain {
        private static final long serialVersionUID = 1L;

        public ConceptualVariableTakesSubstantiveConceptsFromSubstantiveConceptualDomainImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable$ConceptualVariableTakesSubstantiveConceptsFromSubstantiveConceptualDomain$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableTakesSubstantiveConceptsFromSubstantiveConceptualDomain.ValidType {
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
     * An XML ConceptualVariable_measures_UnitType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ConceptualVariableMeasuresUnitTypeImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableMeasuresUnitType {
        private static final long serialVersionUID = 1L;

        public ConceptualVariableMeasuresUnitTypeImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable$ConceptualVariableMeasuresUnitType$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualVariable.ConceptualVariableMeasuresUnitType.ValidType {
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
