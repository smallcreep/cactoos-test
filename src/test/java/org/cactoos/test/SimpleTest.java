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

import org.cactoos.test.matchers.EqualTo;

/**
 * Simple test.
 *
 * @since 0.1
 */
@SuppressWarnings({
    "PMD.TestClassWithoutTestCases",
    "PMD.UseUtilityClass"})
public final class SimpleTest extends TestEnvelope {

    /**
     * Ctor.
     * @checkstyle MagicNumberCheck (8 lines)
     * @checkstyle WhitespaceAroundCheck (7 lines)
     */
    private SimpleTest() {
        super(
            new TestSuite(
                new Match<>(
                    2*2,
                    new EqualTo<>(4)
                )
            )
        );
    }

    /**
     * Main function. Run all tests.
     * @param args Arguments
     * @throws Exception if any exception
     */
    public static void main(final String... args) throws Exception {
        new SimpleTest().test();
    }
}