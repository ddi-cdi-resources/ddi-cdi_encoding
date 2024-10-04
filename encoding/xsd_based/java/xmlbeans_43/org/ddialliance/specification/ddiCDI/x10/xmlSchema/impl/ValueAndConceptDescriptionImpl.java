/*
 * XML Type:  ValueAndConceptDescription
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ValueAndConceptDescription(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public class ValueAndConceptDescriptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ValueAndConceptDescription {
    private static final long serialVersionUID = 1L;

    public ValueAndConceptDescriptionImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "classificationLevel"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "description"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "formatPattern"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "identifier"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "logicalExpression"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "maximumValueExclusive"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "maximumValueInclusive"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "minimumValueExclusive"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "minimumValueInclusive"),
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "regularExpression"),
    };


    /**
     * Gets the "classificationLevel" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationCode.Enum getClassificationLevel() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationCode.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "classificationLevel" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationCode xgetClassificationLevel() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationCode target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationCode)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * True if has "classificationLevel" element
     */
    @Override
    public boolean isSetClassificationLevel() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "classificationLevel" element
     */
    @Override
    public void setClassificationLevel(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationCode.Enum classificationLevel) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setEnumValue(classificationLevel);
        }
    }

    /**
     * Sets (as xml) the "classificationLevel" element
     */
    @Override
    public void xsetClassificationLevel(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationCode classificationLevel) {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationCode target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationCode)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CategoryRelationCode)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(classificationLevel);
        }
    }

    /**
     * Unsets the "classificationLevel" element
     */
    @Override
    public void unsetClassificationLevel() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "description" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getDescription() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "description" element
     */
    @Override
    public boolean isSetDescription() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "description" element
     */
    @Override
    public void setDescription(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString description) {
        generatedSetterHelperImpl(description, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "description" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewDescription() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "description" element
     */
    @Override
    public void unsetDescription() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "formatPattern" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getFormatPattern() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "formatPattern" element
     */
    @Override
    public boolean isSetFormatPattern() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "formatPattern" element
     */
    @Override
    public void setFormatPattern(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry formatPattern) {
        generatedSetterHelperImpl(formatPattern, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "formatPattern" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewFormatPattern() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "formatPattern" element
     */
    @Override
    public void unsetFormatPattern() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
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
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier)get_store().find_element_user(PROPERTY_QNAME[3], 0);
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
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "identifier" element
     */
    @Override
    public void setIdentifier(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier identifier) {
        generatedSetterHelperImpl(identifier, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "identifier" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier addNewIdentifier() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Identifier)get_store().add_element_user(PROPERTY_QNAME[3]);
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
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "logicalExpression" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getLogicalExpression() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "logicalExpression" element
     */
    @Override
    public boolean isSetLogicalExpression() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "logicalExpression" element
     */
    @Override
    public void setLogicalExpression(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry logicalExpression) {
        generatedSetterHelperImpl(logicalExpression, PROPERTY_QNAME[4], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "logicalExpression" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewLogicalExpression() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Unsets the "logicalExpression" element
     */
    @Override
    public void unsetLogicalExpression() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }

    /**
     * Gets the "maximumValueExclusive" element
     */
    @Override
    public java.lang.String getMaximumValueExclusive() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "maximumValueExclusive" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetMaximumValueExclusive() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return target;
        }
    }

    /**
     * True if has "maximumValueExclusive" element
     */
    @Override
    public boolean isSetMaximumValueExclusive() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]) != 0;
        }
    }

    /**
     * Sets the "maximumValueExclusive" element
     */
    @Override
    public void setMaximumValueExclusive(java.lang.String maximumValueExclusive) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[5]);
            }
            target.setStringValue(maximumValueExclusive);
        }
    }

    /**
     * Sets (as xml) the "maximumValueExclusive" element
     */
    @Override
    public void xsetMaximumValueExclusive(org.apache.xmlbeans.XmlString maximumValueExclusive) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[5]);
            }
            target.set(maximumValueExclusive);
        }
    }

    /**
     * Unsets the "maximumValueExclusive" element
     */
    @Override
    public void unsetMaximumValueExclusive() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], 0);
        }
    }

    /**
     * Gets the "maximumValueInclusive" element
     */
    @Override
    public java.lang.String getMaximumValueInclusive() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "maximumValueInclusive" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetMaximumValueInclusive() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            return target;
        }
    }

    /**
     * True if has "maximumValueInclusive" element
     */
    @Override
    public boolean isSetMaximumValueInclusive() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]) != 0;
        }
    }

    /**
     * Sets the "maximumValueInclusive" element
     */
    @Override
    public void setMaximumValueInclusive(java.lang.String maximumValueInclusive) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[6]);
            }
            target.setStringValue(maximumValueInclusive);
        }
    }

    /**
     * Sets (as xml) the "maximumValueInclusive" element
     */
    @Override
    public void xsetMaximumValueInclusive(org.apache.xmlbeans.XmlString maximumValueInclusive) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[6]);
            }
            target.set(maximumValueInclusive);
        }
    }

    /**
     * Unsets the "maximumValueInclusive" element
     */
    @Override
    public void unsetMaximumValueInclusive() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], 0);
        }
    }

    /**
     * Gets the "minimumValueExclusive" element
     */
    @Override
    public java.lang.String getMinimumValueExclusive() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "minimumValueExclusive" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetMinimumValueExclusive() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            return target;
        }
    }

    /**
     * True if has "minimumValueExclusive" element
     */
    @Override
    public boolean isSetMinimumValueExclusive() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[7]) != 0;
        }
    }

    /**
     * Sets the "minimumValueExclusive" element
     */
    @Override
    public void setMinimumValueExclusive(java.lang.String minimumValueExclusive) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[7]);
            }
            target.setStringValue(minimumValueExclusive);
        }
    }

    /**
     * Sets (as xml) the "minimumValueExclusive" element
     */
    @Override
    public void xsetMinimumValueExclusive(org.apache.xmlbeans.XmlString minimumValueExclusive) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[7]);
            }
            target.set(minimumValueExclusive);
        }
    }

    /**
     * Unsets the "minimumValueExclusive" element
     */
    @Override
    public void unsetMinimumValueExclusive() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[7], 0);
        }
    }

    /**
     * Gets the "minimumValueInclusive" element
     */
    @Override
    public java.lang.String getMinimumValueInclusive() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[8], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "minimumValueInclusive" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetMinimumValueInclusive() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[8], 0);
            return target;
        }
    }

    /**
     * True if has "minimumValueInclusive" element
     */
    @Override
    public boolean isSetMinimumValueInclusive() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[8]) != 0;
        }
    }

    /**
     * Sets the "minimumValueInclusive" element
     */
    @Override
    public void setMinimumValueInclusive(java.lang.String minimumValueInclusive) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[8], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[8]);
            }
            target.setStringValue(minimumValueInclusive);
        }
    }

    /**
     * Sets (as xml) the "minimumValueInclusive" element
     */
    @Override
    public void xsetMinimumValueInclusive(org.apache.xmlbeans.XmlString minimumValueInclusive) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[8], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[8]);
            }
            target.set(minimumValueInclusive);
        }
    }

    /**
     * Unsets the "minimumValueInclusive" element
     */
    @Override
    public void unsetMinimumValueInclusive() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[8], 0);
        }
    }

    /**
     * Gets the "regularExpression" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedString getRegularExpression() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedString)get_store().find_element_user(PROPERTY_QNAME[9], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "regularExpression" element
     */
    @Override
    public boolean isSetRegularExpression() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[9]) != 0;
        }
    }

    /**
     * Sets the "regularExpression" element
     */
    @Override
    public void setRegularExpression(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedString regularExpression) {
        generatedSetterHelperImpl(regularExpression, PROPERTY_QNAME[9], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "regularExpression" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedString addNewRegularExpression() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedString target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TypedString)get_store().add_element_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * Unsets the "regularExpression" element
     */
    @Override
    public void unsetRegularExpression() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[9], 0);
        }
    }
}
