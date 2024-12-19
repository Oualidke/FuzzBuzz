package com.controle.tdd;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    void retourne_1_pour_1() {
        // Test d'un cas simple
        assertThat(FizzBuzz.de(1)).isEqualTo("1");
    }

}

