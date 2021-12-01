package com.getbouncer.scan.payment.card

/**
 * A list of supported card issuers.
 */
sealed class CardIssuer(open val displayName: String) {
    object AmericanExpress : CardIssuer("American Express")
    data class Custom(override val displayName: String) : CardIssuer(displayName)
    object DinersClub : CardIssuer("Diners Club")
    object Discover : CardIssuer("Discover")
    object JCB : CardIssuer("JCB")
    object MasterCard : CardIssuer("MasterCard")
    object UnionPay : CardIssuer("UnionPay")
    object Unknown : CardIssuer("Unknown")
    object Visa : CardIssuer("Visa")
    object Uzcard : CardIssuer("Uzcard")
    object Humo : CardIssuer("Humo")
}

/**
 * Format the card network as a human readable format.
 */
fun formatIssuer(issuer: CardIssuer): String = issuer.displayName
