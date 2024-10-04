/*
 * XML Type:  Identifier
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Identifier(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface Identifier extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "identifier15c7type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ddiIdentifier" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier getDdiIdentifier();

    /**
     * True if has "ddiIdentifier" element
     */
    boolean isSetDdiIdentifier();

    /**
     * Sets the "ddiIdentifier" element
     */
    void setDdiIdentifier(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier ddiIdentifier);

    /**
     * Appends and returns a new empty "ddiIdentifier" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalRegistrationDataIdentifier addNewDdiIdentifier();

    /**
     * Unsets the "ddiIdentifier" element
     */
    void unsetDdiIdentifier();

    /**
     * Gets the "isDdiIdentifierPersistent" element
     */
    boolean getIsDdiIdentifierPersistent();

    /**
     * Gets (as xml) the "isDdiIdentifierPersistent" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsDdiIdentifierPersistent();

    /**
     * True if has "isDdiIdentifierPersistent" element
     */
    boolean isSetIsDdiIdentifierPersistent();

    /**
     * Sets the "isDdiIdentifierPersistent" element
     */
    void setIsDdiIdentifierPersistent(boolean isDdiIdentifierPersistent);

    /**
     * Sets (as xml) the "isDdiIdentifierPersistent" element
     */
    void xsetIsDdiIdentifierPersistent(org.apache.xmlbeans.XmlBoolean isDdiIdentifierPersistent);

    /**
     * Unsets the "isDdiIdentifierPersistent" element
     */
    void unsetIsDdiIdentifierPersistent();

    /**
     * Gets the "isDdiIdentifierUniversallyUnique" element
     */
    boolean getIsDdiIdentifierUniversallyUnique();

    /**
     * Gets (as xml) the "isDdiIdentifierUniversallyUnique" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsDdiIdentifierUniversallyUnique();

    /**
     * True if has "isDdiIdentifierUniversallyUnique" element
     */
    boolean isSetIsDdiIdentifierUniversallyUnique();

    /**
     * Sets the "isDdiIdentifierUniversallyUnique" element
     */
    void setIsDdiIdentifierUniversallyUnique(boolean isDdiIdentifierUniversallyUnique);

    /**
     * Sets (as xml) the "isDdiIdentifierUniversallyUnique" element
     */
    void xsetIsDdiIdentifierUniversallyUnique(org.apache.xmlbeans.XmlBoolean isDdiIdentifierUniversallyUnique);

    /**
     * Unsets the "isDdiIdentifierUniversallyUnique" element
     */
    void unsetIsDdiIdentifierUniversallyUnique();

    /**
     * Gets a List of "nonDdiIdentifier" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier> getNonDdiIdentifierList();

    /**
     * Gets array of all "nonDdiIdentifier" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier[] getNonDdiIdentifierArray();

    /**
     * Gets ith "nonDdiIdentifier" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier getNonDdiIdentifierArray(int i);

    /**
     * Returns number of "nonDdiIdentifier" element
     */
    int sizeOfNonDdiIdentifierArray();

    /**
     * Sets array of all "nonDdiIdentifier" element
     */
    void setNonDdiIdentifierArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier[] nonDdiIdentifierArray);

    /**
     * Sets ith "nonDdiIdentifier" element
     */
    void setNonDdiIdentifierArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier nonDdiIdentifier);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "nonDdiIdentifier" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier insertNewNonDdiIdentifier(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "nonDdiIdentifier" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonDdiIdentifier addNewNonDdiIdentifier();

    /**
     * Removes the ith "nonDdiIdentifier" element
     */
    void removeNonDdiIdentifier(int i);

    /**
     * Gets the "uri" element
     */
    java.lang.String getUri();

    /**
     * Gets (as xml) the "uri" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetUri();

    /**
     * True if has "uri" element
     */
    boolean isSetUri();

    /**
     * Sets the "uri" element
     */
    void setUri(java.lang.String uri);

    /**
     * Sets (as xml) the "uri" element
     */
    void xsetUri(org.apache.xmlbeans.XmlAnyURI uri);

    /**
     * Unsets the "uri" element
     */
    void unsetUri();

    /**
     * Gets the "versionDate" element
     */
    java.util.Calendar getVersionDate();

    /**
     * Gets (as xml) the "versionDate" element
     */
    org.apache.xmlbeans.XmlDate xgetVersionDate();

    /**
     * True if has "versionDate" element
     */
    boolean isSetVersionDate();

    /**
     * Sets the "versionDate" element
     */
    void setVersionDate(java.util.Calendar versionDate);

    /**
     * Sets (as xml) the "versionDate" element
     */
    void xsetVersionDate(org.apache.xmlbeans.XmlDate versionDate);

    /**
     * Unsets the "versionDate" element
     */
    void unsetVersionDate();

    /**
     * Gets the "versionRationale" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RationaleDefinition getVersionRationale();

    /**
     * True if has "versionRationale" element
     */
    boolean isSetVersionRationale();

    /**
     * Sets the "versionRationale" element
     */
    void setVersionRationale(org.ddialliance.specification.ddiCDI.x10.xmlSchema.RationaleDefinition versionRationale);

    /**
     * Appends and returns a new empty "versionRationale" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RationaleDefinition addNewVersionRationale();

    /**
     * Unsets the "versionRationale" element
     */
    void unsetVersionRationale();

    /**
     * Gets the "versionResponsibility" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole getVersionResponsibility();

    /**
     * True if has "versionResponsibility" element
     */
    boolean isSetVersionResponsibility();

    /**
     * Sets the "versionResponsibility" element
     */
    void setVersionResponsibility(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole versionResponsibility);

    /**
     * Appends and returns a new empty "versionResponsibility" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.AgentInRole addNewVersionResponsibility();

    /**
     * Unsets the "versionResponsibility" element
     */
    void unsetVersionResponsibility();
}
