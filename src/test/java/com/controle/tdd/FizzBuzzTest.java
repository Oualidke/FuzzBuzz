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

}

