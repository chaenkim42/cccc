package example.com.samsung.cccc;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class WordsFragment extends Fragment {
    private OnWordSelectedListener mCallback;
    private ListView listView;

    public OnWordSelectedListener getmCallback() {
        return mCallback;
    }

    public void setmCallback(OnWordSelectedListener mCallback) {
        this.mCallback = mCallback;
    }

    public interface OnWordSelectedListener {
        void onWordSelected(int position);
    }
    private OnWordSelectedListener onclick;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_words, container, false);

        listView = view.findViewById(R.id.word_list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Data.words);
        listView.setAdapter(adapter);
        mCallback = (OnWordSelectedListener)getActivity();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                mCallback.onWordSelected(i);
                listView.setItemChecked(i, true);
            }
        });



//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Log.d("asdfasdf", i+"");
//                Fragment defFragment = new DefinitionFragment();
//                FragmentTransaction transaction = getFragmentManager().beginTransaction();
//
//                transaction.replace(R.id.fragment_container, defFragment);
//                transaction.addToBackStack(null);
//
//                transaction.commit();
////                DefinitionFragment definitionFragment;
//            }
//        });

        return view;

    }
    public void setListener(OnWordSelectedListener onclick){
        this.onclick = onclick;
    }

}
