package net.djvk.fireflyPlaidConnector2.lib

import net.djvk.fireflyPlaidConnector2.api.plaid.models.*
import java.time.LocalDate

object PlaidFixtures {
    fun getPaymentTransaction(
        pendingTransactionId: String? = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
        categoryId: String? = "16001000",
        category: List<String>? = listOf("Payment", "Credit Card"),
        location: Location = Location(
            address = null,
            city = null,
            region = null,
            postalCode = null,
            country = null,
            lat = null,
            lon = null,
            storeNumber = null
        ),
        paymentMeta: PaymentMeta = PaymentMeta(
            referenceNumber = null,
            ppdId = null,
            payee = null,
            byOrderOf = null,
            payer = null,
            paymentMethod = null,
            paymentProcessor = null,
            reason = null
        ),
        accountOwner: String? = null,
        name: String = "AMERICAN EXPRESS DES:ACH PMT ID : W1111 INDN:JOHN Q PUBLIC CO ID:XXXXX11111 WEB",
        accountId: String = "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb",
        amount: Double = 1111.22,
        isoCurrencyCode: String? = "USD",
        unofficialCurrencyCode: String? = null,
        date: LocalDate = LocalDate.of(2022, 9, 1),
        pending: Boolean = false,
        transactionId: String = "ccccccccccccccccccccccccccccccccccccc",
        paymentChannel: PaymentChannel = PaymentChannel.other,
        authorizedDate: LocalDate? = null,
        authorizedDatetime: java.time.OffsetDateTime? = null,
        datetime: java.time.OffsetDateTime? = null,
        transactionCode: TransactionCode? = null,
        transactionType: Transaction.TransactionType? = Transaction.TransactionType.special,
        originalDescription: String? = null,
        merchantName: String? = null,
        checkNumber: String? = null,
        personalFinanceCategory: PersonalFinanceCategory = PersonalFinanceCategory(PersonalFinanceCategoryEnum.TRANSFER_OUT_ACCOUNT_TRANSFER)
    ): Transaction {
        return Transaction(
            pendingTransactionId = pendingTransactionId,
            categoryId = categoryId,
            category = category,
            location = location,
            paymentMeta = paymentMeta,
            accountOwner = accountOwner,
            name = name,
            accountId = accountId,
            amount = amount,
            isoCurrencyCode = isoCurrencyCode,
            unofficialCurrencyCode = unofficialCurrencyCode,
            date = date,
            pending = pending,
            transactionId = transactionId,
            paymentChannel = paymentChannel,
            authorizedDate = authorizedDate,
            authorizedDatetime = authorizedDatetime,
            datetime = datetime,
            transactionCode = transactionCode,
            transactionType = transactionType,
            originalDescription = originalDescription,
            merchantName = merchantName,
            checkNumber = checkNumber,
            personalFinanceCategory = personalFinanceCategory,
        )
    }

    fun getTransaction(
        pendingTransactionId: String? = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
        categoryId: String? = null,
        category: List<String>? = null,
        location: Location = Location(
            address = null,
            city = null,
            region = null,
            postalCode = null,
            country = null,
            lat = null,
            lon = null,
            storeNumber = null
        ),
        paymentMeta: PaymentMeta = PaymentMeta(
            referenceNumber = null,
            ppdId = null,
            payee = null,
            byOrderOf = null,
            payer = null,
            paymentMethod = null,
            paymentProcessor = null,
            reason = null
        ),
        accountOwner: String? = null,
        name: String = "NAAAAAAME",
        accountId: String = "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb",
        amount: Double = 1111.22,
        isoCurrencyCode: String? = "USD",
        unofficialCurrencyCode: String? = null,
        date: LocalDate = LocalDate.of(2022, 9, 1),
        pending: Boolean = false,
        transactionId: String = "ccccccccccccccccccccccccccccccccccccc",
        paymentChannel: PaymentChannel,
        authorizedDate: LocalDate? = null,
        authorizedDatetime: java.time.OffsetDateTime? = null,
        datetime: java.time.OffsetDateTime? = null,
        transactionCode: TransactionCode? = null,
        transactionType: Transaction.TransactionType? = null,
        originalDescription: String? = null,
        merchantName: String? = null,
        checkNumber: String? = null,
        personalFinanceCategory: PersonalFinanceCategory,
    ): Transaction {
        return Transaction(
            pendingTransactionId = pendingTransactionId,
            categoryId = categoryId,
            category = category,
            location = location,
            paymentMeta = paymentMeta,
            accountOwner = accountOwner,
            name = name,
            accountId = accountId,
            amount = amount,
            isoCurrencyCode = isoCurrencyCode,
            unofficialCurrencyCode = unofficialCurrencyCode,
            date = date,
            pending = pending,
            transactionId = transactionId,
            paymentChannel = paymentChannel,
            authorizedDate = authorizedDate,
            authorizedDatetime = authorizedDatetime,
            datetime = datetime,
            transactionCode = transactionCode,
            transactionType = transactionType,
            originalDescription = originalDescription,
            merchantName = merchantName,
            checkNumber = checkNumber,
            personalFinanceCategory = personalFinanceCategory,
        )
    }
}