/*
 * Copyright (c) 2000, 2004, Oracle and/or its affiliates. All rights reserved.
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
package javax.print.attribute.standard;

import javax.print.attribute.Attribute;
import javax.print.attribute.IntegerSyntax;
import javax.print.attribute.PrintServiceAttribute;

/**
 * Class PagesPerMinute is an integer valued printing attribute that indicates
 * the nominal number of pages per minute to the nearest whole number which may
 * be generated by this printer (e.g., simplex, black-and-white). This attribute
 * is informative, not a service guarantee. Generally, it is the value used in
 * the marketing literature to describe the device. A value of 0 indicates a
 * device that takes more than two minutes to process a page.
 * <p>
 * <B>IPP Compatibility:</B> The integer value gives the IPP integer value. The
 * category name returned by <CODE>getName()</CODE> gives the IPP attribute
 * name.
 * <p>
 *
 * @author Alan Kaminsky
 */
public final class PagesPerMinute extends IntegerSyntax
        implements PrintServiceAttribute {

    private static final long serialVersionUID = -6366403993072862015L;

    /**
     * Construct a new pages per minute attribute with the given integer
     * value.
     *
     * @param value Integer value.
     * @throws IllegalArgumentException (Unchecked exception) Thrown if <CODE>value</CODE> is less than 0.
     */
    public PagesPerMinute(int value) {
        super(value, 0, Integer.MAX_VALUE);
    }

    /**
     * Returns whether this pages per minute attribute is equivalent to the
     * passed in object. To be equivalent, all of the following conditions
     * must be true:
     * <OL TYPE=1>
     * <LI>
     * <CODE>object</CODE> is not null.
     * <LI>
     * <CODE>object</CODE> is an instance of class PagesPerMinute.
     * <LI>
     * This pages per minute attribute's value and <CODE>object</CODE>'s
     * value are equal.
     * </OL>
     *
     * @param object Object to compare to.
     * @return True if <CODE>object</CODE> is equivalent to this pages per
     * minute attribute, false otherwise.
     */
    public boolean equals(Object object) {
        return (super.equals(object) &&
                object instanceof PagesPerMinute);
    }

    /**
     * Get the printing attribute class which is to be used as the "category"
     * for this printing attribute value.
     * <p>
     * For class PagesPerMinute, the category is class PagesPerMinute itself.
     *
     * @return Printing attribute class (category), an instance of class
     * {@link java.lang.Class java.lang.Class}.
     */
    public final Class<? extends Attribute> getCategory() {
        return PagesPerMinute.class;
    }

    /**
     * Get the name of the category of which this attribute value is an
     * instance.
     * <p>
     * For class PagesPerMinute, the
     * category name is <CODE>"pages-per-minute"</CODE>.
     *
     * @return Attribute category name.
     */
    public final String getName() {
        return "pages-per-minute";
    }

}
