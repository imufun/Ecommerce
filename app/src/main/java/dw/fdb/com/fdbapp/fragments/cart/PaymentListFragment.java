package dw.fdb.com.fdbapp.fragments.cart;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import dw.fdb.com.fdbapp.R;
import dw.fdb.com.fdbapp.adapter.CustomListAdapter;
import dw.fdb.com.fdbapp.fragments.BaseListFragment;
import dw.fdb.com.fdbapp.model.Item;
import dw.fdb.com.fdbapp.model.cart.Payment;

public class PaymentListFragment extends BaseListFragment {

    public static final String TAG = "PaymentListFragment";


    public static PaymentListFragment newInstance() {
        PaymentListFragment paymentListFragment = new PaymentListFragment();
        return paymentListFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.payment_list_fragment, container, false);
        ButterKnife.inject(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        List<Item> items = new ArrayList<Item>();

        for(int i =0; i<10; i++){
            Payment payment = new Payment();
            items.add(payment);
        }

        CustomListAdapter customListAdapter = new CustomListAdapter(getActivity(), items);
        setListAdapter(customListAdapter);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        ButterKnife.reset(this);
    }


}
