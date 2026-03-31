package io.github.rubensrabelo.project.order.model;

public class PaymentDetails {

    private String data;
    private PaymentDetails paymentDetails;
    
    public PaymentDetails() {
    }

    public PaymentDetails(String data, PaymentDetails paymentDetails) {
        this.data = data;
        this.paymentDetails = paymentDetails;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        result = prime * result + ((paymentDetails == null) ? 0 : paymentDetails.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PaymentDetails other = (PaymentDetails) obj;
        if (data == null) {
            if (other.data != null)
                return false;
        } else if (!data.equals(other.data))
            return false;
        if (paymentDetails == null) {
            if (other.paymentDetails != null)
                return false;
        } else if (!paymentDetails.equals(other.paymentDetails))
            return false;
        return true;
    }
}
