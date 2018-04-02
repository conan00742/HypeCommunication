package krot.sample.com.meshchatandroid.broadcast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.OnClick;
import krot.sample.com.meshchatandroid.R;

public class HypeBroadcastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hype_broadcast);

    }

    @OnClick(R.id.btn_do_broadcast_plain_text)
    public void doBroadcastPlaintextMessage() {
        //TODO 3: bắn intent qua SendPlainTextMessageActivity
    }


    @OnClick(R.id.btn_do_broadcast_image)
    public void doBroadcastImageMessage() {

    }


    @OnClick(R.id.btn_do_broadcast_video)
    public void doBroadcastVideoMessage() {

    }


    @OnClick(R.id.btn_do_broadcast_audio)
    public void doBroadcastAudioMessage() {

    }
}
