/*
 * An XML document type.
 * Localname: SubstantiveConceptualDomain
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomainDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one SubstantiveConceptualDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class SubstantiveConceptualDomainDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomainDocument {
    private static final long serialVersionUID = 1L;

    public SubstantiveConceptualDomainDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "SubstantiveConceptualDomain"),
    };


    /**
     * Gets the "SubstantiveConceptualDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomain getSubstantiveConceptualDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomain)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "SubstantiveConceptualDomain" element
     */
    @Override
    public void setSubstantiveConceptualDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomain substantiveConceptualDomain) {
        generatedSetterHelperImpl(substantiveConceptualDomain, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "SubstantiveConceptualDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomain addNewSubstantiveConceptualDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveConceptualDomain)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
