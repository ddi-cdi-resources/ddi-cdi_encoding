/*
 * XML Type:  SentinelValueDomain
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML SentinelValueDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class SentinelValueDomainImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ValueDomainImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain {
    private static final long serialVersionUID = 1L;

    public SentinelValueDomainImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "platformType"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "SentinelValueDomain_takesConceptsFrom_SentinelConceptualDomain"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "SentinelValueDomain_takesValuesFrom_EnumerationDomain"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "SentinelValueDomain_isDescribedBy_ValueAndConceptDescription"),
    };


    /**
     * Gets the "platformType" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getPlatformType() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "platformType" element
     */
    @Override
    public boolean isSetPlatformType() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "platformType" element
     */
    @Override
    public void setPlatformType(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry platformType) {
        generatedSetterHelperImpl(platformType, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "platformType" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewPlatformType() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "platformType" element
     */
    @Override
    public void unsetPlatformType() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "SentinelValueDomain_takesConceptsFrom_SentinelConceptualDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainTakesConceptsFromSentinelConceptualDomain getSentinelValueDomainTakesConceptsFromSentinelConceptualDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainTakesConceptsFromSentinelConceptualDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainTakesConceptsFromSentinelConceptualDomain)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "SentinelValueDomain_takesConceptsFrom_SentinelConceptualDomain" element
     */
    @Override
    public boolean isSetSentinelValueDomainTakesConceptsFromSentinelConceptualDomain() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "SentinelValueDomain_takesConceptsFrom_SentinelConceptualDomain" element
     */
    @Override
    public void setSentinelValueDomainTakesConceptsFromSentinelConceptualDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainTakesConceptsFromSentinelConceptualDomain sentinelValueDomainTakesConceptsFromSentinelConceptualDomain) {
        generatedSetterHelperImpl(sentinelValueDomainTakesConceptsFromSentinelConceptualDomain, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "SentinelValueDomain_takesConceptsFrom_SentinelConceptualDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainTakesConceptsFromSentinelConceptualDomain addNewSentinelValueDomainTakesConceptsFromSentinelConceptualDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainTakesConceptsFromSentinelConceptualDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainTakesConceptsFromSentinelConceptualDomain)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "SentinelValueDomain_takesConceptsFrom_SentinelConceptualDomain" element
     */
    @Override
    public void unsetSentinelValueDomainTakesConceptsFromSentinelConceptualDomain() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "SentinelValueDomain_takesValuesFrom_EnumerationDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainTakesValuesFromEnumerationDomain getSentinelValueDomainTakesValuesFromEnumerationDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainTakesValuesFromEnumerationDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainTakesValuesFromEnumerationDomain)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "SentinelValueDomain_takesValuesFrom_EnumerationDomain" element
     */
    @Override
    public boolean isSetSentinelValueDomainTakesValuesFromEnumerationDomain() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "SentinelValueDomain_takesValuesFrom_EnumerationDomain" element
     */
    @Override
    public void setSentinelValueDomainTakesValuesFromEnumerationDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainTakesValuesFromEnumerationDomain sentinelValueDomainTakesValuesFromEnumerationDomain) {
        generatedSetterHelperImpl(sentinelValueDomainTakesValuesFromEnumerationDomain, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "SentinelValueDomain_takesValuesFrom_EnumerationDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainTakesValuesFromEnumerationDomain addNewSentinelValueDomainTakesValuesFromEnumerationDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainTakesValuesFromEnumerationDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainTakesValuesFromEnumerationDomain)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "SentinelValueDomain_takesValuesFrom_EnumerationDomain" element
     */
    @Override
    public void unsetSentinelValueDomainTakesValuesFromEnumerationDomain() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "SentinelValueDomain_isDescribedBy_ValueAndConceptDescription" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainIsDescribedByValueAndConceptDescription getSentinelValueDomainIsDescribedByValueAndConceptDescription() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainIsDescribedByValueAndConceptDescription target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainIsDescribedByValueAndConceptDescription)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "SentinelValueDomain_isDescribedBy_ValueAndConceptDescription" element
     */
    @Override
    public boolean isSetSentinelValueDomainIsDescribedByValueAndConceptDescription() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "SentinelValueDomain_isDescribedBy_ValueAndConceptDescription" element
     */
    @Override
    public void setSentinelValueDomainIsDescribedByValueAndConceptDescription(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainIsDescribedByValueAndConceptDescription sentinelValueDomainIsDescribedByValueAndConceptDescription) {
        generatedSetterHelperImpl(sentinelValueDomainIsDescribedByValueAndConceptDescription, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "SentinelValueDomain_isDescribedBy_ValueAndConceptDescription" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainIsDescribedByValueAndConceptDescription addNewSentinelValueDomainIsDescribedByValueAndConceptDescription() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainIsDescribedByValueAndConceptDescription target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainIsDescribedByValueAndConceptDescription)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "SentinelValueDomain_isDescribedBy_ValueAndConceptDescription" element
     */
    @Override
    public void unsetSentinelValueDomainIsDescribedByValueAndConceptDescription() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }
    /**
     * An XML SentinelValueDomain_takesConceptsFrom_SentinelConceptualDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class SentinelValueDomainTakesConceptsFromSentinelConceptualDomainImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainTakesConceptsFromSentinelConceptualDomain {
        private static final long serialVersionUID = 1L;

        public SentinelValueDomainTakesConceptsFromSentinelConceptualDomainImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain$SentinelValueDomainTakesConceptsFromSentinelConceptualDomain$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainTakesConceptsFromSentinelConceptualDomain.ValidType {
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
     * An XML SentinelValueDomain_takesValuesFrom_EnumerationDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class SentinelValueDomainTakesValuesFromEnumerationDomainImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainTakesValuesFromEnumerationDomain {
        private static final long serialVersionUID = 1L;

        public SentinelValueDomainTakesValuesFromEnumerationDomainImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain$SentinelValueDomainTakesValuesFromEnumerationDomain$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainTakesValuesFromEnumerationDomain.ValidType {
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
     * An XML SentinelValueDomain_isDescribedBy_ValueAndConceptDescription(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class SentinelValueDomainIsDescribedByValueAndConceptDescriptionImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainIsDescribedByValueAndConceptDescription {
        private static final long serialVersionUID = 1L;

        public SentinelValueDomainIsDescribedByValueAndConceptDescriptionImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain$SentinelValueDomainIsDescribedByValueAndConceptDescription$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.SentinelValueDomain.SentinelValueDomainIsDescribedByValueAndConceptDescription.ValidType {
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
