/*
 * An XML document type.
 * Localname: SubstantiveValueDomain
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomainDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one SubstantiveValueDomain(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class SubstantiveValueDomainDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomainDocument {
    private static final long serialVersionUID = 1L;

    public SubstantiveValueDomainDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "SubstantiveValueDomain"),
    };


    /**
     * Gets the "SubstantiveValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain getSubstantiveValueDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "SubstantiveValueDomain" element
     */
    @Override
    public void setSubstantiveValueDomain(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain substantiveValueDomain) {
        generatedSetterHelperImpl(substantiveValueDomain, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "SubstantiveValueDomain" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain addNewSubstantiveValueDomain() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SubstantiveValueDomain)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
