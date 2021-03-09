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

import java.util.List;

/**
 * A tree node for a type expression involving type parameters.
 * <p>
 * For example:
 * <pre>
 *   <em>type</em> &lt; <em>typeArguments</em> &gt;
 * </pre>
 *
 * @author Peter von der Ah&eacute;
 * @author Jonathan Gibbons
 * @jls section 4.5.1
 * @since 1.6
 */
@jdk.Exported
public interface ParameterizedTypeTree extends Tree {
    Tree getType();

    List<? extends Tree> getTypeArguments();
}
