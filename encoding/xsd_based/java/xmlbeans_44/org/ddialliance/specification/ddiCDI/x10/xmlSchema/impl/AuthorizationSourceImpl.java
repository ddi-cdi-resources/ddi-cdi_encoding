/*
 * XML Type:  AuthorizationSource
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML AuthorizationSource(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class AuthorizationSourceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource {
    private static final long serialVersionUID = 1L;

    public AuthorizationSourceImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "authorizationDate"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "catalogDetails"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "legalMandate"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "purpose"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "statementOfAuthorization"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "AuthorizationSource_has_Agent"),
    };


    /**
     * Gets the "authorizationDate" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate getAuthorizationDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "authorizationDate" element
     */
    @Override
    public boolean isSetAuthorizationDate() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "authorizationDate" element
     */
    @Override
    public void setAuthorizationDate(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate authorizationDate) {
        generatedSetterHelperImpl(authorizationDate, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "authorizationDate" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate addNewAuthorizationDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "authorizationDate" element
     */
    @Override
    public void unsetAuthorizationDate() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "catalogDetails" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails getCatalogDetails() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails)get_store().find_element_user(PROPERTY_QNAME[1], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "catalogDetails" element
     */
    @Override
    public void setCatalogDetails(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails catalogDetails) {
        generatedSetterHelperImpl(catalogDetails, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "catalogDetails" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails addNewCatalogDetails() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails)get_store().add_element_user(PROPERTY_QNAME[1]);
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
            get_store().remove_element(PROPERTY_QNAME[1], 0);
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
     * Gets the "legalMandate" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getLegalMandate() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "legalMandate" element
     */
    @Override
    public boolean isSetLegalMandate() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "legalMandate" element
     */
    @Override
    public void setLegalMandate(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString legalMandate) {
        generatedSetterHelperImpl(legalMandate, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "legalMandate" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewLegalMandate() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "legalMandate" element
     */
    @Override
    public void unsetLegalMandate() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "purpose" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getPurpose() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "purpose" element
     */
    @Override
    public boolean isSetPurpose() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "purpose" element
     */
    @Override
    public void setPurpose(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString purpose) {
        generatedSetterHelperImpl(purpose, PROPERTY_QNAME[4], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "purpose" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewPurpose() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Unsets the "purpose" element
     */
    @Override
    public void unsetPurpose() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }

    /**
     * Gets the "statementOfAuthorization" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getStatementOfAuthorization() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "statementOfAuthorization" element
     */
    @Override
    public boolean isSetStatementOfAuthorization() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]) != 0;
        }
    }

    /**
     * Sets the "statementOfAuthorization" element
     */
    @Override
    public void setStatementOfAuthorization(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString statementOfAuthorization) {
        generatedSetterHelperImpl(statementOfAuthorization, PROPERTY_QNAME[5], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "statementOfAuthorization" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewStatementOfAuthorization() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Unsets the "statementOfAuthorization" element
     */
    @Override
    public void unsetStatementOfAuthorization() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], 0);
        }
    }

    /**
     * Gets a List of "AuthorizationSource_has_Agent" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource.AuthorizationSourceHasAgent> getAuthorizationSourceHasAgentList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getAuthorizationSourceHasAgentArray,
                this::setAuthorizationSourceHasAgentArray,
                this::insertNewAuthorizationSourceHasAgent,
                this::removeAuthorizationSourceHasAgent,
                this::sizeOfAuthorizationSourceHasAgentArray
            );
        }
    }

    /**
     * Gets array of all "AuthorizationSource_has_Agent" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource.AuthorizationSourceHasAgent[] getAuthorizationSourceHasAgentArray() {
        return getXmlObjectArray(PROPERTY_QNAME[6], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource.AuthorizationSourceHasAgent[0]);
    }

    /**
     * Gets ith "AuthorizationSource_has_Agent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource.AuthorizationSourceHasAgent getAuthorizationSourceHasAgentArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource.AuthorizationSourceHasAgent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource.AuthorizationSourceHasAgent)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "AuthorizationSource_has_Agent" element
     */
    @Override
    public int sizeOfAuthorizationSourceHasAgentArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Sets array of all "AuthorizationSource_has_Agent" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setAuthorizationSourceHasAgentArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource.AuthorizationSourceHasAgent[] authorizationSourceHasAgentArray) {
        check_orphaned();
        arraySetterHelper(authorizationSourceHasAgentArray, PROPERTY_QNAME[6]);
    }

    /**
     * Sets ith "AuthorizationSource_has_Agent" element
     */
    @Override
    public void setAuthorizationSourceHasAgentArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource.AuthorizationSourceHasAgent authorizationSourceHasAgent) {
        generatedSetterHelperImpl(authorizationSourceHasAgent, PROPERTY_QNAME[6], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AuthorizationSource_has_Agent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource.AuthorizationSourceHasAgent insertNewAuthorizationSourceHasAgent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource.AuthorizationSourceHasAgent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource.AuthorizationSourceHasAgent)get_store().insert_element_user(PROPERTY_QNAME[6], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "AuthorizationSource_has_Agent" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource.AuthorizationSourceHasAgent addNewAuthorizationSourceHasAgent() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource.AuthorizationSourceHasAgent target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource.AuthorizationSourceHasAgent)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Removes the ith "AuthorizationSource_has_Agent" element
     */
    @Override
    public void removeAuthorizationSourceHasAgent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], i);
        }
    }
    /**
     * An XML AuthorizationSource_has_Agent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class AuthorizationSourceHasAgentImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource.AuthorizationSourceHasAgent {
        private static final long serialVersionUID = 1L;

        public AuthorizationSourceHasAgentImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource$AuthorizationSourceHasAgent$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.AuthorizationSource.AuthorizationSourceHasAgent.ValidType {
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
