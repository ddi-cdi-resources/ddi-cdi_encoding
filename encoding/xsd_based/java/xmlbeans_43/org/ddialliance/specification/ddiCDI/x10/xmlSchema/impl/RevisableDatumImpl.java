/*
 * XML Type:  RevisableDatum
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML RevisableDatum(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class RevisableDatumImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.DatumImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum {
    private static final long serialVersionUID = 1L;

    public RevisableDatumImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "vintage"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "RevisableDatum_correspondsTo_Revision"),
    };


    /**
     * Gets the "vintage" element
     */
    @Override
    public java.math.BigInteger getVintage() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) the "vintage" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger xgetVintage() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * Sets the "vintage" element
     */
    @Override
    public void setVintage(java.math.BigInteger vintage) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setBigIntegerValue(vintage);
        }
    }

    /**
     * Sets (as xml) the "vintage" element
     */
    @Override
    public void xsetVintage(org.apache.xmlbeans.XmlInteger vintage) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(vintage);
        }
    }

    /**
     * Gets the "RevisableDatum_correspondsTo_Revision" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum.RevisableDatumCorrespondsToRevision getRevisableDatumCorrespondsToRevision() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum.RevisableDatumCorrespondsToRevision target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum.RevisableDatumCorrespondsToRevision)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "RevisableDatum_correspondsTo_Revision" element
     */
    @Override
    public boolean isSetRevisableDatumCorrespondsToRevision() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "RevisableDatum_correspondsTo_Revision" element
     */
    @Override
    public void setRevisableDatumCorrespondsToRevision(org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum.RevisableDatumCorrespondsToRevision revisableDatumCorrespondsToRevision) {
        generatedSetterHelperImpl(revisableDatumCorrespondsToRevision, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "RevisableDatum_correspondsTo_Revision" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum.RevisableDatumCorrespondsToRevision addNewRevisableDatumCorrespondsToRevision() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum.RevisableDatumCorrespondsToRevision target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum.RevisableDatumCorrespondsToRevision)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "RevisableDatum_correspondsTo_Revision" element
     */
    @Override
    public void unsetRevisableDatumCorrespondsToRevision() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }
    /**
     * An XML RevisableDatum_correspondsTo_Revision(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class RevisableDatumCorrespondsToRevisionImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.AssociationReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum.RevisableDatumCorrespondsToRevision {
        private static final long serialVersionUID = 1L;

        public RevisableDatumCorrespondsToRevisionImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum$RevisableDatumCorrespondsToRevision$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.RevisableDatum.RevisableDatumCorrespondsToRevision.ValidType {
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
