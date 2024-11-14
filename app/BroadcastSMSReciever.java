// BroadcastSMSReciever

package com.example.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

public class BroadcastSMSReciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            Object[] pdus = (Object[]) bundle.get("pdus");
            if (pdus != null) {
                for (Object pdu : pdus) {
                    SmsMessage sms = SmsMessage.createFromPdu((byte[]) pdu);
                    String sender = sms.getDisplayOriginatingAddress();
                    String message = sms.getMessageBody();

                    Intent smsIntent = new Intent("SMS_RECEIVED_ACTION");
                    smsIntent.putExtra("sms_sender", sender);
                    smsIntent.putExtra("sms_body", message);
                    LocalBroadcastManager.getInstance(context).sendBroadcast(smsIntent);
                }
            }
        }
    }
}