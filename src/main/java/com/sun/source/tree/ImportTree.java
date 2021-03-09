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

package com.sun.source.tree;

/**
 * A tree node for an import statement.
 * <p>
 * For example:
 * <pre>
 *   import <em>qualifiedIdentifier</em> ;
 *
 *   static import <em>qualifiedIdentifier</em> ;
 * </pre>
 *
 * @author Peter von der Ah&eacute;
 * @author Jonathan Gibbons
 * @jls section 7.5
 * @since 1.6
 */
@jdk.Exported
public interface ImportTree extends Tree {
    boolean isStatic();

    /**
     * @return a qualified identifier ending in "*" if and only if
     * this is an import-on-demand.
     */
    Tree getQualifiedIdentifier();
}
