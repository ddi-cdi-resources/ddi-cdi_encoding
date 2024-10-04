/*
 * XML Type:  SubstantiveValueDomain
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML SubstantiveValueDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class SubstantiveValueDomainImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ValueDomainImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain {
    private static final long serialVersionUID = 1L;

    public SubstantiveValueDomainImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "SubstantiveValueDomain_takesValuesFrom_EnumerationDomain"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "SubstantiveValueDomain_isDescribedBy_ValueAndConceptDescription"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "SubstantiveValueDomain_takesConceptsFrom_SubstantiveConceptualDomain"),
    };


    /**
     * Gets the "SubstantiveValueDomain_takesValuesFrom_EnumerationDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain.SubstantiveValueDomainTakesValuesFromEnumerationDomain getSubstantiveValueDomainTakesValuesFromEnumerationDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain.SubstantiveValueDomainTakesValuesFromEnumerationDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain.SubstantiveValueDomainTakesValuesFromEnumerationDomain)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "SubstantiveValueDomain_takesValuesFrom_EnumerationDomain" element
     */
    @Override
    public boolean isSetSubstantiveValueDomainTakesValuesFromEnumerationDomain() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "SubstantiveValueDomain_takesValuesFrom_EnumerationDomain" element
     */
    @Override
    public void setSubstantiveValueDomainTakesValuesFromEnumerationDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain.SubstantiveValueDomainTakesValuesFromEnumerationDomain substantiveValueDomainTakesValuesFromEnumerationDomain) {
        generatedSetterHelperImpl(substantiveValueDomainTakesValuesFromEnumerationDomain, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "SubstantiveValueDomain_takesValuesFrom_EnumerationDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain.SubstantiveValueDomainTakesValuesFromEnumerationDomain addNewSubstantiveValueDomainTakesValuesFromEnumerationDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain.SubstantiveValueDomainTakesValuesFromEnumerationDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain.SubstantiveValueDomainTakesValuesFromEnumerationDomain)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "SubstantiveValueDomain_takesValuesFrom_EnumerationDomain" element
     */
    @Override
    public void unsetSubstantiveValueDomainTakesValuesFromEnumerationDomain() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "SubstantiveValueDomain_isDescribedBy_ValueAndConceptDescription" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain.SubstantiveValueDomainIsDescribedByValueAndConceptDescription getSubstantiveValueDomainIsDescribedByValueAndConceptDescription() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain.SubstantiveValueDomainIsDescribedByValueAndConceptDescription target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain.SubstantiveValueDomainIsDescribedByValueAndConceptDescription)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "SubstantiveValueDomain_isDescribedBy_ValueAndConceptDescription" element
     */
    @Override
    public boolean isSetSubstantiveValueDomainIsDescribedByValueAndConceptDescription() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "SubstantiveValueDomain_isDescribedBy_ValueAndConceptDescription" element
     */
    @Override
    public void setSubstantiveValueDomainIsDescribedByValueAndConceptDescription(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain.SubstantiveValueDomainIsDescribedByValueAndConceptDescription substantiveValueDomainIsDescribedByValueAndConceptDescription) {
        generatedSetterHelperImpl(substantiveValueDomainIsDescribedByValueAndConceptDescription, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "SubstantiveValueDomain_isDescribedBy_ValueAndConceptDescription" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain.SubstantiveValueDomainIsDescribedByValueAndConceptDescription addNewSubstantiveValueDomainIsDescribedByValueAndConceptDescription() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain.SubstantiveValueDomainIsDescribedByValueAndConceptDescription target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain.SubstantiveValueDomainIsDescribedByValueAndConceptDescription)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "SubstantiveValueDomain_isDescribedBy_ValueAndConceptDescription" element
     */
    @Override
    public void unsetSubstantiveValueDomainIsDescribedByValueAndConceptDescription() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "SubstantiveValueDomain_takesConceptsFrom_SubstantiveConceptualDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain.SubstantiveValueDomainTakesConceptsFromSubstantiveConceptualDomain getSubstantiveValueDomainTakesConceptsFromSubstantiveConceptualDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain.SubstantiveValueDomainTakesConceptsFromSubstantiveConceptualDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain.SubstantiveValueDomainTakesConceptsFromSubstantiveConceptualDomain)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "SubstantiveValueDomain_takesConceptsFrom_SubstantiveConceptualDomain" element
     */
    @Override
    public boolean isSetSubstantiveValueDomainTakesConceptsFromSubstantiveConceptualDomain() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "SubstantiveValueDomain_takesConceptsFrom_SubstantiveConceptualDomain" element
     */
    @Override
    public void setSubstantiveValueDomainTakesConceptsFromSubstantiveConceptualDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain.SubstantiveValueDomainTakesConceptsFromSubstantiveConceptualDomain substantiveValueDomainTakesConceptsFromSubstantiveConceptualDomain) {
        generatedSetterHelperImpl(substantiveValueDomainTakesConceptsFromSubstantiveConceptualDomain, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "SubstantiveValueDomain_takesConceptsFrom_SubstantiveConceptualDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain.SubstantiveValueDomainTakesConceptsFromSubstantiveConceptualDomain addNewSubstantiveValueDomainTakesConceptsFromSubstantiveConceptualDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain.SubstantiveValueDomainTakesConceptsFromSubstantiveConceptualDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain.SubstantiveValueDomainTakesConceptsFromSubstantiveConceptualDomain)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "SubstantiveValueDomain_takesConceptsFrom_SubstantiveConceptualDomain" element
     */
    @Override
    public void unsetSubstantiveValueDomainTakesConceptsFromSubstantiveConceptualDomain() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }
    /**
     * An XML SubstantiveValueDomain_takesValuesFrom_EnumerationDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class SubstantiveValueDomainTakesValuesFromEnumerationDomainImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain.SubstantiveValueDomainTakesValuesFromEnumerationDomain {
        private static final long serialVersionUID = 1L;

        public SubstantiveValueDomainTakesValuesFromEnumerationDomainImpl(org.apache.xmlbeans.SchemaType sType) {
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain$SubstantiveValueDomainTakesValuesFromEnumerationDomain$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain.SubstantiveValueDomainTakesValuesFromEnumerationDomain.ValidType {
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
     * An XML SubstantiveValueDomain_isDescribedBy_ValueAndConceptDescription(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class SubstantiveValueDomainIsDescribedByValueAndConceptDescriptionImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain.SubstantiveValueDomainIsDescribedByValueAndConceptDescription {
        private static final long serialVersionUID = 1L;

        public SubstantiveValueDomainIsDescribedByValueAndConceptDescriptionImpl(org.apache.xmlbeans.SchemaType sType) {
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain$SubstantiveValueDomainIsDescribedByValueAndConceptDescription$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain.SubstantiveValueDomainIsDescribedByValueAndConceptDescription.ValidType {
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
     * An XML SubstantiveValueDomain_takesConceptsFrom_SubstantiveConceptualDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class SubstantiveValueDomainTakesConceptsFromSubstantiveConceptualDomainImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain.SubstantiveValueDomainTakesConceptsFromSubstantiveConceptualDomain {
        private static final long serialVersionUID = 1L;

        public SubstantiveValueDomainTakesConceptsFromSubstantiveConceptualDomainImpl(org.apache.xmlbeans.SchemaType sType) {
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
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain$SubstantiveValueDomainTakesConceptsFromSubstantiveConceptualDomain$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain.SubstantiveValueDomainTakesConceptsFromSubstantiveConceptualDomain.ValidType {
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
