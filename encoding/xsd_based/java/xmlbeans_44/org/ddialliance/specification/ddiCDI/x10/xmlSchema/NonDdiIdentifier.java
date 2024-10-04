/*
 * XML Type:  NonDdiIdentifier
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML NonDdiIdentifier(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface NonDdiIdentifier extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "nonddiidentifiere403type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "managingAgency" element
     */
    java.lang.String getManagingAgency();

    /**
     * Gets (as xml) the "managingAgency" element
     */
    org.apache.xmlbeans.XmlString xgetManagingAgency();

    /**
     * True if has "managingAgency" element
     */
    boolean isSetManagingAgency();

    /**
     * Sets the "managingAgency" element
     */
    void setManagingAgency(java.lang.String managingAgency);

    /**
     * Sets (as xml) the "managingAgency" element
     */
    void xsetManagingAgency(org.apache.xmlbeans.XmlString managingAgency);

    /**
     * Unsets the "managingAgency" element
     */
    void unsetManagingAgency();

    /**
     * Gets the "type" element
     */
    java.lang.String getType();

    /**
     * Gets (as xml) the "type" element
     */
    org.apache.xmlbeans.XmlString xgetType();

    /**
     * Sets the "type" element
     */
    void setType(java.lang.String type);

    /**
     * Sets (as xml) the "type" element
     */
    void xsetType(org.apache.xmlbeans.XmlString type);

    /**
     * Gets the "value" element
     */
    java.lang.String getValue();

    /**
     * Gets (as xml) the "value" element
     */
    org.apache.xmlbeans.XmlString xgetValue();

    /**
     * Sets the "value" element
     */
    void setValue(java.lang.String value);

    /**
     * Sets (as xml) the "value" element
     */
    void xsetValue(org.apache.xmlbeans.XmlString value);

    /**
     * Gets the "version" element
     */
    java.lang.String getVersion();

    /**
     * Gets (as xml) the "version" element
     */
    org.apache.xmlbeans.XmlString xgetVersion();

    /**
     * True if has "version" element
     */
    boolean isSetVersion();

    /**
     * Sets the "version" element
     */
    void setVersion(java.lang.String version);

    /**
     * Sets (as xml) the "version" element
     */
    void xsetVersion(org.apache.xmlbeans.XmlString version);

    /**
     * Unsets the "version" element
     */
    void unsetVersion();
}
