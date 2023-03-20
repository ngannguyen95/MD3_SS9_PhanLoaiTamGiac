package rikkei.academy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    void triangleClassifier() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "tam giác đều";
        String result = TriangleClassifier.Triangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void triangleClassifier2() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "tam giác cân";
        String result = TriangleClassifier.Triangle(a, b, c);
        assertEquals(expected, result);
    }
    @Test
    void triangleClassifier3() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "tam giác thường";
        String result = TriangleClassifier.Triangle(a, b, c);
        assertEquals(expected, result);
    }
    @Test
    void triangleClassifier4() {
        int a = 0;
        int b = 4;
        int c = 5;
        String expected = "không phải tam giác";
        String result = TriangleClassifier.Triangle(a, b, c);
        assertEquals(expected, result);
    }
}