fun main() {}

fun getCommission(currentAmount: Int, previousAmount: Int = 0, cardType: CardType = CardType.VkPay): Int =
    when (cardType) {
        CardType.Mastercard, CardType.Maestro -> {
            val commissionMultiplier = 0.006
            val additionalCommission = 20_00
            val commissionAmountLimit = 75_000_00
            val wholeMonthAmount = currentAmount + previousAmount
            if (wholeMonthAmount < commissionAmountLimit) 0 else (currentAmount * commissionMultiplier).toInt() + additionalCommission
        }
        CardType.Visa, CardType.Mir -> {
            val commissionMultiplier = 0.0075
            val minCommissionAmount = 35_00
            val commissionFromAmount = (currentAmount * commissionMultiplier).toInt()
            if (commissionFromAmount >= minCommissionAmount) commissionFromAmount else minCommissionAmount
        }
        CardType.VkPay -> 0
    }

enum class CardType {
    Mastercard, Maestro, Visa, Mir, VkPay
}