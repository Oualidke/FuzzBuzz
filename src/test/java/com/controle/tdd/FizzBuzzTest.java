package com.controle.tdd;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    void retourne_1_pour_1() {
        // Test d'un cas simple
        assertThat(FizzBuzz.de(1)).isEqualTo("1");
    }

    @Test
    void de_retourne_2_pour_2() {
        String result = FizzBuzz.de(2);
        assertThat(result).isEqualTo("2");
    }

    @Test
    void de_retourne_fizz_pour_3() {
        String result = FizzBuzz.de(3);
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    void de_retourne_buzz_pour_5() {
        String result = FizzBuzz.de(5);
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    void de_retourne_fizzbuzz_pour_15() {
        String result = FizzBuzz.de(15);
        assertThat(result).isEqualTo("FizzBuzz");
    }

    @Test
    void de_retourne_fizzbuzz_pour_30() {
        String result = FizzBuzz.de(30);
        assertThat(result).isEqualTo("FizzBuzz");
    }


}

