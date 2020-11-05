/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumClass;

/**
 *
 * @author ITSUKA KOTORI
 */
public enum PaymentStatus {
    
    Canceled_Reversal(0, "Canceled Reversal", "A reversal has been canceled. For example, you won a dispute with the customer, and the funds for the transaction that was reversed have been returned to you."), 
    Completed(1, "Complate Payment", "The payment has been completed, and the funds have been added successfully to your account balance."), 
    Created(2, "Payment Created", "A German ELV payment is made using Express Checkout."), 
    Denied(3, "Payment Denied", "You denied the payment. This happens only if the payment was previously pending because of possible reasons described for the pending_reason variable or the Fraud_Management_Filters_x variable."), 
    Expired(4, "Payment Expired", "This authorization has expired and cannot be captured."), 
    Failed(5, "Payment Failed", "The payment has failed. This happens only if the payment was made from your customer’s bank account."), 
    Pending(6, "Payment Pending", "The payment is pending. See pending_reason for more information."), 
    Refunded(7, "Payment Refunded", "You refunded the payment."), 
    Reversed(8, "Payment Reversed", "A payment was reversed due to a chargeback or other type of reversal. The funds have been removed from your account balance and returned to the buyer. The reason for the reversal is specified in the ReasonCode element."), 
    Processed(9, "Payment Processed", "A payment has been accepted."), 
    Voided(10, "Payment Voided", "This authorization has been voided.");
    
    private final int value;
    private final String disc;    
    private final String title;    
    private final static PaymentStatus[] vs = PaymentStatus.values();;

    private PaymentStatus(int value, String title, String disc) {
        this.value = value;
        this.disc = disc;
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public int getValue() {
        return this.value;
    }
    public String getDiscription(){
        return this.disc;
    }
    public static PaymentStatus getValues(int value) {
        try{
            return vs[value];
        }catch(Exception ex){
            return null;
        }
    }
}
