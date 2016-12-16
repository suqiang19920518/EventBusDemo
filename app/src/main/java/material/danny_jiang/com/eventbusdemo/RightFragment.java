package material.danny_jiang.com.eventbusdemo;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.simple.eventbus.EventBus;
import org.simple.eventbus.Subcriber;


/**
 * A simple {@link Fragment} subclass.
 */
public class RightFragment extends Fragment {

    private TextView textView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EventBus.getDefault().register(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_right, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textView = ((TextView) view.findViewById(R.id.text_RightFragment));
    }

    @Subcriber
    public void onEventMainThread(FragmentEvent fragmentEvent) {
        textView.setText("用户点击了 " + fragmentEvent.getPosition() + " item");
    }

}
