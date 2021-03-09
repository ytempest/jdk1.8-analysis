/*
 * Copyright (c) 2005, 2013, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package javax.xml.bind.annotation;


/**
 * Used by XmlAccessorType to control serialization of fields or
 * properties.
 *
 * @author Sekhar Vajjhala, Sun Microsystems, Inc.
 * @see XmlAccessorType
 * @since JAXB2.0
 */

public enum XmlAccessType {
    /**
     * Every getter/setter pair in a JAXB-bound class will be automatically
     * bound to XML, unless annotated by {@link XmlTransient}.
     * <p>
     * Fields are bound to XML only when they are explicitly annotated
     * by some of the JAXB annotations.
     */
    PROPERTY,
    /**
     * Every non static, non transient field in a JAXB-bound class will be automatically
     * bound to XML, unless annotated by {@link XmlTransient}.
     * <p>
     * Getter/setter pairs are bound to XML only when they are explicitly annotated
     * by some of the JAXB annotations.
     */
    FIELD,
    /**
     * Every public getter/setter pair and every public field will be
     * automatically bound to XML, unless annotated by {@link XmlTransient}.
     * <p>
     * Fields or getter/setter pairs that are private, protected, or
     * defaulted to package-only access are bound to XML only when they are
     * explicitly annotated by the appropriate JAXB annotations.
     */
    PUBLIC_MEMBER,
    /**
     * None of the fields or properties is bound to XML unless they
     * are specifically  annotated with some of the JAXB annotations.
     */
    NONE
}
