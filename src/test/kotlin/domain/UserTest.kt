package domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UserTest {
    @Test
    fun `플레이어는 소지한 카드의 합은 8이다`() {
        // given
        val user = User(
            listOf<Card>(
                Card(Card.Shape.CLUBS, Card.Value.FIVE),
                Card(Card.Shape.DIAMONDS, Card.Value.THREE),
            ),
        )

        // when
        val actual = user.calculateCardValueSum()

        // then
        assertThat(actual).isEqualTo(8)
    }

    @Test
    fun `플레이어는 소지한 카드의 합은 10이다`() {
        // given
        val user = User(
            listOf<Card>(
                Card(Card.Shape.CLUBS, Card.Value.FIVE),
                Card(Card.Shape.DIAMONDS, Card.Value.FIVE),
            ),
        )

        // when
        val actual = user.calculateCardValueSum()

        // then
        assertThat(actual).isEqualTo(10)
    }
}