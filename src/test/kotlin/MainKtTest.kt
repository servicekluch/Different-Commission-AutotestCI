import org.junit.Test
import org.junit.Assert.*

class MainKtTest {

    @Test
    fun getCommissionMastercard_oneTimeTransfer() {
        val accountMastercard = CardType.Mastercard
        val currentAmount = 25_000_00
        val previousAmount = 25_000_00
        val commissionAmount = 0
        assertEquals(commissionAmount, getCommission(currentAmount, previousAmount, accountMastercard))
    }

    @Test
    fun getCommissionMastercard_summaryMonthAmount() {
        val accountMastercard = CardType.Mastercard
        val currentAmount = 100_000_00
        val previousAmount = 75_000_00
        val commissionAmount = 620_00
        assertEquals(commissionAmount, getCommission(currentAmount, previousAmount, accountMastercard))

    }
    @Test
    fun getCommissionMaestro_oneTimeTransfer() {
        val accountMaestro = CardType.Maestro
        val currentAmount = 25_000_00
        val previousAmount = 25_000_00
        val commissionAmount = 0
        assertEquals(commissionAmount, getCommission(currentAmount, previousAmount, accountMaestro))
    }
    @Test
    fun getCommissionMaestro_summaryMonthAmount() {
        val accountMaestro = CardType.Maestro
        val currentAmount = 100_000_00
        val previousAmount = 75_000_00
        val commissionAmount = 620_00
        assertEquals(commissionAmount, getCommission(currentAmount, previousAmount, accountMaestro))
    }
    @Test
    fun getCommissionVisa_oneTimeTransfer() {
        val accountVisa = CardType.Visa
        val currentAmount = 0
        val previousAmount = 0
        val commissionAmount = 35_00
        assertEquals(commissionAmount, getCommission(currentAmount, previousAmount, accountVisa))
    }
    @Test
    fun getCommissionVisa_summaryMonthAmount() {
        val accountVisa = CardType.Visa
        val currentAmount = 100_000_00
        val previousAmount = 0
        val commissionAmount = 750_00
        assertEquals(commissionAmount, getCommission(currentAmount, previousAmount, accountVisa))
    }
    @Test
    fun getCommissionMir_oneTimeTransfer() {
        val accountMir = CardType.Mir
        val currentAmount = 0
        val previousAmount = 0
        val commissionAmount = 35_00
        assertEquals(commissionAmount, getCommission(currentAmount, previousAmount, accountMir))
    }
    @Test
    fun getCommissionMir_summaryMonthAmount() {
        val accountMir = CardType.Mir
        val currentAmount = 100_000_00
        val previousAmount = 0
        val commissionAmount = 750_00
        assertEquals(commissionAmount, getCommission(currentAmount, previousAmount, accountMir))
    }
    @Test
    fun getCommissionVkPay() {
        val accountVkPay = CardType.VkPay
        val currentAmount = 0
        val previousAmount = 100_000
        assertEquals(0, getCommission(currentAmount, previousAmount, accountVkPay))
    }
}