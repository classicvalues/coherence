/*
 * Copyright (c) 2021, Oracle and/or its affiliates.
 *
 * Licensed under the Universal Permissive License v 1.0 as shown at
 * http://oss.oracle.com/licenses/upl.
 */
package executor.common;

/**
 * Marker interface to use in conjunction with JUnit 4's Category annotation
 * for test grouping.  In this case, when this category is applied, a single
 * Coherence cluster will be started and shared by all tests.
 *
 * @since 21.12
 */
public interface SingleClusterForAllTests
    {
    }
