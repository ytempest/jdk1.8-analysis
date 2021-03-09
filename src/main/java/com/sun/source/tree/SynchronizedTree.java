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
 * A tree node for a 'synchronized' statement.
 * <p>
 * For example:
 * <pre>
 *   synchronized ( <em>expression</em> )
 *       <em>block</em>
 * </pre>
 *
 * @author Peter von der Ah&eacute;
 * @author Jonathan Gibbons
 * @jls section 14.19
 * @since 1.6
 */
@jdk.Exported
public interface SynchronizedTree extends StatementTree {
    ExpressionTree getExpression();

    BlockTree getBlock();
}
