package br.com.miguelwolf.smstest;

public interface OTPReceiveListener {
    void onOTPReceived(String otp);
    void onOTPTimeOut();
    void onOTPReceivedError(String error);
}
