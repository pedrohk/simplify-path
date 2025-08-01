package com.pedrohk;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testSimplifyPathExample1() {
        Solution solution = new Solution();
        String path = "/home/";
        String expected = "/home";
        assertEquals(expected, solution.simplifyPath(path));
    }

    @Test
    void testSimplifyPathExample2() {
        Solution solution = new Solution();
        String path = "/../";
        String expected = "/";
        assertEquals(expected, solution.simplifyPath(path));
    }

    @Test
    void testSimplifyPathExample3() {
        Solution solution = new Solution();
        String path = "/home//foo/";
        String expected = "/home/foo";
        assertEquals(expected, solution.simplifyPath(path));
    }

    @Test
    void testSimplifyPathComplex() {
        Solution solution = new Solution();
        String path = "/a/./b/../../c/";
        String expected = "/c";
        assertEquals(expected, solution.simplifyPath(path));
    }

    @Test
    void testSimplifyPathWithTrailingDots() {
        Solution solution = new Solution();
        String path = "/a/..//b/c/d/../e/";
        String expected = "/b/c/e";
        assertEquals(expected, solution.simplifyPath(path));
    }

    @Test
    void testSimplifyPathNoChangeNeeded() {
        Solution solution = new Solution();
        String path = "/a/b/c";
        String expected = "/a/b/c";
        assertEquals(expected, solution.simplifyPath(path));
    }

    @Test
    void testSimplifyPathAllDots() {
        Solution solution = new Solution();
        String path = "/...";
        String expected = "/...";
        assertEquals(expected, solution.simplifyPath(path));
    }

    @Test
    void testSimplifyPathAllDotsWithSlash() {
        Solution solution = new Solution();
        String path = "/.../a/b/../c";
        String expected = "/.../a/c";
        assertEquals(expected, solution.simplifyPath(path));
    }

    @Test
    void testSimplifyPathMultipleSlashes() {
        Solution solution = new Solution();
        String path = "///";
        String expected = "/";
        assertEquals(expected, solution.simplifyPath(path));
    }
}