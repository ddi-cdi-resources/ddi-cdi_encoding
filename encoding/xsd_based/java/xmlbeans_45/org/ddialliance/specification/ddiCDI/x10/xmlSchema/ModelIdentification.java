/*
 * XML Type:  ModelIdentification
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ModelIdentification
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ModelIdentification(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface ModelIdentification extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ModelIdentification> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "modelidentificationd8a3type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "acronym" element
     */
    java.lang.String getAcronym();

    /**
     * Gets (as xml) the "acronym" element
     */
    org.apache.xmlbeans.XmlString xgetAcronym();

    /**
     * Sets the "acronym" element
     */
    void setAcronym(java.lang.String acronym);

    /**
     * Sets (as xml) the "acronym" element
     */
    void xsetAcronym(org.apache.xmlbeans.XmlString acronym);

    /**
     * Gets the "language" element
     */
    java.lang.String getLanguage();

    /**
     * Gets (as xml) the "language" element
     */
    org.apache.xmlbeans.XmlString xgetLanguage();

    /**
     * Sets the "language" element
     */
    void setLanguage(java.lang.String language);

    /**
     * Sets (as xml) the "language" element
     */
    void xsetLanguage(org.apache.xmlbeans.XmlString language);

    /**
     * Gets the "majorVersion" element
     */
    java.math.BigInteger getMajorVersion();

    /**
     * Gets (as xml) the "majorVersion" element
     */
    org.apache.xmlbeans.XmlInteger xgetMajorVersion();

    /**
     * Sets the "majorVersion" element
     */
    void setMajorVersion(java.math.BigInteger majorVersion);

    /**
     * Sets (as xml) the "majorVersion" element
     */
    void xsetMajorVersion(org.apache.xmlbeans.XmlInteger majorVersion);

    /**
     * Gets the "minorVersion" element
     */
    java.math.BigInteger getMinorVersion();

    /**
     * Gets (as xml) the "minorVersion" element
     */
    org.apache.xmlbeans.XmlInteger xgetMinorVersion();

    /**
     * Sets the "minorVersion" element
     */
    void setMinorVersion(java.math.BigInteger minorVersion);

    /**
     * Sets (as xml) the "minorVersion" element
     */
    void xsetMinorVersion(org.apache.xmlbeans.XmlInteger minorVersion);

    /**
     * Gets the "subtitle" element
     */
    java.lang.String getSubtitle();

    /**
     * Gets (as xml) the "subtitle" element
     */
    org.apache.xmlbeans.XmlString xgetSubtitle();

    /**
     * Sets the "subtitle" element
     */
    void setSubtitle(java.lang.String subtitle);

    /**
     * Sets (as xml) the "subtitle" element
     */
    void xsetSubtitle(org.apache.xmlbeans.XmlString subtitle);

    /**
     * Gets the "title" element
     */
    java.lang.String getTitle();

    /**
     * Gets (as xml) the "title" element
     */
    org.apache.xmlbeans.XmlString xgetTitle();

    /**
     * Sets the "title" element
     */
    void setTitle(java.lang.String title);

    /**
     * Sets (as xml) the "title" element
     */
    void xsetTitle(org.apache.xmlbeans.XmlString title);

    /**
     * Gets the "uri" element
     */
    java.lang.String getUri();

    /**
     * Gets (as xml) the "uri" element
     */
    org.apache.xmlbeans.XmlString xgetUri();

    /**
     * Sets the "uri" element
     */
    void setUri(java.lang.String uri);

    /**
     * Sets (as xml) the "uri" element
     */
    void xsetUri(org.apache.xmlbeans.XmlString uri);
}
