package project.asm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс тестирования для класса {@link Analyzer}.
 * Этот класс содержит юнит-тесты для проверки корректности работы методов класса Analyzer,
 * отвечающих за подсчет опкодов циклов, условных переходов и объявлений переменных.
 */
public class AnalyzerTest {

    /**
     * Тестирует метод {@link Analyzer#getLoopOpcodesCount()}.
     * Проверяет, что метод возвращает значение, установленное с помощью {@link Analyzer#setLoopOpcodesCount(int)}.
     */
    @Test
    public void testGetLoopOpcodesCount() {
        Analyzer analyzer = new Analyzer();
        analyzer.setLoopOpcodesCount(10);
        assertEquals(10, analyzer.getLoopOpcodesCount());
    }

    /**
     * Тестирует метод {@link Analyzer#getConditionalOpcodesCount()}.
     * Проверяет, что метод возвращает значение, установленное с помощью {@link Analyzer#setConditionalOpcodesCount(int)}.
     */
    @Test
    public void testGetConditionalOpcodesCount() {
        Analyzer analyzer = new Analyzer();
        analyzer.setConditionalOpcodesCount(20);
        assertEquals(20, analyzer.getConditionalOpcodesCount());
    }

    /**
     * Тестирует метод {@link Analyzer#getVariableDeclarationsCount()}.
     * Проверяет, что метод возвращает значение, установленное с помощью {@link Analyzer#setVariableDeclarationsCount(int)}.
     */
    @Test
    public void testGetVariableDeclarationsCount() {
        Analyzer analyzer = new Analyzer();
        analyzer.setVariableDeclarationsCount(30);
        assertEquals(30, analyzer.getVariableDeclarationsCount());
    }
}