/*
 * XML Type:  ValueAndConceptDescription
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ValueAndConceptDescription(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface ValueAndConceptDescription extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "valueandconceptdescription4d58type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "classificationLevel" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationCode.Enum getClassificationLevel();

    /**
     * Gets (as xml) the "classificationLevel" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationCode xgetClassificationLevel();

    /**
     * True if has "classificationLevel" element
     */
    boolean isSetClassificationLevel();

    /**
     * Sets the "classificationLevel" element
     */
    void setClassificationLevel(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationCode.Enum classificationLevel);

    /**
     * Sets (as xml) the "classificationLevel" element
     */
    void xsetClassificationLevel(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationCode classificationLevel);

    /**
     * Unsets the "classificationLevel" element
     */
    void unsetClassificationLevel();

    /**
     * Gets the "description" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getDescription();

    /**
     * True if has "description" element
     */
    boolean isSetDescription();

    /**
     * Sets the "description" element
     */
    void setDescription(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString description);

    /**
     * Appends and returns a new empty "description" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewDescription();

    /**
     * Unsets the "description" element
     */
    void unsetDescription();

    /**
     * Gets the "formatPattern" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getFormatPattern();

    /**
     * True if has "formatPattern" element
     */
    boolean isSetFormatPattern();

    /**
     * Sets the "formatPattern" element
     */
    void setFormatPattern(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry formatPattern);

    /**
     * Appends and returns a new empty "formatPattern" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewFormatPattern();

    /**
     * Unsets the "formatPattern" element
     */
    void unsetFormatPattern();

    /**
     * Gets the "identifier" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier getIdentifier();

    /**
     * True if has "identifier" element
     */
    boolean isSetIdentifier();

    /**
     * Sets the "identifier" element
     */
    void setIdentifier(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier identifier);

    /**
     * Appends and returns a new empty "identifier" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier addNewIdentifier();

    /**
     * Unsets the "identifier" element
     */
    void unsetIdentifier();

    /**
     * Gets the "logicalExpression" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getLogicalExpression();

    /**
     * True if has "logicalExpression" element
     */
    boolean isSetLogicalExpression();

    /**
     * Sets the "logicalExpression" element
     */
    void setLogicalExpression(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry logicalExpression);

    /**
     * Appends and returns a new empty "logicalExpression" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewLogicalExpression();

    /**
     * Unsets the "logicalExpression" element
     */
    void unsetLogicalExpression();

    /**
     * Gets the "maximumValueExclusive" element
     */
    java.lang.String getMaximumValueExclusive();

    /**
     * Gets (as xml) the "maximumValueExclusive" element
     */
    org.apache.xmlbeans.XmlString xgetMaximumValueExclusive();

    /**
     * True if has "maximumValueExclusive" element
     */
    boolean isSetMaximumValueExclusive();

    /**
     * Sets the "maximumValueExclusive" element
     */
    void setMaximumValueExclusive(java.lang.String maximumValueExclusive);

    /**
     * Sets (as xml) the "maximumValueExclusive" element
     */
    void xsetMaximumValueExclusive(org.apache.xmlbeans.XmlString maximumValueExclusive);

    /**
     * Unsets the "maximumValueExclusive" element
     */
    void unsetMaximumValueExclusive();

    /**
     * Gets the "maximumValueInclusive" element
     */
    java.lang.String getMaximumValueInclusive();

    /**
     * Gets (as xml) the "maximumValueInclusive" element
     */
    org.apache.xmlbeans.XmlString xgetMaximumValueInclusive();

    /**
     * True if has "maximumValueInclusive" element
     */
    boolean isSetMaximumValueInclusive();

    /**
     * Sets the "maximumValueInclusive" element
     */
    void setMaximumValueInclusive(java.lang.String maximumValueInclusive);

    /**
     * Sets (as xml) the "maximumValueInclusive" element
     */
    void xsetMaximumValueInclusive(org.apache.xmlbeans.XmlString maximumValueInclusive);

    /**
     * Unsets the "maximumValueInclusive" element
     */
    void unsetMaximumValueInclusive();

    /**
     * Gets the "minimumValueExclusive" element
     */
    java.lang.String getMinimumValueExclusive();

    /**
     * Gets (as xml) the "minimumValueExclusive" element
     */
    org.apache.xmlbeans.XmlString xgetMinimumValueExclusive();

    /**
     * True if has "minimumValueExclusive" element
     */
    boolean isSetMinimumValueExclusive();

    /**
     * Sets the "minimumValueExclusive" element
     */
    void setMinimumValueExclusive(java.lang.String minimumValueExclusive);

    /**
     * Sets (as xml) the "minimumValueExclusive" element
     */
    void xsetMinimumValueExclusive(org.apache.xmlbeans.XmlString minimumValueExclusive);

    /**
     * Unsets the "minimumValueExclusive" element
     */
    void unsetMinimumValueExclusive();

    /**
     * Gets the "minimumValueInclusive" element
     */
    java.lang.String getMinimumValueInclusive();

    /**
     * Gets (as xml) the "minimumValueInclusive" element
     */
    org.apache.xmlbeans.XmlString xgetMinimumValueInclusive();

    /**
     * True if has "minimumValueInclusive" element
     */
    boolean isSetMinimumValueInclusive();

    /**
     * Sets the "minimumValueInclusive" element
     */
    void setMinimumValueInclusive(java.lang.String minimumValueInclusive);

    /**
     * Sets (as xml) the "minimumValueInclusive" element
     */
    void xsetMinimumValueInclusive(org.apache.xmlbeans.XmlString minimumValueInclusive);

    /**
     * Unsets the "minimumValueInclusive" element
     */
    void unsetMinimumValueInclusive();

    /**
     * Gets the "regularExpression" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedString getRegularExpression();

    /**
     * True if has "regularExpression" element
     */
    boolean isSetRegularExpression();

    /**
     * Sets the "regularExpression" element
     */
    void setRegularExpression(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedString regularExpression);

    /**
     * Appends and returns a new empty "regularExpression" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedString addNewRegularExpression();

    /**
     * Unsets the "regularExpression" element
     */
    void unsetRegularExpression();
}
