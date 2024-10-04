/*
 * XML Type:  ConceptualValue
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ConceptualValue(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class ConceptualValueImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ConceptImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue {
    private static final long serialVersionUID = 1L;

    public ConceptualValueImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ConceptualValue_hasConceptFrom_ConceptualDomain"),
    };


    /**
     * Gets the "ConceptualValue_hasConceptFrom_ConceptualDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue.ConceptualValueHasConceptFromConceptualDomain getConceptualValueHasConceptFromConceptualDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue.ConceptualValueHasConceptFromConceptualDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue.ConceptualValueHasConceptFromConceptualDomain)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ConceptualValue_hasConceptFrom_ConceptualDomain" element
     */
    @Override
    public void setConceptualValueHasConceptFromConceptualDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue.ConceptualValueHasConceptFromConceptualDomain conceptualValueHasConceptFromConceptualDomain) {
        generatedSetterHelperImpl(conceptualValueHasConceptFromConceptualDomain, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ConceptualValue_hasConceptFrom_ConceptualDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue.ConceptualValueHasConceptFromConceptualDomain addNewConceptualValueHasConceptFromConceptualDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue.ConceptualValueHasConceptFromConceptualDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue.ConceptualValueHasConceptFromConceptualDomain)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
    /**
     * An XML ConceptualValue_hasConceptFrom_ConceptualDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class ConceptualValueHasConceptFromConceptualDomainImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue.ConceptualValueHasConceptFromConceptualDomain {
        private static final long serialVersionUID = 1L;

        public ConceptualValueHasConceptFromConceptualDomainImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue$ConceptualValueHasConceptFromConceptualDomain$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptualValue.ConceptualValueHasConceptFromConceptualDomain.ValidType {
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
