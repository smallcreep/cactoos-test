/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2018 Yegor Bugayenko
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.cactoos.test;

import org.cactoos.Scalar;

/**
 * Test that match expected value with actual value.
 *
 * @param <T> Type of item
 * @since 0.1
 */
public final class Match<T> extends TestEnvelope {

    /**
     * Ctor.
     * @param actual Actual value
     * @param expectation Value expectation
     */
    public Match(final T actual, final Expectation<T> expectation) {
        this(() -> actual, expectation);
    }

    /**
     * Ctor.
     * @param actual Actual value
     * @param expectation Value expectation
     */
    public Match(final Scalar<T> actual, final Expectation<T> expectation) {
        super(() -> expectation.match(actual.value()));
    }
}
