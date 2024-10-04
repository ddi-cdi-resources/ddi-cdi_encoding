/*
 * XML Type:  PhysicalSegmentLayout
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML PhysicalSegmentLayout(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class PhysicalSegmentLayoutImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout {
    private static final long serialVersionUID = 1L;

    public PhysicalSegmentLayoutImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "allowsDuplicates"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "arrayBase"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "catalogDetails"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "commentPrefix"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "delimiter"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "encoding"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "escapeCharacter"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "hasHeader"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "headerIsCaseSensitive"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "headerRowCount"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "isDelimited"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "isFixedWidth"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "lineTerminator"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "name"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "nullSequence"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "overview"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "purpose"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "quoteCharacter"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "skipBlankRows"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "skipDataColumns"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "skipInitialSpace"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "skipRows"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "tableDirection"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "textDirection"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "treatConsecutiveDelimitersAsOne"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "trim"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "PhysicalSegmentLayout_isDefinedBy_Concept"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "PhysicalSegmentLayout_formats_LogicalRecord"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "PhysicalSegmentLayout_has_ValueMapping"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "PhysicalSegmentLayout_has_ValueMappingPosition"),
    };


    /**
     * Gets the "allowsDuplicates" element
     */
    @Override
    public boolean getAllowsDuplicates() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "allowsDuplicates" element
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetAllowsDuplicates() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * Sets the "allowsDuplicates" element
     */
    @Override
    public void setAllowsDuplicates(boolean allowsDuplicates) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setBooleanValue(allowsDuplicates);
        }
    }

    /**
     * Sets (as xml) the "allowsDuplicates" element
     */
    @Override
    public void xsetAllowsDuplicates(org.apache.xmlbeans.XmlBoolean allowsDuplicates) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(allowsDuplicates);
        }
    }

    /**
     * Gets the "arrayBase" element
     */
    @Override
    public java.math.BigInteger getArrayBase() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) the "arrayBase" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger xgetArrayBase() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * True if has "arrayBase" element
     */
    @Override
    public boolean isSetArrayBase() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "arrayBase" element
     */
    @Override
    public void setArrayBase(java.math.BigInteger arrayBase) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setBigIntegerValue(arrayBase);
        }
    }

    /**
     * Sets (as xml) the "arrayBase" element
     */
    @Override
    public void xsetArrayBase(org.apache.xmlbeans.XmlInteger arrayBase) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(arrayBase);
        }
    }

    /**
     * Unsets the "arrayBase" element
     */
    @Override
    public void unsetArrayBase() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
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
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails)get_store().find_element_user(PROPERTY_QNAME[2], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "catalogDetails" element
     */
    @Override
    public void setCatalogDetails(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails catalogDetails) {
        generatedSetterHelperImpl(catalogDetails, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "catalogDetails" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails addNewCatalogDetails() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CatalogDetails)get_store().add_element_user(PROPERTY_QNAME[2]);
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
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "commentPrefix" element
     */
    @Override
    public java.lang.String getCommentPrefix() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "commentPrefix" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetCommentPrefix() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return target;
        }
    }

    /**
     * True if has "commentPrefix" element
     */
    @Override
    public boolean isSetCommentPrefix() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "commentPrefix" element
     */
    @Override
    public void setCommentPrefix(java.lang.String commentPrefix) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[3]);
            }
            target.setStringValue(commentPrefix);
        }
    }

    /**
     * Sets (as xml) the "commentPrefix" element
     */
    @Override
    public void xsetCommentPrefix(org.apache.xmlbeans.XmlString commentPrefix) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[3]);
            }
            target.set(commentPrefix);
        }
    }

    /**
     * Unsets the "commentPrefix" element
     */
    @Override
    public void unsetCommentPrefix() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "delimiter" element
     */
    @Override
    public java.lang.String getDelimiter() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "delimiter" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetDelimiter() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return target;
        }
    }

    /**
     * True if has "delimiter" element
     */
    @Override
    public boolean isSetDelimiter() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "delimiter" element
     */
    @Override
    public void setDelimiter(java.lang.String delimiter) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[4]);
            }
            target.setStringValue(delimiter);
        }
    }

    /**
     * Sets (as xml) the "delimiter" element
     */
    @Override
    public void xsetDelimiter(org.apache.xmlbeans.XmlString delimiter) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[4]);
            }
            target.set(delimiter);
        }
    }

    /**
     * Unsets the "delimiter" element
     */
    @Override
    public void unsetDelimiter() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }

    /**
     * Gets the "encoding" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getEncoding() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "encoding" element
     */
    @Override
    public boolean isSetEncoding() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]) != 0;
        }
    }

    /**
     * Sets the "encoding" element
     */
    @Override
    public void setEncoding(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry encoding) {
        generatedSetterHelperImpl(encoding, PROPERTY_QNAME[5], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "encoding" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewEncoding() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Unsets the "encoding" element
     */
    @Override
    public void unsetEncoding() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], 0);
        }
    }

    /**
     * Gets the "escapeCharacter" element
     */
    @Override
    public java.lang.String getEscapeCharacter() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "escapeCharacter" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetEscapeCharacter() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            return target;
        }
    }

    /**
     * True if has "escapeCharacter" element
     */
    @Override
    public boolean isSetEscapeCharacter() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]) != 0;
        }
    }

    /**
     * Sets the "escapeCharacter" element
     */
    @Override
    public void setEscapeCharacter(java.lang.String escapeCharacter) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[6]);
            }
            target.setStringValue(escapeCharacter);
        }
    }

    /**
     * Sets (as xml) the "escapeCharacter" element
     */
    @Override
    public void xsetEscapeCharacter(org.apache.xmlbeans.XmlString escapeCharacter) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[6]);
            }
            target.set(escapeCharacter);
        }
    }

    /**
     * Unsets the "escapeCharacter" element
     */
    @Override
    public void unsetEscapeCharacter() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], 0);
        }
    }

    /**
     * Gets the "hasHeader" element
     */
    @Override
    public boolean getHasHeader() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "hasHeader" element
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetHasHeader() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            return target;
        }
    }

    /**
     * True if has "hasHeader" element
     */
    @Override
    public boolean isSetHasHeader() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[7]) != 0;
        }
    }

    /**
     * Sets the "hasHeader" element
     */
    @Override
    public void setHasHeader(boolean hasHeader) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[7]);
            }
            target.setBooleanValue(hasHeader);
        }
    }

    /**
     * Sets (as xml) the "hasHeader" element
     */
    @Override
    public void xsetHasHeader(org.apache.xmlbeans.XmlBoolean hasHeader) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PROPERTY_QNAME[7]);
            }
            target.set(hasHeader);
        }
    }

    /**
     * Unsets the "hasHeader" element
     */
    @Override
    public void unsetHasHeader() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[7], 0);
        }
    }

    /**
     * Gets the "headerIsCaseSensitive" element
     */
    @Override
    public boolean getHeaderIsCaseSensitive() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[8], 0);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "headerIsCaseSensitive" element
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetHeaderIsCaseSensitive() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[8], 0);
            return target;
        }
    }

    /**
     * True if has "headerIsCaseSensitive" element
     */
    @Override
    public boolean isSetHeaderIsCaseSensitive() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[8]) != 0;
        }
    }

    /**
     * Sets the "headerIsCaseSensitive" element
     */
    @Override
    public void setHeaderIsCaseSensitive(boolean headerIsCaseSensitive) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[8], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[8]);
            }
            target.setBooleanValue(headerIsCaseSensitive);
        }
    }

    /**
     * Sets (as xml) the "headerIsCaseSensitive" element
     */
    @Override
    public void xsetHeaderIsCaseSensitive(org.apache.xmlbeans.XmlBoolean headerIsCaseSensitive) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[8], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PROPERTY_QNAME[8]);
            }
            target.set(headerIsCaseSensitive);
        }
    }

    /**
     * Unsets the "headerIsCaseSensitive" element
     */
    @Override
    public void unsetHeaderIsCaseSensitive() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[8], 0);
        }
    }

    /**
     * Gets the "headerRowCount" element
     */
    @Override
    public java.math.BigInteger getHeaderRowCount() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[9], 0);
            return (target == null) ? null : target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) the "headerRowCount" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger xgetHeaderRowCount() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[9], 0);
            return target;
        }
    }

    /**
     * True if has "headerRowCount" element
     */
    @Override
    public boolean isSetHeaderRowCount() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[9]) != 0;
        }
    }

    /**
     * Sets the "headerRowCount" element
     */
    @Override
    public void setHeaderRowCount(java.math.BigInteger headerRowCount) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[9], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[9]);
            }
            target.setBigIntegerValue(headerRowCount);
        }
    }

    /**
     * Sets (as xml) the "headerRowCount" element
     */
    @Override
    public void xsetHeaderRowCount(org.apache.xmlbeans.XmlInteger headerRowCount) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[9], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTY_QNAME[9]);
            }
            target.set(headerRowCount);
        }
    }

    /**
     * Unsets the "headerRowCount" element
     */
    @Override
    public void unsetHeaderRowCount() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[9], 0);
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
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier)get_store().find_element_user(PROPERTY_QNAME[10], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[10]) != 0;
        }
    }

    /**
     * Sets the "identifier" element
     */
    @Override
    public void setIdentifier(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier identifier) {
        generatedSetterHelperImpl(identifier, PROPERTY_QNAME[10], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "identifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier addNewIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier)get_store().add_element_user(PROPERTY_QNAME[10]);
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
            get_store().remove_element(PROPERTY_QNAME[10], 0);
        }
    }

    /**
     * Gets the "isDelimited" element
     */
    @Override
    public boolean getIsDelimited() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[11], 0);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "isDelimited" element
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetIsDelimited() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[11], 0);
            return target;
        }
    }

    /**
     * Sets the "isDelimited" element
     */
    @Override
    public void setIsDelimited(boolean isDelimited) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[11], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[11]);
            }
            target.setBooleanValue(isDelimited);
        }
    }

    /**
     * Sets (as xml) the "isDelimited" element
     */
    @Override
    public void xsetIsDelimited(org.apache.xmlbeans.XmlBoolean isDelimited) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[11], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PROPERTY_QNAME[11]);
            }
            target.set(isDelimited);
        }
    }

    /**
     * Gets the "isFixedWidth" element
     */
    @Override
    public boolean getIsFixedWidth() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[12], 0);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "isFixedWidth" element
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetIsFixedWidth() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[12], 0);
            return target;
        }
    }

    /**
     * Sets the "isFixedWidth" element
     */
    @Override
    public void setIsFixedWidth(boolean isFixedWidth) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[12], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[12]);
            }
            target.setBooleanValue(isFixedWidth);
        }
    }

    /**
     * Sets (as xml) the "isFixedWidth" element
     */
    @Override
    public void xsetIsFixedWidth(org.apache.xmlbeans.XmlBoolean isFixedWidth) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[12], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PROPERTY_QNAME[12]);
            }
            target.set(isFixedWidth);
        }
    }

    /**
     * Gets a List of "lineTerminator" elements
     */
    @Override
    public java.util.List<java.lang.String> getLineTerminatorList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getLineTerminatorArray,
                this::setLineTerminatorArray,
                this::insertLineTerminator,
                this::removeLineTerminator,
                this::sizeOfLineTerminatorArray
            );
        }
    }

    /**
     * Gets array of all "lineTerminator" elements
     */
    @Override
    public java.lang.String[] getLineTerminatorArray() {
        return getObjectArray(PROPERTY_QNAME[13], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "lineTerminator" element
     */
    @Override
    public java.lang.String getLineTerminatorArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[13], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "lineTerminator" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlString> xgetLineTerminatorList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetLineTerminatorArray,
                this::xsetLineTerminatorArray,
                this::insertNewLineTerminator,
                this::removeLineTerminator,
                this::sizeOfLineTerminatorArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "lineTerminator" elements
     */
    @Override
    public org.apache.xmlbeans.XmlString[] xgetLineTerminatorArray() {
        return xgetArray(PROPERTY_QNAME[13], org.apache.xmlbeans.XmlString[]::new);
    }

    /**
     * Gets (as xml) ith "lineTerminator" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetLineTerminatorArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[13], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "lineTerminator" element
     */
    @Override
    public int sizeOfLineTerminatorArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[13]);
        }
    }

    /**
     * Sets array of all "lineTerminator" element
     */
    @Override
    public void setLineTerminatorArray(java.lang.String[] lineTerminatorArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(lineTerminatorArray, PROPERTY_QNAME[13]);
        }
    }

    /**
     * Sets ith "lineTerminator" element
     */
    @Override
    public void setLineTerminatorArray(int i, java.lang.String lineTerminator) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[13], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(lineTerminator);
        }
    }

    /**
     * Sets (as xml) array of all "lineTerminator" element
     */
    @Override
    public void xsetLineTerminatorArray(org.apache.xmlbeans.XmlString[]lineTerminatorArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(lineTerminatorArray, PROPERTY_QNAME[13]);
        }
    }

    /**
     * Sets (as xml) ith "lineTerminator" element
     */
    @Override
    public void xsetLineTerminatorArray(int i, org.apache.xmlbeans.XmlString lineTerminator) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[13], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(lineTerminator);
        }
    }

    /**
     * Inserts the value as the ith "lineTerminator" element
     */
    @Override
    public void insertLineTerminator(int i, java.lang.String lineTerminator) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[13], i);
            target.setStringValue(lineTerminator);
        }
    }

    /**
     * Appends the value as the last "lineTerminator" element
     */
    @Override
    public void addLineTerminator(java.lang.String lineTerminator) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[13]);
            target.setStringValue(lineTerminator);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "lineTerminator" element
     */
    @Override
    public org.apache.xmlbeans.XmlString insertNewLineTerminator(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[13], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "lineTerminator" element
     */
    @Override
    public org.apache.xmlbeans.XmlString addNewLineTerminator() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[13]);
            return target;
        }
    }

    /**
     * Removes the ith "lineTerminator" element
     */
    @Override
    public void removeLineTerminator(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[13], i);
        }
    }

    /**
     * Gets a List of "name" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName> getNameList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getNameArray,
                this::setNameArray,
                this::insertNewName,
                this::removeName,
                this::sizeOfNameArray
            );
        }
    }

    /**
     * Gets array of all "name" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName[] getNameArray() {
        return getXmlObjectArray(PROPERTY_QNAME[14], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName[0]);
    }

    /**
     * Gets ith "name" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName getNameArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName)get_store().find_element_user(PROPERTY_QNAME[14], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "name" element
     */
    @Override
    public int sizeOfNameArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[14]);
        }
    }

    /**
     * Sets array of all "name" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setNameArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName[] nameArray) {
        check_orphaned();
        arraySetterHelper(nameArray, PROPERTY_QNAME[14]);
    }

    /**
     * Sets ith "name" element
     */
    @Override
    public void setNameArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName name) {
        generatedSetterHelperImpl(name, PROPERTY_QNAME[14], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "name" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName insertNewName(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName)get_store().insert_element_user(PROPERTY_QNAME[14], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "name" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName addNewName() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ObjectName)get_store().add_element_user(PROPERTY_QNAME[14]);
            return target;
        }
    }

    /**
     * Removes the ith "name" element
     */
    @Override
    public void removeName(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[14], i);
        }
    }

    /**
     * Gets the "nullSequence" element
     */
    @Override
    public java.lang.String getNullSequence() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[15], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "nullSequence" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetNullSequence() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[15], 0);
            return target;
        }
    }

    /**
     * True if has "nullSequence" element
     */
    @Override
    public boolean isSetNullSequence() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[15]) != 0;
        }
    }

    /**
     * Sets the "nullSequence" element
     */
    @Override
    public void setNullSequence(java.lang.String nullSequence) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[15], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[15]);
            }
            target.setStringValue(nullSequence);
        }
    }

    /**
     * Sets (as xml) the "nullSequence" element
     */
    @Override
    public void xsetNullSequence(org.apache.xmlbeans.XmlString nullSequence) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[15], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[15]);
            }
            target.set(nullSequence);
        }
    }

    /**
     * Unsets the "nullSequence" element
     */
    @Override
    public void unsetNullSequence() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[15], 0);
        }
    }

    /**
     * Gets the "overview" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getOverview() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().find_element_user(PROPERTY_QNAME[16], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "overview" element
     */
    @Override
    public boolean isSetOverview() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[16]) != 0;
        }
    }

    /**
     * Sets the "overview" element
     */
    @Override
    public void setOverview(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString overview) {
        generatedSetterHelperImpl(overview, PROPERTY_QNAME[16], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "overview" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewOverview() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[16]);
            return target;
        }
    }

    /**
     * Unsets the "overview" element
     */
    @Override
    public void unsetOverview() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[16], 0);
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
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().find_element_user(PROPERTY_QNAME[17], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[17]) != 0;
        }
    }

    /**
     * Sets the "purpose" element
     */
    @Override
    public void setPurpose(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString purpose) {
        generatedSetterHelperImpl(purpose, PROPERTY_QNAME[17], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "purpose" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewPurpose() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[17]);
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
            get_store().remove_element(PROPERTY_QNAME[17], 0);
        }
    }

    /**
     * Gets the "quoteCharacter" element
     */
    @Override
    public java.lang.String getQuoteCharacter() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[18], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "quoteCharacter" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetQuoteCharacter() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[18], 0);
            return target;
        }
    }

    /**
     * True if has "quoteCharacter" element
     */
    @Override
    public boolean isSetQuoteCharacter() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[18]) != 0;
        }
    }

    /**
     * Sets the "quoteCharacter" element
     */
    @Override
    public void setQuoteCharacter(java.lang.String quoteCharacter) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[18], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[18]);
            }
            target.setStringValue(quoteCharacter);
        }
    }

    /**
     * Sets (as xml) the "quoteCharacter" element
     */
    @Override
    public void xsetQuoteCharacter(org.apache.xmlbeans.XmlString quoteCharacter) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[18], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[18]);
            }
            target.set(quoteCharacter);
        }
    }

    /**
     * Unsets the "quoteCharacter" element
     */
    @Override
    public void unsetQuoteCharacter() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[18], 0);
        }
    }

    /**
     * Gets the "skipBlankRows" element
     */
    @Override
    public boolean getSkipBlankRows() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[19], 0);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "skipBlankRows" element
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetSkipBlankRows() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[19], 0);
            return target;
        }
    }

    /**
     * True if has "skipBlankRows" element
     */
    @Override
    public boolean isSetSkipBlankRows() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[19]) != 0;
        }
    }

    /**
     * Sets the "skipBlankRows" element
     */
    @Override
    public void setSkipBlankRows(boolean skipBlankRows) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[19], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[19]);
            }
            target.setBooleanValue(skipBlankRows);
        }
    }

    /**
     * Sets (as xml) the "skipBlankRows" element
     */
    @Override
    public void xsetSkipBlankRows(org.apache.xmlbeans.XmlBoolean skipBlankRows) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[19], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PROPERTY_QNAME[19]);
            }
            target.set(skipBlankRows);
        }
    }

    /**
     * Unsets the "skipBlankRows" element
     */
    @Override
    public void unsetSkipBlankRows() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[19], 0);
        }
    }

    /**
     * Gets the "skipDataColumns" element
     */
    @Override
    public java.math.BigInteger getSkipDataColumns() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[20], 0);
            return (target == null) ? null : target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) the "skipDataColumns" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger xgetSkipDataColumns() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[20], 0);
            return target;
        }
    }

    /**
     * True if has "skipDataColumns" element
     */
    @Override
    public boolean isSetSkipDataColumns() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[20]) != 0;
        }
    }

    /**
     * Sets the "skipDataColumns" element
     */
    @Override
    public void setSkipDataColumns(java.math.BigInteger skipDataColumns) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[20], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[20]);
            }
            target.setBigIntegerValue(skipDataColumns);
        }
    }

    /**
     * Sets (as xml) the "skipDataColumns" element
     */
    @Override
    public void xsetSkipDataColumns(org.apache.xmlbeans.XmlInteger skipDataColumns) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[20], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTY_QNAME[20]);
            }
            target.set(skipDataColumns);
        }
    }

    /**
     * Unsets the "skipDataColumns" element
     */
    @Override
    public void unsetSkipDataColumns() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[20], 0);
        }
    }

    /**
     * Gets the "skipInitialSpace" element
     */
    @Override
    public boolean getSkipInitialSpace() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[21], 0);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "skipInitialSpace" element
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetSkipInitialSpace() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[21], 0);
            return target;
        }
    }

    /**
     * True if has "skipInitialSpace" element
     */
    @Override
    public boolean isSetSkipInitialSpace() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[21]) != 0;
        }
    }

    /**
     * Sets the "skipInitialSpace" element
     */
    @Override
    public void setSkipInitialSpace(boolean skipInitialSpace) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[21], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[21]);
            }
            target.setBooleanValue(skipInitialSpace);
        }
    }

    /**
     * Sets (as xml) the "skipInitialSpace" element
     */
    @Override
    public void xsetSkipInitialSpace(org.apache.xmlbeans.XmlBoolean skipInitialSpace) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[21], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PROPERTY_QNAME[21]);
            }
            target.set(skipInitialSpace);
        }
    }

    /**
     * Unsets the "skipInitialSpace" element
     */
    @Override
    public void unsetSkipInitialSpace() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[21], 0);
        }
    }

    /**
     * Gets the "skipRows" element
     */
    @Override
    public java.math.BigInteger getSkipRows() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[22], 0);
            return (target == null) ? null : target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) the "skipRows" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger xgetSkipRows() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[22], 0);
            return target;
        }
    }

    /**
     * True if has "skipRows" element
     */
    @Override
    public boolean isSetSkipRows() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[22]) != 0;
        }
    }

    /**
     * Sets the "skipRows" element
     */
    @Override
    public void setSkipRows(java.math.BigInteger skipRows) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[22], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[22]);
            }
            target.setBigIntegerValue(skipRows);
        }
    }

    /**
     * Sets (as xml) the "skipRows" element
     */
    @Override
    public void xsetSkipRows(org.apache.xmlbeans.XmlInteger skipRows) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[22], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTY_QNAME[22]);
            }
            target.set(skipRows);
        }
    }

    /**
     * Unsets the "skipRows" element
     */
    @Override
    public void unsetSkipRows() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[22], 0);
        }
    }

    /**
     * Gets the "tableDirection" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.TableDirectionValues.Enum getTableDirection() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[23], 0);
            return (target == null) ? null : (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TableDirectionValues.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "tableDirection" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.TableDirectionValues xgetTableDirection() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.TableDirectionValues target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TableDirectionValues)get_store().find_element_user(PROPERTY_QNAME[23], 0);
            return target;
        }
    }

    /**
     * True if has "tableDirection" element
     */
    @Override
    public boolean isSetTableDirection() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[23]) != 0;
        }
    }

    /**
     * Sets the "tableDirection" element
     */
    @Override
    public void setTableDirection(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TableDirectionValues.Enum tableDirection) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[23], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[23]);
            }
            target.setEnumValue(tableDirection);
        }
    }

    /**
     * Sets (as xml) the "tableDirection" element
     */
    @Override
    public void xsetTableDirection(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TableDirectionValues tableDirection) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.TableDirectionValues target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TableDirectionValues)get_store().find_element_user(PROPERTY_QNAME[23], 0);
            if (target == null) {
                target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TableDirectionValues)get_store().add_element_user(PROPERTY_QNAME[23]);
            }
            target.set(tableDirection);
        }
    }

    /**
     * Unsets the "tableDirection" element
     */
    @Override
    public void unsetTableDirection() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[23], 0);
        }
    }

    /**
     * Gets the "textDirection" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.TextDirectionValues.Enum getTextDirection() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[24], 0);
            return (target == null) ? null : (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TextDirectionValues.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "textDirection" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.TextDirectionValues xgetTextDirection() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.TextDirectionValues target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TextDirectionValues)get_store().find_element_user(PROPERTY_QNAME[24], 0);
            return target;
        }
    }

    /**
     * True if has "textDirection" element
     */
    @Override
    public boolean isSetTextDirection() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[24]) != 0;
        }
    }

    /**
     * Sets the "textDirection" element
     */
    @Override
    public void setTextDirection(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TextDirectionValues.Enum textDirection) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[24], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[24]);
            }
            target.setEnumValue(textDirection);
        }
    }

    /**
     * Sets (as xml) the "textDirection" element
     */
    @Override
    public void xsetTextDirection(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TextDirectionValues textDirection) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.TextDirectionValues target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TextDirectionValues)get_store().find_element_user(PROPERTY_QNAME[24], 0);
            if (target == null) {
                target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TextDirectionValues)get_store().add_element_user(PROPERTY_QNAME[24]);
            }
            target.set(textDirection);
        }
    }

    /**
     * Unsets the "textDirection" element
     */
    @Override
    public void unsetTextDirection() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[24], 0);
        }
    }

    /**
     * Gets the "treatConsecutiveDelimitersAsOne" element
     */
    @Override
    public boolean getTreatConsecutiveDelimitersAsOne() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[25], 0);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "treatConsecutiveDelimitersAsOne" element
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetTreatConsecutiveDelimitersAsOne() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[25], 0);
            return target;
        }
    }

    /**
     * True if has "treatConsecutiveDelimitersAsOne" element
     */
    @Override
    public boolean isSetTreatConsecutiveDelimitersAsOne() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[25]) != 0;
        }
    }

    /**
     * Sets the "treatConsecutiveDelimitersAsOne" element
     */
    @Override
    public void setTreatConsecutiveDelimitersAsOne(boolean treatConsecutiveDelimitersAsOne) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[25], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[25]);
            }
            target.setBooleanValue(treatConsecutiveDelimitersAsOne);
        }
    }

    /**
     * Sets (as xml) the "treatConsecutiveDelimitersAsOne" element
     */
    @Override
    public void xsetTreatConsecutiveDelimitersAsOne(org.apache.xmlbeans.XmlBoolean treatConsecutiveDelimitersAsOne) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[25], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PROPERTY_QNAME[25]);
            }
            target.set(treatConsecutiveDelimitersAsOne);
        }
    }

    /**
     * Unsets the "treatConsecutiveDelimitersAsOne" element
     */
    @Override
    public void unsetTreatConsecutiveDelimitersAsOne() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[25], 0);
        }
    }

    /**
     * Gets the "trim" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.TrimValues.Enum getTrim() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[26], 0);
            return (target == null) ? null : (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TrimValues.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "trim" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.TrimValues xgetTrim() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.TrimValues target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TrimValues)get_store().find_element_user(PROPERTY_QNAME[26], 0);
            return target;
        }
    }

    /**
     * True if has "trim" element
     */
    @Override
    public boolean isSetTrim() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[26]) != 0;
        }
    }

    /**
     * Sets the "trim" element
     */
    @Override
    public void setTrim(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TrimValues.Enum trim) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[26], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[26]);
            }
            target.setEnumValue(trim);
        }
    }

    /**
     * Sets (as xml) the "trim" element
     */
    @Override
    public void xsetTrim(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TrimValues trim) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.TrimValues target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TrimValues)get_store().find_element_user(PROPERTY_QNAME[26], 0);
            if (target == null) {
                target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TrimValues)get_store().add_element_user(PROPERTY_QNAME[26]);
            }
            target.set(trim);
        }
    }

    /**
     * Unsets the "trim" element
     */
    @Override
    public void unsetTrim() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[26], 0);
        }
    }

    /**
     * Gets a List of "PhysicalSegmentLayout_isDefinedBy_Concept" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutIsDefinedByConcept> getPhysicalSegmentLayoutIsDefinedByConceptList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getPhysicalSegmentLayoutIsDefinedByConceptArray,
                this::setPhysicalSegmentLayoutIsDefinedByConceptArray,
                this::insertNewPhysicalSegmentLayoutIsDefinedByConcept,
                this::removePhysicalSegmentLayoutIsDefinedByConcept,
                this::sizeOfPhysicalSegmentLayoutIsDefinedByConceptArray
            );
        }
    }

    /**
     * Gets array of all "PhysicalSegmentLayout_isDefinedBy_Concept" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutIsDefinedByConcept[] getPhysicalSegmentLayoutIsDefinedByConceptArray() {
        return getXmlObjectArray(PROPERTY_QNAME[27], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutIsDefinedByConcept[0]);
    }

    /**
     * Gets ith "PhysicalSegmentLayout_isDefinedBy_Concept" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutIsDefinedByConcept getPhysicalSegmentLayoutIsDefinedByConceptArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutIsDefinedByConcept target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutIsDefinedByConcept)get_store().find_element_user(PROPERTY_QNAME[27], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "PhysicalSegmentLayout_isDefinedBy_Concept" element
     */
    @Override
    public int sizeOfPhysicalSegmentLayoutIsDefinedByConceptArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[27]);
        }
    }

    /**
     * Sets array of all "PhysicalSegmentLayout_isDefinedBy_Concept" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setPhysicalSegmentLayoutIsDefinedByConceptArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutIsDefinedByConcept[] physicalSegmentLayoutIsDefinedByConceptArray) {
        check_orphaned();
        arraySetterHelper(physicalSegmentLayoutIsDefinedByConceptArray, PROPERTY_QNAME[27]);
    }

    /**
     * Sets ith "PhysicalSegmentLayout_isDefinedBy_Concept" element
     */
    @Override
    public void setPhysicalSegmentLayoutIsDefinedByConceptArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutIsDefinedByConcept physicalSegmentLayoutIsDefinedByConcept) {
        generatedSetterHelperImpl(physicalSegmentLayoutIsDefinedByConcept, PROPERTY_QNAME[27], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalSegmentLayout_isDefinedBy_Concept" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutIsDefinedByConcept insertNewPhysicalSegmentLayoutIsDefinedByConcept(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutIsDefinedByConcept target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutIsDefinedByConcept)get_store().insert_element_user(PROPERTY_QNAME[27], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalSegmentLayout_isDefinedBy_Concept" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutIsDefinedByConcept addNewPhysicalSegmentLayoutIsDefinedByConcept() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutIsDefinedByConcept target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutIsDefinedByConcept)get_store().add_element_user(PROPERTY_QNAME[27]);
            return target;
        }
    }

    /**
     * Removes the ith "PhysicalSegmentLayout_isDefinedBy_Concept" element
     */
    @Override
    public void removePhysicalSegmentLayoutIsDefinedByConcept(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[27], i);
        }
    }

    /**
     * Gets the "PhysicalSegmentLayout_formats_LogicalRecord" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutFormatsLogicalRecord getPhysicalSegmentLayoutFormatsLogicalRecord() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutFormatsLogicalRecord target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutFormatsLogicalRecord)get_store().find_element_user(PROPERTY_QNAME[28], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "PhysicalSegmentLayout_formats_LogicalRecord" element
     */
    @Override
    public boolean isSetPhysicalSegmentLayoutFormatsLogicalRecord() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[28]) != 0;
        }
    }

    /**
     * Sets the "PhysicalSegmentLayout_formats_LogicalRecord" element
     */
    @Override
    public void setPhysicalSegmentLayoutFormatsLogicalRecord(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutFormatsLogicalRecord physicalSegmentLayoutFormatsLogicalRecord) {
        generatedSetterHelperImpl(physicalSegmentLayoutFormatsLogicalRecord, PROPERTY_QNAME[28], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "PhysicalSegmentLayout_formats_LogicalRecord" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutFormatsLogicalRecord addNewPhysicalSegmentLayoutFormatsLogicalRecord() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutFormatsLogicalRecord target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutFormatsLogicalRecord)get_store().add_element_user(PROPERTY_QNAME[28]);
            return target;
        }
    }

    /**
     * Unsets the "PhysicalSegmentLayout_formats_LogicalRecord" element
     */
    @Override
    public void unsetPhysicalSegmentLayoutFormatsLogicalRecord() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[28], 0);
        }
    }

    /**
     * Gets a List of "PhysicalSegmentLayout_has_ValueMapping" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMapping> getPhysicalSegmentLayoutHasValueMappingList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getPhysicalSegmentLayoutHasValueMappingArray,
                this::setPhysicalSegmentLayoutHasValueMappingArray,
                this::insertNewPhysicalSegmentLayoutHasValueMapping,
                this::removePhysicalSegmentLayoutHasValueMapping,
                this::sizeOfPhysicalSegmentLayoutHasValueMappingArray
            );
        }
    }

    /**
     * Gets array of all "PhysicalSegmentLayout_has_ValueMapping" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMapping[] getPhysicalSegmentLayoutHasValueMappingArray() {
        return getXmlObjectArray(PROPERTY_QNAME[29], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMapping[0]);
    }

    /**
     * Gets ith "PhysicalSegmentLayout_has_ValueMapping" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMapping getPhysicalSegmentLayoutHasValueMappingArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMapping target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMapping)get_store().find_element_user(PROPERTY_QNAME[29], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "PhysicalSegmentLayout_has_ValueMapping" element
     */
    @Override
    public int sizeOfPhysicalSegmentLayoutHasValueMappingArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[29]);
        }
    }

    /**
     * Sets array of all "PhysicalSegmentLayout_has_ValueMapping" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setPhysicalSegmentLayoutHasValueMappingArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMapping[] physicalSegmentLayoutHasValueMappingArray) {
        check_orphaned();
        arraySetterHelper(physicalSegmentLayoutHasValueMappingArray, PROPERTY_QNAME[29]);
    }

    /**
     * Sets ith "PhysicalSegmentLayout_has_ValueMapping" element
     */
    @Override
    public void setPhysicalSegmentLayoutHasValueMappingArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMapping physicalSegmentLayoutHasValueMapping) {
        generatedSetterHelperImpl(physicalSegmentLayoutHasValueMapping, PROPERTY_QNAME[29], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalSegmentLayout_has_ValueMapping" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMapping insertNewPhysicalSegmentLayoutHasValueMapping(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMapping target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMapping)get_store().insert_element_user(PROPERTY_QNAME[29], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalSegmentLayout_has_ValueMapping" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMapping addNewPhysicalSegmentLayoutHasValueMapping() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMapping target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMapping)get_store().add_element_user(PROPERTY_QNAME[29]);
            return target;
        }
    }

    /**
     * Removes the ith "PhysicalSegmentLayout_has_ValueMapping" element
     */
    @Override
    public void removePhysicalSegmentLayoutHasValueMapping(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[29], i);
        }
    }

    /**
     * Gets a List of "PhysicalSegmentLayout_has_ValueMappingPosition" elements
     */
    @Override
    public java.util.List<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMappingPosition> getPhysicalSegmentLayoutHasValueMappingPositionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getPhysicalSegmentLayoutHasValueMappingPositionArray,
                this::setPhysicalSegmentLayoutHasValueMappingPositionArray,
                this::insertNewPhysicalSegmentLayoutHasValueMappingPosition,
                this::removePhysicalSegmentLayoutHasValueMappingPosition,
                this::sizeOfPhysicalSegmentLayoutHasValueMappingPositionArray
            );
        }
    }

    /**
     * Gets array of all "PhysicalSegmentLayout_has_ValueMappingPosition" elements
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMappingPosition[] getPhysicalSegmentLayoutHasValueMappingPositionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[30], new org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMappingPosition[0]);
    }

    /**
     * Gets ith "PhysicalSegmentLayout_has_ValueMappingPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMappingPosition getPhysicalSegmentLayoutHasValueMappingPositionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMappingPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMappingPosition)get_store().find_element_user(PROPERTY_QNAME[30], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "PhysicalSegmentLayout_has_ValueMappingPosition" element
     */
    @Override
    public int sizeOfPhysicalSegmentLayoutHasValueMappingPositionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[30]);
        }
    }

    /**
     * Sets array of all "PhysicalSegmentLayout_has_ValueMappingPosition" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setPhysicalSegmentLayoutHasValueMappingPositionArray(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMappingPosition[] physicalSegmentLayoutHasValueMappingPositionArray) {
        check_orphaned();
        arraySetterHelper(physicalSegmentLayoutHasValueMappingPositionArray, PROPERTY_QNAME[30]);
    }

    /**
     * Sets ith "PhysicalSegmentLayout_has_ValueMappingPosition" element
     */
    @Override
    public void setPhysicalSegmentLayoutHasValueMappingPositionArray(int i, org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMappingPosition physicalSegmentLayoutHasValueMappingPosition) {
        generatedSetterHelperImpl(physicalSegmentLayoutHasValueMappingPosition, PROPERTY_QNAME[30], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalSegmentLayout_has_ValueMappingPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMappingPosition insertNewPhysicalSegmentLayoutHasValueMappingPosition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMappingPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMappingPosition)get_store().insert_element_user(PROPERTY_QNAME[30], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalSegmentLayout_has_ValueMappingPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMappingPosition addNewPhysicalSegmentLayoutHasValueMappingPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMappingPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMappingPosition)get_store().add_element_user(PROPERTY_QNAME[30]);
            return target;
        }
    }

    /**
     * Removes the ith "PhysicalSegmentLayout_has_ValueMappingPosition" element
     */
    @Override
    public void removePhysicalSegmentLayoutHasValueMappingPosition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[30], i);
        }
    }
    /**
     * An XML PhysicalSegmentLayout_isDefinedBy_Concept(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class PhysicalSegmentLayoutIsDefinedByConceptImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutIsDefinedByConcept {
        private static final long serialVersionUID = 1L;

        public PhysicalSegmentLayoutIsDefinedByConceptImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("", "isAssociationReference"),
        };


        /**
         * Gets the "isAssociationReference" attribute
         */
        @Override
        public boolean getIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return (target == null) ? false : target.getBooleanValue();
            }
        }

        /**
         * Gets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public org.apache.xmlbeans.XmlBoolean xgetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return target;
            }
        }

        /**
         * True if has "isAssociationReference" attribute
         */
        @Override
        public boolean isSetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
            }
        }

        /**
         * Sets the "isAssociationReference" attribute
         */
        @Override
        public void setIsAssociationReference(boolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.setBooleanValue(isAssociationReference);
            }
        }

        /**
         * Sets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public void xsetIsAssociationReference(org.apache.xmlbeans.XmlBoolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.set(isAssociationReference);
            }
        }

        /**
         * Unsets the "isAssociationReference" attribute
         */
        @Override
        public void unsetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[0]);
            }
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout$PhysicalSegmentLayoutIsDefinedByConcept$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutIsDefinedByConcept.ValidType {
            private static final long serialVersionUID = 1L;

            public ValidTypeImpl(org.apache.xmlbeans.SchemaType sType) {
                super(sType, false);
            }

            protected ValidTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
                super(sType, b);
            }
        }
    }
    /**
     * An XML PhysicalSegmentLayout_formats_LogicalRecord(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class PhysicalSegmentLayoutFormatsLogicalRecordImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutFormatsLogicalRecord {
        private static final long serialVersionUID = 1L;

        public PhysicalSegmentLayoutFormatsLogicalRecordImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("", "isAssociationReference"),
        };


        /**
         * Gets the "isAssociationReference" attribute
         */
        @Override
        public boolean getIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return (target == null) ? false : target.getBooleanValue();
            }
        }

        /**
         * Gets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public org.apache.xmlbeans.XmlBoolean xgetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return target;
            }
        }

        /**
         * True if has "isAssociationReference" attribute
         */
        @Override
        public boolean isSetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
            }
        }

        /**
         * Sets the "isAssociationReference" attribute
         */
        @Override
        public void setIsAssociationReference(boolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.setBooleanValue(isAssociationReference);
            }
        }

        /**
         * Sets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public void xsetIsAssociationReference(org.apache.xmlbeans.XmlBoolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.set(isAssociationReference);
            }
        }

        /**
         * Unsets the "isAssociationReference" attribute
         */
        @Override
        public void unsetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[0]);
            }
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout$PhysicalSegmentLayoutFormatsLogicalRecord$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutFormatsLogicalRecord.ValidType {
            private static final long serialVersionUID = 1L;

            public ValidTypeImpl(org.apache.xmlbeans.SchemaType sType) {
                super(sType, false);
            }

            protected ValidTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
                super(sType, b);
            }
        }
    }
    /**
     * An XML PhysicalSegmentLayout_has_ValueMapping(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class PhysicalSegmentLayoutHasValueMappingImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMapping {
        private static final long serialVersionUID = 1L;

        public PhysicalSegmentLayoutHasValueMappingImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("", "isAssociationReference"),
        };


        /**
         * Gets the "isAssociationReference" attribute
         */
        @Override
        public boolean getIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return (target == null) ? false : target.getBooleanValue();
            }
        }

        /**
         * Gets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public org.apache.xmlbeans.XmlBoolean xgetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[0]);
                }
                return target;
            }
        }

        /**
         * True if has "isAssociationReference" attribute
         */
        @Override
        public boolean isSetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
            }
        }

        /**
         * Sets the "isAssociationReference" attribute
         */
        @Override
        public void setIsAssociationReference(boolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.setBooleanValue(isAssociationReference);
            }
        }

        /**
         * Sets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public void xsetIsAssociationReference(org.apache.xmlbeans.XmlBoolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                }
                target.set(isAssociationReference);
            }
        }

        /**
         * Unsets the "isAssociationReference" attribute
         */
        @Override
        public void unsetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[0]);
            }
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout$PhysicalSegmentLayoutHasValueMapping$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMapping.ValidType {
            private static final long serialVersionUID = 1L;

            public ValidTypeImpl(org.apache.xmlbeans.SchemaType sType) {
                super(sType, false);
            }

            protected ValidTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
                super(sType, b);
            }
        }
    }
    /**
     * An XML PhysicalSegmentLayout_has_ValueMappingPosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
     *
     * This is a complex type.
     */
    public static class PhysicalSegmentLayoutHasValueMappingPositionImpl extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl.ReferenceImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMappingPosition {
        private static final long serialVersionUID = 1L;

        public PhysicalSegmentLayoutHasValueMappingPositionImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "validType"),
            new QName("", "isAssociationReference"),
        };


        /**
         * Gets a List of "validType" elements
         */
        @Override
        public java.util.List<java.lang.String> getValidTypeList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                    this::getValidTypeArray,
                    this::setValidTypeArray,
                    this::insertValidType,
                    this::removeValidType,
                    this::sizeOfValidTypeArray
                );
            }
        }

        /**
         * Gets array of all "validType" elements
         */
        @Override
        public java.lang.String[] getValidTypeArray() {
            return getObjectArray(PROPERTY_QNAME[0], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
        }

        /**
         * Gets ith "validType" element
         */
        @Override
        public java.lang.String getValidTypeArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) a List of "validType" elements
         */
        @Override
        public java.util.List<org.apache.xmlbeans.XmlString> xgetValidTypeList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                    this::xgetValidTypeArray,
                    this::xsetValidTypeArray,
                    this::insertNewValidType,
                    this::removeValidType,
                    this::sizeOfValidTypeArray
                );
            }
        }

        /**
         * Gets (as xml) array of all "validType" elements
         */
        @Override
        public org.apache.xmlbeans.XmlString[] xgetValidTypeArray() {
            return xgetArray(PROPERTY_QNAME[0], org.apache.xmlbeans.XmlString[]::new);
        }

        /**
         * Gets (as xml) ith "validType" element
         */
        @Override
        public org.apache.xmlbeans.XmlString xgetValidTypeArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "validType" element
         */
        @Override
        public int sizeOfValidTypeArray() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[0]);
            }
        }

        /**
         * Sets array of all "validType" element
         */
        @Override
        public void setValidTypeArray(java.lang.String[] validTypeArray) {
            synchronized (monitor()) {
                check_orphaned();
                arraySetterHelper(validTypeArray, PROPERTY_QNAME[0]);
            }
        }

        /**
         * Sets ith "validType" element
         */
        @Override
        public void setValidTypeArray(int i, java.lang.String validType) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(validType);
            }
        }

        /**
         * Sets (as xml) array of all "validType" element
         */
        @Override
        public void xsetValidTypeArray(org.apache.xmlbeans.XmlString[]validTypeArray) {
            synchronized (monitor()) {
                check_orphaned();
                arraySetterHelper(validTypeArray, PROPERTY_QNAME[0]);
            }
        }

        /**
         * Sets (as xml) ith "validType" element
         */
        @Override
        public void xsetValidTypeArray(int i, org.apache.xmlbeans.XmlString validType) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                target.set(validType);
            }
        }

        /**
         * Inserts the value as the ith "validType" element
         */
        @Override
        public void insertValidType(int i, java.lang.String validType) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target =
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[0], i);
                target.setStringValue(validType);
            }
        }

        /**
         * Appends the value as the last "validType" element
         */
        @Override
        public void addValidType(java.lang.String validType) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
                target.setStringValue(validType);
            }
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "validType" element
         */
        @Override
        public org.apache.xmlbeans.XmlString insertNewValidType(int i) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[0], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "validType" element
         */
        @Override
        public org.apache.xmlbeans.XmlString addNewValidType() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[0]);
                return target;
            }
        }

        /**
         * Removes the ith "validType" element
         */
        @Override
        public void removeValidType(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[0], i);
            }
        }

        /**
         * Gets the "isAssociationReference" attribute
         */
        @Override
        public boolean getIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[1]);
                }
                return (target == null) ? false : target.getBooleanValue();
            }
        }

        /**
         * Gets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public org.apache.xmlbeans.XmlBoolean xgetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[1]);
                }
                return target;
            }
        }

        /**
         * True if has "isAssociationReference" attribute
         */
        @Override
        public boolean isSetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
            }
        }

        /**
         * Sets the "isAssociationReference" attribute
         */
        @Override
        public void setIsAssociationReference(boolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
                }
                target.setBooleanValue(isAssociationReference);
            }
        }

        /**
         * Sets (as xml) the "isAssociationReference" attribute
         */
        @Override
        public void xsetIsAssociationReference(org.apache.xmlbeans.XmlBoolean isAssociationReference) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[1]);
                }
                target.set(isAssociationReference);
            }
        }

        /**
         * Unsets the "isAssociationReference" attribute
         */
        @Override
        public void unsetIsAssociationReference() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[1]);
            }
        }
        /**
         * An XML validType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
         *
         * This is an atomic type that is a restriction of org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout$PhysicalSegmentLayoutHasValueMappingPosition$ValidType.
         */
        public static class ValidTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout.PhysicalSegmentLayoutHasValueMappingPosition.ValidType {
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
