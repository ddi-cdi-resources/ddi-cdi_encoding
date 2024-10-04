/*
 * XML Type:  StructureSpecification
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureSpecification
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML StructureSpecification(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface StructureSpecification extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StructureSpecification> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "structurespecification2d6etype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "reflexive" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope.Enum getReflexive();

    /**
     * Gets (as xml) the "reflexive" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope xgetReflexive();

    /**
     * True if has "reflexive" element
     */
    boolean isSetReflexive();

    /**
     * Sets the "reflexive" element
     */
    void setReflexive(org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope.Enum reflexive);

    /**
     * Sets (as xml) the "reflexive" element
     */
    void xsetReflexive(org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope reflexive);

    /**
     * Unsets the "reflexive" element
     */
    void unsetReflexive();

    /**
     * Gets the "symmetric" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope.Enum getSymmetric();

    /**
     * Gets (as xml) the "symmetric" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope xgetSymmetric();

    /**
     * True if has "symmetric" element
     */
    boolean isSetSymmetric();

    /**
     * Sets the "symmetric" element
     */
    void setSymmetric(org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope.Enum symmetric);

    /**
     * Sets (as xml) the "symmetric" element
     */
    void xsetSymmetric(org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope symmetric);

    /**
     * Unsets the "symmetric" element
     */
    void unsetSymmetric();

    /**
     * Gets the "transitive" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope.Enum getTransitive();

    /**
     * Gets (as xml) the "transitive" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope xgetTransitive();

    /**
     * True if has "transitive" element
     */
    boolean isSetTransitive();

    /**
     * Sets the "transitive" element
     */
    void setTransitive(org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope.Enum transitive);

    /**
     * Sets (as xml) the "transitive" element
     */
    void xsetTransitive(org.ddialliance.specification.ddiCDI.x10.xmlSchema.MemberRelationshipScope transitive);

    /**
     * Unsets the "transitive" element
     */
    void unsetTransitive();
}
