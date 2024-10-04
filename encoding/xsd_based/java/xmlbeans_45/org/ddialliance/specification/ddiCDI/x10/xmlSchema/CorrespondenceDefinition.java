/*
 * XML Type:  CorrespondenceDefinition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceDefinition
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CorrespondenceDefinition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface CorrespondenceDefinition extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.CorrespondenceDefinition> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "correspondencedefinition8febtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "commonality" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getCommonality();

    /**
     * True if has "commonality" element
     */
    boolean isSetCommonality();

    /**
     * Sets the "commonality" element
     */
    void setCommonality(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString commonality);

    /**
     * Appends and returns a new empty "commonality" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewCommonality();

    /**
     * Unsets the "commonality" element
     */
    void unsetCommonality();

    /**
     * Gets a List of "commonalityCode" elements
     */
    java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry> getCommonalityCodeList();

    /**
     * Gets array of all "commonalityCode" elements
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry[] getCommonalityCodeArray();

    /**
     * Gets ith "commonalityCode" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getCommonalityCodeArray(int i);

    /**
     * Returns number of "commonalityCode" element
     */
    int sizeOfCommonalityCodeArray();

    /**
     * Sets array of all "commonalityCode" element
     */
    void setCommonalityCodeArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry[] commonalityCodeArray);

    /**
     * Sets ith "commonalityCode" element
     */
    void setCommonalityCodeArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry commonalityCode);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "commonalityCode" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry insertNewCommonalityCode(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "commonalityCode" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewCommonalityCode();

    /**
     * Removes the ith "commonalityCode" element
     */
    void removeCommonalityCode(int i);

    /**
     * Gets the "difference" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getDifference();

    /**
     * True if has "difference" element
     */
    boolean isSetDifference();

    /**
     * Sets the "difference" element
     */
    void setDifference(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString difference);

    /**
     * Appends and returns a new empty "difference" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewDifference();

    /**
     * Unsets the "difference" element
     */
    void unsetDifference();

    /**
     * Gets the "matching" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.MatchingCriterion.Enum getMatching();

    /**
     * Gets (as xml) the "matching" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.MatchingCriterion xgetMatching();

    /**
     * True if has "matching" element
     */
    boolean isSetMatching();

    /**
     * Sets the "matching" element
     */
    void setMatching(org.ddialliance.specification.ddiCDI.x10.xmlSchema.MatchingCriterion.Enum matching);

    /**
     * Sets (as xml) the "matching" element
     */
    void xsetMatching(org.ddialliance.specification.ddiCDI.x10.xmlSchema.MatchingCriterion matching);

    /**
     * Unsets the "matching" element
     */
    void unsetMatching();
}
