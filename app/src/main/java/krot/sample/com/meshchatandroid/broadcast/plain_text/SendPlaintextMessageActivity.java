package krot.sample.com.meshchatandroid.broadcast.plain_text;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.hypelabs.hype.Error;
import com.hypelabs.hype.Hype;
import com.hypelabs.hype.Instance;
import com.hypelabs.hype.Message;
import com.hypelabs.hype.MessageInfo;
import com.hypelabs.hype.MessageObserver;
import com.hypelabs.hype.NetworkObserver;
import com.hypelabs.hype.StateObserver;

import butterknife.BindView;
import butterknife.ButterKnife;
import krot.sample.com.meshchatandroid.R;

public class SendPlaintextMessageActivity extends AppCompatActivity implements StateObserver, NetworkObserver, MessageObserver {

    @BindView(R.id.device_list)
    RecyclerView deviceRecyclerView; //Cái này là findViewById rồi, khỏi cần find nữa

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_plaintext_message);
        ButterKnife.bind(this);
        Hype.addStateObserver(this);
        Hype.addNetworkObserver(this);
        Hype.addStateObserver(this);

        //TODO 9: setupPlainTextMessageAdapter ở đây
    }

    /**MESSAGE OBSERVER**/ //<---------- đọc document về cái này MessageObserver
    @Override
    public void onHypeMessageReceived(Message message, Instance instance) {

    }

    @Override
    public void onHypeMessageFailedSending(MessageInfo messageInfo, Instance instance, Error error) {

    }

    @Override
    public void onHypeMessageSent(MessageInfo messageInfo, Instance instance, float v, boolean b) {

    }

    @Override
    public void onHypeMessageDelivered(MessageInfo messageInfo, Instance instance, float v, boolean b) {

    }


    /**NETWORK OBSERVER**/ //<---------- đọc document về cái này Network
    @Override
    public void onHypeInstanceFound(Instance instance) {

    }

    @Override
    public void onHypeInstanceLost(Instance instance, Error error) {

    }

    @Override
    public void onHypeInstanceResolved(Instance instance) {

    }

    @Override
    public void onHypeInstanceFailResolving(Instance instance, Error error) {

    }


    /**STATE OBSERVER**/ //<---------- đọc document về cái này StateObserver
    @Override
    public void onHypeStart() {

    }

    @Override
    public void onHypeStop(Error error) {

    }

    @Override
    public void onHypeFailedStarting(Error error) {

    }

    @Override
    public void onHypeReady() {

    }

    @Override
    public void onHypeStateChange() {

    }

    @Override
    public String onHypeRequestAccessToken(int i) {
        //TODO 4: nhớ bỏ access token vô đây
        return null;
    }
}
